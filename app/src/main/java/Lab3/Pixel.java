package Lab3;

/**
 * Clase que representa un Pixel, compuesto de 3 int y 1 String
 * @author joaquin
 * @version 11.0.17
 * @author joaquin
 */
public abstract class Pixel_21272789_SaldiviaMonsalve {
    private int x;
    private int y;
    private int depth;
    private String tipo;
    
    public Pixel_21272789_SaldiviaMonsalve(int x, int y, int depth) {
        this.x = x;
        this.y = y;
        this.depth = depth;
    }
    
    /**
     * Getter de x
     * @return x (int)
     */
    public int getX() {
        return x;
    }

    /**
     * Setter de x
     * @param x (int)
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter de y
     * @return y (int)
     */
    public int getY() {
        return y;
    }

    /**
     * Setter de y
     * @param y (int)
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Getter de profundidad
     * @return depth (int)
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Setter de profundidad
     * @param depth (int)
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * Getter de tipo
     * @return tipo (String)
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Setter de tipo para un Pixel
     * @param tipo (String)
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Funcion abstracta de Pixel a String
     * @return String
     */
    @Override
    public abstract String toString();
    
}
