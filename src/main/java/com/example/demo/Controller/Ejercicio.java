
package com.example.demo.Controller;

import java.util.Arrays;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarea2")


public class Ejercicio {
    @GetMapping("/metros")
    public String calculo(double x){
        var resultado = x *3.2808;
        return "Hola, el resultado es : " + resultado + " en pies";
    }
    @GetMapping("/promedio2")
    public String Promedio2(double a, double b, double c, double d, double e){
        double resultado = (a+b+c+d+e)/5;
        return "Hola el promedio es " + resultado;
    }
    @GetMapping("/ordenar")
    public int[] ordenarNumeros (int a, int b, int c, int d, int e){
        int [] numeros = {a, b, c, d, e};
        Arrays.sort(numeros);
        return numeros;
    }
    @PostMapping("/porPost")
    public String NombrePOST(String nombre){
        return "Hola " + nombre + " por Post";
    }
    @PutMapping("/porPut")
    public String NombrePut(String palabra){
       StringBuilder resultado = new StringBuilder();
        for(int i = palabra.length()- 1; i>=0; i--){
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }
    @DeleteMapping("/porDelete")
   public String NombreDELETE(String nombre){
        return "Hola " + nombre + " por DELETE";
    }
}
   

