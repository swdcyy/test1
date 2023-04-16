package eh9.b;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$c;
import com.yxcorp.gifshow.camera.record.tab.c;
import java.lang.Object;
import eh9.k;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eh9.u;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagManager;
import com.yxcorp.gifshow.camera.record.tab.MoodTabTagManager;

public final class b implements CameraScrollTabViewGroupV2$c	// class@002149
{
    public final c a;

    public void b(c p0){
       this.a = p0;
    }
    public void a(){
       k.c(this);
    }
    public final void b(View p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, c.class, "30")) {
       }else {
          c k = ta.k;
          if (k != null) {
             k.a(p0.getId());
          }
          k = ta.d;
          if (k != null) {
             k.c(p0.getId());
          }
          c e = ta.e;
          if (e != null) {
             e.a(p0.getId());
          }
       }
       return;
    }
    public void c(int p0){
       k.a(this, p0);
    }
    public void d(View p0){
       k.b(this, p0);
    }
}
