package ek2.v;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoRecommendDialog;
import java.lang.Object;
import android.view.View;
import android.app.Dialog;

public final class v implements View$OnClickListener	// class@00275e
{
    public final LiveAudienceStayInfoRecommendDialog b;

    public void v(LiveAudienceStayInfoRecommendDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       v tb = this.b;
       LiveAudienceStayInfoRecommendDialog h = tb.h;
       if (h != null) {
          h.onClick(p0);
       }
       tb.dismiss();
       return;
    }
}
