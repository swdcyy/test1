package end.g;
import java.lang.Runnable;
import end.e;
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

public final class g implements Runnable	// class@000db1
{
    public final e b;
    public final EditDecorationBaseDrawer c;

    public void g(e p0,EditDecorationBaseDrawer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       o oo = this.b.Q().x();
       String str = "editorDelegate.editorContext";
       a.o(oo, str);
       if (!oo.b().b()) {
          oo = this.b.Q().x();
          a.o(oo, str);
          oo.b().f(true);
          g tb = this.b;
          g tc = this.c;
          a.o(tc, "showingDrawer");
          tb.D(tb.W(), tc.getTipLocationBottomCenter());
       }
       return;
    }
}
