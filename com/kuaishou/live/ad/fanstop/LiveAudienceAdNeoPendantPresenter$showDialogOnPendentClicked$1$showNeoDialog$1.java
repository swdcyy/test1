package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$showDialogOnPendentClicked$1$showNeoDialog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import pl0.l0;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.framework.model.feed.BaseFeed;
import tl0.c;
import com.kwai.library.widget.popup.common.c;

public final class LiveAudienceAdNeoPendantPresenter$showDialogOnPendentClicked$1$showNeoDialog$1 extends Lambda implements a	// class@00097f
{
    public final l0 this$0;

    public void LiveAudienceAdNeoPendantPresenter$showDialogOnPendentClicked$1$showNeoDialog$1(l0 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceAdNeoPendantPresenter$showDialogOnPendentClicked$1$showNeoDialog$1.class, "1")) {
          return;
       }
       l0 c = this.this$0.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(objArray, c, LiveAudienceAdNeoPendantPresenter.class, "8")) {
          LiveAudienceAdNeoPendantPresenter u = c.u;
          if (u == null) {
             a.S("mLiveAudienceParam");
          }
          c.e(u.mPhoto);
          LiveAudienceAdNeoPendantPresenter c1 = c.C;
          if (c1 != null) {
             c1.o();
          }
       }
       return;
    }
}
