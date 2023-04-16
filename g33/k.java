package g33.k;
import erd.g;
import com.kuaishou.live.external.p;
import java.lang.String;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import ps5.b;
import java.lang.Object;
import os5.l;

public final class k implements g	// class@002a55
{
    public final p b;
    public final String c;
    public final RxFragmentActivity d;
    public final b e;

    public void k(p p0,String p1,RxFragmentActivity p2,b p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       this.b.n().IF(this.c, this.d, this.e);
    }
}
