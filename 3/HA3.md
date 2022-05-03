## Numerische Mathematik Hausaufgaben 
von Rico Kölling 192316 und Svaran Singh Chandla 193922

### Hausaufgabe 3.1

a) $f:\mathbb{R}_{>0}\to\mathbb{R}$ mit $f(x)=\sqrt{x}$ für $x>0$

$K^{rel}(f,x)=max_{i,j}\cdot\frac{|x|}{|\sqrt{x}|}\cdot\left|\frac{\partial{\sqrt{x}}}{\partial x}(x)\right|$
-> $max_{i,j}\cdot\sqrt{x}\cdot\frac{1}{2\sqrt{x}}$
-> $\frac{1}{2}$
Damit beträgt der relative Fehler 50%

b)$f:\mathbb{R}_{>0}\times\mathbb{R}\to\mathbb{R}$ mit $f(x_{1},x_{2})=x_{1}^{x_{2}}$ für $x_{1}>0$

$\frac{\partial f}{\partial x_{1}}=x_{2}\cdot x_{1}^{x_{2-1}}\to\frac{x_{1}}{x_{1}^{x_{2}}}\cdot x_{1}\cdot x_{1}^{x_{2}-1}=\frac{1}{x_{1}^{x_{2}-1}}\cdot x_{1}^{x_{2}-1}\cdot=x_{2}$ und $f=x_{1}^{x_{2}}=e^{x_{2}ln(x_{2})}\to\frac{\partial f}{\partial x_{2}}=f\cdot ln(x_{1})\to\frac{x_{2}}{f}\cdot f \cdot ln(x_1)=x_{2}\cdot ln(x_{1})$, also Konditionszahl $max\{|x_{2}|,|x_{2}|\cdot|ln(x_{1})|\}$ 
-> $x_{1}\in[e,\frac{1}{e}]$
$K^{rel}(f,x)= \begin{cases}  |x_{2}| & falls & x_{1} \in[\frac{1}{e},e] \\ |x_{2}\cdot ln(x_{1})| &sonst\end{cases}$


c)$f:\mathbb{R}_{\geq1}\to\mathbb{R}$ mit $f(x):=ln(x-\sqrt{x^{2}-1}),x=30$


$K^{rel}(f,x)=max_{i,j}\cdot\frac{|x|}{|ln(x-\sqrt{x^{2}-1})|}\cdot\left|\frac{\partial{ln(x-\sqrt{x^{2}-1})}}{\partial{x_{j}}(x)}\right|$
-> $max_{i,j}\cdot\frac{|x|}{|ln(x-\sqrt{x^{2}-1})|}\cdot\left|-\frac{1}{\sqrt{x^{2}-1}}\right|$
->$\frac{|30|}{|ln(30-\sqrt{30^{2}-1})|}\cdot\left|-\frac{1}{\sqrt{30^{2}-1}}\right|$
-> 0.24

Damit beträgt der relative Fehler 24%

### Hausaufgabe 3.2
a) Wir betrachten die Abbildung $(p,q)\mapsto(y_{1},y_{2})$

Aus $\frac{\partial y_{1}}{\partial p}+\frac{\partial y_{2}}{\partial p}=1$ und $\frac{\partial y_{1}}{\partial p}\cdot y_{2} + y_{1}\cdot\frac{\partial y_{2}}{\partial p}=0$ (vom $y_{1}$-Fachen der ersten Gleichung wird die zweite abgezogen)
-> $\frac{\partial y_{1}}{\partial p}\cdot (y_{1}-y_{2})=y_{1}$ und dann $\frac{\partial y_{1}}{\partial p}=\frac{y_{1}}{y_{1}-y_{2}}$
$\curvearrowright \frac{\partial y_{2}}{\partial p}=\frac{y_{2}}{y_{2}-y_{1}}$.

Aus $\frac{\partial y_{1}}{\partial q}+ \frac{\partial y_{2}}{\partial q}=0$ und $\frac{\partial y_{1}}{\partial q}\cdot y_{2} + y_{1}\cdot \frac{y_{2}}{q}=1\to\frac{\partial y_{1}}{\partial q}\cdot(y_{2}-y_{1})=1$ (es wird das $y_{1}$-Fache der ersten Gleichung von der zweiten abgezogen)
$\curvearrowright\frac{\partial y_{1}}{\partial q}=\frac{1}{y_{2}-y_{1}}$, analog $\frac{\partial y_{2}}{\partial q}=\frac{1}{y_{1}-y_{2}}$.

Daher ist

$\Large{\frac{|p|}{|y_{1}|}\left|\frac{\partial y_{1}}{\partial p}\right|=\frac{|y_{1}+y_{2}|}{|y_{1}|}\frac{|y_{1}|}{|y_{1}-y_{2}|}=\frac{|y_{1}+y_{2}|}{|y_{1}-y_{2}|}=\frac{|1+\frac{y_{2}}{y_{1}}|}{|1-\frac{y_{2}}{y_{1}}|}}$
$\Large{\frac{|q|}{|y_{1}|}\frac{\partial y_{1}}{\partial q}=\frac{|y_{1}\cdot y_{2}|}{|y_{1}|}\frac{1}{|y_{2}-y_{1}|}=\frac{|y_{2}|}{|y_{2}-y_{1}}=\frac{1}{|1-\frac{y_{1}}{y_{2}}|}}$

b)
$p := 4$
$q :=3.999$

$\left|\frac{|4|}{\sqrt{4^{2}-4\cdot 3.999}}\right|=\left|\frac{4}{\sqrt{16-15.996}}\right|=\left|\frac{4}{\sqrt{0.004}}\right|\approx 63.246$

$\frac{|q|}{|\frac{p}{2}-\sqrt{\frac{p^{2}}{4}}-q|}\cdot\left|\frac{1}{2\sqrt{\frac{p^{2}}{4}\cdot q}}\right|=\frac{3.999}{|2-\sqrt{4-3.999}|}\cdot\left|\frac{1}{2\cdot\sqrt{4-3.999}}\right|=32.1228$

$K^{rel}(f,(4,3.999))\approx63.246$


### Hausaufgabe 3.3
$f(x)_{cos(x)+\epsilon}=\frac{1-cos(x)+\epsilon}{x^{2}}=\frac{1-cos(x)}{x^{2}}+\frac{\epsilon}{x^{2}}=f(x)+\frac{\epsilon}{x^{2}}=\epsilon_{f}$

Für $x_{0}$:
$|\epsilon_{f}|>|10^{4}\cdot|\epsilon|\leftrightarrow|\frac{\epsilon}{x^{2}}|>10^{4}\cdot|\epsilon|$
$x_{0}$ bei $\frac{\epsilon}{x^{2}}=10^{4}\cdot|\epsilon|$

$|\frac{\epsilon}{x^{2}}|=10^{4}\cdot|\epsilon|\to|\frac{1}{x^{2}}|=10^{4}\curvearrowright x_{0}=0.01$

$0<x<0.01$
### Hausaufgabe 3.4
Differenzierbarkeit (bzw. Satz von Taylor)

$\Rightarrow f(\overline{x})=f(x)+J_{f}(x)\cdot(\overline{x}-x)+ o(||\overline{x}-x||)$  für $\overline{x}\to x$.

Daher $L^{abs}_{(f,x)}(\delta)=\left| |J_{f}(x)| \right|+o(1)$ für $\delta\to 0$. Daraus folgen beide Aussagen 


