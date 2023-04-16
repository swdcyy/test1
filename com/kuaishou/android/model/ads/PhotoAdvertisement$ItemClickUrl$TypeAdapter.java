package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$ItemClickUrl$TypeAdapter extends TypeAdapter	// class@00097c
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$ItemClickUrl$TypeAdapter.d = a.get(PhotoAdvertisement$ItemClickUrl.class);
    }
    public void PhotoAdvertisement$ItemClickUrl$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$ItemClickActionInfo$TypeAdapter.b);
       this.c = p0.j(PhotoAdvertisement$JumpLiveInfo$TypeAdapter.b);
    }
    public PhotoAdvertisement$ItemClickUrl a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ItemClickUrl$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ItemClickUrl itemClickUrl = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return itemClickUrl;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return itemClickUrl;
       }else {
          p0.c();
          PhotoAdvertisement$ItemClickUrl itemClickUrl1 = new PhotoAdvertisement$ItemClickUrl();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa557304b:
                   if (str.equals("normalActionInfo")) {
                      i = 0;
                   }
                   break;
                 case 0xd0a9a5bb:
                   if (str.equals("appLink")) {
                      i = 1;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 2;
                   }
                   break;
                 case 0x759f7e08:
                   if (str.equals("jumpLiveInfo")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   itemClickUrl1.mNormalActionInfo = this.b.read(p0);
                   break;
                 case 1:
                   itemClickUrl1.mAppLink = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   itemClickUrl1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   itemClickUrl1.mJumpLiveInfo = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return itemClickUrl1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ItemClickUrl p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ItemClickUrl$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mNormalActionInfo != null) {
             p0.r("normalActionInfo");
             this.b.write(p0, p1.mNormalActionInfo);
          }
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          if (p1.mAppLink != null) {
             p0.r("appLink");
             TypeAdapters.A.write(p0, p1.mAppLink);
          }
          if (p1.mJumpLiveInfo != null) {
             p0.r("jumpLiveInfo");
             this.c.write(p0, p1.mJumpLiveInfo);
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
