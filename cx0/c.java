package cx0.c;
import android.view.View$OnClickListener;
import cx0.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements View$OnClickListener	// class@001e90
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.b.v();
       return;
    }
}
