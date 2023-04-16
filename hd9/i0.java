package hd9.i0;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.followshoot.e;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import com.yxcorp.gifshow.camera.record.followshoot.f$f;
import com.yxcorp.gifshow.camera.record.followshoot.f;

public final class i0 implements Runnable	// class@002614
{
    public final e b;

    public void i0(e p0){
       this.b = p0;
    }
    public final void run(){
       d w = this.b.a.w;
       if (w != null) {
          w.a(null);
       }
       return;
    }
}
