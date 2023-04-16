package com.kuaishou.tuna_core.button.TunaPhoneAction$run$3$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tuna_core.button.local_phone.LocalPhoneResponse$TunaLocalPhoneModel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaPhoneAction$run$3$3 extends Lambda implements a	// class@0010b3
{
    public final LocalPhoneResponse$TunaLocalPhoneModel $localPhoneModel;

    public void TunaPhoneAction$run$3$3(LocalPhoneResponse$TunaLocalPhoneModel p0){
       this.$localPhoneModel = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaPhoneAction$run$3$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "get local phone number success: "+this.$localPhoneModel.mPhoneNumber;
    }
}
