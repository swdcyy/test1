package com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel$a;
import erd.g;
import com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel;
import java.lang.Object;
import crd.b;
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

public final class MoodAIVideoViewModel$a implements g	// class@000ab4
{
    public final MoodAIVideoViewModel b;

    public void MoodAIVideoViewModel$a(MoodAIVideoViewModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodAIVideoViewModel$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("MoodAIVideoViewModel", "doOnSubscribe: loadingStart ", objArray);
          a uoa = new a(-1, AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_START, null, 4, null);
          this.b.r0().postValue(v6);
       }
       return;
    }
}
