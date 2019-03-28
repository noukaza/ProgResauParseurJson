import java.io.EOFException;

public class StringLexer implements Lexer {
    private String string;
    private int position;
    public StringLexer(String string){
        this.string = string;
        this.position = 0;

        for(int i=0;i< string.length();i++){
            Character.isWhitespace(this.string.charAt(i));
        }
    }

    @Override
    public char current() {

        return this.string.charAt(position);
    }

    @Override
    public char get() throws EOFException {
        this.next();
        return this.string.charAt(0);
    }

    @Override
    public void skipWhiteSpace() {

    }

    @Override
    public void next() throws EOFException {
        this.position ++;
    }

    @Override
    public void check(char c) throws JsonParseException {
        if(this.string.charAt(this.position) == c){
            System.out.println("c est le meme ");
        }
    }
}
