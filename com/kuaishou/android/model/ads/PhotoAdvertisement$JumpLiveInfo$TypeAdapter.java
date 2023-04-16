package com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
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

public final class PhotoAdvertisement$JumpLiveInfo$TypeAdapter extends TypeAdapter	// class@000988
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$JumpLiveInfo$TypeAdapter.b = a.get(PhotoAdvertisement$JumpLiveInfo.class);
    }
    public void PhotoAdvertisement$JumpLiveInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$JumpLiveInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$JumpLiveInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$JumpLiveInfo jumpLiveInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return jumpLiveInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return jumpLiveInfo;
       }else {
          p0.c();
          PhotoAdvertisement$JumpLiveInfo jumpLiveInfo1 = new PhotoAdvertisement$JumpLiveInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x2e29578c:
                   if (str.equals("liveStreamIds")) {
                      i = 0;
                   }
                   break;
                 case 0x534e25e1:
                   if (str.equals("toLiveType")) {
                      i = 1;
                   }
                   break;
                 case 0x5d2f1771:
                   if (str.equals("bindAdToLiveStreamIds")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   jumpLiveInfo1.mLiveStreamIds = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   jumpLiveInfo1.mToLiveType = KnownTypeAdapters$k.a(p0, jumpLiveInfo1.mToLiveType);
                   break;
                 case 2:
                   jumpLiveInfo1.mBindAdToLiveStreamIds = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return jumpLiveInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$JumpLiveInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$JumpLiveInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLiveStreamIds != null) {
             p0.r("liveStreamIds");
             TypeAdapters.A.write(p0, p1.mLiveStreamIds);
          }
          p0.r("toLiveType");
          p0.K((long)p1.mToLiveType);
          if (p1.mBindAdToLiveStreamIds != null) {
             p0.r("bindAdToLiveStreamIds");
             TypeAdapters.A.write(p0, p1.mBindAdToLiveStreamIds);
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
