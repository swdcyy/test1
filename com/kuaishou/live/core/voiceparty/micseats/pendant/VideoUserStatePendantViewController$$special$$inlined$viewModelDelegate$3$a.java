package com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$$special$$inlined$viewModelDelegate$3$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import it2.h1;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class VideoUserStatePendantViewController$$special$$inlined$viewModelDelegate$3$a implements ViewModelProvider$Factory	// class@001763
{
    public final a a;

    public void VideoUserStatePendantViewController$$special$$inlined$viewModelDelegate$3$a(a p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoUserStatePendantViewController$$special$$inlined$viewModelDelegate$3$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       if (!a.g(p0, h1.class)) {
          throw new IllegalArgumentException("unsupported ViewModel class "+p0);
       }
       p0 = this.a.invoke();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type T");
       return p0;
    }
}
