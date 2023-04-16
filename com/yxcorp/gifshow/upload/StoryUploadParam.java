package com.yxcorp.gifshow.upload.StoryUploadParam;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.upload.StoryUploadParam$a;

public class StoryUploadParam implements Serializable	// class@001e55
{
    public int mStoryMode;

    public void StoryUploadParam(){
       super();
       this.mStoryMode = 3;
    }
    public void StoryUploadParam(StoryUploadParam$a p0){
       super();
    }
    public int getStoryMode(){
       return this.mStoryMode;
    }
}
