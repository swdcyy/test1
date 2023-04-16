package com.kwai.video.westeros.Westeros$1;
import com.kwai.video.westeros.helpers.ValidationChecker;
import com.kwai.video.westeros.Westeros;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.camerasdk.log.Log;

public class Westeros$1 implements ValidationChecker	// class@000e67
{
    public final Westeros this$0;

    public void Westeros$1(Westeros p0){
       this.this$0 = p0;
       super();
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, Westeros$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.this$0.disposed != null) {
          Log.w("Westeros", "Westeros is not valid!!");
       }
       return (this.this$0.disposed ^ 0x01);
    }
}
