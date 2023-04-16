package dac.y;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import k2b.e0;
import hcc.g;
import android.widget.RelativeLayout;

public final class y implements View$OnClickListener	// class@002151
{
    public final ExploreFriendTabHostFragment b;
    public final String c;

    public void y(ExploreFriendTabHostFragment p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       y tb = this.b;
       y tc = this.c;
       if (!tc.equals(tb.xh(tb.ph()))) {
          g.b(tb, tb.Qh(tc), 1);
       }else {
          tb.B.performClick();
       }
       return;
    }
}
