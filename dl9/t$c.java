package dl9.t$c;
import android.view.View$OnClickListener;
import dl9.t;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;

public final class t$c implements View$OnClickListener	// class@001fa1
{
    public final t b;

    public void t$c(t p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$c.class, "1")) {
          return;
       }
       if (t.P8(this.b).mIsDislikeHideComment != null) {
          t$c tb = this.b;
          t c = tb.C;
          if (c != null) {
             tb.X8(c);
          }
       }
       return;
    }
}
