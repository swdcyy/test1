package com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC$gameAnimViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC$gameAnimViewModel$2$1;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC$gameAnimViewModel$2$a;

public final class LiveMultiPkGameAnimVC$gameAnimViewModel$2 extends Lambda implements a	// class@0015f2
{
    public final LiveMultiPkGameAnimVC this$0;

    public void LiveMultiPkGameAnimVC$gameAnimViewModel$2(LiveMultiPkGameAnimVC p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkGameAnimVC$gameAnimViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMultiPkGameAnimVC$gameAnimViewModel$2$a(new LiveMultiPkGameAnimVC$gameAnimViewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
