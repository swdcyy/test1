package com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateSubFeedItem$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateSubFeedItem;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$LocalCoverAggregateTagInfo;
import com.google.gson.stream.b;

public final class LocalCoverAggregateFeed$CoverAggregateSubFeedItem$TypeAdapter extends TypeAdapter	// class@000c77
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LocalCoverAggregateFeed$CoverAggregateSubFeedItem$TypeAdapter.c = a.get(LocalCoverAggregateFeed$CoverAggregateSubFeedItem.class);
    }
    public void LocalCoverAggregateFeed$CoverAggregateSubFeedItem$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter.c);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalCoverAggregateFeed$CoverAggregateSubFeedItem$TypeAdapter.class, "2");
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
             obj = new LocalCoverAggregateFeed$CoverAggregateSubFeedItem();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x842ddd9a:
                      if (str.equals("timeText")) {
                         i = 0;
                      }
                      break;
                    case 0x9089e622:
                      if (str.equals("titleTag")) {
                         i = 1;
                      }
                      break;
                    case 0xeb084a38:
                      if (str.equals("coverUrl")) {
                         i = 2;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 3;
                      }
                      break;
                    case 0x6b49568:
                      if (str.equals("indexTag")) {
                         i = 4;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mTimeText = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mSubFeedTitleLocalCoverAggregateTagInfo = this.b.read(p0);
                      break;
                    case 2:
                      obj.mCoverUrl = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mIndexTagIconUrl = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalCoverAggregateFeed$CoverAggregateSubFeedItem$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mCoverUrl != null) {
             p0.r("coverUrl");
             TypeAdapters.A.write(p0, p1.mCoverUrl);
          }
          if (p1.mIndexTagIconUrl != null) {
             p0.r("indexTag");
             TypeAdapters.A.write(p0, p1.mIndexTagIconUrl);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubFeedTitleLocalCoverAggregateTagInfo != null) {
             p0.r("titleTag");
             this.b.write(p0, p1.mSubFeedTitleLocalCoverAggregateTagInfo);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          if (p1.mTimeText != null) {
             p0.r("timeText");
             TypeAdapters.A.write(p0, p1.mTimeText);
          }
          p0.j();
       }
       return;
    }
}
