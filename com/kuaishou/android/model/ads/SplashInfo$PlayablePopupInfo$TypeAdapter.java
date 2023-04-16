package com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.SplashInfo$SplashButtonClickUrls$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.ads.SplashInfo$SplashButtonClickUrls;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class SplashInfo$PlayablePopupInfo$TypeAdapter extends TypeAdapter	// class@000a95
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       SplashInfo$PlayablePopupInfo$TypeAdapter.c = a.get(SplashInfo$PlayablePopupInfo.class);
    }
    public void SplashInfo$PlayablePopupInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(SplashInfo$SplashButtonClickUrls$TypeAdapter.b);
    }
    public SplashInfo$PlayablePopupInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$PlayablePopupInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$PlayablePopupInfo playablePopu = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return playablePopu;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return playablePopu;
       }else {
          p0.c();
          SplashInfo$PlayablePopupInfo playablePopu1 = new SplashInfo$PlayablePopupInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9681ba46:
                   if (str.equals("buttonTitle")) {
                      i = 0;
                   }
                   break;
                 case 0xa73d051e:
                   if (str.equals("buttonTitleColorHex")) {
                      i = 1;
                   }
                   break;
                 case 0xa81f14ef:
                   if (str.equals("buttonBgColorHex")) {
                      i = 2;
                   }
                   break;
                 case 0xb9440f7a:
                   if (str.equals("buttonClickUrls")) {
                      i = 3;
                   }
                   break;
                 case 0xba334406:
                   if (str.equals("hideAudioButton")) {
                      i = 4;
                   }
                   break;
                 case 0xbd635cc3:
                   if (str.equals("popUpShowType")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   playablePopu1.mButtonTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   playablePopu1.mButtonTitleColorHex = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   playablePopu1.mButtonColorHex = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   playablePopu1.mSplashButtonClickUrls = this.b.read(p0);
                   break;
                 case 4:
                   playablePopu1.mHideAudioButton = KnownTypeAdapters$g.a(p0, playablePopu1.mHideAudioButton);
                   break;
                 case 5:
                   playablePopu1.mPopupShowType = KnownTypeAdapters$k.a(p0, playablePopu1.mPopupShowType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return playablePopu1;
       }
    }
    public void b(b p0,SplashInfo$PlayablePopupInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$PlayablePopupInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hideAudioButton");
          p0.P(p1.mHideAudioButton);
          if (p1.mButtonTitle != null) {
             p0.r("buttonTitle");
             TypeAdapters.A.write(p0, p1.mButtonTitle);
          }
          if (p1.mButtonColorHex != null) {
             p0.r("buttonBgColorHex");
             TypeAdapters.A.write(p0, p1.mButtonColorHex);
          }
          if (p1.mButtonTitleColorHex != null) {
             p0.r("buttonTitleColorHex");
             TypeAdapters.A.write(p0, p1.mButtonTitleColorHex);
          }
          p0.r("popUpShowType");
          p0.K((long)p1.mPopupShowType);
          if (p1.mSplashButtonClickUrls != null) {
             p0.r("buttonClickUrls");
             this.b.write(p0, p1.mSplashButtonClickUrls);
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
