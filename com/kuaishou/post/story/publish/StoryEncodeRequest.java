package com.kuaishou.post.story.publish.StoryEncodeRequest;
import com.yxcorp.gifshow.encode.EncodeRequest;
import com.kuaishou.post.story.publish.StoryEncodeRequest$a;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.publish.StoryEncodeInfo;
import java.lang.Integer;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;

public class StoryEncodeRequest extends EncodeRequest	// class@000b7c
{
    public int mStoryType;

    public void StoryEncodeRequest(StoryEncodeRequest$a p0){
       super(p0);
       this.mStoryType = p0.T;
    }
    public static StoryEncodeRequest$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, StoryEncodeRequest.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new StoryEncodeRequest$a();
    }
    public StoryEncodeInfo toEncodeInfo(int p0){
       if (PatchProxy.isSupport(StoryEncodeRequest.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StoryEncodeRequest.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new StoryEncodeInfo(p0, this);
    }
    public EncodeInfo toEncodeInfo(int p0){
       return this.toEncodeInfo(p0);
    }
    public PostEncodeInfo toEncodeInfo(int p0){
       return this.toEncodeInfo(p0);
    }
}
