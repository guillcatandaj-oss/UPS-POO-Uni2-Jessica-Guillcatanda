package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");
        
        Actor actor1= new Actor("Johnny Deep");
        Investigador investigador1= new Investigador ("Alex Gibney");
        Temporada temporada1= new Temporada (8);

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios",actor1);
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", temporada1);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy",investigador1);
        contenidos[3] = new TikTokVideo("Novatos en Java",30,"Comedia","UPS ConectadosYT");
        contenidos[4] = new Podcast("Tecnologia al dia",45,"Comunicacion","Google Podcast");
        
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}