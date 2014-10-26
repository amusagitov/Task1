import java.io.*; 

public class Reader{
	private FileReader fr;
	int c;

	public void init(String fileName) throws FileNotFoundException{
		fr = new FileReader(fileName);
	}

	public int getChar() throws IOException {
		c = fr.read();
		if(c==-1)fr.close();
		return c;
	}
}