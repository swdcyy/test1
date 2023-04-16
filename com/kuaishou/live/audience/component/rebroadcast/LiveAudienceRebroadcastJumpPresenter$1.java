package com.kuaishou.live.audience.component.rebroadcast.LiveAudienceRebroadcastJumpPresenter$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.audience.component.rebroadcast.LiveAudienceRebroadcastJumpPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class LiveAudienceRebroadcastJumpPresenter$1 implements LifecycleEventObserver	// class@000bd7
{
    public final LiveAudienceRebroadcastJumpPresenter b;

    public void LiveAudienceRebroadcastJumpPresenter$1(LiveAudienceRebroadcastJumpPresenter p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceRebroadcastJumpPresenter$1.class, "1")) {
          return;
       }
       if (p1 == Lifecycle$Event.ON_STOP) {
          LiveAudienceRebroadcastJumpPresenter$1 tb = this.b;
          if (tb.K != null) {
             Activity activity = tb.getActivity();
             if (activity != null && !activity.isFinishing()) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
             }
          }
       }
       return;
    }
}
