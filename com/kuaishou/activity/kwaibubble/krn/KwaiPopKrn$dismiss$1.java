package com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$dismiss$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn;
import java.lang.Integer;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qn.h;

public final class KwaiPopKrn$dismiss$1 extends Lambda implements a	// class@00077a
{
    public final Integer $type;
    public final KwaiPopKrn this$0;

    public void KwaiPopKrn$dismiss$1(KwaiPopKrn p0,Integer p1){
       this.this$0 = p0;
       this.$type = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, KwaiPopKrn$dismiss$1.class, "1")) {
          return;
       }
       KwaiPopKrn$dismiss$1 tthis$0 = this.this$0;
       KwaiPopKrn a = tthis$0.a;
       if (a == null) {
          tthis$0.release();
       }else if(a != null){
          a.b(this.$type);
       }
       return;
    }
}
