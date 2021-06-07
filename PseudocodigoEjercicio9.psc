Algoritmo Ejercicio9
	T1 <- 0
	T2 <- 0
	total <- 0
	Repetir
		Escribir "ingresa 2 temperaturas"
		Leer T1,T2
		suma <- 0
		Si 5<=T1 & T1<=15 Entonces
			suma = suma+T1
			total <- 1+total
			Si 5<=T2 & T2<=15 Entonces
				suma = suma+T2
				total <- total+1
			FinSi
		FinSi
		suma <- suma/total
		Escribir "Promedio es", suma
	Hasta Que T1 = 0
FinAlgoritmo
