package arvoreNo;

public class Arvore {

	private static Arvore esquerda;
	private static Arvore direito;
	private static int folhas;

	public static Arvore getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Arvore esquerda) {
		Arvore.esquerda = esquerda;
	}

	public static Arvore getDireito() {
		return direito;
	}

	public void setDireito(Arvore direito) {
		Arvore.direito = direito;
	}

	public int getRaiz() {
		return folhas;
	}

	public void setRaiz(int folhas) {
		Arvore.folhas = folhas;
	}
	
	public int quantidadeDeFolhas(Arvore arv) {
		if (Arvore.esquerda == null && Arvore.direito == null) {
			folhas ++;
		}
		if(arv != null) {
			quantidadeDeFolhas(Arvore.esquerda);
			quantidadeDeFolhas(Arvore.direito);
		}
		return folhas;
		
	}

	public int quantidadeFolhas(Arvore arv) {
	    	int total = 0;
	    	
	    	if (Arvore.getEsquerda() == null && Arvore.getEsquerda() == null ) {
	    		total ++;
	    		return total;
	    	}
	    	else {
	    		return total;
	    	}
	    }

}
