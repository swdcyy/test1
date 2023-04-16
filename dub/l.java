package dub.l;
import ok.o;
import j9c.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public final class l implements o	// class@002576
{
    public final d b;
    public final String c;

    public void l(d p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       l tb = this.b;
       l tc = this.c;
       boolean b = (p0 != null && tb.f(tc, p0.intValue()))? true: false;
       return b;
    }
}
