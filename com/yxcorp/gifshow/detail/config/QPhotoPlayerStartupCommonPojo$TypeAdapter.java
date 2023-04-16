package com.yxcorp.gifshow.detail.config.QPhotoPlayerStartupCommonPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.detail.config.QPhotoPlayerStartupCommonPojo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.detail.config.MultiRateConfig;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.stream.b;

public final class QPhotoPlayerStartupCommonPojo$TypeAdapter extends TypeAdapter	// class@0014fb
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       QPhotoPlayerStartupCommonPojo$TypeAdapter.c = a.get(QPhotoPlayerStartupCommonPojo.class);
    }
    public void QPhotoPlayerStartupCommonPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(MultiRateConfig.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QPhotoPlayerStartupCommonPojo$TypeAdapter.class, "2");
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
             obj = new QPhotoPlayerStartupCommonPojo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("multiRateConfig")) {
                   p0.Q();
                }else {
                   obj.mMultiRateConfig = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QPhotoPlayerStartupCommonPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mMultiRateConfig != null) {
             p0.r("multiRateConfig");
             this.b.write(p0, p1.mMultiRateConfig);
          }
          p0.j();
       }
       return;
    }
}
