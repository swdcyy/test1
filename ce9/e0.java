package ce9.e0;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.Object;
import j4b.f;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import m4b.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import s5b.b;
import q87.c;
import k4b.a;
import tkd.b;
import tkd.d;
import uyb.c;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public final class e0 implements g	// class@0005bd
{
    public final l b;

    public void e0(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "29")) {
       }else {
          Activity activity = tb.p.getActivity();
          Object[] obj = PatchProxy.applyTwoRefs(activity, p0, null, f.class, "1");
          int i = 0;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(activity != null && (p0 == null || (p0.b == null || activity.hashCode() == p0.b))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             obj = new Object[i];
             b.D().w("MagicHandler", "handleMagicFaceApplyEvent", obj);
             if (!tb.p.I0() || (!tb.p.G0() && p0.a == null)) {
                d.a(-314635782).Di(tb.n.b(), p0.a);
             }
             tb.o(p0.a);
          }
       }
       return;
    }
}
