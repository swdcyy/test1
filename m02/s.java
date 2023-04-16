package m02.s;
import erd.g;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import v02.a;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class s implements g	// class@0030e0
{
    public final LivePlayFragment b;

    public void s(LivePlayFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a != null) {
          tb.getActivity().finish();
       }
       return;
    }
}
