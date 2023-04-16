package com.kuaishou.tuna_core.button.TunaPhoneAction$reportGetLocalPhoneNumberResult$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import g05.a$d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class TunaPhoneAction$reportGetLocalPhoneNumberResult$1 extends Lambda implements l	// class@0010aa
{
    public final boolean $isSuccess;

    public void TunaPhoneAction$reportGetLocalPhoneNumberResult$1(boolean p0){
       this.$isSuccess = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaPhoneAction$reportGetLocalPhoneNumberResult$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       int i = (this.$isSuccess != null)? 7: 8;
       p0.h(i);
       return;
    }
}
