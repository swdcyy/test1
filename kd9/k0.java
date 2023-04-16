package kd9.k0;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.frame.k;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.frame.l;
import android.view.View;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import com.yxcorp.gifshow.camera.record.base.d;
import nd9.d0;
import com.yxcorp.gifshow.camera.record.base.b;

public final class k0 implements Runnable	// class@002c59
{
    public final k b;
    public final boolean c;

    public void k0(k p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       k0 tb = this.b;
       k0 tc = this.c;
       if (tb.b.z.n1() != null) {
          tb.b.z.n1().setClickable((tc ^ 0x01));
       }
       d d = tb.b.d;
       int i = tc ^ 0x01;
       long l = (tc != null)? 300: 250;
       d.m(new d0(i, l));
       return;
    }
}
