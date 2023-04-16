package com.yxcorp.gifshow.share.KwaiOperator$createOpClickListener$1$a;
import erd.g;
import com.yxcorp.gifshow.share.KwaiOperator$createOpClickListener$1;
import mhc.p1;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.KwaiOperator;
import xxb.a;
import xxb.b;

public final class KwaiOperator$createOpClickListener$1$a implements g	// class@001b49
{
    public final KwaiOperator$createOpClickListener$1 b;
    public final p1 c;

    public void KwaiOperator$createOpClickListener$1$a(KwaiOperator$createOpClickListener$1 p0,p1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiOperator$createOpClickListener$1$a.class, "1")) {
       }else {
          p0 = this.b;
          KwaiOperator$createOpClickListener$1 $listener = p0.$listener;
          if ($listener != null) {
             $listener.b(a.j(this.c, p0.this$0.i()));
          }
       }
       return;
    }
}
