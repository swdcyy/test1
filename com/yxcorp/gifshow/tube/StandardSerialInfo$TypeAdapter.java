package com.yxcorp.gifshow.tube.StandardSerialInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.tube.SerialInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.SerialPhoto$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.yxcorp.gifshow.tube.SerialPhoto;
import com.yxcorp.gifshow.tube.SerialInfo;
import com.google.gson.stream.b;

public final class StandardSerialInfo$TypeAdapter extends TypeAdapter	// class@001df8
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       StandardSerialInfo$TypeAdapter.d = a.get(StandardSerialInfo.class);
    }
    public void StandardSerialInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(SerialInfo$TypeAdapter.f);
       this.c = p0.j(SerialPhoto$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, StandardSerialInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new StandardSerialInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xca01fdf4:
                      if (str.equals("serial")) {
                         i = 0;
                      }
                      break;
                    case 0x65b3e32:
                      if (str.equals("photo")) {
                         i = 1;
                      }
                      break;
                    case 0xe8e293c:
                      if (str.equals("tubePageUrl")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSerialInfo = this.b.read(p0);
                      break;
                    case 1:
                      obj.mSerialPhoto = this.c.read(p0);
                      break;
                    case 2:
                      obj.mTubePageUrl = TypeAdapters.A.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StandardSerialInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSerialInfo != null) {
             p0.r("serial");
             this.b.write(p0, p1.mSerialInfo);
          }
          if (p1.mSerialPhoto != null) {
             p0.r("photo");
             this.c.write(p0, p1.mSerialPhoto);
          }
          if (p1.mTubePageUrl != null) {
             p0.r("tubePageUrl");
             TypeAdapters.A.write(p0, p1.mTubePageUrl);
          }
          p0.j();
       }
       return;
    }
}
