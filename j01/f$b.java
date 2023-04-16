package j01.f$b;
import j01.f$d;
import j01.f;
import java.lang.Object;
import lm1.i;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.core.show.gift.DrawingGift;
import xk1.a;
import t02.a0;
import p91.m;
import java.util.Iterator;
import com.kwai.framework.model.user.UserInfo;
import j01.i0;
import mk1.h;
import vk1.a;
import wo1.a;
import java.lang.Integer;
import lm1.f;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.exchangegoldcoin.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import wkd.b;
import ad5.a;
import mk1.b;
import mk1.w;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo;
import e82.f;
import e82.c$a;
import e82.c;
import e82.e;
import sz0.b;

public class f$b implements f$d	// class@0029f3
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void a(i p0,List p1,boolean p2){
       if (PatchProxy.isSupport(f$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, f$b.class, "2")) {
          return;
       }
       f$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), ta, f.class, "5")) {
          DrawingGift uDrawingGift = ta.x.o();
          if (ta.R8(p0, uDrawingGift) && ta.S8(p0, uDrawingGift, p2)) {
             String str = ta.u.Z2.d();
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                boolean b = (obj.mId).equals(str);
                int i = b ^ 0x01;
                ta.a9(p0, i, b, obj, uDrawingGift);
                ta.x.c(b, uDrawingGift);
             }
             ta.x.m();
             ta.q.z.dismiss();
             a0 w2 = ta.u.W2;
             if (w2 != null) {
                w2.a();
             }
          }
       }
       return;
    }
    public void b(i p0,int p1,boolean p2,UserInfo p3,boolean p4){
       boolean b;
       f$b uob = this;
       object oobject = p0;
       object oobject1 = p3;
       f$b uob1 = f$b.class;
       int i = 5;
       int i1 = 1;
       int i2 = 2;
       int i3 = 3;
       int i4 = 4;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray = new Object[i];
          objArray[0] = oobject;
          objArray[i1] = Integer.valueOf(p1);
          objArray[i2] = Boolean.valueOf(p2);
          objArray[i3] = oobject1;
          objArray[i4] = Boolean.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, this, uob1, "1")) {
             return;
          }
       }
       uob1 = uob.a;
       Objects.requireNonNull(uob1);
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray1 = new Object[i];
          objArray1[0] = oobject;
          objArray1[i1] = Integer.valueOf(p1);
          objArray1[i2] = Boolean.valueOf(p2);
          objArray1[i3] = oobject1;
          objArray1[i4] = Boolean.valueOf(p4);
          if (!PatchProxy.applyVoid(objArray1, uob1, uof, "3")) {
          label_0063 :
             DrawingGift uDrawingGift = uob1.x.o();
             p0.b().m(uob1.Y8(uDrawingGift));
             if (uob1.R8(oobject, uDrawingGift)) {
                if (PatchProxy.isSupport(uof)) {
                   Object[] objArray2 = new Object[i];
                   objArray2[0] = oobject;
                   objArray2[i1] = Integer.valueOf(p1);
                   objArray2[i2] = Boolean.valueOf(p2);
                   objArray2[i3] = oobject1;
                   objArray2[i4] = uDrawingGift;
                   c$a obj = PatchProxy.apply(objArray2, uob1, uof, "15");
                   if (obj != PatchProxyResult.class) {
                      i1 = obj.booleanValue();
                   }else if(!a.b(uob1.u, "gift_box_bottom_entry")){
                      b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[GiftBoxSendDrawingGiftPresenter] [isEnableExchangeFunc]  can not use exchange ");
                   }else {
                      long l = b.a(0x4c90014d).q();
                      i4 = (uob1.p.k())? w.a(uDrawingGift) * uob1.p.g().size(): w.a(uDrawingGift);
                      long l1 = (long)i4 - l;
                      if (l1 > 0 && a.d(uob1.u.R.b(), l1)) {
                         obj = new c$a();
                         obj.d(p2);
                         obj.f(oobject);
                         obj.c(p1);
                         obj.i = uDrawingGift;
                         obj.g(oobject1);
                         obj.b(uob1.p);
                         obj.e(l1);
                         c uoc = obj.a();
                         f c = uob1.C;
                         Object obj1 = PatchProxy.applyTwoRefs(uoc, c, uob1, uof, "16");
                         if (obj1 != PatchProxyResult.class) {
                            b = obj1.booleanValue();
                         }else {
                            uof = uob1.B;
                            if (uof == null) {
                               b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[GiftBoxSendDrawingGiftPresenter][tryUseExchangeGoldCoin]mLiveGiftGoldCoinExchangeService is null");
                               b = false;
                            }else {
                               b = uof.a(uoc, c);
                            }
                         }
                         if (b) {
                            i1 = false;
                         label_014e :
                            if (i1 && uob1.S8(oobject, uDrawingGift, p4)) {
                               uob1.c9(p0, p1, p2, p3, uDrawingGift);
                            }
                         }else {
                            b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[GiftBoxSendDrawingGiftPresenter] [checkDrawingGiftValid] exchange error continue next action ");
                            goto label_014e ;
                         }
                      }
                   }
                }else {
                   goto label_00a7 ;
                }
                i2 = p2;
                goto label_014e ;
             }
          }
       }else {
          goto label_0063 ;
       }
       return;
    }
}
