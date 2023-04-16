package com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment$lifecycleEventObserver$1$a;
import com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment$b;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.kds.krn.api.page.KwaiRnFragment;

public final class LiveKrnCenterDialogFragment$lifecycleEventObserver$1$a implements LiveKrnCenterDialogFragment$b	// class@001d50
{
    public final LiveKrnFragment a;

    public void LiveKrnCenterDialogFragment$lifecycleEventObserver$1$a(LiveKrnFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveKrnCenterDialogFragment$lifecycleEventObserver$1$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.onBackPressed();
    }
}
