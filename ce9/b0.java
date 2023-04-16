package ce9.b0;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m4b.c;

public final class b0 implements g	// class@0005b7
{
    public final l b;

    public void b0(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "23")) {
       }else {
          tb.p.P(p0);
       }
       return;
    }
}
