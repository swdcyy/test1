package g51.a;
import java.lang.Runnable;
import g51.b;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import k2b.j0;

public final class a implements Runnable	// class@002421
{
    public final b b;
    public final int c;

    public void a(b p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       Fragment uFragment = tb.h(this.c);
       if (uFragment instanceof e0 && !PatchProxy.applyVoidOneRefs(uFragment, tb, b.class, "12")) {
          FragmentActivity activity = uFragment.getActivity();
          if (activity instanceof j0) {
             activity.S2(uFragment);
             activity.b2(1);
          }
       }
       return;
    }
}
