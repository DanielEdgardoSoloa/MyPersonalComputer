
package mipersonalcomputer;

import javax.swing.JOptionPane;

public class PlacaMadre {
    private static String marca;
    private static String audio;
    private static String video;

    public PlacaMadre(String marca, String audio, String video) {
        this.marca = marca;
        this.audio = audio;
        this.video = video;
    }

    public PlacaMadre() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    
    public static String MostrarPlacaMadre(){
        return "Los componentes de la Placa Madre son: "+
                "\nMarca: "+marca+
                "\nAudio: "+audio+
                "\nVideo: "+video;
    }
}
