package fl0.b$c;
import android.view.View$OnClickListener;
import fl0.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$c implements View$OnClickListener	// class@002371
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       this.b.R8();
       return;
    }
}
