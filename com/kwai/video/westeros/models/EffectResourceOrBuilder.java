package com.kwai.video.westeros.models.EffectResourceOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Map;
import com.kwai.video.westeros.models.EffectResourceType;
import com.kwai.video.westeros.models.EffectSlot;

public interface abstract EffectResourceOrBuilder implements MessageLiteOrBuilder	// class@000f3f
{

    boolean containsFaceMagicTypeDescriptionMap(String p0);
    boolean containsRenderContext(String p0);
    boolean getAddWatermark();
    String getAssetDir();
    ByteString getAssetDirBytes();
    String getCustomImage(int p0);
    ByteString getCustomImageBytes(int p0);
    int getCustomImageCount();
    List getCustomImageList();
    int getEffectId();
    boolean getEnableAutoChooseIndexFile();
    boolean getEnableIndexFileCache();
    String getExtractFrameLua();
    ByteString getExtractFrameLuaBytes();
    Map getFaceMagicTypeDescriptionMap();
    int getFaceMagicTypeDescriptionMapCount();
    Map getFaceMagicTypeDescriptionMapMap();
    String getFaceMagicTypeDescriptionMapOrDefault(String p0,String p1);
    String getFaceMagicTypeDescriptionMapOrThrow(String p0);
    String getIndexFile();
    String getIndexFile720();
    ByteString getIndexFile720Bytes();
    ByteString getIndexFileBytes();
    String getLanguageShortName();
    ByteString getLanguageShortNameBytes();
    int getPreviewHeight();
    int getPreviewWidth();
    Map getRenderContext();
    int getRenderContextCount();
    Map getRenderContextMap();
    String getRenderContextOrDefault(String p0,String p1);
    String getRenderContextOrThrow(String p0);
    EffectResourceType getResourceType();
    int getResourceTypeValue();
    EffectSlot getSlot();
    int getSlotValue();
    long getTrackId();
}
