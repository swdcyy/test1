package com.yxcorp.gifshow.share.KwaiOperator$createOpShowListener$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import mhc.o0;
import java.lang.Object;
import mhc.p1;
import android.view.View;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class KwaiOperator$createOpShowListener$1 extends Lambda implements q	// class@001b4c
{
    public final o0 $listener;

    public void KwaiOperator$createOpShowListener$1(o0 p0){
       this.$listener = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2.intValue());
       return l1.a;
    }
    public final void invoke(p1 p0,View p1,int p2){
       if (PatchProxy.isSupport(KwaiOperator$createOpShowListener$1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KwaiOperator$createOpShowListener$1.class, "1")) {
          return;
       }
       a.p(p0, "op");
       a.p(p1, "view");
       KwaiOperator$createOpShowListener$1 t$listener = this.$listener;
       if (t$listener != null) {
          t$listener.g(p0, p1);
       }
       return;
    }
}
