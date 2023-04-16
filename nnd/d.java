package nnd.d;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
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
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import android.graphics.Point;

public final class d implements Runnable	// class@001e93
{
    public final TextVideoPreviewViewBinder b;
    public final EditDecorationBaseDrawer c;

    public void d(TextVideoPreviewViewBinder p0,EditDecorationBaseDrawer p1){
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
       if (!oo.b().c()) {
          oo = this.b.Q().x();
          a.o(oo, str);
          oo.b().g(true);
          d tb = this.b;
          d tc = this.c;
          a.o(tc, "showingDrawer");
          tb.D(tb.Y(), tc.getTipLocationBottomCenter());
       }
       return;
    }
}
