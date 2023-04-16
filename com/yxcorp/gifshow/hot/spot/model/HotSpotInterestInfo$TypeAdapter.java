package com.yxcorp.gifshow.hot.spot.model.HotSpotInterestInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.hot.spot.model.HotSpotInterestInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class HotSpotInterestInfo$TypeAdapter extends TypeAdapter	// class@00183f
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       HotSpotInterestInfo$TypeAdapter.c = a.get(HotSpotInterestInfo.class);
    }
    public void HotSpotInterestInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(HotSpotModel.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, HotSpotInterestInfo$TypeAdapter.class, "2");
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
             obj = new HotSpotInterestInfo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("result")) {
                   if (!str1.equals("data")) {
                      p0.Q();
                   }else {
                      obj.mHotSpotInterest = this.b.read(p0);
                   }
                }else {
                   obj.result = KnownTypeAdapters$k.a(p0, obj.result);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HotSpotInterestInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("result");
          p0.K((long)p1.result);
          if (p1.mHotSpotInterest != null) {
             p0.r("data");
             this.b.write(p0, p1.mHotSpotInterest);
          }
          p0.j();
       }
       return;
    }
}
