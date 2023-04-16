package bf6.h;
import java.lang.Object;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import bf6.f;
import erd.g;
import crd.b;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.rating.model.RatingEntity;
import fg5.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import java.util.HashSet;
import java.util.Set;
import hn5.n;
import hn5.m;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import android.content.SharedPreferences$Editor;
import oe6.g;
import tkd.b;
import tkd.d;
import jyb.a;
import kzc.d;
import u07.t$a;
import bf6.e;
import u07.u;
import bf6.d;
import bf6.c;
import bf6.b;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kwai.library.widget.popup.common.c;
import lnc.t3;
import java.util.Collection;
import ekd.q;
import android.os.SystemClock;
import com.kwai.framework.activitycontext.ActivityContext;
import bf6.g;
import java.lang.Runnable;
import ekd.k1;

public class h	// class@000495
{
    public final long a;
    public final long b;
    public RatingEntity c;
    public Set d;
    public Runnable e;
    public boolean f;
    public boolean g;

    public void h(){
       super();
       this.a = 2000;
       this.b = 0x493e0;
       this.f = true;
       this.g = true;
       RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(f.b);
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "4")) {
          return;
       }
       if (this.c == null) {
          RatingEntity ratingEntity = RatingEntity.class;
          String str = a.a.getString("RatingEntity", "");
          if (str != null && str != "") {
             objArray = b.a(str, ratingEntity);
          }
          this.c = objArray;
       }
       return;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, h.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return DateUtils.I(a.a.getLong("ratingShowTime", 0), System.currentTimeMillis());
    }
    public final void c(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "13")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = (p0)? "CLICK_RATING_POPUP_WINDOW_LIKE": "CLICK_RATING_POPUP_WINDOW_DISLIKE";
       uElementPack.action2 = str;
       u1.u(1, uElementPack, null);
       return;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "12")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_RATING_POPUP_WINDOW_CLOSE";
       uElementPack.name = p0;
       u1.u(1, uElementPack, null);
       return;
    }
    public void e(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "3")) {
          return;
       }
       this.a();
       oh = this.c;
       if (oh == null) {
          return;
       }
       int i = 0;
       if (p0 == 1) {
          if (oh.mActionLike != 1) {
          label_0025 :
             i = 1;
          }
       }else if(p0 == 2){
          if (oh.mActionFollow != 1) {
             goto label_0025 ;
          }
       }else if(p0 == 3){
          if (oh.mActionCollect != 1) {
             goto label_0025 ;
          }
       }else if(p0 == 4){
          if (oh.mActionPostPhoto != 1) {
             goto label_0025 ;
          }
       }else if(p0 == 5 && oh.mActionPay != 1){
          goto label_0025 ;
       }
       if (i) {
          return;
       }else if(this.d == null){
          this.d = new HashSet();
       }
       this.d.add(Integer.valueOf(p0));
       return;
    }
    public void f(boolean p0){
       this.f = p0;
    }
    public final void g(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "5")) {
          return;
       }
       GifshowActivity gifshowActiv = m.a().gB();
       if (gifshowActiv == null || (gifshowActiv.isFinishing() || (!this.b() && this.f != null))) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putLong("ratingShowTime", System.currentTimeMillis());
          g.a(uEditor);
          if (d.a(-1079301847).Tp()) {
             return;
          }else {
             d uod = new d(gifshowActiv);
             uod.V0(true);
             uod.B0(R.drawable.arg_RES_7f0809c6);
             uod.y0(R.string.arg_RES_7f10020f);
             uod.S0(R.string.arg_RES_7f101ca0);
             uod.Q0(R.string.arg_RES_7f100930);
             uod.u0(new e(this, gifshowActiv));
             uod.t0(new d(this, gifshowActiv));
             uod.s0(new c(this));
             uod.J(new b(this));
             uod.A(true);
             f.f(uod).X();
             if (!PatchProxy.applyVoid(null, this, oh, "14")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SHOW_RATING_POPUP_WINDOW";
                u1.u0(4, uElementPack, null);
             }
          }
       }
       return;
    }
    public void h(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "1")) {
          return;
       }
       boolean b = false;
       if (this.g != null) {
          this.g = b;
          return;
       }else {
          this.a();
          h obj = PatchProxy.apply(objArray, this, oh, "10");
          int i = 1;
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = this.c;
             b1 = (obj != null && (obj.mEnableDateTrigger != null && !this.b()))? true: false;
          }
          if (b1) {
             obj = PatchProxy.apply(objArray, this, oh, "11");
             if (obj != patchProxyRe) {
                b2 = obj.booleanValue();
             }else if(t3.a()){
                if (q.f(this.d)) {
                   Object obj1 = PatchProxy.apply(objArray, this, oh, "8");
                   if (obj1 != patchProxyRe) {
                      b2 = obj1.booleanValue();
                   }else {
                      long l1 = SystemClock.elapsedRealtime() - ActivityContext.g().j;
                      h tc = this.c;
                      int i1 = 0;
                      long l2 = (tc == null)? i1: tc.mForegroundDuration;
                      l2 = (!l2 - i1)? 0x493e0: l2 * 1000;
                      if (l1 - l2 > 0) {
                         b2 = true;
                      }else {
                         b2 = false;
                      }
                   }
                   if (!b2) {
                   label_0093 :
                      i = 0;
                   }
                }
             }else {
                goto label_0093 ;
             }
             b2 = i;
             if (b2) {
                if (this.e == null) {
                   this.e = new g(this);
                }
                h te = this.e;
                oh = this.c;
                if (oh != null) {
                   b = oh.mTriggerDelay;
                }
                long l = (b == null)? 2000: (long)b * 1000;
                k1.r(te, l);
             }
          }
          return;
       }
    }
}
