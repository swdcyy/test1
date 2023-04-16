package c35.m;
import android.widget.RadioGroup$OnCheckedChangeListener;
import com.kuaishou.viewbinder.IViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.RadioGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View;
import androidx.lifecycle.ViewModel;

public final class m implements RadioGroup$OnCheckedChangeListener	// class@000416
{
    public final IViewBinder b;
    public final RadioGroup$OnCheckedChangeListener c;

    public void m(IViewBinder p0,RadioGroup$OnCheckedChangeListener p1){
       a.p(p1, "listener");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void onCheckedChanged(RadioGroup p0,int p1){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, m.class, "1")) {
          return;
       }
       m tb = this.b;
       if (tb != null && tb.onInterceptUserEvent(p0, null, false) == true) {
          return;
       }
       this.c.onCheckedChanged(p0, p1);
       return;
    }
}
