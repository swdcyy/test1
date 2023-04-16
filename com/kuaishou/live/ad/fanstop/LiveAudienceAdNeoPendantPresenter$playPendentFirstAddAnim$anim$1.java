package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$playPendentFirstAddAnim$anim$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import yx.j0;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class LiveAudienceAdNeoPendantPresenter$playPendentFirstAddAnim$anim$1 extends Lambda implements a	// class@00097d
{
    public final LiveAudienceAdNeoPendantPresenter this$0;

    public void LiveAudienceAdNeoPendantPresenter$playPendentFirstAddAnim$anim$1(LiveAudienceAdNeoPendantPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceAdNeoPendantPresenter$playPendentFirstAddAnim$anim$1.class, "1")) {
          return;
       }
       LiveAudienceAdNeoPendantPresenter$playPendentFirstAddAnim$anim$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, LiveAudienceAdNeoPendantPresenter.class, "12")) {
          if (tthis$0.W8()) {
             objArray = new Object[0];
             j0.f("LiveAudienceAdNeoPendantPresenter", "start count down", objArray);
             tthis$0.X7(tthis$0.X8().b(tthis$0.R8(), new LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1(tthis$0)));
          }else {
             tthis$0.e9();
          }
       }
       return;
    }
}
