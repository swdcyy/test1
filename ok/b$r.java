package ok.b$r;
import ok.b$q;
import java.lang.String;
import java.lang.CharSequence;
import ok.n;

public final class b$r extends b$q	// class@002042
{
    public static final b$r q;

    static {
       b$r.q = new b$r();
    }
    public void b$r(){
       super("CharMatcher.none\(\)");
    }
    public int d(CharSequence p0,int p1){
       n.l(p1, p0.length());
       return -1;
    }
    public boolean f(char p0){
       return false;
    }
    public String i(CharSequence p0){
       return p0.toString();
    }
}
