package h92.g;
import android.view.View$OnClickListener;
import h92.s;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.HashSet;
import h92.c;

public final class g implements View$OnClickListener	// class@002d0a
{
    public final s b;

    public void g(s p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, s.class, "17")) {
       }else {
          Iterator iterator = tb.W.iterator();
          while (iterator.hasNext()) {
             iterator.next().d();
          }
       }
       return;
    }
}
