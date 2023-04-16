package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$b;
import com.kuaishou.protobuf.photo.funnel.e;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$CameraPipelineTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordCoreFunctionStat;
import com.google.protobuf.ByteString;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Collections;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PageTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordToEditTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PhotoTimestampStat;

public final class RecordBaseStat$b extends GeneratedMessageLite$Builder implements e	// class@000e56
{

    public void RecordBaseStat$b(){
       super(RecordBaseStat.DEFAULT_INSTANCE);
    }
    public void RecordBaseStat$b(RecordBaseStat$a p0){
       super(RecordBaseStat.DEFAULT_INSTANCE);
    }
    public float getAudioStannisTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getAudioStannisTimecost();
    }
    public RecordBaseStat$CameraPipelineTimestampStat getCameraPipeline(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getCameraPipeline();
    }
    public RecordBaseStat$RecordCoreFunctionStat getChorusTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getChorusTimecost();
    }
    public float getComponentsTimeCost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getComponentsTimeCost();
    }
    public String getEnterShootTimes(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getEnterShootTimes();
    }
    public ByteString getEnterShootTimesBytes(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getEnterShootTimesBytes();
    }
    public boolean getIsRecordSuccess(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getIsRecordSuccess();
    }
    public RecordBaseStat$RecordCoreFunctionStat getLipSynchTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLipSynchTimecost();
    }
    public float getMultipleShotsTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getMultipleShotsTimecost();
    }
    public RecordBaseStat$RecordCoreFunctionStat getPLCTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPLCTimecost();
    }
    public String getPlugin(int p0){
       if (PatchProxy.isSupport(RecordBaseStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RecordBaseStat$b.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getPlugin(p0);
    }
    public ByteString getPluginBytes(int p0){
       if (PatchProxy.isSupport(RecordBaseStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RecordBaseStat$b.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getPluginBytes(p0);
    }
    public int getPluginCount(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getPluginCount();
    }
    public List getPluginList(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getPluginList());
    }
    public RecordBaseStat$PageTimestampStat getPostVCTimestamp(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPostVCTimestamp();
    }
    public RecordBaseStat$RecordToEditTimestampStat getRecordToEditTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRecordToEditTimecost();
    }
    public RecordBaseStat$RecordCoreFunctionStat getSameFollowTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getSameFollowTimecost();
    }
    public RecordBaseStat$RecordCoreFunctionStat getSameFrameTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getSameFrameTimecost();
    }
    public RecordBaseStat$PhotoTimestampStat getSingleShots(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getSingleShots();
    }
    public float getSingleShotsTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getSingleShotsTimecost();
    }
    public float getSwitchCameraTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getSwitchCameraTimecost();
    }
    public RecordBaseStat$PageTimestampStat getVideorecordVCTimestamp(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getVideorecordVCTimestamp();
    }
    public float getWesterosInitTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getWesterosInitTimecost();
    }
    public boolean hasCameraPipeline(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasCameraPipeline();
    }
    public boolean hasChorusTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasChorusTimecost();
    }
    public boolean hasLipSynchTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasLipSynchTimecost();
    }
    public boolean hasPLCTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasPLCTimecost();
    }
    public boolean hasPostVCTimestamp(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasPostVCTimestamp();
    }
    public boolean hasRecordToEditTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasRecordToEditTimecost();
    }
    public boolean hasSameFollowTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasSameFollowTimecost();
    }
    public boolean hasSameFrameTimecost(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasSameFrameTimecost();
    }
    public boolean hasSingleShots(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasSingleShots();
    }
    public boolean hasVideorecordVCTimestamp(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasVideorecordVCTimestamp();
    }
}
