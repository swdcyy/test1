package com.kuaishou.tuna_core.button.TunaPhoneAction$run$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.tuna.button.PhoneInfoModel$VirtualPhone;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaPhoneAction$run$2 extends Lambda implements a	// class@0010b0
{
    public final PhoneInfoModel$VirtualPhone $virtualPhone;

    public void TunaPhoneAction$run$2(PhoneInfoModel$VirtualPhone p0){
       this.$virtualPhone = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaPhoneAction$run$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "mIsNeedGetLocalPhoneNumber: "+this.$virtualPhone.mIsNeedGetLocalPhoneNumber;
    }
}
