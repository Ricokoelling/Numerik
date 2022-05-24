from sympy import *
import numpy as np


def fx(x) -> float:
    return (223200658 * x**3) - (1083557822 * x**2) + (1753426039 * x) - 945804881


def fxstrich(x) -> float:
    return 669601974 * (x ** 2) - 2167115644 * x + 1753426039


def newton(x0) -> float:
    return x0 - (fx(x0) / fxstrich(x0))


def do():
    a: float = 1.61801916
    b: float = 1.61801917
    for i in range(0, 20):
        b : float = newton(b)
        print("Closer: %.15f " % b)

do()