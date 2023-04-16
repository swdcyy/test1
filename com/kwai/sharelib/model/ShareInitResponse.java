package com.kwai.sharelib.model.ShareInitResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ShareInitResponse implements Serializable	// class@0016fa
{
    public String mCacheScope;
    public long mMaxAge;
    public PainterModel mPainterModel;
    public ShareInitResponse$PanelPoster mPanelPoster;
    public PosterConfig mPosterConfig;
    public ShareInitResponse$SharePanelData mSharePanel;
    public ArrayList mTkConfigList;
    public static final long serialVersionUID = 0xd28260aa63c934cf;

    public void ShareInitResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareInitResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShareInitResponse{mSharePanel="+this.mSharePanel+", mPanelPoster="+this.mPanelPoster+", mMaxAge="+this.mMaxAge+", mCacheScope=\'"+this.mCacheScope+'''+", mPosterConfig="+this.mPosterConfig+", mPainterModel="+this.mPainterModel+", mTkConfigList="+this.mTkConfigList+'}';
    }
}
