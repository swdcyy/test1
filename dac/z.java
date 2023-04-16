package dac.z;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import k2b.f3;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.content.Context;
import android.widget.HorizontalScrollView;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;

public final class z implements Runnable	// class@002152
{
    public final ExploreFriendTabHostFragment b;

    public void z(ExploreFriendTabHostFragment p0){
       this.b = p0;
    }
    public final void run(){
       z tb = this.b;
       Objects.requireNonNull(tb);
       f3.l("", "QRCODE_BUTTON").g();
       if (tb.t.getWidth() > (n.z(tb.t.getContext()) - a1.e(102.00f))) {
          RelativeLayout$LayoutParams layoutParams = tb.t.getLayoutParams();
          layoutParams.addRule(16, R.id.right_btn);
          layoutParams.addRule(17, R.id.left_btn);
          tb.t.setLayoutParams(layoutParams);
       }
       return;
    }
}
