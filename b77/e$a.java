package b77.e$a;
import android.view.View$OnClickListener;
import b77.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public class e$a implements View$OnClickListener	// class@0003d2
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.b.q.o();
       return;
    }
}
