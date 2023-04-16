package ii9.y;
import com.kwai.camerasdk.a$e;
import ii9.v;
import java.lang.Object;
import com.kwai.camerasdk.ErrorCode$Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import w46.b;
import ii9.x;
import java.lang.Runnable;
import ekd.k1;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import com.yxcorp.gifshow.camera.record.base.d;
import ii9.i$a;
import com.yxcorp.gifshow.camera.record.base.b;
import ii9.w;

public class y implements a$e	// class@002850
{
    public final v a;

    public void y(v p0){
       this.a = p0;
       super();
    }
    public void a(ErrorCode$Result p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("WhatsUpTakePicture", "拍多张 onCaptureImageError "+p0.getName(), objArray);
       k1.o(new x(this, p0));
       return;
    }
    public void c(Bitmap p0,Bitmap p1,ExifInterface p2){
       Object[] objArray1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, y.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().t("WhatsUpTakePicture", "拍多张 didFinishCaptureMultiImages", objArray);
       y ta = this.a;
       if (ta.h == null) {
          return;
       }
       if (ta.d.d(i$a.b).a != null) {
          objArray1 = new Object[i];
          a.D().t("WhatsUpTakePicture", "大图是前置", objArray1);
          ta = this.a;
          ta.E = p0;
          ta.F = p1;
       }else {
          objArray1 = new Object[i];
          a.D().t("WhatsUpTakePicture", "大图是后置", objArray1);
          ta = this.a;
          ta.E = p1;
          ta.F = p0;
       }
       k1.o(new w(this));
       return;
    }
    public void d(Bitmap p0,ExifInterface p1){
    }
}
