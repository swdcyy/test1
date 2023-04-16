package com.yxcorp.gifshow.startup.HomeStartupPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.startup.HomeStartupPojo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.IncentivePopupInfo;
import com.yxcorp.gifshow.model.KSActivityConfig;
import com.yxcorp.gifshow.model.SearchBarText;
import com.kuaishou.android.model.mix.RetentionActivityModel;
import com.kwai.feature.api.feed.home.menu.SidebarMenuItem;
import com.yxcorp.gifshow.homepage.menu.redesign.HomeMenuRedesignConfig;
import com.kwai.framework.model.channel.HotChannel;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.Map;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.google.gson.stream.b;

public final class HomeStartupPojo$TypeAdapter extends TypeAdapter	// class@001d7f
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public final TypeAdapter i;
    public final TypeAdapter j;
    public final TypeAdapter k;
    public static final a l;

    static {
       HomeStartupPojo$TypeAdapter.l = a.get(HomeStartupPojo.class);
    }
    public void HomeStartupPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(IncentivePopupInfo.class));
       this.c = p0.j(a.get(KSActivityConfig.class));
       this.d = p0.j(a.get(SearchBarText.class));
       TypeAdapter typeAdapter = p0.j(a.get(RetentionActivityModel.class));
       this.e = typeAdapter;
       this.f = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, typeAdapter, new KnownTypeAdapters$e());
       this.g = p0.j(a.get(SidebarMenuItem.class));
       this.h = p0.j(a.get(HomeMenuRedesignConfig.class));
       typeAdapter = p0.j(a.get(HotChannel.class));
       this.i = typeAdapter;
       this.j = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.k = p0.j(a.get(ActivityUserIconModel.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, HomeStartupPojo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new HomeStartupPojo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x80ef6675:
                      if (str.equals("remindNewFriendsCount")) {
                         i = 0;
                      }
                      break;
                    case 0x88878f1c:
                      if (str.equals("teenageChannelList")) {
                         i = 1;
                      }
                      break;
                    case 0x956c7e4f:
                      if (str.equals("incentivePopupInfo")) {
                         i = 2;
                      }
                      break;
                    case 0xa23f3665:
                      if (str.equals("fansTopPromoteType")) {
                         i = 3;
                      }
                      break;
                    case 0xaa1dfed6:
                      if (str.equals("activityNickNameIcon")) {
                         i = 4;
                      }
                      break;
                    case 0xbf3adeb9:
                      if (str.equals("ksActivityConfig")) {
                         i = 5;
                      }
                      break;
                    case 0xd510ca4c:
                      if (str.equals("minFollowMomentCount")) {
                         i = 6;
                      }
                      break;
                    case 0xdd51fcf5:
                      if (str.equals("sideBarRightTop")) {
                         i = 7;
                      }
                      break;
                    case 0x9256c61:
                      if (str.equals("aboutSideBarSetting")) {
                         i = 8;
                      }
                      break;
                    case 0x2308c2f4:
                      if (str.equals("sideBarUserText")) {
                         i = 9;
                      }
                      break;
                    case 0x27be0c65:
                      if (str.equals("remindNewFriendsJoinedSlideBar")) {
                         i = 10;
                      }
                      break;
                    case 0x3a8ef918:
                      if (str.equals("searchBarText")) {
                         i = 11;
                      }
                      break;
                    case 0x42d2e299:
                      if (str.equals("nebulaLeftDrawerConfig")) {
                         i = 12;
                      }
                      break;
                    case 0x43c36b15:
                      if (str.equals("enableSystemPushDialogPeriod")) {
                         i = 13;
                      }
                      break;
                    case 0x4f24d80b:
                      if (str.equals("incentiveActivityInfos")) {
                         i = 14;
                      }
                      break;
                    case 0x5dbc35e5:
                      if (str.equals("sidebarExSquareStyle")) {
                         i = 15;
                      }
                      break;
                    case 0x62bc6cd2:
                      if (str.equals("shareTokenToastInterval")) {
                         i = 16;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mRemindNewFriendsCount = KnownTypeAdapters$k.a(p0, obj.mRemindNewFriendsCount);
                      break;
                    case 1:
                      obj.mTeenageChannelList = this.j.read(p0);
                      break;
                    case 2:
                      obj.mIncentivePopupInfo = this.b.read(p0);
                      break;
                    case 3:
                      obj.mFansTopPromoteType = KnownTypeAdapters$k.a(p0, obj.mFansTopPromoteType);
                      break;
                    case 4:
                      obj.mActivityUserIconMode = this.k.read(p0);
                      break;
                    case 5:
                      obj.mKSActivityConfig = this.c.read(p0);
                      break;
                    case 6:
                      obj.mMinFollowMomentCount = KnownTypeAdapters$k.a(p0, obj.mMinFollowMomentCount);
                      break;
                    case 7:
                      obj.mSideBarRightTop = this.g.read(p0);
                      break;
                    case 8:
                      obj.mAboutSideBarSetting = this.g.read(p0);
                      break;
                    case 9:
                      obj.mSideBarUserText = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mRemindNewFriendsJoinedSlideBar = KnownTypeAdapters$g.a(p0, obj.mRemindNewFriendsJoinedSlideBar);
                      break;
                    case 11:
                      obj.mSearchBarText = this.d.read(p0);
                      break;
                    case 12:
                      obj.mGatherCardConfig = this.c.read(p0);
                      break;
                    case 13:
                      obj.mEnableSystemPushDialogPeriod = KnownTypeAdapters$k.a(p0, obj.mEnableSystemPushDialogPeriod);
                      break;
                    case 14:
                      obj.mIncentiveActivityInfo = this.f.read(p0);
                      break;
                    case 15:
                      obj.mSidebarExSquareStyle = this.h.read(p0);
                      break;
                    case 16:
                      obj.mShareTokenToastInterval = KnownTypeAdapters$n.a(p0, obj.mShareTokenToastInterval);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeStartupPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mIncentivePopupInfo != null) {
             p0.r("incentivePopupInfo");
             this.b.write(p0, p1.mIncentivePopupInfo);
          }
          p0.r("remindNewFriendsCount");
          p0.K((long)p1.mRemindNewFriendsCount);
          p0.r("remindNewFriendsJoinedSlideBar");
          p0.P(p1.mRemindNewFriendsJoinedSlideBar);
          p0.r("shareTokenToastInterval");
          p0.K(p1.mShareTokenToastInterval);
          p0.r("minFollowMomentCount");
          p0.K((long)p1.mMinFollowMomentCount);
          p0.r("enableSystemPushDialogPeriod");
          p0.K((long)p1.mEnableSystemPushDialogPeriod);
          p0.r("fansTopPromoteType");
          p0.K((long)p1.mFansTopPromoteType);
          if (p1.mGatherCardConfig != null) {
             p0.r("nebulaLeftDrawerConfig");
             this.c.write(p0, p1.mGatherCardConfig);
          }
          if (p1.mSearchBarText != null) {
             p0.r("searchBarText");
             this.d.write(p0, p1.mSearchBarText);
          }
          if (p1.mIncentiveActivityInfo != null) {
             p0.r("incentiveActivityInfos");
             this.f.write(p0, p1.mIncentiveActivityInfo);
          }
          if (p1.mSideBarRightTop != null) {
             p0.r("sideBarRightTop");
             this.g.write(p0, p1.mSideBarRightTop);
          }
          if (p1.mSideBarUserText != null) {
             p0.r("sideBarUserText");
             TypeAdapters.A.write(p0, p1.mSideBarUserText);
          }
          if (p1.mKSActivityConfig != null) {
             p0.r("ksActivityConfig");
             this.c.write(p0, p1.mKSActivityConfig);
          }
          if (p1.mAboutSideBarSetting != null) {
             p0.r("aboutSideBarSetting");
             this.g.write(p0, p1.mAboutSideBarSetting);
          }
          if (p1.mSidebarExSquareStyle != null) {
             p0.r("sidebarExSquareStyle");
             this.h.write(p0, p1.mSidebarExSquareStyle);
          }
          if (p1.mTeenageChannelList != null) {
             p0.r("teenageChannelList");
             this.j.write(p0, p1.mTeenageChannelList);
          }
          if (p1.mActivityUserIconMode != null) {
             p0.r("activityNickNameIcon");
             this.k.write(p0, p1.mActivityUserIconMode);
          }
          p0.j();
       }
       return;
    }
}
