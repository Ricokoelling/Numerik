## Numerische Mathematik Hausaufgaben 
von Rico Kölling 192316 und Svaran Singh Chandla 193922

### Hausaufgabe 4.1
A) Seien $\epsilon_{y1},\epsilon_{y2},\epsilon_{p},\epsilon_{w}$ die jeweiligen relativen Fehler. Die Konditionszahlen für $y_{2}$ sind $\frac{p}{p/2-w}\cdot \frac{1}{2}=\frac{1}{1-2w/p}$ und $\frac{w}{p/2-w}\cdot (-1)= \frac{1}{1-p/2w}$. Demnach  $\delta_{y_{2}}= \frac{1}{1-2w/p}\delta_{p}+\frac{1}{1-p/2w}\epsilon_{w}+o(|\epsilon_{p}|+|\epsilon_{w}|)$ für $(\epsilon_{p},\epsilon_{W})\to(0,0)$. Für $y_{1}$ sind die Konditionszahlen $\frac{p}{p/2+w}\cdot\frac{1}{2}=\frac{1}{1+2w/p}$ und $\frac{w}{p/2+w}\cdot(+1)=\frac{1}{1+p/2w}$. also $\epsilon_{y_{1}}=\frac{1}{1+2w/p}\epsilon_{p}+\frac{1}{1+p/2w}\epsilon_{w}+o(|\epsilon_{p}|+|\epsilon_{w}|)$ für $(\epsilon_{p},\epsilon_{w})\to(0,0)$.

Wegen $|q|\ll p^{2}/4=u$ ist $v\approx u$ und somit $w\approx \sqrt{u}=\frac{|p|}{2}$. Wegen $p<0$ betragen die Konditionszahlen für $y_{2}$ etwa 1/2, also $\epsilon_{y_{2}}\approx \frac{1}{2}\epsilon_{p}+\frac{1}{2}\epsilon_{w}$. Für $y_{1}$ sind die Nenner der Konditionszahlen fast  $0\leadsto$ Fehlerverstärkung. 

B) Wie in der vorigen Teilaufgabe gesehen, führt der Rechenweg $y_{1}=p/2+w$ zu einem relativen Fehler für $y_{1}$, der unter den genannten Voraussetzung viel größer als $\epsilon_{y_{2}}$ ist. Mit $y_{1}=q/y_{2}$ erhält man jedoch $\epsilon_{y_{1}}=\epsilon_{q}-\epsilon_{y_{2}}+o(|\epsilon_{p}|+|\epsilon_{w}|)\approx \epsilon_{p}- \frac{1}{2}\epsilon_{p}-\frac{1}{2}\epsilon_{w}$. Dieser Rechenweg ist günstiger als der andere, es sei denn, $|\epsilon_{q}|\gg|\epsilon_{p}|$.
Wenn q und p als Gleitkommazahlen gegeben sind, gilt $|\epsilon_{q}|\approx|\epsilon_{p}|$, also sit realistischerweise nicht $|\epsilon_{q}|\gg|\epsilon_{p}|$.

C) $p^{2}=16$, also $u=4$; $v=4-^{*}0.01=3.99$; $w=Rd_{4}(\sqrt{3.99})=1.997$. Somit $y_{2}=-4/2-^{*}1.997=-3.997$. Erster Rechenweg: $y_{1}=-4/2+^{*}1.997=-0.003$. Zweiter Rechenweg: $y_{1}=0.01/^{*}(-3.997)=-0.002502$. Genauere Lösung: $y_{1}\approx-0.00250156$ und $y_{2}\approx-3.9974984$. Der zweite Rechenweg ist also deutlich genauer als der erste. 

Wenn $\epsilon_{q}$ und $\epsilon_p$ nicht einfach Rundungsfehler sind, könnte $\epsilon_{q}\gg\epsilon_{p}$ sein. Sei etwa $\overline{p}=0.02$, Also $\epsilon_{q}=1$. Dann erhalten wir $v=3.98$, $w=1.995$ und $y_{2}=-3.995$. Im ersten Rechenweg erhalten wir $y_{1}=-0.005$, im zweiten $y_{1}=-0.005006$. Der zweite Rechenweg wird also für $\epsilon_{q}\gg\epsilon_{p}$ auch in der praktischen Rechnung ungünstig


### Hausaufgabe 4.2
$f(x)=2^{x}-4x-1$

$f$ ist stetig, $f(4)=-1$, $f(4.5)>3.62>0$. Nach dem Zwischenwertsatz hat $f$ in $[4,4.5]$ mindestens eine Nullstelle.

$f'(x)=ln(2)\cdot2^{x}-4$ ist streng monoton wachsend auf $\mathbb{R}$. Wegen $f'(4)=16\cdot ln(2)-4>7.09>0$ ist $f'(x)>0$, $\forall x \in [4,4.5]$ . Daher ist $f$ streng monoton wachsend auf $[4,4.5]$ und hat dort höchstens eine Nullstelle.

$a_{0}:=4,b_{0}:=4.5$

- $M:=\frac{a_{0}+b_{0}}{2}=4.25,f(M)>1.02\leadsto a_{1}:=a_{0}, b_{1}:=M$
- $M:=\frac{a_{1}+b_{1}}{2}=4.125,f(M)<-0.05\leadsto a_{2}:=M,b_{2}:=b_{1}$
- $M:=\frac{a_{2}+b_{2}}{2}=4.1875,f(M)>0.47\leadsto a_{3}:=a_{2},b_{3}:=M$
- $\frac{b_{3}-a_{3}}{2}=0.03125<0.04$, also löst $\overline{x}:=\frac{a_{3}+b_{3}}{2}=4.15625$ die Aufgabe 

 $x^{*}\approx4.131388$, daher $|\overline{x}-x^{*}|<0.0249$

### Hausaufgabe 4.3
Für stetig differenzierbare Funktionen $f:[a,b]\to\mathbb{R}$ lässt sich also eine Lipschitz- Konstante mit einer Kurvendiskussion von $|f'|$ berechnen. Ist 𝑓 ∈ 𝜉(𝐼, ℝ), aber 𝑠𝑢𝑝𝑥∈𝐼 |𝑓 ′ (𝜉)| = ∞, dann ist f nicht lipschitzsch. Mittelwertsatz: ∀𝑥 ≠ 𝑦 ∈ [𝑎, 𝑏]: ∃𝜉 zwischen $x,y$ mit $\frac{|f(y)-f(x)|}{|y-x|}$ = 𝑓 ′ (𝜉), also
$\frac{|f(y)-f(x)|}{|y-x|}$ = |𝑓 ′ (𝜉)| ≤ 𝐿, also |𝑓(𝑦) − 𝑓(𝑥)| ≤ 𝐿 ∙ |𝑦 − 𝑥|

### Hausaufgabe 4.4
A) siehe Main.py

B) 
$a:=1.61801916$
$b:=1.61801917$

Für die Funktion
$f(x)=223200658x^{3}-1083557822x^{2}+1753426039x-945804881$
$f'(x)=669601974x^{2}-2167115644x+1753426039$

In das Newton-Verfahren eingesetzt wäre dies
$x_{n+1}=x_{n}-\frac{f(x_{n})}{f'(x_{n})}$
-> $x_{1} =x_{0}-\frac{f(x_{0})}{f'(x_{0})}$
mit $x_{0}=a$
$x_{1}=1.61801916-\frac{f(1.61801916)}{f'(1.61801916)}=1.61801916-\frac{-1.708110511232\cdot10^{-12}}{0.0009390686664544}=1.61801916$
mit $x_0=b$

$x_{2}= 1.61801917-\frac{f(1.61801917)}{f'(1.61801917)}=1.61801917-\frac{-5.217050063846}{-0.0016408342569114}=1.61830...$
-> $x_{3}= 1.618015..$

Somit ist zu sagen, wenn man mit dem Newton verfahren versucht die Nullstelle genau zu approximieren, bleibt nur eine mögliche Über, a. 
$\curvearrowright$  Es gibt nur eine Nullstelle und diese ist a. 

siehe second.py
