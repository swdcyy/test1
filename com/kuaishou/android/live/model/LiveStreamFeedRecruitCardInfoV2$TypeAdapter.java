package com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfoV2$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfoV2;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfoV2$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfoV2$TypeAdapter$a;

public final class LiveStreamFeedRecruitCardInfoV2$TypeAdapter extends TypeAdapter	// class@00080d
{
    public final Gson a;
    public static final a b;

    static {
       LiveStreamFeedRecruitCardInfoV2$TypeAdapter.b = a.get(LiveStreamFeedRecruitCardInfoV2.class);
    }
    public void LiveStreamFeedRecruitCardInfoV2$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public LiveStreamFeedRecruitCardInfoV2 a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveStreamFeedRecruitCardInfoV2$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveStreamFeedRecruitCardInfoV2 liveStreamFe = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveStreamFe;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveStreamFe;
       }else {
          p0.c();
          LiveStreamFeedRecruitCardInfoV2 liveStreamFe1 = new LiveStreamFeedRecruitCardInfoV2();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa696ae1e:
                   if (str.equals("displayApplyButton")) {
                      i = 0;
                   }
                   break;
                 case 0xaa4863e8:
                   if (str.equals("jobName")) {
                      i = 1;
                   }
                   break;
                 case 0xab45a538:
                   if (str.equals("cityText")) {
                      i = 2;
                   }
                   break;
                 case 0x609a9b8:
                   if (str.equals("jobId")) {
                      i = 3;
                   }
                   break;
                 case 0xa0b8566:
                   if (str.equals("routerUrl")) {
                      i = 4;
                   }
                   break;
                 case 0x21263db4:
                   if (str.equals("jobSalaryText")) {
                      i = 5;
                   }
                   break;
                 case 0x2126d20b:
                   if (str.equals("jobSalaryUnit")) {
                      i = 6;
                   }
                   break;
                 case 0x4980c48c:
                   if (str.equals("welfare")) {
                      i = 7;
                   }
                   break;
                 case 0x560d9c95:
                   if (str.equals("ageScope")) {
                      i = 8;
                   }
                   break;
                 case 0x5b4a830e:
                   if (str.equals("applyCountText")) {
                      i = 9;
                   }
                   break;
                 case 0x61b9658d:
                   if (str.equals("applyButtonText")) {
                      i = 10;
                   }
                   break;
                 case 0x75132af1:
                   if (str.equals("sameCity")) {
                      i = 11;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   liveStreamFe1.mShouldDisplayApplyButton = KnownTypeAdapters$g.a(p0, liveStreamFe1.mShouldDisplayApplyButton);
                   break;
                 case 1:
                   liveStreamFe1.mJobName = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   liveStreamFe1.mCityText = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   liveStreamFe1.mJobId = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   liveStreamFe1.mRouterUrl = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   liveStreamFe1.mJobSalaryText = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   liveStreamFe1.mJobSalaryUnit = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   liveStreamFe1.mWelfare = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new LiveStreamFeedRecruitCardInfoV2$TypeAdapter$b(this)).a(p0);
                   break;
                 case 8:
                   liveStreamFe1.mAgeScope = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   liveStreamFe1.mApplyCountText = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   liveStreamFe1.mApplyButtonText = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   liveStreamFe1.mIsSameCity = KnownTypeAdapters$g.a(p0, liveStreamFe1.mIsSameCity);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return liveStreamFe1;
       }
    }
    public void b(b p0,LiveStreamFeedRecruitCardInfoV2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamFeedRecruitCardInfoV2$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mJobId != null) {
             p0.r("jobId");
             TypeAdapters.A.write(p0, p1.mJobId);
          }
          if (p1.mJobName != null) {
             p0.r("jobName");
             TypeAdapters.A.write(p0, p1.mJobName);
          }
          if (p1.mApplyCountText != null) {
             p0.r("applyCountText");
             TypeAdapters.A.write(p0, p1.mApplyCountText);
          }
          if (p1.mJobSalaryText != null) {
             p0.r("jobSalaryText");
             TypeAdapters.A.write(p0, p1.mJobSalaryText);
          }
          if (p1.mJobSalaryUnit != null) {
             p0.r("jobSalaryUnit");
             TypeAdapters.A.write(p0, p1.mJobSalaryUnit);
          }
          p0.r("displayApplyButton");
          p0.P(p1.mShouldDisplayApplyButton);
          if (p1.mApplyButtonText != null) {
             p0.r("applyButtonText");
             TypeAdapters.A.write(p0, p1.mApplyButtonText);
          }
          p0.r("sameCity");
          p0.P(p1.mIsSameCity);
          if (p1.mCityText != null) {
             p0.r("cityText");
             TypeAdapters.A.write(p0, p1.mCityText);
          }
          if (p1.mWelfare != null) {
             p0.r("welfare");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new LiveStreamFeedRecruitCardInfoV2$TypeAdapter$a(this)).b(p0, p1.mWelfare);
          }
          if (p1.mAgeScope != null) {
             p0.r("ageScope");
             TypeAdapters.A.write(p0, p1.mAgeScope);
          }
          if (p1.mRouterUrl != null) {
             p0.r("routerUrl");
             TypeAdapters.A.write(p0, p1.mRouterUrl);
          }
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
