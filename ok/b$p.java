package ok.b$p;
import ok.b;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public final class b$p extends b	// class@002040
{
    public static final b$p p;

    static {
       b$p.p = new b$p();
    }
    public void b$p(){
       super();
    }
    public boolean apply(Object p0){
       return this.b(p0);
    }
    public boolean f(char p0){
       return Character.isUpperCase(p0);
    }
    public String toString(){
       return "CharMatcher.javaUpperCase\(\)";
    }
}
