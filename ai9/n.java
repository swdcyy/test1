package ai9.n;
import erd.g;
import ai9.p;
import q16.a$a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import lnc.a1;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.io.File;
import com.yxcorp.gifshow.camera.record.photo.h;
import va9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.photo.p;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import q16.a;
import lq.i;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k36.c;
import gd9.a;
import k36.f;
import xf6.g;
import tkd.b;
import tkd.d;
import voc.m;
import java.util.List;
import java.util.Collections;
import android.content.Intent;
import r16.a;
import android.content.Context;
import r16.d;
import qvb.s;
import z36.d;
import w46.b;

public final class n implements g	// class@0000d6
{
    public final p b;
    public final a$a c;
    public final int d;

    public void n(p p0,a$a p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       Object[] objArray3;
       Intent intent;
       n on = this;
       n b = on.b;
       n c = on.c;
       n d = on.d;
       Objects.requireNonNull(b);
       boolean b1 = (p0.booleanValue() && a1.i(b.e))? true: false;
       Boolean uBoolean = Boolean.valueOf(b1);
       Object[] objArray = new Object[0];
       String str = "RecordToPictureController";
       a.D().w(str, "handle picture finished.  Successfully?  "+uBoolean, objArray);
       boolean b2 = uBoolean.booleanValue();
       p op = p.class;
       if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidThreeRefs(c, Boolean.valueOf(b2), Integer.valueOf(d), b, p.class, "14")) {
          p t = b.t;
          String str1 = "[photo]";
          if (t != null && (t.exists() && b2)) {
             b.q.f();
             Object[] objArray1 = new Object[]{str1,"record to picture capture success"};
             a.b(objArray1);
             p.a(b.d);
             if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(d), b, op, "17")) {
                Object[] objArray2 = new Object[0];
                a.D().w(str, "startEditPage", objArray2);
                if (b.u == null) {
                   b.g2(1);
                }
                t = b.u;
                a uoa = null;
                b.u = uoa;
                p v = b.v;
                b.v = uoa;
                if (!a1.i(b.e)) {
                   objArray3 = new Object[0];
                   a.D().w(str, "startEditPage activity is not available, editPageParam: "+t, objArray3);
                }else {
                   p.q(v, b.t, t, str);
                   p.n();
                   if (!PatchProxy.applyVoid(uoa, b, op, "22")) {
                      if (i.h()) {
                         i.m().i();
                      }else {
                         ExceptionHandler.handleCaughtException(new Throwable("take pic post session is null"));
                         i.V();
                      }
                   }
                   p.r(t, b.s, d, b.e);
                   c.d().g(a.d(3, v));
                   if (g.n1() && (b.s != null && b.e != null)) {
                      objArray = new Object[0];
                      a.D().w(str, "buildBitmapsEditIntent, bitmap:"+b.s, objArray);
                      intent = d.a(0x27ab2faf).pA(t, Collections.singletonList(b.s), b.e, "CAMERA_SOURCE");
                   }else {
                      intent = d.a(0x14d6f666).NX(b.e, t);
                   }
                   intent.putExtra("EDIT_PHOTO_ENTRANCE_TYPE", "video_trans");
                   s.b().c(3, t, b.e, 551, intent);
                }
             }
          }else {
             objArray3 = new Object[0];
             a.D().t(str, "onCaptureFailed", objArray3);
             if (!PatchProxy.applyVoidOneRefs(c, b, op, "15")) {
                objArray3 = new Object[]{str1};
                a.a("record to picture capture failed "+b.y, objArray3);
                s.b().c(0, c.f(), b.e, 291, null);
             }
          }
          b.x = false;
       }
       return;
    }
}
