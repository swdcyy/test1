package com.kuaishou.post.story.publish.StoryEncodeInfo;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.kuaishou.post.story.publish.StoryEncodeRequest;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import com.yxcorp.gifshow.encode.EncodeRequest;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import cj9.b;
import java.util.List;
import com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeProfile;
import c26.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class StoryEncodeInfo extends PostEncodeInfo	// class@000b7a
{
    public final int mStoryType;

    public void StoryEncodeInfo(int p0,StoryEncodeRequest p1){
       super(p0, p1, p1.getVideoEncodeSDKInfo(), b.c().getComplexEncodeConfig(p1.getEncodeProfiles()));
       this.mStoryType = p1.mStoryType;
    }
    public void StoryEncodeInfo(StoryEncodeInfo p0){
       super(p0);
       this.mStoryType = p0.mStoryType;
    }
    public StoryEncodeInfo clone(){
       Object obj = PatchProxy.apply(null, this, StoryEncodeInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new StoryEncodeInfo(this);
    }
    public Object clone(){
       return this.clone();
    }
    public boolean isSinglePicture(){
       boolean b = (this.mStoryType == null)? true: false;
       return b;
    }
    public boolean isStoryMood(){
       return true;
    }
}
