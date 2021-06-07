Algoritmo Ejercicio12
 // N es el total de los participantes 
 N <- 0
 Para i <- 0 Hasta N Con Paso 1
  Hacer
  Definir nombre 
  Escribir"Ingrese su nombre"
   Leer nombre 
   Si N>=10 Entonces 
   Definir M, F
   // Donde M es masculino y F es femenino  
   Escribir"Toque si es hombre"
   Leer M
   Escribir"Toque si es mujer "
   Leer F
   Definir H, E
   // Donde H es Altura y E es edad  
   Escribir"Ingrese su Altura"
   Leer H
   Escribir"Ingrese su edad"
   Leer E
   Escribir"H+E+M+F"
   Si H>0 Entonces 
   PM <- (i+1)/10
   PF <- (i+1)/10
 Fin Para
  Escribir"El promedio del Sexo Masculino es PM"
  Escribir"El promedio del Sexo Femenino es PF"
FinAlgoritmo 