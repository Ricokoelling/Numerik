## Numerische Mathematik Hausaufgaben 
von Rico Kölling 192316 und Svaran Singh Chandla 193922

### Aufgabe 1
a)
Singulärwertzerlegung von A

$A=U\cdot D\cdot V^{\top}$
$U$ entspricht der unitären Matrix
D entspricht der Diagonalmatrix

$V^{\top}$  entspricht der transponierten unitären Matrix. 
$||A||^{2}_{f}=Spur(A^{\top}A)=Spur((VD)^{\top}U^{\top}(UDV^{\top}))$
$Spur(VD^{\top}DV^{\top})=Spur(D^{\top}D)=\sum\limits_{i=1}^{n}\sigma^{2}_{i}$    n=Rang(A)

$\sigma_{i}=\sqrt{\lambda_i}$
$\Rightarrow\sum\limits_{i=1}^{n}\sigma^{2}_{i}=\sum\limits_{i=1}^{n}\lambda_{i}$

b) $A=Q\cdot R$

$cond_{2}(A)=cond_{2}(Q\cdot R)$

$cond_{2}(Q\cdot R)=cond_{2}(R)$

Da $||Q\cdot R||_{2}=sup\frac{||QR_{x}||_{2}}{||x||_{2}}=sup\frac{||R_{x}||_{2}}{||x||_{2}}=||R_{x}||_{2}$

$\Rightarrow cond_{2}(A)=cond_{2}(R)$

### Aufgabe 2

$A=\begin{pmatrix}1 & 2 & -2 \\ 1 & 1 &1 \\ 2 &  2 & 1 \end{pmatrix}$  und $b=\begin{pmatrix} 1 \\ 1 \\ 1  \end{pmatrix}$ und $x_{0}=\begin{pmatrix}1 \\ 1 \\ 1 \end{pmatrix}$

##### Jacobiverfahren
$x_{k+1}:=-D^{1}(L+R)x_{k}+D^{-1}b$

$L=\begin{pmatrix}0&0&0\\1&0&0\\2&2&0 \end{pmatrix}$

$P=\begin{pmatrix}0&2&-2\\0&0&1\\0&0&0 \end{pmatrix}$

$Q:=D=\begin{pmatrix}1 & 0 & 0 \\ 0 & 1 & 0 \\ 0 & 0 & 1 \end{pmatrix}=\mathbb{1}_{3}$


$x_{1}=-\begin{pmatrix}1 & 0 & 0 \\ 0 & 1 & 0 \\ 0 & 0 & 1 \end{pmatrix}\cdot\left(\begin{pmatrix}0 & 0 & 0 \\ 1 & 0 & 0 \\ 2 & 2 & 0 \end{pmatrix}+ \begin{pmatrix} 0 & 2 & -2 \\ 0 & 0 & 1 \\ 0 &0 & 0\end{pmatrix} \right)\cdot\begin{pmatrix}1\\ 1\\1 \end{pmatrix}+\begin{pmatrix}1 & 0 & 0 \\ 0 & 1 & 0 \\ 0 & 0 & 1 \end{pmatrix}\cdot\begin{pmatrix}1\\ 1\\1 \end{pmatrix}$

$x_{1}=-\begin{pmatrix} 1 &0&0\\0&1&0\\0&0&1 \end{pmatrix} \cdot \begin{pmatrix}0 & 2 & -2 \\ 1 & 0 &1 \\ 2 & 2 &0 \end{pmatrix}\cdot\begin{pmatrix}1\\ 1\\1 \end{pmatrix}+\begin{pmatrix}1 & 0 & 0 \\ 0 & 1 & 0 \\ 0 & 0 & 1 \end{pmatrix}\cdot\begin{pmatrix}1\\ 1\\1 \end{pmatrix}$

$x_{1}=\begin{pmatrix}0&-2&2\\-1&0&-1\\-2&-2&0 \end{pmatrix}\cdot\begin{pmatrix}1\\ 1\\1 \end{pmatrix}+\begin{pmatrix}1\\ 1\\1 \end{pmatrix}$

$x_{1}=\begin{pmatrix}0\\-2\\-4 \end{pmatrix}+\begin{pmatrix}1\\ 1\\1 \end{pmatrix}=\begin{pmatrix}1\\ -1\\-3 \end{pmatrix}$

$x_{2}=\begin{pmatrix}0&-2&2\\-1&0&-1\\-2&-2&0 \end{pmatrix}\cdot\begin{pmatrix}1\\ -1\\-3 \end{pmatrix}+\begin{pmatrix}1\\ 1\\1 \end{pmatrix}$

$x_{2}=\begin{pmatrix}-4\\2\\0 \end{pmatrix}+\begin{pmatrix}1\\ 1\\1 \end{pmatrix}=\begin{pmatrix}-3\\ 3\\1 \end{pmatrix}$

$\curvearrowright \begin{pmatrix}1&2&-2\\1&1&1\\2&2&1 \end{pmatrix}\cdot\begin{pmatrix}-3\\3\\1 \end{pmatrix}=\begin{pmatrix}1\\1\\1 \end{pmatrix}$

##### Gauß-Seidel Verfahren
Die matrix ist nicht symmetrisch, somit konvergiert die Matrix auch nicht damit.
Dadurch, dass diese aussage nicht unbedingt zutrifft hat recherche Ergeben, dass wenn der Spektralradius <1 ist die Matrix konvergiert. 

Der Spektralradius ist die der Betrag des Betragsmäßig größten Eigenwertes von A also
$p(A):=\max\limits_{i}|\lambda_{i}(A)|$ $\to p(I-B^{-1}A)$

Für $A=\begin{pmatrix}1 & 2 & -2 \\ 1 & 1 &1 \\ 2 &  2 & 1 \end{pmatrix}$ 


$p(\begin{pmatrix}1&0 & 0 \\ 0 & 1&0\\0&0&1  \end{pmatrix}-\begin{pmatrix}1&0 & 0 \\ 0 & 1&0\\0&0&1 \end{pmatrix}\cdot\begin{pmatrix}1 & 2 & -2 \\ 1 & 1 &1 \\ 2 &  2 & 1 \end{pmatrix})$

$=p(\begin{pmatrix}0 & -2&2\\-1&0&-1\\-2&-2&0 \end{pmatrix})=0<1$  $\curvearrowright$ das Gauß-Seidel-Verfahren konvergiert nicht.

<div style="page-break-after: always;"></div>

### Aufgabe 3
Es handelt sich um das Tschebyschow-Polynom 
Durch die allgemein gültige Beschreibung mit $T_{0}=1$ und $T_{1}=x$ , werde ich diese für den Beweis auch verwenden.

a)$T_{n+1}(x)=2xT_{n}(x)-T_{n-1}(x)$

$\begin{align} T_{n+1}(x)+T_{n-1}(x)&=cos((n+1)arccos(x))+cos((n-1)arccos(x)) \\ &=2cos(n arccos(x))cos(arccos(x)) \\ &=2T_{n}(x)x \end{align}$

b)
Für $T_{1}=cos(1arrcos(x))=cos(arccos(x))=x$
somit gilt für $T_{0}=cos(0arrcos(x))=cos(0))=1$

$T_{2}(x)=2xT_{1}(x)-T_{0}(x)$
$\to T_{2}(x)=2x^{2}-1$
$T_{3}(x)=2xT_{2}(x)-T_{1}(x)$
$\to T_{3}(x)=2x\cdot(2x^{2}-1)-x=4x^{3}-3x$

Induktionsanfang:
$T_{1}$ ist vom Grad 1 da $x^{1}$ . 
$T_{0}$ ist vom Grad 0 da $x^{0}$.

Induktionsvorrausetzung:
$T_{n+1}(x)=2xT_{n}(x)-T_{n-1}(x)$

Induktionsschritt: $n\to n+1$

Induktionsbehauptung: $T_{n+1}$ ist vom Grad $n+1$
$R_{1}$ bezeichnet den Rest und a,b den Vorhang 
$T_{n+1}=2x(a\cdot x^{n}+R_{1})-(b-x^{n-1}+R_{2})$
$T_{n+1}=2x\cdot ax^{n} +2\cdot x \cdot R_{1}-bx^{n-1}-R_{2}$
$T_{n+1}=2ax^{n+1}+2x\cdot R_{1}-bx^{n-1}-R_{2}$               $\square$

### Aufgabe 4
siehe AchtPunktVier.java



