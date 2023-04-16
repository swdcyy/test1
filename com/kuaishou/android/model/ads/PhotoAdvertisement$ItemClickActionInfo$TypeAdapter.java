package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo;
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

public final class PhotoAdvertisement$ItemClickActionInfo$TypeAdapter extends TypeAdapter	// class@000974
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$ItemClickActionInfo$TypeAdapter.b = a.get(PhotoAdvertisement$ItemClickActionInfo.class);
    }
    public void PhotoAdvertisement$ItemClickActionInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$ItemClickActionInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ItemClickActionInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ItemClickActionInfo itemClickAct = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return itemClickAct;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return itemClickAct;
       }else {
          p0.c();
          PhotoAdvertisement$ItemClickActionInfo itemClickAct1 = new PhotoAdvertisement$ItemClickActionInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa0c29ad3:
                   if (str.equals("webviewType")) {
                      i = 0;
                   }
                   break;
                 case 0xb93b67d0:
                   if (str.equals("subConversionType")) {
                      i = 1;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 2;
                   }
                   break;
                 case 0x7120f89d:
                   if (str.equals("conversionAreaType")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   itemClickAct1.mWebViewType = KnownTypeAdapters$k.a(p0, itemClickAct1.mWebViewType);
                   break;
                 case 1:
                   itemClickAct1.mSubConversionType = KnownTypeAdapters$k.a(p0, itemClickAct1.mSubConversionType);
                   break;
                 case 2:
                   itemClickAct1.mType = KnownTypeAdapters$k.a(p0, itemClickAct1.mType);
                   break;
                 case 3:
                   itemClickAct1.mConversionAreaType = KnownTypeAdapters$k.a(p0, itemClickAct1.mConversionAreaType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return itemClickAct1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ItemClickActionInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ItemClickActionInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("conversionAreaType");
          p0.K((long)p1.mConversionAreaType);
          p0.r("type");
          p0.K((long)p1.mType);
          p0.r("webviewType");
          p0.K((long)p1.mWebViewType);
          p0.r("subConversionType");
          p0.K((long)p1.mSubConversionType);
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
