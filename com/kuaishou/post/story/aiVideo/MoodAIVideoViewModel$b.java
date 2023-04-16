package com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel$b;
import erd.a;
import com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import q87.c;
import androidx.lifecycle.MutableLiveData;
import vp4.a;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundLoadingStatus;
import com.kuaishou.post.story.aiVideo.MoodAIVideoErrorCode;
import nsd.u;

public final class MoodAIVideoViewModel$b implements a	// class@000ab5
{
    public final MoodAIVideoViewModel b;

    public void MoodAIVideoViewModel$b(MoodAIVideoViewModel p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MoodAIVideoViewModel$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodAIVideoViewModel", "doOnDispose: loadingCancel ", objArray);
       a uoa = new a(-100, AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_CANCEL, null, 4, null);
       this.b.r0().postValue(v7);
       return;
    }
}
