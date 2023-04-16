package ok.b$d;
import ok.b;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public final class b$d extends b	// class@002034
{
    public static final b p;

    static {
       b$d.p = new b$d();
    }
    public void b$d(){
       super();
    }
    public boolean apply(Object p0){
       return this.b(p0);
    }
    public boolean f(char p0){
       boolean b = true;
       if (p0 != ' ' && (p0 != 133 && p0 != 5760)) {
          if (p0 != 8199) {
             if (p0 != 8287 && (p0 != 0x3000 && (p0 != 8232 && p0 != 8233))) {
                switch (p0){
                    case 9:
                    case 11:
                    case 12:
                    case 13:
                    case 10:
                    default:
                      if (p0 < 8192 || p0 > 8202) {
                         b = false;
                      }
                      return b;
                }
             }
          }else {
             return false;
          }
       }
       return b;
    }
    public String toString(){
       return "CharMatcher.breakingWhitespace\(\)";
    }
}
