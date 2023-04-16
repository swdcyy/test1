package dac.x;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.h;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.feature.api.qrcode.model.ScanParam$a;
import n3d.a;
import lu5.c;

public final class x implements View$OnClickListener	// class@002150
{
    public final ExploreFriendTabHostFragment b;

    public void x(ExploreFriendTabHostFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, ExploreFriendTabHostFragment.class, "12")) {
       }else {
          h.m("", "QRCODE_BUTTON").h();
          ScanParam$a uoa = new ScanParam$a();
          uoa.b("FIND_FRIENDS");
          c.c(tb.getActivity(), uoa, null);
       }
       return;
    }
}
