package nnd.e;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class e implements Runnable	// class@001e94
{
    public final TextVideoPreviewViewBinder b;
    public final EditDecorationBaseDrawer c;

    public void e(TextVideoPreviewViewBinder p0,EditDecorationBaseDrawer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.b.S().h0(this.c, "auto_delete", true);
       return;
    }
}
