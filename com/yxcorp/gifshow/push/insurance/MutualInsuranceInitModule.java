package com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule;
import com.kwai.framework.init.a;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningServiceInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Runtime;
import java.lang.StringBuilder;
import java.lang.Process;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import v6c.a;
import q87.c;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.push.insurance.WakeupThirdPartyAppResponse;
import ekd.e0;
import java.lang.System;
import i6c.a;
import android.content.SharedPreferences;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import b76.a;
import u6c.b;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.yxcorp.gifshow.push.insurance.a;
import com.kwai.framework.init.c;
import i6c.c;
import i6c.k;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.SystemUtil;
import h30.a;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Long;
import com.yxcorp.gifshow.push.insurance.WakeupThirdPartyAppResponse$ApplicationInfo;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.push.insurance.d;
import erd.r;
import com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule$c;
import brd.w;
import com.yxcorp.gifshow.push.insurance.e;
import com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule$b;
import com.yxcorp.gifshow.push.insurance.c;
import erd.o;
import u6c.g;
import com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule$a;
import com.yxcorp.gifshow.push.insurance.b;
import u6c.f;
import t45.d;
import brd.z;
import u6c.a;
import erd.a;
import u6c.e;
import u6c.d;

public class MutualInsuranceInitModule extends a	// class@001671
{
    public WakeupThirdPartyAppResponse q;
    public boolean r;
    public static final int s;

    public void MutualInsuranceInitModule(){
       super();
       this.q = null;
       this.r = true;
    }
    public static boolean n0(Context p0,String p1){
       StringBuilder str = "\"";
       String str1 = "ps | grep \"";
       String str2 = "-c";
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MutualInsuranceInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       ActivityManager systemServic = p0.getSystemService("activity");
       if (systemServic == null) {
          return b;
       }
       List runningServi = systemServic.getRunningServices(Integer.MAX_VALUE);
       if (runningServi != null && !runningServi.isEmpty()) {
          Iterator iterator = runningServi.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (TextUtils.equals(iterator.next().process, p1)) {
                   return true;
                }
                continue ;
             }else {
                String[] stringArray = new String[]{"/system/bin/sh",str2,str1+p1+str};
                Process process = Runtime.getRuntime().exec(stringArray);
                BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(process.getInputStream()));
                str = "";
                str1 = uBufferedRea.readLine();
                while (str1 != null) {
                   str = str+str1;
                }
                Object[] objArray = new Object[b];
                a.C().s("mutual", "ps :"+str, objArray);
                if (!TextUtils.isEmpty(str) && !process.waitFor()) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, MutualInsuranceInitModule.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, MutualInsuranceInitModule.class, "8")) {
          return;
       }
       MutualInsuranceInitModule tq = this.q;
       if (tq != null && tq.mWakeType == 1) {
          WakeupThirdPartyAppResponse mApplication = tq.mApplicationInfos;
          if (mApplication != null && !mApplication.isEmpty()) {
             tq = this.q;
             this.p0(tq.mApplicationInfos, (long)tq.mWakeupDelay);
          }
       }
       return;
    }
    public void i0(){
       RequestTiming cOLD_START;
       if (PatchProxy.applyVoid(null, this, MutualInsuranceInitModule.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, MutualInsuranceInitModule.class, "5") && (e0.a || (System.currentTimeMillis() - a.a.getLong("mutual_insurance_apps_time", 0) >= 0 && QCurrentUser.ME.isLogined()))) {
          if (this.r != null) {
             this.r = false;
             cOLD_START = RequestTiming.COLD_START;
          }else {
             cOLD_START = RequestTiming.ON_FOREGROUND;
          }
          this.l0(cOLD_START);
       }
    label_0046 :
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutualInsuranceInitModule.class, "6")) {
          return;
       }
       e.d(new b(this), "MutualInsuranceInitModule");
       return;
    }
    public final void l0(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutualInsuranceInitModule.class, "7")) {
          return;
       }
       c.b(new a(this, p0));
       return;
    }
    public void n(){
    }
    public void o0(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MutualInsuranceInitModule.class, "10")) {
          return;
       }
       if (p0.size() == p1.size()) {
          k.a().c(SystemUtil.m(a.a().a()), a.d(), p0).subscribe(Functions.d(), Functions.d());
       }
       return;
    }
    public final void p0(List p0,long p1){
       z c;
       if (PatchProxy.isSupport(MutualInsuranceInitModule.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, MutualInsuranceInitModule.class, "9")) {
          return;
       }
       this.q = null;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          WakeupThirdPartyAppResponse$ApplicationInfo uApplication = iterator.next();
          TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
          t ot = t.just(uApplication).delay(p1, mILLISECONDS).filter(d.b).switchIfEmpty(new MutualInsuranceInitModule$c(this, uArrayList, uApplication, p0)).filter(e.b).switchIfEmpty(new MutualInsuranceInitModule$b(this, uArrayList, uApplication, p0)).map(c.b).filter(new g(uApplication)).switchIfEmpty(new MutualInsuranceInitModule$a(this, uArrayList, uApplication, p0)).doOnNext(b.b).delay(500, mILLISECONDS);
          c = d.c;
          ot = ot.map(new f(uApplication)).observeOn(c).subscribeOn(c);
          ot.doFinally(new a(this, uArrayList, p0)).subscribe(new e(uArrayList, uApplication), new d(uArrayList, uApplication));
       }
       return;
    }
}
