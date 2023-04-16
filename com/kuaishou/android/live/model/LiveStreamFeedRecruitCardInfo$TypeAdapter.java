package com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfo$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfo$TypeAdapter$a;

public final class LiveStreamFeedRecruitCardInfo$TypeAdapter extends TypeAdapter	// class@000809
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LiveStreamFeedRecruitCardInfo$TypeAdapter.c = a.get(LiveStreamFeedRecruitCardInfo.class);
    }
    public void LiveStreamFeedRecruitCardInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public LiveStreamFeedRecruitCardInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveStreamFeedRecruitCardInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveStreamFeedRecruitCardInfo liveStreamFe = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveStreamFe;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveStreamFe;
       }else {
          p0.c();
          LiveStreamFeedRecruitCardInfo liveStreamFe1 = new LiveStreamFeedRecruitCardInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xaa4863e8:
                   if (str.equals("jobName")) {
                      i = 0;
                   }
                   break;
                 case 0xe1ad6696:
                   if (str.equals("companyIcon")) {
                      i = 1;
                   }
                   break;
                 case 0xe1afa4a8:
                   if (str.equals("companyName")) {
                      i = 2;
                   }
                   break;
                 case 0x609a9b8:
                   if (str.equals("jobId")) {
                      i = 3;
                   }
                   break;
                 case 0x4246cfe7:
                   if (str.equals("jobSalary")) {
                      i = 4;
                   }
                   break;
                 case 0x5b4a830e:
                   if (str.equals("applyCountText")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   liveStreamFe1.mJobName = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   liveStreamFe1.mCompanyIcon = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new LiveStreamFeedRecruitCardInfo$TypeAdapter$b(this)).a(p0);
                   break;
                 case 2:
                   liveStreamFe1.mCompanyName = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   liveStreamFe1.mJobId = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   liveStreamFe1.mJobSalary = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   liveStreamFe1.mApplyCountText = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return liveStreamFe1;
       }
    }
    public void b(b p0,LiveStreamFeedRecruitCardInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamFeedRecruitCardInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mJobName != null) {
             p0.r("jobName");
             TypeAdapters.A.write(p0, p1.mJobName);
          }
          if (p1.mJobId != null) {
             p0.r("jobId");
             TypeAdapters.A.write(p0, p1.mJobId);
          }
          if (p1.mCompanyName != null) {
             p0.r("companyName");
             TypeAdapters.A.write(p0, p1.mCompanyName);
          }
          if (p1.mCompanyIcon != null) {
             p0.r("companyIcon");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new LiveStreamFeedRecruitCardInfo$TypeAdapter$a(this)).b(p0, p1.mCompanyIcon);
          }
          if (p1.mJobSalary != null) {
             p0.r("jobSalary");
             TypeAdapters.A.write(p0, p1.mJobSalary);
          }
          if (p1.mApplyCountText != null) {
             p0.r("applyCountText");
             TypeAdapters.A.write(p0, p1.mApplyCountText);
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
