package com.yxcorp.gifshow.share.KwaiOperator$createOpClickListener$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.KwaiOperator;
import xxb.b;
import java.lang.Object;
import mhc.p1;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModel;
import brd.t;
import xxb.a;
import com.yxcorp.gifshow.share.KwaiOperator$createOpClickListener$1$a;
import com.yxcorp.gifshow.share.KwaiOperator$createOpClickListener$1$b;
import erd.g;
import crd.b;

public final class KwaiOperator$createOpClickListener$1 extends Lambda implements p	// class@001b4b
{
    public final b $listener;
    public final KwaiOperator this$0;

    public void KwaiOperator$createOpClickListener$1(KwaiOperator p0,b p1){
       this.this$0 = p0;
       this.$listener = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.intValue());
       return l1.a;
    }
    public final void invoke(p1 p0,int p1){
       if (PatchProxy.isSupport(KwaiOperator$createOpClickListener$1.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KwaiOperator$createOpClickListener$1.class, "1")) {
          return;
       }
       a.p(p0, "op");
       KwaiOperator$createOpClickListener$1 tthis$0 = this.this$0;
       tthis$0.c = p1;
       KwaiOperator$createOpClickListener$1 t$listener = this.$listener;
       t ot = (t$listener != null)? t$listener.a(p0, tthis$0.i()): null;
       if (ot == null) {
          t$listener = this.$listener;
          if (t$listener != null) {
             t$listener.c(a.i(p0, this.this$0.i()));
          }
          p0.P0(this.this$0).subscribe(new KwaiOperator$createOpClickListener$1$a(this, p0), new KwaiOperator$createOpClickListener$1$b(this, p0));
       }
       return;
    }
}
