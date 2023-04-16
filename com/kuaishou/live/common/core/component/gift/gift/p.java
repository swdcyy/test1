package com.kuaishou.live.common.core.component.gift.gift.p;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.gift.p$a;
import java.lang.Enum;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.magiceffect.LiveMagicEffectUtil;
import sz2.g;
import mk1.b;
import java.util.Map;
import ekd.q;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Integer;
import java.util.HashMap;
import va1.s0;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Number;
import wkd.b;
import ad5.a;
import brd.x;
import com.kuaishou.live.common.core.component.gift.gift.o;
import wg3.a;
import android.content.SharedPreferences;
import com.kuaishou.live.external.invoke.deserializer.gift.PacketGift;
import java.lang.Long;
import java.util.Date;
import lnc.a1;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.DateUtils;

public final class p	// class@0012b2
{

    public void p(){
       super();
    }
    public static String a(GiftTab p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       int i = p$a.a[p0.ordinal()];
       if (i == 1) {
          return "FANS_GROUP_PANEL";
       }
       if (i == 2) {
          return "NORMAL_GIFT_PANEL";
       }
       if (i == 3) {
          return "BACKAGE_POP_PANEL";
       }
       if (i == 4) {
          return "PROP_LIST_PANEL";
       }
       if (i != 5) {
          return "";
       }
       return "PRIVILEGE_PANEL";
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, p.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableFixSendGiftComboCountError", false);
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, p.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableRefreshGiftPanelGiftOut", false);
    }
    public static void d(GiftMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, p.class, "3")) {
          return;
       }
       long l = LiveMagicEffectUtil.a(p0.mEffectKey, p0.mGiftId);
       if (g.e(l)) {
          p0.mMagicFaceId = l;
       }
       return;
    }
    public static String e(b p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, p.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return str;
       }
       if (!q.h(p0.c())) {
          str = a.a.q(p0.c());
       }
       return str;
    }
    public static String f(int p0,int p1){
       HashMap obj;
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, op, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new HashMap();
       obj.put("sourceType", String.valueOf(p1));
       obj.put("selectedGiftId", String.valueOf(p0));
       return s0.d("kwailive://giftpanel", obj);
    }
    public static int g(Gift p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       p0 = (p0.isKShellGift() || p0.isNebulaCreditGift())? p0.mVirtualPrice: p0.mPrice;
       return p0;
    }
    public static long h(Gift p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return ((long)p.g(p0) - b.a(0x4c90014d).q());
    }
    public static x i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o(p0);
    }
    public static String j(b p0,boolean p1){
       String str;
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, op, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.i() == 2) {
          str = (p1)? "LIVE_ROOM_EXPAND_GIFT_DIALOG_SEND_GIFT": "LIVE_ROOM_EXPAND_GIFT_DIALOG_KS_COIN";
          return str;
       }else if(p0.i() == 26){
          str = (p1)? "LIVE_ROOM_FANS_GROUP_DAILY_TASK_SEND_GIFT": "LIVE_ROOM_FANS_GROUP_DAILY_TASK_KS_COIN";
          return str;
       }else {
          return "LIVE_ROOM_KS_COIN";
       }
    }
    public static boolean k(int p0){
       int i = 1;
       if (p0 > i) {
       }else {
          i = false;
       }
       return i;
    }
    public static boolean l(){
       Object obj = PatchProxy.apply(null, null, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.a.getBoolean("disableToAudienceGiftSlotDisplay", false) ^ 0x01);
    }
    public static boolean m(Gift p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.a(0x4c90014d).q() - (long)p.g(p0) >= 0)? true: false;
       return b;
    }
    public static void n(long p0,PacketGift p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, null, op, "11")) {
          return;
       }
       Date uDate = new Date(p1.mExpireTime);
       long l = uDate.getTime() - p0;
       float f = (l < 0)? 0xbf800000: (float)(l / 0x36ee80);
       p1.mLeftExpireTime = f;
       p1.mExpireTip = ((float)l - 0x5437904d > 0)? a1.p(0x7f102295): DateUtils.t(uDate.getTime())+a1.p(0x7f102283);
       return;
    }
}
