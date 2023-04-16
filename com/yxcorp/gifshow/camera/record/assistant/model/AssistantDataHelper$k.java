package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$k;
import io.reactivex.g;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import sd9.c;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.model.response.AssistantStartUpData;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$k$a;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$k$b;
import erd.g;
import crd.b;

public final class AssistantDataHelper$k implements g	// class@001d04
{
    public final AssistantDataHelper b;
    public final c c;

    public void AssistantDataHelper$k(AssistantDataHelper p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantDataHelper$k.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       PublishSubject publishSubje = this.b.c();
       AssistantUtils d = AssistantUtils.d;
       Objects.requireNonNull(d);
       Object obj = PatchProxy.apply(null, d, AssistantUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          l = obj.longValue();
       }else {
          AssistantStartUpData uAssistantSt = d.e();
          if (uAssistantSt != null) {
             uAssistantSt = uAssistantSt.recognitionTimeOutMs;
             if (uAssistantSt != null) {
                l = uAssistantSt.longValue();
             }
          }
          l = 3000;
       }
       publishSubje.timeout(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new AssistantDataHelper$k$a(this, p0), new AssistantDataHelper$k$b(this, p0));
       this.b.D();
       return;
    }
}
