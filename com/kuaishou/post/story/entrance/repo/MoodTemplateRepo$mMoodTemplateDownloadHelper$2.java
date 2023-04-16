package com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$mMoodTemplateDownloadHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.post.story.entrance.repo.MoodTemplateDownloadHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MoodTemplateRepo$mMoodTemplateDownloadHelper$2 extends Lambda implements a	// class@000b4f
{
    public static final MoodTemplateRepo$mMoodTemplateDownloadHelper$2 INSTANCE;

    static {
       MoodTemplateRepo$mMoodTemplateDownloadHelper$2.INSTANCE = new MoodTemplateRepo$mMoodTemplateDownloadHelper$2();
    }
    public void MoodTemplateRepo$mMoodTemplateDownloadHelper$2(){
       super(0);
    }
    public final MoodTemplateDownloadHelper invoke(){
       Object obj = PatchProxy.apply(null, this, MoodTemplateRepo$mMoodTemplateDownloadHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MoodTemplateDownloadHelper();
    }
    public Object invoke(){
       return this.invoke();
    }
}
