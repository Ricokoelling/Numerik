## Numerische Mathematik Hausaufgaben 
von Rico Kölling 192316 und Svaran Singh Chandla 193922


### Aufgabe 1
Bei der Berechnung der einzelnen $q_{i}$'s wird am Ende in $\hat{Q}$ lediglich Gram-Schmidt der A-Matrix berechnet (ohne nomierung)

### Aufgabe 2
$A=\begin{pmatrix}1 & 1&1 \\ \epsilon &0 &0 \\ 0&\epsilon&0 \\ 0& 0&\epsilon \end{pmatrix}$

$\epsilon>0$ so dass $1\boxplus\epsilon\neq1$ aber $1\boxplus\epsilon^{2}=1$

$b=\begin{pmatrix} 1 \\ \epsilon \\ -\epsilon \\ \epsilon \end{pmatrix}$


a)$A^{\top}\boxdot A$

$A^{\top}=\begin{pmatrix}1 & \epsilon&0&0 \\ 1 &0 &\epsilon&0 \\ 1&0&0&\epsilon\end{pmatrix}$

$A^{\top}A=\begin{pmatrix}1\boxplus\epsilon^{2} & 1 & 1 \\ 1&1\boxplus\epsilon^{2}&1\\1&1&1\boxplus\epsilon^{2}   \end{pmatrix}\to\begin{pmatrix}1 & 1 & 1 \\ 1&1&1\\1&1&1   \end{pmatrix}$

- Für $j=1$ 

	$q_{1}:=a_{j}=\begin{pmatrix}1\\\epsilon\\0\\0     \end{pmatrix}$

	- Für i von 1 bis j-1 also 1 bis 0  $\curvearrowright$ $R_{1,1}=1$ 
- Für j=2

	$q_{2}:=\begin{pmatrix}1\\0\\\epsilon\\0     \end{pmatrix}$
	
	- Für i von 1 bis j-1 also 1 bis 1
		- i=1
		- $R_{1,2}=\frac{q_{1}^{\top}q_{2}}{q_{1}^{\top}q_{1}}=\frac{1}{x^{2}\boxplus1}=1$
		- $q_{2}:=q_{2}-1q_{1}$
		$\to\begin{pmatrix}1\\0\\\epsilon\\0    \end{pmatrix}-\begin{pmatrix}1\\\epsilon\\0\\0     \end{pmatrix}=\begin{pmatrix}0\\-\epsilon\\\epsilon\\0     \end{pmatrix}$
		- $R_{2,2}=1$
- Für $j=3$

	$q_{3}:=\begin{pmatrix}1\\0\\0\\\epsilon     \end{pmatrix}$
	- Für i von 1 bis j-1 also 1 bis 2
		- i=1
		- $R_{1,3}=\frac{q_{1}^{\top}q_{3}}{q_{1}^{\top}q_{1}}=\frac{1}{x^{2}\boxplus1}=1$
		- $q_{3}:=q_{3}-1q_{1}$
		 $\to\begin{pmatrix}1\\0\\0\\\epsilon    \end{pmatrix}-\begin{pmatrix}1\\\epsilon\\0\\0    \end{pmatrix}=\begin{pmatrix}0\\-\epsilon\\0\\\epsilon  \end{pmatrix}$
		 - i=2
		 - $R_{2,3}=\frac{q_{2}^{\top}q_{3}}{q_{2}^{\top}q_{2}}=\frac{\epsilon^{2}}{2\epsilon^2}=\frac{1}{2}$
		 - $q_{3}:=q_{3}- \frac{1}{2}q_{2}$
		 $\to\begin{pmatrix}0\\-\epsilon\\0\\\epsilon  \end{pmatrix}-\begin{pmatrix}0\\-\frac{\epsilon}{2}\\\frac{\epsilon}{2}\\0  \end{pmatrix}=\begin{pmatrix}0\\\frac{-\epsilon}{2}\\\frac{-\epsilon}{2}\\\epsilon \end{pmatrix}$
	- $R_{3,3}=1$

$\hat{R}=\begin{pmatrix}1&1&1\\0&1&\frac{1}{2}\\0&0&1   \end{pmatrix}$

$\hat{Q}=\begin{pmatrix}1&0&0   \\\epsilon&-\epsilon& \frac{-\epsilon}{2}   \\0&\epsilon&\frac{-\epsilon}{2}     \\0&0&\epsilon    \end{pmatrix}$

b) Unter der Bedingung $Rang(A)=n$ ist $A^{\top}A\in K^{n\times n}$ symmetrisch und positiv definit. Das System der Normalengleichungen und das lineare Ausgleichsproblem somit eindeutig lösbar.

Ist andererseits $Rang(A)<n$, so ist $Kern(A)\neq\{0\}$. Somit sind die Normalengleichungen und auch das lineare Ausgleichsproblem nicht eindeutig lösbar. 

### Aufgabe 3
siehe NeunPunktDrei.py 