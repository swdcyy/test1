package com.kuaishou.protobuf.photo.funnel.e;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$CameraPipelineTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordCoreFunctionStat;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PageTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordToEditTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PhotoTimestampStat;

public interface abstract e implements MessageLiteOrBuilder	// class@000e88
{

    float getAudioStannisTimecost();
    RecordBaseStat$CameraPipelineTimestampStat getCameraPipeline();
    RecordBaseStat$RecordCoreFunctionStat getChorusTimecost();
    float getComponentsTimeCost();
    String getEnterShootTimes();
    ByteString getEnterShootTimesBytes();
    boolean getIsRecordSuccess();
    RecordBaseStat$RecordCoreFunctionStat getLipSynchTimecost();
    float getMultipleShotsTimecost();
    RecordBaseStat$RecordCoreFunctionStat getPLCTimecost();
    String getPlugin(int p0);
    ByteString getPluginBytes(int p0);
    int getPluginCount();
    List getPluginList();
    RecordBaseStat$PageTimestampStat getPostVCTimestamp();
    RecordBaseStat$RecordToEditTimestampStat getRecordToEditTimecost();
    RecordBaseStat$RecordCoreFunctionStat getSameFollowTimecost();
    RecordBaseStat$RecordCoreFunctionStat getSameFrameTimecost();
    RecordBaseStat$PhotoTimestampStat getSingleShots();
    float getSingleShotsTimecost();
    float getSwitchCameraTimecost();
    RecordBaseStat$PageTimestampStat getVideorecordVCTimestamp();
    float getWesterosInitTimecost();
    boolean hasCameraPipeline();
    boolean hasChorusTimecost();
    boolean hasLipSynchTimecost();
    boolean hasPLCTimecost();
    boolean hasPostVCTimestamp();
    boolean hasRecordToEditTimecost();
    boolean hasSameFollowTimecost();
    boolean hasSameFrameTimecost();
    boolean hasSingleShots();
    boolean hasVideorecordVCTimestamp();
}
