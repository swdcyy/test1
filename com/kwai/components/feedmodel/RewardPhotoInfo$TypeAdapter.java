package com.kwai.components.feedmodel.RewardPhotoInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.RewardPhotoInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.UserInfo;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.components.feedmodel.RewardPhotoInfo$RewardBubbleInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.kwai.components.feedmodel.RewardPhotoInfo$RewardBubbleInfo;
import com.google.gson.stream.b;

public final class RewardPhotoInfo$TypeAdapter extends TypeAdapter	// class@000c39
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       RewardPhotoInfo$TypeAdapter.e = a.get(RewardPhotoInfo.class);
    }
    public void RewardPhotoInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(UserInfo.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(RewardPhotoInfo$RewardBubbleInfo$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RewardPhotoInfo$TypeAdapter.class, "2");
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
             obj = new RewardPhotoInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x84f0134f:
                      if (str.equals("enableHoverEntrance")) {
                         i = 0;
                      }
                      break;
                    case 0xa36685de:
                      if (str.equals("rewardOptionType")) {
                         i = 1;
                      }
                      break;
                    case 0xadd9b48c:
                      if (str.equals("bubble")) {
                         i = 2;
                      }
                      break;
                    case 0xbfbef41e:
                      if (str.equals("descClickableText")) {
                         i = 3;
                      }
                      break;
                    case 0xdebb6e73:
                      if (str.equals("descNotClickText")) {
                         i = 4;
                      }
                      break;
                    case 0xed3ff269:
                      if (str.equals("hasReward")) {
                         i = 5;
                      }
                      break;
                    case 0xff6a9f1f:
                      if (str.equals("canReward")) {
                         i = 6;
                      }
                      break;
                    case 0xbd19b59:
                      if (str.equals("actionUrl")) {
                         i = 7;
                      }
                      break;
                    case 0x34023720:
                      if (str.equals("rewardCount")) {
                         i = 8;
                      }
                      break;
                    case 0x35017419:
                      if (str.equals("rewardUsers")) {
                         i = 9;
                      }
                      break;
                    case 0x3a5df932:
                      if (str.equals("headButton")) {
                         i = 10;
                      }
                      break;
                    case 0x3dcb5444:
                      if (str.equals("headButtonNow")) {
                         i = 11;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEnableHoverEntrance = KnownTypeAdapters$g.a(p0, obj.mEnableHoverEntrance);
                      break;
                    case 1:
                      obj.mRewardOptionType = KnownTypeAdapters$k.a(p0, obj.mRewardOptionType);
                      break;
                    case 2:
                      obj.mRewardBubbleInfo = this.d.read(p0);
                      break;
                    case 3:
                      obj.mDescClickableText = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mDescNotClickText = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mHasReward = KnownTypeAdapters$g.a(p0, obj.mHasReward);
                      break;
                    case 6:
                      obj.mCanReward = KnownTypeAdapters$g.a(p0, obj.mCanReward);
                      break;
                    case 7:
                      obj.mActionUrl = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mRewardCount = KnownTypeAdapters$k.a(p0, obj.mRewardCount);
                      break;
                    case 9:
                      obj.mRewaders = this.c.read(p0);
                      break;
                    case 10:
                      obj.mHeadButton = KnownTypeAdapters$g.a(p0, obj.mHeadButton);
                      break;
                    case 11:
                      obj.mHeadButtonNow = KnownTypeAdapters$g.a(p0, obj.mHeadButtonNow);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RewardPhotoInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("rewardCount");
          p0.K((long)p1.mRewardCount);
          p0.r("headButton");
          p0.P(p1.mHeadButton);
          p0.r("headButtonNow");
          p0.P(p1.mHeadButtonNow);
          if (p1.mRewaders != null) {
             p0.r("rewardUsers");
             this.c.write(p0, p1.mRewaders);
          }
          if (p1.mRewardBubbleInfo != null) {
             p0.r("bubble");
             this.d.write(p0, p1.mRewardBubbleInfo);
          }
          p0.r("canReward");
          p0.P(p1.mCanReward);
          p0.r("rewardOptionType");
          p0.K((long)p1.mRewardOptionType);
          p0.r("hasReward");
          p0.P(p1.mHasReward);
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          if (p1.mDescClickableText != null) {
             p0.r("descClickableText");
             TypeAdapters.A.write(p0, p1.mDescClickableText);
          }
          if (p1.mDescNotClickText != null) {
             p0.r("descNotClickText");
             TypeAdapters.A.write(p0, p1.mDescNotClickText);
          }
          p0.r("enableHoverEntrance");
          p0.P(p1.mEnableHoverEntrance);
          p0.j();
       }
       return;
    }
}
