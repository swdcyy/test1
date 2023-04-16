package g22.g;
import mq5.h;
import com.kuaishou.live.core.show.activitydialog.d;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.DialogFragment;
import z12.x;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public final class g implements h	// class@002a49
{
    public final d b;

    public void g(d p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, d.class, "4")) {
       }else if(x.s(tb.t)){
          b.P(LiveLogTag.LIVE_ACTIVITY_DIALOG.appendTag("LiveActivityDialogPresenter"), "handleLiveStop, isDialogShowing");
          tb.t.dismissAllowingStateLoss();
       }
       return;
    }
}
