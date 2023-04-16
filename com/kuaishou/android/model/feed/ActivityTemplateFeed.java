package com.kuaishou.android.model.feed.ActivityTemplateFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kuaishou.android.model.mix.TemplateFeedMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yp.a;
import java.util.Map;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class ActivityTemplateFeed extends BaseFeed	// class@000ad0
{
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public TemplateFeedMeta mTemplateFeedModel;
    public static final long serialVersionUID = 0xafad2a55b0ed13ec;

    public void ActivityTemplateFeed(){
       super();
    }
    public String getId(){
       return this.mTemplateFeedModel.mTemplateId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivityTemplateFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ActivityTemplateFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ActivityTemplateFeed.class, new a());
       }else {
          obj.put(ActivityTemplateFeed.class, null);
       }
       return obj;
    }
    public boolean isLive(){
       ActivityTemplateFeed obj = PatchProxy.apply(null, this, ActivityTemplateFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mTemplateFeedModel;
       boolean b = (obj != null && (!TextUtils.x(obj.mJumpUrl) && (this.mTemplateFeedModel.mJumpUrl).startsWith("kwai://live/play/")))? true: false;
       return b;
    }
}
