package dac.b0;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment;
import java.util.List;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.util.Iterator;
import android.view.View;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.widget.HorizontalScrollView;
import androidx.viewpager.widget.ViewPager;
import ekd.i;
import zf6.l;

public final class b0 implements Runnable	// class@002135
{
    public final ExploreFriendTabHostFragment b;
    public final List c;
    public final int d;

    public void b0(ExploreFriendTabHostFragment p0,List p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       b0 tb = this.b;
       b0 tc = this.c;
       b0 td = this.d;
       if (tb.getActivity() != null && !tb.getActivity().isFinishing()) {
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             iterator.next().getView().setBackgroundColor(td);
          }
          tb.B.setBackgroundColor(td);
          tb.t.setBackgroundColor(td);
          if (!tb.u.getCurrentItem()) {
             i.a(tb.getActivity(), td, false);
          }else {
             i.a(tb.getActivity(), td, l.r());
          }
       }
       return;
    }
}
