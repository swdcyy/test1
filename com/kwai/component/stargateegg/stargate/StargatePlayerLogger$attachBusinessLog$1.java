package com.kwai.component.stargateegg.stargate.StargatePlayerLogger$attachBusinessLog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.stargateegg.stargate.StargatePlayerLogger;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;

public final class StargatePlayerLogger$attachBusinessLog$1 extends Lambda implements a	// class@000b45
{
    public final String $logJson;
    public final StargatePlayerLogger this$0;

    public void StargatePlayerLogger$attachBusinessLog$1(StargatePlayerLogger p0,String p1){
       this.this$0 = p0;
       this.$logJson = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, StargatePlayerLogger$attachBusinessLog$1.class, "1")) {
          return;
       }
       this.this$0.a = new JSONObject(this.$logJson);
       return;
    }
}
