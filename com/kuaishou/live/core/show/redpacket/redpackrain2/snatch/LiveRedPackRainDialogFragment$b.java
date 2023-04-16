package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class LiveRedPackRainDialogFragment$b extends m	// class@000f18
{
    public final LiveRedPackRainDialogFragment c;

    public void LiveRedPackRainDialogFragment$b(LiveRedPackRainDialogFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPackRainDialogFragment$b.class, "1")) {
          return;
       }
       this.c.xh();
       this.c.dismissAllowingStateLoss();
       return;
    }
}
