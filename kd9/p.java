package kd9.p;
import erd.g;
import com.yxcorp.gifshow.camera.record.frame.c;
import java.lang.Object;
import j4b.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.frame.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import q5b.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.PassThroughParams;
import java.util.List;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import ld9.b;
import j8c.a;
import q87.c;

public final class p implements g	// class@002c64
{
    public final c b;

    public void p(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n a;
       boolean b;
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "10")) {
       }else {
          c u = tb.u;
          int i = 0;
          if (u != null) {
             l ol = l.class;
             if (!PatchProxy.applyVoidOneRefs(p0, u, ol, "8")) {
                a = p0.a;
                if (a == null) {
                   u.w = i;
                   u.l2(1);
                }else if(!l.a(a)){
                   u.w = true;
                   u.l2(i);
                }else {
                   Object obj = PatchProxy.applyOneRefs(a, u, ol, "9");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else if(a.mPassThroughParams.mPreviewScales.size() <= 1 && (!a.mPassThroughParams.mPreviewScales.contains(Integer.valueOf(i)) && (!u.z.o1() || !a.mPassThroughParams.mPreviewScales.contains(Integer.valueOf(1))))){
                      b = true;
                   }else {
                      b = false;
                   }
                   u.w = b;
                   u.l2((b ^ 1));
                }
             }
          }
          p0 = p0.a;
          if (p0 != null) {
             if (!l.a(p0)) {
                tb.i2(b.e(tb.e, tb.c));
             }else if(!l.b(tb.z, p0)){
                Object[] objArray = new Object[i];
                a.D().s("FrameBaseController", "handleMagicFaceSelectedEvent, frameMode is not support magicFace", objArray);
                int i1 = b.e(tb.e, tb.c);
                if (i1 == 4 || (i1 == 5 && l.b(i1, p0))) {
                   tb.i2(i1);
                }else {
                   tb.i2(1);
                }
             }
          }
       }
       return;
    }
}
