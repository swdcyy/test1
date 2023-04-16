package ced.e1;
import msd.l;
import com.yxcorp.plugin.search.result.hashtag.presenters.d0;
import java.lang.Object;
import mhc.x;
import java.util.Objects;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import ded.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.e;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import java.lang.String;
import lnc.a1;
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

public final class e1 implements l	// class@00054e
{
    public final d0 b;

    public void e1(d0 p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       e1 tb = this.b;
       Objects.requireNonNull(tb);
       SharePlatformData$ShareConfig shareConfig = new SharePlatformData$ShareConfig();
       int i = (g.b())? 0x7f104be5: 0x7f104be4;
       shareConfig.mTitle = a1.r(i, tb.p.mTagName);
       String str = a1.p(R.string.arg_RES_7f104749);
       try{
          shareConfig.mSubTitle = str;
          e p = tb.p;
          shareConfig.mShareUrl = a.a(ImmutableMap.of("magicFaceId", p.mTagId, "magicName", URLEncoder.encode(p.mTagName, "utf-8"), "cc", p0.y0()), "magicFace");
       }catch(java.io.UnsupportedEncodingException e2){
          e2.printStackTrace();
       }
       if (!q.f(tb.p.mIconUrls)) {
          shareConfig.mCoverUrl = tb.p.mIconUrls.get(0).mUrl;
       }
       shareConfig.mH5MaxTitleLength = SharePlatformData.getH5MaxTitleLength(p0.v());
       p0 = new SharePlatformData();
       p0.mShareConfig = shareConfig;
       return p0;
    }
}
