package gv1.g;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import android.view.View;
import gv1.g$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class g extends ViewController	// class@002592
{
    public final LiveData j;

    public void g(LiveData p0){
       a.p(p0, "pendantItem");
       super();
       this.j = p0;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       FrameLayout uFrameLayout = new FrameLayout(this.D2());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-2, -1));
       uFrameLayout.setClipChildren(false);
       this.R2(uFrameLayout);
       this.j.observe(this, new g$a(this));
       return;
    }
}
