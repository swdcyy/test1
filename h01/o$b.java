package h01.o$b;
import h01.j;
import h01.o;
import java.lang.Object;
import lm1.i;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import j01.f$d;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Integer;
import com.yxcorp.gifshow.models.Gift;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.gift.p;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import mk1.w;
import lm1.f;
import mk1.h;
import cl1.c;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import mk1.b;
import mk1.f;
import h01.n;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Number;
import android.util.SparseArray;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.util.ArrayList;
import java.util.Collections;
import com.kuaishou.live.core.show.exchangegoldcoin.a;
import wkd.b;
import ad5.a;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo;
import e82.f;
import e82.a;
import e82.c$a;
import e82.c;
import e82.e;
import sz0.b;
import java.lang.StringBuilder;
import wk1.b;
import xk1.a;
import wo1.a;

public class o$b implements j	// class@0025f2
{
    public final o a;

    public void o$b(o p0){
       this.a = p0;
       super();
    }
    public void a(i p0,List p1,boolean p2){
       if (PatchProxy.isSupport(o$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, o$b.class, "2")) {
          return;
       }
       this.a.B.a(p0, p1, p2);
       return;
    }
    public void b(i p0,int p1,boolean p2,UserInfo p3,boolean p4){
       o$b uob = o$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       this.a.B.b(p0, p1, p2, p3, p4);
       return;
    }
    public void c(i p0,List p1,Gift p2,boolean p3){
       int i1;
       Object obj1;
       i oi = p0;
       if (PatchProxy.isSupport(o$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, o$b.class, "4")) {
          return;
       }
       o$b a = this.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(o.class) || !PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), a, o.class, "4")) {
          if (w.p(a.p.R().getActivity(), "normal_send_gift_list", a.p.c.mEntity)) {
             a.Y8(oi, "CLIENT_SEND_PRE_CHECK", "[NormalGiftSenderPresenter][sendNormalGiftList]interruptGiftSendByNotLogin", 0x18705);
          }else {
             f uof = p0.b();
             int i = a.y.t.g() * p1.size();
             if (!a.V8(p0, p1, p2, i, p3) && (!a.W8(oi, p2, i) && !a.X8(p0, p1, p2, i, p3))) {
                n obj = PatchProxy.apply(null, null, p.class, "17");
                int b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableSendNormalGiftListOpt", false);
                if (b) {
                   b.Z(LiveLogTag.GIFT, "[sendNormalGiftList] 命中送多人礼物优化");
                   Iterator iterator = p1.iterator();
                   i1 = 0;
                   while (iterator.hasNext()) {
                      obj1 = iterator.next();
                      boolean b1 = a.S8(obj1, a.x.b());
                      b = b1 ^ 0x01;
                      uof.j(b);
                      uof.q(obj1);
                      uof.o(a.y.c.s(b1));
                      obj = v2;
                      n on = v2;
                      Object obj2 = obj1;
                      long l = i1;
                      obj = new n(a, p0, b1, p2, obj2, b1);
                      k1.r(on, l);
                      Object obj3 = PatchProxy.apply(null, null, p.class, "18");
                      long l1 = (obj3 != PatchProxyResult.class)? obj3.longValue(): a.t().u("SOURCE_LIVE").b("sendGiftListPostDelayTimeMs", 50);
                      i1 = l + l1;
                      Object[] objArray = null;
                   }
                }else {
                   Iterator iterator1 = p1.iterator();
                   while (iterator1.hasNext()) {
                      obj1 = iterator1.next();
                      boolean b2 = a.S8(obj1, a.x.b());
                      i1 = b2 ^ 0x01;
                      uof.j(i1);
                      uof.q(obj1);
                      uof.o(a.y.c.s(b2));
                      a.G.d(p0, b2, p2, obj1, i1, false);
                   }
                }
             }
          }
       }
       return;
    }
    public void d(i p0,int p1,Gift p2,UserInfo p3,boolean p4,boolean p5){
       Object[] objArray;
       o y;
       o oo2;
       ArrayList obj2;
       object oobject4;
       int i7;
       LiveCreditExchangeInfo obj3;
       c$a obj4;
       boolean b2;
       h h;
       LiveLogTag obj6;
       o$b obj = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       boolean b = p5;
       o$b uob = o$b.class;
       String str = "3";
       int i = 2;
       int i1 = 3;
       int i2 = 6;
       int i3 = 4;
       int i4 = 5;
       boolean i5 = 0;
       int i6 = 1;
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[i2];
          objArray[i5] = oobject;
          objArray[i6] = Integer.valueOf(p1);
          objArray[i] = oobject1;
          objArray[i1] = oobject2;
          objArray[i3] = Boolean.valueOf(p4);
          objArray[i4] = Boolean.valueOf(p5);
          if (PatchProxy.applyVoid(objArray, obj, uob, str)) {
             return;
          }
       }
       o$b a = obj.a;
       Objects.requireNonNull(a);
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray1 = new Object[i2];
          objArray1[i5] = oobject;
          objArray1[i6] = Integer.valueOf(p1);
          objArray1[i] = oobject1;
          objArray1[i1] = oobject2;
          objArray1[i3] = Boolean.valueOf(p4);
          objArray1[i4] = Boolean.valueOf(p5);
          if (!PatchProxy.applyVoid(objArray1, a, oo, str)) {
          label_006c :
             String str1 = (b)? "combo_send_gift": "normal_send_gift";
             if (!b) {
                y = a.y;
                i2 = y.H + i6;
                y.H = i2;
                y.I.put(i2, Integer.valueOf(i5));
             }
             p0.e().n(a.y.H);
             String str2 = "CLIENT_SEND_PRE_CHECK";
             if (w.p(a.p.R().getActivity(), str1, a.p.c.mEntity)) {
                a.Y8(oobject, str2, "[NormalGiftSenderPresenter][sendNormalGift]interruptGiftSendByNotLogin", 0x18705);
             }else {
                i3 = a.y.t.g();
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                String str3 = "6";
                i = 7;
                if (PatchProxy.isSupport(oo)) {
                   objArray1 = new Object[i];
                   objArray1[i5] = oobject;
                   objArray1[i6] = Integer.valueOf(p1);
                   objArray1[2] = oobject1;
                   objArray1[3] = Integer.valueOf(i3);
                   objArray1[4] = Boolean.valueOf(p4);
                   objArray1[i4] = oobject2;
                   objArray1[6] = Boolean.valueOf(p5);
                   h obj1 = PatchProxy.apply(objArray1, a, oo, str3);
                   if (obj1 != patchProxyRe) {
                      i5 = obj1.booleanValue();
                      obj = a;
                   }else {
                   label_00fe :
                      objArray1 = new Object[i6];
                      objArray1[i5] = oobject2;
                      ArrayList uArrayList = new ArrayList(i6);
                      i = 0;
                      while (i < i6) {
                         object oobject3 = objArray1[i];
                         Objects.requireNonNull(oobject3);
                         uArrayList.add(oobject3);
                         i = i + 1;
                         i6 = 1;
                      }
                      PatchProxyResult patchProxyRe1 = patchProxyRe;
                      obj = a;
                      String str4 = str2;
                      o oo1 = oo;
                      i2 = 0;
                      if (!a.V8(p0, Collections.unmodifiableList(uArrayList), p2, i3, p5) && !obj.W8(oobject, oobject1, i3)) {
                         obj1 = h.class;
                         a uoa = a.class;
                         if (PatchProxy.isSupport(oo1)) {
                            Object[] objArray2 = new Object[]{oobject,oobject1,Integer.valueOf(i3),Integer.valueOf(p1),Boolean.valueOf(p4),Boolean.valueOf(p5),oobject2};
                            oo2 = oo1;
                            obj2 = PatchProxy.apply(objArray2, obj, oo2, "10");
                            if (obj2 != patchProxyRe1) {
                               i5 = obj2.booleanValue();
                               oobject4 = oobject;
                            }else if(!a.b(obj.p, "gift_box_bottom_entry")){
                               b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[NormalGiftSenderPresenter] [isExchangeGiftEnable]：can\'t exchange switch not on");
                            label_01c3 :
                               oobject4 = oobject;
                            }else {
                               objArray2 = null;
                               if (b) {
                                  obj3 = PatchProxy.apply(objArray2, objArray2, uoa, "7");
                                  boolean b1 = (obj3 != patchProxyRe1)? obj3.booleanValue(): a.t().u("SOURCE_LIVE").d("enableLiveExchangeSendCombo", i2);
                                  if (!b1) {
                                     b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[NormalGiftSenderPresenter] [isExchangeGiftEnable]：combo exchange kswitch not enable");
                                     goto label_01c3 ;
                                  }
                               }
                               long l = b.a(0x4c90014d).q();
                               o oo3 = oo2;
                               long l1 = (long)(oobject1.mPrice * i3) - l;
                               o y1 = obj.y;
                               String str5 = "exchangeSendType";
                               long l2 = l;
                               if (PatchProxy.isSupport(uoa)) {
                                  obj4 = PatchProxy.applyTwoRefs(y1, Boolean.valueOf(p5), null, uoa, str3);
                                  if (obj4 != patchProxyRe1) {
                                     b2 = obj4.booleanValue();
                                  }else if(!b){
                                     b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isNeedMandatoryExchange]: not isCombo");
                                  }else {
                                     h h1 = y1.H;
                                     if (PatchProxy.isSupport(obj1)) {
                                        obj6 = PatchProxy.applyOneRefs(Integer.valueOf(h1), y1, obj1, str);
                                        if (obj6 != patchProxyRe1) {
                                        }else {
                                        label_021c :
                                           obj6 = LiveLogTag.LIVE_GOLD_COIN_EXCHANGE;
                                           b.Z(obj6, "[LiveAudienceGiftBoxCallerContext] [getCombType] getCombKeyType");
                                           if (y1.J.containsKey(Integer.valueOf(h1))) {
                                              obj6 = y1.J.get(Integer.valueOf(h1));
                                           }else {
                                              b.Z(obj6, "[LiveAudienceGiftBoxCallerContext] [getCombType] getCombKeyType is null");
                                              obj6 = "normalSendType";
                                           }
                                        }
                                     }else {
                                        goto label_021c ;
                                     }
                                     if (TextUtils.equals(obj6, str5)) {
                                        b2 = true;
                                     }else {
                                        b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isNeedMandatoryExchange] can\'t mandatoryExchange ");
                                     }
                                  }
                                  b2 = false;
                               }else {
                                  goto label_01fd ;
                               }
                               if (b && !b2) {
                                  b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[NormalGiftSenderPresenter] [isExchangeGiftEnable] don\'t need exchange  ");
                               }else if(b2 || l1 - null > 0){
                                  obj3 = obj.p.R.b();
                                  if (b2) {
                                     l1 = (long)(oobject1.mPrice * i3);
                                  }
                                  if (a.d(obj3, l1)) {
                                     y = obj.y;
                                     h = y.H;
                                     if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(h), str5, y, obj1, "2")) {
                                        y.J.put(Integer.valueOf(h), str5);
                                     }
                                     obj4 = new c$a();
                                     obj4.d(p4);
                                     obj4.f(p0);
                                     obj4.c(p1);
                                     obj4.e = oobject1;
                                     obj4.f = i3;
                                     obj4.g = b;
                                     obj4.g(oobject2);
                                     i7 = (a.b())? 2: 1;
                                     obj4.k = i7;
                                     obj4.e(l1);
                                     obj4.b(obj.x);
                                     c uoc = obj4.a();
                                     y = obj.F;
                                     Object obj5 = PatchProxy.applyTwoRefs(uoc, y, obj, oo3, "17");
                                     if (obj5 != patchProxyRe1) {
                                        i5 = obj5.booleanValue();
                                     }else {
                                        oo = obj.E;
                                        if (oo == null) {
                                           b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[NormalGiftSenderPresenter][tryUseExchangeGoldCoin]mLiveGiftGoldCoinExchangeService is null");
                                           i5 = false;
                                        }else {
                                           i5 = oo.a(uoc, y);
                                        }
                                     }
                                     if (!i5) {
                                        b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[NormalGiftSenderPresenter] [isExchangeGiftEnable] exchange error continue next action ");
                                     }
                                  }else {
                                     i oi = p0;
                                     if (b2) {
                                        obj.c9(p.j(obj.x, true), (long)(oobject1.mPrice * i3));
                                        obj.Y8(oi, str4, "[NormalGiftSenderPresenter][internalSendNormalGift]kCoin:"+l2+",need:"+(oobject1.mPrice * i3), 0x18721);
                                        o y2 = obj.y;
                                        y2.J.remove(Integer.valueOf(y2.H));
                                        obj.y.A.d("[NormalGiftSenderPresenter][isExchangeGiftEnable]");
                                     }else {
                                        b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[NormalGiftSenderPresenter] [isExchangeGiftEnable] exchange stop next action ");
                                     }
                                  }
                                  i5 = true;
                               }
                               int i8 = p4;
                            }
                            i5 = false;
                         }else {
                            oo2 = oo1;
                            i6 = 2;
                            goto label_0186 ;
                         }
                         if (!i5) {
                            i7 = 1;
                            objArray = new Object[i7];
                            objArray[0] = oobject2;
                            obj2 = new ArrayList(i7);
                            i5 = 0;
                            while (i5 < i7) {
                               object oobject5 = objArray[i5];
                               Objects.requireNonNull(oobject5);
                               obj2.add(oobject5);
                               i5 = i5 + 1;
                               i7 = 1;
                            }
                            if (!obj.X8(p0, Collections.unmodifiableList(obj2), p2, i3, p5)) {
                               uob = obj;
                               uob.a9(p4, p0, p1, p2, i3, p5, p3);
                               uob.b9(p5, p2, i3, true, "[NormalGiftSenderPresenter][internalSendNormalGift]");
                            }
                         }
                         i5 = true;
                      }
                   label_0396 :
                      i5 = false;
                   }
                }else {
                   goto label_00fe ;
                }
                if (!i5) {
                   obj.y.A.d("[NormalGiftSenderPresenter][sendNormalGift]");
                }
                obj.y.p.g(true);
                a0 w2 = obj.p.W2;
                if (w2 != null) {
                   w2.a();
                }
             }
          }
       }else {
          goto label_006c ;
       }
       return;
    }
}
