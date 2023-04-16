package com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$c;
import mq5.h;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;

public final class LiveAudienceMultiLinePresenterV2$c implements h	// class@000bb0
{
    public final LiveAudienceMultiLinePresenterV2 b;

    public void LiveAudienceMultiLinePresenterV2$c(LiveAudienceMultiLinePresenterV2 p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiLinePresenterV2$c.class, "1")) {
          return;
       }
       LiveAudienceMultiLinePresenterV2$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveAudienceMultiLinePresenterV2.class, "14")) {
          b.Z(LiveLogTag.LIVE_MULTI_LINE, "stopLivePlayInternal");
          LiveAudienceMultiLinePresenterV2 e1 = tb.e1;
          if (e1 == null) {
             a.S("liveAudienceMultiLineEntryController");
          }
          tb.o1(e1);
       }
       return;
    }
}
