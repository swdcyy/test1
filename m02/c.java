package m02.c;
import r12.e$a;
import com.kuaishou.live.core.basic.activity.c;
import java.lang.Runnable;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$b;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;

public final class c implements e$a	// class@0030b0
{
    public final c a;
    public final long b;
    public final Runnable c;
    public final Runnable d;

    public void c(c p0,long p1,Runnable p2,Runnable p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(View p0,int p1,ViewGroup p2){
       c ta = this.a;
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       Fragment uFragment = ta.a.b();
       if (uFragment.getActivity() == null || (uFragment.getActivity().isFinishing() || (!uFragment.getActivity().isDestroyed() && !uFragment.isDetached()))) {
          ta.b();
          ta.a(tb, tc);
          td.run();
       }
    label_0038 :
       return;
    }
}
