package c47.v;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryResultDialog;
import java.lang.Object;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse$Prize;
import c47.a;
import androidx.fragment.app.KwaiDialogFragment;

public final class v implements View$OnClickListener	// class@0004e1
{
    public final LiveGzoneAudienceCommandLotteryResultDialog b;

    public void v(LiveGzoneAudienceCommandLotteryResultDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       v tb = this.b;
       a.c(tb.A.a(), tb.y);
       tb.dismissAllowingStateLoss();
    }
}
