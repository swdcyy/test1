package bod.c;
import bod.d;
import nuc.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import d0c.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.model.TextTemplateItemType;
import java.lang.Enum;

public final class c extends d	// class@000295
{

    public void c(a p0,DynamicTextParams p1){
       a.p(p0, "textConfig");
       a.p(p1, "sk2cParams");
       super(p0, null, null, false, p1, true, null, null, null, 462, null);
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TextTemplateItemType.LOCAL.ordinal();
    }
}
