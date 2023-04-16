package j02.e;
import androidx.lifecycle.Observer;
import j02.k;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j02.l;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;

public final class e implements Observer	// class@002a1a
{
    public final k b;

    public void e(k p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       k e;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          b.P(l.a, "bindViewModelIsLandscape - isLandscape: "+p0+' ');
          e = this.b.e;
          a.o(p0, "it");
          int i = (p0.booleanValue())? 8: 0;
          e.setVisibility(i);
       }
       return;
    }
}
