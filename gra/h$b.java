package gra.h$b;
import android.view.View$OnClickListener;
import gra.h;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class h$b implements View$OnClickListener	// class@002bb1
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
          return;
       }
       this.b.j6();
       return;
    }
}
