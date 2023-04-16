package com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class NearbyMapFeed$RoleInfo$TypeAdapter extends TypeAdapter	// class@000cb0
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       NearbyMapFeed$RoleInfo$TypeAdapter.d = a.get(NearbyMapFeed$RoleInfo.class);
    }
    public void NearbyMapFeed$RoleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(NearbyMapFeed$RoleInfo$Role.class));
       this.c = p0.j(a.get(NearbyMapFeed$RoleInfo$Moment.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, NearbyMapFeed$RoleInfo$TypeAdapter.class, "2");
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
             obj = new NearbyMapFeed$RoleInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xc04f8200:
                      if (str.equals("moment")) {
                         i = 0;
                      }
                      break;
                    case 0x358076:
                      if (str.equals("role")) {
                         i = 1;
                      }
                      break;
                    case 0x38eb0007:
                      if (str.equals("message")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mMoment = this.c.read(p0);
                      break;
                    case 1:
                      obj.mRole = this.b.read(p0);
                      break;
                    case 2:
                      obj.mMessage = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NearbyMapFeed$RoleInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mMessage != null) {
             p0.r("message");
             TypeAdapters.A.write(p0, p1.mMessage);
          }
          if (p1.mRole != null) {
             p0.r("role");
             this.b.write(p0, p1.mRole);
          }
          if (p1.mMoment != null) {
             p0.r("moment");
             this.c.write(p0, p1.mMoment);
          }
          p0.j();
       }
       return;
    }
}
