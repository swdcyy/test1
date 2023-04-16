package com.kuaishou.android.model.feed.LiveCoverAnnex$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.feed.LiveCoverAnnex;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.feed.LiveComment$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.feed.LiveInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.feed.LiveCoverAnnex$TypeAdapter$a;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import java.util.Map;
import com.google.gson.stream.b;

public final class LiveCoverAnnex$TypeAdapter extends TypeAdapter	// class@000b02
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public static final a i;

    static {
       LiveCoverAnnex$TypeAdapter.i = a.get(LiveCoverAnnex.class);
    }
    public void LiveCoverAnnex$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(LiveComment$TypeAdapter.c);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(LiveInfo$TypeAdapter.b);
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter1 = p0.j(a.get(CDNUrl.class));
       this.f = typeAdapter1;
       KnownTypeAdapters$ArrayTypeAdapter uArrayTypeAd = new KnownTypeAdapters$ArrayTypeAdapter(typeAdapter1, new LiveCoverAnnex$TypeAdapter$a(this));
       this.g = new KnownTypeAdapters$ListTypeAdapter(uArrayTypeAd, new KnownTypeAdapters$d());
       this.h = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
    }
    public LiveCoverAnnex a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCoverAnnex$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveCoverAnnex liveCoverAnn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveCoverAnn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveCoverAnn;
       }else {
          p0.c();
          LiveCoverAnnex liveCoverAnn1 = new LiveCoverAnnex();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x82b4805e:
                   if (str.equals("entityId")) {
                      i = 0;
                   }
                   break;
                 case 0xa1151624:
                   if (str.equals("commodityShowType")) {
                      i = 1;
                   }
                   break;
                 case 0xab2f7e36:
                   if (str.equals("action")) {
                      i = 2;
                   }
                   break;
                 case 0xac38bde2:
                   if (str.equals("commodityCount")) {
                      i = 3;
                   }
                   break;
                 case 0xac8c162e:
                   if (str.equals("commodityImage")) {
                      i = 4;
                   }
                   break;
                 case 0xacf11e1c:
                   if (str.equals("commodityPrice")) {
                      i = 5;
                   }
                   break;
                 case 0xad258f2b:
                   if (str.equals("commodityTitle")) {
                      i = 6;
                   }
                   break;
                 case 0xb328ac3d:
                   if (str.equals("expTag")) {
                      i = 7;
                   }
                   break;
                 case 0xb52fc261:
                   if (str.equals("jumpUrl")) {
                      i = 8;
                   }
                   break;
                 case 0xd404b4fd:
                   if (str.equals("iconUrls")) {
                      i = 9;
                   }
                   break;
                 case 0xdc17ddf4:
                   if (str.equals("comments")) {
                      i = 10;
                   }
                   break;
                 case 0xf0e1e4de:
                   if (str.equals("extraInfo")) {
                      i = 11;
                   }
                   break;
                 case 0xff82766a:
                   if (str.equals("cardType")) {
                      i = 12;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 13;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 14;
                   }
                   break;
                 case 0x3aeb43f9:
                   if (str.equals("liveInfos")) {
                      i = 15;
                   }
                   break;
                 case 0x6e617690:
                   if (str.equals("actionType")) {
                      i = 16;
                   }
                   break;
                 case 0x7cc30928:
                   if (str.equals("commodityId")) {
                      i = 17;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   liveCoverAnn1.mEntityId = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   liveCoverAnn1.mCommodityShowType = KnownTypeAdapters$k.a(p0, liveCoverAnn1.mCommodityShowType);
                   break;
                 case 2:
                   liveCoverAnn1.mAction = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   liveCoverAnn1.mCommodityCount = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   liveCoverAnn1.mCommodityImage = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   liveCoverAnn1.mCommodityPrice = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   liveCoverAnn1.mCommodityTitle = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   liveCoverAnn1.mExpTag = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   liveCoverAnn1.mJumpUrl = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   liveCoverAnn1.mIconUrls = this.g.read(p0);
                   break;
                 case 10:
                   liveCoverAnn1.mComments = this.c.read(p0);
                   break;
                 case 11:
                   liveCoverAnn1.mExtraInfo = this.h.read(p0);
                   break;
                 case 12:
                   liveCoverAnn1.mCardType = KnownTypeAdapters$k.a(p0, liveCoverAnn1.mCardType);
                   break;
                 case 13:
                   liveCoverAnn1.mType = KnownTypeAdapters$k.a(p0, liveCoverAnn1.mType);
                   break;
                 case 14:
                   liveCoverAnn1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 15:
                   liveCoverAnn1.mLiveInfos = this.e.read(p0);
                   break;
                 case 16:
                   liveCoverAnn1.mActionType = KnownTypeAdapters$k.a(p0, liveCoverAnn1.mActionType);
                   break;
                 case 17:
                   liveCoverAnn1.mCommodityId = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return liveCoverAnn1;
       }
    }
    public void b(b p0,LiveCoverAnnex p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCoverAnnex$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          p0.r("commodityShowType");
          p0.K((long)p1.mCommodityShowType);
          if (p1.mComments != null) {
             p0.r("comments");
             this.c.write(p0, p1.mComments);
          }
          if (p1.mLiveInfos != null) {
             p0.r("liveInfos");
             this.e.write(p0, p1.mLiveInfos);
          }
          if (p1.mCommodityId != null) {
             p0.r("commodityId");
             TypeAdapters.A.write(p0, p1.mCommodityId);
          }
          if (p1.mCommodityTitle != null) {
             p0.r("commodityTitle");
             TypeAdapters.A.write(p0, p1.mCommodityTitle);
          }
          if (p1.mCommodityCount != null) {
             p0.r("commodityCount");
             TypeAdapters.A.write(p0, p1.mCommodityCount);
          }
          if (p1.mCommodityImage != null) {
             p0.r("commodityImage");
             TypeAdapters.A.write(p0, p1.mCommodityImage);
          }
          if (p1.mCommodityPrice != null) {
             p0.r("commodityPrice");
             TypeAdapters.A.write(p0, p1.mCommodityPrice);
          }
          if (p1.mExpTag != null) {
             p0.r("expTag");
             TypeAdapters.A.write(p0, p1.mExpTag);
          }
          p0.r("cardType");
          p0.K((long)p1.mCardType);
          if (p1.mEntityId != null) {
             p0.r("entityId");
             TypeAdapters.A.write(p0, p1.mEntityId);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mAction != null) {
             p0.r("action");
             TypeAdapters.A.write(p0, p1.mAction);
          }
          p0.r("actionType");
          p0.K((long)p1.mActionType);
          if (p1.mIconUrls != null) {
             p0.r("iconUrls");
             this.g.write(p0, p1.mIconUrls);
          }
          if (p1.mJumpUrl != null) {
             p0.r("jumpUrl");
             TypeAdapters.A.write(p0, p1.mJumpUrl);
          }
          if (p1.mExtraInfo != null) {
             p0.r("extraInfo");
             this.h.write(p0, p1.mExtraInfo);
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
