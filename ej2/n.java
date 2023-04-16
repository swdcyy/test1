package ej2.n;
import java.lang.Runnable;
import ej2.o;
import com.kuaishou.livestream.message.nano.LiveActivityPopup;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo;
import com.kuaishou.live.core.show.template.LiveActivityPopupDialog;
import hl2.e;
import ej2.q;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import androidx.fragment.app.Fragment;
import ej2.l;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import java.lang.String;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;

public final class n implements Runnable	// class@002734
{
    public final o b;
    public final LiveActivityPopup c;

    public void n(o p0,LiveActivityPopup p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       n tb = this.b;
       n tc = this.c;
       Objects.requireNonNull(tb);
       if (tc == null) {
       }else {
          LiveActivityPopupDialog liveActivity = e.a(tc.displayPict, tc.animationPicInfo);
          tb.s = liveActivity;
          liveActivity.wh(new q(tb, tc));
          if (tb.r.R().t0().isAdded()) {
             tb.s.k0(new l(tb));
             tb.s.Cb(tb.r.R().t0().getFragmentManager(), "liveScoreRankPopupDialog");
          }
       }
       return;
    }
}
