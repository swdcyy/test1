package com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.EffectResourceOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.EffectResource$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.LinkedHashMap;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.EffectResource$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kwai.video.westeros.models.EffectResource$FaceMagicTypeDescriptionMapDefaultEntryHolder;
import com.kwai.video.westeros.models.EffectResource$RenderContextDefaultEntryHolder;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.lang.IllegalArgumentException;
import com.kwai.video.westeros.models.EffectResourceType;
import com.kwai.video.westeros.models.EffectSlot;

public final class EffectResource extends GeneratedMessageLite implements EffectResourceOrBuilder	// class@000f3e
{
    public boolean addWatermark_;
    public String assetDir_;
    public Internal$ProtobufList customImage_;
    public int effectId_;
    public boolean enableAutoChooseIndexFile_;
    public boolean enableIndexFileCache_;
    public String extractFrameLua_;
    public MapFieldLite faceMagicTypeDescriptionMap_;
    public String indexFile720_;
    public String indexFile_;
    public String languageShortName_;
    public int previewHeight_;
    public int previewWidth_;
    public MapFieldLite renderContext_;
    public int resourceType_;
    public int slot_;
    public long trackId_;
    public static final EffectResource DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EffectResource uEffectResou = new EffectResource();
       EffectResource.DEFAULT_INSTANCE = uEffectResou;
       GeneratedMessageLite.registerDefaultInstance(EffectResource.class, uEffectResou);
    }
    public void EffectResource(){
       super();
       this.faceMagicTypeDescriptionMap_ = MapFieldLite.emptyMapField();
       this.renderContext_ = MapFieldLite.emptyMapField();
       this.assetDir_ = "";
       this.indexFile_ = "";
       this.indexFile720_ = "";
       this.customImage_ = GeneratedMessageLite.emptyProtobufList();
       this.extractFrameLua_ = "";
       this.languageShortName_ = "";
    }
    public static EffectResource getDefaultInstance(){
       return EffectResource.DEFAULT_INSTANCE;
    }
    public static EffectResource$Builder newBuilder(){
       return EffectResource.DEFAULT_INSTANCE.createBuilder();
    }
    public static EffectResource$Builder newBuilder(EffectResource p0){
       return EffectResource.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EffectResource parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EffectResource.DEFAULT_INSTANCE, p0);
    }
    public static EffectResource parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EffectResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectResource parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EffectResource.DEFAULT_INSTANCE, p0);
    }
    public static EffectResource parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectResource parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EffectResource.DEFAULT_INSTANCE, p0);
    }
    public static EffectResource parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectResource parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EffectResource.DEFAULT_INSTANCE, p0);
    }
    public static EffectResource parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectResource parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EffectResource.DEFAULT_INSTANCE, p0);
    }
    public static EffectResource parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectResource parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EffectResource.DEFAULT_INSTANCE, p0);
    }
    public static EffectResource parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectResource.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EffectResource.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllCustomImage(Iterable p0){
       this.ensureCustomImageIsMutable();
       AbstractMessageLite.addAll(p0, this.customImage_);
    }
    public void addCustomImage(String p0){
       Objects.requireNonNull(p0);
       this.ensureCustomImageIsMutable();
       this.customImage_.add(p0);
    }
    public void addCustomImageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureCustomImageIsMutable();
       this.customImage_.add(p0.toStringUtf8());
    }
    public void clearAddWatermark(){
       this.addWatermark_ = false;
    }
    public void clearAssetDir(){
       this.assetDir_ = EffectResource.getDefaultInstance().getAssetDir();
    }
    public void clearCustomImage(){
       this.customImage_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearEffectId(){
       this.effectId_ = 0;
    }
    public void clearEnableAutoChooseIndexFile(){
       this.enableAutoChooseIndexFile_ = false;
    }
    public void clearEnableIndexFileCache(){
       this.enableIndexFileCache_ = false;
    }
    public void clearExtractFrameLua(){
       this.extractFrameLua_ = EffectResource.getDefaultInstance().getExtractFrameLua();
    }
    public void clearIndexFile(){
       this.indexFile_ = EffectResource.getDefaultInstance().getIndexFile();
    }
    public void clearIndexFile720(){
       this.indexFile720_ = EffectResource.getDefaultInstance().getIndexFile720();
    }
    public void clearLanguageShortName(){
       this.languageShortName_ = EffectResource.getDefaultInstance().getLanguageShortName();
    }
    public void clearPreviewHeight(){
       this.previewHeight_ = 0;
    }
    public void clearPreviewWidth(){
       this.previewWidth_ = 0;
    }
    public void clearResourceType(){
       this.resourceType_ = 0;
    }
    public void clearSlot(){
       this.slot_ = 0;
    }
    public void clearTrackId(){
       this.trackId_ = 0;
    }
    public boolean containsFaceMagicTypeDescriptionMap(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetFaceMagicTypeDescriptionMap().containsKey(p0);
    }
    public boolean containsRenderContext(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetRenderContext().containsKey(p0);
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EffectResource$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EffectResource();
           case 2:
             return new EffectResource$Builder(p2);
           case 3:
             Object[] objArray = new Object[19];
             objArray[0] = "assetDir_";
             objArray[i] = "indexFile_";
             objArray[2] = "indexFile720_";
             objArray[3] = "effectId_";
             objArray[4] = "enableAutoChooseIndexFile_";
             objArray[5] = "enableIndexFileCache_";
             objArray[6] = "previewWidth_";
             objArray[7] = "previewHeight_";
             objArray[8] = "addWatermark_";
             objArray[9] = "customImage_";
             objArray[10] = "faceMagicTypeDescriptionMap_";
             objArray[11] = EffectResource$FaceMagicTypeDescriptionMapDefaultEntryHolder.defaultEntry;
             objArray[12] = "resourceType_";
             objArray[13] = "extractFrameLua_";
             objArray[14] = "languageShortName_";
             objArray[15] = "slot_";
             objArray[16] = "trackId_";
             objArray[17] = "renderContext_";
             objArray[18] = EffectResource$RenderContextDefaultEntryHolder.defaultEntry;
             return GeneratedMessageLite.newMessageInfo(EffectResource.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x11\xff\x02\xff\x02\xff\x02\xff\x02\x01\x11\x11\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x04\x05\x07\x06\x07\x07\x04\b\x04\t\x07\n\x02\x02\x0b2\f\f\r\x02\x02\x0e\x02\x02\x0f\f\x10\x03\x112\x00", objArray);
           case 4:
             return EffectResource.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EffectResource.PARSER;
             if (pARSER == null) {
                _monitor_enter(EffectResource.class);
                pARSER = EffectResource.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EffectResource.DEFAULT_INSTANCE);
                   EffectResource.PARSER = pARSER;
                }
                _monitor_exit(EffectResource.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureCustomImageIsMutable(){
       if (!this.customImage_.isModifiable()) {
          this.customImage_ = GeneratedMessageLite.mutableCopy(this.customImage_);
       }
       return;
    }
    public boolean getAddWatermark(){
       return this.addWatermark_;
    }
    public String getAssetDir(){
       return this.assetDir_;
    }
    public ByteString getAssetDirBytes(){
       return ByteString.copyFromUtf8(this.assetDir_);
    }
    public String getCustomImage(int p0){
       return this.customImage_.get(p0);
    }
    public ByteString getCustomImageBytes(int p0){
       return ByteString.copyFromUtf8(this.customImage_.get(p0));
    }
    public int getCustomImageCount(){
       return this.customImage_.size();
    }
    public List getCustomImageList(){
       return this.customImage_;
    }
    public int getEffectId(){
       return this.effectId_;
    }
    public boolean getEnableAutoChooseIndexFile(){
       return this.enableAutoChooseIndexFile_;
    }
    public boolean getEnableIndexFileCache(){
       return this.enableIndexFileCache_;
    }
    public String getExtractFrameLua(){
       return this.extractFrameLua_;
    }
    public ByteString getExtractFrameLuaBytes(){
       return ByteString.copyFromUtf8(this.extractFrameLua_);
    }
    public Map getFaceMagicTypeDescriptionMap(){
       return this.getFaceMagicTypeDescriptionMapMap();
    }
    public int getFaceMagicTypeDescriptionMapCount(){
       return this.internalGetFaceMagicTypeDescriptionMap().size();
    }
    public Map getFaceMagicTypeDescriptionMapMap(){
       return Collections.unmodifiableMap(this.internalGetFaceMagicTypeDescriptionMap());
    }
    public String getFaceMagicTypeDescriptionMapOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetFaceMagicTypeDescriptionMap();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public String getFaceMagicTypeDescriptionMapOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetFaceMagicTypeDescriptionMap();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public String getIndexFile(){
       return this.indexFile_;
    }
    public String getIndexFile720(){
       return this.indexFile720_;
    }
    public ByteString getIndexFile720Bytes(){
       return ByteString.copyFromUtf8(this.indexFile720_);
    }
    public ByteString getIndexFileBytes(){
       return ByteString.copyFromUtf8(this.indexFile_);
    }
    public String getLanguageShortName(){
       return this.languageShortName_;
    }
    public ByteString getLanguageShortNameBytes(){
       return ByteString.copyFromUtf8(this.languageShortName_);
    }
    public Map getMutableFaceMagicTypeDescriptionMapMap(){
       return this.internalGetMutableFaceMagicTypeDescriptionMap();
    }
    public Map getMutableRenderContextMap(){
       return this.internalGetMutableRenderContext();
    }
    public int getPreviewHeight(){
       return this.previewHeight_;
    }
    public int getPreviewWidth(){
       return this.previewWidth_;
    }
    public Map getRenderContext(){
       return this.getRenderContextMap();
    }
    public int getRenderContextCount(){
       return this.internalGetRenderContext().size();
    }
    public Map getRenderContextMap(){
       return Collections.unmodifiableMap(this.internalGetRenderContext());
    }
    public String getRenderContextOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetRenderContext();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public String getRenderContextOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetRenderContext();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public EffectResourceType getResourceType(){
       EffectResourceType uEffectResou = EffectResourceType.forNumber(this.resourceType_);
       if (uEffectResou == null) {
          uEffectResou = EffectResourceType.UNRECOGNIZED;
       }
       return uEffectResou;
    }
    public int getResourceTypeValue(){
       return this.resourceType_;
    }
    public EffectSlot getSlot(){
       EffectSlot uEffectSlot = EffectSlot.forNumber(this.slot_);
       if (uEffectSlot == null) {
          uEffectSlot = EffectSlot.UNRECOGNIZED;
       }
       return uEffectSlot;
    }
    public int getSlotValue(){
       return this.slot_;
    }
    public long getTrackId(){
       return this.trackId_;
    }
    public final MapFieldLite internalGetFaceMagicTypeDescriptionMap(){
       return this.faceMagicTypeDescriptionMap_;
    }
    public final MapFieldLite internalGetMutableFaceMagicTypeDescriptionMap(){
       if (!this.faceMagicTypeDescriptionMap_.isMutable()) {
          this.faceMagicTypeDescriptionMap_ = this.faceMagicTypeDescriptionMap_.mutableCopy();
       }
       return this.faceMagicTypeDescriptionMap_;
    }
    public final MapFieldLite internalGetMutableRenderContext(){
       if (!this.renderContext_.isMutable()) {
          this.renderContext_ = this.renderContext_.mutableCopy();
       }
       return this.renderContext_;
    }
    public final MapFieldLite internalGetRenderContext(){
       return this.renderContext_;
    }
    public void setAddWatermark(boolean p0){
       this.addWatermark_ = p0;
    }
    public void setAssetDir(String p0){
       Objects.requireNonNull(p0);
       this.assetDir_ = p0;
    }
    public void setAssetDirBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.assetDir_ = p0.toStringUtf8();
    }
    public void setCustomImage(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureCustomImageIsMutable();
       this.customImage_.set(p0, p1);
    }
    public void setEffectId(int p0){
       this.effectId_ = p0;
    }
    public void setEnableAutoChooseIndexFile(boolean p0){
       this.enableAutoChooseIndexFile_ = p0;
    }
    public void setEnableIndexFileCache(boolean p0){
       this.enableIndexFileCache_ = p0;
    }
    public void setExtractFrameLua(String p0){
       Objects.requireNonNull(p0);
       this.extractFrameLua_ = p0;
    }
    public void setExtractFrameLuaBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.extractFrameLua_ = p0.toStringUtf8();
    }
    public void setIndexFile(String p0){
       Objects.requireNonNull(p0);
       this.indexFile_ = p0;
    }
    public void setIndexFile720(String p0){
       Objects.requireNonNull(p0);
       this.indexFile720_ = p0;
    }
    public void setIndexFile720Bytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.indexFile720_ = p0.toStringUtf8();
    }
    public void setIndexFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.indexFile_ = p0.toStringUtf8();
    }
    public void setLanguageShortName(String p0){
       Objects.requireNonNull(p0);
       this.languageShortName_ = p0;
    }
    public void setLanguageShortNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.languageShortName_ = p0.toStringUtf8();
    }
    public void setPreviewHeight(int p0){
       this.previewHeight_ = p0;
    }
    public void setPreviewWidth(int p0){
       this.previewWidth_ = p0;
    }
    public void setResourceType(EffectResourceType p0){
       Objects.requireNonNull(p0);
       this.resourceType_ = p0.getNumber();
    }
    public void setResourceTypeValue(int p0){
       this.resourceType_ = p0;
    }
    public void setSlot(EffectSlot p0){
       Objects.requireNonNull(p0);
       this.slot_ = p0.getNumber();
    }
    public void setSlotValue(int p0){
       this.slot_ = p0;
    }
    public void setTrackId(long p0){
       this.trackId_ = p0;
    }
}
