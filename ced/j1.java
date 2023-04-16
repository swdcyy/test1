package ced.j1;
import msd.l;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.lang.String;
import lnc.a1;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.music.MusicType;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import ded.a;
import com.yxcorp.gifshow.model.SharePlatformData;

public final class j1 implements l	// class@000560
{
    public final Music b;

    public void j1(Music p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       j1 tb = this.b;
       SharePlatformData$ShareConfig shareConfig = new SharePlatformData$ShareConfig();
       shareConfig.mTitle = a1.r(0x7f104be6, tb.mName);
       shareConfig.mSubTitle = a1.p(0x7f10156b);
       Music mImageUrl = tb.mImageUrl;
       if (mImageUrl != null) {
          shareConfig.mCoverUrl = mImageUrl;
       }else {
          String[] stringArray = e0.b(tb.mAvatarUrls, tb.mAvatarUrl);
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray[i];
             if (!TextUtils.x(oobject)) {
                shareConfig.mCoverUrl = oobject;
                break ;
             }
             i = i + 1;
          }
       }
       shareConfig.mShareUrl = a.a(ImmutableMap.of("musicId", tb.getId(), "musicType", String.valueOf(tb.mType.getValue()), "cc", p0.y0()), "music");
       shareConfig.mH5MaxTitleLength = SharePlatformData.getH5MaxTitleLength(p0.v());
       p0 = new SharePlatformData();
       p0.mShareConfig = shareConfig;
       return p0;
    }
}
