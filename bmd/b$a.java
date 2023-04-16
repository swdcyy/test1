package bmd.b$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import bmd.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import voc.n;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerInitAction;
import mmd.a;
import nmd.v;
import xvc.b;

public final class b$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000277
{
    public final b b;
    public final EditDecorationContainerViewV2 c;

    public void b$a(b p0,EditDecorationContainerViewV2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       if (this.c.getEditorRect().width() > 0 && this.c.getEditorRect().height() > 0) {
          this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          EditReduxViewModel uEditReduxVi = this.b.T();
          b b = this.b.B;
          if (b != null) {
             objArray = b.F();
          }
          uEditReduxVi.t0(new StickerInitAction(objArray));
       }
       return;
    }
}
