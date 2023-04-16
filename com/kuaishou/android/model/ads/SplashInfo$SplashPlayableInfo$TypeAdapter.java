package com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.SplashInfo$PlayableLineInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.SplashInfo$PlayableLineInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class SplashInfo$SplashPlayableInfo$TypeAdapter extends TypeAdapter	// class@000ab7
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       SplashInfo$SplashPlayableInfo$TypeAdapter.d = a.get(SplashInfo$SplashPlayableInfo.class);
    }
    public void SplashInfo$SplashPlayableInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(SplashInfo$PlayableLineInfo$TypeAdapter.b);
       this.c = p0.j(SplashInfo$PlayablePopupInfo$TypeAdapter.c);
    }
    public SplashInfo$SplashPlayableInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$SplashPlayableInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$SplashPlayableInfo splashPlayab = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return splashPlayab;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return splashPlayab;
       }else {
          p0.c();
          SplashInfo$SplashPlayableInfo splashPlayab1 = new SplashInfo$SplashPlayableInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x890c969e:
                   if (str.equals("drawLineBeginTime")) {
                      i = 0;
                   }
                   break;
                 case 0xdb41137a:
                   if (str.equals("popupInfo")) {
                      i = 1;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 2;
                   }
                   break;
                 case 0x46d46ec2:
                   if (str.equals("lineInfo")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   splashPlayab1.mDrawLineBeginTime = KnownTypeAdapters$k.a(p0, splashPlayab1.mDrawLineBeginTime);
                   break;
                 case 1:
                   splashPlayab1.mPlayablePopupInfo = this.c.read(p0);
                   break;
                 case 2:
                   splashPlayab1.mPlayableUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   splashPlayab1.mPlayableLineInfo = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return splashPlayab1;
       }
    }
    public void b(b p0,SplashInfo$SplashPlayableInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$SplashPlayableInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mPlayableLineInfo != null) {
             p0.r("lineInfo");
             this.b.write(p0, p1.mPlayableLineInfo);
          }
          if (p1.mPlayableUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mPlayableUrl);
          }
          p0.r("drawLineBeginTime");
          p0.K((long)p1.mDrawLineBeginTime);
          if (p1.mPlayablePopupInfo != null) {
             p0.r("popupInfo");
             this.c.write(p0, p1.mPlayablePopupInfo);
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
