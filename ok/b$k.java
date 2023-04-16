package ok.b$k;
import ok.b;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public final class b$k extends b	// class@00203b
{
    public static final b$k p;

    static {
       b$k.p = new b$k();
    }
    public void b$k(){
       super();
    }
    public boolean apply(Object p0){
       return this.b(p0);
    }
    public boolean f(char p0){
       return Character.isDigit(p0);
    }
    public String toString(){
       return "CharMatcher.javaDigit\(\)";
    }
}
