package com.kuaishou.live.common.course.model.LiveCourseConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.course.model.LiveCourseConfig;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class LiveCourseConfig$TypeAdapter extends TypeAdapter	// class@0017d5
{
    public final Gson a;
    public static final a b;

    static {
       LiveCourseConfig$TypeAdapter.b = a.get(LiveCourseConfig.class);
    }
    public void LiveCourseConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCourseConfig$TypeAdapter.class, "2");
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
             obj = new LiveCourseConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x87a31358:
                      if (str.equals("isTeacher")) {
                         i = 0;
                      }
                      break;
                    case 0xdfdcb6ea:
                      if (str.equals("liveCourseSellingDefaultStatus")) {
                         i = 1;
                      }
                      break;
                    case 0x2d5ef557:
                      if (str.equals("courseAdsAudienceButtonPressed")) {
                         i = 2;
                      }
                      break;
                    case 0x37b6f912:
                      if (str.equals("courseAdsAudienceButtonNormal")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mIsTeacher = KnownTypeAdapters$g.a(p0, obj.mIsTeacher);
                      break;
                    case 1:
                      obj.mIsLiveCoursePromotionEnabledDefault = KnownTypeAdapters$g.a(p0, obj.mIsLiveCoursePromotionEnabledDefault);
                      break;
                    case 2:
                      obj.mCourseAdsAudienceButtonPressed = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mCourseAdsAudienceButtonNormal = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCourseConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("isTeacher");
          p0.P(p1.mIsTeacher);
          if (p1.mCourseAdsAudienceButtonNormal != null) {
             p0.r("courseAdsAudienceButtonNormal");
             TypeAdapters.A.write(p0, p1.mCourseAdsAudienceButtonNormal);
          }
          if (p1.mCourseAdsAudienceButtonPressed != null) {
             p0.r("courseAdsAudienceButtonPressed");
             TypeAdapters.A.write(p0, p1.mCourseAdsAudienceButtonPressed);
          }
          p0.r("liveCourseSellingDefaultStatus");
          p0.P(p1.mIsLiveCoursePromotionEnabledDefault);
          p0.j();
       }
       return;
    }
}
