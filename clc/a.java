package clc.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.TrendingInfo;
import tkc.f;
import java.lang.StringBuilder;

public class a extends PresenterV2	// class@0005c7
{
    public PhotoDetailParam p;
    public f q;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       DetailLogParam detailLogPar = this.p.getDetailLogParam();
       PhotoDetailParam mPhoto = this.p.mPhoto;
       if (mPhoto == null) {
          return;
       }
       int position = mPhoto.getPosition();
       TrendingInfo trendingInfo = this.q.O(position);
       if (trendingInfo != null) {
          DetailLogParam uDetailLogPa = detailLogPar.addPageUrlParam("trending_id", trendingInfo.mId).addPageUrlParam("trending_name", trendingInfo.mDesc).addPageUrlParam("trending_top", trendingInfo.mTop+"").addPageUrlParam("wordId", trendingInfo.mWordId).addPageUrlParam("trending_type", trendingInfo.mTrendingType);
          String str = (trendingInfo.isEmptyTrending())? "COMMON": trendingInfo.mPopularType;
          uDetailLogPa = uDetailLogPa.addPageUrlParam("popular_type", str);
          String str1 = (trendingInfo.isSubTrending())? "SON": "MAIN";
          uDetailLogPa.addPageUrlParam("trending_event_type", str1);
          position = this.q.F0(position);
          if (position > -1) {
             detailLogPar.addPageUrlParam("trending_index", (position + 1)+"");
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(PhotoDetailParam.class);
       this.q = this.r8("TRENDING_FEED_PAGE_LIST");
       return;
    }
}
