package czb.d;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment;
import java.lang.String;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import czb.e;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import java.util.Map;
import java.util.Set;

public final class d implements DialogInterface$OnDismissListener	// class@0020a1
{
    public final GrowthWebViewDialogFragment b;
    public final String c;
    public final DialogInterface$OnDismissListener d;

    public void d(GrowthWebViewDialogFragment p0,String p1,DialogInterface$OnDismissListener p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       Map a = e.a;
       Context context = this.b.getContext();
       int i = (context != null)? context.hashCode(): 0;
       Set set = a.get(Integer.valueOf(i));
       if (set != null) {
          set.remove(this.c);
       }
       d td = this.d;
       if (td != null) {
          td.onDismiss(p0);
       }
       return;
    }
}
