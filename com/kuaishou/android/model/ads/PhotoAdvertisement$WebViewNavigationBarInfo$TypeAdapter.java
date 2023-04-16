package com.kuaishou.android.model.ads.PhotoAdvertisement$WebViewNavigationBarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WebViewNavigationBarInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$WebViewNavigationBarInfo$TypeAdapter extends TypeAdapter	// class@000a62
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$WebViewNavigationBarInfo$TypeAdapter.b = a.get(PhotoAdvertisement$WebViewNavigationBarInfo.class);
    }
    public void PhotoAdvertisement$WebViewNavigationBarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$WebViewNavigationBarInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$WebViewNavigationBarInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$WebViewNavigationBarInfo webViewNavig = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return webViewNavig;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return webViewNavig;
       }else {
          p0.c();
          PhotoAdvertisement$WebViewNavigationBarInfo webViewNavig1 = new PhotoAdvertisement$WebViewNavigationBarInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x836c5bf8:
                   if (str.equals("subTitle")) {
                      i = 0;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 1;
                   }
                   break;
                 case 0x60f21a10:
                   if (str.equals("enableCustomizeNavBar")) {
                      i = 2;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   webViewNavig1.mSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   webViewNavig1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   webViewNavig1.mEnableCustomizeNavBar = KnownTypeAdapters$g.a(p0, webViewNavig1.mEnableCustomizeNavBar);
                   break;
                 case 3:
                   webViewNavig1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return webViewNavig1;
       }
    }
    public void b(b p0,PhotoAdvertisement$WebViewNavigationBarInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$WebViewNavigationBarInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          p0.r("enableCustomizeNavBar");
          p0.P(p1.mEnableCustomizeNavBar);
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
