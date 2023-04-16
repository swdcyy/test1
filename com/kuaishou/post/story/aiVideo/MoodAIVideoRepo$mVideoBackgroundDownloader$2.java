package com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$mVideoBackgroundDownloader$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.post.story.aiVideo.MoodAIVideoDownloadHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MoodAIVideoRepo$mVideoBackgroundDownloader$2 extends Lambda implements a	// class@000ab2
{
    public static final MoodAIVideoRepo$mVideoBackgroundDownloader$2 INSTANCE;

    static {
       MoodAIVideoRepo$mVideoBackgroundDownloader$2.INSTANCE = new MoodAIVideoRepo$mVideoBackgroundDownloader$2();
    }
    public void MoodAIVideoRepo$mVideoBackgroundDownloader$2(){
       super(0);
    }
    public final MoodAIVideoDownloadHelper invoke(){
       Object obj = PatchProxy.apply(null, this, MoodAIVideoRepo$mVideoBackgroundDownloader$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MoodAIVideoDownloadHelper();
    }
    public Object invoke(){
       return this.invoke();
    }
}
