package com.kuaishou.tuna_core.button.TunaPhoneAction$launchPhoneDialog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaPhoneAction$launchPhoneDialog$1 extends Lambda implements a	// class@0010a9
{
    public final String $phoneNumber;
    public final String $trackSource;
    public final String $userId;

    public void TunaPhoneAction$launchPhoneDialog$1(String p0,String p1,String p2){
       this.$phoneNumber = p0;
       this.$userId = p1;
       this.$trackSource = p2;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaPhoneAction$launchPhoneDialog$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "launchPhoneDialog : "+this.$phoneNumber+", of User["+this.$userId+"], source: "+this.$trackSource;
    }
}
