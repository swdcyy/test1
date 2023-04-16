package ok.b$c;
import ok.b$q;
import java.lang.String;

public final class b$c extends b$q	// class@002033
{
    public static final b$c q;

    static {
       b$c.q = new b$c();
    }
    public void b$c(){
       super("CharMatcher.ascii\(\)");
    }
    public boolean f(char p0){
       boolean b = (p0 <= 127)? true: false;
       return b;
    }
}
