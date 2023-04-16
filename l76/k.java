package l76.k;
import r97.a0;
import r97.c0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomStatEvent$CustomStatEventBiz;
import f3b.o;
import r97.s;
import r97.s$a;
import r97.i0;
import r97.h0;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import r97.t;
import r97.o;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import l76.m;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent$Type;
import l76.f;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent$Status;
import l76.h;
import r97.r;
import l76.e;
import com.google.gson.JsonObject;
import r97.g0;
import l76.i;
import lnc.i3;
import com.google.gson.JsonElement;
import k2b.u1;
import java.lang.Boolean;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import android.app.Activity;
import k2b.e0;
import k2b.e;
import k2b.y2;
import r97.p;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$CustomEvent$CustomEventBiz;
import l76.c;
import r97.z;
import r97.j0;
import com.yxcorp.gifshow.log.model.CommonParams;
import r97.d0;
import yb7.h;
import com.google.gson.c;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import com.google.common.collect.ImmutableMap;
import zv.b;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import zv.a;
import com.yxcorp.gifshow.log.model.StatMetaData;
import r97.t$a;
import r97.r$a;
import r97.i0$a;
import r97.u;
import ca7.f;
import l76.l;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.List;
import r97.u$a;
import l76.o;
import r97.q;
import r97.q$a;
import r97.p$a;
import r97.v;
import r97.v$a;
import com.google.common.base.Optional;
import l76.a;
import ok.h;
import java.util.Map;
import l76.j;
import e66.c;
import java.lang.Throwable;
import q87.c;
import java.lang.Exception;
import com.google.common.collect.ImmutableList$a;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import l76.d;
import ca7.r;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent$Type;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent$Type;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent$Direction;
import l76.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent$Status;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent$ShowType;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage$PageType;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage$Category;
import l76.g;
import k2b.k2;
import r97.a;
import okhttp3.EventListener$Factory;

public class k implements a0, c0	// class@001d60
{
    public static String a = "MATRIX";
    public static String b = "LONGINUS";

    public void k(){
       super();
    }
    public static int M(String p0){
       int i;
       ClientStat$CustomStatEvent$CustomStatEventBiz obj = PatchProxy.applyOneRefs(p0, null, k.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       if (!TextUtils.x(p0)) {
          i = o.h(ClientStat$CustomStatEvent$CustomStatEventBiz.class, p0);
       }
       return i;
    }
    public s A(String p0,String p1){
       s$a obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = s.b();
       obj.a(p0);
       obj.d(p1);
       return obj.c();
    }
    public void B(i0 p0,h0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "5")) {
          return;
       }
       if (("USER_OPERATION").equals(p0.p())) {
          this.r(p0, p1);
       }else {
          this.D(p0, p1, null, null, null);
       }
       return;
    }
    public void C(t p0,h0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "4")) {
          return;
       }
       f uof = new f(this, p0, p1, o.h(ClientEvent$ShowEvent$Type.class, p0.i()), m.i(p0.d()));
       k1.o(v0);
       return;
    }
    public void D(i0 p0,h0 p1,ClientTaskDetail$TaskDetailPackage p2,ClientEvent$ResultPackage p3,ClientEvent$AreaPackage p4){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, ok, "36")) {
             return;
          }
       }else {
          int i = this;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = TextUtils.I(p0.k());
       h oh = new h(this, p0, o.h(ClientEvent$TaskEvent$Status.class, p0.n()), p0.l(), uElementPack, p2, p3, p4, m.i(p0.d()), p1);
       k1.o(ok);
       return;
    }
    public void E(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "6")) {
          return;
       }
       k1.o(new e(this, p0, k.M(p0.a())));
       return;
    }
    public void F(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "37")) {
          return;
       }
       try{
          g0 og0 = m.d(p0, "H5");
          if (!og0.d()) {
             return;
          }else {
             k1.o(new i(og0));
          }
       }catch(java.lang.Exception e0){
          if (p0 != null) {
             i3 oi3 = i3.f();
             oi3.d("data_info", p0.toString());
             String str = oi3.e();
             u1.R("DATA_H5_CLOSE_CO_PAGE_NAME_NPE", str, 1);
          }
       }
       return;
    }
    public void G(h0 p0,String p1,boolean p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, k.class, "19")) {
          return;
       }
       int i = 0x4b316083;
       if (p2) {
          b.a(i).A0(this.J(p0), e.a(p0), p1);
       }else {
          b.a(i).q(this.J(p0), e.a(p0), p1);
       }
       return;
    }
    public void H(p p0){
       int i;
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, "7")) {
          return;
       }
       String str = p0.biz();
       Object obj = PatchProxy.applyOneRefs(str, null, ok, "26");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = null;
          if (!TextUtils.x(str)) {
             i = o.h(ClientEvent$CustomEvent$CustomEventBiz.class, str);
          }
       }
       k1.o(new c(this, p0, i));
       return;
    }
    public void I(i0 p0){
       z.k(this, p0);
    }
    public final Activity J(h0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Activity uActivity = (p0 == null)? null: p0.a();
       return uActivity;
    }
    public j0 K(h0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.e(p0, true);
    }
    public boolean L(h0 p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(0x4b316083).o0(this.J(p0), e.a(p0), p1);
    }
    public final CommonParams N(o p0){
       CommonParams obj = PatchProxy.applyOneRefs(p0, this, k.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new CommonParams();
       obj.mServiceName = p0.sdkName();
       obj.mSubBiz = p0.subBiz();
       obj.mNeedEncrypt = p0.needEncrypt();
       obj.mH5ExtraAttr = p0.h5ExtraAttr();
       obj.mContainer = p0.container();
       return obj;
    }
    public final boolean O(Activity p0,String p1,boolean p2,d0 p3){
       JsonObject obj2;
       Object obj4;
       String this;
       k this1;
       String str9;
       String str10;
       k ok1;
       String str11;
       String str12;
       CommonParams obj5;
       Activity obj = this;
       String obj1 = p0;
       String str = p1;
       d0 uod0 = p3;
       k ok = k.class;
       m om = m.class;
       if (PatchProxy.isSupport(ok)) {
          obj2 = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, k.class, "32");
          if (obj2 != PatchProxyResult.class) {
             return obj2.booleanValue();
          }
       }
       obj2 = h.a.a(str).r();
       String str1 = m.l(obj2);
       h0 obj3 = null;
       JsonObject jsonObject = PatchProxy.applyOneRefs(obj2, obj3, om, "3");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          JsonElement jsonElement = h.c(obj2, "data");
          if (jsonElement != null) {
             jsonObject = jsonElement.r();
          }else {
             obj4 = obj3;
          label_005a :
             Objects.requireNonNull(str1);
             boolean i = -1;
             switch (str1.hashCode()){
                 case 0x8738a28c:
                   if (str1.equals("addExceptionEvent")) {
                      i = 0;
                   }
                   break;
                 case 0x92a8557c:
                   if (str1.equals("addRealShow")) {
                      i = 1;
                   }
                   break;
                 case 0x940fe9e6:
                   if (str1.equals("setCurrentPage")) {
                      i = 2;
                   }
                   break;
                 case 0xb9a5a648:
                   if (str1.equals("addCustomEvent")) {
                      i = 3;
                   }
                   break;
                 case 0xba9192a4:
                   if (str1.equals("addCustomProtoEvent")) {
                      i = 4;
                   }
                   break;
                 case 0xe44a93ab:
                   if (str1.equals("addClick2")) {
                      i = 5;
                   }
                   break;
                 case 0xeeac3d33:
                   if (str1.equals("closeCoPage")) {
                      i = 6;
                   }
                   break;
                 case 0xf9c7b04a:
                   if (str1.equals("setEntryTag")) {
                      i = 7;
                   }
                   break;
                 case 0x122c474:
                   if (str1.equals("addTaskEvent")) {
                      i = 8;
                   }
                   break;
                 case 0x699fd54:
                   if (str1.equals("addCustomStatEvent")) {
                      i = 9;
                   }
                   break;
                 case 0x514674c2:
                   if (str1.equals("addElementShowEvent")) {
                      i = 10;
                   }
                   break;
                 case 0x79c01d05:
                   if (str1.equals("addStatEvent")) {
                      i = 11;
                   }
                   break;
                 default:
             }
          label_00f6 :
             this = "value";
             String str2 = "key";
             String str3 = "biz";
             String str4 = "action";
             String str5 = "type";
             String str6 = "eventId";
             String str7 = "";
             String str8 = "H5";
             switch (i){
                 case 0:
                   obj1 = str8;
                   this1 = obj;
                   str9 = str5;
                   str10 = str6;
                   str8 = str7;
                   v ov = PatchProxy.applyTwoRefs(obj4, obj1, obj3, om, "7");
                   if (ov != PatchProxyResult.class) {
                   }else {
                      ov = v.a().d(h.g(obj4, str10, str8)).e(h.g(obj4, "message", str8)).g(h.g(obj4, str9, str8)).c(m.b(obj4, obj1)).b();
                   }
                   this1.n(ov);
                label_03de :
                   i = true;
                   return i;
                   break;
                 case 1:
                   o.b(obj4);
                   goto label_03de ;
                   break;
                 case 2:
                   this1 = obj;
                   int i1 = obj1;
                   obj1 = str8;
                   if (!p2) {
                      if (i1 && (p0.isDestroyed() || p0.isFinishing())) {
                         u1.Y("INTERCEPT_ENTER_AFTER_H5_PAGE_FINISHING", str, 1);
                         goto label_03de ;
                      }else {
                         g0 og0 = m.d(obj4, obj1);
                         if (uod0) {
                            uod0.a(str1, og0);
                            goto label_03de ;
                         }else {
                            this1.u(og0);
                            goto label_03de ;
                         }
                      }
                   }else {
                      goto label_03de ;
                   }
                   break;
                 case 3:
                   obj1 = str8;
                   ok1 = obj;
                   str1 = str3;
                   str8 = str7;
                   p op = PatchProxy.applyTwoRefs(obj4, obj1, obj3, om, "10");
                   if (op != PatchProxyResult.class) {
                   }else {
                      op = p.builder().e(h.g(obj4, str2, str8)).f(h.h(obj4, this, str8)).b(h.g(obj4, str1, str8)).d(m.b(obj4, obj1)).c();
                   }
                   ok1.H(op);
                label_01ce :
                   this1 = ok1;
                   goto label_03de ;
                   break;
                 case 4:
                   obj1 = str8;
                   ok1 = obj;
                   str9 = str5;
                   str10 = str6;
                   str8 = str7;
                   q oq = PatchProxy.applyTwoRefs(obj4, obj1, obj3, om, "8");
                   if (oq != PatchProxyResult.class) {
                   }else {
                      q$a uoa = q.a();
                      uoa.d(h.g(obj4, str10, str8));
                      uoa.g(h.g(obj4, str9, str8));
                      q$a uoa1 = uoa.e(h.g(obj4, "payload", str8));
                      oq = uoa1.c(m.b(obj4, obj1)).b();
                   }
                   ok1.m(oq);
                   goto label_01ce ;
                   break;
                 case 5:
                   ok1 = obj;
                   o.a(obj4);
                   goto label_01ce ;
                   break;
                 case 6:
                   ok1 = obj;
                   ok1.F(obj4);
                   goto label_01ce ;
                   break;
                 case 7:
                   ok1 = obj;
                   obj = obj1;
                   u ou = PatchProxy.applyThreeRefs(p0, obj4, "H5", null, m.class, "9");
                   if (ou != PatchProxyResult.class) {
                   }else {
                      u$a uoa2 = u.a();
                      uoa2.c(m.e(obj, obj4, "H5"));
                      uoa2.e(f.b.d(h.c(obj4, "entryTag"), new l().getType()));
                      ou = uoa2.b();
                   }
                   ok1.g(ou);
                   goto label_01ce ;
                   break;
                 case 8:
                   ok1 = obj;
                   str11 = str4;
                   str2 = str5;
                   str10 = str6;
                   obj1 = str8;
                   str8 = str7;
                   if (PatchProxy.applyVoidTwoRefs(obj1, obj4, ok1, ok, "34")) {
                      goto label_01ce ;
                   }else {
                      str = str8;
                      str12 = str2;
                      i0 oi0 = PatchProxy.applyThreeRefs(p0, obj4, "H5", 0, m.class, "5");
                      if (oi0 != PatchProxyResult.class) {
                      }else {
                         i0$a uoa3 = i0.b();
                         uoa3.i(h.g(obj4, "extraMessage", str));
                         uoa3.m((float)h.b(obj4, "ratio", 0x3ff0000000000000));
                         uoa3.h(h.g(obj4, str10, str));
                         uoa3.a(h.g(obj4, str11, str));
                         uoa3.p(h.g(obj4, str12, str));
                         uoa3.o(h.g(obj4, "status", str));
                         uoa3.k(h.g(obj4, "operationType", str));
                         uoa3.j(h.g(obj4, "operationDirection", str));
                         uoa3.n(h.g(obj4, "sessionId", str));
                         uoa3.l(h.h(obj4, "params", str));
                         uoa3.e(h.h(obj4, "contentPackage", str));
                         uoa3.d(m.b(obj4, "H5"));
                         oi0 = uoa3.c();
                      }
                      obj5 = oi0;
                      obj3 = m.e(p0, obj4, obj1);
                      if (("USER_OPERATION").equals(obj5.p())) {
                         ok1 = this;
                         ok1.r(obj5, obj3);
                         goto label_01ce ;
                      }else {
                         ok1 = this;
                         this.D(obj5, obj3, a.c(b.l(obj4, "taskDetailPackage")), a.a(b.l(obj4, "resultPackage")), m.a(obj4));
                         goto label_01ce ;
                      }
                   }
                   break;
                 case 9:
                   obj1 = str8;
                   ok1 = obj;
                   str10 = str6;
                   str8 = str7;
                   r or = PatchProxy.applyTwoRefs(obj4, obj1, obj3, om, "6");
                   if (or != PatchProxyResult.class) {
                   }else {
                      r$a uoa4 = r.b();
                      uoa4.e(h.g(obj4, str10, str8));
                      uoa4.f(h.g(obj4, str2, str8));
                      uoa4.h(h.h(obj4, this, str8));
                      uoa4.d(m.b(obj4, obj1));
                      uoa4.b(h.g(obj4, str3, str8));
                      or = uoa4.c();
                   }
                   ok1.E(or);
                   goto label_01ce ;
                   break;
                 case 10:
                   str = "H5";
                   String str13 = str8;
                   str11 = str4;
                   String str14 = str5;
                   str12 = str6;
                   obj1 = str7;
                   t ot = PatchProxy.applyThreeRefs(p0, obj4, str, 0, m.class, "4");
                   if (ot != PatchProxyResult.class) {
                   }else {
                      t$a uoa5 = t.b();
                      uoa5.h(h.g(obj4, str14, obj1));
                      uoa5.f(h.g(obj4, str12, obj1));
                      uoa5.a(h.g(obj4, str11, obj1));
                      uoa5.g(h.h(obj4, "params", obj1));
                      uoa5.e(h.h(obj4, "contentPackage", obj1));
                      uoa5.d(m.b(obj4, str));
                      ot = uoa5.c();
                   }
                   ok1 = this;
                   ok1.C(ot, m.e(p0, obj4, str13));
                   goto label_01ce ;
                   break;
                 case 11:
                   if (!PatchProxy.applyVoidTwoRefs(obj1, obj4, obj, ok, "33")) {
                      o oo = m.b(obj4, str8);
                      obj5 = m.j(oo);
                      obj5.mEntryTag = m.c(obj4);
                      u1.F0(super().setLogPage(e.b(m.e(obj1, obj4, str8))).setIsRealTime(m.k(oo)).setCommonParams(obj5).setStatPackage(a.b(b.l(obj4, "statPackage"))).setFeedLogCtx(m.i(oo)));
                   }
                   Object this2 = obj;
                   goto label_03de ;
                   break;
             }
             throw new IllegalArgumentException("type don\'t exist mapping");
          }
       }
       obj4 = jsonObject;
       goto label_005a ;
    }
    public final boolean P(o p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Optional.fromNullable(p0).transform(a.b).or(Boolean.FALSE).booleanValue();
    }
    public void a(String p0,String p1,String p2,JsonObject p3){
       z.c(this, p0, p1, p2, p3);
    }
    public void b(String p0,String p1,String p2,Map p3){
       z.f(this, p0, p1, p2, p3);
    }
    public void c(String p0,String p1,String p2,String p3){
       z.d(this, p0, p1, p2, p3);
    }
    public void d(String p0,String p1,String p2,String p3,String p4){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, ok, "1")) {
             return;
          }
       }
       j oj = new j(p2, p3, p0, p1, k.M(p4));
       k1.o(p4);
       return;
    }
    public boolean e(Activity p0,String p1,boolean p2){
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, k.class, "31");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.O(p0, p1, p2, null);
    }
    public boolean f(c0 p0,Activity p1,String p2,boolean p3,d0 p4){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, ok, "29");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != null) {
          try{
             return p0.s(p1, p2, p3, p4);
          }catch(java.lang.Exception e7){
             c.C().e("AzerothLoggerWrapper", "handle trans params with callback", e7);
             u1.R("AZEROTH_LOGGER_HANDLE_TRANS_PARAMS", e7.getMessage(), v2);
          }
          return v3;
       }else {
          goto label_004b ;
       }
    }
    public void g(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "14")) {
          return;
       }
       ImmutableList$a uoa = ImmutableList.builder();
       Iterator iterator = p0.c().iterator();
       while (iterator.hasNext()) {
          uoa.h(ImmutableMap.copyOf(iterator.next()));
       }
       b.a(0x4b316083).Z0(this.J(p0.b()), e.a(p0.b()), uoa.i());
       return;
    }
    public void g3(String p0,String p1,String p2){
       z.b(this, p0, p1, p2);
    }
    public void h(String p0,String p1,Throwable p2){
       z.i(this, p0, p1, p2);
    }
    public void i(h0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "18")) {
          return;
       }
       b.a(0x4b316083).v(this.J(p0), e.a(p0), p1);
       return;
    }
    public j0 j(h0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.e(p0, false);
    }
    public void k(t p0){
       z.g(this, p0);
    }
    public boolean l(c0 p0,Activity p1,String p2,boolean p3){
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, k.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != null) {
          try{
             return p0.e(p1, p2, p3);
          }catch(java.lang.Exception e9){
             c.C().e("AzerothLoggerWrapper", "handle trans params", e9);
             u1.R("AZEROTH_LOGGER_HANDLE_TRANS_PARAMS", e9.getMessage(), 1);
          }
          return false;
       }else {
          goto label_0040 ;
       }
    }
    public void m(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "9")) {
          return;
       }
       k1.o(new d(this, p0));
       return;
    }
    public void n(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "8")) {
          return;
       }
       if (!r.a(p0.b().sampleRatio())) {
          Object[] objArray = new Object[0];
          c.C().s("AzerothLoggerWrapper", "Drop a ExceptionEvent log, message: "+p0.d()+", sampleRatio: "+p0.b().sampleRatio(), objArray);
          return;
       }else {
          ClientEvent$ExceptionEvent uExceptionEv = new ClientEvent$ExceptionEvent();
          uExceptionEv.message = TextUtils.I(p0.d());
          uExceptionEv.type = o.h(ClientEvent$ExceptionEvent$Type.class, p0.f());
          u1.e0(uExceptionEv, this.P(p0.b()), this.N(p0.b()));
          return;
       }
    }
    public List o(h0 p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(b.a(0x4b316083).I0(this.J(p0), e.a(p0), p1));
    }
    public List p(){
       Object obj = PatchProxy.apply(null, this, k.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(b.a(0x4b316083).K());
    }
    public void q(String p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, k.class, "2")) {
          return;
       }
       ClientEvent$ExceptionEvent uExceptionEv = new ClientEvent$ExceptionEvent();
       uExceptionEv.message = TextUtils.I(p2);
       uExceptionEv.type = p3;
       if (!PatchProxy.isSupport(u1.class) || !PatchProxy.applyVoidFourRefs(uExceptionEv, Boolean.FALSE, p0, p1, null, u1.class, "35")) {
          u1.e0(uExceptionEv, false, u1.i(p0, p1));
       }
       return;
    }
    public void r(i0 p0,h0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "35")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = TextUtils.I(p0.k());
       b uob = new b(this, uElementPack, p0, p1, o.h(ClientEvent$ClickEvent$Type.class, p0.j()), o.h(ClientEvent$ClickEvent$Direction.class, p0.i()), TextUtils.I(p0.h()), m.i(p0.d()));
       k1.o(v0);
       return;
    }
    public boolean s(Activity p0,String p1,boolean p2,d0 p3){
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, k.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.O(p0, p1, p2, p3);
    }
    public void t(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "27")) {
          return;
       }
       if (b.a(0x4b316083) != null) {
          int i = 0;
          if ((k.a).equals(p0)) {
             i = 16;
          }else if((k.b).equals(p0)){
             i = 18;
          }
          b.a(0x4b316083).F(i);
       }
       return;
    }
    public void u(g0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       g og = new g(this, p0, o.h(ClientEvent$UrlPackage$Category.class, p0.c()), o.h(ClientEvent$ShowEvent$Status.class, p0.m()), o.h(ClientEvent$ShowEvent$ShowType.class, p0.a()), o.h(ClientEvent$UrlPackage$PageType.class, p0.k()));
       k1.o(v0);
       return;
    }
    public void v(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "17")) {
          return;
       }
       h0 oh0 = p0.b();
       ArrayList uArrayList = new ArrayList(p0.c().size());
       Iterator iterator = p0.c().iterator();
       while (iterator.hasNext()) {
          uArrayList.add(ImmutableMap.copyOf(iterator.next()));
       }
       b.a(0x4b316083).s(this.J(oh0), e.a(oh0), uArrayList);
       return;
    }
    public s w(h0 p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e obj = PatchProxy.applyOneRefs(p0, this, k.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = e.class;
       Object obj1 = null;
       if (PatchProxy.isSupport(obj)) {
          Object obj2 = PatchProxy.applyTwoRefs(p0, Boolean.TRUE, obj1, obj, "5");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else {
          label_0026 :
             k2 ok2 = e.d(p0);
             if (ok2 != null) {
                ok2 = ok2.t;
                ok2 = (ok2 != null)? ok2.u: obj1;
                if (ok2 != null) {
                   s$a uoa = s.b();
                   uoa.a(ok2.action2);
                   uoa.d(ok2.params);
                   obj1 = uoa.c();
                }
             }
          }
       }else {
          goto label_0026 ;
       }
       return obj1;
    }
    public void x(a p0){
    }
    public void y(String p0,Throwable p1){
       z.j(this, p0, p1);
    }
    public EventListener$Factory z(){
       return z.m(this);
    }
}
