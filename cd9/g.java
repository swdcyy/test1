package cd9.g;
import erd.g;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;

public final class g implements g	// class@0005a6
{
    public final DuetLayoutManager b;

    public void g(DuetLayoutManager p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, DuetLayoutManager.class, "5")) {
       }else if(PanelShowEvent.a(tb.e, p0) && (p0.a != null && (tb.c == p0.b && p0.c != PanelShowEvent$PanelType.SAME_FRAME_LAYOUT_PANEL))){
          tb.m2(false, true);
       }
       return;
    }
}
