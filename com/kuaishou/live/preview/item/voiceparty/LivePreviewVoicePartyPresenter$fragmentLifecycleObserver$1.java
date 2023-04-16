package com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter$fragmentLifecycleObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import nl3.a;
import java.lang.Enum;
import java.lang.Boolean;
import brd.y;
import pl3.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class LivePreviewVoicePartyPresenter$fragmentLifecycleObserver$1 implements LifecycleEventObserver	// class@000e5d
{
    public final LivePreviewVoicePartyPresenter b;

    public void LivePreviewVoicePartyPresenter$fragmentLifecycleObserver$1(LivePreviewVoicePartyPresenter p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePreviewVoicePartyPresenter$fragmentLifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       int i = a.a[p1.ordinal()];
       if (i != 1) {
          if (i == 2) {
             this.b.D.onNext(Boolean.TRUE);
             this.b.W8();
          }
       }else if(a.a.a(LivePreviewVoicePartyPresenter.S8(this.b))){
          this.b.D.onNext(Boolean.FALSE);
          this.b.V8();
       }
       return;
    }
}
