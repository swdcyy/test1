package d73.g;
import erd.g;
import sa3.b;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.layoutmanager.StageType;
import android.graphics.Rect;
import d73.b;
import java.lang.Enum;

public final class g implements g	// class@002488
{
    public final b b;

    public void g(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          p0 = p0.component2();
          int i = b.a[p0.component1().ordinal()];
          int i1 = 2;
          if (i != 1) {
             if (i != i1) {
                i1 = (i != 3)? 0: 4;
             }
          }else {
             i1 = 1;
          }
          this.b.Oa(i1, p0);
       }
       return;
    }
}
