package hg9.e0;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.m;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import oc9.d0;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import com.yxcorp.utility.n;

public final class e0 implements g	// class@002656
{
    public final m b;

    public void e0(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, m.class, "14")) {
       }else if(p0.b != tb.c || (!PanelShowEvent.a(tb.e, p0) || tb.f2())){
          p0 = p0.c;
          int i = 1;
          int i1 = (p0 == PanelShowEvent$PanelType.PRETTIFY || p0 == PanelShowEvent$PanelType.MAGIC)? 1: 0;
          if (p0 == PanelShowEvent$PanelType.STYLE || (p0 == PanelShowEvent$PanelType.MAKEUP || (p0 == PanelShowEvent$PanelType.FILTER || (p0 != PanelShowEvent$PanelType.BODY_SLIMMING && p0 != PanelShowEvent$PanelType.BEAUTIFY)))) {
             i = 0;
          }
       label_0050 :
          if (p0 != PanelShowEvent$PanelType.MORE_OPTION) {
             if (!tb.d.b().x2()) {
                n.Y(tb.v, 4, false);
                if (!i1 && !i) {
                   tb.s.setVisibility(4);
                }
             }else {
                n.Y(tb.v, false, false);
                tb.s.setVisibility(false);
             }
          }
       }
    label_007a :
       return;
    }
}
