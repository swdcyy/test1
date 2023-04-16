package com.kwai.components.feedmodel.StagFactorykscomponentsfeedmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.components.feedmodel.SummaryInfo;
import com.kwai.components.feedmodel.SummaryInfo$TypeAdapter;
import com.kwai.components.feedmodel.SearchAiScriptInfo;
import com.kwai.components.feedmodel.SearchAiScriptInfo$TypeAdapter;
import com.kwai.components.feedmodel.RewardPhotoInfo$RewardBubbleInfo;
import com.kwai.components.feedmodel.RewardPhotoInfo$RewardBubbleInfo$TypeAdapter;
import com.kwai.components.feedmodel.RewardPhotoInfo;
import com.kwai.components.feedmodel.RewardPhotoInfo$TypeAdapter;
import com.kwai.components.feedmodel.ProgressHighLightInfo;
import com.kwai.components.feedmodel.ProgressHighLightInfo$TypeAdapter;
import com.kwai.components.feedmodel.PhotoJudgementStatusInfo;
import com.kwai.components.feedmodel.PhotoJudgementStatusInfo$TypeAdapter;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo$TypeAdapter;
import com.kwai.components.feedmodel.OperationBarInfo;
import com.kwai.components.feedmodel.OperationBarInfo$TypeAdapter;
import com.kwai.components.feedmodel.KwaiCoinTaskInfo;
import com.kwai.components.feedmodel.KwaiCoinTaskInfo$TypeAdapter;
import com.kwai.components.feedmodel.HotSpotInfo;
import com.kwai.components.feedmodel.HotSpotInfo$TypeAdapter;
import com.kwai.components.feedmodel.BottomEntryInfo;
import com.kwai.components.feedmodel.BottomEntryInfo$TypeAdapter;
import com.kwai.components.feedmodel.AiScriptSection;
import com.kwai.components.feedmodel.AiScriptSection$TypeAdapter;

public final class StagFactorykscomponentsfeedmodel implements j	// class@000c40
{

    public void StagFactorykscomponentsfeedmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsfeedmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == SummaryInfo.class) {
          return new SummaryInfo$TypeAdapter(p0);
       }
       if (rawType == SearchAiScriptInfo.class) {
          return new SearchAiScriptInfo$TypeAdapter(p0);
       }
       if (rawType == RewardPhotoInfo$RewardBubbleInfo.class) {
          return new RewardPhotoInfo$RewardBubbleInfo$TypeAdapter(p0);
       }
       if (rawType == RewardPhotoInfo.class) {
          return new RewardPhotoInfo$TypeAdapter(p0);
       }
       if (rawType == ProgressHighLightInfo.class) {
          return new ProgressHighLightInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoJudgementStatusInfo.class) {
          return new PhotoJudgementStatusInfo$TypeAdapter(p0);
       }
       if (rawType == OperationBarInfo$GeneralInfo.class) {
          return new OperationBarInfo$GeneralInfo$TypeAdapter(p0);
       }
       if (rawType == OperationBarInfo.class) {
          return new OperationBarInfo$TypeAdapter(p0);
       }
       if (rawType == KwaiCoinTaskInfo.class) {
          return new KwaiCoinTaskInfo$TypeAdapter(p0);
       }
       if (rawType == HotSpotInfo.class) {
          return new HotSpotInfo$TypeAdapter(p0);
       }
       if (rawType == BottomEntryInfo.class) {
          return new BottomEntryInfo$TypeAdapter(p0);
       }
       if (rawType == AiScriptSection.class) {
          return new AiScriptSection$TypeAdapter(p0);
       }
       return null;
    }
}
