package bc9.b$a;
import android.view.View$OnClickListener;
import bc9.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$a implements View$OnClickListener	// class@0003d2
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.b.x();
       return;
    }
}
