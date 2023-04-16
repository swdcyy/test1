package kk0.b;
import android.view.View$OnClickListener;
import com.kuaishou.krn.title.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ik0.g;

public class b implements View$OnClickListener	// class@002d5a
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.b.g.D2(true);
       return;
    }
}
