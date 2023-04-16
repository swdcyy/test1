package dcc.c$a;
import android.view.View$OnClickListener;
import dcc.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$a implements View$OnClickListener	// class@00216b
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.b.b();
       return;
    }
}
