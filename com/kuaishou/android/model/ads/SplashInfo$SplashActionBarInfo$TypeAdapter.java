package com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class SplashInfo$SplashActionBarInfo$TypeAdapter extends TypeAdapter	// class@000aa3
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$SplashActionBarInfo$TypeAdapter.b = a.get(SplashInfo$SplashActionBarInfo.class);
    }
    public void SplashInfo$SplashActionBarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$SplashActionBarInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$SplashActionBarInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$SplashActionBarInfo splashAction = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return splashAction;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return splashAction;
       }else {
          p0.c();
          SplashInfo$SplashActionBarInfo splashAction1 = new SplashInfo$SplashActionBarInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9e3dd59c:
                   if (str.equals("actionBarShowBeginTime")) {
                      i = 0;
                   }
                   break;
                 case 0xa03a16c3:
                   if (str.equals("noAnimation")) {
                      i = 1;
                   }
                   break;
                 case 0xe411a9bf:
                   if (str.equals("actionBarDescription")) {
                      i = 2;
                   }
                   break;
                 case 0x1aaa5edb:
                   if (str.equals("hideActionBar")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   splashAction1.mActionbarShowBeginTime = KnownTypeAdapters$k.a(p0, splashAction1.mActionbarShowBeginTime);
                   break;
                 case 1:
                   splashAction1.mNoActionbarAnimation = KnownTypeAdapters$g.a(p0, splashAction1.mNoActionbarAnimation);
                   break;
                 case 2:
                   splashAction1.mActionBarDescription = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   splashAction1.mHideSplashActionBar = KnownTypeAdapters$g.a(p0, splashAction1.mHideSplashActionBar);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return splashAction1;
       }
    }
    public void b(b p0,SplashInfo$SplashActionBarInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$SplashActionBarInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hideActionBar");
          p0.P(p1.mHideSplashActionBar);
          p0.r("actionBarShowBeginTime");
          p0.K((long)p1.mActionbarShowBeginTime);
          if (p1.mActionBarDescription != null) {
             p0.r("actionBarDescription");
             TypeAdapters.A.write(p0, p1.mActionBarDescription);
          }
          p0.r("noAnimation");
          p0.P(p1.mNoActionbarAnimation);
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
