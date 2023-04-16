package c47.y;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryResultDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse$Prize;
import c47.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import lnc.a1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import d61.y;
import oq5.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse$ExtraData;
import com.kwai.live.gzone.commandlottery.g;
import com.kwai.live.gzone.commandlottery.j;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.google.gson.JsonObject;
import uo7.l;
import com.kwai.live.gzone.commandlottery.h;
import uo7.d;
import com.kwai.sharelib.a;
import uo7.k;
import com.kwai.live.gzone.commandlottery.i;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.live.gzone.commandlottery.j$a;
import uo7.u;
import com.yxcorp.gifshow.share.operation.b;
import uo7.f0;

public final class y implements View$OnClickListener	// class@0004e4
{
    public final LiveGzoneAudienceCommandLotteryResultDialog b;

    public void y(LiveGzoneAudienceCommandLotteryResultDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String str1;
       KsShareBuilder ksShareBuild;
       a uoa;
       y b = this.b;
       Objects.requireNonNull(b);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, LiveGzoneAudienceCommandLotteryResultDialog.class, "7")) {
       }else {
          a.a(b.A.a(), b.y, "invite");
          if (!a1.i(b.getActivity()) || (b.getActivity() instanceof GifshowActivity && b.z != null)) {
             if (!PatchProxy.applyVoid(objArray, b, LiveGzoneAudienceCommandLotteryResultDialog.class, "8") && (b.D != null && y.d(b.getActivity()))) {
                b.D.d();
             }
          label_0059 :
             GifshowActivity activity = b.getActivity();
             String liveStreamId = b.A.getLiveStreamId();
             LiveGzoneAudienceCommandLotteryResultDialog b1 = b.B;
             LiveStreamFeedWrapper liveStreamFe = (b1 != null)? b1.mEntity: objArray;
             LiveGzoneAudienceCommandLotteryResultResponse$ExtraData mShareParams = b.z.mShareParams;
             g og = new g(b);
             String str = "1";
             if (PatchProxy.isSupport2(j.class, str)) {
                Object[] objArray1 = new Object[]{activity,liveStreamId,liveStreamFe,mShareParams,og};
                if (!PatchProxy.applyVoid(objArray1, objArray, j.class, str)) {
                }
             }else {
             }
          }
       }
    label_00ea :
       return;
    }
}
