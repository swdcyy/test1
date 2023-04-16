package com.kuaishou.commercial.splash.record.SplashSummeryData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.commercial.splash.record.SplashSummeryData;
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

public final class SplashSummeryData$TypeAdapter extends TypeAdapter	// class@001622
{
    public final Gson a;
    public static final a b;

    static {
       SplashSummeryData$TypeAdapter.b = a.get(SplashSummeryData.class);
    }
    public void SplashSummeryData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashSummeryData$TypeAdapter.class, "2");
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
             obj = new SplashSummeryData();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("materialName")) {
                   if (!str1.equals("splashAdType")) {
                      p0.Q();
                   }else {
                      obj.mSplashAdType = KnownTypeAdapters$k.a(p0, obj.mSplashAdType);
                   }
                }else {
                   obj.mMaterialName = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashSummeryData$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("splashAdType");
          p0.K((long)p1.mSplashAdType);
          if (p1.mMaterialName != null) {
             p0.r("materialName");
             TypeAdapters.A.write(p0, p1.mMaterialName);
          }
          p0.j();
       }
       return;
    }
}
