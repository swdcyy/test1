package ne2.b;
import androidx.fragment.app.c;
import java.lang.String;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import sf2.o;
import wj2.o0;
import tx1.d;
import wj2.n0;
import bb1.a;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.show.profilecard.statistics.LiveAnchorStatisticInfo;
import ne2.k;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public interface abstract b	// class@003913
{

    void B4(boolean p0);
    void Cb(c p0,String p1);
    void E5(boolean p0);
    void O4(LiveProfileMode p0);
    void Q7(o p0);
    void R8(o0 p0);
    void U9(d p0);
    void V2(n0 p0);
    void b5(a p0);
    void b9(LiveProfileParams p0);
    void dismissAllowingStateLoss();
    c getChildFragmentManager();
    boolean isAdded();
    void k0(DialogInterface$OnDismissListener p0);
    void l9(LiveAnchorStatisticInfo p0);
    void of(boolean p0);
    void pe(k p0);
    void v6(LivePlayLogger p0);
}
