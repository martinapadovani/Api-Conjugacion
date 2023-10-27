package com.example.demo.servicios.servicioConjugacion;

import org.springframework.stereotype.Service;

import com.example.demo.interfaz.Conjugaciones;

@Service
public class ServicioConjugacionIr implements Conjugaciones {

    @Override
    public String conjugacionPrimeraPersonaS(String raiz){
        String verboConjugado = raiz.concat("o");
        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaS(String raiz){
        String verboConjugado = raiz.concat("is");
        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaS(String raiz){
        String verboConjugado = raiz.concat("i");
        return verboConjugado;
    }

    @Override
    public String conjugacionPrimeraPersonaP(String raiz){
        String verboConjugado = raiz.concat("imos");
        return verboConjugado;
    }

    @Override
    public String conjugacionSegundaPersonaP(String raiz){
        String verboConjugado = raiz.concat("en");
        return verboConjugado;
    }

    @Override
    public String conjugacionTerceraPersonaP(String raiz){
        String verboConjugado = raiz.concat("en");
        return verboConjugado;
    }
}