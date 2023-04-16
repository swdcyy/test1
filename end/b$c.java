package end.b$c;
import xnd.c;
import end.b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import wnd.j;
import bod.c;
import lod.m;
import bod.d;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import wnd.h;
import faa.a;
import q87.c;
import xnd.b;
import wnd.b;
import java.lang.RuntimeException;

public final class b$c implements c	// class@000d9e
{
    public final b a;
    public final EditorDelegate b;

    public void b$c(b p0,EditorDelegate p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public EditDecorationBaseDrawer a(NewTextBaseElementData p0){
       NewEditTextElement newEditTextE = PatchProxy.applyOneRefs(p0, this, b$c.class, "1");
       if (newEditTextE != PatchProxyResult.class) {
       }else {
          a.p(p0, "data");
          if (p0 instanceof NewTextElementData) {
             int i = 0;
             if (p0.V0() == null) {
                p0.Z0(j.a.d("shadow_01", m.a()));
                p0.W0(h.n());
                Object[] objArray = new Object[i];
                a.D().w("SubtitlePreviewViewBinder", "createInstance use default", objArray);
             }
             newEditTextE = new NewEditTextElement(p0, this.a.E);
             newEditTextE.setAssetProportion(b.a(this.b));
             if ((p0.S0()).length() > 0) {
                i = true;
             }
             newEditTextE.setInitFromDraft(i);
          }else {
             throw new RuntimeException("createInstance type error");
          }
       }
       return newEditTextE;
    }
}
