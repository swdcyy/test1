package c47.d;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryNoticeDialog;
import java.lang.Object;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import java.lang.String;
import c47.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e47.a;
import e47.a$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ft5.b;
import androidx.fragment.app.KwaiDialogFragment;

public final class d implements View$OnClickListener	// class@0004cf
{
    public final LiveGzoneAudienceCommandLotteryNoticeDialog b;

    public void d(LiveGzoneAudienceCommandLotteryNoticeDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       a.b(tb.v.a(), "send");
       if (PatchProxy.applyVoid(null, tb, LiveGzoneAudienceCommandLotteryNoticeDialog.class, "6")) {
       }else if(!TextUtils.x(tb.u.d.mTitle)){
          LiveGzoneAudienceCommandLotteryNoticeDialog w = tb.w;
          if (w != null) {
             w.U2(tb.u.d.mTitle);
          }
       }
       tb.dismissAllowingStateLoss();
       return;
    }
}
