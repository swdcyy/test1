package com.yxcorp.gifshow.lelink.ScreencastManager;
import c0b.e;
import com.yxcorp.gifshow.lelink.ScreencastManager$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.lelink.ScreencastManager$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.lelink.ScreencastManager$mHandler$2;
import java.util.ArrayList;
import com.yxcorp.gifshow.lelink.ScreencastManager$h;
import com.yxcorp.gifshow.lelink.ScreencastManager$b;
import com.yxcorp.gifshow.lelink.ScreencastManager$c;
import com.yxcorp.gifshow.screencast.ScreencastStatus;
import com.yxcorp.gifshow.lelink.ScreencastManager$j;
import com.yxcorp.gifshow.lelink.ScreencastManager$i;
import b0b.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import cgc.a;
import tkd.b;
import tkd.d;
import cgc.c;
import java.lang.Float;
import com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper;
import c0b.d;
import wza.a;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import q87.c;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import xza.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Handler;
import java.lang.Number;
import com.yxcorp.gifshow.lelink.ScreencastManager$d;
import cgc.b;
import kotlin.jvm.internal.a;
import wza.b;
import com.yxcorp.gifshow.lelink.ScreencastManager$e;
import com.hpplay.sdk.source.api.IBindSdkListener;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.lelink.screencast.KwaiScreencastSource;
import com.kwai.sdk.switchconfig.a;
import cgc.f;
import brd.t;
import cgc.e;
import io.reactivex.g;
import com.yxcorp.gifshow.lelink.ScreencastManager$f;
import com.yxcorp.gifshow.lelink.ScreencastManager$g;
import erd.g;
import crd.b;
import java.lang.Boolean;
import java.lang.Runnable;
import cgc.d;

public final class ScreencastManager implements e	// class@001a3c
{
    public final String a;
    public a b;
    public ScreencastManager$d c;
    public d d;
    public final p e;
    public List f;
    public a g;
    public boolean h;
    public boolean i;
    public final IBrowseListener j;
    public final ScreencastManager$b k;
    public ScreencastManager$c l;
    public ScreencastStatus m;
    public ScreencastStatus n;
    public long o;
    public long p;
    public QPhoto q;
    public String r;
    public boolean s;
    public boolean t;
    public b u;
    public final Runnable v;
    public final Runnable w;
    public final a x;
    public static final ScreencastManager$a A;
    public static final p y;
    public static boolean z;

    static {
       ScreencastManager.A = new ScreencastManager$a(null);
       ScreencastManager.y = s.b(LazyThreadSafetyMode.SYNCHRONIZED, ScreencastManager$Companion$instance$2.INSTANCE);
    }
    public void ScreencastManager(){
       super();
       this.a = "hpplay";
       this.e = s.c(ScreencastManager$mHandler$2.INSTANCE);
       this.f = new ArrayList();
       this.j = new ScreencastManager$h(this);
       this.k = new ScreencastManager$b(this);
       this.l = new ScreencastManager$c(this);
       ScreencastStatus uNSTART = ScreencastStatus.UNSTART;
       this.m = uNSTART;
       this.n = uNSTART;
       this.v = new ScreencastManager$j(this);
       this.w = new ScreencastManager$i(this);
       this.x = new a();
    }
    public void ScreencastManager(u p0){
       super();
       this.a = "hpplay";
       this.e = s.c(ScreencastManager$mHandler$2.INSTANCE);
       this.f = new ArrayList();
       this.j = new ScreencastManager$h(this);
       this.k = new ScreencastManager$b(this);
       this.l = new ScreencastManager$c(this);
       ScreencastStatus uNSTART = ScreencastStatus.UNSTART;
       this.m = uNSTART;
       this.n = uNSTART;
       this.v = new ScreencastManager$j(this);
       this.w = new ScreencastManager$i(this);
       this.x = new a();
    }
    public final void A(int p0){
       ScreencastManager screencastMa = ScreencastManager.class;
       if (PatchProxy.isSupport(screencastMa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, screencastMa, "23")) {
          return;
       }
       if (this.d() instanceof a) {
          d.a(-1990007504).B0(p0);
       }
       return;
    }
    public final void B(float p0){
       ScreencastManager screencastMa = ScreencastManager.class;
       if (PatchProxy.isSupport(screencastMa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, screencastMa, "21")) {
          return;
       }
       if (this.d() instanceof a) {
          d.a(-1990007504).iX(p0);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "28")) {
          return;
       }
       ScreencastFloatButtonHelper.b.b();
       this.g = null;
       this.n = ScreencastStatus.UNSTART;
       d.a(-1990007504).kG();
       this.s = false;
       this.p();
       this.o();
       this.q();
       d.a();
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "19")) {
          return;
       }
       if (this.d() instanceof a) {
          d.a(-1990007504).addVolume();
       }else {
          ScreencastManager tb = this.b;
          if (tb != null) {
             tb.addVolume();
          }
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "25")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a, "disconnectDevice: ", objArray);
       ScreencastManager tg = this.g;
       if (tg != null) {
          if (tg != null) {
             LelinkServiceInfo lelinkServic = tg.a();
             if (lelinkServic != null) {
                ScreencastManager tb = this.b;
                if (tb != null) {
                   tb.i(lelinkServic);
                }
             }
          }
          this.g = null;
          this.n = ScreencastStatus.UNSTART;
       }else {
          int i = -1990007504;
          if (d.a(i).W2() != null) {
             d.a(i).kG();
          }
       }
       this.q = null;
       this.s = false;
       this.p();
       this.o();
       this.q();
       d.a();
       return;
    }
    public final Object d(){
       ScreencastManager obj = PatchProxy.apply(null, this, ScreencastManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          a uoa = d.a(-1990007504).W2();
       }
       return obj;
    }
    public final QPhoto e(){
       return this.q;
    }
    public final Handler f(){
       Object obj = PatchProxy.apply(null, this, ScreencastManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final boolean g(){
       return this.s;
    }
    public final long h(){
       ScreencastManager obj = PatchProxy.apply(null, this, ScreencastManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.p;
       if (obj <= 0) {
          long l = d.a(-1990007504).Wc();
       }
       return obj;
    }
    public final ScreencastStatus i(){
       ScreencastStatus screencastSt;
       ScreencastManager obj = PatchProxy.apply(null, this, ScreencastManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d();
       if (obj instanceof a) {
          obj = this.n;
       }else if(obj instanceof a){
          screencastSt = d.a(-1990007504).Y3();
       }else {
          screencastSt = ScreencastStatus.UNSTART;
       }
       return obj;
    }
    public final a j(){
       return this.x;
    }
    public final void k(ScreencastManager$d p0,b p1){
       ScreencastManager tb;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ScreencastManager.class, "4")) {
          return;
       }
       a.p(p0, "screencastListener");
       KLogLelink$a e = KLogLelink.e;
       Object[] objArray = new Object[0];
       e.a().w(this.a, "initScreencastManager", objArray);
       if (this.b == null) {
          b uob = new b();
          this.b = uob;
          uob.j(new ScreencastManager$e(this));
       }
       if (this.h == null) {
          tb = this.b;
          if (tb != null) {
             tb.e();
          }
       }else {
          tb = this.b;
          if (tb != null) {
             tb.l(this.k, this.j, this.l);
          }
       }
       objArray = new Object[0];
       e.a().w(this.a, "listener: "+p0, objArray);
       this.c = p0;
       KwaiScreencastSource cORONA = KwaiScreencastSource.CORONA;
       if (!PatchProxy.applyVoidTwoRefs(this, cORONA, null, d.class, "1")) {
          a.p(this, "manager");
          a.p(cORONA, "from");
          d.a = this;
          d.b = cORONA;
       }
       if (a.t().d("multiscreenEnable", 0)) {
          if (!f.b()) {
             this.u = p1;
             this.l();
          }else if(p1 != null){
             d.a(-1990007504).JI(p1);
          }
       }
       return;
    }
    public final void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ScreencastManager.class, "7")) {
          return;
       }
       if (f.a) {
          objArray = new Object[0];
          KLogLelink.e.a().s("Kwaiscreencast", "has ongoing installation", objArray);
          return;
       }else {
          t ot = PatchProxy.apply(objArray, objArray, f.class, "3");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = t.create(e.b);
             a.o(ot, "Observable.create { emit¡­      }\n\n        }\)\n    }");
          }
          ot.subscribe(new ScreencastManager$f(this), new ScreencastManager$g(this));
          return;
       }
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "16")) {
          return;
       }
       if (this.d() instanceof a) {
          d.a(-1990007504).pause();
       }else {
          ScreencastManager tb = this.b;
          if (tb != null) {
             tb.pause();
          }
       }
       return;
    }
    public final void n(String p0,QPhoto p1,Object p2,int p3,Integer p4,Float p5,Boolean p6){
       ScreencastManager screencastMa = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       ScreencastManager screencastMa1 = ScreencastManager.class;
       int i = 0;
       if (PatchProxy.isSupport(screencastMa1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Integer.valueOf(p3),p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, screencastMa1, "13")) {
             return;
          }
       }
       a.p(p0, "url");
       a.p(p1, "photo");
       a.p(p2, "device");
       Object[] objArray1 = new Object[i];
       KLogLelink.e.a().w(screencastMa.a, "playURL url="+p0+"  device: "+p2, objArray1);
       screencastMa.q = oobject1;
       screencastMa.r = oobject;
       int i1 = -1990007504;
       if (oobject2 instanceof a) {
          if (d.a(i1).W2() != null) {
             d.a(i1).kG();
          }
          screencastMa.g = oobject2;
          ScreencastManager b = screencastMa.b;
          if (b != null) {
             b.k(p0, p3, oobject2.a());
          }
          this.f().removeCallbacks(screencastMa.v);
          screencastMa.n = ScreencastStatus.START;
          d.a(i1).VG(0);
          screencastMa.s = i;
          screencastMa.p = 0;
       }else if(oobject2 instanceof a){
          screencastMa1 = screencastMa.g;
          if (screencastMa1 != null) {
             if (screencastMa1 != null) {
                LelinkServiceInfo lelinkServic = screencastMa1.a();
                if (lelinkServic != null) {
                   ScreencastManager b1 = screencastMa.b;
                   if (b1 != null) {
                      b1.i(lelinkServic);
                   }
                }
             }
             screencastMa.g = null;
             screencastMa.n = ScreencastStatus.UNSTART;
          }
          d.a(i1).Ij(p0, p1, oobject2, p3, p4, p5, p6);
          this.f().removeCallbacks(screencastMa.v);
          screencastMa.p = 0;
          screencastMa.s = true;
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "15")) {
          return;
       }
       this.d = null;
       d.a(-1990007504).oS();
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "26")) {
          return;
       }
       this.f().removeCallbacksAndMessages(null);
       d.a(-1990007504).Wm();
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "5")) {
          return;
       }
       this.c = null;
       this.u = null;
       d.a(-1990007504).A50();
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "17")) {
          return;
       }
       if (this.d() instanceof a) {
          d.a(-1990007504).resume();
       }else {
          ScreencastManager tb = this.b;
          if (tb != null) {
             tb.resume();
          }
       }
       return;
    }
    public final void s(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "9")) {
          return;
       }
       int i = 0;
       if (this.h == null) {
          objArray = new Object[i];
          KLogLelink.e.a().w(this.a, "sdk not ready ", objArray);
          this.i = true;
          return;
       }else {
          objArray = new Object[i];
          KLogLelink.e.a().w(this.a, "searchDevices: ", objArray);
          this.x();
          ScreencastManager tb = this.b;
          if (tb != null) {
             tb.b();
          }
          this.f().postDelayed(this.v, 0x7530);
          return;
       }
    }
    public final void t(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "8")) {
          return;
       }
       if (!f.b()) {
          Object[] objArray = new Object[0];
          KLogLelink.e.a().w("kwaiscreencast", "plugin not ready ", objArray);
          this.t = true;
          this.f().removeCallbacks(this.w);
          this.f().postDelayed(this.w, 0x7530);
          return;
       }else {
          d.a(-1990007504).cb();
          return;
       }
    }
    public final void u(int p0){
       ScreencastManager screencastMa = ScreencastManager.class;
       if (PatchProxy.isSupport(screencastMa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, screencastMa, "18")) {
          return;
       }
       if (this.d() instanceof a) {
          d.a(-1990007504).seekTo((long)p0);
       }else {
          screencastMa = this.b;
          if (screencastMa != null) {
             screencastMa.seekTo(p0);
          }
       }
       return;
    }
    public final void v(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScreencastManager.class, "14")) {
          return;
       }
       a.p(p0, "screencastPlayerListener");
       this.d = p0;
       if (a.t().d("multiscreenEnable", false)) {
          if (f.b()) {
             d.a(-1990007504).Uh(p0);
          }else {
             this.l();
          }
       }
       return;
    }
    public final void w(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "24")) {
          return;
       }
       if (this.d() instanceof a) {
          d.a(-1990007504).stop();
       }else {
          ScreencastManager tb = this.b;
          if (tb != null) {
             tb.stop();
          }
          this.n = ScreencastStatus.END;
       }
       this.q = null;
       return;
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a, "stopSearchDevices: ", objArray);
       ScreencastManager tb = this.b;
       if (tb != null) {
          tb.a();
       }
       return;
    }
    public final void y(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager.class, "20")) {
          return;
       }
       if (this.d() instanceof a) {
          d.a(-1990007504).subVolume();
       }else {
          ScreencastManager tb = this.b;
          if (tb != null) {
             tb.subVolume();
          }
       }
       return;
    }
    public final void z(boolean p0){
       ScreencastManager screencastMa = ScreencastManager.class;
       if (PatchProxy.isSupport(screencastMa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, screencastMa, "22")) {
          return;
       }
       if (this.d() instanceof a) {
          d.a(-1990007504).Z(p0);
       }
       return;
    }
}
