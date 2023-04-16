package e0b.e$d;
import android.view.View$OnClickListener;
import e0b.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.Button;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import cgc.a;
import e0b.e$a;

public final class e$d implements View$OnClickListener	// class@0025b8
{
    public final e b;

    public void e$d(e p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "1")) {
          return;
       }
       e i = this.b.i;
       if (i != null) {
          CharSequence text = i.getText();
          if (text != null) {
             String str = text.toString();
             if (str != null) {
                this.b.y.j().q("CLARITY");
                this.b.y.j().d(str, "ING", this.b.y.d() instanceof a);
             }
          }
       }
       this.b.b().f();
       return;
    }
}
