package eod.a;
import pn9.c;
import java.lang.Object;
import android.view.ViewGroup;
import pn9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.model.TextTemplateItemType;
import java.lang.Enum;
import fod.a;
import fod.c;

public final class a implements c	// class@000db2
{

    public void a(){
       super();
    }
    public a a(ViewGroup p0,int p1){
       a uoa1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.d(p0.getContext(), R.layout.arg_RES_7f0d15e7, p0, false);
       if (p1 == TextTemplateItemType.LOCAL.ordinal()) {
          a.o(view, "view");
          uoa1 = new a(view, true);
       }else {
          a.o(view, "view");
          uoa1 = new c(view, true);
       }
       return uoa1;
    }
}
