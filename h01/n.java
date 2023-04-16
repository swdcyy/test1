package h01.n;
import java.lang.Runnable;
import h01.o;
import lm1.i;
import com.yxcorp.gifshow.models.Gift;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import h01.j;

public final class n implements Runnable	// class@0025f0
{
    public final o b;
    public final i c;
    public final int d;
    public final Gift e;
    public final UserInfo f;
    public final boolean g;

    public void n(o p0,i p1,int p2,Gift p3,UserInfo p4,boolean p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       this.b.G.d(this.c, this.d, this.e, this.f, (this.g ^ 0x01), false);
    }
}
