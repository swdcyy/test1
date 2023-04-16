package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$ItemClickUrlGroup$TypeAdapter extends TypeAdapter	// class@000980
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$ItemClickUrlGroup$TypeAdapter.c = a.get(PhotoAdvertisement$ItemClickUrlGroup.class);
    }
    public void PhotoAdvertisement$ItemClickUrlGroup$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$ItemClickUrl$TypeAdapter.d);
    }
    public PhotoAdvertisement$ItemClickUrlGroup a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ItemClickUrlGroup$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ItemClickUrlGroup itemClickUrl = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return itemClickUrl;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return itemClickUrl;
       }else {
          p0.c();
          PhotoAdvertisement$ItemClickUrlGroup itemClickUrl1 = new PhotoAdvertisement$ItemClickUrlGroup();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xe6c82bc2:
                   if (str.equals("leftSlideClickUrls")) {
                      i = 0;
                   }
                   break;
                 case 0x22722767:
                   if (str.equals("avatarOnlyClickUrls")) {
                      i = 1;
                   }
                   break;
                 case 0x3a30f133:
                   if (str.equals("avatarClickUrls")) {
                      i = 2;
                   }
                   break;
                 case 0x5b00d90f:
                   if (str.equals("actionBarClickUrls")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   itemClickUrl1.mLeftSlideClickUrls = this.b.read(p0);
                   break;
                 case 1:
                   itemClickUrl1.mAvatarOnlyClickUrls = this.b.read(p0);
                   break;
                 case 2:
                   itemClickUrl1.mUserInfoClickUrls = this.b.read(p0);
                   break;
                 case 3:
                   itemClickUrl1.mActionbarClickUrl = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return itemClickUrl1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ItemClickUrlGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ItemClickUrlGroup$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mActionbarClickUrl != null) {
             p0.r("actionBarClickUrls");
             this.b.write(p0, p1.mActionbarClickUrl);
          }
          if (p1.mUserInfoClickUrls != null) {
             p0.r("avatarClickUrls");
             this.b.write(p0, p1.mUserInfoClickUrls);
          }
          if (p1.mAvatarOnlyClickUrls != null) {
             p0.r("avatarOnlyClickUrls");
             this.b.write(p0, p1.mAvatarOnlyClickUrls);
          }
          if (p1.mLeftSlideClickUrls != null) {
             p0.r("leftSlideClickUrls");
             this.b.write(p0, p1.mLeftSlideClickUrls);
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
