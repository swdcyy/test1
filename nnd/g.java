package nnd.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;

public final class g implements ViewTreeObserver$OnGlobalLayoutListener	// class@001e96
{
    public final TextVideoPreviewViewBinder b;
    public final a c;

    public void g(TextVideoPreviewViewBinder p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.b.S().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.c.invoke();
       return;
    }
}
