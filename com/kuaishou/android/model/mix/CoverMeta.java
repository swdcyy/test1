package com.kuaishou.android.model.mix.CoverMeta;
import java.io.Serializable;
import mkd.a;
import da6.c;
import java.lang.Object;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.String;
import da6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class CoverMeta implements Serializable, a, c	// class@000c4e
{
    public String mAnchorPath;
    public CDNUrl[] mBackgroundImageUrls;
    public int mColor;
    public String mCoverId;
    public CoverImageType mCoverImageType;
    public boolean mCoverPrefetched;
    public PhotoCoverStyle mCoverStyle;
    public String mCoverThumbnailUrl;
    public CDNUrl[] mCoverThumbnailUrls;
    public String mCoverUrl;
    public CDNUrl[] mCoverUrls;
    public ExtendableModelMap mExtraMap;
    public String mFFCoverThumbnailUrl;
    public CDNUrl[] mFFCoverThumbnailUrls;
    public int mHeight;
    public CoverSize mOverrideCoverSize;
    public int mOverrideCoverThumbnailType;
    public CDNUrl[] mOverrideCoverThumbnailUrls;
    public String mPhotoLiveId;
    public CDNUrl[] mProfileAnimatedCoverUrls;
    public CDNUrl[] mSfStarCoverUrls;
    public CDNUrl[] mWebpGifUrls;
    public int mWidth;
    public static final long serialVersionUID = 0xc37854147491e14c;

    public void CoverMeta(){
       super();
       this.mExtraMap = new ExtendableModelMap();
    }
    public void afterDeserialize(){
    }
    public void f(String p0,Object p1){
       b.c(this, p0, p1);
    }
    public int getColor(){
       return this.mColor;
    }
    public String getCoverThumbnailUrl(){
       return this.mCoverThumbnailUrl;
    }
    public String getCoverUrl(){
       return this.mCoverUrl;
    }
    public Object getExtra(String p0){
       return b.a(this, p0);
    }
    public ExtendableModelMap getExtraMap(){
       Object obj = PatchProxy.apply(null, this, CoverMeta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraMap == null) {
          this.mExtraMap = new ExtendableModelMap();
       }
       return this.mExtraMap;
    }
    public void putExtra(String p0,Object p1){
       b.b(this, p0, p1);
    }
    public void updateCoverMetaWhenRrefreshFeed(CoverMeta p0){
       this.mCoverUrl = p0.mCoverUrl;
       this.mCoverUrls = p0.mCoverUrls;
       this.mCoverThumbnailUrl = p0.mCoverThumbnailUrl;
       this.mCoverThumbnailUrls = p0.mCoverThumbnailUrls;
       this.mOverrideCoverThumbnailUrls = p0.mOverrideCoverThumbnailUrls;
    }
}
