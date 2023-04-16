package gh9.f$c;
import java.lang.Runnable;
import android.view.ViewGroup;
import gh9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import yh9.j;
import com.yxcorp.gifshow.camera.record.base.b;

public final class f$c implements Runnable	// class@002496
{
    public final ViewGroup b;
    public final f c;

    public void f$c(ViewGroup p0,f p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, f$c.class, "1")) {
          return;
       }
       this.c.r = (int)this.b.getTranslationY();
       f$c tc = this.c;
       boolean b = (tc.d.d(j.i).c == null && !this.c.a2())? true: false;
       tc.k2(b, false);
       PatchProxy.onMethodExit(f$c.class, "1");
       return;
    }
}
