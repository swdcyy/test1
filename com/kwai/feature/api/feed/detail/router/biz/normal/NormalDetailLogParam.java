package com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailLogParam;
import java.lang.Object;
import android.os.Bundle;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Parcelable;
import org.parceler.b;
import android.content.Intent;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;

public class NormalDetailLogParam	// class@000eaf
{
    public String doubleRowSlideSessionId;
    public String entranceOperateTitle;
    public String similarPhotoClickDepth;
    public String slideFirstPhotoId;
    public String slideSessionId;
    public String upperRecommendPhotoId;

    public void NormalDetailLogParam(){
       super();
    }
    public static NormalDetailBizParam getBizParamFromBundle(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NormalDetailLogParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelable("normalDetailBizParam"));
    }
    public static NormalDetailLogParam getBizParamFromIntent(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NormalDetailLogParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelableExtra("normalDetailBizParam"));
    }
    public static void processDetailParam(NormalDetailLogParam p0,PhotoDetailParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, NormalDetailLogParam.class, "5")) {
          return;
       }
       if (p0 != null && p1 != null) {
          if (p0.doubleRowSlideSessionId != null) {
             p1.getDetailLogParam().addBizParam("double_row_slide_session_id", p0.doubleRowSlideSessionId);
          }
          if (p0.slideSessionId != null) {
             p1.getDetailLogParam().addBizParam("slide_session_id", p0.slideSessionId);
          }
          if (p0.slideFirstPhotoId != null) {
             p1.getDetailLogParam().addBizParam("slide_first_photo_id", p0.slideFirstPhotoId);
          }
          if (p0.upperRecommendPhotoId != null) {
             p1.getDetailLogParam().addBizParam("upper_recommend_photo_id", p0.upperRecommendPhotoId);
          }
          if (p0.entranceOperateTitle != null) {
             p1.getDetailLogParam().addBizParam("entrance_operate_title", p0.entranceOperateTitle);
          }
          if (p0.similarPhotoClickDepth != null) {
             p1.getDetailLogParam().addBizParam("similar_photo_click_depth", p0.similarPhotoClickDepth);
          }
       }
    label_006a :
       return;
    }
    public void putParamIntoBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NormalDetailLogParam.class, "3")) {
          return;
       }
       p0.putParcelable("normalDetailBizParam", b.c(this));
       return;
    }
    public void putParamIntoIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NormalDetailLogParam.class, "1")) {
          return;
       }
       p0.putExtra("normalDetailBizParam", b.c(this));
       return;
    }
}
