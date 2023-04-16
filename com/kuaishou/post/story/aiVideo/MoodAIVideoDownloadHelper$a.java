package com.kuaishou.post.story.aiVideo.MoodAIVideoDownloadHelper$a;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.kuaishou.post.story.aiVideo.MoodAIVideoDownloadHelper;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tp4.v;
import java.util.List;

public final class MoodAIVideoDownloadHelper$a extends DownloadConfig	// class@000aa7
{
    public AIVideoBackgroundRecoData a;
    public final MoodAIVideoDownloadHelper b;

    public void MoodAIVideoDownloadHelper$a(MoodAIVideoDownloadHelper p0,AIVideoBackgroundRecoData p1){
       a.p(p1, "mAIVideoBackgroundRecoData");
       this.b = p0;
       super();
       this.a = p1;
    }
    public String getBizType(){
       return "STORY_MOOD_AI_VIDEO_BACKGROUND_BIZ_TYPE";
    }
    public DownloadTask$DownloadTaskType getDownloadPriority(){
       return DownloadTask$DownloadTaskType.IMMEDIATE;
    }
    public File getFileFolder(){
       Object obj = PatchProxy.apply(null, this, MoodAIVideoDownloadHelper$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return v.b.e();
    }
    public String getFileName(){
       Object obj = PatchProxy.apply(null, this, MoodAIVideoDownloadHelper$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return v.b.c(this.a);
    }
    public boolean getNeedUnzip(){
       return false;
    }
    public String getProjectName(){
       return ":ks-features:ft-post:story";
    }
    public List getResourceUrls(){
       Object obj = PatchProxy.apply(null, this, MoodAIVideoDownloadHelper$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.urls;
    }
}
