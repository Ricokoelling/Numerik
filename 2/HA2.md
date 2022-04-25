### Hausaufgabe 2.1
$f(x)=\frac{3x^2-2x^3+1}{3x(2-x)}$ Zz. $\forall x\in[\frac{1}{2},1]$: $f(x)\in[\frac{1}{2},1]$ 

für $f(x)\geq \frac{1}{2} \to p(x)$ 
$\frac{3x^2-2x^3+1}{3x(2-x)}\geq\frac{1}{2}$
=$3x^{2}-2x^{3}+1\geq \frac{1}{2} \cdot (3x(2-x))$ 
=$-2x^{3}+3x^{2}+1\geq \frac{1}{2}\cdot(6x-3x^2)$
=$-2x^{3}+3x^{2}+1 \geq 3x- \frac{3}{2}x^{2}$
= $-2x^{3}+\frac{9}{2}x^{2}-3x+1 \geq 0$

für $f(x)\leq 1 \to q(x)$
$\frac{3x^{2}-2x^{3}+1}{3x(2-x)}\leq1$
= $3x^{2}-2x^{3}+1\leq1(3x(2-x))$
=$3x^{2}-2x^{3}+1\leq6x-3x^{2}$
=$-2x^{3}+6x^{2}-6x+1\leq0$

Für p(x) ist $x\geq \frac{1}{12}(9+\sqrt[3]{189-108\sqrt{3}} +3\sqrt[3]{7+4\sqrt{3}})$ 
-> $\approx1.45541$
-> $x\geq1.45541$
Für g(x) ist $x\geq1-\frac{1}{\sqrt[3]{2}}$
-> $\approx0.206299$
-> $x\geq0.206299$

Wir betrachten nur den Bereich von $[\frac{1}{2},1]$, in diesem ist die Funktion stetig 
Durch das Umstellen um die Intervallgrenzen haben wir festgestellt, dass weder p(x), noch q(x) in den Intervall liegen. 
$\curvearrowright$ Die Funktion kann für $x\in[\frac{1}{2},1]$ nur die Werte $f(x)\in \left[\frac{1}{2},1\right] erhalten$

### Hausaufgabe 2.2
a) $h_1\in O(f)$, $h_{2}\in O(g)$, $h_{3}\in o(f)$ für $x \rightarrow x_0$ 

i) $h_{1}+h_{2} \in O(|f|+|g|)$ für $x \rightarrow x_0$
$\limsup\limits_{x\to x_{0}} |\frac{(h_1+h_2)(x)}{(f+g)(x)}|$ = $\limsup\limits_{x\to x_{0}} |\frac{h_1(x)+h_2(x)}{f(x)+g(x)}|$ =$\limsup\limits_{x\to x_0}\frac{h_1(x)}{f(x)}+\limsup\limits_{x\to x_0}\frac{h_2(x)}{g(x)}<\infty$  
da beide $< \infty$ sind und somit ist auch $|f| + |g|$ < $\infty$ 

ii)$h_{2}\cdot h_{3}\in o(f\cdot g)$ für $x\rightarrow x_0$ 
$\limsup\limits_{x\to x_{0}}|\frac{(h_{2}\cdot h_{3})(x)}{(f\cdot g)(x)} |=\limsup\limits_{x\to x_{0}} |\frac{h_{2}(x)\cdot h_{3}(x)}{f(x)\cdot g(x)}| \leq|\limsup\limits_{x\to x_{0}} |\frac{h_2(x)}{f(x)}|\cdot|\limsup\limits_{x\to x_{0}} |\frac{h_3(x)}{g(x)}| = 0$
da $h_3$ = 0 ist und bei der Multiplikation mit 0 alles automatisch null wird, kommt somit auch das Folgende Ergebnis auf 0
Somit muss auch $(f\cdot g) = 0$ sein also somit $o(f \cdot g)$ 

b) $(1+\frac{1}{n})^{n}-e \in O(\frac{1}{n})$ für $n \to \infty$ 

Der Limes Superior $\limsup\limits_{n\to\infty}(1+\frac{1}{n} )^{n}$ hat als Grenzwert e, also wird ist die Formel $\limsup\limits_{n\to\infty}(1+\frac{1}{n} )^{n}-e \approx 0$ 
Für $O(\frac{1}{n})$ mit $n\to\infty$ gilt, desto näher das n gegen $\infty$ läuft desto mehr nähert es sich 0 null an. 

Es ist festzuhalten, dass $\limsup\limits_{n\to\infty}(1+\frac{1}{n} )^{n}$ ein monoton steigendes Wachstum hat, während  $O(\frac{1}{n})$ monoton fallend ist.
Dadurch, dass wir den Betrag von $|\limsup\limits_{n\to\infty}(1+\frac{1}{n} )^{n}|$ benutzen ist das Wachstum nun $\in O(\frac{1}{n})$

### Hausaufgabe 2.4
Code siehe NumDiff.java

Durch den Anstieg von $n\in\{1,...,20\}$  wird $h=0.25^{n}$ immer kleiner. Durch das kleiner werden von h wird auch der Unterschied zu $f'(x_0)$ kleiner.  