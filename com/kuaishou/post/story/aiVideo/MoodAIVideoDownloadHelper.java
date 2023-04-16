package com.kuaishou.post.story.aiVideo.MoodAIVideoDownloadHelper;
import java.lang.Object;
import com.kuaishou.post.story.aiVideo.MoodAIVideoDownloadHelper$costMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.post.story.aiVideo.MoodAIVideoDownloadHelper$moodMmuVideoBackgroundDownloader$2;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MoodAIVideoDownloadHelper	// class@000aaa
{
    public final p a;
    public final p b;

    public void MoodAIVideoDownloadHelper(){
       super();
       this.a = s.c(MoodAIVideoDownloadHelper$costMap$2.INSTANCE);
       this.b = s.c(MoodAIVideoDownloadHelper$moodMmuVideoBackgroundDownloader$2.INSTANCE);
    }
    public final HashMap a(){
       Object obj = PatchProxy.apply(null, this, MoodAIVideoDownloadHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
