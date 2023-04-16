package jd9.f;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import jd9.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import q16.a$a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import lq.i;
import lq.e;
import s16.h;
import com.kwai.sdk.switchconfig.a;
import nc9.b;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import oa0.a;
import xf6.g;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import j8c.a;
import q87.c;
import jd9.f$a;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import android.view.View;
import android.content.Intent;
import android.app.Activity;
import jd9.c;
import com.yxcorp.gifshow.widget.record.CoverVideoView;
import mc9.a;
import jd9.d;
import erd.g;
import crd.b;

public class f extends d0	// class@002a61
{
    public c o;

    public void f(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void E1(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "3")) {
          return;
       }
       if (p0) {
          this.b2(new e(this));
       }else {
          this.d.b().V7().u(RecordBubbleItem.LIP_SYNCH);
       }
       return;
    }
    public void de(a$a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "7")) {
          return;
       }
       if (this.g2()) {
          Application uApplication = 1;
          Objects.requireNonNull(p0);
          a$a uoa = a$a.class;
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Boolean.TRUE, p0, uoa, "23") != PatchProxyResult.class) {
          }else {
             p0.m1 = uApplication;
          }
          String str = a.b().getString(R.string.arg_RES_7f101cd6);
          if (i.h()) {
             str = h.a(i.m().k().l(), str);
          }
          p0.e0(str);
       }
       return;
    }
    public final boolean g2(){
       Object obj = PatchProxy.apply(null, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("autoAddLipSynchTag", true);
    }
    public final void h2(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       if (b.b(this.d)) {
          return;
       }
       if (PermissionUtils.a(this.e, "android.permission.CAMERA") && PermissionUtils.a(this.e, "android.permission.RECORD_AUDIO")) {
          if (a.G() && !g.l0()) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101cd7));
             this.d.b().V7().u(RecordBubbleItem.LIP_SYNCH);
             Object[] objArray = new Object[0];
             a.D().w("LipSynchGuideController", "LipSycnhGuideDialog dialog has show", objArray);
             return;
          }else {
             this.d.b().V7().n(new f$a(this));
          }
       }
       return;
    }
    public void k(View p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "2")) {
          return;
       }
       super.k(p0);
       if (!b.a(this.d)) {
          this.d.b().V7().s(RecordBubbleItem.LIP_SYNCH);
       }
       if (!PatchProxy.applyVoid(null, this, uof, "10")) {
          Intent intent = this.e.getIntent();
          if (intent != null && this.g2()) {
             intent.putExtra("tag", a1.p(R.string.arg_RES_7f101cd6));
          }
       }
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "5")) {
          return;
       }
       super.onPause();
       f to = this.o;
       if (to != null) {
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoid(objArray, to, c.class, "4")) {
             to.r.f();
          }
       }
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "6")) {
          return;
       }
       super.onResume();
       f to = this.o;
       if (to != null) {
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoid(objArray, to, c.class, "5")) {
             to.r.l();
          }
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.l(a.class, new d(this));
       return;
    }
}
