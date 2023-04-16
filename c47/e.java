package c47.e;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryNoticeDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import c47.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import lnc.a1;
import e47.a;
import e47.a$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import vq5.d;
import androidx.fragment.app.KwaiDialogFragment;

public final class e implements View$OnClickListener	// class@0004d0
{
    public final LiveGzoneAudienceCommandLotteryNoticeDialog b;

    public void e(LiveGzoneAudienceCommandLotteryNoticeDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveGzoneAudienceCommandLotteryNoticeDialog.class, "7")) {
       }else {
          a.b(tb.v.a(), "more");
          if (a1.i(tb.getActivity()) && !TextUtils.x(tb.u.d.mLink)) {
             tb.x.r4(tb.u.d.mLink, tb.getActivity());
             tb.dismissAllowingStateLoss();
          }
       }
       return;
    }
}
