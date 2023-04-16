package dg9.d;
import java.lang.Runnable;
import dg9.f;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import qi9.c;
import com.yxcorp.gifshow.camerasdk.j;

public final class d implements Runnable	// class@001f30
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       boolean p0 = (tb.d.b().E9().a != null)? j.P0: j.Q0;
       tb.h2(p0);
       return;
    }
}
