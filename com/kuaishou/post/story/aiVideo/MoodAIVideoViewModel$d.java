package com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel$d;
import erd.g;
import com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.concurrent.TimeoutException;
import androidx.lifecycle.MutableLiveData;
import vp4.a;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundLoadingStatus;
import com.kuaishou.post.story.aiVideo.MoodAIVideoErrorCode;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.post.story.aiVideo.AIVideoDownloadNetWorkException;

public final class MoodAIVideoViewModel$d implements g	// class@000ab7
{
    public final MoodAIVideoViewModel b;

    public void MoodAIVideoViewModel$d(MoodAIVideoViewModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodAIVideoViewModel$d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          String str = "MoodAIVideoViewModel";
          a.D().A(str, "load error: "+p0, objArray);
          if (p0 instanceof TimeoutException) {
             this.b.r0().postValue(new a(-100, AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_FAILED, MoodAIVideoErrorCode.TIME_OUT));
          }else if(PostUtils.u(p0) || p0 instanceof AIVideoDownloadNetWorkException){
             this.b.r0().postValue(new a(-100, AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_FAILED, MoodAIVideoErrorCode.NETWORK_ERROR));
          }else {
             this.b.r0().postValue(new a(-100, AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_FAILED, MoodAIVideoErrorCode.OTHER));
             PostUtils.D(str, p0.toString(), p0);
          }
       }
       return;
    }
}
