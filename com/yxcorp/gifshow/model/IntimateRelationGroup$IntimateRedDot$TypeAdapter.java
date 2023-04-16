package com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRedDot$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRedDot;
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
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.yxcorp.gifshow.model.f;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;
import com.yxcorp.gifshow.model.e;

public final class IntimateRelationGroup$IntimateRedDot$TypeAdapter extends TypeAdapter	// class@001e2e
{
    public final Gson a;
    public static final a b;

    static {
       IntimateRelationGroup$IntimateRedDot$TypeAdapter.b = a.get(IntimateRelationGroup$IntimateRedDot.class);
    }
    public void IntimateRelationGroup$IntimateRedDot$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, IntimateRelationGroup$IntimateRedDot$TypeAdapter.class, "2");
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
             obj = new IntimateRelationGroup$IntimateRedDot();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb6ef9307:
                      if (str.equals("extParams")) {
                         i = 0;
                      }
                      break;
                    case 0xc8463ef8:
                      if (str.equals("redDot")) {
                         i = 1;
                      }
                      break;
                    case 0x5a7510f:
                      if (str.equals("count")) {
                         i = 2;
                      }
                      break;
                    case 0x12ff1e0f:
                      if (str.equals("userIcons")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mExtParams = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mRedDot = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mCount = KnownTypeAdapters$k.a(p0, obj.mCount);
                      break;
                    case 3:
                      obj.mUserIcons = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new f(this)).a(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRelationGroup$IntimateRedDot$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mRedDot != null) {
             p0.r("redDot");
             TypeAdapters.A.write(p0, p1.mRedDot);
          }
          p0.r("count");
          p0.K((long)p1.mCount);
          if (p1.mUserIcons != null) {
             p0.r("userIcons");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new e(this)).b(p0, p1.mUserIcons);
          }
          if (p1.mExtParams != null) {
             p0.r("extParams");
             TypeAdapters.A.write(p0, p1.mExtParams);
          }
          p0.j();
       }
       return;
    }
}
