package e92.a;
import java.lang.Object;
import t02.a0;
import com.kwai.framework.model.user.UserInfo;
import mk1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.user.User;
import mk1.b$c;
import mk1.b$b;
import com.kuaishou.live.common.core.component.gift.gift.audience.UiMode;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;
import mk1.w;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import java.util.Map;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import n92.d;
import n92.g0;
import jk1.f;
import co2.f2;
import co2.i0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import ekd.q;
import d61.v;

public class a	// class@0026ad
{

    public void a(){
       super();
    }
    public static b a(a0 p0,UserInfo p1,int p2){
       b$b obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, a.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       UserInfo userInfo = UserInfo.convertFromQUser(p0.c.mEntity.mUser);
       if (p1 == null) {
          p1 = userInfo;
       }
       if (PatchProxy.isSupport(b$c.class)) {
          obj = PatchProxy.applyThreeRefs(userInfo, p1, Integer.valueOf(p2), null, b$c.class, "5");
          if (obj != PatchProxyResult.class) {
          label_0061 :
             return obj.a();
          }
       }
       obj = new b$b(userInfo, p1);
       obj.b(true);
       obj.g(-1);
       obj.f("CHAT_GUEST");
       obj.i(UiMode.ToAudienceMode);
       obj.h(p2);
       goto label_0061 ;
    }
    public static b b(UserInfo p0,int p1,int p2,a0 p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(null, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, a.class, "7");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       b$b uob = b$c.a(a.i(p3), p1);
       uob.h(p2);
       return uob.a();
    }
    public static b c(UserInfo p0,int p1,a0 p2){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyThreeRefs(null, Integer.valueOf(p1), p2, null, a.class, "4");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return a.d(null, p1, p2, GiftTab.NormalGift.name(), 0);
    }
    public static b d(UserInfo p0,int p1,a0 p2,String p3,int p4){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uoa, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p0 == null) {
          p0 = a.i(p2);
       }
       GiftTab giftTab = PatchProxy.applyOneRefs(p3, null, w.class, "34");
       if (giftTab != patchProxyRe) {
       }else {
          giftTab = GiftTab.NormalGift;
          GiftTab packetGift = GiftTab.PacketGift;
          if (!TextUtils.equals(p3, packetGift.name())) {
             packetGift = GiftTab.PrivilegeGift;
             if (!TextUtils.equals(p3, packetGift.name())) {
                packetGift = GiftTab.FansGroupGift;
                if (!TextUtils.equals(p3, packetGift.name())) {
                   packetGift = GiftTab.PropsPanel;
                   if (!TextUtils.equals(p3, packetGift.name())) {
                   label_0079 :
                      b$b uob = b$c.b(p0, p1, giftTab);
                      uob.h(p4);
                      uob.i = 0;
                      return uob.a();
                   }
                }
             }
          }
          giftTab = packetGift;
          goto label_0079 ;
       }
    }
    public static b e(UserInfo p0,int p1,int p2,a0 p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(null, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, a.class, "8");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       b$b uob = b$c.b(a.i(p3), p1, GiftTab.PacketGift);
       uob.h(p2);
       return uob.a();
    }
    public static void f(a0 p0,GiftTab p1,boolean p2,UserInfo p3,int p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
             return;
          }
       }
       a.g(p0, p1, p2, p3, p4, null, null, null);
       return;
    }
    public static void g(a0 p0,GiftTab p1,boolean p2,UserInfo p3,int p4,String p5,Map p6,String p7){
       b$b uob;
       a uoa = a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,Integer.valueOf(p4),p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, null, uoa, "3")) {
             return;
          }
       }
       UserInfo userInfo = a.h(p0);
       UserInfo userInfo1 = a.i(p0);
       if (TextUtils.isEmpty(p7) && p0.N().r2(AudienceBizRelation.GUEST_ACTIVITY)) {
          a0 n2 = p0.n2;
          if (n2 != null && !TextUtils.isEmpty(n2.e())) {
             UserInfo userInfo2 = p0.n2.a();
             if (userInfo2 != null) {
                userInfo1 = userInfo2;
             }
             g0.c(p0, userInfo1, p0.n2.d(), p0.n2.e(), p4);
             return;
          }
       }
       if (TextUtils.isEmpty(p7) && (p0.N().r2(AudienceBizRelation.VOICE_PARTY) && (p0.a1 != null && p0.x1.Wc()))) {
          p7 = "VOICE_PARTY";
       }
    label_0098 :
       if (!TextUtils.isEmpty(p7)) {
          if (p3 == null) {
             p3 = userInfo1;
          }
          uob = new b$b(userInfo, p3);
          uob.b(i);
          uob.h(p4);
          uob.f(p7);
          uob.i(UiMode.ToAudienceMode);
          if (p7.equals("VOICE_PARTY")) {
             uob.e(n.g(p0.a1.r0()));
          }
       }else {
          b$b uob1 = new b$b(userInfo, userInfo1);
          uob1.b(0);
          uob1.i(UiMode.NormalMode);
          uob1.h(p4);
          uob = uob1;
       }
       if (!q.h(p6)) {
          uob.c(p6);
       }
       uob.d(p1);
       if (!TextUtils.isEmpty(p5)) {
          uob.g(v.e(p5, -1));
       }
       if (p0.N().r2(AudienceBizRelation.VOICE_PARTY) || (!p0.N().r2(AudienceBizRelation.VOICE_PARTY_THEATER) && !p0.N().r2(AudienceBizRelation.VOICE_PARTY_KTV))) {
          i = false;
       }
    label_011a :
       uob.n = i;
       uob.o = p2;
       p0.x1.bb(uob.a());
       return;
    }
    public static UserInfo h(a0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserInfo.convertFromQUser(p0.c.mEntity.mUser);
    }
    public static UserInfo i(a0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserInfo.convertFromQUser(p0.c.mEntity.mUser);
    }
}
