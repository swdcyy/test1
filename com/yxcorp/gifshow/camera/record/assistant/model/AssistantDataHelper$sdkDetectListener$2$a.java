package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$sdkDetectListener$2$a;
import sd9.c$a;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$sdkDetectListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import java.lang.Integer;

public final class AssistantDataHelper$sdkDetectListener$2$a implements c$a	// class@001d06
{
    public final AssistantDataHelper$sdkDetectListener$2 a;

    public void AssistantDataHelper$sdkDetectListener$2$a(AssistantDataHelper$sdkDetectListener$2 p0){
       this.a = p0;
       super();
    }
    public final void onDataChanged(){
       if (PatchProxy.applyVoid(null, this, AssistantDataHelper$sdkDetectListener$2$a.class, "1")) {
          return;
       }
       this.a.this$0.c().onNext(Integer.valueOf(1));
       return;
    }
}
