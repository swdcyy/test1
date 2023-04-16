package com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$lifecycleEventObserver$1$a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$b;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import d22.d;

public final class LiveKrnBottomDialogFragment$lifecycleEventObserver$1$a implements LiveDialogContainerFragment$b	// class@001d49
{
    public final LiveKrnFragment a;

    public void LiveKrnBottomDialogFragment$lifecycleEventObserver$1$a(LiveKrnFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveKrnBottomDialogFragment$lifecycleEventObserver$1$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.onBackPressed();
    }
    public boolean b(){
       return d.a(this);
    }
}
