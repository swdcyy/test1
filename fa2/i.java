package fa2.i;
import android.view.ViewOutlineProvider;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;

public class i extends ViewOutlineProvider	// class@002907
{
    public final LiveHourlyRankStrengthNoticeExpandView a;

    public void i(LiveHourlyRankStrengthNoticeExpandView p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)a1.d(R.dimen.arg_RES_7f070334));
       return;
    }
}
