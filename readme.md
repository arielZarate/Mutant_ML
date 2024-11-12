# Desafio ML mutantes

## Descripcion del enunciado

Magneto quiere reclutar tantos mutantes como sea posible para luchar contra los X-men.
Te ha contratado para desarrollar un proyecto que detecte si un humano es un mutante basándose en su secuencia de ADN.

Para ello, te ha pedido que crees un programa con un método o función con la siguiente firma (en uno de los siguientes lenguajes: java/golang/tec)

- boolean isMutant(String [] dna)

- isMutant(dna [] string) bool

- is_mutant(dna)

- is_mutant(dna:&[&str])->bool

En el que pondrás como parámetro un array de cadenas que representan cada fila de una tabla (NxN) con la secuencia de ADN. La letra del String solo puede ser: (A,T,C,G), que representan cada base nitrogenada del ADN.

![fxc](/images/fxc.png)

Sabrás si un humano es un mutante si encuentras más de una secuencia de cuatro letras idénticas, ya sea en diagonal, horizontal o vertical.

Segunda página

Ejemplo (caso mutante)

String[]dna={"ATGCGA","CAGTGC","TTATGT","CCCCTA","TCACTG"}:
En el caso n, al llamar a la función isMutant(dna) se devuelve verdadero.

# Desarrollar el algoritmo de la forma más eficiente posible:

Retos:

## Nivel1

Crear un programa (en cualquier lenguaje de programación) que cumpla con el requisito dado por Magneto.

## Nivel 2

Se creó una API REST, se alojó esta API en una nube gratuita (Google App Engine, Amazon, AWS) y se creó el punto final "/mutant/" donde es posible detectar si un humano es un mutante enviando la secuencia de ADN mediante un POST HHTP con JSON en el siguiente formato:

```java

POST - /MUTANT/

{
"dna:["ATGCGA","CAGTGC","TTATGT","AGAAAGG","TCACTG"]
}

```

Si se detecta un mutante, debe devolver un HTTP -OK, debe devolver -Prohibido

## nivel 3

Agregar una base de datos que almacene las secuencias de ADN verificadas con la API

- SOLO UN REGISTRO POR secuencia de ADN.
- Exponer un punto final adicional "/stats" que devuelva un JSON con las estadísticas de verificación de ADN

```java

"cont_mutant_dna":40,
"count_human_dna:100,
"ratio":0.4

```

Pruebas automatizadas, cobertura de código >80%

Entregables;

- Código fuente (para kevek 2 y 3: en un repositorio de GitHub)
- Instrucciones sobre cómo ejecutar los programas o la API (para los niveles 2 y 3 \_ en el archivo README de GitHub)
- URL DE LA API (NIVEL 2 Y 3)
