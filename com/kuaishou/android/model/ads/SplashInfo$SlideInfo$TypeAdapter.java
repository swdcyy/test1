package com.kuaishou.android.model.ads.SplashInfo$SlideInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SlideInfo;
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

public final class SplashInfo$SlideInfo$TypeAdapter extends TypeAdapter	// class@000a9f
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$SlideInfo$TypeAdapter.b = a.get(SplashInfo$SlideInfo.class);
    }
    public void SplashInfo$SlideInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$SlideInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$SlideInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$SlideInfo slideInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return slideInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return slideInfo;
       }else {
          p0.c();
          SplashInfo$SlideInfo slideInfo1 = new SplashInfo$SlideInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8230aac8:
                   if (str.equals("convertDistance")) {
                      i = 0;
                   }
                   break;
                 case 0x852f4c18:
                   if (str.equals("subtitle")) {
                      i = 1;
                   }
                   break;
                 case 0x98bb2554:
                   if (str.equals("slidePercent")) {
                      i = 2;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 3;
                   }
                   break;
                 case 0x126c5c24:
                   if (str.equals("clickDisabled")) {
                      i = 4;
                   }
                   break;
                 case 0x3b8434cc:
                   if (str.equals("liveTitle")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   slideInfo1.mConvertDistance = KnownTypeAdapters$k.a(p0, slideInfo1.mConvertDistance);
                   break;
                 case 1:
                   slideInfo1.mSubtitle = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   slideInfo1.mSlidePercent = KnownTypeAdapters$k.a(p0, slideInfo1.mSlidePercent);
                   break;
                 case 3:
                   slideInfo1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   slideInfo1.mClickDisabled = KnownTypeAdapters$g.a(p0, slideInfo1.mClickDisabled);
                   break;
                 case 5:
                   slideInfo1.mLiveTitle = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return slideInfo1;
       }
    }
    public void b(b p0,SplashInfo$SlideInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$SlideInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubtitle != null) {
             p0.r("subtitle");
             TypeAdapters.A.write(p0, p1.mSubtitle);
          }
          p0.r("slidePercent");
          p0.K((long)p1.mSlidePercent);
          p0.r("convertDistance");
          p0.K((long)p1.mConvertDistance);
          if (p1.mLiveTitle != null) {
             p0.r("liveTitle");
             TypeAdapters.A.write(p0, p1.mLiveTitle);
          }
          p0.r("clickDisabled");
          p0.P(p1.mClickDisabled);
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
