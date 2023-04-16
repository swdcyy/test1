package ee1.i0;
import ee1.a;
import lp3.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import z1.k;
import ee1.z0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ee1.a0;
import java.lang.Integer;
import ok.h;
import android.graphics.Bitmap;
import ee1.u;
import java.util.Objects;
import wv4.d1;
import wv4.a;
import com.kuaishou.aryainstance.config.SnowConfig;
import tv4.a;
import java.lang.Boolean;
import ee1.j;
import z1.a;
import xv4.h;
import java.util.Set;
import ee1.i;
import ee1.b;
import com.kuaishou.android.live.log.b;
import java.util.concurrent.atomic.AtomicReference;
import ee1.f0;
import ee1.q;
import ee1.t;
import ee1.p;
import ee1.m;
import java.lang.IllegalStateException;
import java.lang.RuntimeException;
import d61.m;
import xv4.e;
import wv4.i1;
import bw4.a;
import yv4.d;
import ee1.n;
import ee1.l;
import ee1.v;
import wv4.f1;
import xv4.i;
import ee1.l0;
import b35.d;
import ee1.o;
import ee1.g;
import tr.d;
import cw4.b;
import jw4.a;
import jw4.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import ee1.d;
import ee1.e0;
import ee1.c;
import ee1.e;
import java.lang.Long;
import ee1.c0;
import ee1.r;
import ee1.w;
import com.kuaishou.rtc.model.SnowRtcConstants$VoicePartyBusinessScene;
import ee1.h0;
import ee1.f;
import ee1.h;
import ee1.s;
import ee1.k;
import ee1.d0;
import ee1.b0;
import ee1.k0;
import ee1.z;
import ee1.x;
import xv4.g;
import ee1.g0;

public class i0 extends a implements a	// class@00210a
{
    public d1 d;
    public k e;
    public String f;
    public final z0 g;
    public static final List h;
    public static final boolean i;

    static {
       i0.h = LiveLogTag.LIVE_RTC.appendTag("LiveRTCServiceImpl");
    }
    public void i0(k p0){
       super();
       this.g = new z0();
       this.e = p0;
    }
    public int A0(){
       Object obj = PatchProxy.apply(null, this, i0.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.To(this.d, a0.b, Integer.valueOf(-1)).intValue();
    }
    public int Af(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i0.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.To(this.d, new u(this, p0), Integer.valueOf(-1)).intValue();
    }
    public List C3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       i0 obj = PatchProxy.apply(objArray, this, i0.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, d1.class, "11");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else if(obj.C()){
             objArray = obj.a.v(obj.c, obj.j.appUserId);
          }
       }
       return objArray;
    }
    public void D5(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "30")) {
          return;
       }
       this.Uo(this.d, new j(p0));
       return;
    }
    public void E2(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "14")) {
          return;
       }
       i0 tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(p0, tg, z0.class, "1")) {
          tg.b.add(p0);
       }
       return;
    }
    public void F0(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "22")) {
          return;
       }
       this.Uo(this.d, new i(p0));
       return;
    }
    public void F2(int p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi0, "13")) {
          return;
       }
       this.So(this.d, new b(p0));
       return;
    }
    public String Fc(String p0,String p1,String p2){
       i0 oi0 = this;
       f0 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, i0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.V(i0.h, "connect", "bizKey", p0, "token", p1, "bizProperty", p2, "mKsRtcEngine", oi0.d);
       AtomicReference uAtomicRefer = new AtomicReference("");
       obj = new f0(this, p2, uAtomicRefer, p1, p0);
       oi0.Uo(oi0.d, v9);
       return uAtomicRefer.get();
    }
    public void L4(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "15")) {
          return;
       }
       i0 tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(p0, tg, z0.class, "2")) {
          tg.b.remove(p0);
       }
       return;
    }
    public void O4(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "7")) {
          return;
       }
       this.Uo(this.d, new q(p0));
       return;
    }
    public void Pi(){
       if (PatchProxy.applyVoid(null, this, i0.class, "28")) {
          return;
       }
       this.Uo(this.d, t.a);
       return;
    }
    public void Ro(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i0.class, "1")) {
          return;
       }
       b.S(i0.h, "onDestroy", "mKsRtcEngine", this.d);
       i0 td = this.d;
       if (td != null) {
          td.release();
       }
       td = this.g;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, z0.class, "6")) {
          td.a.clear();
          td.b.clear();
       }
       return;
    }
    public final void So(d1 p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i0.class, "47")) {
          return;
       }
       if (p0 != null) {
          p1.accept(p0);
       }
       return;
    }
    public void T(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "6")) {
          return;
       }
       this.Uo(this.d, new p(p0));
       return;
    }
    public void T1(int p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi0, "40")) {
          return;
       }
       this.Uo(this.d, new m(p0));
       return;
    }
    public final Object To(Object p0,h p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, i0.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return p1.apply(p0);
       }
       m.b(new IllegalStateException("KsRtcEngine is null £¡£¡£¡"));
       return p2;
    }
    public final void Uo(d1 p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i0.class, "45")) {
          return;
       }
       if (p0 != null) {
          p1.accept(p0);
       }else {
          m.b(new IllegalStateException("KsRtcEngine is null £¡£¡£¡"));
       }
       return;
    }
    public final void Vo(d1 p0){
       d1 uod1 = d1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "49")) {
          return;
       }
       if (p0 == null) {
          b.P(i0.h, "unregisterRtcListener , engine is null");
          return;
       }else {
          e uoe = this.g.a();
          if (!PatchProxy.applyVoidOneRefs(uoe, p0, uod1, "38")) {
             p0.e.remove(uoe);
          }
          h oh = this.g.b();
          if (!PatchProxy.applyVoidOneRefs(oh, p0, uod1, "41")) {
             p0 = p0.i;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(oh, p0, i1.class, "3")) {
                i1 a = p0.a;
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoidOneRefs(oh, a, a.class, "4")) {
                   a.g.remove(oh);
                }
             }
          }
          return;
       }
    }
    public void X(boolean p0,d p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oi0, "20")) {
          return;
       }
       this.Uo(this.d, new n(p0, p1));
       return;
    }
    public void X0(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "32")) {
          return;
       }
       this.Uo(this.d, new l(p0));
       return;
    }
    public int Y(){
       Object obj = PatchProxy.apply(null, this, i0.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.To(this.d, v.b, Integer.valueOf(-1)).intValue();
    }
    public void Y0(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "21")) {
          return;
       }
       oi0 = this.d;
       if (oi0 != null) {
          Objects.requireNonNull(oi0);
          d1 uod1 = d1.class;
          if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), oi0, uod1, "15")) {
             d1 h = oi0.h;
             Objects.requireNonNull(h);
             f1 uof1 = f1.class;
             if (!PatchProxy.isSupport(uof1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), h, uof1, "4")) {
                h.a.Y0(p0);
             }
          }
       }
       return;
    }
    public void Y2(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "18")) {
          return;
       }
       i0 tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(p0, tg, z0.class, "4")) {
          z0 a = tg.a;
          Objects.requireNonNull(a);
          d.a(p0, new l0(a));
       }
       return;
    }
    public void Z(boolean p0,boolean p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oi0, "38")) {
          return;
       }
       this.Uo(this.d, new o(p0, p1));
       return;
    }
    public void Z0(String p0,boolean p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi0, "25")) {
          return;
       }
       this.Uo(this.d, new g(p0, p1));
       return;
    }
    public void Zf(d p0,b p1){
       i0 oi0 = i0.class;
       String str = "2";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oi0, str)) {
          return;
       }
       String str1 = this.e.get();
       i0 td = this.d;
       if (td != null) {
          b.T(i0.h, "ksRtcEngine is not null when setup!!!!!!", "biz", this.f, "mKsRtcEngine", td);
          i0 tf = this.f;
          if (tf == null) {
             this.Vo(this.d);
             this.d.release();
          }else {
             this.ab(tf, true);
          }
       }
       d1 uod1 = e.a(str1, p0).g(p1);
       this.d = uod1;
       d1 uod11 = d1.class;
       if (!PatchProxy.applyVoidOneRefs(uod1, this, oi0, "48")) {
          if (uod1 == null) {
             b.P(i0.h, "registerRtcListener , engine is null");
          }else {
             e uoe = this.g.a();
             if (!PatchProxy.applyVoidOneRefs(uoe, uod1, uod11, "37")) {
                uod1.e.add(uoe);
             }
             h oh = this.g.b();
             if (!PatchProxy.applyVoidOneRefs(oh, uod1, uod11, "40")) {
                uod1 = uod1.i;
                Objects.requireNonNull(uod1);
                if (!PatchProxy.applyVoidOneRefs(oh, uod1, i1.class, str)) {
                   i1 a = uod1.a;
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidOneRefs(oh, a, a.class, "5")) {
                      a.g.add(oh);
                   }
                }
             }
          }
       }
       b.S(i0.h, "setupRTCServiceWithRTCConfig", "mKsRtcEngine", this.d);
       return;
    }
    public boolean ab(String p0,boolean p1){
       boolean b;
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, oi0, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b.V(i0.h, "disconnect", "bizKey", p0, "isSyncRelease", Boolean.valueOf(p1), "mCurrentBizKey", this.f, "mKsRtcEngine", this.d);
       oi0 = this.d;
       b = false;
       if (oi0 == null) {
          return b;
       }else {
          i0 tf = this.f;
          if (tf == null || TextUtils.equals(tf, p0)) {
             oi0.f0("subBiz", "", 1);
             b = oi0.F(2);
             this.f = null;
             if (p1) {
                this.Vo(oi0);
                oi0.release();
                this.d = null;
             }
          }
          return b;
       }
    }
    public void b0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "29")) {
          return;
       }
       this.Uo(this.d, new d(p0));
       return;
    }
    public void c1(Bitmap p0,int p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi0, "12")) {
          return;
       }
       b.T(i0.h, "inputRawImage", "bitmap", p0, "sourceId", Integer.valueOf(p1));
       this.Uo(this.d, new e0(p0, p1));
       return;
    }
    public void d1(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "19")) {
          return;
       }
       this.Uo(this.d, new c(p0));
       return;
    }
    public void f0(String p0,String p1,int p2){
       if (PatchProxy.isSupport(i0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, i0.class, "11")) {
          return;
       }
       this.Uo(this.d, new e(p0, p1, p2));
       return;
    }
    public void h0(long p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oi0, "8")) {
          return;
       }
       this.Uo(this.d, new c0(p0));
       return;
    }
    public void h1(){
       if (PatchProxy.applyVoid(null, this, i0.class, "27")) {
          return;
       }
       this.Uo(this.d, r.a);
       return;
    }
    public int i0(){
       Object obj = PatchProxy.apply(null, this, i0.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.To(this.d, w.b, Integer.valueOf(-1)).intValue();
    }
    public void i1(SnowRtcConstants$VoicePartyBusinessScene p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "37")) {
          return;
       }
       this.So(this.d, new h0(p0));
       return;
    }
    public int j(){
       i0 obj = PatchProxy.apply(null, this, i0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       if (obj != null) {
          return obj.j();
       }
       return 0;
    }
    public void k5(String p0,boolean p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi0, "24")) {
          return;
       }
       this.Uo(this.d, new f(p0, p1));
       return;
    }
    public void kh(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "39")) {
          return;
       }
       this.Uo(this.d, new h(p0));
       return;
    }
    public void l1(){
       if (PatchProxy.applyVoid(null, this, i0.class, "26")) {
          return;
       }
       this.Uo(this.d, s.a);
       return;
    }
    public void m1(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "31")) {
          return;
       }
       this.Uo(this.d, new k(p0));
       return;
    }
    public void m3(long p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oi0, "16")) {
          return;
       }
       this.Uo(this.d, new d0(p0));
       return;
    }
    public void n(int p0,int p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi0, "42")) {
          return;
       }
       this.Uo(this.d, new b0(p0, p1));
       return;
    }
    public void p2(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "17")) {
          return;
       }
       i0 tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(p0, tg, z0.class, "3")) {
          z0 a = tg.a;
          Objects.requireNonNull(a);
          d.a(p0, new k0(a));
       }
       return;
    }
    public int q0(){
       Object obj = PatchProxy.apply(null, this, i0.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.To(this.d, z.b, Integer.valueOf(-1)).intValue();
    }
    public boolean release(String p0){
       i0 obj = PatchProxy.applyOneRefs(p0, this, i0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       List h = i0.h;
       b.T(h, "release", "channelId", p0, "mKsRtcEngine", this.d);
       obj = this.d;
       if (obj == null) {
          return false;
       }
       if (!TextUtils.equals(p0, obj.t())) {
          b.T(h, "release: channelId not match", "input channelId", p0, "current channelId", obj.t());
          return false;
       }else {
          this.Vo(obj);
          obj.release();
          this.d = null;
          return true;
       }
    }
    public void x(int p0,int p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi0, "41")) {
          return;
       }
       this.Uo(this.d, new x(p0, p1));
       return;
    }
    public void x1(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "23")) {
          return;
       }
       this.Uo(this.d, new g0(p0));
       return;
    }
}
