package com.yxcorp.gifshow.corona.common.model.StagFactoryksfeaturesftcoronacoronacommon;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData$TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListResponse;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListResponse$TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta$TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.DetailCaption;
import com.yxcorp.gifshow.corona.common.model.DetailCaption$TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo$TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$OwnerCount;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$OwnerCount$TypeAdapter;

public final class StagFactoryksfeaturesftcoronacoronacommon implements j	// class@001247
{

    public void StagFactoryksfeaturesftcoronacoronacommon(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftcoronacoronacommon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == PadCoronaRankingListTabData.class) {
          return new PadCoronaRankingListTabData$TypeAdapter(p0);
       }
       if (rawType == PadCoronaRankingListResponse.class) {
          return new PadCoronaRankingListResponse$TypeAdapter(p0);
       }
       if (rawType == PadCoronaRankingListMeta.class) {
          return new PadCoronaRankingListMeta$TypeAdapter(p0);
       }
       if (rawType == DetailCaption.class) {
          return new DetailCaption$TypeAdapter(p0);
       }
       if (rawType == CoronaCoverInfo.class) {
          return new CoronaCoverInfo$TypeAdapter(p0);
       }
       if (rawType == CoronaCommonMeta$OwnerCount.class) {
          return new CoronaCommonMeta$OwnerCount$TypeAdapter(p0);
       }
       return null;
    }
}
