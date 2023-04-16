package com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class SplashInfo$SplashLogoInfo$TypeAdapter extends TypeAdapter	// class@000ab3
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$SplashLogoInfo$TypeAdapter.b = a.get(SplashInfo$SplashLogoInfo.class);
    }
    public void SplashInfo$SplashLogoInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$SplashLogoInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$SplashLogoInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$SplashLogoInfo splashLogoIn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return splashLogoIn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return splashLogoIn;
       }else {
          p0.c();
          SplashInfo$SplashLogoInfo splashLogoIn1 = new SplashInfo$SplashLogoInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x94b216b2:
                   if (str.equals("logoHeight")) {
                      i = 0;
                   }
                   break;
                 case 0x9640a60d:
                   if (str.equals("hideLogo")) {
                      i = 1;
                   }
                   break;
                 case 0xa2884adb:
                   if (str.equals("logoWidth")) {
                      i = 2;
                   }
                   break;
                 case 0x146a1fc4:
                   if (str.equals("logoURL")) {
                      i = 3;
                   }
                   break;
                 case 0x27a4c9ee:
                   if (str.equals("logoDarkURL")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   splashLogoIn1.mLogoHeight = KnownTypeAdapters$k.a(p0, splashLogoIn1.mLogoHeight);
                   break;
                 case 1:
                   splashLogoIn1.mHideSplasshLogo = KnownTypeAdapters$g.a(p0, splashLogoIn1.mHideSplasshLogo);
                   break;
                 case 2:
                   splashLogoIn1.mLogoWidth = KnownTypeAdapters$k.a(p0, splashLogoIn1.mLogoWidth);
                   break;
                 case 3:
                   splashLogoIn1.mLogoUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   splashLogoIn1.mLogoDarkUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return splashLogoIn1;
       }
    }
    public void b(b p0,SplashInfo$SplashLogoInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$SplashLogoInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hideLogo");
          p0.P(p1.mHideSplasshLogo);
          if (p1.mLogoUrl != null) {
             p0.r("logoURL");
             TypeAdapters.A.write(p0, p1.mLogoUrl);
          }
          if (p1.mLogoDarkUrl != null) {
             p0.r("logoDarkURL");
             TypeAdapters.A.write(p0, p1.mLogoDarkUrl);
          }
          p0.r("logoWidth");
          p0.K((long)p1.mLogoWidth);
          p0.r("logoHeight");
          p0.K((long)p1.mLogoHeight);
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
