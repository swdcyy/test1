package com.kuaishou.tuna_core.button.TunaLocalPhoneUtils$Companion$tryGetLocalPhoneInfo$1$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.social.login.model.PrePhoneNumModel;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;

public final class TunaLocalPhoneUtils$Companion$tryGetLocalPhoneInfo$1$1$1 extends Lambda implements a	// class@0010a0
{
    public final PrePhoneNumModel $data;
    public final String $errorMessage;
    public final boolean $isSuccess;

    public void TunaLocalPhoneUtils$Companion$tryGetLocalPhoneInfo$1$1$1(boolean p0,PrePhoneNumModel p1,String p2){
       this.$isSuccess = p0;
       this.$data = p1;
       this.$errorMessage = p2;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaLocalPhoneUtils$Companion$tryGetLocalPhoneInfo$1$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "get local phone number info. isSuccess: "+this.$isSuccess+", data is "+a.a.q(this.$data)+", errorMsg: "+this.$errorMessage;
    }
}
