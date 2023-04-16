package com.kwai.framework.network.keyconfig.KeyConfigErrorToastPolicy$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.network.keyconfig.KeyConfigErrorToastPolicy;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.network.keyconfig.TimeRange$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kwai.framework.network.keyconfig.TimeRange;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class KeyConfigErrorToastPolicy$TypeAdapter extends TypeAdapter	// class@000c19
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       KeyConfigErrorToastPolicy$TypeAdapter.c = a.get(KeyConfigErrorToastPolicy.class);
    }
    public void KeyConfigErrorToastPolicy$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(TimeRange$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, KeyConfigErrorToastPolicy$TypeAdapter.class, "2");
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
             obj = new KeyConfigErrorToastPolicy();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xc49f141f:
                      if (str.equals("disableToast")) {
                         i = 0;
                      }
                      break;
                    case 0xe46617e0:
                      if (str.equals("toastMessage")) {
                         i = 1;
                      }
                      break;
                    case 0x320d2656:
                      if (str.equals("toastMinIntervalMs")) {
                         i = 2;
                      }
                      break;
                    case 0x76e87e82:
                      if (str.equals("toastValidTime")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.disableToast = KnownTypeAdapters$g.a(p0, obj.disableToast);
                      break;
                    case 1:
                      obj.mToastMessage = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.toastMinIntervalMs = KnownTypeAdapters$n.a(p0, obj.toastMinIntervalMs);
                      break;
                    case 3:
                      obj.mToastValidTime = this.b.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyConfigErrorToastPolicy$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disableToast");
          p0.P(p1.disableToast);
          if (p1.mToastMessage != null) {
             p0.r("toastMessage");
             TypeAdapters.A.write(p0, p1.mToastMessage);
          }
          if (p1.mToastValidTime != null) {
             p0.r("toastValidTime");
             this.b.write(p0, p1.mToastValidTime);
          }
          p0.r("toastMinIntervalMs");
          p0.K(p1.toastMinIntervalMs);
          p0.j();
       }
       return;
    }
}
