package com.kwai.video.westeros.models.EffectResource$Builder;
import com.kwai.video.westeros.models.EffectResourceOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.EffectResource;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.EffectResource$1;
import java.lang.Iterable;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.Map;
import java.lang.Object;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.lang.IllegalArgumentException;
import com.kwai.video.westeros.models.EffectResourceType;
import com.kwai.video.westeros.models.EffectSlot;

public final class EffectResource$Builder extends GeneratedMessageLite$Builder implements EffectResourceOrBuilder	// class@000f3b
{

    public void EffectResource$Builder(){
       super(EffectResource.DEFAULT_INSTANCE);
    }
    public void EffectResource$Builder(EffectResource$1 p0){
       super();
    }
    public EffectResource$Builder addAllCustomImage(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllCustomImage(p0);
       return this;
    }
    public EffectResource$Builder addCustomImage(String p0){
       this.copyOnWrite();
       this.instance.addCustomImage(p0);
       return this;
    }
    public EffectResource$Builder addCustomImageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addCustomImageBytes(p0);
       return this;
    }
    public EffectResource$Builder clearAddWatermark(){
       this.copyOnWrite();
       this.instance.clearAddWatermark();
       return this;
    }
    public EffectResource$Builder clearAssetDir(){
       this.copyOnWrite();
       this.instance.clearAssetDir();
       return this;
    }
    public EffectResource$Builder clearCustomImage(){
       this.copyOnWrite();
       this.instance.clearCustomImage();
       return this;
    }
    public EffectResource$Builder clearEffectId(){
       this.copyOnWrite();
       this.instance.clearEffectId();
       return this;
    }
    public EffectResource$Builder clearEnableAutoChooseIndexFile(){
       this.copyOnWrite();
       this.instance.clearEnableAutoChooseIndexFile();
       return this;
    }
    public EffectResource$Builder clearEnableIndexFileCache(){
       this.copyOnWrite();
       this.instance.clearEnableIndexFileCache();
       return this;
    }
    public EffectResource$Builder clearExtractFrameLua(){
       this.copyOnWrite();
       this.instance.clearExtractFrameLua();
       return this;
    }
    public EffectResource$Builder clearFaceMagicTypeDescriptionMap(){
       this.copyOnWrite();
       this.instance.getMutableFaceMagicTypeDescriptionMapMap().clear();
       return this;
    }
    public EffectResource$Builder clearIndexFile(){
       this.copyOnWrite();
       this.instance.clearIndexFile();
       return this;
    }
    public EffectResource$Builder clearIndexFile720(){
       this.copyOnWrite();
       this.instance.clearIndexFile720();
       return this;
    }
    public EffectResource$Builder clearLanguageShortName(){
       this.copyOnWrite();
       this.instance.clearLanguageShortName();
       return this;
    }
    public EffectResource$Builder clearPreviewHeight(){
       this.copyOnWrite();
       this.instance.clearPreviewHeight();
       return this;
    }
    public EffectResource$Builder clearPreviewWidth(){
       this.copyOnWrite();
       this.instance.clearPreviewWidth();
       return this;
    }
    public EffectResource$Builder clearRenderContext(){
       this.copyOnWrite();
       this.instance.getMutableRenderContextMap().clear();
       return this;
    }
    public EffectResource$Builder clearResourceType(){
       this.copyOnWrite();
       this.instance.clearResourceType();
       return this;
    }
    public EffectResource$Builder clearSlot(){
       this.copyOnWrite();
       this.instance.clearSlot();
       return this;
    }
    public EffectResource$Builder clearTrackId(){
       this.copyOnWrite();
       this.instance.clearTrackId();
       return this;
    }
    public boolean containsFaceMagicTypeDescriptionMap(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getFaceMagicTypeDescriptionMapMap().containsKey(p0);
    }
    public boolean containsRenderContext(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getRenderContextMap().containsKey(p0);
    }
    public boolean getAddWatermark(){
       return this.instance.getAddWatermark();
    }
    public String getAssetDir(){
       return this.instance.getAssetDir();
    }
    public ByteString getAssetDirBytes(){
       return this.instance.getAssetDirBytes();
    }
    public String getCustomImage(int p0){
       return this.instance.getCustomImage(p0);
    }
    public ByteString getCustomImageBytes(int p0){
       return this.instance.getCustomImageBytes(p0);
    }
    public int getCustomImageCount(){
       return this.instance.getCustomImageCount();
    }
    public List getCustomImageList(){
       return Collections.unmodifiableList(this.instance.getCustomImageList());
    }
    public int getEffectId(){
       return this.instance.getEffectId();
    }
    public boolean getEnableAutoChooseIndexFile(){
       return this.instance.getEnableAutoChooseIndexFile();
    }
    public boolean getEnableIndexFileCache(){
       return this.instance.getEnableIndexFileCache();
    }
    public String getExtractFrameLua(){
       return this.instance.getExtractFrameLua();
    }
    public ByteString getExtractFrameLuaBytes(){
       return this.instance.getExtractFrameLuaBytes();
    }
    public Map getFaceMagicTypeDescriptionMap(){
       return this.getFaceMagicTypeDescriptionMapMap();
    }
    public int getFaceMagicTypeDescriptionMapCount(){
       return this.instance.getFaceMagicTypeDescriptionMapMap().size();
    }
    public Map getFaceMagicTypeDescriptionMapMap(){
       return Collections.unmodifiableMap(this.instance.getFaceMagicTypeDescriptionMapMap());
    }
    public String getFaceMagicTypeDescriptionMapOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       Map faceMagicTyp = this.instance.getFaceMagicTypeDescriptionMapMap();
       if (faceMagicTyp.containsKey(p0)) {
          p1 = faceMagicTyp.get(p0);
       }
       return p1;
    }
    public String getFaceMagicTypeDescriptionMapOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map faceMagicTyp = this.instance.getFaceMagicTypeDescriptionMapMap();
       if (faceMagicTyp.containsKey(p0)) {
          return faceMagicTyp.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public String getIndexFile(){
       return this.instance.getIndexFile();
    }
    public String getIndexFile720(){
       return this.instance.getIndexFile720();
    }
    public ByteString getIndexFile720Bytes(){
       return this.instance.getIndexFile720Bytes();
    }
    public ByteString getIndexFileBytes(){
       return this.instance.getIndexFileBytes();
    }
    public String getLanguageShortName(){
       return this.instance.getLanguageShortName();
    }
    public ByteString getLanguageShortNameBytes(){
       return this.instance.getLanguageShortNameBytes();
    }
    public int getPreviewHeight(){
       return this.instance.getPreviewHeight();
    }
    public int getPreviewWidth(){
       return this.instance.getPreviewWidth();
    }
    public Map getRenderContext(){
       return this.getRenderContextMap();
    }
    public int getRenderContextCount(){
       return this.instance.getRenderContextMap().size();
    }
    public Map getRenderContextMap(){
       return Collections.unmodifiableMap(this.instance.getRenderContextMap());
    }
    public String getRenderContextOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       Map renderContex = this.instance.getRenderContextMap();
       if (renderContex.containsKey(p0)) {
          p1 = renderContex.get(p0);
       }
       return p1;
    }
    public String getRenderContextOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map renderContex = this.instance.getRenderContextMap();
       if (renderContex.containsKey(p0)) {
          return renderContex.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public EffectResourceType getResourceType(){
       return this.instance.getResourceType();
    }
    public int getResourceTypeValue(){
       return this.instance.getResourceTypeValue();
    }
    public EffectSlot getSlot(){
       return this.instance.getSlot();
    }
    public int getSlotValue(){
       return this.instance.getSlotValue();
    }
    public long getTrackId(){
       return this.instance.getTrackId();
    }
    public EffectResource$Builder putAllFaceMagicTypeDescriptionMap(Map p0){
       this.copyOnWrite();
       this.instance.getMutableFaceMagicTypeDescriptionMapMap().putAll(p0);
       return this;
    }
    public EffectResource$Builder putAllRenderContext(Map p0){
       this.copyOnWrite();
       this.instance.getMutableRenderContextMap().putAll(p0);
       return this;
    }
    public EffectResource$Builder putFaceMagicTypeDescriptionMap(String p0,String p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableFaceMagicTypeDescriptionMapMap().put(p0, p1);
       return this;
    }
    public EffectResource$Builder putRenderContext(String p0,String p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableRenderContextMap().put(p0, p1);
       return this;
    }
    public EffectResource$Builder removeFaceMagicTypeDescriptionMap(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableFaceMagicTypeDescriptionMapMap().remove(p0);
       return this;
    }
    public EffectResource$Builder removeRenderContext(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableRenderContextMap().remove(p0);
       return this;
    }
    public EffectResource$Builder setAddWatermark(boolean p0){
       this.copyOnWrite();
       this.instance.setAddWatermark(p0);
       return this;
    }
    public EffectResource$Builder setAssetDir(String p0){
       this.copyOnWrite();
       this.instance.setAssetDir(p0);
       return this;
    }
    public EffectResource$Builder setAssetDirBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setAssetDirBytes(p0);
       return this;
    }
    public EffectResource$Builder setCustomImage(int p0,String p1){
       this.copyOnWrite();
       this.instance.setCustomImage(p0, p1);
       return this;
    }
    public EffectResource$Builder setEffectId(int p0){
       this.copyOnWrite();
       this.instance.setEffectId(p0);
       return this;
    }
    public EffectResource$Builder setEnableAutoChooseIndexFile(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableAutoChooseIndexFile(p0);
       return this;
    }
    public EffectResource$Builder setEnableIndexFileCache(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableIndexFileCache(p0);
       return this;
    }
    public EffectResource$Builder setExtractFrameLua(String p0){
       this.copyOnWrite();
       this.instance.setExtractFrameLua(p0);
       return this;
    }
    public EffectResource$Builder setExtractFrameLuaBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setExtractFrameLuaBytes(p0);
       return this;
    }
    public EffectResource$Builder setIndexFile(String p0){
       this.copyOnWrite();
       this.instance.setIndexFile(p0);
       return this;
    }
    public EffectResource$Builder setIndexFile720(String p0){
       this.copyOnWrite();
       this.instance.setIndexFile720(p0);
       return this;
    }
    public EffectResource$Builder setIndexFile720Bytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setIndexFile720Bytes(p0);
       return this;
    }
    public EffectResource$Builder setIndexFileBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setIndexFileBytes(p0);
       return this;
    }
    public EffectResource$Builder setLanguageShortName(String p0){
       this.copyOnWrite();
       this.instance.setLanguageShortName(p0);
       return this;
    }
    public EffectResource$Builder setLanguageShortNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setLanguageShortNameBytes(p0);
       return this;
    }
    public EffectResource$Builder setPreviewHeight(int p0){
       this.copyOnWrite();
       this.instance.setPreviewHeight(p0);
       return this;
    }
    public EffectResource$Builder setPreviewWidth(int p0){
       this.copyOnWrite();
       this.instance.setPreviewWidth(p0);
       return this;
    }
    public EffectResource$Builder setResourceType(EffectResourceType p0){
       this.copyOnWrite();
       this.instance.setResourceType(p0);
       return this;
    }
    public EffectResource$Builder setResourceTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setResourceTypeValue(p0);
       return this;
    }
    public EffectResource$Builder setSlot(EffectSlot p0){
       this.copyOnWrite();
       this.instance.setSlot(p0);
       return this;
    }
    public EffectResource$Builder setSlotValue(int p0){
       this.copyOnWrite();
       this.instance.setSlotValue(p0);
       return this;
    }
    public EffectResource$Builder setTrackId(long p0){
       this.copyOnWrite();
       this.instance.setTrackId(p0);
       return this;
    }
}
