package end.d;
import java.lang.Runnable;
import end.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import kod.a;
import voc.o;
import kotlin.jvm.internal.a;
import bvc.b;
import android.widget.TextView;
import android.graphics.Point;

public final class d implements Runnable	// class@000da6
{
    public final b b;
    public final EditDecorationBaseDrawer c;

    public void d(b p0,EditDecorationBaseDrawer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       o oo = this.b.Q().x();
       String str = "editorDelegate.editorContext";
       a.o(oo, str);
       if (!oo.b().b()) {
          oo = this.b.Q().x();
          a.o(oo, str);
          oo.b().f(true);
          d tb = this.b;
          d tc = this.c;
          a.o(tc, "showingDrawer");
          tb.D(tb.W(), tc.getTipLocationBottomCenter());
       }
       return;
    }
}
