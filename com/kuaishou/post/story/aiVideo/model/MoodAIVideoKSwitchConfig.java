package com.kuaishou.post.story.aiVideo.model.MoodAIVideoKSwitchConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class MoodAIVideoKSwitchConfig implements Serializable	// class@000abf
{
    public int mLoadingTimeOutDuration;
    public int mTopK;
    public static final long serialVersionUID = 0xb86e5648cc3a72c3;

    public void MoodAIVideoKSwitchConfig(int p0,int p1){
       super();
       this.mLoadingTimeOutDuration = p0;
       this.mTopK = p1;
    }
    public static MoodAIVideoKSwitchConfig defaultConfig(){
       Object obj = PatchProxy.apply(null, null, MoodAIVideoKSwitchConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MoodAIVideoKSwitchConfig(30, 3);
    }
}
