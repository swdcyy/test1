package ok.b$j;
import ok.b$f;
import java.lang.String;
import java.lang.StringBuilder;
import ok.b;

public final class b$j extends b$f	// class@0027e3
{
    public final char p;
    public final char q;

    public void b$j(char p0,char p1){
       super();
       this.p = p0;
       this.q = p1;
    }
    public boolean f(char p0){
       boolean b = (p0 == this.p || p0 == this.q)? true: false;
       return b;
    }
    public String toString(){
       return "CharMatcher.anyOf\(\""+b.h(this.p)+b.h(this.q)+"\"\)";
    }
}
