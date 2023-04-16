package com.kuaishou.post.story.entrance.repo.MoodTemplateDownloadHelper;
import java.lang.Object;
import com.kuaishou.post.story.entrance.repo.MoodTemplateDownloadHelper$costMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.post.story.entrance.repo.MoodTemplateDownloadHelper$moodTemplateDownloader$2;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MoodTemplateDownloadHelper	// class@000b44
{
    public final p a;
    public final p b;

    public void MoodTemplateDownloadHelper(){
       super();
       this.a = s.c(MoodTemplateDownloadHelper$costMap$2.INSTANCE);
       this.b = s.c(MoodTemplateDownloadHelper$moodTemplateDownloader$2.INSTANCE);
    }
    public final HashMap a(){
       Object obj = PatchProxy.apply(null, this, MoodTemplateDownloadHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
