package bsa.c;
import android.view.View$OnClickListener;
import bsa.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements View$OnClickListener	// class@00045c
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
       if (!p0.hasTransientState()) {
          this.b.W8(true);
       }
       return;
    }
}
