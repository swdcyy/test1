package ii9.v;
import com.kwai.camerasdk.videoCapture.CameraController$d;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import qi9.g1;
import com.yxcorp.gifshow.camera.record.photo.h;
import ii9.v$a;
import android.os.Looper;
import ii9.f;
import oc9.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.yxcorp.gifshow.camera.record.base.d;
import j8c.a;
import java.lang.StringBuilder;
import com.kwai.camerasdk.videoCapture.CameraController;
import q87.c;
import wc9.e;
import java.util.ArrayList;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin$SendMessagePageInfo;
import tkd.b;
import tkd.d;
import voc.m;
import oc9.w;
import com.yxcorp.gifshow.model.RectInfo;
import android.graphics.RectF;
import android.view.View;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import hi9.d;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.util.Pair;
import qvb.s;
import z36.d;
import android.content.Context;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import android.widget.TextView;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.util.rx.RxBus;
import ed9.g;
import ii9.v$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import lnc.s6;
import android.graphics.drawable.Drawable;
import lnc.a1;
import pi9.i;
import com.kwai.camerasdk.render.VideoTextureView;
import com.yxcorp.gifshow.camera.record.widget.RecordSwitchCameraView;
import ii9.v$c;
import ii9.v$d;
import ii9.j;
import bn8.a;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import ii9.n;
import com.yxcorp.gifshow.camera.bubble.b$c;
import ii9.m;
import com.yxcorp.gifshow.camera.bubble.b$b;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Handler;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import m65.f;
import eg9.a;
import com.kwai.camerasdk.models.DisplayLayout;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import ii9.v$e;
import tg9.g;
import rf9.g;
import ld9.b;
import hg9.n;
import java.io.File;
import k2b.e0;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import ii9.o;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView$a;
import e17.i;
import ii9.k;
import java.lang.Runnable;
import ii9.l;
import ii9.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import q2b.h$b;
import k2b.u1;
import ed9.b;
import ii9.q;
import erd.g;
import crd.b;
import wc9.r;
import ii9.p;

public class v extends e0 implements CameraController$d	// class@00284d
{
    public View A;
    public VideoTextureView B;
    public boolean C;
    public boolean D;
    public Bitmap E;
    public Bitmap F;
    public boolean G;
    public boolean H;
    public final Handler I;
    public final boolean q;
    public t r;
    public final h s;
    public AnimCameraView t;
    public View u;
    public View v;
    public TextImageView w;
    public RecordSwitchCameraView x;
    public View y;
    public View z;

    public void v(CameraPageType p0,b p1){
       super(p0, p1);
       boolean b = true;
       boolean b1 = (g1.i() > b)? true: false;
       this.q = b1;
       h oh = new h();
       this.s = oh;
       this.D = b;
       this.I = new v$a(this, Looper.getMainLooper());
       if (b1) {
          f uof = new f(p0, p1);
          this.r = uof;
          this.L0(uof);
       }
       oh.h(Integer.MAX_VALUE, Integer.MAX_VALUE);
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, v.class, "4")) {
          return;
       }
       super.G();
       this.H = false;
       this.G = false;
       return;
    }
    public void N(long p0,long p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, ov, "10")) {
          return;
       }
       if (this.h == null) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("WhatsUpTakePicture", "onReceivedFirstFrame, current is front:"+this.h.isFrontCamera(), objArray);
       if (this.E != null && (this.F == null && this.k2())) {
          Object[] objArray1 = new Object[i];
          a.D().w("WhatsUpTakePicture", "startTicker", objArray1);
          this.r.m2();
          this.i2();
       }
    label_0062 :
       return;
    }
    public void O(long p0){
    }
    public void g2(){
       Bitmap uBitmap = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uBitmap, v.class, "20")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "WhatsUpTakePicture";
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(uBitmap.E);
       if (!this.k2()) {
          uBitmap.F = objArray;
          objArray1 = new Object[i];
          a.D().w(str, "don\'t SupportMultiCamera", objArray1);
       }else if(uBitmap.F != null){
          objArray1 = new Object[i];
          a.D().w(str, "mSecondImage is valid", objArray1);
          uArrayList.add(uBitmap.F);
       }
       RecordPostPlugin$SendMessagePageInfo sendMessageP = j0.e(uBitmap.e.getIntent(), "key_send_message_page_info");
       b uob = d.a(0x27ab2faf);
       String taskId = uBitmap.d.b().getTaskId();
       d e = uBitmap.e;
       String str1 = (uBitmap.c == CameraPageType.WHATS_UP)? "SOCIAL_WHATS_UP_PICTURE": "SOCIAL_TIETIE_PICTURE";
       String str2 = str1;
       RectInfo rectInfo = new RectInfo(new RectF(n.B(uBitmap.t, i)), (float)d.c(), (float)d.c());
       Object[] objArray2 = (uBitmap.F == null)? objArray: new RectInfo(new RectF(n.B(uBitmap.A, i)), (float)d.f(), (float)d.h());
       boolean b = (uBitmap.C != null && uBitmap.F != null)? true: false;
       Integer integer = (sendMessageP != null)? Integer.valueOf(sendMessageP.mIconRes): objArray;
       if (sendMessageP != null) {
          objArray = sendMessageP.mTitle;
       }
       Pair pair = uob.wJ(taskId, uArrayList, e, str2, "CAMERA_SOURCE", rectInfo, objArray2, b, integer, objArray);
       s.b().c(3, pair.second, uBitmap.e, 551, pair.first);
       return;
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, v.class, "19")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("WhatsUpTakePicture", "hideCover", objArray);
       v tt = this.t;
       if (tt != null) {
          tt.b();
       }
       tt = this.w;
       if (tt != null) {
          tt.setEnabled(true);
          if (this.w.isSelected()) {
             d th = this.h;
             if (th != null && (th.M() && this.C != null)) {
                n.Y(this.A, i, i);
                tt = this.A;
                if (tt != null) {
                   tt.setAlpha(0x3f800000);
                }
             }
          }
       }
       return;
    }
    public final void i2(){
       if (PatchProxy.applyVoid(null, this, v.class, "15")) {
          return;
       }
       View[] viewArray = new View[]{this.z,this.y,this.v,this.w};
       n.Z(4, viewArray);
       RxBus.f.b(new g(0, this.e));
       return;
    }
    public void k(View p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "2")) {
          return;
       }
       super.k(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("WhatsUpTakePicture", "onViewCreated", objArray);
       this.y = p0.findViewById(0x7f0a0086);
       View view = p0.findViewById(R.id.take_picture_btn);
       this.u = view;
       view.setOnClickListener(new v$b(this));
       this.z = p0.findViewById(0x7f0a05b3);
       this.v = p0.findViewById(0x7f0a05da);
       this.w = p0.findViewById(0x7f0a2c3d);
       if (s6.m()) {
          this.w.b(a1.f(R.drawable.arg_RES_7f081894), a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d));
          i.b(this.w);
       }
       this.t = this.d.b().z7();
       int i1 = (this.q != null)? 0: 8;
       View[] viewArray = new View[]{this.v,this.w,this.l.findViewById(0x7f0a396a)};
       n.Z(i1, viewArray);
       this.A = this.l.findViewById(0x7f0a3ba3);
       this.B = this.l.findViewById(0x7f0a3ba2);
       if (this.q != null) {
          v tv = this.v;
          if (tv == null) {
          label_0144 :
             this.v = null;
             this.w = null;
          }else {
             this.x = tv.findViewById(0x7f0a05d8);
             this.A.setOnClickListener(new v$c(this));
             this.w.setOnClickListener(new v$d(this));
             this.l.findViewById(R.id.sub_camera_close_btn).setOnClickListener(new j(this));
             this.w.setSelected((a.j() ^ 1));
             if (!PatchProxy.applyVoid(null, this, ov, "23")) {
                b uob = new b(RecordBubbleItem.WHATS_UP_MULTI_CAMERA).n(this.w);
                uob.y(BubbleInterface$Position.LEFT);
                uob.s(R.layout.arg_RES_7f0d0144);
                uob = uob.A(R.string.arg_RES_7f100605);
                uob.v(n.a);
                uob.u(new m(this));
                this.d.b().V7().n(uob);
             }
          }
       }else {
          goto label_0144 ;
       }
       return;
    }
    public boolean k2(){
       boolean b;
       v obj = PatchProxy.apply(null, this, v.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.q != null) {
          obj = this.w;
          if (obj == null || obj.isSelected()) {
             b = true;
          label_0025 :
             return b;
          }
       }
       b = false;
       goto label_0025 ;
    }
    public final void l2(){
       if (PatchProxy.applyVoid(null, this, v.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "openCameraAndHideCoverAfterCameraDraw", objArray);
       this.H = false;
       this.G = false;
       this.d.b().p6();
       this.I.removeMessages(1);
       this.I.sendEmptyMessageDelayed(1, 0x2710);
       return;
    }
    public void m2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v.class, "14")) {
          return;
       }
       this.E = objArray;
       this.F = objArray;
       View[] viewArray = new View[]{this.z,this.y,this.v,this.w};
       int i = 0;
       n.Z(i, viewArray);
       v tw = this.w;
       if (tw != null) {
          tw.setEnabled(1);
       }
       this.t.b();
       this.t.getCameraView().getSurfaceView().resume();
       this.d.m(new a(i));
       RxBus.f.b(new g(1, this.e));
       return;
    }
    public void n2(boolean p0){
       Object obj = this;
       boolean b = p0;
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), obj, ov, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "startTakePicture firstImage:"+b, objArray);
       if (!b) {
          obj.t.getCameraView().getSurfaceView().pause();
       }
       ov = obj.w;
       if (ov != null) {
          ov.setEnabled(0);
       }
       obj.s.j(obj.h, obj.t.getCameraView(), obj.t.getCameraView().getSurfaceView().getDisplayLayout(), TakePictureSource.SOURCE_UNDEFINE, new v$e(obj, b), null, false, obj.d.d(g.c).a, (obj.d.d(g.b).a ^ 0x01), j0.b(obj.e.getIntent(), "frame_mode", b.e(obj.e, obj.c)), obj.e, true);
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "9")) {
          return;
       }
       super.nb(p0);
       this.h.j(this);
       return;
    }
    public void o2(){
       if (PatchProxy.applyVoid(null, this, v.class, "17")) {
          return;
       }
       v tw = this.w;
       if (tw != null && this.h != null) {
          int i = tw.isSelected() ^ 0x01;
          int i1 = 0;
          Object[] objArray = new Object[i1];
          a.D().w("WhatsUpTakePicture", "switchMultiMode "+i, objArray);
          this.w.setSelected(i);
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("whats_up_multi_camera_off", (i ^ 0x01));
          g.a(uEditor);
          if (!i) {
             n.Y(this.A, 4, i1);
          }
          if (d.a()) {
             Object[] objArray1 = new Object[i1];
             a.D().w("WhatsUpTakePicture", "enableMultiCamera", objArray1);
             this.w.setEnabled(i1);
             if (this.h.M()) {
                objArray1 = new Object[i1];
                a.D().w("WhatsUpTakePicture", "blurLastFrame", objArray1);
                this.t.a(this.h, new o(this));
             }else {
                this.l2();
             }
          }
          i = (i)? 0x7f1036ee: 0x7f1036ed;
          i.a(R.style.arg_RES_7f11066a, i);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, v.class, "11")) {
          return;
       }
       super.onDestroy();
       this.s.g();
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "onDestroy", objArray);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, v.class, "8")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "onDestroyView", objArray);
       v tB = this.B;
       if (tB != null) {
          tB.release();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, v.class, "6")) {
          return;
       }
       super.onPause();
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "onPause", objArray);
       this.E = null;
       this.F = null;
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, v.class, "5")) {
          return;
       }
       super.onResume();
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "onResume reset", objArray);
       this.m2();
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, v.class, "7")) {
          return;
       }
       super.onStop();
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "onStop", objArray);
       this.I.removeMessages(1);
       return;
    }
    public void w(){
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "3")) {
          return;
       }
       super.w();
       d th = this.h;
       if (th == null) {
          return;
       }
       this.C = th.isMultiCamera();
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "WhatsUpTakePicture";
       a.D().w(str, "onCameraOpened isMultiCamera:"+this.C, objArray1);
       if (this.C != null && this.k2()) {
          objArray1 = new Object[i];
          a.D().w(str, "show SubCameraView", objArray1);
          this.A.setVisibility(i);
          if (!this.I.hasMessages(1)) {
             this.A.setAlpha(0x3f800000);
          }else {
             this.A.setAlpha(0);
          }
       }else {
          this.A.setVisibility(4);
       }
       if (this.C == null || this.B == null) {
          objArray1 = new Object[i];
          a.D().w(str, "setSurfaceView", objArray1);
          this.h.U0(this.t.getCameraView().getSurfaceView());
          if (d.a()) {
             this.t.getCameraView().getSurfaceView().setOnCameraFirstFrameRenderedCallback(new u(this));
          }
       }else {
          objArray1 = new Object[i];
          a.D().w(str, "setMultiSurfaceView", objArray1);
          this.h.J0(this.t.getCameraView().getSurfaceView(), this.B);
          this.t.getCameraView().getSurfaceView().setOnCameraFirstFrameRenderedCallback(new k(this));
          this.B.setOnCameraFirstFrameRenderedCallback(new l(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "22")) {
          d te = this.e;
          if (te != null && this.D != null) {
             this.D = i;
             RecordPostPlugin$SendMessagePageInfo sendMessageP = j0.e(te.getIntent(), "key_send_message_page_info");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             i3 oi3 = i3.f();
             String str1 = (this.C != null)? "1": "0";
             oi3.d("is_true_biphoto", str1);
             if (sendMessageP != null && !TextUtils.x(sendMessageP.mLogSource)) {
                oi3.d("source", sendMessageP.mLogSource);
             }
             uElementPack.params = oi3.e();
             h$b uob = h$b.e(4, "BIPHOTO_STATUS");
             uob.k(uElementPack);
             u1.p0("", this.e, uob);
          }
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       super.w1(p0);
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "onCreate", objArray);
       this.d.l(b.class, new q(this));
       this.d.l(r.class, new p(this));
       return;
    }
}
