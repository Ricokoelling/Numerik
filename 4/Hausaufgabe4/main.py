import matplotlib.pyplot as plt


def fx(x) -> double:
    return (223200658 * x ** 3) - (1083557822 * x ** 2) + (1753426039 * x) - 945804881


fxValues = []
xValues = []

plt.xlabel("X-Wert")
plt.ylabel("f(x)")


def mapFx(start, stop, step, list):
    p: float = 0.2
    print("Werte :" % p)
    while start <= stop + step:
        num = fx(start)
        print("f(%.10f) = %.20f" % (start, num))
        list.append(num)
        start += step


def mapX(start, stop, step, list):
    while start <= stop + step:
        list.append(start)
        start += step


mapFx(1.61801916, 1.61801917, 0.0000000001, fxValues)
mapX(1.61801916, 1.61801917, 0.0000000001, xValues)

plt.plot(xValues, fxValues)
plt.show()
