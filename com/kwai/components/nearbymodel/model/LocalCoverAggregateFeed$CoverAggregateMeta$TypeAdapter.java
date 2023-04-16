package com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$GradientColorModel$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateSubFeedItem$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ChatRoomSubItem$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ExtParams$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.Map;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$GradientColorModel;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ExtParams;
import java.util.List;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$LocalCoverAggregateTagInfo;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateDarkLightModel;
import com.google.gson.stream.b;

public final class LocalCoverAggregateFeed$CoverAggregateMeta$TypeAdapter extends TypeAdapter	// class@000c75
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public final TypeAdapter i;
    public final TypeAdapter j;
    public static final a k;

    static {
       LocalCoverAggregateFeed$CoverAggregateMeta$TypeAdapter.k = a.get(LocalCoverAggregateFeed$CoverAggregateMeta.class);
    }
    public void LocalCoverAggregateFeed$CoverAggregateMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter.b);
       this.c = p0.j(LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter.c);
       this.d = p0.j(LocalCoverAggregateFeed$GradientColorModel$TypeAdapter.b);
       TypeAdapter typeAdapter = p0.j(LocalCoverAggregateFeed$CoverAggregateSubFeedItem$TypeAdapter.c);
       this.e = typeAdapter;
       this.f = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(LocalCoverAggregateFeed$ChatRoomSubItem$TypeAdapter.c);
       this.g = typeAdapter;
       this.h = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.i = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
       this.j = p0.j(LocalCoverAggregateFeed$ExtParams$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalCoverAggregateFeed$CoverAggregateMeta$TypeAdapter.class, "2");
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
             obj = new LocalCoverAggregateFeed$CoverAggregateMeta();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x836c5bf8:
                      if (str.equals("subTitle")) {
                         i = 0;
                      }
                      break;
                    case 0x8d2f34be:
                      if (str.equals("titleIconUrl")) {
                         i = 1;
                      }
                      break;
                    case 0x8f96eb51:
                      if (str.equals("bgImgUrl")) {
                         i = 2;
                      }
                      break;
                    case 0x9089e622:
                      if (str.equals("titleTag")) {
                         i = 3;
                      }
                      break;
                    case 0x9ccfe4c2:
                      if (str.equals("feedItems")) {
                         i = 4;
                      }
                      break;
                    case 0xaf62972d:
                      if (str.equals("chatRoomItems")) {
                         i = 5;
                      }
                      break;
                    case 0xb6ef9307:
                      if (str.equals("extParams")) {
                         i = 6;
                      }
                      break;
                    case 0xe8ce5353:
                      if (str.equals("contentType")) {
                         i = 7;
                      }
                      break;
                    case 0xf3ca161e:
                      if (str.equals("bgColor")) {
                         i = 8;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 9;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 10;
                      }
                      break;
                    case 0x462fbced:
                      if (str.equals("itemType")) {
                         i = 11;
                      }
                      break;
                    case 0x6e3305ea:
                      if (str.equals("logParams")) {
                         i = 12;
                      }
                      break;
                    case 0x757287db:
                      if (str.equals("tagBackgroundColor")) {
                         i = 13;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSubTitle = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mTitleIconInfo = this.b.read(p0);
                      break;
                    case 2:
                      obj.mBgImageInfo = this.b.read(p0);
                      break;
                    case 3:
                      obj.mTitleLocalCoverAggregateTagInfo = this.c.read(p0);
                      break;
                    case 4:
                      obj.mSubCoverAggregateSubFeedItems = this.f.read(p0);
                      break;
                    case 5:
                      obj.mChatRoomSubItems = this.h.read(p0);
                      break;
                    case 6:
                      obj.mExtParams = this.j.read(p0);
                      break;
                    case 7:
                      obj.mContentType = KnownTypeAdapters$k.a(p0, obj.mContentType);
                      break;
                    case 8:
                      obj.mBgColorInfo = this.d.read(p0);
                      break;
                    case 9:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
                      break;
                    case 11:
                      obj.mItemType = KnownTypeAdapters$k.a(p0, obj.mItemType);
                      break;
                    case 12:
                      obj.mLogParams = this.i.read(p0);
                      break;
                    case 13:
                      obj.mTagBackgroundColor = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalCoverAggregateFeed$CoverAggregateMeta$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("contentType");
          p0.K((long)p1.mContentType);
          if (p1.mBgImageInfo != null) {
             p0.r("bgImgUrl");
             this.b.write(p0, p1.mBgImageInfo);
          }
          if (p1.mTitleIconInfo != null) {
             p0.r("titleIconUrl");
             this.b.write(p0, p1.mTitleIconInfo);
          }
          if (p1.mTitleLocalCoverAggregateTagInfo != null) {
             p0.r("titleTag");
             this.c.write(p0, p1.mTitleLocalCoverAggregateTagInfo);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mTagBackgroundColor != null) {
             p0.r("tagBackgroundColor");
             TypeAdapters.A.write(p0, p1.mTagBackgroundColor);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          p0.r("itemType");
          p0.K((long)p1.mItemType);
          if (p1.mBgColorInfo != null) {
             p0.r("bgColor");
             this.d.write(p0, p1.mBgColorInfo);
          }
          if (p1.mSubCoverAggregateSubFeedItems != null) {
             p0.r("feedItems");
             this.f.write(p0, p1.mSubCoverAggregateSubFeedItems);
          }
          if (p1.mChatRoomSubItems != null) {
             p0.r("chatRoomItems");
             this.h.write(p0, p1.mChatRoomSubItems);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          if (p1.mLogParams != null) {
             p0.r("logParams");
             this.i.write(p0, p1.mLogParams);
          }
          if (p1.mExtParams != null) {
             p0.r("extParams");
             this.j.write(p0, p1.mExtParams);
          }
          p0.j();
       }
       return;
    }
}
