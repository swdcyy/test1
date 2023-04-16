package com.yxcorp.gifshow.share.KwaiOperator$createOpClickListener$1$b;
import erd.g;
import com.yxcorp.gifshow.share.KwaiOperator$createOpClickListener$1;
import mhc.p1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.KwaiOperator;
import xxb.a;
import xxb.b;

public final class KwaiOperator$createOpClickListener$1$b implements g	// class@001b4a
{
    public final KwaiOperator$createOpClickListener$1 b;
    public final p1 c;

    public void KwaiOperator$createOpClickListener$1$b(KwaiOperator$createOpClickListener$1 p0,p1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiOperator$createOpClickListener$1$b.class, "1")) {
       }else {
          KwaiOperator$createOpClickListener$1$b tb = this.b;
          KwaiOperator$createOpClickListener$1 $listener = tb.$listener;
          if ($listener != null) {
             $listener.b(a.a(this.c, tb.this$0.i(), p0));
          }
       }
       return;
    }
}
