package com.yxcorp.gifshow.corona.common.model.CoronaTubeFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoronaInfo;
import java.lang.String;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jq9.j0;
import java.util.Map;

public class CoronaTubeFeed extends BaseFeed	// class@001225
{
    public CommonMeta mCommonMeta;
    public TubeInfo mContent;
    public CoronaInfo mCoronaInfo;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public PhotoMeta mPhotoMeta;
    public User mUser;
    public static final long serialVersionUID = 0x3232796e82a4fcf8;

    public void CoronaTubeFeed(){
       super();
       this.mCoronaInfo = new CoronaInfo(1, 1);
    }
    public String getId(){
       return this.mPhotoMeta.mPhotoId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaTubeFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CoronaTubeFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CoronaTubeFeed.class, new j0());
       }else {
          obj.put(CoronaTubeFeed.class, null);
       }
       return obj;
    }
}
