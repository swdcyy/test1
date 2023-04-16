package com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import xh1.a;
import xh1.b;
import z1.k;
import xp5.i;
import vq5.d;
import zg1.f;
import nj1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel$bindPhoneManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import lj1.b;
import jj1.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lj1.e;
import pj1.c;
import mj1.a;
import com.kwai.robust.PatchProxyResult;
import pj1.c$a;
import pj1.a;
import qj1.c0;
import qj1.w;
import qj1.i0;
import qj1.t;
import qj1.v;
import qj1.b0;
import java.util.List;
import qj1.d0;
import pj1.b$a;
import jj1.b;
import pj1.b$b;
import qj1.b;
import qj1.n;
import qj1.s;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel$a;

public final class LiveGiftSendModel extends Model	// class@001254
{
    public final ArrayList i;
    public final p j;
    public final a k;
    public final b l;
    public final k m;
    public final k n;
    public final i o;
    public final d p;
    public final k q;
    public final f r;
    public final a s;
    public final k t;
    public final k u;
    public final k v;

    public void LiveGiftSendModel(a p0,b p1,k p2,k p3,i p4,d p5,k p6,f p7,a p8,k p9,k p10,k p11){
       LiveGiftSendModel liveGiftSend = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       Object obj4 = p4;
       Object obj5 = p5;
       Object obj6 = p6;
       Object obj7 = p7;
       a.p(obj, "giftBoxComboStateManager");
       a.p(obj1, "noPanelComboStateManager");
       a.p(obj2, "liveStreamIdSupplier");
       a.p(obj3, "feedWrapperSupplier");
       a.p(obj4, "logPackageProvider");
       a.p(obj5, "routerManager");
       a.p(obj6, "activitySupplier");
       a.p(obj7, "fansGroupJoinServiceAdapter");
       a.p(p8, "loginDependency");
       a.p(p9, "fragmentManagerSupplier");
       a.p(p10, "failTipsIntervalMillisSupplier");
       a.p(p11, "paymentManagerSupplier");
       super("LiveGiftSendModel", null, 1, 0, 10, 0);
       liveGiftSend.k = obj;
       liveGiftSend.l = obj1;
       liveGiftSend.m = obj2;
       liveGiftSend.n = obj3;
       liveGiftSend.o = obj4;
       liveGiftSend.p = obj5;
       liveGiftSend.q = obj6;
       liveGiftSend.r = obj7;
       liveGiftSend.s = p8;
       liveGiftSend.t = p9;
       liveGiftSend.u = p10;
       liveGiftSend.v = p11;
       liveGiftSend.i = new ArrayList();
       liveGiftSend.j = s.c(new LiveGiftSendModel$bindPhoneManager$2(liveGiftSend));
    }
    public static void g(LiveGiftSendModel p0,b p1,a p2,int p3,Object p4){
       c$a a;
       LiveGiftSendModel obj2;
       PatchProxyResult patchProxyRe;
       int i1;
       ArrayList uArrayList;
       a uoa2;
       PatchProxyResult obj = p0;
       e obj1 = p1;
       Objects.requireNonNull(p0);
       String str = "2";
       if (PatchProxy.applyVoidTwoRefs(obj1, null, obj, LiveGiftSendModel.class, str)) {
       }else {
          a.p(obj1, "params");
          b.c0(LiveGiftTag.GIFT_SEND, "[LiveGiftSendModel][sendGift]", "params", obj1);
          a = c.a;
          LiveGiftSendModel k = obj.k;
          LiveGiftSendModel m = obj.m;
          LiveGiftSendModel p = obj.p;
          LiveGiftSendModel r = obj.r;
          LiveGiftSendModel o = obj.o;
          a uoa = p0.e();
          LiveGiftSendModel n = obj.n;
          LiveGiftSendModel q = obj.q;
          LiveGiftSendModel s = obj.s;
          LiveGiftSendModel u = obj.u;
          e uoe = v5;
          LiveGiftSendModel v = obj.v;
          Objects.requireNonNull(a);
          obj = PatchProxyResult.class;
          p4 = str;
          c$a uoa1 = c$a.class;
          String str1 = "params";
          int i = 0;
          if (PatchProxy.isSupport(uoa1)) {
             Object[] objArray = new Object[12];
             objArray[i] = obj1;
             objArray[1] = k;
             objArray[2] = m;
             objArray[3] = p;
             objArray[4] = r;
             objArray[5] = o;
             objArray[6] = uoa;
             objArray[7] = n;
             objArray[8] = q;
             objArray[9] = s;
             objArray[10] = u;
             objArray[11] = v;
             obj2 = PatchProxy.apply(objArray, a, uoa1, "1");
             patchProxyRe = obj;
             if (obj2 != patchProxyRe) {
             }else {
             label_0093 :
                String str2 = str1;
                a.p(obj1, str2);
                str1 = str2;
                a.p(k, "giftBoxComboStateManager");
                String str3 = "giftBoxComboStateManager";
                a.p(m, "liveStreamIdSupplier");
                String str4 = "liveStreamIdSupplier";
                a.p(p, "routerManager");
                str2 = "fansGroupJoinServiceAdapter";
                a.p(r, str2);
                LiveGiftSendModel liveGiftSend = p;
                a.p(o, "logPackageProvider");
                String str5 = "logPackageProvider";
                a.p(uoa, "bindPhoneManager");
                String str6 = "bindPhoneManager";
                a.p(n, "feedWrapper");
                String str7 = "feedWrapper";
                a.p(q, "activity");
                String str8 = "loginDependency";
                a.p(s, str8);
                LiveGiftSendModel liveGiftSend1 = q;
                a.p(u, "failTipsIntervalMillis");
                String str9 = "failTipsIntervalMillis";
                a.p(v, "paymentManager");
                String str10 = "paymentManager";
                String str11 = p1.g();
                if (str11 == null) {
                label_00e9 :
                   i1 = 0;
                label_021c :
                   if (PatchProxy.isSupport(uoa1)) {
                      objArray = new Object[9];
                      objArray[i1] = obj1;
                      objArray[1] = m;
                      objArray[2] = k;
                      objArray[3] = uoa;
                      objArray[4] = s;
                      objArray[5] = n;
                      objArray[6] = u;
                      objArray[7] = v;
                      objArray[8] = o;
                      obj2 = PatchProxy.apply(objArray, a, uoa1, p4);
                      if (obj2 != patchProxyRe) {
                      }
                   }
                   uArrayList = new ArrayList();
                   uArrayList.add(new c0(s));
                   uArrayList.add(new i0(v));
                   uArrayList.add(new t(k, m));
                   uArrayList.add(new v(uoa, u));
                   uArrayList.add(new b0(k, n, m, o));
                   uoa2 = new a(uArrayList, obj1, 0);
                }else {
                   String str12 = str8;
                   i1 = str11.hashCode();
                   String str13 = str2;
                   if (i1 != -653311135) {
                      if (i1 == -127030193 && str11.equals("FansGroupGift")) {
                         if (PatchProxy.isSupport(uoa1)) {
                            objArray = new Object[10];
                            objArray[0] = obj1;
                            objArray[1] = m;
                            objArray[2] = r;
                            objArray[3] = k;
                            objArray[4] = uoa;
                            objArray[5] = n;
                            objArray[6] = s;
                            objArray[7] = u;
                            objArray[8] = v;
                            objArray[9] = o;
                            obj2 = PatchProxy.apply(objArray, a, uoa1, "4");
                            if (obj2 != patchProxyRe) {
                            }
                         }
                         a.p(obj1, str1);
                         a.p(m, str4);
                         a.p(r, str13);
                         a.p(k, str3);
                         a.p(uoa, str6);
                         a.p(n, str7);
                         a.p(s, str12);
                         a.p(u, str9);
                         a.p(v, str10);
                         a.p(o, str5);
                         uArrayList = new ArrayList();
                         uArrayList.add(new c0(s));
                         uArrayList.add(new w(r));
                         uArrayList.add(new i0(v));
                         uArrayList.add(new t(k, m));
                         uArrayList.add(new v(uoa, u));
                         uArrayList.add(new b0(k, n, m, o));
                         uoa2 = new a(uArrayList, obj1, 0);
                      }else {
                         goto label_00e9 ;
                      }
                   }else {
                      i1 = 0;
                      if (str11.equals("PrivilegeGift")) {
                         if (PatchProxy.isSupport(uoa1)) {
                            objArray = new Object[11];
                            objArray[i1] = obj1;
                            objArray[1] = m;
                            objArray[2] = liveGiftSend;
                            objArray[3] = o;
                            objArray[4] = k;
                            objArray[5] = uoa;
                            objArray[6] = n;
                            objArray[7] = liveGiftSend1;
                            objArray[8] = s;
                            objArray[9] = u;
                            objArray[10] = v;
                            obj2 = PatchProxy.apply(objArray, a, uoa1, "3");
                            if (obj2 != patchProxyRe) {
                            }
                         }
                         uArrayList = new ArrayList();
                         uArrayList.add(new c0(s));
                         uArrayList.add(new d0(liveGiftSend1, liveGiftSend, o));
                         uArrayList.add(new i0(v));
                         uArrayList.add(new t(k, m));
                         uArrayList.add(new v(uoa, u));
                         uArrayList.add(new b0(k, n, m, o));
                         uoa2 = new a(uArrayList, obj1, 0);
                      }else {
                         goto label_021c ;
                      }
                   }
                }
                obj2 = uoa2;
             }
          }else {
             patchProxyRe = obj;
             goto label_0093 ;
          }
          obj1 = new e(obj2);
          obj2 = p0;
          obj2.i.add(obj1);
          obj1.a(new b(obj2, null, obj1));
       }
       return;
    }
    public final a e(){
       Object obj = PatchProxy.apply(null, this, LiveGiftSendModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final ArrayList f(){
       return this.i;
    }
    public final void h(b p0,a p1){
       c$a a;
       a uoa1;
       String str2;
       c$a obj = this;
       e obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, LiveGiftSendModel.class, "4")) {
          return;
       }
       String str = "params";
       a.p(obj1, str);
       b.c0(LiveGiftTag.GIFT_SEND, "[LiveGiftSendModel][sendNoPanelGiftToAnchorWithConfirmDialog]", str, obj1);
       a = c.a;
       LiveGiftSendModel l = obj.l;
       LiveGiftSendModel m = obj.m;
       LiveGiftSendModel o = obj.o;
       a uoa = this.e();
       LiveGiftSendModel n = obj.n;
       LiveGiftSendModel s = obj.s;
       LiveGiftSendModel t = obj.t;
       LiveGiftSendModel u = obj.u;
       LiveGiftSendModel v = obj.v;
       Objects.requireNonNull(a);
       obj = c$a.class;
       e uoe = v10;
       int i = 0;
       if (PatchProxy.isSupport(obj)) {
          String str1 = str;
          Object[] objArray = new Object[12];
          objArray[i] = obj1;
          objArray[1] = l;
          objArray[2] = m;
          objArray[3] = o;
          objArray[4] = uoa;
          objArray[5] = n;
          objArray[6] = s;
          objArray[7] = t;
          objArray[8] = u;
          objArray[9] = v;
          objArray[10] = "LITE_GIFT_GUIDE";
          objArray[11] = obj2;
          uoa1 = PatchProxy.apply(objArray, a, obj, "5");
          if (uoa1 != PatchProxyResult.class) {
          label_0085 :
             obj1 = uoe;
             obj1 = new e(uoa1);
             LiveGiftSendModel liveGiftSend = this;
             liveGiftSend.i.add(obj1);
             obj1.a(new LiveGiftSendModel$a(liveGiftSend, obj2, obj1));
             return;
          }else {
             str2 = str1;
          }
       }else {
          str2 = str;
       }
       a.p(obj1, str2);
       a.p(l, "noPanelComboStateManager");
       a.p(m, "liveStreamIdSupplier");
       a.p(o, "liveLogPackageProvider");
       a.p(uoa, "bindPhoneManager");
       a.p(n, "feedWrapperSupplier");
       a.p(s, "loginDependency");
       a.p(t, "fragmentManagerSupplier");
       a.p(u, "failTipsIntervalMillisSupplier");
       a.p(v, "paymentManagerSupplier");
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new c0(s));
       if (p0.b()) {
          uArrayList.add(new b(t, o));
       }
       uArrayList.add(new i0(v));
       uArrayList.add(new n(l, "LITE_GIFT_GUIDE"));
       uArrayList.add(new v(uoa, u));
       s os = new s(l, m, n, "LITE_GIFT_GUIDE", p1, o);
       uArrayList.add(i);
       uoa1 = new a(uArrayList, obj1, 0);
       goto label_0085 ;
    }
}
