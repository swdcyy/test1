package ii9.v$b;
import com.yxcorp.gifshow.widget.m;
import ii9.v;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import bn8.a;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import java.util.Objects;
import j8c.a;
import q87.c;
import eg9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import m65.f;
import com.kwai.camerasdk.models.DisplayLayout;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import ii9.y;
import tg9.g;
import rf9.g;
import android.content.Intent;
import android.app.Activity;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import ld9.b;
import ekd.j0;
import com.yxcorp.gifshow.camera.record.photo.h;
import java.lang.Boolean;
import x8c.a;
import com.yxcorp.gifshow.camerasdk.q;
import java.lang.Float;
import n65.k;
import com.kwai.camerasdk.models.CaptureImageMode;
import com.kwai.camerasdk.a$e;
import java.lang.StringBuilder;
import w46.b;
import com.kwai.camerasdk.ErrorCode$Result;

public class v$b extends m	// class@002849
{
    public final v c;

    public void v$b(v p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       g a;
       String str;
       Object[] objArray2;
       int b;
       int b1;
       h b2;
       d uod;
       k ok;
       Object obj = this;
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, v$b.class, "1")) {
          return;
       }
       d e = obj.c.e;
       Float uFloat = null;
       if (!PatchProxy.applyVoidOneRefs(e, uFloat, ov, "21")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 1017;
          uElementPack.type = 1;
          i3 oi3 = i3.f();
          oi3.c("btn_type", Integer.valueOf(0));
          String str1 = (a.i())? "UNCHECKED": "CHECKED";
          oi3.d("status", str1);
          uElementPack.params = oi3.e();
          u1.B(new ClickMetaData().setLogPage(e).setType(true).setElementPackage(uElementPack));
       }
       v$b c = obj.c;
       if (c.C != null) {
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoid(uFloat, c, ov, "12")) {
             Object[] objArray = new Object[0];
             a.D().w("WhatsUpTakePicture", "startTakeMultiPicture", objArray);
             if (c.h != null) {
                c.i2();
                c.d.m(new a(true));
                ov = c.s;
                d h = c.h;
                CameraView cameraView = c.t.getCameraView();
                DisplayLayout displayLayou = c.t.getCameraView().getSurfaceView().getDisplayLayout();
                TakePictureSource sOURCE_UNDEF = TakePictureSource.SOURCE_UNDEFINE;
                y oy = new y(c);
                a = c.d.d(g.c).a;
                int i = c.d.d(g.b).a ^ 0x01;
                int i1 = j0.b(c.e.getIntent(), "frame_mode", b.e(c.e, c.c));
                Objects.requireNonNull(ov);
                h oh = h.class;
                if (PatchProxy.isSupport(oh)) {
                   Object[] objArray1 = new Object[9];
                   objArray1[0] = h;
                   objArray1[1] = cameraView;
                   objArray1[2] = displayLayou;
                   objArray1[3] = sOURCE_UNDEF;
                   objArray1[4] = oy;
                   objArray1[5] = Integer.valueOf(a);
                   objArray1[6] = Boolean.valueOf(i);
                   objArray1[7] = Integer.valueOf(i1);
                   objArray1[8] = Boolean.TRUE;
                   if (!PatchProxy.applyVoid(objArray1, ov, oh, "5")) {
                   }
                }else {
                }
             }
          }
       }else {
          c.n2(true);
       }
       return;
    }
}
