package uni1a;

public class TikTokVideo extends ContenidoAudiovisual{
	private String canal;
	public TikTokVideo(String titulo,int duracionEnMinutos,String genero,String canal)
	{	
		super(titulo,duracionEnMinutos,genero);
		
		this.canal=canal;
		

  }
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del video de TikTok:");
		System.out.println("ID:"+ getId());
		System.out.println("Titulo:"+ getTitulo());
		System.out.println("Duracion:" + getDuracionEnMinutos());
		System.out.println("Genero:"+ getGenero());
		System.out.println("Canal:"+ canal);

	}
}