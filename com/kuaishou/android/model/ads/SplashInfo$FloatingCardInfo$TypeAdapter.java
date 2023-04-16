package com.kuaishou.android.model.ads.SplashInfo$FloatingCardInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$FloatingCardInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.SplashInfo$CardInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.ads.SplashInfo$CardInfo;
import com.google.gson.stream.b;

public final class SplashInfo$FloatingCardInfo$TypeAdapter extends TypeAdapter	// class@000a8f
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       SplashInfo$FloatingCardInfo$TypeAdapter.c = a.get(SplashInfo$FloatingCardInfo.class);
    }
    public void SplashInfo$FloatingCardInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(SplashInfo$CardInfo$TypeAdapter.b);
    }
    public SplashInfo$FloatingCardInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$FloatingCardInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$FloatingCardInfo uFloatingCar = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFloatingCar;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFloatingCar;
       }else {
          p0.c();
          SplashInfo$FloatingCardInfo uFloatingCar1 = new SplashInfo$FloatingCardInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xff7d4bde:
                   if (str.equals("cardInfo")) {
                      i = 0;
                   }
                   break;
                 case 0x68b1db1:
                   if (str.equals("style")) {
                      i = 1;
                   }
                   break;
                 case 0x2b158697:
                   if (str.equals("borderColor")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFloatingCar1.mCardInfo = this.b.read(p0);
                   break;
                 case 1:
                   uFloatingCar1.mCardStyle = KnownTypeAdapters$k.a(p0, uFloatingCar1.mCardStyle);
                   break;
                 case 2:
                   uFloatingCar1.mBorderColor = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFloatingCar1;
       }
    }
    public void b(b p0,SplashInfo$FloatingCardInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$FloatingCardInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mBorderColor != null) {
             p0.r("borderColor");
             TypeAdapters.A.write(p0, p1.mBorderColor);
          }
          p0.r("style");
          p0.K((long)p1.mCardStyle);
          if (p1.mCardInfo != null) {
             p0.r("cardInfo");
             this.b.write(p0, p1.mCardInfo);
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
