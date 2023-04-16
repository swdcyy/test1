package com.yxcorp.gifshow.camera.record.album.o;
import oc9.q;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.utility.AbiUtil;
import com.yxcorp.gifshow.camera.record.album.o$a;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import sb9.h;
import java.lang.Class;
import erd.g;
import crd.b;
import sb9.z;
import sb9.x;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import com.yxcorp.gifshow.camera.record.album.c;
import com.yxcorp.gifshow.camera.record.album.g;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.ax2c.PreLoader;
import tkd.b;
import tkd.d;
import ra0.d;
import android.widget.ImageView;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.s6;
import android.view.View;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.widget.PressedImageView;
import com.yxcorp.gifshow.camera.record.widget.PieChartProgress;
import android.view.ViewStub;
import sb9.f;
import android.view.View$OnClickListener;
import android.widget.TextView;
import pi9.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import pi9.i;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.camera.record.album.k;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.record.album.l;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.models.QMedia;
import android.view.ViewParent;
import android.view.ViewGroup;
import g56.a;
import ekd.k1;
import sb9.p;
import android.os.MessageQueue;
import android.os.Looper;
import oc9.m;
import android.os.MessageQueue$IdleHandler;
import sb9.l0;
import kuaishou.perf.page.impl.d;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.kuaishou.ax2c.PreloadParam$Builder;
import o56.a;
import android.content.Context;
import lnc.w;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import com.kuaishou.ax2c.PreloadParam;
import com.yxcorp.gifshow.camera.record.album.RecordAlbumActivity;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import hd9.n;
import com.yxcorp.gifshow.util.PostUtils;
import sb9.s;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.fragment.ObservableBox;
import sb9.n;
import com.yxcorp.gifshow.camera.record.album.i;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.yxcorp.gifshow.activity.GifshowActivity;
import xnc.a;
import android.os.SystemClock;
import qi9.b;
import com.yxcorp.gifshow.c0;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.view.ViewGroup$LayoutParams;
import pm6.l;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import zb9.p0;
import zb9.p0$a;
import f16.a;
import oc9.w;
import com.yxcorp.gifshow.camera.record.photo.event.TakePictureEvent;
import sb9.l;
import sb9.i;
import uc9.b;
import sb9.j;
import java.lang.Float;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequest;
import ub.b;
import android.content.res.Resources;
import ekd.r;
import com.yxcorp.utility.n;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.AlbumTabArrayArg;
import com.kuaishou.android.post.PostPageArg;
import o79.a;
import vc9.a;
import vc9.a$a;
import sb9.g;
import n3d.a;

public class o extends q	// class@001cbf
{
    public boolean A;
    public boolean B;
    public final boolean C;
    public b D;
    public Runnable E;
    public final m F;
    public View p;
    public PressedImageView q;
    public View r;
    public ImageView s;
    public View t;
    public PieChartProgress u;
    public ViewStub v;
    public c w;
    public Animation x;
    public ImageRequest y;
    public String z;

    public void o(CameraPageType p0,b p1){
       super(p0, p1);
       this.B = true;
       this.C = AbiUtil.b();
       this.F = new o$a(this);
       this.d.l(PanelShowEvent.class, new h(this));
       this.d.n(z.class, new x(this));
    }
    public static void f2(o p0){
       p0.s2();
       p0.Y1(t.timer(500, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new c(p0), g.b));
    }
    public static void g2(){
       if (PatchProxy.applyVoid(null, null, o.class, "41")) {
          return;
       }
       PreLoader.getInstance().clear(new int[6]{R.layout.ksa_list_item_album_img_video,0x7f0d12cb,R.layout.ksa_photo_picker_v4,0x7f0d06db,R.layout.ksa_photo_pick_img_fragment,0x7f0d06da});
       d.a(0x1bf6ff1d).Mf();
       return;
    }
    private void s2(){
       if (PatchProxy.applyVoid(null, this, o.class, "6")) {
          return;
       }
       if (this.s != null) {
          int i = this.h2();
          if (i != 1) {
             if (i != 2) {
                this.s.setImageResource(R.drawable.arg_RES_7f081bd6);
             }else {
                this.s.setImageResource(R.drawable.arg_RES_7f081bd8);
             }
          }else {
             this.s.setImageResource(R.drawable.arg_RES_7f081bd7);
          }
       }
       return;
    }
    public static void u2(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, oo, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = (p0)? "SHOW_FIRST_INTELLIGENCE_ALBUM_BUBBLE": "SHOW_NEW_INTELLIGENCE_ALBUM_BUBBLE";
       uElementPack.action2 = str;
       u1.u0(7, uElementPack, null);
       return;
    }
    public int h2(){
       d obj = PatchProxy.apply(null, this, o.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       if (obj == CameraPageType.WHATS_UP || obj == CameraPageType.TIE_TIE) {
          return s6.m();
       }
       return s6.w();
    }
    public int i2(){
       Object obj = PatchProxy.apply(null, this, o.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return s6.y();
    }
    public void k(View p0){
       o ts;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       super.k(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("AlbumController", "onViewCreated", objArray);
       View view = p0.findViewById(R.id.album_layout);
       this.t = view;
       boolean b = true;
       if (view == null) {
          this.A = b;
          return;
       }else {
          this.p = p0.findViewById(0x7f0a05ab);
          this.q = p0.findViewById(0x7f0a05a9);
          this.s = p0.findViewById(0x7f0a05ac);
          this.u = p0.findViewById(0x7f0a309d);
          this.v = p0.findViewById(0x7f0a309e);
          this.r = p0.findViewById(0x7f0a05aa);
          this.t.setOnClickListener(new f(this));
          TextView textView = p0.findViewById(R.id.button_album_tv);
          if (this.m2()) {
             d tc = this.c;
             if (tc != CameraPageType.TIE_TIE && tc != CameraPageType.WHATS_UP) {
                this.t2(this.q, i);
                e.j(this.r);
                e.h(textView);
                e.i(this.t, p0.findViewById(R.id.action_bar_layout));
             }
          }
          if (s6.m()) {
             View[] viewArray = new View[]{this.q,this.s};
             i.a(textView, viewArray);
             this.q.setPlaceHolderImage(R.drawable.arg_RES_7f081bd5);
             ts = this.s;
             if (ts != null) {
                ts.bringToFront();
             }
             this.s2();
          }
          if (this.A != null) {
             this.t.setVisibility(8);
             return;
          }else {
             this.b2(new k(this));
             ts = this.w;
             if (ts != null) {
                ts.s(RecordBubbleItem.ALBUM_AGGREGATION);
                this.b2(new l(this));
             }
             if (this.e.getIntent() != null) {
                String str = j0.f(this.e.getIntent(), "KEY_LAST_IMAGE_PATH");
                if (!TextUtils.x(str) && new File(str).exists()) {
                   Object[] objArray1 = new Object[i];
                   a.D().w("AlbumController", "mLatestAlbumImagePath:"+str, objArray1);
                   this.v2(str);
                }
             }
             return;
          }
       }
    }
    public int k2(){
       Object obj = PatchProxy.apply(null, this, o.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 2;
       d te = this.e;
       if (te != null && te.getIntent() != null) {
          int[] intArrayExtr = this.e.getIntent().getIntArrayExtra("album_tab_list");
          if (intArrayExtr != null && intArrayExtr.length == 1) {
             i = intArrayExtr[0];
          }
       }
       return i;
    }
    public void l2(QMedia p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "22")) {
          return;
       }
       CharSequence uCharSequenc = (p0 == null)? null: p0.path;
       if (!TextUtils.n(this.z, uCharSequenc)) {
          this.z = uCharSequenc;
          this.y2();
       }
       return;
    }
    public boolean m2(){
       Object obj = PatchProxy.apply(null, this, o.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.e();
    }
    public final boolean n2(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       ViewGroup parent = p0.getParent();
       boolean b = (parent != null && parent.isShown())? true: false;
       return b;
    }
    public final boolean o2(){
       Object obj = PatchProxy.apply(null, this, o.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.A != null || this.a2())? true: false;
       return b;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       super.onDestroy();
       a.c().b();
       o.g2();
       o tE = this.E;
       if (tE != null) {
          k1.m(tE);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       super.onResume();
       if (this.o2()) {
          return;
       }
       p op = new p(this);
       if (!PatchProxy.applyVoidOneRefs(op, this, d.class, "8")) {
          Looper.myQueue().addIdleHandler(new m(op));
       }
       return;
    }
    public void p2(l0 p0){
       boolean b;
       n on;
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "13")) {
          return;
       }
       if (this.e == null) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("AlbumController", "openAlbum", objArray);
       d.d("postAlbumMonitor").n();
       d.d("postAlbumMonitor").g("clickToLoadData");
       PageMonitor.INSTANCE.onInit(AlbumFragment.class);
       if (this.B == null) {
          this.r2();
       }
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, this, oo, "14")) {
          int i1 = 0x7f0d06f4;
          PreLoader.getInstance().preload(new PreloadParam$Builder(a.B).addLayoutId(i1).setRepeatCount(40).setInflateListener(new w(i1)).setUseMutableContext(true).build());
       }
       Intent intent = new Intent(this.e, RecordAlbumActivity.class);
       intent.putExtra("ALBUM_BIZ_CODE", "post_camera_album");
       if (p0 != null && !q.f(p0.a)) {
          SerializableHook.putExtra(intent, "album_selected_data", new ArrayList(p0.a));
          intent.putExtra("single_select", i);
       }
       if (p0 != null) {
          p0 = p0.b;
          if (p0 != null) {
             intent.putExtra("albumDirectToPreviewPath", p0.path);
          }
       }
       p0 = PatchProxy.apply(objArray1, this, oo, "17");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else {
          on = this.d.d(n.j);
          b = (on.a != null && on.g != null)? true: false;
       }
       if (b) {
          if (!PatchProxy.applyVoidOneRefs(intent, this, oo, "18")) {
             on = this.d.d(n.j);
             String absolutePath = new File(PostUtils.n(), "followshoot_audio.mp4").getAbsolutePath();
             n on1 = new n(this, absolutePath, intent, on);
             this.Y1(ObservableBox.a(t.fromCallable(new s(on.b, on, absolutePath)).subscribeOn(d.c).observeOn(d.a)).subscribe(on1, i.b));
          }
       }else if(j0.e(this.e.getIntent(), "TakePictureType") == TakePictureType.LIVE_AVATAR){
          this.e.finish();
       }else {
          Intent intent1 = this.e.getIntent();
          if (a.b(intent1, intent, "fromCameraToAlbum")) {
             intent.putExtra("start_activity_time", SystemClock.uptimeMillis());
             intent.putExtra("albumEnablePreviewNextStep", true);
             a.a(intent1, intent, i);
          }
          this.z2(intent);
       }
       return;
    }
    public void r2(){
       if (PatchProxy.applyVoid(null, this, o.class, "12")) {
          return;
       }
       if (this.C != null && !b.a()) {
          Object[] objArray = new Object[0];
          a.D().w("AlbumController", "preloadAlbum", objArray);
          c0 uoc0 = new c0();
          if (PermissionUtils.a(this.e, "android.permission.WRITE_EXTERNAL_STORAGE")) {
             uoc0.g(4);
          }
          uoc0.e().run();
          a.c().d(uoc0.d());
       }
       return;
    }
    public void t2(PressedImageView p0,boolean p1){
       int i;
       float j1;
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oo, "27")) {
          return;
       }
       if (p0 != null && this.m2()) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          if (p1) {
             i = l.a();
          }else {
             i = l.b();
             p0.setImageDrawable(a1.f(R.drawable.arg_RES_7f081ca0));
          }
          layoutParams.width = i;
          layoutParams.height = i;
          p0.setLayoutParams(layoutParams);
          p0$a j = p0.j;
          if (this.d.d(j.a()).e() || this.d.d(j.a()).b()) {
             if (p1) {
                j1 = e.j;
                p0.setScaleX(j1);
                p0.setScaleY(j1);
             }else {
                j1 = e.h;
                p0.setScaleX(j1);
                p0.setScaleY(j1);
             }
          }
       }
    label_0076 :
       return;
    }
    public void v2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "29")) {
          return;
       }
       this.z = p0;
       this.y2();
       return;
    }
    public void w1(Intent p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       super.w1(p0);
       d te = this.e;
       if (te != null) {
          b = true;
          if (j0.a(te.getIntent(), "show_album", b) && d.a(0x13cfc0fa).isAvailable()) {
             b = false;
          }
          this.A = b;
       }
       if (this.A == null) {
          this.w = this.d.b().V7();
          this.d.l(TakePictureEvent.class, new l(this));
          this.d.l(l0.class, new i(this));
          this.d.l(b.class, new j(this));
       }
       return;
    }
    public final void w2(float p0,float p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, oo, "25")) {
          return;
       }
       this.r.setVisibility(8);
       this.q.getHierarchy().L(e.a(p0, p1));
       this.t2(this.q, true);
       return;
    }
    public void y2(){
       int i1;
       int i3;
       RoundingParams roundingPara;
       o tq;
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "26")) {
          return;
       }
       if (this.A != null) {
          return;
       }
       int i = 0;
       if (!TextUtils.x(this.z) && new File(this.z).exists()) {
          Uri uri = w0.c(new File(this.z));
          if (this.m2()) {
             i1 = l.a();
          }else if(s6.m()){
             i1 = 0x7f070313;
          }else {
             i1 = 0x7f07008e;
          }
          i1 = a1.d(i1);
          int i2 = i1;
          o ty = this.y;
          this.y = (ty != null)? this.q.h0(uri, i2, i2, ty): this.q.C(uri, i2, i2, true, null);
          this.q.setPlaceHolderImage(objArray);
          if (this.e.getIntent() != null) {
             this.e.getIntent().putExtra("KEY_LAST_IMAGE_PATH", this.z);
          }
          i1 = this.i2();
          boolean b = true;
          if (i1 != b) {
             i3 = 0x7f08048c;
             int i4 = 0x40400000;
             int i5 = 8;
             if (i1 != 2) {
                int i6 = 3;
                if (i1 != i6) {
                   if (this.h2() == i6) {
                      roundingPara = new RoundingParams();
                      roundingPara.q(b);
                      roundingPara.p((float)a1.e(5.50f));
                      this.q.getHierarchy().L(roundingPara);
                      oo = this.q;
                      oo.setBackground(oo.getResources().getDrawable(R.drawable.arg_RES_7f081bd9));
                      this.s.setVisibility(i5);
                      return;
                   }else {
                      this.s.setVisibility(i);
                      float f = 0x3f800000;
                      float f1 = 13.00f;
                      if (this.p == null) {
                         roundingPara = RoundingParams.c((float)a1.e(f));
                         roundingPara.j(r.b(this.q.getContext(), 0x106000b), (float)a1.e(2.00f));
                         this.q.getHierarchy().L(roundingPara);
                         this.q.setPadding(a1.e(f1), a1.e(8.50f), a1.e(6.00f), a1.e(8.50f));
                      }else if(this.h2() == b){
                         this.q.getHierarchy().L(RoundingParams.c((float)a1.e(f)));
                         this.q.setPadding(a1.e(12.00f), a1.e(6.00f), a1.e(i4), a1.e(6.00f));
                      }else if(this.h2() == 2){
                         this.q.getHierarchy().L(RoundingParams.c((float)a1.e(f)));
                         this.q.setPadding(a1.e(8.50f), a1.e(0x40f00000), a1.e(8.50f), a1.e(0x40f00000));
                      }else {
                         this.q.getHierarchy().L(RoundingParams.c((float)a1.e(f)));
                         this.q.setPadding(a1.e(f1), a1.e(8.50f), a1.e(6.00f), a1.e(8.50f));
                      }
                   }
                }else {
                   this.w2(2.70f, 0x3fc00000);
                   tq = this.q;
                   tq.setBackground(tq.getResources().getDrawable(i3));
                   this.s.setVisibility(i5);
                   return;
                }
             }else {
                this.w2(i4, 0x3fe66666);
                tq = this.q;
                tq.setBackground(tq.getResources().getDrawable(i3));
                this.s.setVisibility(i5);
                return;
             }
          }else if(PatchProxy.applyVoid(objArray, this, oo, "24")){
             roundingPara = new RoundingParams();
             roundingPara.q(b);
             this.q.getHierarchy().L(roundingPara);
             this.t2(this.q, b);
          }
          return;
       }else {
          this.q.getHierarchy().L(objArray);
          if (this.m2()) {
             this.t2(this.q, i);
             return;
          }else {
             i3 = a1.e(0);
             n.Y(this.s, 4, i);
             if (s6.m()) {
                this.q.setImageResource(R.drawable.arg_RES_7f081bd5);
                this.q.setPlaceHolderImage(objArray);
             }else {
                this.q.setImageResource(R.drawable.arg_RES_7f081bd4);
             }
             this.q.setPadding(i3, i3, i3, i3);
          }
       }
       return;
    }
    public final void z2(Intent p0){
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "15")) {
          return;
       }
       int[] ointArray = PatchProxy.apply(null, this, oo, "19");
       boolean b = false;
       if (ointArray != PatchProxyResult.class) {
       }else {
          ointArray = i.g().getAlbumTab().get();
          if (ointArray == null) {
             ointArray = new int[b];
          }
       }
       if (!ointArray.length) {
          p0.putExtra("album_tab_list", a.a);
          p0.putExtra("default_select_tab", 2);
       }else {
          p0.putExtra("album_tab_list", ointArray);
          p0.putExtra("default_select_tab", ointArray[b]);
       }
       p0.putExtra("album_entrance_type", "click_photo_picker");
       p0.putExtra("vb_has_pl_key", true);
       this.B = b;
       p0.putExtra("SUPPORT_CLASSIFY", this.d.d(a.f.a()).d);
       this.e.t1(p0, 4195, new g(this));
       this.e.overridePendingTransition(R.anim.arg_RES_7f010017, 0x7f010032);
       return;
    }
}
