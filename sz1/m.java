package sz1.m;
import sz1.e;
import lp3.a;
import mrd.a;
import sz1.m$a;
import xo1.i;
import sz1.d;
import vz1.a;
import eh3.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xg3.a;
import lp3.e;
import v51.a;
import lp3.c;
import hf3.a;
import ee1.a;
import xp5.g;
import gh3.a;
import c02.a;
import ih3.b;
import ih3.a;
import wz1.f;
import yg3.a$a;
import yg3.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import sz1.k;
import java.util.Objects;
import com.kuaishou.live.multiinteract.rtc.b;
import mh3.d;
import bh3.l;
import lh3.b;
import ah3.v;
import ch3.t;
import fh3.o;
import eh3.l;
import com.kuaishou.live.multiinteract.mediastream.d;
import com.kuaishou.live.common.multiinteract.biz.adapter.a;
import lh3.c;
import sz1.l;
import msd.a;
import uz1.a;
import vz1.b;
import ch3.d;
import sz1.n;
import xv4.i;
import sz1.o;
import lh3.i0;
import com.kuaishou.live.common.core.component.livestage.LiveStageInit;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import xo1.e;
import oe3.e;
import java.lang.Boolean;
import je3.i;
import hh3.d;
import hh3.c;
import oh3.a;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import bh3.s;
import lf3.g;
import fh3.t;
import eh3.q;
import kh3.b;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager;
import bh3.d;
import bh3.f;
import fh3.d;
import fh3.f;
import ah3.d;
import ah3.e;
import ch3.c;
import com.kuaishou.live.livestage.g;
import xz1.a;
import sz1.p;
import android.util.Size;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import sz1.h;
import sz1.i;
import sz1.j;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatResolutionConfig;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w51.a;
import xf6.l;
import uz1.b;
import tz1.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import androidx.lifecycle.LiveData;
import nh3.b;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import sz1.g;
import ok.h;
import java.util.ArrayList;
import fg6.a;
import com.google.gson.Gson;

public abstract class m extends a implements e	// class@003d4c
{
    public a d;
    public g e;
    public a f;
    public a g;
    public a h;
    public f i;
    public b j;
    public a k;
    public LiveInteractStateManager l;
    public a m;
    public g n;
    public i o;
    public b p;
    public c q;
    public b r;
    public c s;
    public i t;
    public i0 u;
    public long v;
    public int w;
    public final a x;

    public void m(){
       super();
       this.s = a.g();
       this.v = 0;
       this.w = 0;
       this.x = new m$a(this);
    }
    public i B5(){
       return d.a(this);
    }
    public a Oc(){
       return this.j;
    }
    public e Q9(){
       Object obj = PatchProxy.apply(null, this, m.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.f;
    }
    public void Qo(){
       boolean b;
       a$a obj1;
       a uoa = this;
       m om = m.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, uoa, om, str)) {
          return;
       }
       uoa.d = this.Po().a(a.class).u();
       uoa.m = this.Po().a(a.class);
       uoa.e = this.Po().a(g.class);
       uoa.f = this.To();
       a uoa1 = new a(uoa.e);
       uoa.g = uoa1;
       uoa.k = new a();
       uoa.r = new b(uoa1);
       String str1 = "2";
       if (!PatchProxy.applyVoid(objArray, uoa, om, "4")) {
          f uof = new f(uoa.m);
          uoa.i = uof;
          m k = uoa.k;
          m f = uoa.f;
          m d = uoa.d;
          m r = uoa.r;
          a$a uoa2 = a$a.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          a obj = PatchProxy.apply(objArray, uoa, om, "5");
          int i = 0;
          if (obj != patchProxyRe) {
          }else {
             b = a.t().u("SOURCE_LIVE").d("enableVerifySwitchBizVersion", i);
             obj1 = PatchProxy.apply(objArray, objArray, uoa2, str);
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = new a$a();
             }
             obj1.a = b;
             obj1.b = new k(uoa);
             obj1.c = this.xh();
             obj = PatchProxy.apply(objArray, obj1, uoa2, str1);
             if (obj != patchProxyRe) {
             }else {
                obj = new a(obj1);
             }
          }
          obj1 = obj;
          Objects.requireNonNull(k);
          obj = a.class;
          if (PatchProxy.isSupport(obj)) {
             Object[] objArray1 = new Object[]{uof,f,d,r,obj1};
             if (PatchProxy.applyVoid(objArray1, k, obj, str)) {
             label_0124 :
                this.Uo();
                a uoa3 = new a(uoa.i, uoa.f, uoa.k.d(), uoa.k.g(), uoa.e, new l(uoa), uoa.r);
                uoa.h = obj;
                obj.M(uoa.x);
                uoa.j = new b(uoa.k.g(), uoa.k.e());
                n on = new n(uoa);
                uoa.t = on;
                uoa.m.p2(on);
                uoa.u = new o(uoa);
                this.gc().m(uoa.u);
             }
          }
          b uob = new b(d, uof, f, r, obj1);
          k.a = obj;
          k.b = new l(d, obj, r);
          k.c = new v(d, k.a, r);
          k.d = new t(d, k.a, r);
          k.e = new o(d, k.a, r);
          k.f = new l(d, k.a, r);
          k.g = new d(d, k.a);
          goto label_0124 ;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, LiveStageInit.class, str1)) {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          b = uoc.c();
          b.P(LiveStageInit.a, "enableNewInfra = "+LiveStageInit.c);
          boolean b1 = LiveStageInit.b;
          e uoe = new e(b);
          if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), Boolean.valueOf(b1), uoe, null, e.class, "1")) {
             a.p(uoe, "logger");
             e.a = uoe;
             e.c = b1;
             e.b = b;
          }
       }
       return;
    }
    public i Rf(){
       return this.o;
    }
    public void Ro(){
       a a;
       Iterator iterator;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "3")) {
          return;
       }
       String str = "7";
       if (!PatchProxy.applyVoid(objArray, this, om, str)) {
          if (this.q != null) {
             this.k.c().g(this.q);
          }
          this.m.Y2(this.t);
          this.gc().h(this.u);
          om = this.k;
          Objects.requireNonNull(om);
          String str1 = "2";
          if (!PatchProxy.applyVoid(objArray, om, a.class, str1)) {
             a b = om.b;
             Objects.requireNonNull(b);
             String str2 = "1";
             if (!PatchProxy.applyVoid(objArray, b, l.class, str2)) {
                b.P();
                iterator = b.e.values().iterator();
                while (iterator.hasNext()) {
                   iterator.next().b();
                }
                b.e.clear();
             }
             b = om.c;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(objArray, b, v.class, str2)) {
                b.P();
                b.T(0);
                b.S();
             }
             b = om.d;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(objArray, b, t.class, str2)) {
                b.P();
                b.V(0);
                b.S();
             }
             b = om.e;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(objArray, b, o.class, str1)) {
                b.b.o(772, b.h);
                b.b.o(1033, b.i);
                b.d.h(b.j);
                b.P();
                iterator = b.f.values().iterator();
                while (iterator.hasNext()) {
                   iterator.next().b();
                }
                b.f.clear();
             }
             b = om.f;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(objArray, b, l.class, str1)) {
                b.b.o(869, b.h);
                b.d.h(b.i);
                b.P();
                iterator = b.f.values().iterator();
                while (iterator.hasNext()) {
                   iterator.next().b();
                }
                b.f.clear();
             }
             a = om.a;
             Objects.requireNonNull(a);
             b uob = b.class;
             if (!PatchProxy.applyVoid(objArray, a, uob, "46")) {
                if (!PatchProxy.applyVoid(objArray, a, uob, str1)) {
                   a.m.o(943, a.d);
                   a.m.o(944, a.e);
                   a.m.o(775, a.f);
                   a.m.o(776, a.g);
                }
                a.k();
                a.c.clear();
                a.k = -1;
                a.h = false;
                b p = a.p;
                Objects.requireNonNull(p);
                if (!PatchProxy.applyVoid(objArray, p, b.class, "9")) {
                   p.d();
                }
             }
          }
       label_018d :
          om = this.i;
          Objects.requireNonNull(om);
          if (!PatchProxy.applyVoid(objArray, om, f.class, "9")) {
             om.c.clear();
          }
          om = this.h;
          Objects.requireNonNull(om);
          if (!PatchProxy.applyVoid(objArray, om, a.class, "11")) {
             om.b.h(om.l);
             om.e = 0;
             om.f = "";
             om.P();
          }
          om = this.l;
          if (om != null && !PatchProxy.applyVoid(objArray, om, LiveInteractStateManager.class, str)) {
             if (!PatchProxy.applyVoid(objArray, om, LiveInteractStateManager.class, "4")) {
                om.k.L(om.d);
                om.l.H(om.e);
                om.m.E(om.f);
                om.n.d1(om.g);
                om.j.h(om.h);
             }
             om.P();
          }
          om = this.n;
          if (om != null) {
             om.release();
          }
          om = this.o;
          if (om != null) {
             om.release();
          }
          this.v = 0;
          this.w = 0;
       }
       return;
    }
    public a Sh(){
       Object obj = PatchProxy.apply(null, this, m.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          LiveInteractStateManager liveInteract = new LiveInteractStateManager(this.k.d(), this.k.b(), this.k.f(), this.k.a(), this.k.e());
          this.l = obj;
       }
       return this.l;
    }
    public d Sj(){
       m om = m.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, om, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "19") && this.q == null) {
          this.q = new p(this);
          this.k.c().z(this.q);
       }
       return this.k.c();
    }
    public Size So(){
       Object obj = PatchProxy.apply(null, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Size(0, 0);
    }
    public e Tk(){
       Object obj = PatchProxy.apply(null, this, m.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.a();
    }
    public abstract a To();
    public d Um(){
       Object obj = PatchProxy.apply(null, this, m.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.e();
    }
    public abstract void Uo();
    public f V7(){
       Object obj = PatchProxy.apply(null, this, m.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.b();
    }
    public void Vo(){
       InteractiveChatResolutionConfig obj;
       boolean b;
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "8")) {
          return;
       }
       b uob = this.gc();
       SCInteractiveChatRoomInfo sCInteractiv = (uob != null)? uob.b(): objArray;
       if (sCInteractiv == null) {
          b.Z(LiveLogTag.LIVE_MULTI_INTERACT, "tryUpdateRtcPushResolution, roomInfo is null");
          return;
       }else {
          InteractiveChatResolutionConfig interactiveC = k0.c(sCInteractiv, h.a, i.a, j.a).orNull();
          LiveLogTag lIVE_MULTI_I = LiveLogTag.LIVE_MULTI_INTERACT;
          b.d0(lIVE_MULTI_I, "tryUpdateRtcPushResolution", "resolutionConfig", interactiveC, "mCurrentResolutionLevel", Integer.valueOf(this.w));
          if (interactiveC != null && (TextUtils.n(String.valueOf(interactiveC.userId), QCurrentUser.ME.getId()) && (uob.a(String.valueOf(interactiveC.userId)) && this.w != interactiveC.level))) {
             if (interactiveC.width == 180) {
                obj = PatchProxy.apply(objArray, objArray, a.class, "99");
                b = (obj != PatchProxyResult.class)? obj.booleanValue(): l.c("key_downscale_rtc_push_size_1_4_low", 0);
                if (b) {
                   interactiveC.level = 1;
                }
             }
             b.c0(lIVE_MULTI_I, "tryUpdateRtcPushResolution", "level", Integer.valueOf(interactiveC.level));
             obj = interactiveC.level;
             this.w = obj;
             if (obj != 1) {
                i = 2;
                if (obj != i) {
                   if (obj != 3) {
                      if (obj == 4) {
                         this.m.T1(3);
                      }
                   }else {
                      this.m.T1(i);
                   }
                }else {
                   this.m.T1(1);
                }
             }else {
                this.m.T1(0);
             }
          }
       label_00c6 :
          return;
       }
    }
    public b Wi(){
       return this.h;
    }
    public b b7(){
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, m.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.n == null) {
          return objArray;
       }
       obj = this.p;
       if (obj == null) {
          this.p = new b(new WeakReference(this.n));
       }else {
          obj.a = new WeakReference(this.n);
       }
       return this.p;
    }
    public b gc(){
       Object obj = PatchProxy.apply(null, this, m.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.d();
    }
    public f od(){
       Object obj = PatchProxy.apply(null, this, m.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.f();
    }
    public int si(){
       return this.w;
    }
    public g vi(){
       return this.n;
    }
    public boolean xh(){
       return false;
    }
    public Map zg(){
       HashMap obj = PatchProxy.apply(null, this, m.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (!this.Wi().n()) {
          return obj;
       }
       obj.put("biz_session_id", TextUtils.k(this.Wi().F()));
       obj.put("biz_type", Integer.valueOf(this.Wi().n()));
       obj.put("session_id", TextUtils.k(this.gc().I1(this.e.d())));
       obj.put("chat_id", TextUtils.k(this.gc().f()));
       b value = this.gc().c().getValue();
       if (value != null && !q.f(value.f())) {
          ArrayList uArrayList = new ArrayList();
          m.s(value.f()).F(g.b).n(uArrayList);
          String str = a.a.q(uArrayList);
          obj.put("online_user", str);
       }
       return obj;
    }
}
