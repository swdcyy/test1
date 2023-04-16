package com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import java.lang.String;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import java.util.List;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;

public interface abstract EditorSdk2MvAsset	// class@001abc
{

    int clipBodyType();
    boolean disableReplace();
    String getAssetPath();
    String getAssetTag();
    String getAssetType();
    String getFaceBlendPath();
    Minecraft$WesterosFaceMagicParam getFaceMagicParam();
    String getGroupId();
    int getHeight();
    Minecraft$TimeMapParams getInsertFrameParam();
    double getMinClipDuration();
    String getPicture();
    String getRefId();
    String getReturnMediaType();
    String getServiceType();
    List getSourceList();
    String getTextStyleId();
    double getTimeStamp();
    EditorSdk2$TimeRange getVisibleTimeRange();
    List getVisibleTimeRanges();
    int getWidth();
    boolean isNeedReverse();
    boolean isReplaceable();
    boolean isRestoreAlpha();
    boolean requireBodyMatting();
    boolean requireClipBody();
    boolean requireClipFace();
    boolean requireClipHead();
    boolean requireFace();
    boolean requireFaceBlend();
    boolean requireFaceMatting();
    boolean requireFacialReco();
    boolean requireHeadMatting();
    boolean requireOriginAudio();
    long selectFrameTime();
    String serviceAction();
}
