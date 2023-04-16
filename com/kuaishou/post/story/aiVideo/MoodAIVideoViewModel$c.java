package com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel$c;
import erd.g;
import com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import vp4.a;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundLoadingStatus;
import com.kuaishou.post.story.aiVideo.MoodAIVideoErrorCode;
import nsd.u;
import rp4.a;
import q87.c;
import com.kuaishou.post.story.aiVideo.MoodAIVideoRepo;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import java.util.List;
import java.util.Collection;
import ekd.q;
import tp4.v;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData;

public final class MoodAIVideoViewModel$c implements g	// class@000ab6
{
    public final MoodAIVideoViewModel b;

    public void MoodAIVideoViewModel$c(MoodAIVideoViewModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodAIVideoViewModel$c.class, "1")) {
       }else {
          a.o(p0, "it");
          a uoa = new a(p0.intValue(), AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_PROGRESSING, null, 4, null);
          this.b.r0().postValue(v7);
          if (p0.intValue() == 100) {
             int i = 0;
             Object[] objArray = new Object[i];
             String str = "MoodAIVideoViewModel";
             a.D().w(str, "subscribe finish : progress == 100 ", objArray);
             if (MoodAIVideoViewModel.o0(this.b).c() != null) {
                AIVideoBackgroundData uAIVideoBack = MoodAIVideoViewModel.o0(this.b).c();
                a.m(uAIVideoBack);
                if (!q.f(uAIVideoBack.g())) {
                   AIVideoBackgroundData uAIVideoBack1 = MoodAIVideoViewModel.o0(this.b).c();
                   a.m(uAIVideoBack1);
                   if (v.b.g(uAIVideoBack1.b())) {
                      objArray1 = new Object[i];
                      a.D().w(str, "file download succeed", objArray1);
                      MoodAIVideoViewModel$c tb = this.b;
                      tb.a = MoodAIVideoViewModel.o0(tb).c();
                      uoa = new a(p0.intValue(), AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_FINISH, null, 4, null);
                      this.b.r0().postValue(v7);
                   }else {
                      this.b.r0().postValue(new a(p0.intValue(), AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_FAILED, MoodAIVideoErrorCode.FILE_NOT_EXIST));
                   }
                }
             }
             objArray1 = new Object[i];
             a.D().w(str, "subscribe finish : empty data  ", objArray1);
             this.b.r0().postValue(new a(p0.intValue(), AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_FAILED, MoodAIVideoErrorCode.EMPTY_DATA));
          }
       }
       return;
    }
}
