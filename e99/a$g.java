package e99.a$g;
import android.view.View$OnClickListener;
import e99.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$g implements View$OnClickListener	// class@002154
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
          return;
       }
       this.b.a9();
       return;
    }
}
