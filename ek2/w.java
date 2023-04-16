package ek2.w;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoRecommendDialog;
import java.lang.Object;
import android.view.View;
import android.app.Dialog;

public final class w implements View$OnClickListener	// class@00275f
{
    public final LiveAudienceStayInfoRecommendDialog b;

    public void w(LiveAudienceStayInfoRecommendDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       w tb = this.b;
       LiveAudienceStayInfoRecommendDialog g = tb.g;
       if (g != null) {
          g.onClick(p0);
       }
       tb.dismiss();
       return;
    }
}
