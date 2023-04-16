package ot1.g;
import yh3.a;
import ot1.g$c;
import nsd.u;
import zs1.b;
import du1.d;
import ut1.d;
import hu1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import cu1.d;
import ot1.g$a;
import z0.a;
import androidx.lifecycle.Transformations;
import ot1.g$b;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import zh3.d;
import zh3.b;
import ot1.g$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import ot1.h;
import ot1.i;
import erd.g;
import crd.b;
import androidx.lifecycle.Observer;
import lnc.b9;
import ut1.k;
import ut1.f;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import java.util.List;
import ot1.j;
import ot1.j$a;
import st1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import et1.e;
import et1.c;
import java.lang.Runnable;
import java.util.concurrent.Future;
import pu1.g;
import pu1.m;
import ut1.a;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import p63.a;
import p63.a$a;
import p63.a$b;
import o63.d;
import ot1.j$b;
import et1.d;

public final class g extends a	// class@003586
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveEvent e;
    public final b f;
    public boolean g;
    public b h;
    public final Observer i;
    public final b j;
    public final d k;
    public final d l;
    public final c m;
    public static final g$c n;

    static {
       g.n = new g$c(null);
    }
    public void g(b p0,d p1,d p2,c p3){
       a.p(p0, "coreModel");
       a.p(p1, "renderDelegate");
       a.p(p2, "countDownModel");
       a.p(p3, "renderModel");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       LiveData liveData = Transformations.map(d.a(p0.l()), new g$a(this));
       String str = "Transformations.map\(this\) { transform\(it\) }";
       a.h(liveData, str);
       liveData = Transformations.distinctUntilChanged(d.a(liveData));
       String str1 = "Transformations.distinctUntilChanged\(this\)";
       a.h(liveData, str1);
       this.a = liveData;
       LiveData liveData1 = Transformations.map(d.a(p0.l()), new g$b(this));
       a.h(liveData1, str);
       liveData1 = Transformations.distinctUntilChanged(d.a(liveData1));
       a.h(liveData1, str1);
       this.b = liveData1;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.d = mutableLiveD;
       c uoc = new c();
       this.p0(uoc);
       this.e = uoc;
       d uod = new d();
       this.q0(uod);
       this.f = uod;
       g$d uod1 = new g$d(this);
       this.i = uod1;
       if (!p1.e()) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, g.class, "9")) {
             t ot = p1.a2();
             if (ot != null) {
                ot = ot.throttleFirst(1500, TimeUnit.MILLISECONDS, d.a);
                if (ot != null) {
                   objArray = ot.subscribe(new h(this), i.b);
                }
             }
             this.h = objArray;
             p3.d().observeForever(uod1);
          }
       }
       return;
    }
    public void onCleared(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "1")) {
          return;
       }
       if (!this.k.e() && !PatchProxy.applyVoid(objArray, this, og, "10")) {
          this.t0(this.f).q();
          b9.a(this.h);
          this.m.d().removeObserver(this.i);
       }
       return;
    }
    public final String u0(k p0,f p1){
       String str;
       QCurrentUser obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.d()) {
          p1 = p1.n;
          if (p1 != null) {
             obj = QCurrentUser.ME;
             a.o(obj, "QCurrentUser.ME");
             String id = obj.getId();
             a.o(id, "QCurrentUser.ME.id");
             if (p1.contains(Long.valueOf(Long.parseLong(id))) == true) {
                str = String.valueOf(p0.g());
             label_0045 :
                return str;
             }
          }
       }
       str = p0.b();
       goto label_0045 ;
    }
    public final b v0(){
       return this.f;
    }
    public final LiveData w0(){
       return this.c;
    }
    public final LiveData x0(){
       return this.d;
    }
    public final LiveEvent y0(){
       return this.e;
    }
    public void z0(j p0){
       e0 obj1;
       j$a a;
       c obj2;
       a uoa1;
       boolean b = this;
       c obj = p0;
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, og, "3")) {
          return;
       }
       a.p(obj, "intent");
       Object[] objArray = null;
       if (obj instanceof j$a) {
          obj1 = obj;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, og, "5")) {
             if (!PatchProxy.applyVoid(objArray, b, og, "8")) {
                obj2 = b.j.z();
                ClientContent$LiveStreamPackage liveStreamPa1 = b.k.a();
                e0 uoe0 = b.k.i();
                ClientContent$LiveStreamPackage liveStreamPa2 = liveStreamPa1;
                e0 uoe01 = uoe0;
                e0 uoe02 = uoe0;
                ClientContent$LiveStreamPackage liveStreamPa3 = liveStreamPa1;
                if (!PatchProxy.applyVoidThreeRefs(obj2, liveStreamPa2, uoe01, null, e.class, "2")) {
                   a.p(obj2, "liveMultiPkLogInfo");
                   a.p(liveStreamPa3, "liveStreamPackage");
                   a.p(uoe02, "logPage");
                   g.a(new c(obj2, uoe02, liveStreamPa3));
                }
             }
             if (m.m(b.j)) {
                if (!PatchProxy.applyVoid(null, b, og, "6")) {
                   f value = b.j.l().getValue();
                   if (value != null) {
                      a uoa = value.j();
                      if (uoa != null) {
                         String str = uoa.b();
                         if (str != null) {
                            b.k.T(str);
                         }
                      }
                   }
                }
             }else {
                a = obj1.a;
                if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(a), b, og, "7")) {
                   k ok = d.h(b.j.l().getValue(), b.k.d(), a);
                   if (ok != null) {
                      LiveCommonLogTag mULTI_PK = LiveCommonLogTag.MULTI_PK;
                      b.Z(mULTI_PK, "openContributePanelIntent "+ok.c());
                      if (!ok.c()) {
                         ok = null;
                      }
                      if (ok != null) {
                         f value1 = b.j.l().getValue();
                         String str1 = ok.e();
                         String str2 = b.k.j1();
                         obj2 = PatchProxy.applyThreeRefs(value1, str1, str2, null, d.class, "10");
                         if (obj2 != PatchProxyResult.class) {
                            uoa1 = obj2;
                         }else {
                            a.p(str2, "userInfo");
                            if (value1 != null) {
                               int i = (value1.h() == 1)? 1: 2;
                               a$a uoa2 = a.b.a().a("multiPkId", value1.e());
                               if (str1 == null) {
                                  str1 = "";
                               }
                               uoa1 = uoa2.a("teamId", str1).a("pkMode", String.valueOf(i)).a("currentUser", str2).b();
                            }else {
                               uoa1 = null;
                            }
                         }
                         if (uoa1 != null) {
                            b.k.r1(uoa1);
                         }else {
                            b.Z(mULTI_PK, "openContributePanelIntent param error");
                         }
                      }
                   }
                }
             }
          }
       }
    label_016c :
       if (obj instanceof j$b && (!PatchProxy.applyVoid(null, b, og, "4") && b.g == null)) {
          b.g = true;
          obj = b.j.z();
          ClientContent$LiveStreamPackage liveStreamPa = b.k.a();
          obj1 = b.k.i();
          if (!PatchProxy.applyVoidThreeRefs(obj, liveStreamPa, obj1, null, e.class, "1")) {
             a.p(obj, "liveMultiPkLogInfo");
             a.p(liveStreamPa, "liveStreamPackage");
             a.p(obj1, "logPage");
             g.a(new d(obj, obj1, liveStreamPa));
          }
       }
       return;
    }
}
