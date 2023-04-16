package ai9.o;
import java.util.concurrent.Callable;
import ai9.p;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import j8c.a;
import q87.c;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.Number;
import com.yxcorp.gifshow.camera.record.base.d;
import ce9.l;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import com.kwai.video.westeros.models.EffectPerformance;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.camera.record.photo.h;
import o56.c;
import o56.a;
import android.app.Application;
import android.graphics.Bitmap;
import k2b.e0;
import android.content.Context;
import hg9.s;

public final class o implements Callable	// class@0000d7
{
    public final p b;
    public final int c;
    public final int d;

    public void o(p p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       int i;
       o oo = this;
       o b = oo.b;
       o c = oo.c;
       o d = oo.d;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p op = p.class;
       boolean b1 = false;
       if (PatchProxy.isSupport(op)) {
          File obj = PatchProxy.applyTwoRefs(Integer.valueOf(c), Integer.valueOf(d), b, op, "13");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
          label_002e :
             Object[] objArray = new Object[b1];
             String str = "RecordToPictureController";
             String str1 = "handle picture";
             a.D().w(str, str1, objArray);
             b.y = b1;
             obj = PatchProxy.apply(null, b, op, "20");
             if (obj != patchProxyRe) {
             }else {
                obj = new File(PostUtils.f(), "RECORD_TRANSFORM_PIC.jpg");
             }
             b.t = obj;
             p s = b.s;
             boolean b2 = true;
             if (s == null) {
                b.y = 2;
                PostUtils.E(str, str1, new IllegalStateException("mLastFrame is null"), b2);
             }else if(PatchProxy.isSupport(op)){
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(d), b, op, "21");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                label_0082 :
                   int i1 = i;
                   i = s.b("post_camera_burst", s, obj, i1, Integer.MAX_VALUE, c, b.h.U(p.B), b.e, a.a().a());
                   if (i) {
                      b2 = false;
                   }
                   if (!b2) {
                      b.y = i;
                      if (b.t.exists()) {
                         b.t.delete();
                      }
                   }
                   b.g2(b1);
                   b1 = b2;
                }
             }
             p q = b.q;
             p o = b.o;
             TakePictureSource b3 = p.B;
             boolean b4 = (b.d.d(l.i).a != null)? true: false;
             i = q.b(o, b3, b4, b.h, b.p.getCameraView(), Integer.MAX_VALUE, j0.b(b.e.getIntent(), "frame_mode", d));
             goto label_0082 ;
          }
       }else {
          goto label_002e ;
       }
       return Boolean.valueOf(b1);
    }
}
