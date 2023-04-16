package ok.b$o;
import ok.b;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public final class b$o extends b	// class@00203f
{
    public static final b$o p;

    static {
       b$o.p = new b$o();
    }
    public void b$o(){
       super();
    }
    public boolean apply(Object p0){
       return this.b(p0);
    }
    public boolean f(char p0){
       return Character.isLowerCase(p0);
    }
    public String toString(){
       return "CharMatcher.javaLowerCase\(\)";
    }
}
