package com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaViewController$onCreate$viewModel$2$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import mn1.d;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class LiveHotSpotDetailNormalMediaAreaViewController$onCreate$viewModel$2$a implements ViewModelProvider$Factory	// class@0013dc
{
    public final a a;

    public void LiveHotSpotDetailNormalMediaAreaViewController$onCreate$viewModel$2$a(a p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveHotSpotDetailNormalMediaAreaViewController$onCreate$viewModel$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       if (!a.g(p0, d.class)) {
          throw new IllegalArgumentException("unsupported ViewModel class "+p0);
       }
       p0 = this.a.invoke();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type T");
       return p0;
    }
}