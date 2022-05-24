#include <cmath>
#include <functional>
#include <iostream>
#include <iomanip>
#include <limits>
#include <fstream>
#include <vector>

using namespace std;
int main(int argc, char const *argv[])
{
	vector<function<double(double, double, double)>> f{[](double x, double y, double z)
																															 { return pow(x, 2) + 10.0 * y * z; },
																															 [](double x, double y, double z)
																															 { return 20.0 * pow(y, 2) * z + 3.0 * x * y - 5.0; }};
	vector<function<double(double, double, double)>> J{
			[](double x, double y, double z)
			{ return 20.0 * pow(y, 2); },
			[](double x, double y, double z)
			{ return -10.0 * y; },
			[](double x, double y, double z)
			{ return -40.0 * y * z - 3.0 * x; },
			[](double x, double y, double z)
			{ return 10.0 * z; }};

	function<double(double, double, double)> det{[](double x, double y, double z)
																										{ return 1.0 / (-200.0 * pow(y, 2) * z - 30.0 * x * y); }};

	double x0{-3.0}, x1{-0.5}, deltax{0.00001};

	double bound{0.00000001};

	double y0{-2.0}, z0{-2.0};

	ofstream oFile{"output.txt"};

	while (x0 < x1)
	{
		double y{y0}, z{z0};
		while (!(abs(f[0](x0, y, z)) < bound) || !(abs(f[1](x0, y, z)) < bound))
		{
			double y1{det(x0, y, z) * (J[0](x0, y, z) * f[0](x0, y, z) + J[1](x0, y, z) * f[1](x0, y, z))};
			double z1{det(x0, y, z) * (J[2](x0, y, z) * f[0](x0, y, z) + J[3](x0, y, z) * f[1](x0, y, z))};
			y -= y1;
			z -= z1;
		}

		oFile << setprecision(numeric_limits<double>::digits10 + 1)
					<< z << " " << y << " " << x0 << endl;
		x0 += deltax;
	}

	return 0;
}
