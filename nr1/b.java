package nr1.b;
import com.kuaishou.live.viewcontroller.ViewController;
import j83.b;
import msd.p;
import sq1.a;
import sz1.e;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nr1.a;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import qrd.l1;

public final class b extends ViewController	// class@0033af
{
    public LiveMultiLineWidgetUserTagDataBinding j;
    public final b k;
    public final p l;
    public final a m;
    public final e n;
    public final i o;

    public void b(b p0,p p1,a p2,e p3,i p4){
       a.p(p0, "widgetModel");
       a.p(p1, "updatePositionCallback");
       a.p(p2, "roomDelegate");
       a.p(p3, "liveMultiInteractManager");
       a.p(p4, "liveLogPackageProvider");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a33);
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       new a(this, this.l).a(view, this.k);
       LiveMultiLineWidgetUserTagDataBinding liveMultiLin = new LiveMultiLineWidgetUserTagDataBinding(this, this.m, this.n, this.o);
       View view1 = this.P2().findViewById(R.id.live_multi_line_user_tag);
       a.o(view1, "requireContentView\(\).fin¡­live_multi_line_user_tag\)");
       liveMultiLin.a(this.k, view1);
       this.j = liveMultiLin;
       return;
    }
}
