package bnd.b$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import bnd.b;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3;

public final class b$a extends DecorationContainerView$e	// class@00028c
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.v(p0);
          this.a.E();
       }
       return;
    }
}
