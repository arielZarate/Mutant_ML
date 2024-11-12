Magneto wants to recruit as many mutants as possible to fight against the X-men.
he has hired you ti develop a prpject to detect if a Human is a mutant based on ther DNA sequence

For that , he has asked you ¡to created a program with a method or function with the following signature(inone of the following languajes:java/golang/tec)

- boolean isMutant(String [] dna)

- isMutant(dna [] string) bool

- is_mutant(dna)

- is_mutant(dna:&[&str])->bool

In whitch you will as a parameter an array of string that represent each row of an (NxN)table with the DNA sequence. The letter in the String can only be:(A,T,C,G),which represent each nitrogenous based of DNA.

you will know if a human is a mutant if you find if you find more the one sequence of four  identical letters , eigther diagonally, horizontally or vertically



Segunda pagina 

Example (mutant case)

String[]dna={"ATGCGA","CAGTGC","TTATGT","CCCCTA","TCACTG"}:
In the case n, calling the function isMutant(dna) return true.



Develop the algorithm as affciently as possible
challenges:


## level1
created a programs (in any programming lenguaje)that meets the requirement given by Magneto.


## level 2

Created a rest Api , host this Api on a free cloud computing(google App Engine ,Amazone ,AWS ), anda create the "/mutant/" endpoint whre it is posible ti detect id a human is a mutant by sending the DNA sequence an HHTP POST whith JSON in the folllowing format:


```java

POST - /MUTANT/

{
    "dna:["ATGCGA","CAGTGC","TTATGT","AGAAAGG","TCACTG"]
}

```


If a mutant is a detected , it should return an HTTP -OK ,it should return -Forbidden



## level 3
Add a database that stored the DNA sequences verified with the Api
    - oNLY ONE RECORD PER dna sequence.
    - Expose an addcitional endpoint "/stats" the return A JSON with the DNA verification statistics

    ```java
    
    "cont_mutant_dna":40,
    "count_human_dna:100,
    "ratio":0.4


    ```
Automated tests, code coverage>80%



Deliverables;
- Source code (for kevek 2 and 3 : in a GitHub repository)
- Intructions on how to run the programs or api (for level 2 and 3 _ i the GitHub readme)
- API URL (LEVEL 2 AND 3)