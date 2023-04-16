package com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel$mMoodAIVideoConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.post.story.aiVideo.model.MoodAIVideoKSwitchConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class MoodAIVideoViewModel$mMoodAIVideoConfig$2 extends Lambda implements a	// class@000ab8
{
    public static final MoodAIVideoViewModel$mMoodAIVideoConfig$2 INSTANCE;

    static {
       MoodAIVideoViewModel$mMoodAIVideoConfig$2.INSTANCE = new MoodAIVideoViewModel$mMoodAIVideoConfig$2();
    }
    public void MoodAIVideoViewModel$mMoodAIVideoConfig$2(){
       super(0);
    }
    public final MoodAIVideoKSwitchConfig invoke(){
       Object obj = PatchProxy.apply(null, this, MoodAIVideoViewModel$mMoodAIVideoConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("postMoodAIVideoConfig", MoodAIVideoKSwitchConfig.class, MoodAIVideoKSwitchConfig.defaultConfig());
    }
    public Object invoke(){
       return this.invoke();
    }
}
