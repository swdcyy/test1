package gv1.d;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import gv1.g;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;

public final class d extends ViewControllerAdapter$a	// class@00258d
{

    public void d(ViewGroup p0,LifecycleOwner p1,Activity p2){
       a.p(p0, "itemView");
       a.p(p1, "parentLifecycleOwner");
       a.p(p2, "activity");
       super(p0, p1, p2);
       this.E2(p0, new g(this.b()));
    }
}
