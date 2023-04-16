package com.kwai.feature.api.live.service.basic.model.LivePlaybackParam;
import java.io.Serializable;
import java.lang.Cloneable;
import im8.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CloneNotSupportedException;
import ys5.c;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPreInfo;

public class LivePlaybackParam implements Serializable, Cloneable, g	// class@001008
{
    public String mCommodityId;
    public String mFromH5Page;
    public String mFromUtmSource;
    public boolean mIsFromPlaybackList;
    public long mOpenedTimeStamp;
    public QPhoto mPhoto;
    public String mPhotoId;
    public String mPhotoSearchParams;
    public QPreInfo mPreInfo;
    public String mSearchSessionId;
    public int mSource;
    public static final long serialVersionUID = 0xc9f456044e58cd;

    public void LivePlaybackParam(){
       super();
       this.mSource = 0;
       this.mOpenedTimeStamp = -1;
       this.mIsFromPlaybackList = false;
    }
    public LivePlaybackParam clone(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LivePlaybackParam.class, new c());
       }else {
          obj.put(LivePlaybackParam.class, null);
       }
       return obj;
    }
    public String getPrePhotoId(){
       LivePlaybackParam tmPreInfo = this.mPreInfo;
       String str = (tmPreInfo == null)? null: tmPreInfo.mPrePhotoId;
       return str;
    }
    public String getPreUserId(){
       LivePlaybackParam tmPreInfo = this.mPreInfo;
       String str = (tmPreInfo == null)? null: tmPreInfo.mPreUserId;
       return str;
    }
    public String getUtmSource(){
       return this.mFromUtmSource;
    }
    public LivePlaybackParam setSource(int p0){
       this.mSource = p0;
       return this;
    }
}
