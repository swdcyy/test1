package bja.t;
import java.lang.Runnable;
import com.yxcorp.gifshow.postwork.PostStatus;
import r26.a;
import java.lang.Object;
import w26.c;
import java.lang.Class;
import lnc.x6;
import lnc.y6;

public final class t implements Runnable	// class@0003f4
{
    public final PostStatus b;
    public final a c;

    public void t(PostStatus p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       y6.r(c.class).w(this.b, this.c);
    }
}
