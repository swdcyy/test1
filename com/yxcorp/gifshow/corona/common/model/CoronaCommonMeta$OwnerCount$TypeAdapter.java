package com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$OwnerCount$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$OwnerCount;
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
import com.google.gson.stream.b;

public final class CoronaCommonMeta$OwnerCount$TypeAdapter extends TypeAdapter	// class@00120a
{
    public final Gson a;
    public static final a b;

    static {
       CoronaCommonMeta$OwnerCount$TypeAdapter.b = a.get(CoronaCommonMeta$OwnerCount.class);
    }
    public void CoronaCommonMeta$OwnerCount$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoronaCommonMeta$OwnerCount$TypeAdapter.class, "2");
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
             obj = new CoronaCommonMeta$OwnerCount();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("fans")) {
                   if (!str1.equals("photoPublic")) {
                      p0.Q();
                   }else {
                      obj.mPhotoPublic = KnownTypeAdapters$n.a(p0, obj.mPhotoPublic);
                   }
                }else {
                   obj.mFans = KnownTypeAdapters$n.a(p0, obj.mFans);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaCommonMeta$OwnerCount$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("fans");
          p0.K(p1.mFans);
          p0.r("photoPublic");
          p0.K(p1.mPhotoPublic);
          p0.j();
       }
       return;
    }
}
