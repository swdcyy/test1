package com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPluginImpl;
import ayb.c;
import java.lang.Object;
import com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPluginImpl$mCoroutineDispatcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ftd.r1;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPluginImpl$initConfig$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qna.h;
import java.lang.Boolean;
import com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPluginImpl$isHitFeedFreeTraffic$1;
import qe6.b;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import ekd.r0;
import wh5.c;
import wh5.a;
import kotlin.Result;
import sna.a;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import vma.a;
import android.app.Activity;
import qna.g;
import tb7.b;
import com.yxcorp.gifshow.growth.freetraffic.model.FreeTrafficFeedContent;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.growth.freetraffic.FreeTrafficDialogManager$show$1$1$1;
import qna.d;
import msd.l;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.yxcorp.gifshow.growth.freetraffic.FreeTrafficDialogManager$show$1$1$2;
import qna.f;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import qna.e;
import k2b.e0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import android.util.Log;
import k2b.u1;
import km8.b;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.reflect.Type;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.NullPointerException;
import com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPresenter;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class GrowthFreeTrafficPluginImpl implements c	// class@00137f
{
    public a b;
    public boolean c;
    public int d;
    public boolean e;
    public e0 f;
    public final int g;
    public final int h;
    public final p i;

    public void GrowthFreeTrafficPluginImpl(){
       super();
       this.g = 2;
       this.h = 4;
       this.i = s.c(GrowthFreeTrafficPluginImpl$mCoroutineDispatcher$2.INSTANCE);
       if (PatchProxy.applyVoid(null, this, GrowthFreeTrafficPluginImpl.class, "2")) {
       }else {
          a.f(r1.b, this.F(), null, new GrowthFreeTrafficPluginImpl$initConfig$1(this, null), 2, null);
       }
       return;
    }
    public final ExecutorCoroutineDispatcher F(){
       Object obj = PatchProxy.apply(null, this, GrowthFreeTrafficPluginImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public PresenterV2 Pa(){
       Object obj = PatchProxy.applyWithListener(null, this, GrowthFreeTrafficPluginImpl.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(GrowthFreeTrafficPluginImpl.class, "9");
       return new h();
    }
    public final boolean S(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public boolean dp(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, GrowthFreeTrafficPluginImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.S()) {
          a.f(r1.b, this.F(), null, new GrowthFreeTrafficPluginImpl$isHitFeedFreeTraffic$1(this, objArray), 2, null);
          return false;
       }else if(this.c != null){
          return false;
       }else if(!b.a()){
          return false;
       }else {
          obj = a.a();
          a.o(obj, "AppEnv.get\(\)");
          if (!r0.c(obj.a())) {
             return false;
          }
          if (c.b()) {
             return false;
          }
          if (a.f()) {
             return false;
          }
          GrowthFreeTrafficPluginImpl tb = this.b;
          if (tb == null) {
             a.S("ftResp");
          }
          a num = tb.num;
          Result.constructor-impl(l1.a);
          if (a.e() > num) {
             return false;
          }else {
             return true;
          }
       }
    }
    public final void g0(Activity p0){
       boolean b;
       int i;
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthFreeTrafficPluginImpl.class, "6")) {
          return;
       }
       if (!this.S()) {
          return;
       }
       if (b.g(p0)) {
          return;
       }
       GrowthFreeTrafficPluginImpl tb = this.b;
       String str = "ftResp";
       if (tb == null) {
          a.S(str);
       }
       if (tb.a() != null) {
          g og1 = new g();
          GrowthFreeTrafficPluginImpl tb1 = this.b;
          if (tb1 == null) {
             a.S(str);
          }
          if (!PatchProxy.applyVoidOneRefs(tb1, og1, og, "1")) {
             a.p(tb1, "data");
             og1.a = tb1;
             a flow = tb1.flow;
             if (flow != null) {
                og1.h = flow;
             }
             flow = tb1.isp;
             if (flow != null) {
                og1.i = flow;
             }
          }
          GrowthFreeTrafficPluginImpl tf = this.f;
          if (!PatchProxy.applyVoidTwoRefs(p0, tf, og1, og, "2") && !p0.isFinishing()) {
             og = og1.a;
             b = true;
             Result$a uoa = (og != null)? 1: null;
             if (uoa) {
                og1.g = tf;
                if (og == null) {
                   a.S("respData");
                }
                FreeTrafficFeedContent uFreeTraffic = og.a();
                uFreeTraffic = (uFreeTraffic != null)? uFreeTraffic.duration: 5;
                d uod = new d(p0);
                uod.Z0(141);
                uod.b1(KwaiDialogOption.e);
                uod.w0(b);
                uod.T((long)((uFreeTraffic + b) * 1000));
                uod.A(b);
                uod.w0(b);
                FreeTrafficDialogManager$show$1$1$1 iNSTANCE = FreeTrafficDialogManager$show$1$1$1.INSTANCE;
                if (iNSTANCE != null) {
                   iNSTANCE = new d(iNSTANCE);
                }
                uod.G(iNSTANCE);
                FreeTrafficDialogManager$show$1$1$2 iNSTANCE1 = FreeTrafficDialogManager$show$1$1$2.INSTANCE;
                if (iNSTANCE1 != null) {
                   iNSTANCE1 = new d(iNSTANCE1);
                }
                uod.O(iNSTANCE1);
                uod.L(new f(R.layout.arg_RES_7f0d02d7));
                uod.M(new e(og1, tf, p0));
                t ot = uod.b0();
                ot.Z();
                ot = Result.constructor-impl(ot);
                Throwable throwable = Result.exceptionOrNull-impl(ot);
                if (throwable != null) {
                   u1.R("biz_ft_gd_dialog_error", Log.getStackTraceString(throwable), 9);
                }
             }
          }
       }
    label_00fd :
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public final void n(){
       String str = "";
       String str1 = "ft_feed_resp";
       if (PatchProxy.applyVoid(null, this, GrowthFreeTrafficPluginImpl.class, "3")) {
          return;
       }
       if (this.S() || (this.d < this.h && this.e == null)) {
          this.e = true;
          Object obj = b.b("DefaultPreferenceHelper");
          if (obj != null) {
             String str2 = obj.getString(str1, str);
             if (!TextUtils.x(str2)) {
                a uoa = b.a(str2, a.class);
                if (uoa != null) {
                   this.b = uoa;
                   this.d = this.h;
                }
                g.b(obj.edit().putString(str1, str));
             }else {
                this.d = this.d + true;
             }
             this.e = false;
             Object obj1 = Result.constructor-impl(l1.a);
             if (Result.exceptionOrNull-impl(obj1) != null) {
                this.d = this.d + true;
                this.e = false;
             }
          }else {
             throw new NullPointerException("null cannot be cast to non-null type android.content.SharedPreferences");
          }
       }
       return;
    }
    public PresenterV2 nc(){
       Object obj = PatchProxy.applyWithListener(null, this, GrowthFreeTrafficPluginImpl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(GrowthFreeTrafficPluginImpl.class, "8");
       return new GrowthFreeTrafficPresenter();
    }
    public boolean xq(Activity p0,BaseFragment p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GrowthFreeTrafficPluginImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          this.f = p1;
          if (this.S() && this.c == null) {
             GrowthFreeTrafficPluginImpl tb = this.b;
             if (tb == null) {
                a.S("ftResp");
             }
             if (tb.type == this.g) {
                this.g0(p0);
                if (!PatchProxy.applyVoid(null, this, GrowthFreeTrafficPluginImpl.class, "5")) {
                   this.c = true;
                   a.o((a.e() + true));
                }
                return true;
             }else {
                return false;
             }
          }
       }
    label_0069 :
       return false;
    }
}
