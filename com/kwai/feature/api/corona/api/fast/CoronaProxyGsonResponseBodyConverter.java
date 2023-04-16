package com.kwai.feature.api.corona.api.fast.CoronaProxyGsonResponseBodyConverter;
import retrofit2.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okhttp3.ResponseBody;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.SystemClock;
import okio.d;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Exception;
import java.lang.Long;
import java.util.LinkedHashMap;
import java.util.Map;
import com.kwai.feature.api.corona.fastgson.CoronaCollectionTypeAdapterFactory;
import ok.x;
import java.lang.Boolean;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$a;

public final class CoronaProxyGsonResponseBodyConverter implements h	// class@000de1
{
    public final h converter;

    public void CoronaProxyGsonResponseBodyConverter(h p0){
       a.p(p0, "converter");
       super();
       this.converter = p0;
    }
    public Object convert(Object p0){
       return this.convert(p0);
    }
    public Object convert(ResponseBody p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaProxyGsonResponseBodyConverter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "value");
       long l = SystemClock.elapsedRealtime();
       Object obj1 = this.converter.convert(p0);
       try{
          d uod = p0.source();
          if (StringsKt__StringsKt.O2(uod.toString(), "CoronaProxyBufferedSource", false, 2, null)) {
             this.log(uod.toString(), (SystemClock.elapsedRealtime() - l));
          }
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
       }
       return obj1;
    }
    public final h getConverter(){
       return this.converter;
    }
    public final void log(String p0,long p1){
       CoronaProxyGsonResponseBodyConverter uCoronaProxy = CoronaProxyGsonResponseBodyConverter.class;
       if (PatchProxy.isSupport(uCoronaProxy) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uCoronaProxy, "2")) {
          return;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       String str = (p0 != null)? p0: "";
       linkedHashMa.put("httpUrl", str);
       linkedHashMa.put("gsonTimes", String.valueOf(p1));
       linkedHashMa.put("enableCoronaFastJson", String.valueOf(CoronaCollectionTypeAdapterFactory.c.get().booleanValue()));
       CoronaMonitorUtils$a.d(CoronaMonitorUtils.c, "httpGsonConverter", p0, "GsonConverter", "gson_success", null, linkedHashMa, false, 64, null);
       return;
    }
}
