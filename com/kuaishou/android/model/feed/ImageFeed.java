package com.kuaishou.android.model.feed.ImageFeed;
import da6.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CoronaInfo;
import da6.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PhotoMeta;
import yp.u;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class ImageFeed extends BaseFeed implements c	// class@000af1
{
    public PhotoAdvertisementPlaceHolder mAd;
    public CommentMeta mCommentMeta;
    public CommonMeta mCommonMeta;
    public CoronaInfo mCoronaInfo;
    public CoverMeta mCoverMeta;
    public CoverPicRecommendedCropWindow mCoverPicRecommendedCropWindow;
    public ExtMeta mExtMeta;
    public ExtendableModelMap mExtraMap;
    public ImageMeta mImageModel;
    public PhotoMeta mPhotoMeta;
    public RecruitCardInfoModel mRecruitCardInfoModel;
    public User mUser;
    public static final long serialVersionUID = 0x3957d15e07c356f6;

    public void ImageFeed(){
       super();
       this.mExtraMap = new ExtendableModelMap();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, ImageFeed.class, "1")) {
          return;
       }
       super.afterDeserialize();
       if (this.mCoronaInfo == null) {
          this.mCoronaInfo = new CoronaInfo(1, 1);
       }
       return;
    }
    public void f(String p0,Object p1){
       b.c(this, p0, p1);
    }
    public Object getExtra(String p0){
       return b.a(this, p0);
    }
    public ExtendableModelMap getExtraMap(){
       Object obj = PatchProxy.apply(null, this, ImageFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraMap == null) {
          this.mExtraMap = new ExtendableModelMap();
       }
       return this.mExtraMap;
    }
    public String getId(){
       return this.mPhotoMeta.mPhotoId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ImageFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ImageFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ImageFeed.class, new u());
       }else {
          obj.put(ImageFeed.class, null);
       }
       return obj;
    }
    public void putExtra(String p0,Object p1){
       b.b(this, p0, p1);
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageFeed.class, "2")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
