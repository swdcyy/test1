package com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class SplashInfo$SplashSkipInfo$TypeAdapter extends TypeAdapter	// class@000abf
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$SplashSkipInfo$TypeAdapter.b = a.get(SplashInfo$SplashSkipInfo.class);
    }
    public void SplashInfo$SplashSkipInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$SplashSkipInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$SplashSkipInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$SplashSkipInfo splashSkipIn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return splashSkipIn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return splashSkipIn;
       }else {
          p0.c();
          SplashInfo$SplashSkipInfo splashSkipIn1 = new SplashInfo$SplashSkipInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xca840a7c:
                   if (str.equals("hideCountdownTime")) {
                      i = 0;
                   }
                   break;
                 case 0xf9c0855a:
                   if (str.equals("skipShowBeginTime")) {
                      i = 1;
                   }
                   break;
                 case 0x78d168bb:
                   if (str.equals("hideSkipBtn")) {
                      i = 2;
                   }
                   break;
                 case 0x7c39e419:
                   if (str.equals("skipTitle")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   splashSkipIn1.mHideCountdownTime = KnownTypeAdapters$g.a(p0, splashSkipIn1.mHideCountdownTime);
                   break;
                 case 1:
                   splashSkipIn1.mSkipTagShowTime = KnownTypeAdapters$k.a(p0, splashSkipIn1.mSkipTagShowTime);
                   break;
                 case 2:
                   splashSkipIn1.mHideSkipBtn = KnownTypeAdapters$g.a(p0, splashSkipIn1.mHideSkipBtn);
                   break;
                 case 3:
                   splashSkipIn1.mSkipTitle = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return splashSkipIn1;
       }
    }
    public void b(b p0,SplashInfo$SplashSkipInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$SplashSkipInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hideSkipBtn");
          p0.P(p1.mHideSkipBtn);
          p0.r("skipShowBeginTime");
          p0.K((long)p1.mSkipTagShowTime);
          if (p1.mSkipTitle != null) {
             p0.r("skipTitle");
             TypeAdapters.A.write(p0, p1.mSkipTitle);
          }
          p0.r("hideCountdownTime");
          p0.P(p1.mHideCountdownTime);
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
