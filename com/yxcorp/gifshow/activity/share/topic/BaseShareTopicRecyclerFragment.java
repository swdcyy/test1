package com.yxcorp.gifshow.activity.share.topic.BaseShareTopicRecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.activity.share.topic.BaseShareTopicRecyclerFragment$ShareTopicPage;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class BaseShareTopicRecyclerFragment extends RecyclerFragment	// class@001464
{
    public String F;
    public c G;
    public a H;

    public void BaseShareTopicRecyclerFragment(){
       super();
    }
    public abstract BaseShareTopicRecyclerFragment$ShareTopicPage Gh();
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseShareTopicRecyclerFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(BaseShareTopicRecyclerFragment.class, null);
       return objectsByTag;
    }
}
