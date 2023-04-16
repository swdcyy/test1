package com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegradeConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegradeConfig;
import com.google.gson.stream.b;

public final class DegradeConfig$TypeAdapter extends TypeAdapter	// class@001318
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       DegradeConfig$TypeAdapter.c = a.get(DegradeConfig.class);
    }
    public void DegradeConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(DegradeConfig$UrlDegradeConfig$TypeAdapter.g);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, DegradeConfig$TypeAdapter.class, "2");
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
             obj = new DegradeConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xd903da98:
                      if (str.equals("disableCheckFilter")) {
                         i = 0;
                      }
                      break;
                    case 0x2744663e:
                      if (str.equals("signalDegradation")) {
                         i = 1;
                      }
                      break;
                    case 0x52ca801a:
                      if (str.equals("disableFeedStat")) {
                         i = 2;
                      }
                      break;
                    case 0x5a3e47e1:
                      if (str.equals("enableDelayUpload")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDisableCheckFilter = KnownTypeAdapters$g.a(p0, obj.mDisableCheckFilter);
                      break;
                    case 1:
                      obj.mConfig = this.b.read(p0);
                      break;
                    case 2:
                      obj.mDisableFeedStat = KnownTypeAdapters$g.a(p0, obj.mDisableFeedStat);
                      break;
                    case 3:
                      obj.mDelayUpload = KnownTypeAdapters$g.a(p0, obj.mDelayUpload);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DegradeConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mConfig != null) {
             p0.r("signalDegradation");
             this.b.write(p0, p1.mConfig);
          }
          p0.r("disableCheckFilter");
          p0.P(p1.mDisableCheckFilter);
          p0.r("disableFeedStat");
          p0.P(p1.mDisableFeedStat);
          p0.r("enableDelayUpload");
          p0.P(p1.mDelayUpload);
          p0.j();
       }
       return;
    }
}
