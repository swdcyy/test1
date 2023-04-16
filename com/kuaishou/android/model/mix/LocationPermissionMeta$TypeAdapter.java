package com.kuaishou.android.model.mix.LocationPermissionMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.LocationPermissionMeta;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class LocationPermissionMeta$TypeAdapter extends TypeAdapter	// class@000d0e
{
    public final Gson a;
    public static final a b;

    static {
       LocationPermissionMeta$TypeAdapter.b = a.get(LocationPermissionMeta.class);
    }
    public void LocationPermissionMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public LocationPermissionMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocationPermissionMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LocationPermissionMeta locationPerm = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return locationPerm;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return locationPerm;
       }else {
          p0.c();
          LocationPermissionMeta locationPerm1 = new LocationPermissionMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("style")) {
                p0.Q();
             }else {
                locationPerm1.mStyle = KnownTypeAdapters$k.a(p0, locationPerm1.mStyle);
             }
          }
          p0.j();
          return locationPerm1;
       }
    }
    public void b(b p0,LocationPermissionMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocationPermissionMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("style");
          p0.K((long)p1.mStyle);
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
