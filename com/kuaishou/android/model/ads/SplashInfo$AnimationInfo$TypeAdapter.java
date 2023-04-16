package com.kuaishou.android.model.ads.SplashInfo$AnimationInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$AnimationInfo;
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

public final class SplashInfo$AnimationInfo$TypeAdapter extends TypeAdapter	// class@000a81
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$AnimationInfo$TypeAdapter.b = a.get(SplashInfo$AnimationInfo.class);
    }
    public void SplashInfo$AnimationInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$AnimationInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$AnimationInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$AnimationInfo uAnimationIn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAnimationIn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAnimationIn;
       }else {
          p0.c();
          SplashInfo$AnimationInfo uAnimationIn1 = new SplashInfo$AnimationInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("hideAlphaAnimation")) {
                p0.Q();
             }else {
                uAnimationIn1.mHideAlphaAnimation = KnownTypeAdapters$g.a(p0, uAnimationIn1.mHideAlphaAnimation);
             }
          }
          p0.j();
          return uAnimationIn1;
       }
    }
    public void b(b p0,SplashInfo$AnimationInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$AnimationInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hideAlphaAnimation");
          p0.P(p1.mHideAlphaAnimation);
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
