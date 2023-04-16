package d5c.y;
import android.view.View$OnClickListener;
import d5c.g0;
import java.lang.Object;
import android.view.View;
import s1c.a1;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;

public final class y implements View$OnClickListener	// class@00211a
{
    public final g0 b;

    public void y(g0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g0 s = this.b.s;
       if (s instanceof a1) {
          s.w5(ProfileRefreshStatus.PROFILE);
       }
       return;
    }
}
