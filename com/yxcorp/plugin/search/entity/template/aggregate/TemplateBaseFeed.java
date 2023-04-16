package com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import mkd.a;
import iy5.c;
import im8.g;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import java.lang.String;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t7d.h;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPhoto;

public abstract class TemplateBaseFeed extends SyncableProvider implements a, c, g	// class@0013af
{
    public String mAuthorId;
    public CoverExtInfo mCoverExtInfo;
    public ExtInfo mExtInfo;
    public FeedLogCtx mFeedLogCtx;
    public String mId;
    public boolean mIsShowed;
    public String mItemType;
    public long mPlayPosition;
    public int mPosition;
    public String mSubType;
    public String mTabId;
    public TemplatePhotoType mType;
    public static final long serialVersionUID = 0x5a326cbba6982452;

    public void TemplateBaseFeed(){
       super();
    }
    public void afterDeserialize(){
    }
    public String errorMsg(){
       return "";
    }
    public String getAuthorId(){
       return "";
    }
    public CoverExtInfo getCoverInfo(){
       return this.mCoverExtInfo;
    }
    public FeedLogCtx getFeedLogCtx(){
       return this.mFeedLogCtx;
    }
    public CDNUrl[] getGradientUrls(){
       return null;
    }
    public String getItemId(){
       return this.mId;
    }
    public String getItemName(){
       return "";
    }
    public String getItemType(){
       return "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TemplateBaseFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, TemplateBaseFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(TemplateBaseFeed.class, new h());
       }else {
          obj.put(TemplateBaseFeed.class, null);
       }
       return obj;
    }
    public long getPlayPosition(){
       return this.mPlayPosition;
    }
    public int getPosition(){
       return this.mPosition;
    }
    public QPhoto getQphoto(){
       return null;
    }
    public String getSubType(){
       return "";
    }
    public String getTabId(){
       return this.mTabId;
    }
    public boolean isShowed(){
       return this.mIsShowed;
    }
    public void setAuthorId(String p0){
       this.mAuthorId = p0;
    }
    public void setPlayPosition(long p0){
       this.mPlayPosition = p0;
    }
    public void setPosition(int p0){
       this.mPosition = p0;
    }
    public void setShowed(boolean p0){
       this.mIsShowed = p0;
    }
    public void setTabId(String p0){
       this.mTabId = p0;
    }
    public void setType(String p0){
       this.mItemType = p0;
    }
}
