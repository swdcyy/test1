package com.kuaishou.android.live.model.LiveFeedFunctionShieldSwitchInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.LiveFeedFunctionShieldSwitchInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class LiveFeedFunctionShieldSwitchInfo$TypeAdapter extends TypeAdapter	// class@0007f1
{
    public final Gson a;
    public static final a b;

    static {
       LiveFeedFunctionShieldSwitchInfo$TypeAdapter.b = a.get(LiveFeedFunctionShieldSwitchInfo.class);
    }
    public void LiveFeedFunctionShieldSwitchInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public LiveFeedFunctionShieldSwitchInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveFeedFunctionShieldSwitchInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveFeedFunctionShieldSwitchInfo liveFeedFunc = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveFeedFunc;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveFeedFunc;
       }else {
          p0.c();
          LiveFeedFunctionShieldSwitchInfo liveFeedFunc1 = new LiveFeedFunctionShieldSwitchInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9025abe5:
                   if (str.equals("disableAssociateAreaConfig")) {
                      i = 0;
                   }
                   break;
                 case 0xa9b8c6f6:
                   if (str.equals("disableSimpleLiveCard")) {
                      i = 1;
                   }
                   break;
                 case 0xad0729af:
                   if (str.equals("disableStayInfo")) {
                      i = 2;
                   }
                   break;
                 case 0xc3436d50:
                   if (str.equals("disableGiftRedDot")) {
                      i = 3;
                   }
                   break;
                 case 0xf3b24450:
                   if (str.equals("disableAchievementGiftCurrentInfo")) {
                      i = 4;
                   }
                   break;
                 case 0x163413c1:
                   if (str.equals("disableSimpleLiveRefreshFeedInfo")) {
                      i = 5;
                   }
                   break;
                 case 0x3f8507a6:
                   if (str.equals("disableNewGiftList")) {
                      i = 6;
                   }
                   break;
                 case 0x4466ed73:
                   if (str.equals("disableGiftActivityBanner")) {
                      i = 7;
                   }
                   break;
                 case 0x6b2751ad:
                   if (str.equals("disableSideInfo")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   liveFeedFunc1.mDisableAssociateAreaConfig = KnownTypeAdapters$g.a(p0, liveFeedFunc1.mDisableAssociateAreaConfig);
                   break;
                 case 1:
                   liveFeedFunc1.mDisableSimpleLiveCard = KnownTypeAdapters$g.a(p0, liveFeedFunc1.mDisableSimpleLiveCard);
                   break;
                 case 2:
                   liveFeedFunc1.mDisableStayInfo = KnownTypeAdapters$g.a(p0, liveFeedFunc1.mDisableStayInfo);
                   break;
                 case 3:
                   liveFeedFunc1.mDisableGiftRedDot = KnownTypeAdapters$g.a(p0, liveFeedFunc1.mDisableGiftRedDot);
                   break;
                 case 4:
                   liveFeedFunc1.mDisableAchievementGiftCurrentInfo = KnownTypeAdapters$g.a(p0, liveFeedFunc1.mDisableAchievementGiftCurrentInfo);
                   break;
                 case 5:
                   liveFeedFunc1.mDisableSimpleLiveRefreshFeedInfo = KnownTypeAdapters$g.a(p0, liveFeedFunc1.mDisableSimpleLiveRefreshFeedInfo);
                   break;
                 case 6:
                   liveFeedFunc1.mDisableNewGiftList = KnownTypeAdapters$g.a(p0, liveFeedFunc1.mDisableNewGiftList);
                   break;
                 case 7:
                   liveFeedFunc1.mDisableGiftActivityBanner = KnownTypeAdapters$g.a(p0, liveFeedFunc1.mDisableGiftActivityBanner);
                   break;
                 case 8:
                   liveFeedFunc1.mDisableSideInfo = KnownTypeAdapters$g.a(p0, liveFeedFunc1.mDisableSideInfo);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return liveFeedFunc1;
       }
    }
    public void b(b p0,LiveFeedFunctionShieldSwitchInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFeedFunctionShieldSwitchInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("disableSimpleLiveCard");
          p0.P(p1.mDisableSimpleLiveCard);
          p0.r("disableSimpleLiveRefreshFeedInfo");
          p0.P(p1.mDisableSimpleLiveRefreshFeedInfo);
          p0.r("disableStayInfo");
          p0.P(p1.mDisableStayInfo);
          p0.r("disableSideInfo");
          p0.P(p1.mDisableSideInfo);
          p0.r("disableAchievementGiftCurrentInfo");
          p0.P(p1.mDisableAchievementGiftCurrentInfo);
          p0.r("disableAssociateAreaConfig");
          p0.P(p1.mDisableAssociateAreaConfig);
          p0.r("disableNewGiftList");
          p0.P(p1.mDisableNewGiftList);
          p0.r("disableGiftRedDot");
          p0.P(p1.mDisableGiftRedDot);
          p0.r("disableGiftActivityBanner");
          p0.P(p1.mDisableGiftActivityBanner);
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
