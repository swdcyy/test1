package com.yxcorp.gifshow.featured.detail.featured.poornet.b;
import com.yxcorp.gifshow.featured.detail.featured.poornet.b$a;
import java.lang.reflect.Type;
import el.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import xda.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import android.util.Log;
import xda.a;
import m9a.w;
import android.os.SystemClock;
import com.kwai.video.hodor.Hodor;
import java.lang.StringBuilder;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import kda.a;
import java.lang.Boolean;
import java.util.List;
import android.content.SharedPreferences;
import km8.b;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Integer;
import com.yxcorp.gifshow.featured.detail.featured.poornet.PoorNetInfo;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import xda.d;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import xda.m;
import k2b.u1;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Arrays;
import m56.f;
import m56.g;
import lnc.i3;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class b	// class@000f45
{
    public b a;
    public List b;
    public b c;
    public String d;
    public b e;
    public b f;
    public long g;
    public static final Type h;
    public static final boolean i;

    static {
       b.h = new b$a().getType();
       b.i = a.t().d("enablePoorNetNewLog", false);
    }
    public void b(){
       super();
       this.g = -1;
    }
    public static b i(){
       String obj = PatchProxy.apply(null, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().c("poorNetLogConfig", "");
       try{
          if (!TextUtils.x(obj)) {
             return a.a.h(obj, b.class);
          }
       }catch(com.google.gson.JsonSyntaxException e0){
          a.C(Log.getStackTraceString(e0));
       }
       return null;
    }
    public final void a(){
       int netSpeedKbps;
       if (PatchProxy.applyVoid(null, this, b.class, "16")) {
          return;
       }
       if (w.b()) {
          a.C("POOR_NETWORK_DURATION current net not connected");
          if (this.g < 0) {
             this.g = SystemClock.elapsedRealtime();
             this.k();
          }else {
             this.j();
          }
       }else if(this.e().mCdnNetSpeedThreshold > null){
          netSpeedKbps = Hodor.instance().getNetSpeedKbpsForPreload();
          a.C("POOR_NETWORK_DURATION current net speed: "+netSpeedKbps);
          this.h(netSpeedKbps, this.e().mCdnNetSpeedThreshold);
       }else {
          netSpeedKbps = NetworkQualityEstimator.b();
          a.C("POOR_NETWORK_DURATION current net score: "+netSpeedKbps);
          this.h(netSpeedKbps, this.e().mNetScoreThreshold);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "21")) {
          return;
       }
       this.g = -1;
       a.b(-1);
       a.a(-1);
       return;
    }
    public boolean c(){
       b obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e();
       if (obj != null) {
          return obj.mEnableLog;
       }
       return false;
    }
    public String d(){
       return this.d;
    }
    public b e(){
       b uob = b.class;
       String obj = PatchProxy.apply(null, this, uob, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          _monitor_enter(uob);
          if (this.a == null) {
             this.a = b.i();
             obj = (this.a == null)? "null": this.a.toString();
             a.C(obj);
          }
          _monitor_exit(uob);
       }
       return this.a;
    }
    public void f(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "4")) {
          return;
       }
       if (this.g()) {
          a.C("log manager has init");
          return;
       }else {
          _monitor_enter(this);
          if (this.g()) {
             a.C("log manager has init");
             _monitor_exit(this);
             return;
          }else {
             Object[] objArray1 = PatchProxy.apply(objArray, this, uob, "9");
             if (objArray1 != PatchProxyResult.class) {
             }else {
                Type h = b.h;
                String str = a.a.getString("poorNetworkInfos", "");
                if (str != null && str != "") {
                   objArray = b.a(str, h);
                }
                objArray1 = objArray;
             }
             if (!q.f(objArray1)) {
                this.o(objArray1);
             }
             this.b = Collections.synchronizedList(new ArrayList());
             this.q();
             a.C("log manager init  completed");
             _monitor_exit(this);
             return;
          }
       }
    }
    public final boolean g(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public final void h(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "17")) {
          return;
       }
       if (p0 < p1) {
          if (this.g < 0) {
             this.g = SystemClock.elapsedRealtime();
             this.k();
          }else {
             this.j();
          }
       }else {
          this.p();
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, b.class, "20")) {
          return;
       }
       if (this.g > 0) {
          a.a(SystemClock.elapsedRealtime());
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "19")) {
          return;
       }
       a.b(this.g);
       return;
    }
    public void l(PoorNetInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       if (!this.g()) {
          this.f();
       }
       if (p0 != null) {
          _monitor_enter(this);
          int i = this.b.indexOf(p0);
          if (i >= 0) {
             this.b.set(i, p0);
          }else {
             this.b.add(p0);
          }
          this.d = p0.mPoorNetIdentity;
          this.q();
          _monitor_exit(this);
       }
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       b te = this.e;
       if (te == null || te.isDisposed()) {
          this.e = t.interval(1, this.e().mNetMonitorTimerInterval, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new d(this), h.b);
       }
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       b te = this.e;
       if (te != null) {
          te.dispose();
       }
       return;
    }
    public final void o(List p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       a.C("updateLastInfoAndUpload");
       PoorNetInfo poorNetInfo = p0.get((p0.size() - 1));
       if (poorNetInfo != null) {
          if (!TextUtils.x(poorNetInfo.mLeaveReason)) {
             m om = null;
             if (!poorNetInfo.mStartTime - om || poorNetInfo.mEndTime - om) {
             label_0038 :
                if (b.i) {
                   if (!q.f(p0)) {
                      m om1 = new m();
                      om1.infos.addAll(p0);
                      str = a.a.q(om1);
                      a.C(str);
                      u1.R("POOR_NETWORK", str, 14);
                   }
                }else {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = p0.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(a.a.x(iterator.next()).r());
                   }
                   if (!q.f(uArrayList)) {
                      str = Arrays.toString(uArrayList.toArray());
                      a.C(str);
                      u1.R("POOR_NETWORK", str, 14);
                   }
                }
                return;
             }
          }
          poorNetInfo.mLeaveReason = "KILL_APP";
          goto label_0038 ;
       }else {
          goto label_0038 ;
       }
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       a.C("POOR_NETWORK_DURATION to background");
       this.n();
       this.p();
       return;
    }
    public void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       a.C("POOR_NETWORK_DURATION to foreground");
       this.m();
       return;
    }
    public final void p(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, b.class, "18")) {
          return;
       }
       i3 oi3 = null;
       if (this.g - oi3 > 0) {
          long l = SystemClock.elapsedRealtime() - this.g;
          this.b();
          if (l - oi3 > 0) {
             oi3 = i3.f();
             oi3.d("duration", String.valueOf(l));
             b = (this.a != null && this.a.mEnableDebugLog != null)? true: false;
             oi3.a("isDebugInfo", Boolean.valueOf(b));
             u1.R("POOR_NETWORK_DURATION", oi3.e(), 14);
             a.C("POOR_NETWORK_DURATION "+l);
          }
       }
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("poorNetworkInfos", b.e(this.b));
       g.a(uEditor);
       return;
    }
}
