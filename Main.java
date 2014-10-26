import java.io.*;

public class Main{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Reader r = new Reader();
		r.init(args[0]);
		Formatter f = new Formatter();
		Writer w = new Writer();
		w.init(args[1]);

		int c;

		while ((c=r.getChar()) != -1){
			w.write(f.format((char)c));
		}
		w.close();
	}
}