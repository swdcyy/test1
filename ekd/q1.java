package ekd.q1;
import androidx.lifecycle.ViewModel;
import java.util.HashSet;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.lang.Class;
import android.view.Window;
import android.app.Activity;
import java.lang.Object;
import java.util.Set;
import java.lang.String;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class q1 extends ViewModel	// class@000d70
{
    public final Set a;
    public Window b;
    public static boolean c;

    public void q1(){
       super();
       this.a = new HashSet();
    }
    public static q1 r0(FragmentActivity p0){
       q1 oq1 = ViewModelProviders.of(p0).get(q1.class);
       q1 b = oq1.b;
       if (b != null && !b.equals(p0.getWindow())) {
          oq1.a.clear();
       }
       oq1.b = p0.getWindow();
       return oq1;
    }
    public void o0(String p0){
       if (q.f(this.a)) {
          this.p0(true, 128);
       }
       this.a.add(p0);
       Log.g("WindowFlagManager", "addKeepScreenOnFlag by "+p0+", size:"+this.a.size());
       return;
    }
    public void onCleared(){
       super.onCleared();
       this.a.clear();
    }
    public final void p0(boolean p0,int p1){
       q1.c = true;
       if (p0) {
          this.b.addFlags(p1);
       }else {
          this.b.clearFlags(p1);
       }
       q1.c = false;
       return;
    }
    public void q0(String p0){
       this.a.remove(p0);
       if (q.f(this.a)) {
          this.p0(false, 128);
       }
       Log.g("WindowFlagManager", "clearKeepScreenOnFlag by "+p0+", size:"+this.a.size());
       return;
    }
}
