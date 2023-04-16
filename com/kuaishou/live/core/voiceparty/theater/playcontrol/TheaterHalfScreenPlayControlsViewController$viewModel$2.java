package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$viewModel$2$1;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$viewModel$2$a;

public final class TheaterHalfScreenPlayControlsViewController$viewModel$2 extends Lambda implements a	// class@0019a1
{
    public final TheaterHalfScreenPlayControlsViewController this$0;

    public void TheaterHalfScreenPlayControlsViewController$viewModel$2(TheaterHalfScreenPlayControlsViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, TheaterHalfScreenPlayControlsViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TheaterHalfScreenPlayControlsViewController$viewModel$2$a(new TheaterHalfScreenPlayControlsViewController$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
