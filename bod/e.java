package bod.e;
import bod.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import d0c.a;
import java.io.File;
import com.yxcorp.gifshow.postfont.FontEnv;
import qkd.b;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$StyleableParams;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import quc.b;
import nuc.a;
import java.util.List;
import huc.d;
import com.yxcorp.gifshow.v3.editor.text.dynamic.util.DynamicTextEnv;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;

public final class e	// class@000297
{

    public static final d a(d p0){
       a obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$fillFontInfo");
       obj = p0.b();
       if (obj != null) {
          String str = obj.c();
          if (str != null) {
             File uFile = new File(FontEnv.a(), str);
             if (b.S(uFile)) {
                p0.d = true;
                str = uFile.getAbsolutePath();
                a.o(str, "fontFile.absolutePath");
                if (!PatchProxy.applyVoidOneRefs(str, p0, d.class, "4")) {
                   a.p(str, "<set-?>");
                   p0.c = str;
                }
             }
          }
       }
       return p0;
    }
    public static final d b(d p0){
       DynamicTextParams obj = PatchProxy.applyOneRefs(p0, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$fillTextStyleAttrs");
       if (p0.g() == null) {
          return p0;
       }
       obj = p0.g();
       a.m(obj);
       p0.h = b.c(obj.styleableParams);
       return p0;
    }
    public static final d c(d p0){
       String obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$fillTextStyleInfo");
       if (p0.j()) {
          return p0;
       }
       p0.e = d.d(p0.k(), p0.k().l());
       if (p0.g() != null) {
          p0.f = true;
          obj = p0.k().r();
          a.m(obj);
          String str = p0.k().o();
          a.m(str);
          obj = DynamicTextEnv.a(obj, str).getAbsolutePath();
          a.o(obj, "getResUnzipDir\(textConfi¡­ig.resMd5!!\).absolutePath");
          if (!PatchProxy.applyVoidOneRefs(obj, p0, d.class, "5")) {
             a.p(obj, "<set-?>");
             p0.g = obj;
          }
       }
       return p0;
    }
    public static final d d(d p0){
       TextTemplateRepo$a obj = PatchProxy.applyOneRefs(p0, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$fillTextStyleValue");
       if (p0.g() == null) {
          return p0;
       }
       obj = TextTemplateRepo.k;
       DynamicTextParams uDynamicText = p0.g();
       a.m(uDynamicText);
       TextStyleValue textStyleVal = b.e(p0.g(), obj.a(uDynamicText));
       String str = p0.k().r();
       if (str == null) {
          str = "";
       }
       p0.i = TextStyleValue.a(textStyleVal, 0, null, null, null, null, 0, null, obj.b(str), 127, null);
       return p0;
    }
}
