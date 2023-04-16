package com.kuaishou.live.core.show.redpacket.container.f$b;
import xq5.c;
import com.kuaishou.live.core.show.redpacket.container.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import xq5.b;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class f$b implements c	// class@000e74
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void P(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$b.class, "2")) {
          return;
       }
       f k = this.b.K;
       if (k != null) {
          Objects.requireNonNull(k);
          if (!PatchProxy.applyVoid(objArray, k, LiveRichCardCoreManager.class, "4")) {
             b.P(LiveRichCardStateManager.h.f().appendTag(k.a), "[onPageHide]");
             k.u();
          }
       }
       x.E(this.b.v);
       this.b.Y8();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$b.class, "1")) {
          return;
       }
       f k = this.b.K;
       if (k != null) {
          Objects.requireNonNull(k);
          if (!PatchProxy.applyVoid(objArray, k, LiveRichCardCoreManager.class, "3")) {
             b.S(LiveRichCardStateManager.h.f().appendTag(k.a), "[onPageShow]", "hasInit", Boolean.valueOf(k.s));
             k.n();
          }
       }
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
