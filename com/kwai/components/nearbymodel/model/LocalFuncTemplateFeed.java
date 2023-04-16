package com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fi5.r;
import java.util.Map;

public class LocalFuncTemplateFeed extends BaseFeed	// class@000c88
{
    public boolean isLocalClickServerReport;
    public boolean isLocalShowServerReport;
    public CommonMeta mCommonMeta;
    public LocalFuncTemplateFeed$ContentInfo mContentInfo;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public static final long serialVersionUID = 0x71ce9aac3cc0b4d0;

    public void LocalFuncTemplateFeed(){
       super();
    }
    public String getId(){
       return this.mCommonMeta.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalFuncTemplateFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LocalFuncTemplateFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LocalFuncTemplateFeed.class, new r());
       }else {
          obj.put(LocalFuncTemplateFeed.class, null);
       }
       return obj;
    }
}
