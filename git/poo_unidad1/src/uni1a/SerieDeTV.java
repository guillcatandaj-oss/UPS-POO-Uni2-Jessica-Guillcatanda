/**
 * Class SerieDeTV
 */
package uni1a;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private Temporada temporada;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, Temporada temporada) {
        super(titulo, duracionEnMinutos, genero);
        this.temporada = temporada;
    }

    
    public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporada: " + temporada.getNumero());
        System.out.println();
    }
}
