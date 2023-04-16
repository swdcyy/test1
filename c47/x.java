package c47.x;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryResultDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import lnc.a1;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse$Prize;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse$ExtraData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import c47.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import vq5.d;
import androidx.fragment.app.KwaiDialogFragment;

public final class x implements View$OnClickListener	// class@0004e3
{
    public final LiveGzoneAudienceCommandLotteryResultDialog b;

    public void x(LiveGzoneAudienceCommandLotteryResultDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String str;
       x tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, LiveGzoneAudienceCommandLotteryResultDialog.class, "9")) {
       }else if(a1.i(tb.getActivity())){
          LiveGzoneAudienceCommandLotteryResultDialog y = tb.y;
          if (y != null) {
             LiveGzoneAudienceCommandLotteryResultResponse$Prize mPrizeType = y.mPrizeType;
             if (mPrizeType != 2 && mPrizeType != 4) {
                y = tb.z;
                if (y != null) {
                   objArray = y.mActivityUrl;
                }
                str = "more";
             }else {
                objArray = y.mExchangeUrl;
                str = "view";
             }
             a.a(tb.A.a(), tb.y, str);
             if (!TextUtils.x(objArray)) {
                tb.C.r4(objArray, tb.getActivity());
                tb.dismissAllowingStateLoss();
             }
          }
       }
       return;
    }
}
