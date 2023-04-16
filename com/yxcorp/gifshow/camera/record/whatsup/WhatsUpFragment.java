package com.yxcorp.gifshow.camera.record.whatsup.WhatsUpFragment;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import com.yxcorp.gifshow.camera.record.video.RecordFragment;
import qi9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import ii9.i$a;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import hi9.d;
import bn8.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister;
import hi9.a;
import z1.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.camera.record.screen.b;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import fg9.c;
import com.yxcorp.gifshow.camera.record.frame.c;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import com.yxcorp.gifshow.camera.record.photo.i;
import lnc.s6;
import com.yxcorp.gifshow.camera.record.permission.b;
import ii9.e;
import ii9.i;
import ii9.g;
import ii9.a;
import ii9.v;
import ii9.b0;
import com.yxcorp.gifshow.camera.record.tab.e;
import hi9.c;
import hi9.b;
import com.yxcorp.gifshow.video.api.camera.CameraResolutionParameters;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import ld9.b;
import java.lang.Math;
import android.os.Bundle;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.o;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ui9.j;
import com.yxcorp.gifshow.camerasdk.j;
import ui9.f$c;
import xi9.j;
import ui9.f$b;
import xi9.f;
import xi9.r;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import xi9.n;

public class WhatsUpFragment extends CameraFragment	// class@000fa4
{
    public static final int i1;

    public void WhatsUpFragment(){
       super();
       this.B = 5;
    }
    public c E9(){
       c obj = PatchProxy.apply(null, this, WhatsUpFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.E9();
       obj.a = this.y.d(i$a.b).a;
       obj.v(StabilityType.DISABLED);
       obj.t0 = d.a();
       int i = 0;
       boolean b = (d.a() && !a.j())? true: false;
       obj.s0 = b;
       Object[] objArray = new Object[i];
       a.D().w("CameraBaseFragment", "getOpenCameraParameter mAllowMultiCamera:"+obj.s0+" front:"+obj.a, objArray);
       return obj;
    }
    public boolean a4(){
       return true;
    }
    public List ch(){
       ArrayList obj = PatchProxy.apply(null, this, WhatsUpFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "buildControllers", objArray);
       RecordPModuleRegister.f().c("PRETTIFY", new a(this));
       obj = new ArrayList();
       obj.add(new b(this.lh(), this.y));
       obj.add(new c(this.lh(), this.y));
       obj.add(new c(this.lh(), this.y, CameraFramePageType.RECORD));
       obj.add(new i(this.lh(), this.y));
       if (s6.x()) {
          obj.add(new b(this.lh(), this.y));
       }
       obj.add(new e(this.lh(), this.y));
       obj.add(new i(this.lh(), this.y));
       obj.add(new g(this.lh(), this.y));
       if (this.lh() != CameraPageType.WHATS_UP) {
          obj.add(new a(this.lh(), this.y));
       }
       obj.add(new v(this.lh(), this.y));
       obj.add(new b0(this.lh(), this.y));
       obj.add(new e(this.lh(), this.y));
       RecordPModuleRegister.f().c("PRETTIFY", new c(this, obj));
       RecordPModuleRegister.f().c("PRETTIFY", new b(this));
       return obj;
    }
    public int getPage(){
       return 0;
    }
    public CameraResolutionParameters kh(){
       CameraResolutionParameters obj = PatchProxy.apply(null, this, WhatsUpFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CameraResolutionParameters();
       if (TextUtils.x(this.z)) {
          this.z = u1.f();
       }
       obj.mTaskId = this.z;
       CameraPageConfig uCameraPageC = this.jh();
       int[] ointArray = b.a(uCameraPageC, 2);
       int i = 0;
       if (ointArray[i] > 0) {
          int i1 = 1;
          if (ointArray[i1] > 0) {
             obj.mPreviewWidth = ointArray[i];
             obj.mPreviewHeight = ointArray[i1];
             obj.mPreviewMaxSize = Math.max(ointArray[i], ointArray[i1]);
          label_0059 :
             Object[] objArray = new Object[i];
             a.D().w("CameraBaseFragment", "getCameraResolutionParameters w:"+obj.mPreviewWidth+" h:"+obj.mPreviewHeight, objArray);
             return obj;
          }
       }
       obj.mPreviewWidth = uCameraPageC.mPreviewWidth;
       obj.mPreviewHeight = uCameraPageC.mPreviewHeight;
       obj.mPreviewMaxSize = uCameraPageC.mPreviewMaxEdgeSize;
       goto label_0059 ;
    }
    public CameraPageType lh(){
       return CameraPageType.WHATS_UP;
    }
    public String o(){
       return "WHATSUP_RECORD_CAMERA";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WhatsUpFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       a.D().w("CameraBaseFragment", "onCreate", objArray);
       this.V7().s(RecordBubbleItem.WHATS_UP_MULTI_CAMERA);
       this.d5(5);
       RxBus f = RxBus.f;
       String str = (this.lh() == CameraPageType.WHATS_UP)? "SOCIAL_WHATS_UP_PICTURE": "SOCIAL_TIETIE_PICTURE";
       f.b(new o(str));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, WhatsUpFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d170b, p1, false);
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, WhatsUpFragment.class, "6")) {
          return;
       }
       super.w();
       this.q.q().r0(null);
       this.q.q().d0(null);
       this.q.q().s0(null, false, false);
       this.q.q().j(null, null);
       return;
    }
}
