package com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$viewModel$2$1;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$viewModel$2$a;

public final class LiveChatLabelEditVC$viewModel$2 extends Lambda implements a	// class@0014d1
{
    public final LiveChatLabelEditVC this$0;

    public void LiveChatLabelEditVC$viewModel$2(LiveChatLabelEditVC p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveChatLabelEditVC$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveChatLabelEditVC$viewModel$2$a(new LiveChatLabelEditVC$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}