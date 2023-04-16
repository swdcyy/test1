package com.yxcorp.gifshow.tti.module.OnlineSystraceInitModule;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.tti.module.OnlineSystraceInitModule$a;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.OnlineSystraceManager$OnlineSystraceConfigModel;
import java.lang.reflect.Type;
import wkd.b;
import com.yxcorp.gifshow.OnlineSystraceManager;
import fg6.a;
import com.google.gson.Gson;
import zb5.i;
import com.yxcorp.gifshow.tti.module.e;
import j85.e;
import java.lang.Throwable;
import android.util.Log;
import com.yxcorp.gifshow.tti.module.f;
import io7.a;
import java.lang.Boolean;
import android.app.Activity;
import java.lang.Long;
import com.yxcorp.gifshow.OnlineSystraceManager$a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.c$b;
import java.lang.StringBuilder;
import hlc.g;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.e0;
import java.lang.ClassLoader;
import android.content.Context;
import com.kwai.robust.Robust;
import hlc.h;
import com.kwai.robust.ChangeQuickRedirect;
import hlc.i;
import androidx.fragment.app.Fragment;
import java.util.Objects;

public class OnlineSystraceInitModule extends a	// class@001dc2
{
    public OnlineSystraceManager$a q;
    public c$b r;
    public static final int s;

    public void OnlineSystraceInitModule(){
       super();
       this.q = null;
       this.r = new OnlineSystraceInitModule$a(this);
    }
    public boolean H7(){
       return false;
    }
    public int f0(){
       return 19;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OnlineSystraceInitModule.class, "8")) {
          return;
       }
       String str = "LaunchCfgOnlineSystrace";
       OnlineSystraceManager$OnlineSystraceConfigModel value = a.t().getValue(str, OnlineSystraceManager$OnlineSystraceConfigModel.class, new OnlineSystraceManager$OnlineSystraceConfigModel());
       if ((value.mVersion).equals("none")) {
          b.a(-2022051331).f();
       }else {
          b.a(-2022051331).l(value);
          a.a.q(value);
       }
       if (!PatchProxy.applyVoid(null, this, OnlineSystraceInitModule.class, "9")) {
          String[] stringArray = new String[]{"Push.Performance.Message"};
          b.a(-1989170423).e(e.a, stringArray);
       }
       a.t().p(str, f.b);
       b.a(-2022051331).h(1);
       if (a.t().d("LaunchOptPreInitFastunwind", false) && b.a(-2022051331).getConfig() != null) {
          b.a(-2022051331).init();
       }
       return;
    }
    public void l0(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OnlineSystraceInitModule.class, "4")) {
          return;
       }
       OnlineSystraceManager$OnlineSystraceConfigModel onlineSystra = b.a(-2022051331).n();
       if (onlineSystra == null) {
          return;
       }
       if (!onlineSystra.mType.longValue() - 6) {
          this.o0(this.q, p0, p1);
       }
       if (p0 instanceof FragmentActivity) {
          if (p1.equals("onActivityCreate")) {
             p0.getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.r, true);
          }
          if (p1.equals("onActivityDestroy")) {
             p0.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.r);
          }
       }
       this.p0(p0.getClass().getCanonicalName()+"_"+p1);
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OnlineSystraceInitModule.class, "1")) {
          return;
       }
       int i = -2022051331;
       if (!PatchProxy.applyVoid(objArray, this, OnlineSystraceInitModule.class, "2") && b.a(i).n() != null) {
          ActivityContext.i(new g(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, OnlineSystraceInitModule.class, "3")) {
          OnlineSystraceManager$OnlineSystraceConfigModel onlineSystra = b.a(i).n();
          if (onlineSystra != null && !onlineSystra.mType.longValue() - 6) {
             try{
                OnlineSystraceManager$a uoa = a.a.h(b.a(i).b(), OnlineSystraceManager$a.class);
                if (uoa == null || (TextUtils.isEmpty(uoa.mBeginClass) || (TextUtils.isEmpty(uoa.mBeginMethod) || (!TextUtils.isEmpty(uoa.mEndClass) && !TextUtils.isEmpty(uoa.mEndMethod))))) {
                   long l = 1;
                   if (a.t().d("anytraceChoiceByMethod", false)) {
                      uoa.mAnyTraceType = ((Long.valueOf(Long.parseLong(uoa.mBeginMethod)).toString()).equals(uoa.mBeginMethod) && (Long.valueOf(Long.parseLong(uoa.mEndMethod)).toString()).equals(uoa.mEndMethod))? l: 2;
                   }
                label_00d3 :
                   this.q = uoa;
                   if (!uoa.mAnyTraceType - l) {
                      Class uClass = e0.b.getClassLoader().loadClass(uoa.mBeginClass);
                      Class uClass1 = e0.b.getClassLoader().loadClass(uoa.mEndClass);
                      if (!Robust.get().containsChangeQuickRedirect(uClass).booleanValue() && !Robust.get().containsChangeQuickRedirect(uClass1).booleanValue()) {
                         Robust.get().addChangeQuickRedirect(uClass, new h(this, uoa));
                         Robust.get().addChangeQuickRedirect(uClass1, new i(this, uoa));
                      }
                   }
                }
             }catch(java.lang.Exception e0){
                Log.getStackTraceString(e0);
             }
          }
       }
    }
    public void n0(c p0,Fragment p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, OnlineSystraceInitModule.class, "5")) {
          return;
       }
       this.o0(this.q, p1, p2);
       this.p0(p1.getClass().getCanonicalName()+"_"+p2);
       return;
    }
    public final void o0(OnlineSystraceManager$a p0,Object p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, OnlineSystraceInitModule.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Objects.requireNonNull(p1);
       if ((p0.mBeginClass).equals(p1.getClass().getCanonicalName()) && (p0.mBeginMethod).equals(p2)) {
          b.a(-2022051331).e(e0.b, 6);
       }
       if ((p0.mEndClass).equals(p1.getClass().getCanonicalName()) && (p0.mEndMethod).equals(p2)) {
          b.a(-2022051331).h(6);
       }
       return;
    }
    public final void p0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OnlineSystraceInitModule.class, "7")) {
          return;
       }
       b.a(-2022051331).d(p0);
       b.a(-2022051331).c();
       return;
    }
}
