package com.kuaishou.android.model.mix.CoronaInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoronaInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import com.kuaishou.android.model.mix.QRecoTag$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.Map;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.QRecoTag;
import com.google.gson.stream.b;

public final class CoronaInfo$TypeAdapter extends TypeAdapter	// class@000c11
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       CoronaInfo$TypeAdapter.e = a.get(CoronaInfo.class);
    }
    public void CoronaInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(FeedNegativeFeedback$NegativeReason.class));
       this.c = p0.j(QRecoTag$TypeAdapter.b);
       this.d = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
    }
    public CoronaInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoronaInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoronaInfo uCoronaInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoronaInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoronaInfo;
       }else {
          p0.c();
          CoronaInfo uCoronaInfo1 = new CoronaInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x836c5bf8:
                   if (str.equals("subTitle")) {
                      i = 0;
                   }
                   break;
                 case 0x8ba0a3be:
                   if (str.equals("cardPlayType")) {
                      i = 1;
                   }
                   break;
                 case 0xc09c0eca:
                   if (str.equals("negativeDetailReason")) {
                      i = 2;
                   }
                   break;
                 case 0xc48ff75b:
                   if (str.equals("cardStyleType")) {
                      i = 3;
                   }
                   break;
                 case 0xe356a603:
                   if (str.equals("expParams")) {
                      i = 4;
                   }
                   break;
                 case 0xf3ca161e:
                   if (str.equals("bgColor")) {
                      i = 5;
                   }
                   break;
                 case 0x5a753b7:
                   if (str.equals("cover")) {
                      i = 6;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 7;
                   }
                   break;
                 case 0xe8e79a5:
                   if (str.equals("darkModeBgColor")) {
                      i = 8;
                   }
                   break;
                 case 0x1c362861:
                   if (str.equals("negativeTimestamp")) {
                      i = 9;
                   }
                   break;
                 case 0x7dc2ced9:
                   if (str.equals("negativeReason")) {
                      i = 10;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoronaInfo1.mSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uCoronaInfo1.mCardPlayType = KnownTypeAdapters$k.a(p0, uCoronaInfo1.mCardPlayType);
                   break;
                 case 2:
                   uCoronaInfo1.mNegativeDetailReason = this.c.read(p0);
                   break;
                 case 3:
                   uCoronaInfo1.mCardStyleType = KnownTypeAdapters$k.a(p0, uCoronaInfo1.mCardStyleType);
                   break;
                 case 4:
                   uCoronaInfo1.mExpParams = this.d.read(p0);
                   break;
                 case 5:
                   uCoronaInfo1.mBgColor = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCoronaInfo1.mCover = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uCoronaInfo1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uCoronaInfo1.mDarkBgColor = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uCoronaInfo1.mNegativeTimestamp = KnownTypeAdapters$n.a(p0, uCoronaInfo1.mNegativeTimestamp);
                   break;
                 case 10:
                   uCoronaInfo1.mNegativeReason = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoronaInfo1;
       }
    }
    public void b(b p0,CoronaInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("cardStyleType");
          p0.K((long)p1.mCardStyleType);
          p0.r("cardPlayType");
          p0.K((long)p1.mCardPlayType);
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mCover != null) {
             p0.r("cover");
             TypeAdapters.A.write(p0, p1.mCover);
          }
          if (p1.mNegativeReason != null) {
             p0.r("negativeReason");
             this.b.write(p0, p1.mNegativeReason);
          }
          if (p1.mNegativeDetailReason != null) {
             p0.r("negativeDetailReason");
             this.c.write(p0, p1.mNegativeDetailReason);
          }
          p0.r("negativeTimestamp");
          p0.K(p1.mNegativeTimestamp);
          if (p1.mBgColor != null) {
             p0.r("bgColor");
             TypeAdapters.A.write(p0, p1.mBgColor);
          }
          if (p1.mDarkBgColor != null) {
             p0.r("darkModeBgColor");
             TypeAdapters.A.write(p0, p1.mDarkBgColor);
          }
          if (p1.mExpParams != null) {
             p0.r("expParams");
             this.d.write(p0, p1.mExpParams);
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
