package com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class SerialInfo$RightTopCorner$TypeAdapter extends TypeAdapter	// class@001de9
{
    public final Gson a;
    public static final a b;

    static {
       SerialInfo$RightTopCorner$TypeAdapter.b = a.get(SerialInfo$RightTopCorner.class);
    }
    public void SerialInfo$RightTopCorner$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SerialInfo$RightTopCorner$TypeAdapter.class, "2");
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
             obj = new SerialInfo$RightTopCorner();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("hotViewIcon")) {
                   if (!str1.equals("viewCountDescription")) {
                      p0.Q();
                   }else {
                      obj.mViewCountDescription = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mHotViewIcon = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SerialInfo$RightTopCorner$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mViewCountDescription != null) {
             p0.r("viewCountDescription");
             TypeAdapters.A.write(p0, p1.mViewCountDescription);
          }
          if (p1.mHotViewIcon != null) {
             p0.r("hotViewIcon");
             TypeAdapters.A.write(p0, p1.mHotViewIcon);
          }
          p0.j();
       }
       return;
    }
}
