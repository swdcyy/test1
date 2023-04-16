package com.kuaishou.android.model.ads.PhotoAdvertisement$ShareInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShareInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$ShareInfo$TypeAdapter extends TypeAdapter	// class@000a1b
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$ShareInfo$TypeAdapter.b = a.get(PhotoAdvertisement$ShareInfo.class);
    }
    public void PhotoAdvertisement$ShareInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$ShareInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ShareInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ShareInfo shareInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return shareInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return shareInfo;
       }else {
          p0.c();
          PhotoAdvertisement$ShareInfo shareInfo1 = new PhotoAdvertisement$ShareInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x94cdf5b9:
                   if (str.equals("shareTitle")) {
                      i = 0;
                   }
                   break;
                 case 0xd7ba5239:
                   if (str.equals("callShareApi")) {
                      i = 1;
                   }
                   break;
                 case 0x8b8ad66:
                   if (str.equals("showShareOnPlayEnd")) {
                      i = 2;
                   }
                   break;
                 case 0x48c01157:
                   if (str.equals("shareIconUrl")) {
                      i = 3;
                   }
                   break;
                 case 0x7b756ed4:
                   if (str.equals("showShareInH5")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   shareInfo1.mShareTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   shareInfo1.mCallShareApi = KnownTypeAdapters$g.a(p0, shareInfo1.mCallShareApi);
                   break;
                 case 2:
                   shareInfo1.mShowShareOnPlayEnd = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   shareInfo1.mShareIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   shareInfo1.mShowShareInH5 = KnownTypeAdapters$g.a(p0, shareInfo1.mShowShareInH5);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return shareInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ShareInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ShareInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("showShareInH5");
          p0.P(p1.mShowShareInH5);
          if (p1.mShareTitle != null) {
             p0.r("shareTitle");
             TypeAdapters.A.write(p0, p1.mShareTitle);
          }
          if (p1.mShareIconUrl != null) {
             p0.r("shareIconUrl");
             TypeAdapters.A.write(p0, p1.mShareIconUrl);
          }
          if (p1.mShowShareOnPlayEnd != null) {
             p0.r("showShareOnPlayEnd");
             TypeAdapters.A.write(p0, p1.mShowShareOnPlayEnd);
          }
          p0.r("callShareApi");
          p0.P(p1.mCallShareApi);
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
