package com.yxcorp.gifshow.camera.record.permission.b;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import gg9.p;
import gg9.j;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import oc9.t;
import oc9.s;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import android.view.View;
import gg9.a;
import com.yxcorp.utility.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import zb9.p0;
import zb9.p0$a;
import gg9.d;
import java.lang.Runnable;
import pi9.e;
import com.kwai.feature.post.api.util.PostPermission;
import android.content.Context;
import com.kwai.feature.post.api.util.PostPermissionUtils;
import lnc.a1;
import gg9.c;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.bubble.b;
import gg9.h;
import com.yxcorp.gifshow.bubble.b$c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import gg9.i;
import com.yxcorp.gifshow.camera.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.widget.TextView;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import wd9.a;
import com.yxcorp.gifshow.camera.record.permission.a;
import com.kwai.library.widget.popup.common.f;
import gg9.o;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import gg9.b;
import android.view.View$OnClickListener;
import gg9.g;
import sm6.b;
import gg9.f;
import gg9.e;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import zq8.a;
import lnc.i3;
import brd.t;
import gg9.m;
import erd.g;
import crd.b;
import gg9.l;
import io.reactivex.internal.functions.Functions;
import gg9.k;
import erd.a;

public class b extends d0	// class@000e9d
{
    public boolean A;
    public b B;
    public ViewStubInflater2 o;
    public ConstraintLayout p;
    public View q;
    public View r;
    public TextView s;
    public TextView t;
    public a u;
    public a v;
    public a w;
    public a x;
    public boolean y;
    public boolean z;

    public void b(CameraPageType p0,b p1){
       super(p0, p1);
       this.d.n(p.class, new j(this));
    }
    public void E1(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "4")) {
          return;
       }
       s.e(this, p0);
       Object[] objArray = new Object[0];
       a.D().w("PermissionMaskController", "onPermissionChecked:"+p0, objArray);
       this.i2();
       return;
    }
    public void d5(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       super.d5(p0);
       if (p0 == 5) {
          b tw = this.w;
          if (tw != null && tw.a().isShown()) {
             this.w.a().setTag(R.id.view_screen_top, Integer.valueOf(n.o(this.w.a())[1]));
          }
       }
       this.i2();
       return;
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, b.class, "14")) {
          return;
       }
       d tl = this.l;
       if (tl != null && this.p != null) {
          View view = tl.findViewById(R.id.button_close);
          if (view != null && view.isShown()) {
             if (this.u == null) {
                this.u = new a(view);
             }
             this.u.c(this.p);
          }
          view = this.l.findViewById(R.id.ktv_song_back);
          if (view != null && view.isShown()) {
             if (this.v == null) {
                this.v = new a(view);
             }
             this.v.c(this.p);
          }
          if (!this.d.d(p0.j.a()).c() && this.c != CameraPageType.WHATS_UP) {
             view = this.l.findViewById(R.id.album_layout);
             if (view != null && view.isShown()) {
                if (this.w == null) {
                   this.w = new a(view);
                }
                view.post(new d(this));
                if (e.e() && (!PostPermissionUtils.c(this.e, PostPermission.ALBUM) && !PostPermissionUtils.c(this.e, PostPermission.CAMERA))) {
                   e.k(view.findViewById(R.id.button_album_color_bg), a1.a(R.color.arg_RES_7f060218));
                }
             label_00c3 :
                view.post(new c(this));
             }
          }
          view = this.l.findViewById(R.id.camera_place_holder_tab_container);
          if (view != null && view.isShown()) {
             if (this.x == null) {
                this.x = new a(view);
             }
             this.x.c(this.p);
          }
       }
    label_00ee :
       return;
    }
    public final void h2(){
       if (PatchProxy.applyVoid(null, this, b.class, "22")) {
          return;
       }
       if (this.d.b().V7() == null) {
          return;
       }
       if (this.m2()) {
          this.d.b().V7().u(RecordBubbleItem.PERMISSION_MASK);
       }else if(this.y == null && (this.A == null && (this.w != null && (this.e.b3() && !PostPermissionUtils.c(this.e, PostPermission.ALBUM))))){
          RecordBubbleItem pERMISSION_M = RecordBubbleItem.PERMISSION_MASK;
          this.d.b().V7().s(pERMISSION_M);
          this.z = true;
          b uob = new b(pERMISSION_M);
          b uob1 = uob.n(this.w.a());
          uob1 = uob1.z(new h(this));
          uob1.y(BubbleInterface$Position.TOP);
          uob1 = uob1.A(R.string.arg_RES_7f103dd1);
          uob1.u(new i(this));
          this.d.b().V7().n(uob1);
          this.A = true;
       }else if(this.z == null){
          this.d.b().V7().s(RecordBubbleItem.PERMISSION_MASK);
       }
       return;
    }
    public final void i2(){
       Object[] objArray1;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "20")) {
          return;
       }
       b to = this.o;
       if (to != null && to.a() != null) {
          if (PermissionUtils.a(this.e, PostPermission.CAMERA.mName)) {
             this.s2(this.q, this.s);
             objArray1 = new Object[0];
             a.D().w("PermissionMaskController", "camera permission granted", objArray1);
          }
          if (PermissionUtils.a(this.e, PostPermission.AUDIO.mName)) {
             this.s2(this.r, this.t);
             objArray1 = new Object[0];
             a.D().w("PermissionMaskController", "audio permission granted", objArray1);
          }
          to = this.r;
          int i = (this.f2() && j0.b(this.e.getIntent(), "camera_page_source", 0) != 21)? 0: 4;
          to.setVisibility(i);
          if (this.m2() && this.o.c()) {
             if (!PatchProxy.applyVoid(objArray, this, uob, "15")) {
                uob = this.u;
                if (uob != null) {
                   uob.b();
                }
                uob = this.v;
                if (uob != null) {
                   uob.b();
                }
                uob = this.w;
                if (uob != null) {
                   uob.b();
                }
                uob = this.x;
                if (uob != null) {
                   uob.b();
                }
             }
             this.o.g(0);
             objArray = new Object[0];
             a.D().w("PermissionMaskController", "hide mask", objArray);
          }else if(!this.m2() && !this.o.c()){
             this.o.g(true);
             this.o.a().bringToFront();
             if (!PatchProxy.applyVoid(objArray, this, uob, "13")) {
                if (this.d.d(a.i).a == null) {
                   d tc = this.c;
                   if (tc != CameraPageType.WHATS_UP && tc != CameraPageType.TIE_TIE) {
                      f.G(this.o.a(), new a(this));
                   }
                }
                this.b2(new o(this));
             }
             if (!PatchProxy.applyVoid(objArray, this, uob, "23")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "RECORD_AUTH_MASK";
                u1.C0("", this.d.f(), true, uElementPack, objArray);
             }
             objArray = new Object[0];
             a.D().w("PermissionMaskController", "show mask", objArray);
          }
          this.h2();
       }
       return;
    }
    public void k(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       super.k(p0);
       int i = 0;
       String str = "PermissionMaskController";
       if (!this.m2()) {
          Object[] objArray = new Object[i];
          a.D().w(str, "onViewCreated not all permission granted", objArray);
          Object[] objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, this, uob, "11")) {
             Object[] objArray2 = new Object[i];
             a.D().w(str, "initView", objArray2);
             ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a2ff2, 0x7f0a2ff1);
             this.o = viewStubInfl;
             viewStubInfl.d(this.l);
             this.p = this.o.b(0x7f0a2ff1);
             this.q = this.o.b(0x7f0a2fed);
             this.r = this.o.b(0x7f0a2feb);
             this.s = this.o.b(0x7f0a063a);
             this.t = this.o.b(0x7f0a02ff);
             this.q.setOnClickListener(new b(this));
             this.r.setOnClickListener(new g(this));
             View view = this.o.b(R.id.bottom_guideline);
             b.x(this.o.b(R.id.top_guideline), n.A(this.e));
             View view1 = this.e.findViewById(R.id.camera_scroll_snapshot_tab_container);
             if (view1 != null) {
                objArray1 = view1.findViewById(R.id.radio_indicator_bg);
             }
             if (objArray1 != null) {
                f.G(objArray1, new f(this, objArray1, view));
             }
          }
          this.i2();
          this.h2();
          this.o.a().post(new e(this));
       }else {
          this.n2();
          Object[] objArray3 = new Object[i];
          a.D().w(str, "onViewCreated all permission granted", objArray3);
       }
       return;
    }
    public final List k2(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (j0.b(this.e.getIntent(), "camera_page_source", 0) == 21) {
          obj.add(PostPermission.CAMERA);
       }else if(this.d.d(a.i).a != null){
          obj.add(PostPermission.AUDIO);
          obj.add(PostPermission.CAMERA);
       }else if(this.f2()){
          obj.add(PostPermission.CAMERA);
          obj.add(PostPermission.AUDIO);
       }else {
          obj.add(PostPermission.CAMERA);
       }
       return obj;
    }
    public final p l2(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.apply(null, this, uob, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uob, "19");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b to = this.o;
          b = (to != null && to.c())? true: false;
       }
       return new p(b, this.m2());
    }
    public final boolean m2(){
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       Iterator iterator = this.k2().iterator();
       while (iterator.hasNext()) {
          i = i & PostPermissionUtils.c(this.e, iterator.next());
       }
       return i;
    }
    public final void n2(){
       if (PatchProxy.applyVoid(null, this, b.class, "17")) {
          return;
       }
       this.d.m(this.l2());
       return;
    }
    public final void o2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PermissionMaskController", "onPermissionChecked:"+p0, objArray);
       this.i2();
       return;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, b.class, "5")) {
          return;
       }
       s.d(this, p0, p1, p2);
       if (p0 == 6) {
          this.i2();
          this.n2();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.u = null;
       this.v = null;
       this.w = null;
       this.x = null;
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.onResume();
       if (this.y == null) {
          this.i2();
       }
       return;
    }
    public final void p2(PostPermission p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "12")) {
          return;
       }
       b = (p0 == PostPermission.CAMERA)? true: false;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "24")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ACCESS_AUTHORITY";
          i3 oi3 = i3.f();
          String str = (b)? "Camera_Permissions": "Microphone_Permissions";
          oi3.d("auth_type", str);
          uElementPack.params = oi3.e();
          u1.L("", this.d.f(), 1, uElementPack, null);
       }
       if (!PermissionUtils.a(this.e, p0.mName)) {
          this.Y1(PostPermissionUtils.d(this.e, p0).subscribe(new m(this)));
       }
       return;
    }
    public final void r2(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       this.y = true;
       this.Y1(PostPermissionUtils.e(p0, this.k2(), false).subscribe(new l(this), Functions.e, new k(this)));
       return;
    }
    public final void s2(View p0,TextView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "21")) {
          return;
       }
       p1.setTextColor(a1.a(R.color.arg_RES_7f0607c6));
       p1.setText(R.string.arg_RES_7f1046e4);
       p0.setAlpha(0.30f);
       p0.setEnabled(false);
       return;
    }
}
