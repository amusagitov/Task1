import java.io.*;

public class Writer{
	private FileWriter fw;

	public void init(String fileName) throws IOException{
		fw = new FileWriter(fileName);
	}

	public void write(String str) throws IOException {
		fw.write(str);
	}

	public void close() throws IOException {
		fw.close();
	} 
}