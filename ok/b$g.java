package ok.b$g;
import ok.b$f;
import ok.n;
import java.lang.String;
import java.lang.StringBuilder;
import ok.b;

public final class b$g extends b$f	// class@0027e2
{
    public final char p;
    public final char q;

    public void b$g(char p0,char p1){
       super();
       boolean b = (p1 >= p0)? true: false;
       n.b(b);
       this.p = p0;
       this.q = p1;
       return;
    }
    public boolean f(char p0){
       boolean b = (this.p <= p0 && p0 <= this.q)? true: false;
       return b;
    }
    public String toString(){
       return "CharMatcher.inRange\(\'"+b.h(this.p)+"\', \'"+b.h(this.q)+"\'\)";
    }
}
