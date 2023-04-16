package com.kuaishou.post.story.publish.StoryEncodeRequest$a;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import com.kuaishou.post.story.publish.StoryEncodeRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.encode.EncodeRequest;

public class StoryEncodeRequest$a extends EncodeRequest$a	// class@000b7b
{
    public int T;

    public void StoryEncodeRequest$a(){
       super();
    }
    public StoryEncodeRequest G(){
       Object obj = PatchProxy.apply(null, this, StoryEncodeRequest$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new StoryEncodeRequest(this);
    }
    public EncodeRequest a(){
       return this.G();
    }
}
