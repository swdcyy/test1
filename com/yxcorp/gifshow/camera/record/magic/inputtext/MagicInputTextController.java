package com.yxcorp.gifshow.camera.record.magic.inputtext.MagicInputTextController;
import t4b.a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicInputTextRequestWithConfigListener;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicInputTextController$a;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import t4b.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import j8c.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import q87.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import t4b.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.WishMagicInfo;
import t4b.k;
import ce9.l;
import java.lang.CharSequence;
import t4b.e;
import ui9.j;
import com.yxcorp.gifshow.camerasdk.q;
import elb.k;
import xi9.n;
import java.util.Map;
import ekd.q;
import android.view.View;
import je9.a;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicInputTextController$onViewCreated$1;
import te9.a;
import msd.l;
import erd.g;
import crd.b;
import java.util.Objects;
import lnc.p3;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.video.westeros.models.TriggerInputTextConfig;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicInputTextController$b;
import java.lang.Runnable;
import ekd.k1;
import android.content.Intent;

public final class MagicInputTextController extends d implements a, FaceMagicController$FaceMagicInputTextRequestWithConfigListener	// class@000e3a
{
    public final f n;
    public static final MagicInputTextController$a o;

    static {
       MagicInputTextController.o = new MagicInputTextController$a(null);
    }
    public void MagicInputTextController(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       GifshowActivity gifshowActiv = p1.a();
       a.m(gifshowActiv);
       a.o(gifshowActiv, "callerContext.activity!!");
       this.n = new f(this, gifshowActiv);
    }
    public void B1(int p0,String p1,MagicEmoji$MagicFace p2){
       if (PatchProxy.isSupport(MagicInputTextController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, MagicInputTextController.class, "10")) {
          return;
       }
       a uoa = a.D();
       String str = " , ";
       StringBuilder str1 = "onUsePresetText : "+p0+str+p1+str;
       SimpleMagicFace mId = (p2 != null)? p2.mId: null;
       Object[] objArray = new Object[0];
       uoa.w("MagicInputTextController", str1+mId, objArray);
       this.f2(p0, p1, p2);
       return;
    }
    public void C1(int p0,String p1,MagicEmoji$MagicFace p2){
       if (PatchProxy.isSupport(MagicInputTextController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, MagicInputTextController.class, "8")) {
          return;
       }
       a uoa = a.D();
       String str = " , ";
       StringBuilder str1 = "onConfirmInput : "+p0+str+p1+str;
       SimpleMagicFace mId = (p2 != null)? p2.mId: null;
       Object[] objArray = new Object[0];
       uoa.w("MagicInputTextController", str1+mId, objArray);
       this.f2(p0, p1, p2);
       return;
    }
    public void H0(){
       if (PatchProxy.applyVoid(null, this, MagicInputTextController.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MagicInputTextController", "onInputHide", objArray);
       RxBus.f.b(new i(0));
       return;
    }
    public boolean J0(){
       Object obj = PatchProxy.apply(null, this, MagicInputTextController.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d.c(WishMagicInfo.class) == null && this.d.c(k.class) == null)? true: false;
       return b;
    }
    public void S0(int p0,String p1,MagicEmoji$MagicFace p2){
       if (PatchProxy.isSupport(MagicInputTextController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, MagicInputTextController.class, "9")) {
          return;
       }
       a uoa = a.D();
       String str = " , ";
       StringBuilder str1 = "onCancel : "+p0+str+p1+str;
       SimpleMagicFace mId = (p2 != null)? p2.mId: null;
       Object[] objArray = new Object[0];
       uoa.w("MagicInputTextController", str1+mId, objArray);
       this.f2(p0, p1, p2);
       return;
    }
    public final void f2(int p0,String p1,MagicEmoji$MagicFace p2){
       if (PatchProxy.isSupport(MagicInputTextController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, MagicInputTextController.class, "15")) {
          return;
       }
       if (p2 != null && (a.g(this.d.d(l.i).a, p2) && this.h != null)) {
          d uod = 1;
          SimpleMagicFace simpleMagicF = (p1 == null || !p1.length())? 1: null;
          if (!simpleMagicF) {
             simpleMagicF = p2.mId;
             if (simpleMagicF != null && simpleMagicF.length()) {
                uod = null;
             }
             if (!uod) {
                SimpleMagicFace mId = p2.mId;
                a.o(mId, "magicFace.mId");
                this.d.m(new e(mId, p1, p0, false));
             }
             d th = this.h;
             a.o(th, "mCameraHelper");
             j oj = th.q();
             if (oj != null) {
                oj.f0(new k(p1, p0));
             }
          }
       }
    label_0076 :
       return;
    }
    public Map g0(){
       d obj = PatchProxy.apply(null, this, MagicInputTextController.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj != null) {
          a.o(obj, "mImageHelper");
          if (!q.h(obj.g0())) {
             obj = this.g;
             a.o(obj, "mImageHelper");
             return obj.g0();
          }
       }
       return null;
    }
    public void i0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicInputTextController.class, "7")) {
          return;
       }
       a.p(p0, "text");
       Object[] objArray = new Object[0];
       a.D().w("MagicInputTextController", "onTextUpdate : "+p0, objArray);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicInputTextController.class, "2")) {
          return;
       }
       super.k(p0);
       this.Y1(this.d.l(a.class, new a(new MagicInputTextController$onViewCreated$1(this))));
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicInputTextController.class, "3")) {
          return;
       }
       a.p(p0, "camera");
       super.nb(p0);
       j oj = p0.q();
       if (oj != null) {
          oj.k0(this);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MagicInputTextController.class, "14")) {
          return;
       }
       super.onDestroy();
       MagicInputTextController tn = this.n;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoid(null, tn, f.class, "2")) {
          Object[] objArray = new Object[0];
          p3.D().w("MagicInputTextHandler", "hideEditText", objArray);
          f b = tn.b;
          if (b != null) {
             b.dismiss();
          }
          tn.c = null;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MagicInputTextController.class, "4")) {
          return;
       }
       super.onDestroyView();
       d th = this.h;
       if (th != null) {
          j oj = th.q();
          if (oj != null) {
             oj.k0(null);
          }
       }
       return;
    }
    public void onInputTextRequestWithConfig(int p0,String p1,TriggerInputTextConfig p2){
       if (PatchProxy.isSupport(MagicInputTextController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, MagicInputTextController.class, "13")) {
          return;
       }
       k1.o(new MagicInputTextController$b(this, p2, p1, p0));
       return;
    }
    public void u1(){
       if (PatchProxy.applyVoid(null, this, MagicInputTextController.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MagicInputTextController", "onInputShow", objArray);
       RxBus.f.b(new i(true));
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicInputTextController.class, "1")) {
          return;
       }
       super.w1(p0);
       return;
    }
}
