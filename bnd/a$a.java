package bnd.a$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import bnd.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;

public final class a$a extends DecorationContainerView$e	// class@000287
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.v(p0);
          this.a.D();
       }
       return;
    }
}
