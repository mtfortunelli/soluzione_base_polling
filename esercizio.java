public class esercizio {

	public static void main(String[] args) {
		coda q = new coda(5);
		produttore p = new produttore(q);
		consumatore c = new consumatore(q);

		p.start();
		c.start();
	}

}