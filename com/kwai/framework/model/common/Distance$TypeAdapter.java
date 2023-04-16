package com.kwai.framework.model.common.Distance$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.common.Distance;
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
import com.vimeo.stag.KnownTypeAdapters$i;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class Distance$TypeAdapter extends TypeAdapter	// class@00168d
{
    public final Gson a;
    public static final a b;

    static {
       Distance$TypeAdapter.b = a.get(Distance.class);
    }
    public void Distance$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, Distance$TypeAdapter.class, "2");
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
             obj = new Distance();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x895b4641:
                      if (str.equals("regionText")) {
                         i = 0;
                      }
                      break;
                    case 0xc51842c2:
                      if (str.equals("distanceText")) {
                         i = 1;
                      }
                      break;
                    case 0xc84826f4:
                      if (str.equals("region")) {
                         i = 2;
                      }
                      break;
                    case 0xebc8c516:
                      if (str.equals("showIcon")) {
                         i = 3;
                      }
                      break;
                    case 0x1a19f:
                      if (str.equals("lat")) {
                         i = 4;
                      }
                      break;
                    case 0x1a34b:
                      if (str.equals("lon")) {
                         i = 5;
                      }
                      break;
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 6;
                      }
                      break;
                    case 0x11318bf5:
                      if (str.equals("distance")) {
                         i = 7;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mRegionText = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mDistanceText = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mRegion = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mIsShowIcon = KnownTypeAdapters$g.a(p0, obj.mIsShowIcon);
                      break;
                    case 4:
                      obj.mLatitude = KnownTypeAdapters$i.a(p0, obj.mLatitude);
                      break;
                    case 5:
                      obj.mLongtitude = KnownTypeAdapters$i.a(p0, obj.mLongtitude);
                      break;
                    case 6:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mDistance = KnownTypeAdapters$i.a(p0, obj.mDistance);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Distance$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("distance");
          p0.J(p1.mDistance);
          p0.r("lat");
          p0.J(p1.mLatitude);
          p0.r("lon");
          p0.J(p1.mLongtitude);
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mRegion != null) {
             p0.r("region");
             TypeAdapters.A.write(p0, p1.mRegion);
          }
          if (p1.mDistanceText != null) {
             p0.r("distanceText");
             TypeAdapters.A.write(p0, p1.mDistanceText);
          }
          if (p1.mRegionText != null) {
             p0.r("regionText");
             TypeAdapters.A.write(p0, p1.mRegionText);
          }
          p0.r("showIcon");
          p0.P(p1.mIsShowIcon);
          p0.j();
       }
       return;
    }
}
