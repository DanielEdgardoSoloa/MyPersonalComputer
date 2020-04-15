
package mipersonalcomputer;

import javax.swing.JOptionPane;

public class Computadora {
    private String marca;
    private String discoDuro;
    private String memoria;
    private String procesador;
    private PlacaMadre placaMadre;

    public Computadora(String marca,String discoDuro, String memoria, 
            String procesador, PlacaMadre placaMadre) {
        this.marca=marca;
        this.discoDuro = discoDuro;
        this.memoria = memoria;
        this.procesador = procesador;
        this.placaMadre = placaMadre;
    }

    public Computadora() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }
    
    public void MostrarComputadora(){
        JOptionPane.showMessageDialog(null,"Computadora "+marca+"\nLa PC tiene: "+
                "\nProcesador: "+procesador+
                "\nMemoria: "+memoria+
                "\nDisco Duro: "+discoDuro+
                 "\n"+PlacaMadre.MostrarPlacaMadre());
    }
}
