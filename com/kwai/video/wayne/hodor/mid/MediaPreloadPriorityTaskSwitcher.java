package com.kwai.video.wayne.hodor.mid.MediaPreloadPriorityTaskSwitcher;
import com.kwai.video.wayne.hodor.mid.IPreloadTaskSwitcher;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.video.hodor.AbstractHodorPreloadTask;
import com.kwai.video.hodor.MediaPreloadPriorityTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public class MediaPreloadPriorityTaskSwitcher implements IPreloadTaskSwitcher	// class@000c9b
{
    public String mCacheKey;
    public ArrayList mUrlList;

    public void MediaPreloadPriorityTaskSwitcher(List p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.mUrlList = uArrayList;
       uArrayList.addAll(p0);
    }
    public AbstractHodorPreloadTask getNextTask(){
       return this.getNextTask();
    }
    public MediaPreloadPriorityTask getNextTask(){
       Object obj = PatchProxy.apply(null, this, MediaPreloadPriorityTaskSwitcher.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mUrlList.isEmpty()) {
          return null;
       }
       return new MediaPreloadPriorityTask(this.mUrlList.remove(0), null, this.mCacheKey);
    }
    public void setCacheKey(String p0){
       this.mCacheKey = p0;
    }
    public void setLastSelectRepId(int p0){
    }
}
