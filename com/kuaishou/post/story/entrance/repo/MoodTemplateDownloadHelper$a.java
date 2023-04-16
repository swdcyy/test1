package com.kuaishou.post.story.entrance.repo.MoodTemplateDownloadHelper$a;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.kuaishou.post.story.entrance.repo.MoodTemplateDownloadHelper;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.io.File;

public final class MoodTemplateDownloadHelper$a extends DownloadConfig	// class@000b41
{
    public MoodTemplateData a;
    public final MoodTemplateDownloadHelper b;

    public void MoodTemplateDownloadHelper$a(MoodTemplateDownloadHelper p0,MoodTemplateData p1){
       a.p(p1, "moodTemplateData");
       this.b = p0;
       super();
       this.a = p1;
    }
    public String getBizType(){
       return "STORY_MOOD_TEMPLATE";
    }
    public String getMd5(){
       Object obj = PatchProxy.apply(null, this, MoodTemplateDownloadHelper$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.o;
    }
    public boolean getNeedUnzip(){
       return true;
    }
    public String getProjectName(){
       return ":ks-features:ft-post:story";
    }
    public List getResourceUrls(){
       Object obj = PatchProxy.apply(null, this, MoodTemplateDownloadHelper$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.t();
    }
    public File getUnzipFolder(){
       Object obj = PatchProxy.apply(null, this, MoodTemplateDownloadHelper$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.k());
    }
}
