package com.yxcorp.gifshow.follow.stagger.config.FollowStaggerStartupPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.follow.stagger.config.FollowStaggerStartupPojo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.follow.common.data.SurveyWithPhotoPageConfig;
import com.yxcorp.gifshow.follow.common.data.AcquaintancePrivacyPopupConfig;
import com.kwai.feature.api.social.followStagger.model.FollowCoverAspectRatio;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.stream.b;

public final class FollowStaggerStartupPojo$TypeAdapter extends TypeAdapter	// class@00114d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       FollowStaggerStartupPojo$TypeAdapter.e = a.get(FollowStaggerStartupPojo.class);
    }
    public void FollowStaggerStartupPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(SurveyWithPhotoPageConfig.class));
       this.c = p0.j(a.get(AcquaintancePrivacyPopupConfig.class));
       this.d = p0.j(a.get(FollowCoverAspectRatio.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FollowStaggerStartupPojo$TypeAdapter.class, "2");
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
             obj = new FollowStaggerStartupPojo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb809af23:
                      if (str.equals("surveyWithPhotoPageConfig")) {
                         i = 0;
                      }
                      break;
                    case 0xde0af7a7:
                      if (str.equals("acquaintancePrivacyPopup")) {
                         i = 1;
                      }
                      break;
                    case 0x34b2cdb4:
                      if (str.equals("followPageCoverOptimize")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSurveyWithPhotoPageConfig = this.b.read(p0);
                      break;
                    case 1:
                      obj.mAcquaintancePrivacyPopupConfig = this.c.read(p0);
                      break;
                    case 2:
                      obj.mFollowPageCoverOptimize = this.d.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowStaggerStartupPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSurveyWithPhotoPageConfig != null) {
             p0.r("surveyWithPhotoPageConfig");
             this.b.write(p0, p1.mSurveyWithPhotoPageConfig);
          }
          if (p1.mAcquaintancePrivacyPopupConfig != null) {
             p0.r("acquaintancePrivacyPopup");
             this.c.write(p0, p1.mAcquaintancePrivacyPopupConfig);
          }
          if (p1.mFollowPageCoverOptimize != null) {
             p0.r("followPageCoverOptimize");
             this.d.write(p0, p1.mFollowPageCoverOptimize);
          }
          p0.j();
       }
       return;
    }
}
