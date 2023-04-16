package com.kuaishou.android.model.feed.AppletsFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoronaInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.AppletsMeta;
import ok.k;
import yp.e;
import java.util.Map;

public class AppletsFeed extends BaseFeed	// class@000ad8
{
    public CommonMeta mCommonMeta;
    public CoronaInfo mCoronaInfo;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public AppletsMeta mMiniAppPhoto;
    public PhotoMeta mPhotoMeta;
    public VideoMeta mVideoModel;
    public static final long serialVersionUID = 0xe2369a709524bd34;

    public void AppletsFeed(){
       super();
       this.mCoronaInfo = new CoronaInfo(1, 1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AppletsFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || this.getClass() != p0.getClass()) {
          return b;
       }
       if (!super.equals(p0)) {
          return b;
       }
       return k.a(this.mMiniAppPhoto.mId, p0.mMiniAppPhoto.mId);
    }
    public String getId(){
       AppletsFeed tmMiniAppPho = this.mMiniAppPhoto;
       if (tmMiniAppPho == null) {
          return "";
       }
       return tmMiniAppPho.mId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AppletsFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, AppletsFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(AppletsFeed.class, new e());
       }else {
          obj.put(AppletsFeed.class, null);
       }
       return obj;
    }
}
