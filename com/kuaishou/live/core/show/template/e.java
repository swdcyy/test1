package com.kuaishou.live.core.show.template.e;
import java.lang.Runnable;
import com.kuaishou.live.core.show.template.f;
import com.kuaishou.livestream.message.nano.SCLiveActivityPopup;
import java.lang.Object;
import java.util.Objects;
import rp5.a;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo;
import com.kuaishou.live.core.show.template.LiveActivityPopupDialog;
import hl2.e;
import hl2.h;
import android.view.View$OnClickListener;
import java.lang.Class;
import lp3.c;
import lp3.e;
import androidx.fragment.app.c;
import java.lang.String;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import hl2.f;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;

public final class e implements Runnable	// class@001182
{
    public final f b;
    public final SCLiveActivityPopup c;

    public void e(f p0,SCLiveActivityPopup p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       if (tc == null) {
       }else {
          LiveActivityPopupDialog liveActivity = e.a(tc.displayPict, tc.animationPicInfo);
          tb.u = liveActivity;
          liveActivity.wh(new h(tb, tc));
          if (tb.q.a(uoa).isAdded()) {
             tb.u.Cb(tb.q.a(uoa).getChildFragmentManager(), "mLiveDragonBoatFestivalPopupDialog");
          }
          b.Z(LiveLogTag.LIVE_ACTIVITY_TEMPLATE_IM_POPUP, "show bigImage dialog success");
          tb.u.k0(new f(tb));
       }
       return;
    }
}
