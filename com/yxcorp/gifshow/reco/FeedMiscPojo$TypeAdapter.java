package com.yxcorp.gifshow.reco.FeedMiscPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.reco.FeedMiscPojo;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class FeedMiscPojo$TypeAdapter extends TypeAdapter	// class@0016f2
{
    public final Gson a;
    public static final a b;

    static {
       FeedMiscPojo$TypeAdapter.b = a.get(FeedMiscPojo.class);
    }
    public void FeedMiscPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FeedMiscPojo$TypeAdapter.class, "2");
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
             obj = new FeedMiscPojo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("deviceBit")) {
                   if (!str1.equals("userRecoBit")) {
                      p0.Q();
                   }else {
                      obj.mUserRecoBit = KnownTypeAdapters$n.a(p0, obj.mUserRecoBit);
                   }
                }else {
                   obj.mDeviceBit = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeedMiscPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mDeviceBit != null) {
             p0.r("deviceBit");
             TypeAdapters.A.write(p0, p1.mDeviceBit);
          }
          p0.r("userRecoBit");
          p0.K(p1.mUserRecoBit);
          p0.j();
       }
       return;
    }
}
