package com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo;
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

public final class SplashInfo$SplashLableInfo$TypeAdapter extends TypeAdapter	// class@000aab
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$SplashLableInfo$TypeAdapter.b = a.get(SplashInfo$SplashLableInfo.class);
    }
    public void SplashInfo$SplashLableInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$SplashLableInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$SplashLableInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$SplashLableInfo splashLableI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return splashLableI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return splashLableI;
       }else {
          p0.c();
          SplashInfo$SplashLableInfo splashLableI1 = new SplashInfo$SplashLableInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("adLabelDescription")) {
                if (!str.equals("hideLabel")) {
                   p0.Q();
                }else {
                   splashLableI1.mHideLable = KnownTypeAdapters$g.a(p0, splashLableI1.mHideLable);
                }
             }else {
                splashLableI1.mLableDescription = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return splashLableI1;
       }
    }
    public void b(b p0,SplashInfo$SplashLableInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$SplashLableInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hideLabel");
          p0.P(p1.mHideLable);
          if (p1.mLableDescription != null) {
             p0.r("adLabelDescription");
             TypeAdapters.A.write(p0, p1.mLableDescription);
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
