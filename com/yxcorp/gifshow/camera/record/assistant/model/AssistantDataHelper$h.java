package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$h;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.resource.p;

public final class AssistantDataHelper$h implements Callable	// class@001cff
{
    public static final AssistantDataHelper$h b;

    static {
       AssistantDataHelper$h.b = new AssistantDataHelper$h();
    }
    public void AssistantDataHelper$h(){
       super();
    }
    public Object call(){
       String str = PatchProxy.apply(null, this, AssistantDataHelper$h.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = p.b();
       }
       return str;
    }
}
