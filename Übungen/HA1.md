 Hausaufgaben Numerische Mathematik 

von Rico Kölling 192316 und Svaran Singh Chandla 193922

Hausaufgabe 1.1:
A) $f(x) = \frac{1}{1+x}$ 
-> $\frac{1}{1+x}+\frac{-(\frac{1}{(x+1)^2})}{1}\cdot(x)+\frac{\frac{2}{(x+1)^3}}{2}\cdot(x^2)$ 
= $1 - x + x^2$ 
-> s = $\frac{1}{2}$   
-> S = $\frac{1}{2}$

B) $f(x)= \sqrt{1+x} =(1+x)^{\frac{1}{2}}$ 
-> $(1+x)^{\frac{1}{2}} + \frac{1}{2\cdot\sqrt{x+1}}\cdot(x)-\frac{1}{8\cdot(x+1)^{\frac{3}{2}}} \cdot(x^2)$
= $\sqrt{1}+\frac{1}{2\sqrt{1}}\cdot(x)-\frac{1}{8\cdot(1)^{\frac{3}{2}}}\cdot(x^2)$
-> s = 1 
-> S = $\frac{11}{8}$

Hausaufgabe 1.2:
A) $\delta_s, \delta_c \in \mathbb{R}_{<0}$ mit $s(a)-\delta_s\leq$ sin(a) $\leq s(a)-\delta_s$
						und $c(a) - \delta_c \leq$ cos(a) $\leq c(a)+\delta_c$
$a=3.140625$
$s(a)= \sum\limits_{n=0}^{10} \frac{(-1)^n\cdot a^{2m+1}}{(2n+1)!} \approx 9.675344\cdot10^{-4}$  
$sin(a) = \sum\limits_{n=0}^{\infty} \frac{(-1)^n\cdot a^{2n-1}}{(2n+1)!} \approx 9.6753\cdot10^{-4}$
->$\delta_s = |sin(a)-s(a)| =  |9.6753\cdot10^{-4}-9.675344\cdot10^{-4}| = 4.4\cdot10^{-9}$

$c(a)=\sum\limits_{n=0}^{10} \frac{(-1)^n\cdot a^{2n}}{(2n)} \approx -9.9999953\cdot10^{-1}$
$cos(a)=\sum\limits_{n=0}^{\infty} \frac{(-1)^n\cdot a^{2n}}{(2n)} \approx -1$
$\delta_c = |cos(a) - c(a)| = |(-1) - (-9.9999953\cdot10^{-1})| = 4.7\cdot10^{-7}$

B)



Hausaufgabe 1.3:
$A_x := (x+1)\cdot(x+1)=(x+2)\cdot x+1$

Annahme: 
-> für kleinere x gilt : $|((x \boxplus 1) \boxdot (x \boxplus 1) - A_x|> |(((x \boxplus2)\boxdot x)\boxplus1)-A_x|$

Bsp.: x = $4.5\cdot10^{-1}$
$A_x =(0.45+1)\cdot(0.45+1)=(((0.45+2)\cdot x)+1)=2.1025$

I. $|((4.5*10^{-1}\boxplus1)\boxdot(4.5\cdot10^{-1}\boxplus1))-A_x|$
-> $|(4.5\cdot10^{-1}\boxplus1)|=Rd_2(4.5*10^{-1}+1)=Rd_2(1.45)=1.4$
-> $|(1.4\boxdot1.4)|=Rd_2(1.4\cdot1.4)=Rd_2(1.96)=2$
->$|(2)-A_x|= |2-2.1025|=0.1025$

II. $|((4.5\cdot10^{-1}\boxplus 2)\boxdot4.5\cdot10^{-1})\boxplus1)-A_x|$
->$|(4.5\cdot10^{-1}\boxplus2)|=Rd_2(4.5\cdot10^{-1}+2)=Rd_2(2.45)=2.4$
->$|2.4\boxdot4.5\cdot10^{-1}|=Rd_2(4.5\cdot10^{-1}\cdot2.4)=Rd_2(1.08)=1$
->$|(1.1\boxplus1)|=Rd_2(1.1+1)=Rd_2(2.1)=2.1$
->$|(2.1-A_x)|=|2.1-2.1025|=2.5\cdot^{-3}$

$\curvearrowright0.1025 >2.5\cdot10^{-3}$

Bei den Runden einer Zahl von 0.45 wird nicht auf 0.5 sondern auf 0.4 gerundet, sodass in diesem Fall die Rundung genutzt werden kann $((x\boxplus1)\boxdot(x\boxplus1)-A_x$ geringer zu machen, sondern der Betrag dieser größer ist als $|(((x \boxplus2)\boxdot x)\boxplus1)-A_x|$. Des weiteren wird durch multiplizieren von $(((x\boxplus2)\boxdot x)\boxplus1)$ und 0.45 , durch die Rundung, eine größere Zahl erzeugt als beim bei der Multiplizieren von $(x\boxplus1)\cdot(x\boxplus1)$, sodass der Betrag niedriger wird. 

B)