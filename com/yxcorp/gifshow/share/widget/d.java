package com.yxcorp.gifshow.share.widget.d;
import djc.k;
import lnc.a1;
import lnc.e2;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;
import crd.a;
import djc.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ew5.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collections;
import com.yxcorp.gifshow.share.widget.a;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import im8.c;
import java.lang.Integer;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kf5.x;
import com.yxcorp.gifshow.share.widget.BottomSheetFixedDialog;
import crd.b;
import lnc.b9;
import android.view.Window;
import android.app.Dialog;
import djc.b;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;
import mhc.e2;
import djc.h;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import ric.b;
import tkd.b;
import tkd.d;
import dw5.a;
import bw5.u;
import java.util.ArrayList;
import android.os.Bundle;
import i2b.a;
import android.view.ViewTreeObserver;
import djc.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import g9c.d;
import com.yxcorp.gifshow.share.widget.d$d;
import xv5.c;
import yv5.a;
import com.google.android.material.bottomsheet.a;
import com.kwai.feature.api.social.message.imshare.model.IMShareRecoRequest;
import java.lang.System;
import brd.a0;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import djc.d;
import erd.a;
import djc.f;
import djc.g;
import erd.g;
import android.app.Activity;
import djc.i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yxcorp.gifshow.share.widget.d$a;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import djc.e;
import brd.t;
import rkd.b;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import mhc.j2;
import com.yxcorp.gifshow.share.widget.c;
import com.yxcorp.gifshow.share.widget.b;
import lnc.i5;
import org.greenrobot.eventbus.a;
import djc.l1;

public abstract class d extends k	// class@001d23
{
    public int A;
    public boolean B;
    public List C;
    public d$d D;
    public View E;
    public d F;
    public final Runnable G;
    public View m;
    public View n;
    public CustomRecyclerView o;
    public QPhoto p;
    public ClientContent$LiveStreamPackage q;
    public PublishSubject r;
    public final a s;
    public PresenterV2 t;
    public boolean u;
    public View v;
    public String w;
    public boolean x;
    public BottomSheetBehavior y;
    public String z;
    public static final int H;
    public static final int I;
    public static int J;

    static {
       double d;
       double d1;
       d.H = a1.d(0x7f0702ef);
       d.I = a1.d(0x7f0702c5);
       if (e2.c()) {
          d = (double)n.u(a.b());
          d1 = 0x3fe3c6a7ef9db22d;
       }else {
          d = (double)n.u(a.b());
          d1 = 0x3fe0000000000000;
       }
       d.J = (int)(d * d1);
    }
    public void d(Context p0,QPhoto p1,String p2,String p3){
       super(p0);
       this.r = PublishSubject.g();
       this.s = new a();
       this.w = "";
       this.B = true;
       this.G = new c(this);
       this.p = p1;
       this.q = a.a(p1);
       this.w = p2;
       this.z = p3;
    }
    public final void A(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       if (!this.u()) {
          p0 = Collections.emptyList();
       }
       this.C = p0;
       p0 = q.g(p0, a.a);
       this.D.W0(p0);
       this.D.k0();
       int i = p0.size();
       this.A = i;
       d tt = this.t;
       if (tt != null) {
          Object[] objArray = new Object[]{this.p,this.r,this.z,new c("TARGET_SIZE", Integer.valueOf(i))};
          tt.i(objArray);
       }
       return;
    }
    public boolean B(){
       return this instanceof x;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       super.dismiss();
       b9.a(this.s);
       if (this.u == null) {
          this.w();
          this.u = true;
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "16")) {
          return;
       }
       int i = n.u(a.b()) - n.A(this.l);
       Window window = this.getWindow();
       if (!i) {
          i = -1;
       }
       window.setLayout(-1, i);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, d.class, "21")) {
          return;
       }
       m1.a(this.m, new b(this), R.id.slide_play_comment_expand_icon_view);
       return;
    }
    public void j(e2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       if (0x7f0a05d2 != p0.a()) {
          k1.o(new h(this));
       }
       return;
    }
    public final boolean k(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.E != null && (QCurrentUser.me().isLogined() && this.u()))? true: false;
       return b;
    }
    public int l(){
       return 0x7f0d0272;
    }
    public PresenterV2 m(){
       Object obj = PatchProxy.applyWithListener(null, this, d.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(d.class, "23");
       return new b();
    }
    public abstract int n();
    public List o(){
       ArrayList uArrayList;
       List obj = PatchProxy.apply(null, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0x7904f115;
       obj = (this.B())? d.a(i).AI(): d.a(i).hS(this.s());
       if (obj == null) {
          uArrayList = new ArrayList(0);
       }
       return uArrayList;
    }
    public void onCreate(Bundle p0){
       int i;
       String str2;
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       g og = 3;
       String str = "DOWNLOAD_PANEL";
       if (!PatchProxy.applyVoid(objArray, this, d.class, "11")) {
          this.m = a.a(this.getContext(), this.q());
          this.n = a.a(this.getContext(), this.n());
          this.E = this.m.findViewById(0x7f0a16e4);
          if (this.k()) {
             this.n.getViewTreeObserver().addOnGlobalLayoutListener(new j(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, d.class, "12")) {
             CustomRecyclerView uCustomRecyc = this.m.findViewById(R.id.recycler_view);
             this.o = uCustomRecyc;
             uCustomRecyc.getItemAnimator().K(0);
             this.t();
             this.o.setLayoutManager(new LinearLayoutManager(this.getContext(), 1, 0));
             d to = this.o;
             d uod = PatchProxy.apply(objArray, this, d.class, "13");
             if (uod != PatchProxyResult.class) {
             }else if(this.k()){
                this.C = new ArrayList(0);
             }else if(this.u()){
                list = this.o();
             }else {
                list = new ArrayList(0);
             }
             this.C = list;
             d$d uod1 = this.p(this.C, this.p, this.r, this.w, this.z);
             this.D = uod1;
             uod1.W0(uod1.w);
             this.A = this.C.size();
             uod = new d(this.D);
             this.F = uod;
             uod.P0(this.n);
             boolean b = c.d();
             if (this.u() && (QCurrentUser.me().isLogined() && b)) {
                View view1 = a.a(this.m.getContext(), this.l());
                this.F.L0(view1);
                PresenterV2 presenterV2 = this.m();
                this.t = presenterV2;
                presenterV2.f(view1);
                Object[] objArray1 = new Object[]{this.p,this.r,this.z,new c("TARGET_SIZE", Integer.valueOf(this.A))};
                this.t.i(objArray1);
             }
          label_0144 :
             if (!b) {
                if ("NEGATIVE_PANEL".equals(this.z)) {
                   str2 = "NEGATIVE_PANEL";
                }else if(str.equals(this.z)){
                   str2 = str;
                }else {
                   str2 = objArray;
                }
                if (str2 != null && !PatchProxy.applyVoidOneRefs(str2, objArray, a.class, "2")) {
                   a.b(str2, objArray, 2, objArray);
                }
             }
          label_016b :
             uod = this.F;
             to.setAdapter(uod);
          }
          this.setContentView(this.m);
          View view = this.getWindow().findViewById(R.id.design_bottom_sheet);
          this.v = view;
          view.setBackgroundResource(0x106000d);
          this.getWindow().clearFlags(2);
       }
       if (!PatchProxy.applyVoid(objArray, this, d.class, "3") && this.k()) {
          this.E.setVisibility(0);
          if ("NEGATIVE_PANEL".equals(this.z)) {
             i = 2;
          }else if(str.equals(this.z)){
             i = 3;
          }else {
             i = 0;
          }
          String str1 = String.valueOf(System.currentTimeMillis());
          int i1 = (this.p.isLiveStream())? 2: 1;
          IMShareRecoRequest iMShareRecoR = new IMShareRecoRequest(str1, i1, this.p.getPhotoId(), this.p.getUserId(), i);
          this.s.c(d.a(0x7904f115).Ai("NEGATIVE_PANEL".equals(this.z)).U(500, TimeUnit.MILLISECONDS).G(d.a).n(new d(this)).R(new f(this), new g(this)));
       }
       this.y();
       this.g();
       this.i();
       this.z();
       return;
    }
    public d$d p(List p0,QPhoto p1,PublishSubject p2,String p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(d.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, d.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       d$d uod = new d$d(p0, p1, p2, p3, p4);
       return obj;
    }
    public int q(){
       return 0x7f0d0318;
    }
    public abstract int r();
    public int s(){
       return 0;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       if (this.l.isFinishing()) {
          return;
       }
       super.show();
       this.m.post(new i(this));
       this.y.setState(3);
       this.y.setBottomSheetCallback(new d$a(this));
       this.s.c(this.r.subscribe(new e(this)));
       this.x();
       return;
    }
    public void t(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "18")) {
          return;
       }
       if (b.g() && !PatchProxy.applyVoid(objArray, this, d.class, "17")) {
          d.J = (int)((double)n.u(a.b()) * 0x3fe0000000000000);
       }
       this.o.setMaxHeight((d.J - d.H));
       return;
    }
    public boolean u(){
       Object obj = PatchProxy.apply(null, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.p.isPublic();
    }
    public void v(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "22")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = TextUtils.k(p0);
       i3 oi3 = i3.f();
       oi3.d("source", TextUtils.k(this.w));
       uElementPack.params = oi3.e();
       d tp = this.p;
       QPhoto mEntity = (tp != null)? tp.mEntity: null;
       j2.f(1, "DOWNLOAD_SHARE_POPUP", uElementPack, mEntity);
       return;
    }
    public void w(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, d.class, "25") && (this.B() && !this.k())) {
          d.a(0x7904f115).Ai(objArray).R(c.b, b.b);
       }
    label_0037 :
       k1.m(this.G);
       i5.j(this.l.getWindow(), 0xff000000);
       d tt = this.t;
       if (tt != null && tt.R1()) {
          this.t.destroy();
          this.t = objArray;
       }
       a.d().k(new l1(false));
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       k1.r(this.G, 200);
       a.d().k(new l1(true));
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, d.class, "19")) {
          return;
       }
       this.y = BottomSheetBehavior.from(this.v);
       return;
    }
    public abstract void z();
}
