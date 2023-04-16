package com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig$jsonObject$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hb0.a;
import java.lang.Throwable;
import w46.b;

public final class ToolBoxHeaderConfig$jsonObject$2 extends Lambda implements a	// class@000f5f
{
    public final ToolBoxHeaderConfig this$0;

    public void ToolBoxHeaderConfig$jsonObject$2(ToolBoxHeaderConfig p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final JSONObject invoke(){
       JSONObject obj = PatchProxy.apply(null, this, ToolBoxHeaderConfig$jsonObject$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject(this.this$0.b());
       }catch(org.json.JSONException e0){
          a.D().e("ToolBoxHeaderConfig", "jsonObject error", e0);
          obj = new JSONObject();
       }
       return obj;
    }
}
