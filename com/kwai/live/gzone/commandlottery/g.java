package com.kwai.live.gzone.commandlottery.g;
import com.kwai.live.gzone.commandlottery.j$a;
import com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryResultDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public class g implements j$a	// class@000c98
{
    public final LiveGzoneAudienceCommandLotteryResultDialog a;

    public void g(LiveGzoneAudienceCommandLotteryResultDialog p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.a.dismissAllowingStateLoss();
       return;
    }
}
