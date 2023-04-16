package com.kuaishou.tuna_core.button.TunaPhoneAction$run$3$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaPhoneAction$run$3$2 extends Lambda implements a	// class@0010b2
{
    public final Ref$ObjectRef $panelLink;

    public void TunaPhoneAction$run$3$2(Ref$ObjectRef p0){
       this.$panelLink = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaPhoneAction$run$3$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "open panel url  : "+this.$panelLink.element;
    }
}
