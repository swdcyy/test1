package com.kuaishou.android.model.mix.ImageMeta$CDNInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
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

public final class ImageMeta$CDNInfo$TypeAdapter extends TypeAdapter	// class@000cd2
{
    public final Gson a;
    public static final a b;

    static {
       ImageMeta$CDNInfo$TypeAdapter.b = a.get(ImageMeta$CDNInfo.class);
    }
    public void ImageMeta$CDNInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public ImageMeta$CDNInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ImageMeta$CDNInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ImageMeta$CDNInfo uCDNInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCDNInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCDNInfo;
       }else {
          p0.c();
          ImageMeta$CDNInfo uCDNInfo1 = new ImageMeta$CDNInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xeddcafa4:
                   if (str.equals("useHttps")) {
                      i = 0;
                   }
                   break;
                 case 0x1802d:
                   if (str.equals("cdn")) {
                      i = 1;
                   }
                   break;
                 case 0x66396e67:
                   if (str.equals("isFreeTraffic")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCDNInfo1.mUseHttps = KnownTypeAdapters$g.a(p0, uCDNInfo1.mUseHttps);
                   break;
                 case 1:
                   uCDNInfo1.mCdn = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uCDNInfo1.mIsFreeTraffic = KnownTypeAdapters$g.a(p0, uCDNInfo1.mIsFreeTraffic);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCDNInfo1;
       }
    }
    public void b(b p0,ImageMeta$CDNInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageMeta$CDNInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCdn != null) {
             p0.r("cdn");
             TypeAdapters.A.write(p0, p1.mCdn);
          }
          p0.r("isFreeTraffic");
          p0.P(p1.mIsFreeTraffic);
          p0.r("useHttps");
          p0.P(p1.mUseHttps);
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
