package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftBatchConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftBatchConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveGiftBatchConfig$TypeAdapter extends TypeAdapter	// class@001046
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveGiftBatchConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveGiftBatchConfig.class);
    }
    public void LiveConfigStartupResponse$LiveGiftBatchConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveGiftBatchConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveConfigStartupResponse$LiveGiftBatchConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("batchSizeName")) {
                   if (!str1.equals("batchSize")) {
                      p0.Q();
                   }else {
                      obj.mGiftBatchCount = KnownTypeAdapters$k.a(p0, obj.mGiftBatchCount);
                   }
                }else {
                   obj.mGiftBatchCountDescription = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveGiftBatchConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("batchSize");
          p0.K((long)p1.mGiftBatchCount);
          if (p1.mGiftBatchCountDescription != null) {
             p0.r("batchSizeName");
             TypeAdapters.A.write(p0, p1.mGiftBatchCountDescription);
          }
          p0.j();
       }
       return;
    }
}
