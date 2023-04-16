package me9.l$b;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicNetworkBridgeRequestData;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class l$b implements Callable	// class@002ffc
{
    public final MagicRequest b;

    public void l$b(MagicRequest p0){
       this.b = p0;
       super();
    }
    public Object call(){
       MagicNetworkBridgeRequestData magicNetwork = PatchProxy.apply(null, this, l$b.class, "1");
       if (magicNetwork != PatchProxyResult.class) {
       }else {
          magicNetwork = a.a.c(this.b.getRequestData(), MagicNetworkBridgeRequestData.class);
          if (magicNetwork != null) {
             String path = magicNetwork.getPath();
             IllegalArgumentException illegalArgum = (path == null || !path.length())? 1: null;
             if (illegalArgum) {
             label_0035 :
                throw new IllegalArgumentException("params is null, "+magicNetwork);
             }
          }else {
             goto label_0035 ;
          }
       }
       return magicNetwork;
    }
}
