package com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LocalLifestylePoi$LifestyleSubTitleInfo$TypeAdapter extends TypeAdapter	// class@000c8d
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LocalLifestylePoi$LifestyleSubTitleInfo$TypeAdapter.c = a.get(LocalLifestylePoi$LifestyleSubTitleInfo.class);
    }
    public void LocalLifestylePoi$LifestyleSubTitleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalLifestylePoi$LifestyleSubTitleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LocalLifestylePoi$LifestyleSubTitleInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xd081adca:
                      if (str.equals("slideIcon")) {
                         i = 0;
                      }
                      break;
                    case 0xd13bcab7:
                      if (str.equals("darkLabelIcon")) {
                         i = 1;
                      }
                      break;
                    case 0xdbc1958d:
                      if (str.equals("labelIcon")) {
                         i = 2;
                      }
                      break;
                    case 0xdd80675e:
                      if (str.equals("showDiscount")) {
                         i = 3;
                      }
                      break;
                    case 0xf7406c88:
                      if (str.equals("discountPrice")) {
                         i = 4;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 5;
                      }
                      break;
                    case 0x20bcc58f:
                      if (str.equals("discountInfo")) {
                         i = 6;
                      }
                      break;
                    case 0x664899c3:
                      if (str.equals("originPrice")) {
                         i = 7;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSlideIcon = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mDarkLabelIcon = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mLabelIcon = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mShowDiscount = KnownTypeAdapters$g.a(p0, obj.mShowDiscount);
                      break;
                    case 4:
                      obj.mDiscountPrice = this.b.read(p0);
                      break;
                    case 5:
                      obj.mInfoTitle = this.b.read(p0);
                      break;
                    case 6:
                      obj.mDiscountInfo = this.b.read(p0);
                      break;
                    case 7:
                      obj.mOriginPrice = this.b.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalLifestylePoi$LifestyleSubTitleInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLabelIcon != null) {
             p0.r("labelIcon");
             TypeAdapters.A.write(p0, p1.mLabelIcon);
          }
          if (p1.mDarkLabelIcon != null) {
             p0.r("darkLabelIcon");
             TypeAdapters.A.write(p0, p1.mDarkLabelIcon);
          }
          if (p1.mSlideIcon != null) {
             p0.r("slideIcon");
             TypeAdapters.A.write(p0, p1.mSlideIcon);
          }
          if (p1.mDiscountInfo != null) {
             p0.r("discountInfo");
             this.b.write(p0, p1.mDiscountInfo);
          }
          if (p1.mOriginPrice != null) {
             p0.r("originPrice");
             this.b.write(p0, p1.mOriginPrice);
          }
          if (p1.mDiscountPrice != null) {
             p0.r("discountPrice");
             this.b.write(p0, p1.mDiscountPrice);
          }
          if (p1.mInfoTitle != null) {
             p0.r("title");
             this.b.write(p0, p1.mInfoTitle);
          }
          p0.r("showDiscount");
          p0.P(p1.mShowDiscount);
          p0.j();
       }
       return;
    }
}
