## Numerische Mathematik Hausaufgaben 
von Rico Kölling 192316 und Svaran Singh Chandla 193922
%%\left(\begin{array}{ccc} \end{array} \right)%%
### Aufgabe 1
Z.z. Eine Matrixnorm ist eine Vektornorm.
Definition 4.22:
$\forall A\in\mathbb{R}^{m\times n}:||A||:=\sup\limits_{x\in\mathbb{R}^{n},x\neq0}\frac{||Ax||}{||x||}=\max\limits_{y\in\mathbb{R}^{n},||y||=1}=||Ay||$

a)$\forall v \in V: ||v||=0\Leftrightarrow=0$  Definitheit
Beweis: 
$||A||=0\Leftrightarrow A=0$ Eindeutig

b)$\forall V v\in V, \alpha\in\mathbb{R};||\alpha\cdot v||=|\alpha|\cdot|v|$ Homogenität
Beweis:
$||sA||=\max\limits_{||x||=1}||sAx||=\max\limits_{||x||=1}|s|||Ax||= |s| \max\limits_{||x||=1}||Ax||=|s|||Ax||$

c) $\forall v,w\in V:||v+w||\leq||v||+||w||$ Dreiecksungleichung
Beweis:
$||A+B||=\max\limits_{||x||=1}||(A+B)x||=\max\limits_{||x||=1}||Ax+Bx||\leq\max\limits_{||x||=1}(||Ax||+||Bx||)\leq\max\limits_{||x||=1}||Ax||+\max\limits_{||x||=1}||Bx||=||A||+||B||$


### Aufgabe 2

### Aufgabe 3
Z.z. $cond(A)=||A||\cdot||A^{-1}||$
Aus der Definition 4.25:
$||A||\cdot||A^{-1}||=\left(\max\limits_{x\neq0}\frac{||Ax||}{||x||} \right)\cdot\left(\min\limits_{x\neq0}\frac{||Ax||}{||x||} \right)^{-1}$
$\curvearrowright$ $||A||$ ist das Maximum von $\frac{||A||}{||x||}$ für alle $x\neq0$.Wenn ein $A^{-1}$ existiert so müsste es das Maximum von $\frac{||A^{-1}\cdot x||}{||x||}$ über alle $x\neq0$. Folgend daraus, wenn $y=A^{-1}\cdot x$ ist, dann $\to x=Ay$ und $x\neq0$, $y\neq0$ sobald nur eines davon diesen Eigenschaft besitzt. 
$\curvearrowright$ Das Maximum von $\frac{||A^{-1}x||}{||x||}=\frac{||y||}{||Ay||}$ und der Kehrwert davon ist das Minimum von $\frac{||Ay||}{||y||}$ über jeweils $x\neq 0$ und $y\neq0$

<div style="page-break-after: always;"></div>


### Aufgabe 4
$A:=\left(\begin{array}{ccc}1 & 1 & 1 \\ 0 & 1 & 1 \\ 1 & 1 & 0  \end{array} \right)$

$||v_{1}||=\sqrt{1^{2}+0^{2}+1^{2}}=\sqrt{2}$
$\alpha=-\sqrt{2}$

$v=\left(\begin{array}{ccc}1\\0\\1 \end{array} \right)+\sqrt{2}e_{1}=\left(\begin{array}{ccc} 1+\sqrt{2} \\ 0 \\1   \end{array} \right)$

$v^{\top}v=(1+\sqrt{2})^{2}+0^{2}+1^{2}=3+2\sqrt{2}+1=2(2+\sqrt{2})$

$\frac{2}{v^{\top}v}=\frac{1}{2+\sqrt{2}}$

$vv^{\top}=\left(\begin{array}{ccc}2\sqrt{2}+3 & 0 & \sqrt{2}+1 \\ 0 & 0 & 0 \\ \sqrt{2}+1  & 0 &1 \end{array} \right)$
$H_{v}=\mathbb{1}_{3}-\frac{1}{2+\sqrt{2}}\cdot vv^{\top}=\left(\begin{array}{ccc} 1 & 0 & 0 \\ 0&1&0 \\ 0 & 0& 1 \end{array} \right)- \left(\begin{array}{ccc} \frac{3+2\sqrt{2}}{2+\sqrt{2}} & 0 & \frac{1+\sqrt{2}}{2+\sqrt{2}} \\ 0 & 0 & 0 \\ \frac{1+\sqrt{2}}{2+\sqrt{2}} & 0 & \frac{1}{2+\sqrt{2}}\end{array} \right)=\left(\begin{array}{ccc} \frac{-\sqrt{2}}{2} & 0 & \frac{-\sqrt{2}}{2} \\ 0&1&0\\ \frac{-\sqrt{2}}{2} &0 & \frac{\sqrt{2}}{2} \end{array} \right)$
$A_{0}:=H_{v}A=A-\frac{1}{2+\sqrt{2}}v(v^{\top}\cdot A)=A-\left(\begin{array}{ccc}\frac{1+\sqrt{2}}{2+\sqrt{2}} \\ 0 \\ \frac{1}{2+\sqrt{2}} \end{array} \right)\left(\begin{array}{ccc}\sqrt{2}+2 & \sqrt{2}+2 & \sqrt{2}+1 \end{array} \right)$ 

$\to\left(\begin{array}{ccc}1&1&1 \\ 0&1&1 \\ 1&1&0 \end{array} \right)-\left(\begin{array}{ccc}\sqrt{2}+1 & \sqrt{2}+1 & \frac{\sqrt{2}+2}{2} \\ 0&0&0 \\1&1&\frac{\sqrt{2}}{2} \end{array} \right)=\left(\begin{array}{ccc}-\sqrt{2} & -\sqrt{2} & \frac{-\sqrt{2}}{2} \\ 0 & 1 &1 \\0 &0 & \frac{-\sqrt{2}}{2} \end{array} \right)$

$A_{2}=R:=\left(\begin{array}{ccc}-\sqrt{2} & -\sqrt{2} & \frac{-\sqrt{2}}{2} \\ 0 & 1 &1 \\0 &0 & \frac{-\sqrt{2}}{2} \end{array} \right)$

$Q=\left(\begin{array}{ccc} \frac{-\sqrt{2}}{2} & 0 & \frac{-\sqrt{2}}{2} \\ 0&1&0\\ \frac{-\sqrt{2}}{2} &0 & \frac{\sqrt{2}}{2} \end{array} \right)$

### Aufgabe 5
siehe SiebenPunktfuenf.java

Q lässt sich durch $H_{v}(...)$  berechnen. Die v werte werden in vList gespeichert. 

