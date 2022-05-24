## Numerische Mathematik Hausaufgaben 
von Rico Kölling 192316 und Svaran Singh Chandla 193922

### Aufgabe 1


$A=\left(\begin{array}{ccc} 7.29 & 8.1 & 9 \\ 0.9 & 1 & 1 \\ 0.6655 & 0.605 & 0.55\end{array} \right)$


$\to\left(\begin{array}{ccc} 7.29 & 8.1 & 9 \\0.9 & 1 & 1 \\ 0.6655 & 0.605 & 0.55  \end{array}\right){\rm II-(0.1234)\cdot {\rm I}\to{\rm II}}\left(\begin{array}{ccc} 7.29 & 8.1 & 9 \\ 0 & 0& -0.1111 \\ 0.6655 & 0.605 & 0.55\end{array} \right){\rm II}\leftrightarrow{\rm III}$


$\to\left(\begin{array}{ccc} 7.29 & 8.1 & 9 \\ 0.6655 & 0.605 & 0.55 \\ 0 & 0 &  -0.1111 \end{array}  \right)$

$\to\left(\begin{array}{ccc} 7.29 & 8.1 & 9 \\ 0.6655 & 0.605 & 0.55 \\ 0 & 0 &  -0.1111 \end{array}\right){\rm II}-(9.128\cdot10^{-2})\cdot{\rm I}\to \left( \begin{array}{ccc} 7.29 & 8.1 & 9 \\ 0 & -0.1344 & -0.2716 \\ 0 & 0 & -0.1111 \end{array} \right)$

$L=\left(\begin{array}{ccc} 1 & 0 & 0 \\ 9.128\cdot10^{-2} & 1 & 0 \\ 0.1234 & 0 & 1 \end{array} \right)$


$R=\left( \begin{array}{ccc} 7.29 & 8.1 & 9 \\ 0 & -0.1344 & -0.2716 \\ 0 & 0 & -0.1111 \end{array} \right)$

$P=\left(\begin{array}{ccc}1 & 0 & 0 \\ 0 & 0 & 1 \\ 0 & 1 & 0 \end{array} \right)$

### Aufgabe 2
$\left(\begin{array}{ccc}l_{1,1} & 0 &0 \\ l_{2,1} & l_{2,2} & 0 \\ l_{3,1} & l_{3,2} & l_{3,3} \end{array} \right)\cdot\left(\begin{array}{ccc}l_{1,1} & l_{2,1} & l_{3,1} \\ 0 & l_{2,2} & l_{3,2} \\0 & 0 & l_{3,3} \end{array} \right)$

$\to\left(\begin{array}{ccc}l_{1,1}^{2} & l_{1,1}\cdot l_{2,1} & l_{1,1}\cdot l_{3,1} \\ l_{1,1}\cdot l_{2,1} & l_{2,1}^{2}+l_{2,2}^{2} & l_{2,1}\cdot l_{3,1}+l_{2,2}\cdot l_{3,2} \\ l_{1,1}\cdot l_{3,1} & l_{2,1}\cdot l_{3,1}+l_{2,2}\cdot l_{3,2} & l_{3,1}^{2}+l_{3,2}^{2}+l_{3,3}^{2}\end{array} \right)$


$B=\left(\begin{array}{ccc}25 & -6 &-1 \\ -6 & 4 & 2 \\ -1 & 2 & 1 \end{array} \right)$

Determinanten:
- $25$
- $25\cdot4-(-6\cdot-6)=64$
- $25\cdot4\cdot1+(-6)\cdot2\cdot(-1)+(-1)\cdot(-6)\cdot2-(-1)\cdot4\cdot(-1)-2\cdot2\cdot25-1\cdot(-6)\cdot-6=-16$

$l_{1,1}=\sqrt{a_{1,1}-\sum\limits_{k=1}^{0}L^{2}_{i,k}}=\sqrt{25}=5$
$l_{2,1}=\frac{1}{l_{1,1}}\left(a_{1,2}-\sum\limits_{k=1}^{0}l_{i,k}\cdot l_{j,k} \right)=\frac{1}{25}\cdot-6=-1.2$
$l_{3,1}=\frac{1}{l_{1,1}}\left(a_{1,3}-\sum\limits_{k=1}^{0}l_{i,k}\cdot l_{j,k} \right)=\frac{1}{5}\cdot-1=-0.2$
$l_{2,2}=\sqrt{a_{2,2}-\sum\limits_{k=1}^{1}l^{2}_{i,k}}=\sqrt{4-(-1.2)^{2}}=1.6$ 
$l_{3,2}=\frac{1}{l_{2,2}}\cdot\left(a_{3,2}-\sum\limits_{k=1}^{1}l_{3,k}\cdot l_{2,k}\right)=\frac{1}{1.6}\cdot(2-(-0.2\cdot-1.2))=1.1$
$l_{3,3}=\sqrt{a_{3,3}-\sum\limits_{k=1}^{2}l_{i,k}^{2}}=\sqrt{1-(-0.2^{2}+1.1^{2})}=\sqrt{-0.17}$
$\curvearrowright$ die symmetrische Matrix ist nicht positiv definit, weil eine Wurzel aus einer negativen Zahl gezogen wird. 

$C=\left(\begin{array}{ccc}4 & -2 & -4\\ -2 & 2 & 5 \\ -4 & 5 & 14 \end{array} \right)$

Determinanten:
- 4
- $4\cdot2-(-2\cdot-2)=4$
- $4\cdot2\cdot14+(−2)\cdot5\cdot(−4)+(−4)\cdot(−2)\cdot5−(−4)\cdot2\cdot(−4)−5\cdot5\cdot4−14\cdot(−2)\cdot(−2)=4$


$l_{1,1}=\sqrt{a_{1,1}-\sum\limits_{k=1}^{0}L^{2}_{i,k}}=\sqrt{4}=2$
$l_{2,1}=\frac{1}{l_{1,1}}\left(a_{1,2}-\sum\limits_{k=1}^{0}l_{i,k}\cdot l_{j,k} \right)=\frac{1}{2}\cdot-2=-1$
$l_{3,1}=\frac{1}{l_{1,1}}\left(a_{1,3}-\sum\limits_{k=1}^{0}l_{i,k}\cdot l_{j,k} \right)=\frac{1}{2}\cdot-4=-2$
$l_{2,2}=\sqrt{a_{2,2}-\sum\limits_{k=1}^{1}l^{2}_{i,k}}=\sqrt{2-(-0.5)^{2}}=1$ 
$l_{3,2}=\frac{1}{l_{2,2}}\cdot\left(a_{3,2}-\sum\limits_{k=1}^{1}l_{3,k}\cdot l_{2,k}\right)=\frac{1}{1}\cdot(5-(-2\cdot-1))=3$
$l_{3,3}=\sqrt{a_{3,3}-\sum\limits_{k=1}^{2}l_{i,k}^{2}}=\sqrt{14-((-2)^{2}+3^{2})}=\sqrt{1}=1$

$\curvearrowright$ die symmetrische Matrix ist positiv definit, weil keine Wurzel aus einer negativen Zahl gezogen wird

$L=\left(\begin{array}{ccc} 2 & 0 & 0 \\ -1 & 1 & 0 \\ -2 & 3 & 1 \end{array} \right)$

$\left(\begin{array}{ccc}4 & -2 & -4\\ -2 & 2 & 5 \\ -4 & 5 & 14 \end{array} \right)=\left(\begin{array}{ccc} 2 & 0 & 0 \\ -1 & 1 & 0 \\ -2 & 3 & 1 \end{array} \right)\cdot\left(\begin{array}{ccc} 2 & -1 & 2 \\ 0 & 1 & 3 \\ 0 & 0 & 1 \end{array} \right)$

### Aufgabe 3
$C=\left(\begin{array}{cc}0.1341 & -0.2665 \\ -0.2665 & 1.623 \end{array} \right)\in M_{2}(\mathbb{R})$ und $b=\left(\begin{array}{cc} -0.9322 \\ -0.9352 \end{array} \right)\in\mathbb{R}^{2}$

a) $C\cdot x\stackrel{!}{=}b$ 

$\to\left(\begin{array}{cc}0.1341 & -0.2665 \\ -0.2665 & 1.623 \end{array} \right){\rm II}\Leftrightarrow{\rm I}\to\left(\begin{array}{cc}-0.2665 & 1.623 \\ 0.1341 & -0.2665 \end{array} \right)$

$R=\left(\begin{array}{cc}-0.2665 & 1.623 \\ 0 & 0.5502 \end{array} \right){\rm II}-(-0.5032)\cdot{\rm I}$

$L=\left(\begin{array}{cc} 1 & 0 \\ -0.5032 & 1\end{array} \right)$

$P=\left(\begin{array}{cc} 0 & 1 \\ 1 & 0 \end{array} \right)$

$Ly=b$ und $R\tilde{x}=y$

$y=\left(\begin{array}{cc} -0.9322 \\ -0.9352-(-0.5032\cdot(-0.9322)) \end{array} \right)=\left(\begin{array}{cc}-0.9322 \\ -1.404 \end{array} \right)$

$R\tilde{x}=y$

$\left(\begin{array}{cc}0.1341 & 1.623 \\ 0 & 0.5502 \end{array} \right)\cdot \tilde{x}= \left(\begin{array}{cc}-0.9322 \\ -1.404 \end{array} \right)$

$\left(\begin{array}{cc|r} 1 & 6.090  & -3.498\\ 0 & 1  & -2.552 \end{array}\right)\to\left(\begin{array}{cc|r} 1 & 0  & 12.04\\ 0 & 1  & -2.552 \end{array}\right)$

$\tilde{x}=\left(\begin{array}{cc}12.04 \\ -2.552 \end{array} \right)$

$C\cdot h=(b-C\tilde{x})$

$C\cdot h = \left(\begin{array}{cc} -0.9322 \\ -0.9352 \end{array} \right)-\left(\begin{array}{cc}0.1341 & -0.2665 \\ -0.2665 & 1.623 \end{array} \right)\cdot\left(\begin{array}{cc}12.04 \\ -2.552 \end{array} \right)$  NR: $p^{-1}=p$

$C\cdot h= b-\left(\begin{array}{cc} 2.294672 \\ -7.350556\end{array} \right)$

$C\cdot h =\left(\begin{array}{cc} -3.226872 \\ 6.415356 \end{array} \right)$

$h=\left(\begin{array}{cc}-24.058597 \\ 2.3041698\cdot10^{-3} \end{array} \right)$

$\tilde{\tilde{x}}=\tilde{x}\cdot h$

$\tilde{\tilde{x}}=\left(\begin{array}{cc}12.04 \\ -2.552 \end{array} \right)\boxplus\left(\begin{array}{cc}-24.058597 \\ 2.3041698\cdot10^{-3} \end{array} \right)=\left(\begin{array}{cc}-12.02 \\ 2.550\cdot10^{-3} \end{array} \right)$

b) $C\cdot x\stackrel{!}{=}b$

$\left(\begin{array}{cc} l_{1,1} & 0 \\ l_{2,1} & l_{2,2}\end{array} \right)\cdot\left(\begin{array}{cc} l_{1,1} & l_{2,1} \\ 0 & l_{2,2} \end{array} \right)=\left(\begin{array}{cc} l_{1,1}^{2} & l_{1,1}\cdot l_{2,1} \\ l_{1,1}\cdot l_{2,1} & l_{2,1}^{2}+l_{2,2}^{2}\end{array} \right)$

$l_{1,1}=\sqrt{C_{1,1}-\sum\limits_{k=1}^{0}L_{i,k}^{2}}=\sqrt{0.1341}=0.3662$
$l_{2,1}=\frac{1}{l_{1,1}}\cdot\left(C_{2,1}-\sum\limits_{k=1}^{0}L_{i,k}\cdot L_{j,k} \right)=\frac{1}{3.361\cdot10^{-1}}\cdot-0.2665=-0.7278$
$l_{2,2}=\sqrt{C_{2,2}-\sum\limits_{k=1}^{1}L_{i,k}^{2}}=\sqrt{1.623-(-0.7929^{2})}=1.045$
$\left(\begin{array}{cc}0.3662 & -0.7278 \\ 0 & 1.045 \end{array} \right)\cdot\tilde{x}=\left(\begin{array}{cc} -0.9322 \\ -0.9352 \end{array} \right)$

$\tilde{x}=\left(\begin{array}{cc}-3.868 \\ -0.6656 \end{array} \right)$

$C\cdot h = \left(\begin{array}{cc} -0.9322 \\ -0.9352 \end{array} \right)- \left(\begin{array}{cc}0.1341 & -0.2665 \\ -0.2665 & 1.623 \end{array} \right)\cdot \left(\begin{array}{cc}-3.868 \\ -0.6656 \end{array} \right)$
