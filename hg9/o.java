package hg9.o;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.f;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import android.view.View;

public final class o implements g	// class@00266e
{
    public final f b;

    public void o(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "2")) {
       }else if(p0.b != tb.c || !PanelShowEvent.a(tb.e, p0)){
          f n = tb.n;
          if (n != null) {
             int i = (p0.a != null)? 4: 0;
             n.setVisibility(i);
          }
       }
       return;
    }
}
