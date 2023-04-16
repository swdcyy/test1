package aq1.l;
import aq1.g;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;

public abstract class l extends g	// class@00028f
{
    public final String M;
    public final b N;
    public final i O;
    public final l P;

    public void l(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.M = p0;
       this.N = p1;
       this.O = p2;
       this.P = p3;
    }
    public boolean z3(){
       return true;
    }
}
