package com.kuaishou.android.model.mix.KYInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.KYInfo;
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

public final class KYInfo$TypeAdapter extends TypeAdapter	// class@000cf6
{
    public final Gson a;
    public static final a b;

    static {
       KYInfo$TypeAdapter.b = a.get(KYInfo.class);
    }
    public void KYInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public KYInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, KYInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       KYInfo kYInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return kYInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return kYInfo;
       }else {
          p0.c();
          KYInfo kYInfo1 = new KYInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("kyDesc")) {
                if (!str.equals("actionUrl")) {
                   p0.Q();
                }else {
                   kYInfo1.mActionUrl = TypeAdapters.A.read(p0);
                }
             }else {
                kYInfo1.mDesc = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return kYInfo1;
       }
    }
    public void b(b p0,KYInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KYInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          if (p1.mDesc != null) {
             p0.r("kyDesc");
             TypeAdapters.A.write(p0, p1.mDesc);
          }
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
