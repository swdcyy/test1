package com.kuaishou.post.story.publish.StoryUploadRequest;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.kuaishou.post.story.publish.StoryUploadRequest$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class StoryUploadRequest extends UploadRequest	// class@000b7e
{

    public void StoryUploadRequest(){
       super();
    }
    public static StoryUploadRequest$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, StoryUploadRequest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new StoryUploadRequest$a();
    }
}
