package com.kuaishou.android.model.ads.SplashInfo$ShadowInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo;
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
import com.google.gson.stream.b;

public final class SplashInfo$ShadowInfo$TypeAdapter extends TypeAdapter	// class@000a9b
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$ShadowInfo$TypeAdapter.b = a.get(SplashInfo$ShadowInfo.class);
    }
    public void SplashInfo$ShadowInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$ShadowInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$ShadowInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$ShadowInfo shadowInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return shadowInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return shadowInfo;
       }else {
          p0.c();
          SplashInfo$ShadowInfo shadowInfo1 = new SplashInfo$ShadowInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("hideTopShadow")) {
                p0.Q();
             }else {
                shadowInfo1.mHideTopShadow = KnownTypeAdapters$g.a(p0, shadowInfo1.mHideTopShadow);
             }
          }
          p0.j();
          return shadowInfo1;
       }
    }
    public void b(b p0,SplashInfo$ShadowInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$ShadowInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hideTopShadow");
          p0.P(p1.mHideTopShadow);
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
