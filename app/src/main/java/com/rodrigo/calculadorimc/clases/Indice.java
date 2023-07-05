package com.rodrigo.calculadorimc.clases;

public class Indice {
    private float masa;
    private float altura;

    public Indice(float masa,float altura){
        this.masa = masa;
        this.altura = altura;
    }
    public float calculo(){

        return (masa / (altura*altura));
    }

    public String categoria(){
        float imc = calculo();
        if(imc < 15 )
            return "Críticamente bajo de peso";

        if(  imc>=15 && imc<16  )
            return "Severamente bajo de peso";

        if(imc >=16 && imc <18.5 )
            return "Bajo de peso";

        if(imc >= 18.5 && imc<25 )
            return "Normal (peso saludable)";

        if(imc >= 25 && imc<30)
            return "Sobrepeso";

        if(imc >= 30 && imc<35 )
            return "Obeso Clase I (Moderadamente obeso)";

        if(imc >= 35 && imc<40 )
            return "Obeso clase II (severamente obeso)";

        return "Obeso clase III (críticamente obeso)";
    }

}
