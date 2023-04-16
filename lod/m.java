package lod.m;
import bod.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nuc.a;
import java.util.List;
import java.lang.Integer;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import wnd.h;
import d0c.a;
import bod.d;
import bod.e;

public final class m	// class@001c89
{

    public static final c a(){
       a uoa1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, objArray, om, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a uoa = PatchProxy.apply(objArray, objArray, om, "2");
       if (uoa != patchProxyRe) {
       }else {
          uoa1 = new a(null, null, null, 0, 0, null, null, null, null, 0, 0, false, null, null, null, false, false, null, 0, null, null, null, null, null, 0xffffff, null);
          uoa.A("shadow_01");
          uoa.t(1);
          uoa.y(272);
          uoa.x(10);
          uoa.w(1);
          uoa.v("ΩÒ»’¥Úø®");
          uoa.u("397");
       }
       obj = new c(uoa, h.n());
       uoa1 = new a("397", "SourceHanSansCN-Bold", "SourceHanSansCN-Bold.otf", null, null, null, null, null, 0, 504, null);
       obj.l(patchProxyRe);
       e.d(e.b(obj));
       return obj;
    }
}
