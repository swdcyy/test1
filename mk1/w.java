package mk1.w;
import java.lang.Object;
import com.kuaishou.live.core.show.gift.DrawingGift;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.show.gift.DrawingGift$Point;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.StringBuilder;
import va1.l0;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import mk1.h;
import android.util.SparseArray;
import mk1.b;
import mk1.w$a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;
import tk1.b;
import bl1.a;
import mk1.b0;
import lm1.e;
import com.kuaishou.live.common.core.component.gift.gift.p;
import com.kuaishou.live.external.invoke.deserializer.gift.PacketGift;
import java.lang.Math;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import o56.a;
import k2b.u1;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kuaishou.live.common.core.basic.widget.VerticalPageIndicator;
import android.widget.LinearLayout;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.library.widget.viewpager.GridViewPager;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import d61.y;

public class w	// class@0031b2
{

    public void w(){
       super();
    }
    public static int a(DrawingGift p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Iterator iterator = p0.mPoints.iterator();
       while (iterator.hasNext()) {
          Gift gift = a.a(iterator.next().mGiftId);
          if (gift != null) {
             i = i + gift.mPrice;
          }
       }
       return i;
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, w.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = a.t().u("SOURCE_LIVE").d("enableVoicePartyRefreshPacketData", false);
       l0.n("ÇÐ»»¼Î±öË¢ÐÂ±³°üÀñÎï enable="+b);
       return b;
    }
    public static int c(GiftPanelItem p0,int p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ow, "30");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 != null && !q.f(p0.getSubPanelItems())) {
          int i = 0;
          while (i < p0.getSubPanelItems().size()) {
             GiftPanelItem giftPanelIte = p0.getSubPanelItems().get(i);
             if (giftPanelIte != null && (giftPanelIte.getGift() != null && p1 == giftPanelIte.getGift().mId)) {
                return i;
             }
             i = i + 1;
          }
       }
       return -1;
    }
    public static int d(GiftPanelItem p0,Gift p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, w.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null && !q.f(p0.getSubPanelItems())) {
          int i = 0;
          while (i < p0.getSubPanelItems().size()) {
             GiftPanelItem giftPanelIte = p0.getSubPanelItems().get(i);
             if (giftPanelIte != null && p1.equals(giftPanelIte.getGift())) {
                return i;
             }
             i = i + 1;
          }
       }
       return -1;
    }
    public static int e(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Integer integer = p0.I.get(p0.H);
       int i = (integer == null)? 0: integer.intValue();
       return i;
    }
    public static int f(b p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, w.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = w$a.a[p0.d().ordinal()];
       if (i == 1) {
          return p1.o.A2();
       }
       if (i == 2) {
          return p1.B.A2();
       }
       if (i == 3) {
          return p1.C.A2();
       }
       if (i == 4) {
          return p1.D.A2();
       }
       if (i == 5) {
          return p1.E.A2();
       }
       w.s();
       return -1;
    }
    public static int g(b p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, w.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = w$a.a[p0.d().ordinal()];
       if (i == 1) {
          return p1.o.getPageIndex();
       }
       if (i == 2) {
          return p1.B.e();
       }
       if (i == 3) {
          return p1.C.e();
       }
       if (i != 4) {
          return -1;
       }
       return p1.D.e();
    }
    public static Gift h(b p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, w.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = w$a.a[p0.d().ordinal()];
       if (i == 1) {
          return p1.o.M2();
       }
       if (i == 2) {
          return p1.B.b();
       }
       if (i == 3) {
          return p1.C.b();
       }
       if (i == 4) {
          return p1.D.b();
       }
       if (i == 5) {
          return p1.E.b();
       }
       w.s();
       return null;
    }
    public static int i(b p0,h p1,Gift p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, w.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = w$a.a[p0.d().ordinal()];
       if (i == 1) {
          return p1.o.B2(p2).a;
       }
       if (i == 2) {
          return p1.B.B2(p2);
       }
       if (i == 3) {
          return p1.C.B2(p2);
       }
       if (i == 4) {
          return p1.D.B2(p2);
       }
       w.s();
       return -1;
    }
    public static GiftPanelItem j(b p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, w.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = w$a.a[p0.d().ordinal()];
       if (i == 1) {
          return p1.o.a();
       }
       if (i == 2) {
          return p1.B.a();
       }
       if (i == 3) {
          return p1.C.a();
       }
       if (i == 4) {
          return p1.D.a();
       }
       if (i == 5) {
          return p1.E.a();
       }
       w.s();
       return null;
    }
    public static e k(b p0,h p1,Gift p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, w.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e(p.a(p0.d()), w.i(p0, p1, p2), w.g(p0, p1));
    }
    public static int l(Gift p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (p0 instanceof PacketGift)? Math.min(p0.mCount, p0.mMaxBatchCount): p0.mMaxBatchCount;
       return i;
    }
    public static int m(b p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, w.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = w$a.a[p0.d().ordinal()];
       if (i == 1) {
          return p1.o.P2();
       }
       if (i == 2) {
          return p1.B.f();
       }
       if (i == 3) {
          return p1.C.f();
       }
       if (i == 4) {
          return p1.D.f();
       }
       w.s();
       return -1;
    }
    public static b0 n(List p0,int p1){
       b0 obj;
       if (PatchProxy.isSupport(w.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, w.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new b0();
       int i = 0;
       while (i < p0.size()) {
          GiftPanelItem giftPanelIte = p0.get(i);
          boolean b = true;
          if (PatchProxy.isSupport(w.class)) {
             Gift obj1 = PatchProxy.applyTwoRefs(giftPanelIte, Integer.valueOf(p1), null, w.class, "26");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else if(giftPanelIte == null){
                obj1 = giftPanelIte.getGift();
                if (obj1 == null || obj1.mId != p1) {
                   if (PatchProxy.isSupport(w.class)) {
                      Object obj2 = PatchProxy.applyTwoRefs(giftPanelIte, Integer.valueOf(p1), null, w.class, "27");
                      if (obj2 != PatchProxyResult.class) {
                         b = obj2.booleanValue();
                      }
                   }
                   if (w.c(giftPanelIte, p1) == -1) {
                   label_0077 :
                      b = false;
                   }
                }
             }
          }else {
             goto label_0047 ;
          }
          if (b) {
             obj.a = i;
             obj.b = w.c(giftPanelIte, p1);
             break ;
          }
          i = i + 1;
       }
       return obj;
    }
    public static b0 o(List p0,Gift p1){
       b0 obj = PatchProxy.applyTwoRefs(p0, p1, null, w.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b0();
       if (p1 == null) {
          return obj;
       }
       int i = 0;
       while (i < p0.size()) {
          GiftPanelItem giftPanelIte = p0.get(i);
          Gift obj1 = PatchProxy.applyTwoRefs(giftPanelIte, p1, null, w.class, "25");
          boolean b = true;
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(giftPanelIte == null){
             obj1 = giftPanelIte.getGift();
             if (obj1 == null || !obj1.equals(p1)) {
                Object obj2 = PatchProxy.applyTwoRefs(giftPanelIte, p1, null, w.class, "28");
                if (obj2 != PatchProxyResult.class) {
                   b = obj2.booleanValue();
                }else if(w.d(giftPanelIte, p1) != -1){
                }
             }
          }
       label_005f :
          if (b) {
             obj.a = i;
             obj.b = w.d(giftPanelIte, p1);
             b.d0(LiveLogTag.GIFT, "GiftBoxViewRecoveryData.recovery indexOfGiftPanelItem", " panelIndex", Integer.valueOf(i), "mAlbumItemIndex", Integer.valueOf(obj.b));
             break ;
          }
          i = i + 1;
       }
       return obj;
    }
    public static boolean p(GifshowActivity p0,String p1,LiveStreamFeed p2){
       long l1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, w.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = QCurrentUser.me().isLogined();
       String id = QCurrentUser.me().getId();
       w ow = w.class;
       long l = 0;
       if (PatchProxy.isSupport(ow)) {
          Object obj1 = PatchProxy.applyTwoRefs(id, Long.valueOf(l), null, ow, "2");
          if (obj1 != patchProxyRe) {
             l1 = obj1.longValue();
          }else {
             try{
             label_0045 :
                l1 = Long.parseLong(id);
             }catch(java.lang.Exception e0){
                l1 = l;
             }
          }
       }else {
          goto label_0045 ;
       }
    }
    public static void q(VerticalPageIndicator p0,int p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, ow, "5")) {
          return;
       }
       if (!p0.getVisibility() && p0.getChildCount() > p1) {
          p0.setPageIndex(p1);
       }
       return;
    }
    public static void r(HorizontalPageIndicator p0,int p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, ow, "4")) {
          return;
       }
       if (!p0.getVisibility() && p0.getChildCount() > p1) {
          p0.setPageIndex(p1);
       }
       return;
    }
    public static void s(){
       if (PatchProxy.applyVoid(null, null, w.class, "22")) {
          return;
       }
       ExceptionHandler.handleCaughtException(new IllegalArgumentException("getCurrentSelectedGift currentGiftTab invalid"));
       return;
    }
    public static void t(b p0,h p1,boolean p2){
       if (PatchProxy.isSupport(w.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, w.class, "21")) {
          return;
       }
       int i = w$a.a[p0.d().ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i != 5) {
                      w.s();
                   }else {
                      p1.E.w2(p2);
                   }
                }else {
                   p1.D.w2(p2);
                }
             }else {
                p1.C.w2(p2);
             }
          }else {
             p1.B.w2(p2);
          }
       }else {
          p1.o.w2(p2);
       }
       return;
    }
    public static void u(GridViewPager p0,VerticalPageIndicator p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, w.class, "7")) {
          return;
       }
       if (p0 != null && p1 != null) {
          int pageCount = p0.getPageCount();
          if (pageCount <= 1) {
             p1.setVisibility(4);
          }else {
             p1.setVisibility(0);
             p1.setItemCount(pageCount);
          }
       }
       return;
    }
    public static void v(GridViewPager p0,HorizontalPageIndicator p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, w.class, "6")) {
          return;
       }
       if (p0 != null && p1 != null) {
          int pageCount = p0.getPageCount();
          if (pageCount <= 1 || y.d(n.d(p0))) {
             p1.setVisibility(4);
          }else {
             p1.setVisibility(0);
             p1.setItemCount(pageCount);
          }
       }
       return;
    }
}
