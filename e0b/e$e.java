package e0b.e$e;
import android.view.View$OnClickListener;
import e0b.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.CharSequence;
import android.widget.Button;
import cgc.a;
import e0b.e$a;

public final class e$e implements View$OnClickListener	// class@0025b9
{
    public final e b;

    public void e$e(e p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$e.class, "1")) {
          return;
       }
       a uoa = this.b.y.j();
       e j = this.b.j;
       CharSequence text = (j != null)? j.getText(): null;
       uoa.d(String.valueOf(text), "ING", this.b.y.d() instanceof a);
       this.b.b().g();
       return;
    }
}
