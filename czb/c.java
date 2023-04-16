package czb.c;
import android.content.DialogInterface$OnShowListener;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements DialogInterface$OnShowListener	// class@0020a0
{
    public final DialogInterface$OnShowListener b;

    public void c(DialogInterface$OnShowListener p0){
       this.b = p0;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c tb = this.b;
       if (tb != null) {
          tb.onShow(p0);
       }
       return;
    }
}
