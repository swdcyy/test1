package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$l;
import erd.o;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import java.lang.String;
import java.lang.Object;
import zr4.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.intelligentidentify.b;
import java.util.Objects;
import java.lang.Number;
import com.kwai.camerasdk.videoCapture.CameraController;
import java.lang.Integer;
import brd.t;
import com.google.protobuf.nano.MessageNano;
import ojd.f;
import okhttp3.MultipartBody$Part;
import ojd.e;
import ac9.a;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import ac9.c;

public final class AssistantDataHelper$l implements o	// class@001d05
{
    public final AssistantDataHelper b;
    public final String c;
    public final int d;

    public void AssistantDataHelper$l(AssistantDataHelper p0,String p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       int i;
       b obj = PatchProxy.applyOneRefs(p0, this, AssistantDataHelper$l.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "sdkResult");
          AssistantDataHelper$l tb = this.b;
          obj = tb.d();
          Objects.requireNonNull(obj);
          c obj1 = PatchProxy.apply(null, obj, b.class, "2");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          }else {
             obj = obj.b;
             i = (obj == null || obj.isFrontCamera())? 1: 2;
          }
          AssistantDataHelper$l tc = this.c;
          AssistantDataHelper$l td = this.d;
          if (PatchProxy.isSupport(AssistantDataHelper.class)) {
             obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(i), tc, Integer.valueOf(td), tb, AssistantDataHelper.class, "11");
             if (obj != PatchProxyResult.class) {
             }
          }
          int i1 = 0;
          int i2 = (!p0.length)? 1: 0;
          String str = "MultipartFactory.createC¡­vice.RECOMMEND_KEY, null\)";
          String str1 = "recognitionParams";
          if (i2 ^ 1) {
             p0 = e.c(str1, MessageNano.toByteArray(p0[i1]), str1, null);
             a.o(p0, str);
          }else {
             p0 = new byte[i1];
             p0 = e.c(str1, p0, str1, null);
             a.o(p0, str);
          }
          obj1 = new c(tb, p0, i, tc, td);
          p0 = t.fromCallable(a.b).subscribeOn(d.c).flatMap(i2);
          a.o(p0, "Observable.fromCallable ¡­eList\n          }\n      }");
          obj = p0;
       }
       return obj;
    }
}
