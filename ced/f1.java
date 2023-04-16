package ced.f1;
import msd.l;
import java.lang.String;
import com.yxcorp.gifshow.entity.TagDetailItem$Tag;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.net.URLEncoder;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import ded.a;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.SharePlatformData;

public final class f1 implements l	// class@000553
{
    public final String b;
    public final TagDetailItem$Tag c;
    public final boolean d;
    public final QPhoto e;

    public void f1(String p0,TagDetailItem$Tag p1,boolean p2,QPhoto p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object invoke(Object p0){
       f1 tb = this.b;
       f1 tc = this.c;
       f1 td = this.d;
       f1 te = this.e;
       SharePlatformData$ShareConfig shareConfig = new SharePlatformData$ShareConfig();
       shareConfig.mTitle = a1.r(0x7f104be7, tb);
       TagDetailItem$Tag mDescription = (tc != null && !TextUtils.x(tc.mDescription))? tc.mDescription: a1.p(R.string.arg_RES_7f10156b);
       shareConfig.mSubTitle = mDescription;
       try{
          shareConfig.mShareUrl = a.a(ImmutableMap.of("tagName", URLEncoder.encode(tb, "utf-8"), "rich", String.valueOf(td), "cc", p0.y0()), "text");
       }catch(java.io.UnsupportedEncodingException e0){
          e0.printStackTrace();
       }
       if (tc != null && (!q.f(tc.mBannerUrls) && !TextUtils.x(tc.mBannerUrls.get(0).mUrl))) {
          shareConfig.mCoverUrl = tc.mBannerUrls.get(0).mUrl;
       }else if(te != null){
          shareConfig.mCoverUrl = te.getCoverThumbnailUrl();
       }
       shareConfig.mH5MaxTitleLength = SharePlatformData.getH5MaxTitleLength(p0.v());
       p0 = new SharePlatformData();
       p0.mShareConfig = shareConfig;
       return p0;
    }
}
