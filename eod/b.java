package eod.b;
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
import android.view.ViewGroup$LayoutParams;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.model.TextTemplateItemType;
import java.lang.Enum;
import fod.a;
import fod.c;

public final class b implements c	// class@000db3
{

    public void b(){
       super();
    }
    public a a(ViewGroup p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.d(p0.getContext(), R.layout.arg_RES_7f0d15e7, p0, false);
       a.o(view, "view");
       TextTemplateConstantV2 m = TextTemplateConstantV2.m;
       view.getLayoutParams().width = m.e();
       view.getLayoutParams().height = m.c();
       a uoa = (p1 == TextTemplateItemType.LOCAL.ordinal())? new a(view, false): new c(view, false);
       return uoa;
    }
}
