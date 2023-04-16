package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$b;
import erd.o;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class AssistantDataHelper$b implements o	// class@001cf9
{
    public static final AssistantDataHelper$b b;

    static {
       AssistantDataHelper$b.b = new AssistantDataHelper$b();
    }
    public void AssistantDataHelper$b(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, AssistantDataHelper$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
