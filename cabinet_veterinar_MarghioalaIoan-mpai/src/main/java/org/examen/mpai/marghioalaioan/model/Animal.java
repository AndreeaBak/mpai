package org.examen.mpai.marghioalaioan.model;

public class Animal {

    private String rasaAnimal;
    private String culoare;
    private int kilograme;
    private int varsta;

    public Animal(String rasaAnimal, String culoare, int kilograme, int varsta) {
        this.rasaAnimal = rasaAnimal;
        this.culoare = culoare;
        this.kilograme = kilograme;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("rasaAnimal='").append(rasaAnimal).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", kilograme=").append(kilograme);
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
