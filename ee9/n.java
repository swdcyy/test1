package ee9.n;
import ee9.b;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import android.content.Intent;
import tkd.b;
import tkd.d;
import t5b.a;
import ixc.c;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import e17.s;

public class n extends b	// class@00212f
{

    public void n(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void g2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "3")) {
          return;
       }
       this.k2();
       return;
    }
    public void h2(MagicEmoji$MagicFace p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "1")) {
          return;
       }
       this.k2();
       return;
    }
    public void i2(String p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "2")) {
          return;
       }
       this.k2();
       return;
    }
    public final void k2(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       if (!d.a(0x3bf0d115).XQ()) {
          int i = (PostExperimentUtils.p())? 0x7f103129: 0x7f103126;
          s.h(a1.p(i));
       }
       return;
    }
}
