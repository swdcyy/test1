package com.yxcorp.gifshow.freetraffic.FreeTrafficManager;
import java.lang.Object;
import java.util.ArrayList;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.String;
import skd.a;
import com.yxcorp.gifshow.freetraffic.a;
import com.yxcorp.utility.SystemUtil;
import ekd.p0;
import ka0.f;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager$NetworkChangeReceiver;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Exception;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.framework.config.heartbeat.g$c;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import kka.q;
import erd.g;
import crd.b;
import zca.p;
import kka.p;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager$a;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager$b;
import java.lang.Integer;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import kka.b;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import kka.w;
import java.util.List;
import fg6.a;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import nka.f;
import mka.d;
import pka.g;
import lka.f;
import oka.d;
import kka.s;
import erd.o;
import cjd.e;
import kka.o;
import com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficDeviceInfoResponse;
import java.util.Collection;
import ekd.q;
import com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficDeviceInfoResponse$PromptInfo;
import java.lang.Boolean;
import java.lang.System;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.freetraffic.FreeTrafficActivateEvent;
import com.yxcorp.gifshow.freetraffic.FreeTrafficActivateEvent$Status;
import com.yxcorp.utility.Log;
import java.util.concurrent.TimeUnit;
import kka.j;
import kka.r;
import kka.k;
import kka.l;
import wkd.b;
import kka.a;
import kka.n;
import kka.i;
import qe6.b;
import ekd.u0;
import android.telephony.TelephonyManager;
import ukd.a;
import lnc.b6;
import com.yxcorp.gifshow.freetraffic.FreeTrafficSimInfo;
import java.lang.Long;
import kka.m;
import io.reactivex.internal.functions.Functions;

public class FreeTrafficManager	// class@001187
{
    public SharedPreferences a;
    public String b;
    public List c;
    public FreeTrafficManager$NetworkChangeReceiver d;
    public FreeTrafficDeviceInfoResponse e;
    public String f;
    public a g;
    public b h;
    public b i;
    public boolean j;

    public void FreeTrafficManager(){
       RxBus f;
       z a;
       super();
       this.c = new ArrayList();
       this.a = a.b(a.a().a(), "king_data");
       this.g = new a();
       if (SystemUtil.L(a.a().a())) {
          this.j = p0.A(a.b());
          Object[] objArray = new Object[0];
          f.C().w("FreeTrafficManager", "init isMobileNetwork = "+this.j, objArray);
          this.d = new FreeTrafficManager$NetworkChangeReceiver(this);
          String str = "android.net.conn.CONNECTIVITY_CHANGE";
          try{
             IntentFilter intentFilter = new IntentFilter(str);
             UniversalReceiver.e(a.a().a(), this.d, intentFilter);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public void FreeTrafficManager(FreeTrafficManager$a p0){
       RxBus f;
       z a;
       super();
       this.c = new ArrayList();
       this.a = a.b(a.a().a(), "king_data");
       this.g = new a();
       if (SystemUtil.L(a.a().a())) {
          this.j = p0.A(a.b());
          Object[] objArray = new Object[0];
          f.C().w("FreeTrafficManager", "init isMobileNetwork = "+this.j, objArray);
          this.d = new FreeTrafficManager$NetworkChangeReceiver(this);
          String str = "android.net.conn.CONNECTIVITY_CHANGE";
          try{
             IntentFilter intentFilter = new IntentFilter(str);
             UniversalReceiver.e(a.a().a(), this.d, intentFilter);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public static FreeTrafficManager j(){
       return FreeTrafficManager$b.a;
    }
    public void a(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FreeTrafficManager.class, "3")) {
          return;
       }
       String str = "FreeTrafficManager";
       if (p0 == null) {
          f.C().e(str, "activeFreeTraffic error with null type, freeTrafficInfo:"+this.f, new IllegalArgumentException());
          return;
       }else {
          Object[] objArray = new Object[0];
          f.C().w(str, "activeFreeTraffic, type:"+p0, objArray);
          b uob = this.f(p0.intValue());
          if (uob != null) {
             uob.a(this.e());
          }
          return;
       }
    }
    public String b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FreeTrafficManager uFreeTraffic = FreeTrafficManager.class;
       HashMap obj = PatchProxy.apply(null, this, uFreeTraffic, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new HashMap();
       String str = (SystemUtil.a(29))? "": this.e();
       obj.put("imsi", str);
       str = this.e();
       String str1 = PatchProxy.applyOneRefs(str, this, uFreeTraffic, "6");
       if (str1 != patchProxyRe) {
       }else if(!TextUtils.isEmpty(str)){
          int i = 5;
          if (str.length() >= i) {
             str1 = str.substring(0, i);
          }
       }
       str1 = w.b(a.a().a());
       obj.put("ispType", str1);
       obj.put("simInfo", this.k(a.a().a()));
       return a.a.q(obj);
    }
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FreeTrafficManager.class, "26")) {
          return;
       }
       this.e = null;
       g.a(this.a.edit().putString("free_traffic_devices_info"+p0, ""));
       g.a(this.a.edit().putString("free_traffic_sim_info", ""));
       return;
    }
    public t d(String p0,RequestTiming p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FreeTrafficManager.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.a(p0, p1);
    }
    public String e(){
       FreeTrafficManager tb;
       String obj = PatchProxy.apply(null, this, FreeTrafficManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.b)) {
          this.b = w.a(a.a().a());
       }
       obj = (TextUtils.isEmpty(this.b))? "": this.b;
       return obj;
    }
    public final b f(int p0){
       FreeTrafficManager uFreeTraffic = FreeTrafficManager.class;
       if (PatchProxy.isSupport(uFreeTraffic)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uFreeTraffic, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uFreeTraffic = this.h;
       if (uFreeTraffic != null && uFreeTraffic.d() == p0) {
          return this.h;
       }else if(p0 != 1){
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   if (p0 == 101) {
                      this.h = new f(this.g, this.a);
                   }
                }else {
                   this.h = new d(this.g, this.a);
                }
             }else {
                this.h = new g(this.g, this.a);
             }
          }else {
             this.h = new f(this.g, this.a);
          }
       }else {
          this.h = new d(this.g, this.a);
       }
       return this.h;
    }
    public t g(RequestTiming p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FreeTrafficManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       f.C().w("FreeTrafficManager", "getFreeTrafficInfo, request devicestate", objArray);
       return this.g.a(this.b(), p0).flatMap(new s(p0)).map(new e()).observeOn(d.c).doOnNext(new o(this));
    }
    public FreeTrafficDeviceInfoResponse h(){
       String obj = PatchProxy.apply(null, this, FreeTrafficManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          this.m();
          if (this.e == null) {
             obj = this.a.getString("free_traffic_sim_info", "");
             String str = this.e();
             if (!TextUtils.equals(obj, str)) {
                Object[] objArray = new Object[0];
                f.C().w("FreeTrafficManager", "getFreeTrafficInfoResponse clear old sp message, oldImsi:"+obj+", newImsi:"+str, objArray);
                this.c(obj);
             }
          }
       }
       return this.e;
    }
    public String i(){
       FreeTrafficManager obj = PatchProxy.apply(null, this, FreeTrafficManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          this.m();
          obj = this.e;
          if (obj != null) {
             this.f(obj.mProductType);
          }
       }
       obj = this.e;
       FreeTrafficDeviceInfoResponse mFreeTraffic = (obj != null)? obj.mFreeTrafficType: "";
       return mFreeTraffic;
    }
    public List k(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FreeTrafficManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.c)) {
          this.w(p0);
       }
       return this.c;
    }
    public String l(){
       FreeTrafficDeviceInfoResponse$PromptInfo mVideoPlay;
       FreeTrafficManager te = this.e;
       if (te != null) {
          FreeTrafficDeviceInfoResponse mMessage = te.mMessage;
          if (mMessage != null) {
             mVideoPlay = mMessage.mVideoPlay;
          label_000d :
             return mVideoPlay;
          }
       }
       mVideoPlay = "";
       goto label_000d ;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, FreeTrafficManager.class, "29")) {
          return;
       }
       this.f = this.a.getString("free_traffic_devices_info"+this.e(), "");
       Object[] objArray = new Object[0];
       f.C().w("FreeTrafficManager", "initFreeTrafficInfo:"+this.f, objArray);
       if (!TextUtils.isEmpty(this.f)) {
          this.e = a.a.h(this.f, FreeTrafficDeviceInfoResponse.class);
       }
       return;
    }
    public boolean n(){
       FreeTrafficManager obj = PatchProxy.apply(null, this, FreeTrafficManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!TextUtils.isEmpty(this.i())) {
          obj = this.e;
          int i = (obj != null && obj.mIsActivated != null)? 1: 0;
          if (i) {
             obj = (obj != null && obj.mSwitch != null)? 1: 0;
             if (obj) {
             label_003a :
                return b;
             }
          }
       }
    label_0039 :
       b = false;
       goto label_003a ;
    }
    public boolean o(){
       Object obj = PatchProxy.apply(null, this, FreeTrafficManager.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (SystemUtil.L(a.b())) {
          return this.j;
       }
       return p0.A(a.b());
    }
    public boolean p(FreeTrafficDeviceInfoResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FreeTrafficManager.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || (p0.mCreatedTime + p0.mDuration) - System.currentTimeMillis() < 0)? true: false;
       return b;
    }
    public boolean q(){
       FreeTrafficManager obj = PatchProxy.apply(null, this, FreeTrafficManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       boolean b = (obj != null && obj.f())? true: false;
       return b;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, FreeTrafficManager.class, "24")) {
          return;
       }
       if (this.n()) {
          a.d().k(new FreeTrafficActivateEvent(FreeTrafficActivateEvent$Status.SUCCESS));
       }else {
          a.d().k(new FreeTrafficActivateEvent(FreeTrafficActivateEvent$Status.FAILED));
       }
       return;
    }
    public void s(){
       t ot;
       FreeTrafficManager uFreeTraffic = FreeTrafficManager.class;
       if (PatchProxy.applyVoid(null, this, uFreeTraffic, "12")) {
          return;
       }
       RequestTiming dEFAULT = RequestTiming.DEFAULT;
       int i = 10;
       if (PatchProxy.isSupport(uFreeTraffic)) {
          ot = PatchProxy.applyTwoRefs(dEFAULT, Integer.valueOf(i), this, uFreeTraffic, "9");
          if (ot != PatchProxyResult.class) {
          label_0060 :
             z c = d.c;
             ot = ot.subscribeOn(c).observeOn(c);
             this.i = ot.subscribe(new k(this), new l(this));
             return;
          }
       }
       Log.g("FreeTrafficManager", "getFreeTrafficInfo, request devicestate");
       ot = this.g.a(this.b(), dEFAULT).delay((long)i, TimeUnit.SECONDS).flatMap(new j(dEFAULT)).map(new e()).observeOn(d.c).doOnNext(new r(this));
       goto label_0060 ;
    }
    public void t(int p0){
       FreeTrafficManager uFreeTraffic = FreeTrafficManager.class;
       if (PatchProxy.isSupport(uFreeTraffic) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFreeTraffic, "28")) {
          return;
       }
       FreeTrafficDeviceInfoResponse mAutoActiveT = FreeTrafficManager.j().h().mAutoActiveTypes;
       for (int i = 0; i < mAutoActiveT.size(); i = i + 1) {
          int i1 = mAutoActiveT.get(i).intValue();
          if (i1 == p0) {
             break ;
          }else {
             mAutoActiveT.remove(new Integer(i1));
          }
       }
       b.a(0x69be64a5).c(mAutoActiveT);
       return;
    }
    public void u(RequestTiming p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, FreeTrafficManager.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       f.C().w("FreeTrafficManager", "tryUpdateSimFreeTrafficInfo, requestTiming:"+p0, objArray);
       if (this.i != null) {
          return;
       }
       this.w(a.a().a());
       if (this.e == null) {
          this.m();
       }
       if (this.p(this.e)) {
          objArray1 = new Object[i];
          f.C().w("FreeTrafficManager", "tryUpdateSimFreeTrafficInfo, need request", objArray1);
          z c = d.c;
          t ot = this.g(p0).subscribeOn(c).observeOn(c);
          this.i = ot.subscribe(new n(this), new i(this));
       }else {
          objArray1 = new Object[i];
          f.C().w("FreeTrafficManager", "tryUpdateSimFreeTrafficInfo, response is valid, retry auto active, freeTrafficType:"+this.e.mFreeTrafficType, objArray1);
          this.r();
          FreeTrafficManager te = this.e;
          Collection uCollection = (te == null)? null: te.mAutoActiveTypes;
          if (!q.f(uCollection)) {
             this.a(uCollection.get(i));
          }
       }
       return;
    }
    public void v(FreeTrafficDeviceInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FreeTrafficManager.class, "11")) {
          return;
       }
       if (!p0.mCreatedTime - null) {
          p0.mCreatedTime = System.currentTimeMillis();
       }
       this.e = p0;
       this.f(p0.mProductType);
       this.f = a.a.q(p0);
       Object[] objArray = new Object[0];
       f.C().w("FreeTrafficManager", "updateFreeTrafficInfo:"+this.f, objArray);
       g.a(this.a.edit().putString("free_traffic_devices_info"+this.e(), this.f).putString("free_traffic_sim_info", this.e()));
       if (!this.n() && !q.f(p0.mAutoActiveTypes)) {
          this.a(p0.mAutoActiveTypes.get(0));
       }
       return;
    }
    public final void w(Context p0){
       String str2;
       FreeTrafficSimInfo uFreeTraffic;
       if (PatchProxy.applyVoidOneRefs(p0, this, FreeTrafficManager.class, "20")) {
          return;
       }
       if (!b.a()) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       String str = "sim_count";
       int intx = this.a.getInt(str, 0);
       if (!intx) {
          Object[] objArray = new Object[0];
          intx = a.a(a.a().a().getSystemService("phone"), "getSimCount", objArray).intValue();
          g.a(this.a.edit().putInt(str, intx));
       }
       int i = b6.a(p0);
       int i1 = 0;
       while (i1 < intx) {
          int i2 = b6.c(p0, i1);
          if (i2 == -1) {
             i2 = u0.d(i1, p0);
          }
          String str1 = u0.e(i2, p0);
          if (PatchProxy.isSupport(FreeTrafficManager.class)) {
             str2 = PatchProxy.applyTwoRefs(str1, Integer.valueOf(i2), this, FreeTrafficManager.class, "7");
             if (str2 != PatchProxyResult.class) {
             }else if(!TextUtils.isEmpty(str1)){
                int i3 = 5;
                if (str1.length() >= i3) {
                   str2 = str1.substring(0, i3);
                }
             }
             str2 = b6.b(a.a().a(), i2);
          }else {
             goto label_007f ;
          }
          String str3 = "";
          if (i == i2 && i >= 0) {
             uFreeTraffic = new FreeTrafficSimInfo();
             if (TextUtils.isEmpty(str1)) {
                str1 = str3;
             }
             uFreeTraffic.mImsi = str1;
             if (TextUtils.isEmpty(str2)) {
                str2 = w.b(p0);
             }
             uFreeTraffic.mIspType = str2;
             uFreeTraffic.mSubId = i2;
             uFreeTraffic.mActived = true;
             uArrayList.add(uFreeTraffic);
          }else if(!TextUtils.isEmpty(str2)){
             uFreeTraffic = new FreeTrafficSimInfo();
             if (TextUtils.isEmpty(str1)) {
                str1 = str3;
             }
             uFreeTraffic.mImsi = str1;
             uFreeTraffic.mIspType = str2;
             uFreeTraffic.mSubId = i2;
             uFreeTraffic.mActived = false;
             uArrayList.add(uFreeTraffic);
          }
          i1 = i1 + 1;
       }
       this.c = uArrayList;
       return;
    }
    public void x(long p0,RequestTiming p1){
       FreeTrafficManager uFreeTraffic = FreeTrafficManager.class;
       if (PatchProxy.isSupport(uFreeTraffic) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uFreeTraffic, "1")) {
          return;
       }
       uFreeTraffic = this.e;
       if (uFreeTraffic == null || (p0 - null > 0 && p0 - uFreeTraffic.mStatusUpdateTime > 0)) {
          Object[] objArray = new Object[0];
          f.C().w("FreeTrafficManager", "updateStatus, time:"+p0+", requestTiming:"+p1, objArray);
          z c = d.c;
          t ot = this.g(p1).subscribeOn(c).observeOn(c);
          ot.subscribe(new m(this), Functions.d());
       }
       return;
    }
}
