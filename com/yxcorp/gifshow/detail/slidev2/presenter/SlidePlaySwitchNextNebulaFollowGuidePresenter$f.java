package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$f;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s4a.g;

public final class SlidePlaySwitchNextNebulaFollowGuidePresenter$f implements g	// class@0018e2
{
    public final SlidePlaySwitchNextNebulaFollowGuidePresenter b;

    public void SlidePlaySwitchNextNebulaFollowGuidePresenter$f(SlidePlaySwitchNextNebulaFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlaySwitchNextNebulaFollowGuidePresenter$f.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             SlidePlaySwitchNextNebulaFollowGuidePresenter b = this.b.B;
             if (b != null) {
                b.b0();
             }
          }
          this.b.D = p0.booleanValue();
       }
       return;
    }
}
