package ok.b$n;
import ok.b;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public final class b$n extends b	// class@00203e
{
    public static final b$n p;

    static {
       b$n.p = new b$n();
    }
    public void b$n(){
       super();
    }
    public boolean apply(Object p0){
       return this.b(p0);
    }
    public boolean f(char p0){
       return Character.isLetterOrDigit(p0);
    }
    public String toString(){
       return "CharMatcher.javaLetterOrDigit\(\)";
    }
}
