package com.kwai.live.gzone.accompanyplay.anchor.e0$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.e0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import com.kwai.library.widget.popup.common.c;

public class e0$a implements g	// class@000b04
{
    public final e0 b;

    public void e0$a(e0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$a.class, "1")) {
       }else {
          p0 = this.b.r;
          if (p0 != null && p0.isAdded()) {
             p0 = this.b.r;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, LiveGzoneAnchorAccompanyFleetStateFragment.class, "12")) {
                LiveGzoneAnchorAccompanyFleetStateFragment q = p0.Q;
                if (q != null) {
                   q.o();
                   p0.Q = null;
                }
             }
          }
       }
       return;
    }
}
