package ok.b$a;
import ok.b$q;
import java.lang.String;
import java.lang.CharSequence;
import ok.n;
import java.lang.Object;

public final class b$a extends b$q	// class@002031
{
    public static final b$a q;

    static {
       b$a.q = new b$a();
    }
    public void b$a(){
       super("CharMatcher.any\(\)");
    }
    public int d(CharSequence p0,int p1){
       int i = p0.length();
       n.l(p1, i);
       if (p1 == i) {
          p1 = -1;
       }
       return p1;
    }
    public boolean f(char p0){
       return true;
    }
    public String i(CharSequence p0){
       n.j(p0);
       return "";
    }
}
