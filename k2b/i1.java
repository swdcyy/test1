package k2b.i1;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.n;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import y2b.b;
import com.yxcorp.gifshow.log.model.CommonParams;
import java.lang.Object;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;

public final class i1 implements Runnable	// class@001ba2
{
    public final n b;
    public final String c;
    public final ClientEvent$EventPackage d;
    public final ClientContentWrapper$ContentWrapper e;
    public final b f;
    public final CommonParams g;
    public final boolean h;
    public final boolean i;

    public void i1(n p0,String p1,ClientEvent$EventPackage p2,ClientContentWrapper$ContentWrapper p3,b p4,CommonParams p5,boolean p6,boolean p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final void run(){
       i1 tb = this.b;
       tb.m1(tb.q1(this.c, this.d, this.e, this.f, this.g, this.h), this.i);
    }
}
