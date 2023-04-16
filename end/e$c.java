package end.e$c;
import xnd.c;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextV3Element;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementV3Data;
import java.lang.RuntimeException;

public final class e$c implements c	// class@000da9
{

    public void e$c(){
       super();
    }
    public EditDecorationBaseDrawer a(NewTextBaseElementData p0){
       NewEditTextV3Element newEditTextV = PatchProxy.applyOneRefs(p0, this, e$c.class, "1");
       if (newEditTextV != PatchProxyResult.class) {
       }else {
          a.p(p0, "data");
          if (p0 instanceof NewTextElementV3Data) {
             newEditTextV = new NewEditTextV3Element(p0);
          }else {
             throw new RuntimeException("createInstance type error");
          }
       }
       return newEditTextV;
    }
}
