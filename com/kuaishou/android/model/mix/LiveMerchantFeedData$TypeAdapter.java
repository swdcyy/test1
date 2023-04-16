package com.kuaishou.android.model.mix.LiveMerchantFeedData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
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
import com.google.gson.stream.b;

public final class LiveMerchantFeedData$TypeAdapter extends TypeAdapter	// class@000cff
{
    public final Gson a;
    public static final a b;

    static {
       LiveMerchantFeedData$TypeAdapter.b = a.get(LiveMerchantFeedData.class);
    }
    public void LiveMerchantFeedData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public LiveMerchantFeedData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantFeedData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveMerchantFeedData liveMerchant = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveMerchant;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveMerchant;
       }else {
          p0.c();
          LiveMerchantFeedData liveMerchant1 = new LiveMerchantFeedData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("liveType")) {
                p0.Q();
             }else {
                liveMerchant1.mLiveType = KnownTypeAdapters$k.a(p0, liveMerchant1.mLiveType);
             }
          }
          p0.j();
          return liveMerchant1;
       }
    }
    public void b(b p0,LiveMerchantFeedData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantFeedData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("liveType");
          p0.K((long)p1.mLiveType);
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
