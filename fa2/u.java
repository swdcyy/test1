package fa2.u;
import android.view.ViewOutlineProvider;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;

public class u extends ViewOutlineProvider	// class@002913
{
    public final LiveHourlyRankStrengthNoticeView a;

    public void u(LiveHourlyRankStrengthNoticeView p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, u.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)a1.d(R.dimen.arg_RES_7f07025d));
       return;
    }
}
