package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineController$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineController;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ir1.c;
import nq1.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class LiveAudienceMultiLineArenaLineController$a implements ViewModelProvider$Factory	// class@001501
{
    public final LiveAudienceMultiLineArenaLineController a;

    public void LiveAudienceMultiLineArenaLineController$a(LiveAudienceMultiLineArenaLineController p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLineArenaLineController$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "aClass");
       if (a.g(p0, c.class)) {
          return new c(this.a.o);
       }
       throw new IllegalArgumentException("unsupported ViewModel class "+p0);
    }
}
