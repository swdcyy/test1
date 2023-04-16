package nmd.q$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import nmd.q;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;

public final class q$a extends DecorationContainerView$e	// class@001e6a
{
    public final q a;

    public void q$a(q p0){
       this.a = p0;
       super();
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$a.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.v(p0);
          this.a.D();
       }
       return;
    }
}
