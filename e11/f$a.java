package e11.f$a;
import com.yxcorp.gifshow.widget.m;
import e11.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.bottombar.component.widget.d;
import androidx.lifecycle.LiveData;
import z61.b;
import j61.c;

public final class f$a extends m	// class@002088
{
    public final f c;

    public void f$a(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       d f = this.c.f;
       if (f != null) {
          b value = f.getValue();
          if (value != null) {
             value = value.mFeatureId;
             d i = this.c.i;
             if (i != null) {
                i.a(value);
             }
          }
       }
       return;
    }
}
