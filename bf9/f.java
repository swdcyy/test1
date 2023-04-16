package bf9.f;
import erd.g;
import bf9.h;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import w3b.p;
import com.yxcorp.gifshow.camera.record.video.w;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import i4b.g;
import com.yxcorp.gifshow.camera.record.magic.e;
import com.yxcorp.gifshow.camera.record.magic.l;
import hka.l;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.Map;
import hc9.e;

public final class f implements g	// class@000490
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       l g;
       f tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oh, "13")) {
       }else if(p0 != null){
          h s = tb.s;
          if (s != null && !s.getVisibility()) {
             MagicEmoji$MagicFace magicFace = p.b().c(tb.r.k2());
             if (magicFace != null && !magicFace.mChecksum - p0.mChecksum) {
                i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f104b09), 3000);
             }else {
                tb.h2(p0);
                i = g.q(p0);
                h r = tb.r;
                Objects.requireNonNull(r);
                if (!PatchProxy.applyVoid(null, r, e.class, "22")) {
                   e r1 = r.r;
                   Objects.requireNonNull(r1);
                   if (!PatchProxy.applyVoid(null, r1, l.class, "9")) {
                      g = r1.g;
                      if (g instanceof l) {
                         g.a();
                      }
                   }
                }
                if (magicFace != null) {
                   SimpleMagicFace mId = magicFace.mId;
                   if (mId != null) {
                      g.a.remove(mId);
                   }
                }
                if (i || magicFace == null) {
                   if (!PatchProxy.applyVoid(null, tb, oh, "15")) {
                      tb.x.k(true);
                      if (!PatchProxy.applyVoid(null, tb, oh, "19") && tb.w != null) {
                         tb.w = false;
                         tb.g2();
                      }
                   }
                }else {
                   tb.r.r2(p0);
                }
             }
          }
       }
       return;
    }
}
