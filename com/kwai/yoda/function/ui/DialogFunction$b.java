package com.kwai.yoda.function.ui.DialogFunction$b;
import erd.g;
import com.kwai.yoda.function.ui.DialogFunction;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Object;
import ez7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.function.ui.DialogFunction$DialogResultParams;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.c;

public final class DialogFunction$b implements g	// class@001232
{
    public final DialogFunction b;
    public final YodaBaseWebView c;
    public final String d;
    public final String e;
    public final String f;

    public void DialogFunction$b(DialogFunction p0,YodaBaseWebView p1,String p2,String p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogFunction$b.class, "1")) {
       }else {
          DialogFunction$DialogResultParams uDialogResul = new DialogFunction$DialogResultParams();
          uDialogResul.mResult = 1;
          if (p0 != null) {
             p0 = p0.mTarget;
             if (p0 != null) {
             label_001e :
                uDialogResul.setMTarget(p0);
                this.b.l(this.c, uDialogResul, this.d, this.e, null, this.f);
             }
          }
          p0 = "";
          goto label_001e ;
       }
       return;
    }
}
