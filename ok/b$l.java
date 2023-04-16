package ok.b$l;
import ok.b$q;
import java.lang.String;

public final class b$l extends b$q	// class@00203c
{
    public static final b$l q;

    static {
       b$l.q = new b$l();
    }
    public void b$l(){
       super("CharMatcher.javaIsoControl\(\)");
    }
    public boolean f(char p0){
       boolean b = (p0 <= 31 || (p0 >= 127 && p0 <= 159))? true: false;
       return b;
    }
}
