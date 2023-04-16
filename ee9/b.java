package ee9.b;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import lnc.n4;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public abstract class b extends e0	// class@002123
{
    public boolean q;

    public void b(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public abstract void g2(String p0);
    public abstract void h2(MagicEmoji$MagicFace p0,Intent p1);
    public abstract void i2(String p0,Intent p1);
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.w1(p0);
       d te = this.e;
       te = (te == null)? null: te.getIntent();
       if (this.q == null && te != null) {
          this.q = true;
          MagicEmoji$MagicFace magicFace = n4.i(te);
          if (magicFace != null) {
             this.h2(magicFace, te);
             return;
          }else {
             String str = n4.j(te);
             if (!TextUtils.x(str)) {
                this.i2(str, te);
                return;
             }
          }
       }
       String str1 = n4.g(te);
       if (!TextUtils.x(str1)) {
          this.g2(str1);
       }
       return;
    }
}
