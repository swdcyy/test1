package com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController$onCreate$$inlined$apply$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import gv1.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import java.util.List;
import ev1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class TempPlayPendantFlipperViewController$onCreate$$inlined$apply$lambda$1 extends Lambda implements a	// class@0016d7
{
    public final TempPlayPendantFlipperViewController this$0;

    public void TempPlayPendantFlipperViewController$onCreate$$inlined$apply$lambda$1(TempPlayPendantFlipperViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, TempPlayPendantFlipperViewController$onCreate$$inlined$apply$lambda$1.class, "1")) {
          return;
       }
       TempPlayPendantFlipperViewController j = this.this$0.j;
       Objects.requireNonNull(j);
       if (!PatchProxy.applyVoid(objArray, j, h.class, "2") && j.a != null) {
          a.a(j.c.a(), j.b.size());
          b.c0(LiveLogTag.LIVE_TOP_PENDANT, "LiveTempPlayPendantController TempPlayPendantViewFlipperLogger logPendantClick", "pendant_num", Integer.valueOf(j.b.size()));
       }
       PatchProxy.onMethodExit(TempPlayPendantFlipperViewController$onCreate$$inlined$apply$lambda$1.class, "1");
       return;
    }
}
