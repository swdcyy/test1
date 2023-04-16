package com.kwai.components.nearbymodel.model.StagFactorykscomponentsnearbymodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$TypeAdapter;
import com.kwai.components.nearbymodel.model.NearbyLocalLifePoiV2;
import com.kwai.components.nearbymodel.model.NearbyLocalLifePoiV2$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$IconUrl;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$IconUrl$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$RightBottomInfo;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$RightBottomInfo$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfoInner;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfoInner$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfo;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfo$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ExtParams;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ExtParams$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$GradientColorModel;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$GradientColorModel$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateDarkLightModel;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$LocalCoverAggregateTagInfo;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ChatRoomSubItem;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ChatRoomSubItem$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateSubFeedItem;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateSubFeedItem$TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateMeta;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateMeta$TypeAdapter;
import com.kwai.components.nearbymodel.model.BoundaryMeta;
import com.kwai.components.nearbymodel.model.BoundaryMeta$TypeAdapter;

public final class StagFactorykscomponentsnearbymodel implements j	// class@000cc2
{

    public void StagFactorykscomponentsnearbymodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsnearbymodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == NearbyMapFeed$RoleInfo.class) {
          return new NearbyMapFeed$RoleInfo$TypeAdapter(p0);
       }
       if (rawType == NearbyLocalLifePoiV2.class) {
          return new NearbyLocalLifePoiV2$TypeAdapter(p0);
       }
       if (rawType == LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo.class) {
          return new LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter(p0);
       }
       if (rawType == LocalLifestylePoi$LifestyleSubTitleInfo.class) {
          return new LocalLifestylePoi$LifestyleSubTitleInfo$TypeAdapter(p0);
       }
       if (rawType == LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo.class) {
          return new LocalLifestylePoi$LifeStyleAdditionalTitleTextInfo$TypeAdapter(p0);
       }
       if (rawType == LocalLifestylePoi.class) {
          return new LocalLifestylePoi$TypeAdapter(p0);
       }
       if (rawType == LocalFuncTemplateFeed$IconUrl.class) {
          return new LocalFuncTemplateFeed$IconUrl$TypeAdapter(p0);
       }
       if (rawType == LocalFuncTemplateFeed$RightBottomInfo.class) {
          return new LocalFuncTemplateFeed$RightBottomInfo$TypeAdapter(p0);
       }
       if (rawType == LocalFuncTemplateFeed$ContentInfoInner.class) {
          return new LocalFuncTemplateFeed$ContentInfoInner$TypeAdapter(p0);
       }
       if (rawType == LocalFuncTemplateFeed$ContentInfo.class) {
          return new LocalFuncTemplateFeed$ContentInfo$TypeAdapter(p0);
       }
       if (rawType == LocalCoverAggregateFeed$ExtParams.class) {
          return new LocalCoverAggregateFeed$ExtParams$TypeAdapter(p0);
       }
       if (rawType == LocalCoverAggregateFeed$GradientColorModel.class) {
          return new LocalCoverAggregateFeed$GradientColorModel$TypeAdapter(p0);
       }
       if (rawType == LocalCoverAggregateFeed$CoverAggregateDarkLightModel.class) {
          return new LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter(p0);
       }
       if (rawType == LocalCoverAggregateFeed$LocalCoverAggregateTagInfo.class) {
          return new LocalCoverAggregateFeed$LocalCoverAggregateTagInfo$TypeAdapter(p0);
       }
       if (rawType == LocalCoverAggregateFeed$ChatRoomSubItem.class) {
          return new LocalCoverAggregateFeed$ChatRoomSubItem$TypeAdapter(p0);
       }
       if (rawType == LocalCoverAggregateFeed$CoverAggregateSubFeedItem.class) {
          return new LocalCoverAggregateFeed$CoverAggregateSubFeedItem$TypeAdapter(p0);
       }
       if (rawType == LocalCoverAggregateFeed$CoverAggregateMeta.class) {
          return new LocalCoverAggregateFeed$CoverAggregateMeta$TypeAdapter(p0);
       }
       if (rawType == BoundaryMeta.class) {
          return new BoundaryMeta$TypeAdapter(p0);
       }
       return null;
    }
}
