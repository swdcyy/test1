package com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset$a;
import com.kuaishou.edit.draft.AuditFrame;
import com.kuaishou.edit.draft.AssetSegment$b;
import java.lang.String;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.CropOptions$b;
import com.kuaishou.edit.draft.AEEffect;
import java.util.List;
import java.util.Collections;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.AssetSegment;
import com.kuaishou.edit.draft.Template;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.ColorFilter;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.Encode;
import com.kuaishou.edit.draft.FineTuningParam;
import com.kuaishou.edit.draft.GeoLocation;
import com.kuaishou.edit.draft.Makeup;
import com.kuaishou.edit.draft.Asset$PositionType;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import com.kuaishou.edit.draft.Transform;
import com.kuaishou.edit.draft.AssetTransition;
import com.kuaishou.edit.draft.Asset$Type;
import com.kuaishou.edit.draft.VisualEffect;
import com.kuaishou.edit.draft.Encode$b;
import com.kuaishou.edit.draft.Asset$ShootInfo$a;

public final class Asset$b extends GeneratedMessageLite$Builder implements c	// class@00170c
{

    public void Asset$b(){
       super(Asset.DEFAULT_INSTANCE);
    }
    public void Asset$b(Asset$a p0){
       super(Asset.DEFAULT_INSTANCE);
    }
    public Asset$b a(AuditFrame p0){
       this.copyOnWrite();
       this.instance.addAssetAuditFrame(p0);
       return this;
    }
    public Asset$b b(AssetSegment$b p0){
       this.copyOnWrite();
       this.instance.addAssetSegment(p0);
       return this;
    }
    public Asset$b c(){
       this.copyOnWrite();
       this.instance.clearFineTuningParam();
       return this;
    }
    public Asset$b d(String p0){
       this.copyOnWrite();
       this.instance.setAlbumId(p0);
       return this;
    }
    public Asset$b e(int p0,AssetSegment$b p1){
       this.copyOnWrite();
       this.instance.setAssetSegment(p0, p1);
       return this;
    }
    public Asset$b f(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public Asset$b g(CropOptions$b p0){
       this.copyOnWrite();
       this.instance.setCropOptions(p0);
       return this;
    }
    public AEEffect getAe2Effects(int p0){
       return this.instance.getAe2Effects(p0);
    }
    public int getAe2EffectsCount(){
       return this.instance.getAe2EffectsCount();
    }
    public List getAe2EffectsList(){
       return Collections.unmodifiableList(this.instance.getAe2EffectsList());
    }
    public String getAlbumId(){
       return this.instance.getAlbumId();
    }
    public ByteString getAlbumIdBytes(){
       return this.instance.getAlbumIdBytes();
    }
    public AuditFrame getAssetAuditFrame(int p0){
       return this.instance.getAssetAuditFrame(p0);
    }
    public int getAssetAuditFrameCount(){
       return this.instance.getAssetAuditFrameCount();
    }
    public List getAssetAuditFrameList(){
       return Collections.unmodifiableList(this.instance.getAssetAuditFrameList());
    }
    public AssetSegment getAssetSegment(int p0){
       return this.instance.getAssetSegment(p0);
    }
    public int getAssetSegmentCount(){
       return this.instance.getAssetSegmentCount();
    }
    public List getAssetSegmentList(){
       return Collections.unmodifiableList(this.instance.getAssetSegmentList());
    }
    public Template getAtlasTemplate(){
       return this.instance.getAtlasTemplate();
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public String getAudioPath(){
       return this.instance.getAudioPath();
    }
    public ByteString getAudioPathBytes(){
       return this.instance.getAudioPathBytes();
    }
    public Beauty getBeauty(int p0){
       return this.instance.getBeauty(p0);
    }
    public int getBeautyCount(){
       return this.instance.getBeautyCount();
    }
    public List getBeautyList(){
       return Collections.unmodifiableList(this.instance.getBeautyList());
    }
    public ColorFilter getColorFilter(int p0){
       return this.instance.getColorFilter(p0);
    }
    public int getColorFilterCount(){
       return this.instance.getColorFilterCount();
    }
    public List getColorFilterList(){
       return Collections.unmodifiableList(this.instance.getColorFilterList());
    }
    public CropOptions getCropOptions(){
       return this.instance.getCropOptions();
    }
    public boolean getDisableThemeEffect(){
       return this.instance.getDisableThemeEffect();
    }
    public double getDuration(){
       return this.instance.getDuration();
    }
    public Encode getEncodeInfo(){
       return this.instance.getEncodeInfo();
    }
    public String getFile(){
       return this.instance.getFile();
    }
    public ByteString getFileBytes(){
       return this.instance.getFileBytes();
    }
    public FineTuningParam getFineTuningParam(){
       return this.instance.getFineTuningParam();
    }
    public String getIdentifier(){
       return this.instance.getIdentifier();
    }
    public ByteString getIdentifierBytes(){
       return this.instance.getIdentifierBytes();
    }
    public boolean getIsSolitaire(){
       return this.instance.getIsSolitaire();
    }
    public boolean getIsVocal(){
       return this.instance.getIsVocal();
    }
    public GeoLocation getLocation(){
       return this.instance.getLocation();
    }
    public Makeup getMakeup(int p0){
       return this.instance.getMakeup(p0);
    }
    public int getMakeupCount(){
       return this.instance.getMakeupCount();
    }
    public List getMakeupList(){
       return Collections.unmodifiableList(this.instance.getMakeupList());
    }
    public double getOriginPicHeight(){
       return this.instance.getOriginPicHeight();
    }
    public double getOriginPicWidth(){
       return this.instance.getOriginPicWidth();
    }
    public String getPictureCropFile(){
       return this.instance.getPictureCropFile();
    }
    public ByteString getPictureCropFileBytes(){
       return this.instance.getPictureCropFileBytes();
    }
    public Asset$PositionType getPositionType(){
       return this.instance.getPositionType();
    }
    public int getPositionTypeValue(){
       return this.instance.getPositionTypeValue();
    }
    public double getPreviewPicHeight(){
       return this.instance.getPreviewPicHeight();
    }
    public double getPreviewPicWidth(){
       return this.instance.getPreviewPicWidth();
    }
    public int getRotate(){
       return this.instance.getRotate();
    }
    public TimeRange getSelectedRange(){
       return this.instance.getSelectedRange();
    }
    public Asset$ShootInfo getShootInfo(){
       return this.instance.getShootInfo();
    }
    public double getSpeed(){
       return this.instance.getSpeed();
    }
    public Asset getSubAsset(int p0){
       return this.instance.getSubAsset(p0);
    }
    public int getSubAssetCount(){
       return this.instance.getSubAssetCount();
    }
    public List getSubAssetList(){
       return Collections.unmodifiableList(this.instance.getSubAssetList());
    }
    public Transform getTransform(){
       return this.instance.getTransform();
    }
    public AssetTransition getTransition(){
       return this.instance.getTransition();
    }
    public Asset$Type getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public VisualEffect getVisualEffects(int p0){
       return this.instance.getVisualEffects(p0);
    }
    public int getVisualEffectsCount(){
       return this.instance.getVisualEffectsCount();
    }
    public List getVisualEffectsList(){
       return Collections.unmodifiableList(this.instance.getVisualEffectsList());
    }
    public Asset$b h(CropOptions p0){
       this.copyOnWrite();
       this.instance.setCropOptions(p0);
       return this;
    }
    public boolean hasAtlasTemplate(){
       return this.instance.hasAtlasTemplate();
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasCropOptions(){
       return this.instance.hasCropOptions();
    }
    public boolean hasEncodeInfo(){
       return this.instance.hasEncodeInfo();
    }
    public boolean hasFineTuningParam(){
       return this.instance.hasFineTuningParam();
    }
    public boolean hasLocation(){
       return this.instance.hasLocation();
    }
    public boolean hasSelectedRange(){
       return this.instance.hasSelectedRange();
    }
    public boolean hasShootInfo(){
       return this.instance.hasShootInfo();
    }
    public boolean hasTransform(){
       return this.instance.hasTransform();
    }
    public boolean hasTransition(){
       return this.instance.hasTransition();
    }
    public Asset$b i(double p0){
       this.copyOnWrite();
       this.instance.setDuration(p0);
       return this;
    }
    public Asset$b j(Encode$b p0){
       this.copyOnWrite();
       this.instance.setEncodeInfo(p0);
       return this;
    }
    public Asset$b k(String p0){
       this.copyOnWrite();
       this.instance.setFile(p0);
       return this;
    }
    public Asset$b l(FineTuningParam p0){
       this.copyOnWrite();
       this.instance.setFineTuningParam(p0);
       return this;
    }
    public Asset$b m(String p0){
       this.copyOnWrite();
       this.instance.setIdentifier(p0);
       return this;
    }
    public Asset$b n(boolean p0){
       this.copyOnWrite();
       this.instance.setIsVocal(p0);
       return this;
    }
    public Asset$b o(double p0){
       this.copyOnWrite();
       this.instance.setOriginPicHeight(p0);
       return this;
    }
    public Asset$b p(double p0){
       this.copyOnWrite();
       this.instance.setOriginPicWidth(p0);
       return this;
    }
    public Asset$b q(String p0){
       this.copyOnWrite();
       this.instance.setPictureCropFile(p0);
       return this;
    }
    public Asset$b r(int p0){
       this.copyOnWrite();
       this.instance.setRotate(p0);
       return this;
    }
    public Asset$b s(TimeRange p0){
       this.copyOnWrite();
       this.instance.setSelectedRange(p0);
       return this;
    }
    public Asset$b t(Asset$ShootInfo$a p0){
       this.copyOnWrite();
       this.instance.setShootInfo(p0);
       return this;
    }
    public Asset$b u(double p0){
       this.copyOnWrite();
       this.instance.setSpeed(p0);
       return this;
    }
    public Asset$b v(AssetTransition p0){
       this.copyOnWrite();
       this.instance.setTransition(p0);
       return this;
    }
    public Asset$b w(Asset$Type p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
}
