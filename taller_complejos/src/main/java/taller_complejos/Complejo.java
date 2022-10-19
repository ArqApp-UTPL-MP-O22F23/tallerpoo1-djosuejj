/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_complejos;

/**
 *
 * @author davidjimenez
 */
public class Complejo implements Complejos_interface {

    private float real;
    private float imaginario;

    public float getreal() {
        return real;
    }

    public float getimaginario() {
        return imaginario;
    }

    public Complejo() {
        this.real = 1;
        this.imaginario = 1;
    }

    public Complejo(float real, float imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    @Override
    public String toString() {
        String complejoStr = String.valueOf(this.real) + "+" + String.valueOf(this.imaginario) + "i";
        return complejoStr;
    }

    @Override
    public Complejo sumarComplejos(Complejo a) {
        float numReal = this.real + a.getreal();
        float numImaginario = this.imaginario + a.getimaginario();

        Complejo resultado = new Complejo(numReal, numImaginario);

        return resultado;
    }

    @Override
    public Complejo restarComplejos(Complejo b) {
        float numReal = this.real - b.getreal();
        float numImaginario = this.imaginario - b.getimaginario();

        Complejo resultado = new Complejo(numReal, numImaginario);

        return resultado;
    }
}
