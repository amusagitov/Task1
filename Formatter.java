public class Formatter{
	private static int spaces = 0;

	public String format(char c){
		String result = "";

		if (c==';'){
			result = ";\n";
			for(int i=1; i<=spaces;i++){
				result = result + " ";
			}
			return result;
		} else if (c=='{'){
			result = "{\n";
			spaces= spaces + 4;
			for(int i=1; i<=spaces;i++){
				result = result + " ";
			}
			return result;
		} else if (c=='}'){
			result = "\n";
			spaces= spaces - 4;
			for(int i=1; i<=spaces;i++){
				result = result + " ";
			}
			result = result + "}\n";
			for(int i=1; i<=spaces;i++){
				result = result + " ";
			}
			return result;
		} else return String.valueOf(c);
	}
}