package com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class SplashInfo$ClickButtonInfo$TypeAdapter extends TypeAdapter	// class@000a8d
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$ClickButtonInfo$TypeAdapter.b = a.get(SplashInfo$ClickButtonInfo.class);
    }
    public void SplashInfo$ClickButtonInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$ClickButtonInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$ClickButtonInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$ClickButtonInfo uClickButton = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uClickButton;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uClickButton;
       }else {
          p0.c();
          SplashInfo$ClickButtonInfo uClickButton1 = new SplashInfo$ClickButtonInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9594c751:
                   if (str.equals("buttonColor")) {
                      i = 0;
                   }
                   break;
                 case 0x9678b59f:
                   if (str.equals("buttonStyle")) {
                      i = 1;
                   }
                   break;
                 case 0x9681ba46:
                   if (str.equals("buttonTitle")) {
                      i = 2;
                   }
                   break;
                 case 0x96abc5b4:
                   if (str.equals("buttonWidth")) {
                      i = 3;
                   }
                   break;
                 case 0xa30b3799:
                   if (str.equals("buttonCornerRadius")) {
                      i = 4;
                   }
                   break;
                 case 0xb12814ea:
                   if (str.equals("liveSplashActionbar")) {
                      i = 5;
                   }
                   break;
                 case 0xfb51c00b:
                   if (str.equals("buttonBottomMargin")) {
                      i = 6;
                   }
                   break;
                 case 0x11b9fc8f:
                   if (str.equals("showButton")) {
                      i = 7;
                   }
                   break;
                 case 0x24fdf6f9:
                   if (str.equals("buttonHeight")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uClickButton1.mButtonColor = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uClickButton1.mButtonStyle = KnownTypeAdapters$k.a(p0, uClickButton1.mButtonStyle);
                   break;
                 case 2:
                   uClickButton1.mButtonTitle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uClickButton1.mButtonWidth = KnownTypeAdapters$k.a(p0, uClickButton1.mButtonWidth);
                   break;
                 case 4:
                   uClickButton1.mButtonCornerRadius = KnownTypeAdapters$k.a(p0, uClickButton1.mButtonCornerRadius);
                   break;
                 case 5:
                   uClickButton1.mLiveActionBarDescription = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uClickButton1.mButtonBottomMargin = KnownTypeAdapters$k.a(p0, uClickButton1.mButtonBottomMargin);
                   break;
                 case 7:
                   uClickButton1.mShowButton = KnownTypeAdapters$g.a(p0, uClickButton1.mShowButton);
                   break;
                 case 8:
                   uClickButton1.mButtonHeight = KnownTypeAdapters$k.a(p0, uClickButton1.mButtonHeight);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uClickButton1;
       }
    }
    public void b(b p0,SplashInfo$ClickButtonInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$ClickButtonInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("buttonWidth");
          p0.K((long)p1.mButtonWidth);
          p0.r("buttonHeight");
          p0.K((long)p1.mButtonHeight);
          if (p1.mButtonTitle != null) {
             p0.r("buttonTitle");
             TypeAdapters.A.write(p0, p1.mButtonTitle);
          }
          p0.r("buttonBottomMargin");
          p0.K((long)p1.mButtonBottomMargin);
          p0.r("buttonCornerRadius");
          p0.K((long)p1.mButtonCornerRadius);
          p0.r("showButton");
          p0.P(p1.mShowButton);
          p0.r("buttonStyle");
          p0.K((long)p1.mButtonStyle);
          if (p1.mButtonColor != null) {
             p0.r("buttonColor");
             TypeAdapters.A.write(p0, p1.mButtonColor);
          }
          if (p1.mLiveActionBarDescription != null) {
             p0.r("liveSplashActionbar");
             TypeAdapters.A.write(p0, p1.mLiveActionBarDescription);
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
