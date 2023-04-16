package com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateTypeMetaInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateTypeMetaInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class IntimateRelationGroup$IntimateTypeMetaInfo$TypeAdapter extends TypeAdapter	// class@001e32
{
    public final Gson a;
    public static final a b;

    static {
       IntimateRelationGroup$IntimateTypeMetaInfo$TypeAdapter.b = a.get(IntimateRelationGroup$IntimateTypeMetaInfo.class);
    }
    public void IntimateRelationGroup$IntimateTypeMetaInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, IntimateRelationGroup$IntimateTypeMetaInfo$TypeAdapter.class, "2");
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
             obj = new IntimateRelationGroup$IntimateTypeMetaInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xd467f02b:
                      if (str.equals("totalCount")) {
                         i = 0;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 1;
                      }
                      break;
                    case 0x4281c8e:
                      if (str.equals("nickName")) {
                         i = 2;
                      }
                      break;
                    case 0x5a7510f:
                      if (str.equals("count")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                    case 3:
                      obj.mTotalCount = KnownTypeAdapters$k.a(p0, obj.mTotalCount);
                      break;
                    case 1:
                      obj.mType = KnownTypeAdapters$k.a(p0, obj.mType);
                      break;
                    case 2:
                      obj.mNickName = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRelationGroup$IntimateTypeMetaInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mNickName != null) {
             p0.r("nickName");
             TypeAdapters.A.write(p0, p1.mNickName);
          }
          p0.r("totalCount");
          p0.K((long)p1.mTotalCount);
          p0.j();
       }
       return;
    }
}
