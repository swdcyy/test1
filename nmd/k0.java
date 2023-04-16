package nmd.k0;
import java.lang.Runnable;
import nmd.l0;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import voc.o;
import kotlin.jvm.internal.a;
import bvc.b;
import android.widget.TextView;
import nmd.v;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import android.graphics.Point;

public final class k0 implements Runnable	// class@001e60
{
    public final l0 b;
    public final EditDecorationBaseDrawer c;

    public void k0(l0 p0,EditDecorationBaseDrawer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, k0.class, "1")) {
          return;
       }
       o oo = this.b.p0().x();
       String str = "editorDelegate.editorContext";
       a.o(oo, str);
       if (!oo.b().a()) {
          oo = this.b.p0().x();
          a.o(oo, str);
          oo.b().e(true);
          k0 tb = this.b;
          k0 tc = this.c;
          a.o(tc, "showingDrawer");
          tb.D(tb.R(), tc.getTipLocationBottomCenter());
       }
       return;
    }
}
