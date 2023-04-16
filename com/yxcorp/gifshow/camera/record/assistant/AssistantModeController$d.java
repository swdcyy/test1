package com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$d;
import com.yxcorp.gifshow.camera.record.intelligentidentify.AssistantGuideBubble$a;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yc9.a;

public final class AssistantModeController$d implements AssistantGuideBubble$a	// class@001ce9
{
    public final b a;

    public void AssistantModeController$d(b p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, AssistantModeController$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.d(a.b).a;
    }
}
