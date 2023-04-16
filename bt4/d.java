package bt4.d;
import erd.g;
import com.kuaishou.recruit.krn.RecruitTabKrnFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import rkd.b;
import tkd.b;
import tkd.d;
import ayb.g;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class d implements g	// class@0003ce
{
    public final RecruitTabKrnFragment b;

    public void d(RecruitTabKrnFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(RecruitTabKrnFragment.class) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, RecruitTabKrnFragment.class, "12") && (b.g() && (d.a(-908290672).sK() && tb.getActivity() != null)))) {
          if (b) {
             tb.getActivity().setRequestedOrientation(1);
          }else {
             tb.getActivity().setRequestedOrientation(tb.t);
          }
       }
       return;
    }
}
