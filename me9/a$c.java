package me9.a$c;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicBridgeCenterRequestData;
import com.google.gson.JsonObject;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.lang.IllegalArgumentException;

public final class a$c implements Callable	// class@002fdc
{
    public final MagicRequest b;

    public void a$c(MagicRequest p0){
       this.b = p0;
       super();
    }
    public Object call(){
       MagicBridgeCenterRequestData magicBridgeC = PatchProxy.apply(null, this, a$c.class, "1");
       if (magicBridgeC != PatchProxyResult.class) {
       }else if(this.b.getRequestData() != null){
          magicBridgeC = a.a.c(this.b.getRequestData(), MagicBridgeCenterRequestData.class);
       }else {
          throw new IllegalArgumentException("params is null");
       }
       return magicBridgeC;
    }
}
