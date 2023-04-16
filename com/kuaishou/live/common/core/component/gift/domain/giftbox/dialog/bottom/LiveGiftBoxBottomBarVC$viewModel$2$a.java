package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxBottomBarVC$viewModel$2$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ui1.n;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class LiveGiftBoxBottomBarVC$viewModel$2$a implements ViewModelProvider$Factory	// class@0011fb
{
    public final a a;

    public void LiveGiftBoxBottomBarVC$viewModel$2$a(a p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftBoxBottomBarVC$viewModel$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       if (!a.g(p0, n.class)) {
          throw new IllegalArgumentException("unsupported ViewModel class "+p0);
       }
       p0 = this.a.invoke();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type T");
       return p0;
    }
}
