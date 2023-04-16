package fa2.n;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class n implements ViewTreeObserver$OnGlobalLayoutListener	// class@00290c
{
    public final int b;
    public final LiveHourlyRankStrengthNoticeNarrowItemView c;

    public void n(LiveHourlyRankStrengthNoticeNarrowItemView p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.c.e(this.b);
       this.c.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
