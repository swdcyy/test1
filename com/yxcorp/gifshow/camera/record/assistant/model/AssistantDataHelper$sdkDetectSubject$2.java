package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$sdkDetectSubject$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AssistantDataHelper$sdkDetectSubject$2 extends Lambda implements a	// class@001d08
{
    public static final AssistantDataHelper$sdkDetectSubject$2 INSTANCE;

    static {
       AssistantDataHelper$sdkDetectSubject$2.INSTANCE = new AssistantDataHelper$sdkDetectSubject$2();
    }
    public void AssistantDataHelper$sdkDetectSubject$2(){
       super(0);
    }
    public final PublishSubject invoke(){
       Object obj = PatchProxy.apply(null, this, AssistantDataHelper$sdkDetectSubject$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PublishSubject.g();
    }
    public Object invoke(){
       return this.invoke();
    }
}
