package ok.b$i;
import ok.b$f;
import java.lang.String;
import java.lang.StringBuilder;
import ok.b;

public final class b$i extends b$f	// class@002039
{
    public final char p;

    public void b$i(char p0){
       super();
       this.p = p0;
    }
    public boolean f(char p0){
       boolean b = (p0 == this.p)? true: false;
       return b;
    }
    public String toString(){
       return "CharMatcher.is\(\'"+b.h(this.p)+"\'\)";
    }
}
