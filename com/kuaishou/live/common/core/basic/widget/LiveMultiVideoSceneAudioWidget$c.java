package com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget$c;
import ub.a;
import com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qrd.l1;
import io.reactivex.subjects.PublishSubject;

public final class LiveMultiVideoSceneAudioWidget$c extends a	// class@000f1c
{
    public final LiveMultiVideoSceneAudioWidget b;

    public void LiveMultiVideoSceneAudioWidget$c(LiveMultiVideoSceneAudioWidget p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveMultiVideoSceneAudioWidget$c.class, "1")) {
       }else {
          this.b.d.onNext(l1.a);
       }
       return;
    }
}
