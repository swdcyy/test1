package com.kuaishou.android.model.ads.SplashInfo$InteractionInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.SplashInfo$RotationInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$ShakeInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SlideInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.SplashInfo$RotationInfo;
import com.kuaishou.android.model.ads.SplashInfo$SlideInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.ads.SplashInfo$ShakeInfo;
import com.google.gson.stream.b;

public final class SplashInfo$InteractionInfo$TypeAdapter extends TypeAdapter	// class@000a91
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       SplashInfo$InteractionInfo$TypeAdapter.e = a.get(SplashInfo$InteractionInfo.class);
    }
    public void SplashInfo$InteractionInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(SplashInfo$RotationInfo$TypeAdapter.c);
       this.c = p0.j(SplashInfo$ShakeInfo$TypeAdapter.b);
       this.d = p0.j(SplashInfo$SlideInfo$TypeAdapter.b);
    }
    public SplashInfo$InteractionInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$InteractionInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$InteractionInfo interactionI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return interactionI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return interactionI;
       }else {
          p0.c();
          SplashInfo$InteractionInfo interactionI1 = new SplashInfo$InteractionInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x95bd34d4:
                   if (str.equals("shakeInfo")) {
                      i = 0;
                   }
                   break;
                 case 0xb9f5bc1f:
                   if (str.equals("canClickSplash")) {
                      i = 1;
                   }
                   break;
                 case 0xc1155bef:
                   if (str.equals("interactiveStyle")) {
                      i = 2;
                   }
                   break;
                 case 0xd081d5ff:
                   if (str.equals("slideInfo")) {
                      i = 3;
                   }
                   break;
                 case 0xfb4990a9:
                   if (str.equals("rotateInfo")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   interactionI1.mShakeInfo = this.c.read(p0);
                   break;
                 case 1:
                   interactionI1.mCanClickSplash = KnownTypeAdapters$g.a(p0, interactionI1.mCanClickSplash);
                   break;
                 case 2:
                   interactionI1.mInteractiveStyle = KnownTypeAdapters$k.a(p0, interactionI1.mInteractiveStyle);
                   break;
                 case 3:
                   interactionI1.mSlideInfo = this.d.read(p0);
                   break;
                 case 4:
                   interactionI1.mRotationInfo = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return interactionI1;
       }
    }
    public void b(b p0,SplashInfo$InteractionInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$InteractionInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mRotationInfo != null) {
             p0.r("rotateInfo");
             this.b.write(p0, p1.mRotationInfo);
          }
          p0.r("canClickSplash");
          p0.P(p1.mCanClickSplash);
          if (p1.mShakeInfo != null) {
             p0.r("shakeInfo");
             this.c.write(p0, p1.mShakeInfo);
          }
          if (p1.mSlideInfo != null) {
             p0.r("slideInfo");
             this.d.write(p0, p1.mSlideInfo);
          }
          p0.r("interactiveStyle");
          p0.K((long)p1.mInteractiveStyle);
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
