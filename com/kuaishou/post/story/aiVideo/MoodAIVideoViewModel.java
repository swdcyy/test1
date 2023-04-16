package com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel;
import androidx.lifecycle.ViewModel;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel$mMoodAIVideoConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import crd.a;
import com.kuaishou.post.story.aiVideo.MoodAIVideoRepo;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.aiVideo.model.MoodAIVideoKSwitchConfig;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import rp4.a;
import q87.c;
import t45.d;
import brd.z;
import java.util.concurrent.TimeUnit;
import com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel$a;
import erd.g;
import com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel$b;
import erd.a;
import com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel$c;
import com.kuaishou.post.story.aiVideo.MoodAIVideoViewModel$d;
import crd.b;

public final class MoodAIVideoViewModel extends ViewModel	// class@000ab9
{
    public AIVideoBackgroundData a;
    public final MutableLiveData b;
    public MoodAIVideoRepo c;
    public final p d;
    public a e;
    public final AIVideoBackgroundData f;

    public void MoodAIVideoViewModel(AIVideoBackgroundData p0){
       super();
       this.f = p0;
       this.b = new MutableLiveData();
       this.d = s.c(MoodAIVideoViewModel$mMoodAIVideoConfig$2.INSTANCE);
       this.e = new a();
    }
    public static final MoodAIVideoRepo o0(MoodAIVideoViewModel p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("mBackgroundRepo");
       }
       return p0;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, MoodAIVideoViewModel.class, "6")) {
          return;
       }
       this.e.dispose();
       this.e.d();
       this.e = new a();
       return;
    }
    public final AIVideoBackgroundData q0(){
       return this.a;
    }
    public final MutableLiveData r0(){
       return this.b;
    }
    public final MoodAIVideoKSwitchConfig s0(){
       Object obj = PatchProxy.apply(null, this, MoodAIVideoViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final void t0(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodAIVideoViewModel.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodAIVideoViewModel", "handleLoadingProgress", objArray);
       this.e.c(p0.observeOn(d.a).timeout((long)this.s0().mLoadingTimeOutDuration, TimeUnit.SECONDS).doOnSubscribe(new MoodAIVideoViewModel$a(this)).doOnDispose(new MoodAIVideoViewModel$b(this)).subscribe(new MoodAIVideoViewModel$c(this), new MoodAIVideoViewModel$d(this)));
       return;
    }
}
