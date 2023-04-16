package iy.e;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.util.Random;
import iy.e$a;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import qe7.c;
import iy.a;
import qe7.d;
import iy.b;
import msd.p;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import java.lang.StringBuilder;
import yx.j0;
import tkd.b;
import tkd.d;
import iu5.a;
import iu5.b;
import java.lang.Long;
import java.lang.Number;
import java.lang.Boolean;
import zk.f;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.lang.Throwable;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import java.lang.Math;
import java.lang.Double;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import q35.c$a;
import q35.c;

public abstract class e	// class@002594
{
    public final int a;
    public final int b;
    public JsonObject c;
    public boolean d;
    public long e;
    public long f;
    public boolean g;
    public final Random h;
    public final b i;

    public void e(){
       super();
       this.a = a.t().a("adApmFrozenMaxFrameTime", 600);
       this.b = a.t().a("adApmFrozenMaxTotalTime", 5000);
       this.d = false;
       this.e = 0;
       this.f = 0;
       this.g = false;
       this.h = new Random();
       this.i = new e$a(this);
    }
    public abstract boolean A();
    public void B(String p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "6")) {
          return;
       }
       this.C(p0, p1, 0);
       return;
    }
    public void C(String p0,Activity p1,int p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, e.class, "7")) {
          return;
       }
       if (this.s(p0, p1)) {
          return;
       }
       if (this.A()) {
          if (p2 == 1) {
             JsonObject jsonObject = new JsonObject();
             this.c = jsonObject;
             jsonObject.G("jank", new JsonArray());
             a uoa = PatchProxy.apply(null, this, uoe, "8");
             if (uoa != patchProxyRe) {
             }else {
                uoa = new a(this);
             }
             b uob = PatchProxy.apply(null, this, uoe, "9");
             if (uob != patchProxyRe) {
             }else {
                uob = new b(this);
             }
             FpsMonitor.startSection(p0, p1, null, uoa, uob);
          }else {
             FpsMonitor.startSection(p0, p1);
          }
          this.d = true;
          Object[] objArray = new Object[0];
          j0.a("ad_apm", " fps start.section = "+p0+",model = "+p2, objArray);
       }
       return;
    }
    public void D(String p0,Activity p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "11")) {
          return;
       }
       if (this.s(p0, p1)) {
          return;
       }
       if (this.d != null) {
          if (!PatchProxy.applyVoid(null, this, uoe, "1")) {
             d.a(-941562155).uv(this.i);
          }
          FpsMonitor.stopSection(p0, p1);
          Object[] objArray = new Object[0];
          j0.a("ad_apm", p0+" fps stop", objArray);
          this.d = false;
       }
       return;
    }
    public abstract JsonObject c();
    public void d(JsonObject p0){
       boolean b;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "23")) {
          return;
       }
       p0.a0("longest_frame_time", Long.valueOf(this.l()));
       p0.a0("total_frozen_time", Long.valueOf(this.o()));
       Object obj = PatchProxy.apply(null, this, uoe, "22");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.l() - (long)this.a > 0 || this.o() - (long)this.b > 0){
          b = 1;
       }else {
          b = 0;
       }
       p0.a0("is_frozen_new", Integer.valueOf(b));
       return;
    }
    public JsonElement e(String p0){
       e obj = PatchProxy.applyOneRefs(p0, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null && obj.s0(p0)) {
          return this.c.e0(p0);
       }
       return f.a;
    }
    public abstract BusinessType f();
    public abstract String g();
    public double h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (this.c.s0(p0)) {
          return this.c.e0(p0).m();
       }
       return 0;
    }
    public JsonObject i(){
       return this.c;
    }
    public JsonObject j(){
       String str = "Histogram";
       Object obj = PatchProxy.apply(null, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c.s0(str)) {
          return this.c.m0(str);
       }
       return new JsonObject();
    }
    public abstract String k();
    public long l(){
       Object obj = PatchProxy.apply(null, this, e.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!this.e) {
          this.v();
       }
       return this.e;
    }
    public boolean m(){
       return this.g;
    }
    public abstract SubBusinessType n();
    public long o(){
       Object obj = PatchProxy.apply(null, this, e.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!this.e) {
          this.v();
       }
       return this.f;
    }
    public int p(){
       Object obj = PatchProxy.apply(null, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.q(this.j(), Math.min(this.h("RefreshRate"), 60.00f), this.h("FPS"));
    }
    public boolean q(JsonObject p0,double p1,double p2){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Double.valueOf(p1), Double.valueOf(p2), this, e.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }else if((p2 * 2.00f) - p1 <= 0){
          return true;
       }else {
          Iterator iterator = p0.entrySet().iterator();
          int i = 0;
          int i1 = 0;
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             try{
                int i2 = uEntry.getValue().p();
                i1 = i1 + i2;
                if (Integer.parseInt(uEntry.getKey()) >= 84) {
                   i = i + i2;
                }
             }catch(java.lang.Exception e11){
                j0.b("ad_apm", "hasFrozen, parse json failed ", e11);
                goto label_003d ;
             }
          }
          if ((i * 20) >= i1) {
             b = true;
          }
          return b;
       }
    }
    public void r(double p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uoe, "3")) {
          return;
       }
       this.g = false;
       if (p0 - null) {
          boolean i = (int)(0x3ff0000000000000 / p0);
          if (i > 0) {
             i = (!this.h.nextInt(i))? true: false;
             this.g = i;
          }
       }
       Object[] objArray = new Object[false];
       j0.a("ad_apm", this.k()+" init sample,rate = "+p0+",isHit = "+this.g, objArray);
       return;
    }
    public final boolean s(String p0,Activity p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0 != null && p1 != null) {
          return i;
       }
       Object[] objArray = new Object[i];
       j0.c("ad_apm", "section:"+p0+", activity:"+p1, objArray);
       return true;
    }
    public void t(){
    }
    public void u(){
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, e.class, "19")) {
          return;
       }
       Iterator iterator = this.j().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          try{
             long l = Long.parseLong(uEntry.getKey());
             int i = uEntry.getValue().p();
             if (this.e - l < 0) {
                this.e = l;
             }
             if (l - 84 > 0) {
                l = l * (long)i;
                long l1 = this.f + l;
                this.f = l1;
             }
          }catch(java.lang.Exception e1){
             j0.b("ad_apm", "init Fps json failed ", e1);
             goto label_0018 ;
          }
       }
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       int i = 0;
       if (this.z()) {
          Object[] objArray = new Object[i];
          j0.f("ad_apm", this.k()+" should not report", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          j0.f("ad_apm", this.k()+" should report: ", objArray1);
          c$a uoa = c$a.b();
          uoa.d(this.f());
          uoa.g(this.n());
          uoa.e(this.g());
          uoa.h(this.k());
          uoa.f(this.c());
          j0.g(uoa.a());
          this.u();
          return;
       }
    }
    public void x(){
       this.c = null;
       this.e = 0;
       this.f = 0;
    }
    public boolean y(){
       return true;
    }
    public boolean z(){
       boolean b = (this.c == null)? true: false;
       return b;
    }
}
