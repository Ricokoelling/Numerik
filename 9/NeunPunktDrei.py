import numpy as np
import matplotlib.pyplot as plt
from scipy.linalg import solve
import math


def calculateDiff(x0: float, xn: float, n: int) -> float:
    return (xn - x0) / n


def calculateXk(xk: list, x0: float, n: int, xn: float) -> list:
    diff = calculateDiff(x0, xn, n)
    for k in range(1, n):
        xk.append(x0 + k * diff)

    return xk


def calculateBk(xk: list, bk: list, n: int) -> list:
    for k in range(len(xk)):
        bk.append(math.exp(xk[k]))

    return bk


def f1() -> float:
    return 1


def f2(x: float) -> float:
    return x


def f3(x: float) -> float:
    return x * x


def print_matrix(matrix):
    s = ""
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            s = s + str("%.2f" % matrix[i][j]) + "\t"
        s = s + "\n"

    print(s)


def createMatrix(n: int, xk: list, matrix: list) -> list:
    for i in range(0, n + 1):
        matrix.append([])
        matrix[i].append(f1())
        matrix[i].append(f2(xk[i]))
        matrix[i].append(f3(xk[i]))

    return matrix


def f(a, b, c1, c2, c3) -> list:
    list_of_data = []
    for i in np.arange(a, b + 1, 0.00001):
        list_of_data.append(c1 * f1() + c2 * f2(i) + c3 * f3(i))
    return list_of_data


def e(a, b) -> list:
    list_of_data = []
    for i in np.arange(a, b + 1, 0.00001):
        list_of_data.append(math.exp(i))
    return list_of_data


def makeInterval(a, b):
    list_of_data = []
    for i in np.arange(a, b + 1, 0.00001):
        list_of_data.append(i)
    return list_of_data


if __name__ == '__main__':
    a = 10
    b = 15
    interval = makeInterval(a, b)

    # x0 = -2, xn = 0, n = 10

    print("x0 = -2, xn = 0, n = 10")
    matrix = []
    x0 = -2
    xn = 0
    n = 10
    xk = []
    xk = calculateXk(xk, x0, n, xn)
    bk = []
    x_array = np.array([x0])
    x_array = np.concatenate((x_array, np.array(xk)))
    x_array = np.concatenate((x_array, np.array([xn])))
    bk = calculateBk(list(x_array), bk, n)
    matrix = createMatrix(n, list(x_array), matrix)

    print("x0, ... , xn:")
    print(str(list(x_array)) + "\n")
    print("b(e1, ... , en-1, 0, 0):")
    print(str(bk) + "\n")
    print("f(x0),...,f(xn):")
    print(np.array(matrix))

    matrix = np.array(matrix)

    print("\nAt")
    print(matrix.transpose())
    print("\nAt * b")
    vector_At_b = np.dot(matrix.transpose(), np.array(bk))
    print(vector_At_b)

    At_A = np.dot(matrix.transpose(), np.array(matrix))
    print("\nAt * A")
    print(At_A)

    print("\nC vector")
    c_vector = solve(At_A, vector_At_b)
    print(c_vector)

    plt.plot(interval, e(a, b), color='blue')
    plt.plot(interval, f(a, b, c_vector[0], c_vector[1], c_vector[2]), color='red')


    # x0 = -2, xn = 2, n = 10

    print("\n\nx0 = -2, xn = 2, n = 10")
    matrix = []
    x0 = -2
    xn = 2
    n = 10
    xk = []
    xk = calculateXk(xk, x0, n, xn)
    bk = []
    x_array = np.array([x0])
    x_array = np.concatenate((x_array, np.array(xk)))
    x_array = np.concatenate((x_array, np.array([xn])))
    bk = calculateBk(list(x_array), bk, n)
    matrix = createMatrix(n, list(x_array), matrix)

    print("x0, ... , xn:")
    print(str(list(x_array)) + "\n")
    print("b(e1, ... , en-1, 0, 0):")
    print(str(bk) + "\n")
    print("f(x0),...,f(xn):")
    print(np.array(matrix))

    matrix = np.array(matrix)

    print("\nAt")
    print(matrix.transpose())
    print("\nAt * b")
    vector_At_b = np.dot(matrix.transpose(), np.array(bk))
    print(vector_At_b)

    At_A = np.dot(matrix.transpose(), np.array(matrix))
    print("\nAt * A")
    print(At_A)

    print("\nC vector")
    c_vector = solve(At_A, vector_At_b)
    print(c_vector)

    #Fuer den Zweiten Teil müssen diese auskommentiert werden

    #plt.plot(interval, e(a, b), color='blue')
    #plt.plot(interval, f(a, b, c_vector[0], c_vector[1], c_vector[2]), color='red')

    plt.show()
