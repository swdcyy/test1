package com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView$b;
import ya1.u$b;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lv1.h;

public class LiveGzoneActivityPendantView$b implements u$b	// class@000c31
{
    public final LiveGzoneActivityPendantView a;

    public void LiveGzoneActivityPendantView$b(LiveGzoneActivityPendantView p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneActivityPendantView$b.class, "1")) {
          return;
       }
       LiveGzoneActivityPendantView$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, LiveGzoneActivityPendantView.class, "9")) {
          LiveGzoneActivityPendantView e = ta.e;
          if (e != null) {
             e.hide();
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneActivityPendantView$b.class, "2")) {
          return;
       }
       LiveGzoneActivityPendantView$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, LiveGzoneActivityPendantView.class, "8")) {
          LiveGzoneActivityPendantView e = ta.e;
          if (e != null) {
             e.show();
          }
          ta.b = null;
       }
       return;
    }
}
