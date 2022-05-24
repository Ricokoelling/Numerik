## Numerische Mathematik Hausaufgaben 
von Rico Kölling 192316 und Svaran Singh Chandla 193922

### Hausaufgabe 5.1
$N'_{f}(x)=\left(x-\frac{f(x)}{f'(x)} \right)^{'}=1-\frac{(f'(x))^{2}-f(x)f''(x)}{(f'(x))^{2}}$
$m_{2}>0\Rightarrow f''(x)\neq$ auf $[a,b]$
also $N'_{f}(x)=0\Leftrightarrow f(x)=0 \Leftrightarrow x=x^{*}$, und nur dort kann $N_{f}$ ein lokales Extremum haben.
$f'(x)<0\Rightarrow f$ monoton $\Rightarrow$ höchstens eine Nullstelle
$f$ hat genau eine Nullstelle $x^{*}\in[a,b]$
$N_{f}$ ist monoton auf $[a,x^{*}]$ und $[x^{*},b]$


### Hausaufgabe 5.2
$f\in\mathscr{C}^{k}(D,\mathbb{R})$ $\mathscr{C}$: menge der Stetigen Funktionen von $D\to\mathbb{R}$
$k\in\mathbb{R}$ 
$x^{*}$= Fixpunkt

Wir wissen, dass $\phi$ eine lokale Konvergenzordnung von mindestens p in $x^{*}$
$\Leftrightarrow\phi(x)-x^{*}\in\mathcal{O}(||x-x^{*}||^{p})$ für $x\to x^{*}$ hat.


Es ist zu sagen, für den Wachstum von $\phi(x)-x^{*}$ im Vergleich von $f(\phi(x))$, dass diese genau gegensätzlich wachsen. Für $x\to x^{*}$ wird $\phi(x)-x^{*}$ immer größer, weil $\phi(x^{*})=x^{*}$ ist, somit ist es monoton wachsend. Währenddessen wird $f(\phi(x))$ immer kleiner da, $f(x^{*})=0$ ist. Das umgekehrte Wachstum bedeutet aber auch das $\phi(x)-x^{*}\in\Theta(f(\phi(x)))$. Dasselbe stimmt mit $\phi(x)-x$ und $x-x^{*}$ überein. Während $\phi(x)$ zu $\phi(x^{*})$ wird und $x\to x^{*}$, also $\phi(x^{*})-x^{*}=0$ wird. Ist es so, dass $x^{*}-x^{*}$ auch zu Null wird, somit $\phi(x)-x\in\Theta(x-x^{*})$. 

Für das Taylorpolynom von Grad $k-1$ von $(\phi(x);x)$ haben wir sozusagen dann das $T_{k-1}(\phi(x^{*});x^{*})$. Wir wissen aus der vorherigen Feststellung, dass für $x\to x^{*}$ in diesen Fällen das Wachstum $\theta$ ist. In diesem Fall wird aber vom Taylorpolynom von Grad $k-1$ ausgegangen somit ist es $\mathcal{O}$ und die lokale Konvergenz hat mindestens Ordnung von k. Wie in der Newtondefinition erwähnt, hat $\phi$ eine lokale Konvergenzordnung von mindestens p in $x^{*}$
$\Leftrightarrow\phi(x)-x^{*}\in\mathcal{O}(||x-x^{*}||^{p})$ für $x\to x^{*}$ hat. Somit können wir analog sagen, dass die Konvergenzordnung k in $x^{*}$ ist.

<div style="page-break-after: always;"></div>

### Hausaufgabe 5.3
b) 
$f(n)=x-e^{-x^{2}}$
$f'(x)=1+e^{-x^{2}}\cdot2x$
$f''(x)=2e^{-x^{2}}-e^{-x^{2}}\cdot4x^{2}=2e^{-x^{2}}=2e^{-x^{2}}(1-2x^{2})$

$x^{*}\in[a,b$] $a=0.6,b=1$   
$f'(a)=1+e^{-\frac{1}{4}}\approx1.7788$
$f''(a)=2e^{-\frac{1}{4}}\cdot(\frac{1}{2})\approx0.7788$

$f'(b)=1+2e^{-1}\approx1.735$
$f''(b)=2e^{-1}\cdot(-1)\approx0.735476$

$f(x)$ hat den Intervall $[a,b]$ streng monoton steigend, das x immer positiv ist und $-\frac{1}{e^{x^{2}}}$ in 0 eine Extremstelle hat und keine Nullstellen.

$\Rightarrow m_{1}(f)=min\{f'(x)\}=f'(b)\approx1.73576$
$\Rightarrow M_{2}(f)=max\{f''(x)\}=f''(a)\approx0.7788$

$C=\frac{M_{2}(f)}{2m_{1}(f)}\approx0.22434$   $|x_{v}-x^{*}|=\frac{1}{c}\dot(C\dot(b-a))^{2v}$
$|x_{v}-x^{*}|<10^{-5}\Leftrightarrow\frac{1}{c}\cdot(\frac{c}{2})^{2v}<10^{-5}\Leftrightarrow\frac{2m_{1}(f)}{M_{2}(f)}\cdot\left(\frac{M_{2}(f)}{4m_{1}(f)}\right)^{2v}<10^{-5}$
Durch einsetzen ergibt sich für $v=2:$
											$\frac{2m_{1}(f)}{M_{2}(f)}\cdot\left(\frac{M_{2}(f)}{4m_{1}(f)}\right)^{2\cdot2}=7.0567\cdot10^{-4}>10^{-5}$
												bei $v=3:$
											$\frac{2m_{1}(f)}{M_{2}(f)}\cdot\left(\frac{M_{2}(f)}{4m_{1}(f)}\right)^{2\cdot3}=8.8787\cdot10^{-6}<10^{-5}$
Für $v\geq3$ gilt $|x_{v}-x^{*}|<10^{-5}$

### Hausaufgabe 5.4
siehe main.cpp

für die Daten siehe output.txt 