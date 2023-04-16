package eob.f;
import erd.o;
import java.lang.Object;
import java.lang.Integer;
import eob.t;
import tkd.b;
import tkd.d;
import qw5.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class f implements o	// class@00278e
{
    public final boolean b;
    public final int c;

    public void f(boolean p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       f tc = this.c;
       p0 = (t.b(p0.intValue()))? d.a(0x62409668).BY(tb, tc): new PresenterV2();
       return p0;
    }
}
