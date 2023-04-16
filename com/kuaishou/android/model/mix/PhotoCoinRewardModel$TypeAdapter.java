package com.kuaishou.android.model.mix.PhotoCoinRewardModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCoinRewardModel;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class PhotoCoinRewardModel$TypeAdapter extends TypeAdapter	// class@000d31
{
    public final Gson a;
    public static final a b;

    static {
       PhotoCoinRewardModel$TypeAdapter.b = a.get(PhotoCoinRewardModel.class);
    }
    public void PhotoCoinRewardModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoCoinRewardModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoCoinRewardModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoCoinRewardModel photoCoinRew = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoCoinRew;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoCoinRew;
       }else {
          p0.c();
          PhotoCoinRewardModel photoCoinRew1 = new PhotoCoinRewardModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xf98d03b9:
                   if (str.equals("photoRewardAmount")) {
                      i = 0;
                   }
                   break;
                 case 0xff6a9f1f:
                   if (str.equals("canReward")) {
                      i = 1;
                   }
                   break;
                 case 0x1f2095f1:
                   if (str.equals("readerRewarded")) {
                      i = 2;
                   }
                   break;
                 case 0x32e511f2:
                   if (str.equals("rewardPhotoOptionType")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoCoinRew1.mRewardAmount = KnownTypeAdapters$n.a(p0, photoCoinRew1.mRewardAmount);
                   break;
                 case 1:
                   photoCoinRew1.mCanReward = KnownTypeAdapters$g.a(p0, photoCoinRew1.mCanReward);
                   break;
                 case 2:
                   photoCoinRew1.mRewardedCurrentPhoto = KnownTypeAdapters$g.a(p0, photoCoinRew1.mRewardedCurrentPhoto);
                   break;
                 case 3:
                   photoCoinRew1.mRewardOptionType = KnownTypeAdapters$k.a(p0, photoCoinRew1.mRewardOptionType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoCoinRew1;
       }
    }
    public void b(b p0,PhotoCoinRewardModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoCoinRewardModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("canReward");
          p0.P(p1.mCanReward);
          p0.r("readerRewarded");
          p0.P(p1.mRewardedCurrentPhoto);
          p0.r("photoRewardAmount");
          p0.K(p1.mRewardAmount);
          p0.r("rewardPhotoOptionType");
          p0.K((long)p1.mRewardOptionType);
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
