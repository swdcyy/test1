package com.yxcorp.gifshow.ad.webview.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k59.f1;
import r59.e;
import r59.e$a;
import com.yxcorp.gifshow.ad.webview.n$a;
import com.yxcorp.gifshow.ad.webview.n$b;
import java.lang.String;
import com.kwai.framework.activitycontext.ActivityContext;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import k59.g1;
import erd.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import r59.d;
import k59.h2;
import yx.j0;
import android.view.ViewParent;
import android.view.View;
import i2b.a;
import android.widget.RelativeLayout$LayoutParams;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import k59.j1;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import im8.f;
import java.lang.Runnable;
import ekd.k1;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.ad.webview.m;
import lnc.g;
import k59.h1;
import k59.i1;
import n49.s;
import r59.c;

public class n extends PresenterV2	// class@00190e
{
    public final m1 A;
    public BaseFeed p;
    public f q;
    public h2 r;
    public String s;
    public long t;
    public long u;
    public Intent v;
    public View w;
    public final e$a x;
    public final e y;
    public final Runnable z;

    public void n(){
       super();
       f1 uof1 = new f1(this);
       this.x = uof1;
       this.y = new e(uof1);
       this.z = new n$a(this);
       this.A = new n$b(this);
    }
    public static void P8(n p0,String p1){
       p0.W8(p1);
    }
    private void W8(String p0){
       if (!ActivityContext.g().h()) {
          i0.a().e(803, this.p).q("deeplink", p0).d(new g1(p0)).a();
       }
       return;
    }
    public void E8(){
       boolean b;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "2")) {
          return;
       }
       if (this.getContext() != null && this.getActivity() != null) {
          n obj = PatchProxy.apply(objArray, this, on, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.r;
             b = (obj != null && obj.a() != null)? true: false;
          }
          if (b) {
             this.V8();
             if (this.v == null) {
                Object[] objArray1 = new Object[0];
                j0.f("AdWebViewDelayDPPresenter", "intent is null", objArray1);
                return;
             }else if(PatchProxy.applyVoid(objArray, this, on, "7")){
                on = this.w;
                if (on == null || on.getParent() == null) {
                   this.w = a.a(this.getContext(), 0x7f0d0095);
                   RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
                   layoutParams.setMargins(0, 0, 0, n.c(a.b(), 85.00f));
                   layoutParams.addRule(14, -1);
                   layoutParams.addRule(12, -1);
                   this.w.setLayoutParams(layoutParams);
                   this.w.findViewById(R.id.close_icon).setOnClickListener(new j1(this));
                   this.w.setVisibility(0);
                   if (this.m8() instanceof RelativeLayout) {
                      this.m8().addView(this.w);
                   }
                }
             }
             this.Z8();
             on = this.q;
             if (on != null) {
                on.set(this.A);
             }
          }
       }
    label_00c5 :
       return;
    }
    public void J8(){
       n on = n.class;
       if (PatchProxy.applyVoid(null, this, on, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, on, "11")) {
          this.R8();
          on = this.q;
          if (on != null) {
             on.set(null);
          }
          if (this.m8() instanceof RelativeLayout) {
             this.m8().removeView(this.w);
          }
          this.y.b = null;
       }
       return;
    }
    public void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "10")) {
          return;
       }
       this.v = objArray;
       k1.m(this.z);
       n tw = this.w;
       if (tw != null) {
          tw.setVisibility(8);
       }
       return;
    }
    public final Intent S8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Uri uri = x0.f(p0);
       if (uri != null) {
          return b.a(0x66dce92a).c(this.getActivity(), uri, true, true);
       }
       Object[] objArray = new Object[0];
       j0.f("AdWebViewDelayDPPresenter", "uri is null", objArray);
       return null;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       PlcEntryStyleInfo plcEntryStyl = new QPhoto(this.p).getPlcEntryStyleInfo();
       if (plcEntryStyl != null) {
          plcEntryStyl = plcEntryStyl.mAdData;
          if (plcEntryStyl != null) {
             PlcEntryStyleInfo$AdData mH5DelayAppL = plcEntryStyl.mH5DelayAppLink;
             this.s = mH5DelayAppL;
             this.t = plcEntryStyl.mH5DelayAppLinkMs;
             if (TextUtils.x(mH5DelayAppL)) {
                return;
             }else {
                this.v = this.S8(this.s);
             }
          }
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, n.class, "8")) {
          return;
       }
       i0.a().e(141, this.p).d(m.b).a();
       return;
    }
    public void Y8(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "12")) {
          return;
       }
       n tp = this.p;
       if (tp != null) {
          g.b(tp, "2", p0);
          i0.a().e(386, this.p).q("deeplink", p0).d(new h1(p1, p0)).a();
          k1.r(new i1(this, p0), s.h());
       }
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       n tr = this.r;
       if (tr == null) {
          return;
       }
       d uod = tr.a();
       if (uod != null && !uod.l(this.y)) {
          this.y.i();
          uod.k(this.y);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.p = this.s8(BaseFeed.class);
       this.r = this.s8(h2.class);
       this.q = this.w8("WEB_VISIBLE_CHANGED_LISTENER");
       return;
    }
}
