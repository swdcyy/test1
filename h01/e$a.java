package h01.e$a;
import h01.i;
import h01.e;
import java.lang.Object;
import lm1.i;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import h01.j;
import com.yxcorp.gifshow.models.Gift;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGift;
import java.lang.StringBuilder;
import mk1.h;
import mk1.f;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import cl1.c;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGiftInfo;
import fl1.a;
import t02.a0;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import hm2.a$b;
import lnc.a1;
import h01.c;
import h01.d;
import java.lang.Runnable;
import lm1.f;
import wkd.b;
import ad5.a;
import com.kuaishou.live.core.show.exchangegoldcoin.a;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo;
import e82.f;
import wk1.b;
import mk1.b;
import com.kuaishou.live.common.core.component.gift.gift.p;
import w91.a;
import lp3.c;
import lp3.e;
import java.util.Map;
import jk1.f;

public class e$a implements i	// class@0025e6
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(i p0,UserInfo p1,boolean p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, e$a.class, "3")) {
          return;
       }
       this.a.u.b(p0, 2, true, p1, false);
       return;
    }
    public void b(i p0,Gift p1,UserInfo p2,boolean p3,boolean p4){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       if (this.c(p0, p1, p4)) {
          this.a.u.d(p0, 2, p1, p2, p3, p4);
       }
       return;
    }
    public boolean c(i p0,Gift p1,boolean p2){
       String obj1;
       boolean b;
       i oi = p0;
       Object obj = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(e$a.class)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, e$a.class, "1");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       e$a a = this.a;
       Objects.requireNonNull(a);
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), a, e.class, "2");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
          label_0053 :
             String str = "CLIENT_SEND_PRE_CHECK";
             if (!obj instanceof PrivilegeGift) {
                a.P8(oi, str, "[LivePrivilegeGiftSendPresenter][canSendPrivilegeGiftForAnchor]not privilege gift:"+obj, 0x18713);
             }else {
                int i = 2;
                String str1 = a.t.c.s(i);
                String str2 = a.t.O(p0.c());
                int i1 = a.t.t.g();
                obj1 = obj;
                PrivilegeGift mPrivilegeGi = obj1.mPrivilegeGiftInfo;
                if (mPrivilegeGi != null && mPrivilegeGi.mGiftActivityStatus == i) {
                   a.t.C.l(obj1);
                   a.P8(oi, str, "[LivePrivilegeGiftSendPresenter][canSendPrivilegeGiftForAnchor]info: "+obj1.mPrivilegeGiftInfo, 0x18712);
                }else {
                   LiveWealthGradeInfo liveWealthGr = a.p.i2.yb();
                   if (liveWealthGr == null) {
                      a.P8(oi, str, "[LivePrivilegeGiftSendPresenter][canSendPrivilegeGiftForAnchor]wealthGradeInfo is null", 0x18714);
                   }else if(!a.t.C.k(obj1)){
                      a.V8(liveWealthGr, a1.p(R.string.arg_RES_7f102ecf), new c(a, liveWealthGr), new d(a, liveWealthGr));
                      a.P8(oi, str, "[LivePrivilegeGiftSendPresenter][canSendPrivilegeGiftForAnchor]current:"+liveWealthGr.mCurrentGrade+",need:"+obj1.mMinWealthGrade, 0x18711);
                      a.S8(p1, i1, p2, str1, str2, 0x18711, p0.b());
                   }else if(liveWealthGr.mIsGradeLightOff != null && liveWealthGr.mIsEnableHideWealthGradeWhenLightOff != null){
                      obj1 = a1.p(R.string.arg_RES_7f102262);
                      if (!PatchProxy.applyVoidTwoRefs(liveWealthGr, obj1, a, uoe, "3")) {
                         a.V8(liveWealthGr, obj1, null, null);
                      }
                      a.P8(oi, str, "[LivePrivilegeGiftSendPresenter][canSendPrivilegeGiftForAnchor]level locked", 0x18717);
                   }else {
                      long l = b.a(0x4c90014d).q();
                      String str3 = ",need:";
                      boolean b1 = true;
                      if (l - (long)(obj.mPrice * i1) >= 0 || (a.b(a.p, "gift_box_bottom_entry") && a.d(a.p.R.b(), ((long)(obj.mPrice * i1) - l)))) {
                         b = true;
                      }else {
                         a.t.A.d("[LivePrivilegeGiftSendPresenter][canSendPrivilegeGiftForAnchor]");
                         a.p.x1.ge(0, p.j(a.q, b1), ((long)(obj.mPrice * i1) - l), a.r.a(a.class).d6());
                         a.P8(oi, str, "[LivePrivilegeGiftSendPresenter][canSendPrivilegeGiftForAnchor]kCoin:"+l+str3+(obj.mPrice * i1), 0x1870a);
                         a.S8(p1, i1, p2, str1, str2, 0x1870a, p0.b());
                      }
                   }
                }
             }
             b = false;
          }
       }else {
          goto label_0053 ;
       }
       return b;
    }
}
