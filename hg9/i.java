package hg9.i;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.e;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;

public final class i implements g	// class@002662
{
    public final e b;

    public void i(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "8")) {
       }else if(p0.b != tb.c || (PanelShowEvent.a(tb.e, p0) && (p0.c == PanelShowEvent$PanelType.MAGIC && p0.a == null))){
          tb.A = false;
          tb.n2();
       }
       return;
    }
}
