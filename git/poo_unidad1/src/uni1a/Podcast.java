package uni1a;

public class Podcast extends ContenidoAudiovisual{
		private String plataforma;
		public Podcast(String titulo,int duracionEnMinutos,String genero,String plataforma)
		{	
			super(titulo,duracionEnMinutos,genero);
			
			this.plataforma=plataforma;
			

	  }
		
		public String getPlataforma() {
			return plataforma;
		}

		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}

		@Override
		public void mostrarDetalles() {
			System.out.println("Detalles del Podcast:");
			System.out.println("ID:"+ getId());
			System.out.println("Titulo:"+ getTitulo());
			System.out.println("Duracion:" + getDuracionEnMinutos());
			System.out.println("Genero:"+ getGenero());
			System.out.println("Plataforma:"+ plataforma);

		}
	}



