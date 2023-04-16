package ek2.u;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoRecommendDialog;
import java.lang.Object;
import android.view.View;
import android.app.Dialog;

public final class u implements View$OnClickListener	// class@00275d
{
    public final LiveAudienceStayInfoRecommendDialog b;

    public void u(LiveAudienceStayInfoRecommendDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.dismiss();
    }
}
