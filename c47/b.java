package c47.b;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryNoticeDialog;
import java.lang.Object;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import java.lang.String;
import c47.a;
import androidx.fragment.app.KwaiDialogFragment;

public final class b implements View$OnClickListener	// class@0004cd
{
    public final LiveGzoneAudienceCommandLotteryNoticeDialog b;

    public void b(LiveGzoneAudienceCommandLotteryNoticeDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       a.b(tb.v.a(), "close");
       tb.dismissAllowingStateLoss();
    }
}
