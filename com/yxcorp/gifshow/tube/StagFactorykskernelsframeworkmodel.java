package com.yxcorp.gifshow.tube.StagFactorykskernelsframeworkmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.tube.TubeRankInfo;
import com.yxcorp.gifshow.tube.TubeRankInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.TubePurchaseInfo;
import com.yxcorp.gifshow.tube.TubePurchaseInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.TubeInfo;
import com.yxcorp.gifshow.tube.TubeInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.TubeEntryInfo;
import com.yxcorp.gifshow.tube.TubeEntryInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.TubeDateInfo;
import com.yxcorp.gifshow.tube.TubeDateInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.TubeChannelInfo;
import com.yxcorp.gifshow.tube.TubeChannelInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import com.yxcorp.gifshow.tube.StandardSerialInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.SerialPhoto;
import com.yxcorp.gifshow.tube.SerialPhoto$TypeAdapter;
import com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner;
import com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner$TypeAdapter;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount$TypeAdapter;
import com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription;
import com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription$TypeAdapter;
import com.yxcorp.gifshow.tube.SerialInfo;
import com.yxcorp.gifshow.tube.SerialInfo$TypeAdapter;

public final class StagFactorykskernelsframeworkmodel implements j	// class@001df5
{

    public void StagFactorykskernelsframeworkmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworkmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == TubeRankInfo.class) {
          return new TubeRankInfo$TypeAdapter(p0);
       }
       if (rawType == TubePurchaseInfo.class) {
          return new TubePurchaseInfo$TypeAdapter(p0);
       }
       if (rawType == TubeInfo.class) {
          return new TubeInfo$TypeAdapter(p0);
       }
       if (rawType == TubeEpisodeInfo.class) {
          return new TubeEpisodeInfo$TypeAdapter(p0);
       }
       if (rawType == TubeEntryInfo.class) {
          return new TubeEntryInfo$TypeAdapter(p0);
       }
       if (rawType == TubeDateInfo.class) {
          return new TubeDateInfo$TypeAdapter(p0);
       }
       if (rawType == TubeChannelInfo.class) {
          return new TubeChannelInfo$TypeAdapter(p0);
       }
       if (rawType == StandardSerialInfo.class) {
          return new StandardSerialInfo$TypeAdapter(p0);
       }
       if (rawType == SerialPhoto.class) {
          return new SerialPhoto$TypeAdapter(p0);
       }
       if (rawType == SerialInfo$RightTopCorner.class) {
          return new SerialInfo$RightTopCorner$TypeAdapter(p0);
       }
       if (rawType == SerialInfo$ClusterSerialCount.class) {
          return new SerialInfo$ClusterSerialCount$TypeAdapter(p0);
       }
       if (rawType == SerialInfo$SplitEntranceDescription.class) {
          return new SerialInfo$SplitEntranceDescription$TypeAdapter(p0);
       }
       if (rawType == SerialInfo.class) {
          return new SerialInfo$TypeAdapter(p0);
       }
       return null;
    }
}
