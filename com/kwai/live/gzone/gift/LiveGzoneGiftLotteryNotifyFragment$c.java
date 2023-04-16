package com.kwai.live.gzone.gift.LiveGzoneGiftLotteryNotifyFragment$c;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.gift.LiveGzoneGiftLotteryNotifyFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public final class LiveGzoneGiftLotteryNotifyFragment$c implements View$OnClickListener	// class@000d05
{
    public final LiveGzoneGiftLotteryNotifyFragment b;

    public void LiveGzoneGiftLotteryNotifyFragment$c(LiveGzoneGiftLotteryNotifyFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneGiftLotteryNotifyFragment$c.class, "1")) {
          return;
       }
       this.b.G.dismiss();
       return;
    }
}
