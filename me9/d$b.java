package me9.d$b;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicLocalResourceRequestData;
import com.google.gson.JsonObject;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.lang.IllegalArgumentException;

public final class d$b implements Callable	// class@002fe7
{
    public final MagicRequest b;

    public void d$b(MagicRequest p0){
       this.b = p0;
       super();
    }
    public Object call(){
       MagicLocalResourceRequestData magicLocalRe = PatchProxy.apply(null, this, d$b.class, "1");
       if (magicLocalRe != PatchProxyResult.class) {
       }else if(this.b.getRequestData() != null){
          magicLocalRe = a.a.c(this.b.getRequestData(), MagicLocalResourceRequestData.class);
       }else {
          throw new IllegalArgumentException("params is null");
       }
       return magicLocalRe;
    }
}
