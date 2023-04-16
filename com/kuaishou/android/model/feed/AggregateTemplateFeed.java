package com.kuaishou.android.model.feed.AggregateTemplateFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yp.d;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class AggregateTemplateFeed extends BaseFeed	// class@000ad5
{
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public LogParam mLogParam;
    public AggregateTemplateMeta mTemplateModel;
    public static final long serialVersionUID = 0x752d68f416336e63;

    public void AggregateTemplateFeed(){
       super();
    }
    public String getId(){
       return this.mTemplateModel.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AggregateTemplateFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, AggregateTemplateFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(AggregateTemplateFeed.class, new d());
       }else {
          obj.put(AggregateTemplateFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AggregateTemplateFeed.class, "1")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
