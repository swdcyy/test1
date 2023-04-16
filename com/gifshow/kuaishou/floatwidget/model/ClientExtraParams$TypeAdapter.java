package com.gifshow.kuaishou.floatwidget.model.ClientExtraParams$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.gifshow.kuaishou.floatwidget.model.ClientExtraParams;
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

public final class ClientExtraParams$TypeAdapter extends TypeAdapter	// class@0015cd
{
    public final Gson a;
    public static final a b;

    static {
       ClientExtraParams$TypeAdapter.b = a.get(ClientExtraParams.class);
    }
    public void ClientExtraParams$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ClientExtraParams$TypeAdapter.class, "2");
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
             obj = new ClientExtraParams();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xd1fe6790:
                      if (str.equals("lastOnBackgroundTime")) {
                         i = 0;
                      }
                      break;
                    case 0xd906051a:
                      if (str.equals("lastExitAppTime")) {
                         i = 1;
                      }
                      break;
                    case 0x1162375a:
                      if (str.equals("lastColdLaunchTime")) {
                         i = 2;
                      }
                      break;
                    case 0x4750ae6e:
                      if (str.equals("lastOpenAppTime")) {
                         i = 3;
                      }
                      break;
                    case 0x5aac6925:
                      if (str.equals("lastOnForegroundTime")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.lastOnBackgroundTime = KnownTypeAdapters$n.a(p0, obj.lastOnBackgroundTime);
                      break;
                    case 1:
                      obj.lastExitAppTime = KnownTypeAdapters$n.a(p0, obj.lastExitAppTime);
                      break;
                    case 2:
                      obj.lastColdLaunchTime = KnownTypeAdapters$n.a(p0, obj.lastColdLaunchTime);
                      break;
                    case 3:
                      obj.lastOpenAppTime = KnownTypeAdapters$n.a(p0, obj.lastOpenAppTime);
                      break;
                    case 4:
                      obj.lastOnForegroundTime = KnownTypeAdapters$n.a(p0, obj.lastOnForegroundTime);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClientExtraParams$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("lastColdLaunchTime");
          p0.K(p1.lastColdLaunchTime);
          p0.r("lastOpenAppTime");
          p0.K(p1.lastOpenAppTime);
          p0.r("lastExitAppTime");
          p0.K(p1.lastExitAppTime);
          p0.r("lastOnForegroundTime");
          p0.K(p1.lastOnForegroundTime);
          p0.r("lastOnBackgroundTime");
          p0.K(p1.lastOnBackgroundTime);
          p0.j();
       }
       return;
    }
}
