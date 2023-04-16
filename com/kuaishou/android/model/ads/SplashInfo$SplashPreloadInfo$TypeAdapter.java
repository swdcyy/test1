package com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo;
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

public final class SplashInfo$SplashPreloadInfo$TypeAdapter extends TypeAdapter	// class@000abb
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$SplashPreloadInfo$TypeAdapter.b = a.get(SplashInfo$SplashPreloadInfo.class);
    }
    public void SplashInfo$SplashPreloadInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$SplashPreloadInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$SplashPreloadInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$SplashPreloadInfo splashPreloa = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return splashPreloa;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return splashPreloa;
       }else {
          p0.c();
          SplashInfo$SplashPreloadInfo splashPreloa1 = new SplashInfo$SplashPreloadInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("hidePreloadDescription")) {
                if (!str.equals("preloadDescription")) {
                   p0.Q();
                }else {
                   splashPreloa1.mPreloadDescription = TypeAdapters.A.read(p0);
                }
             }else {
                splashPreloa1.mHidePreloadDescription = KnownTypeAdapters$g.a(p0, splashPreloa1.mHidePreloadDescription);
             }
          }
          p0.j();
          return splashPreloa1;
       }
    }
    public void b(b p0,SplashInfo$SplashPreloadInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$SplashPreloadInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hidePreloadDescription");
          p0.P(p1.mHidePreloadDescription);
          if (p1.mPreloadDescription != null) {
             p0.r("preloadDescription");
             TypeAdapters.A.write(p0, p1.mPreloadDescription);
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
