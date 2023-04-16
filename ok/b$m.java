package ok.b$m;
import ok.b;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public final class b$m extends b	// class@00203d
{
    public static final b$m p;

    static {
       b$m.p = new b$m();
    }
    public void b$m(){
       super();
    }
    public boolean apply(Object p0){
       return this.b(p0);
    }
    public boolean f(char p0){
       return Character.isLetter(p0);
    }
    public String toString(){
       return "CharMatcher.javaLetter\(\)";
    }
}
