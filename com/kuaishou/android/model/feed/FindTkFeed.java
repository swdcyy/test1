package com.kuaishou.android.model.feed.FindTkFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kuaishou.android.model.mix.FindTkFeedMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yp.r;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class FindTkFeed extends BaseFeed	// class@000ae8
{
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public FindTkFeedMeta mFindTkFeedMeta;
    public PhotoMeta mPhotoMeta;
    public static final long serialVersionUID = 0x61c231329718a552;

    public void FindTkFeed(){
       super();
    }
    public String getId(){
       return this.mFindTkFeedMeta.mTemplateId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FindTkFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, FindTkFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(FindTkFeed.class, new r());
       }else {
          obj.put(FindTkFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FindTkFeed.class, "1")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
