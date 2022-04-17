### 1.2 
- $0.0014 = 0.0014 * 10^0 = 0.00014 * 10^1 = = 0.14 * 10^{-2} = 1.4*10^{-3}$ 
	- $1.4*10^{-3}$ ist normalisiert
- Nicht jede reelle Zahl ist eine Gleitkommazahl mit endlicher Mantissenlänge, Bsp. $\pi$ 
- Jede von Null verschiedene reelle Zahl hat eine eindeutige Darstellung als normalisierte Gleitkommazahl mit ggf. unendlicher Mantissenlänge

### 1.3
Für $r=p=2$ ist $B=2^{2-1}-1 = 1$
- 1->V 10->E 11-M wird als $(-1)^1*(1 + \frac{3}{2^2})*2^{2-1}=-3.5$ interpretiert 
- 0->V 00->E 11->M als $(-1)^0 * \frac{3}{2^2} * 2^{1-1} = 0.75$

### 1.5
Wir betrachten 9-Bit-Positis, also n = 9 
- 011010111
	- v = 0
	- Regime 110 (also i=6, k = 9 - 2 - 6= 1 ) 
	- E = $(10)_2$ = 2
	- F = $\frac{111_2}{2^3}$ = $\frac{7}{8}$ 
	- $\frac{15}{8}*2^{4+2} =120$
- 10001111 
	-  v = 1 
	- Regime 00001 (also i= 4, k = 4 + 1 - 9 = -4)
	- F = $\frac{(b_{i-4}...b_0)}{2^{i-3}}$ = $\frac{1}{2}$ 
	- E = $(11)_2$ = 3 
	- $(1-3+\frac{1}{2})*2^{(1-2)*(4*-4+3+1)}$ = $(-1.5)*2^{12}$ = -6144
- 000101011
	- v = 0
	- Regime 001 (also i = 6, k = 6+1-9=-2)
	- E = $(01)_2$ = 1
	- F = $\frac{011_2}{2^3}$ = $\frac{3}{8}$ 
	- $\frac{11}{8}*2^{-8+1}$ = $\frac{11}{1024}$
- 011111110
	- Regime 11111110 (i = 1, k= 9-2-1=6)
	- E = 0 = F
	- $2^{24}$ = 16777216 