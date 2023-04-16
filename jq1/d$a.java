package jq1.d$a;
import hr1.a;
import jq1.d;
import java.lang.Object;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.util.Objects;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

public final class d$a implements a	// class@002bf7
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void E2(ViewGroup p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "2")) {
          return;
       }
       a.p(p0, "viewGroup");
       a.p(p1, "viewController");
       this.a.y2(p0, p1);
       return;
    }
    public ViewGroup a(){
       View obj = PatchProxy.apply(null, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.P2();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
       return obj;
    }
    public Context getContext(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.D2();
    }
    public LifecycleOwner j(){
       return this.a;
    }
    public void o1(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "3")) {
          return;
       }
       a.p(p0, "viewController");
       this.a.O2(p0);
       return;
    }
}
