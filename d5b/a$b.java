package d5b.a$b;
import erd.g;
import d5b.a;
import java.lang.Object;
import a5b.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import com.yxcorp.utility.n;

public final class a$b implements g	// class@00243a
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          p0 = p0.a();
          a.R8(this.b).setText(p0);
          if (TextUtils.isEmpty(p0)) {
             n.Y(a.P8(this.b), 4, false);
          }else {
             n.Y(a.P8(this.b), false, false);
             a.R8(this.b).setSelection(p0.length());
          }
       }
       return;
    }
}
