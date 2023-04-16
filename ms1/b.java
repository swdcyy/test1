package ms1.b;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView;
import androidx.lifecycle.LifecycleOwner;
import ms1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import er1.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import ms1.b$a;
import androidx.lifecycle.Observer;
import ms1.b$b;
import ms1.b$c;
import ms1.b$d;
import ms1.b$e;

public final class b	// class@003207
{

    public static final void a(LiveMultiLineIconTextView p0,LifecycleOwner p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "1")) {
          return;
       }
       a.p(p0, "$this$bindViewModel");
       a.p(p1, "lifecycle");
       a.p(p2, "vm");
       LiveData liveData = Transformations.distinctUntilChanged(p2.M());
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observe(p1, new b$a(p0));
       liveData = Transformations.distinctUntilChanged(p2.getText());
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observe(p1, new b$b(p0));
       liveData = Transformations.distinctUntilChanged(p2.getIcon());
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observe(p1, new b$c(p0));
       liveData = Transformations.distinctUntilChanged(p2.K());
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observe(p1, new b$d(p0));
       LiveData liveData1 = Transformations.distinctUntilChanged(p2.f());
       a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
       liveData1.observe(p1, new b$e(p0));
       return;
    }
}
