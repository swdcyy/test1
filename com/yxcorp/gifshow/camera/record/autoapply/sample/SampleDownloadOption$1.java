package com.yxcorp.gifshow.camera.record.autoapply.sample.SampleDownloadOption$1;
import com.kwai.framework.model.feed.BaseFeed;
import qb9.z;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class SampleDownloadOption$1 extends BaseFeed	// class@001d32
{
    public final z val$params;

    public void SampleDownloadOption$1(z p0){
       this.val$params = p0;
       super();
    }
    public String getId(){
       return this.val$params.b;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SampleDownloadOption$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SampleDownloadOption$1.class, null);
       return objectsByTag;
    }
}
