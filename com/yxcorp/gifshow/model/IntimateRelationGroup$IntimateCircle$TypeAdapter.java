package com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateCircle$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateCircle;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRedDot$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRedDot;
import com.google.gson.stream.b;

public final class IntimateRelationGroup$IntimateCircle$TypeAdapter extends TypeAdapter	// class@001e2c
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       IntimateRelationGroup$IntimateCircle$TypeAdapter.c = a.get(IntimateRelationGroup$IntimateCircle.class);
    }
    public void IntimateRelationGroup$IntimateCircle$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(IntimateRelationGroup$IntimateRedDot$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, IntimateRelationGroup$IntimateCircle$TypeAdapter.class, "2");
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
             obj = new IntimateRelationGroup$IntimateCircle();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xc8463ef8:
                      if (str.equals("redDot")) {
                         i = 0;
                      }
                      break;
                    case 0x313c79:
                      if (str.equals("icon")) {
                         i = 1;
                      }
                      break;
                    case 0xbd19b59:
                      if (str.equals("actionUrl")) {
                         i = 2;
                      }
                      break;
                    case 0x38b73479:
                      if (str.equals("content")) {
                         i = 3;
                      }
                      break;
                    case 0x67c0f50f:
                      if (str.equals("darkIcon")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mRedDot = this.b.read(p0);
                      break;
                    case 1:
                      obj.mIcon = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mActionUrl = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mContent = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mDarkIcon = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRelationGroup$IntimateCircle$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
          }
          if (p1.mIcon != null) {
             p0.r("icon");
             TypeAdapters.A.write(p0, p1.mIcon);
          }
          if (p1.mDarkIcon != null) {
             p0.r("darkIcon");
             TypeAdapters.A.write(p0, p1.mDarkIcon);
          }
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          if (p1.mRedDot != null) {
             p0.r("redDot");
             this.b.write(p0, p1.mRedDot);
          }
          p0.j();
       }
       return;
    }
}
