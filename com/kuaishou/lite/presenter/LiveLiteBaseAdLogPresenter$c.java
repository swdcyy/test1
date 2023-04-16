package com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter$c;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import il0.b;
import java.lang.Enum;

public final class LiveLiteBaseAdLogPresenter$c implements LivePlayerStateChangeListener	// class@00093d
{
    public final LiveLiteBaseAdLogPresenter b;

    public void LiveLiteBaseAdLogPresenter$c(LiveLiteBaseAdLogPresenter p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseAdLogPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "it");
       int i = b.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2 || (i == 3 || i == 4)) {
             LiveLiteBaseAdLogPresenter.B9(this.b, true, false, 2, null);
          }
       }else {
          this.b.x9();
       }
       return;
    }
}
