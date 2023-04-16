package com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.Asset$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.kuaishou.edit.draft.AEEffect$b;
import java.lang.Object;
import java.util.List;
import com.kuaishou.edit.draft.AEEffect;
import java.util.Objects;
import java.lang.Iterable;
import com.google.protobuf.AbstractMessageLite;
import com.kuaishou.edit.draft.AuditFrame$b;
import com.kuaishou.edit.draft.AuditFrame;
import com.kuaishou.edit.draft.AssetSegment$b;
import com.kuaishou.edit.draft.AssetSegment;
import com.kuaishou.edit.draft.Beauty$b;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.ColorFilter$b;
import com.kuaishou.edit.draft.ColorFilter;
import com.kuaishou.edit.draft.Makeup$b;
import com.kuaishou.edit.draft.Makeup;
import com.kuaishou.edit.draft.VisualEffect$b;
import com.kuaishou.edit.draft.VisualEffect;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.Asset$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.a;
import z30.k;
import z30.d;
import com.kuaishou.edit.draft.Template;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.d;
import com.kuaishou.edit.draft.f;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.Encode;
import com.kuaishou.edit.draft.FineTuningParam;
import com.kuaishou.edit.draft.GeoLocation;
import com.kuaishou.edit.draft.l;
import com.kuaishou.edit.draft.Asset$PositionType;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import com.kuaishou.edit.draft.Transform;
import com.kuaishou.edit.draft.AssetTransition;
import com.kuaishou.edit.draft.Asset$Type;
import com.kuaishou.edit.draft.e0;
import com.kuaishou.edit.draft.Template$b;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.CropOptions$b;
import com.kuaishou.edit.draft.Encode$b;
import com.kuaishou.edit.draft.FineTuningParam$b;
import com.kuaishou.edit.draft.GeoLocation$b;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.Asset$ShootInfo$a;
import com.kuaishou.edit.draft.Transform$b;
import com.kuaishou.edit.draft.AssetTransition$b;

public final class Asset extends GeneratedMessageLite implements c	// class@00170e
{
    public Internal$ProtobufList ae2Effects_;
    public String albumId_;
    public Internal$ProtobufList assetAuditFrame_;
    public Internal$ProtobufList assetSegment_;
    public Template atlasTemplate_;
    public Attributes attributes_;
    public String audioPath_;
    public Internal$ProtobufList beauty_;
    public Internal$ProtobufList colorFilter_;
    public CropOptions cropOptions_;
    public boolean disableThemeEffect_;
    public double duration_;
    public Encode encodeInfo_;
    public String file_;
    public FineTuningParam fineTuningParam_;
    public String identifier_;
    public boolean isSolitaire_;
    public boolean isVocal_;
    public GeoLocation location_;
    public Internal$ProtobufList makeup_;
    public double originPicHeight_;
    public double originPicWidth_;
    public String pictureCropFile_;
    public int positionType_;
    public double previewPicHeight_;
    public double previewPicWidth_;
    public int rotate_;
    public TimeRange selectedRange_;
    public Asset$ShootInfo shootInfo_;
    public double speed_;
    public Internal$ProtobufList subAsset_;
    public Transform transform_;
    public AssetTransition transition_;
    public int type_;
    public Internal$ProtobufList visualEffects_;
    public static final Asset DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Asset uAsset = new Asset();
       Asset.DEFAULT_INSTANCE = uAsset;
       GeneratedMessageLite.registerDefaultInstance(Asset.class, uAsset);
    }
    public void Asset(){
       super();
       this.file_ = "";
       this.visualEffects_ = GeneratedMessageLite.emptyProtobufList();
       this.albumId_ = "";
       this.identifier_ = "";
       this.assetSegment_ = GeneratedMessageLite.emptyProtobufList();
       this.audioPath_ = "";
       this.pictureCropFile_ = "";
       this.ae2Effects_ = GeneratedMessageLite.emptyProtobufList();
       this.makeup_ = GeneratedMessageLite.emptyProtobufList();
       this.beauty_ = GeneratedMessageLite.emptyProtobufList();
       this.colorFilter_ = GeneratedMessageLite.emptyProtobufList();
       this.assetAuditFrame_ = GeneratedMessageLite.emptyProtobufList();
       this.subAsset_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static Asset getDefaultInstance(){
       return Asset.DEFAULT_INSTANCE;
    }
    public static Asset$b newBuilder(){
       return Asset.DEFAULT_INSTANCE.createBuilder();
    }
    public static Asset$b newBuilder(Asset p0){
       return Asset.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Asset parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Asset.DEFAULT_INSTANCE, p0);
    }
    public static Asset parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Asset.DEFAULT_INSTANCE, p0, p1);
    }
    public static Asset parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Asset.DEFAULT_INSTANCE, p0);
    }
    public static Asset parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Asset.DEFAULT_INSTANCE, p0, p1);
    }
    public static Asset parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Asset.DEFAULT_INSTANCE, p0);
    }
    public static Asset parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Asset.DEFAULT_INSTANCE, p0, p1);
    }
    public static Asset parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Asset.DEFAULT_INSTANCE, p0);
    }
    public static Asset parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Asset.DEFAULT_INSTANCE, p0, p1);
    }
    public static Asset parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Asset.DEFAULT_INSTANCE, p0);
    }
    public static Asset parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Asset.DEFAULT_INSTANCE, p0, p1);
    }
    public static Asset parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Asset.DEFAULT_INSTANCE, p0);
    }
    public static Asset parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Asset.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Asset.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAe2Effects(int p0,AEEffect$b p1){
       this.ensureAe2EffectsIsMutable();
       this.ae2Effects_.add(p0, p1.build());
    }
    public void addAe2Effects(int p0,AEEffect p1){
       Objects.requireNonNull(p1);
       this.ensureAe2EffectsIsMutable();
       this.ae2Effects_.add(p0, p1);
    }
    public void addAe2Effects(AEEffect$b p0){
       this.ensureAe2EffectsIsMutable();
       this.ae2Effects_.add(p0.build());
    }
    public void addAe2Effects(AEEffect p0){
       Objects.requireNonNull(p0);
       this.ensureAe2EffectsIsMutable();
       this.ae2Effects_.add(p0);
    }
    public void addAllAe2Effects(Iterable p0){
       this.ensureAe2EffectsIsMutable();
       AbstractMessageLite.addAll(p0, this.ae2Effects_);
    }
    public void addAllAssetAuditFrame(Iterable p0){
       this.ensureAssetAuditFrameIsMutable();
       AbstractMessageLite.addAll(p0, this.assetAuditFrame_);
    }
    public void addAllAssetSegment(Iterable p0){
       this.ensureAssetSegmentIsMutable();
       AbstractMessageLite.addAll(p0, this.assetSegment_);
    }
    public void addAllBeauty(Iterable p0){
       this.ensureBeautyIsMutable();
       AbstractMessageLite.addAll(p0, this.beauty_);
    }
    public void addAllColorFilter(Iterable p0){
       this.ensureColorFilterIsMutable();
       AbstractMessageLite.addAll(p0, this.colorFilter_);
    }
    public void addAllMakeup(Iterable p0){
       this.ensureMakeupIsMutable();
       AbstractMessageLite.addAll(p0, this.makeup_);
    }
    public void addAllSubAsset(Iterable p0){
       this.ensureSubAssetIsMutable();
       AbstractMessageLite.addAll(p0, this.subAsset_);
    }
    public void addAllVisualEffects(Iterable p0){
       this.ensureVisualEffectsIsMutable();
       AbstractMessageLite.addAll(p0, this.visualEffects_);
    }
    public void addAssetAuditFrame(int p0,AuditFrame$b p1){
       this.ensureAssetAuditFrameIsMutable();
       this.assetAuditFrame_.add(p0, p1.build());
    }
    public void addAssetAuditFrame(int p0,AuditFrame p1){
       Objects.requireNonNull(p1);
       this.ensureAssetAuditFrameIsMutable();
       this.assetAuditFrame_.add(p0, p1);
    }
    public void addAssetAuditFrame(AuditFrame$b p0){
       this.ensureAssetAuditFrameIsMutable();
       this.assetAuditFrame_.add(p0.build());
    }
    public void addAssetAuditFrame(AuditFrame p0){
       Objects.requireNonNull(p0);
       this.ensureAssetAuditFrameIsMutable();
       this.assetAuditFrame_.add(p0);
    }
    public void addAssetSegment(int p0,AssetSegment$b p1){
       this.ensureAssetSegmentIsMutable();
       this.assetSegment_.add(p0, p1.build());
    }
    public void addAssetSegment(int p0,AssetSegment p1){
       Objects.requireNonNull(p1);
       this.ensureAssetSegmentIsMutable();
       this.assetSegment_.add(p0, p1);
    }
    public void addAssetSegment(AssetSegment$b p0){
       this.ensureAssetSegmentIsMutable();
       this.assetSegment_.add(p0.build());
    }
    public void addAssetSegment(AssetSegment p0){
       Objects.requireNonNull(p0);
       this.ensureAssetSegmentIsMutable();
       this.assetSegment_.add(p0);
    }
    public void addBeauty(int p0,Beauty$b p1){
       this.ensureBeautyIsMutable();
       this.beauty_.add(p0, p1.build());
    }
    public void addBeauty(int p0,Beauty p1){
       Objects.requireNonNull(p1);
       this.ensureBeautyIsMutable();
       this.beauty_.add(p0, p1);
    }
    public void addBeauty(Beauty$b p0){
       this.ensureBeautyIsMutable();
       this.beauty_.add(p0.build());
    }
    public void addBeauty(Beauty p0){
       Objects.requireNonNull(p0);
       this.ensureBeautyIsMutable();
       this.beauty_.add(p0);
    }
    public void addColorFilter(int p0,ColorFilter$b p1){
       this.ensureColorFilterIsMutable();
       this.colorFilter_.add(p0, p1.build());
    }
    public void addColorFilter(int p0,ColorFilter p1){
       Objects.requireNonNull(p1);
       this.ensureColorFilterIsMutable();
       this.colorFilter_.add(p0, p1);
    }
    public void addColorFilter(ColorFilter$b p0){
       this.ensureColorFilterIsMutable();
       this.colorFilter_.add(p0.build());
    }
    public void addColorFilter(ColorFilter p0){
       Objects.requireNonNull(p0);
       this.ensureColorFilterIsMutable();
       this.colorFilter_.add(p0);
    }
    public void addMakeup(int p0,Makeup$b p1){
       this.ensureMakeupIsMutable();
       this.makeup_.add(p0, p1.build());
    }
    public void addMakeup(int p0,Makeup p1){
       Objects.requireNonNull(p1);
       this.ensureMakeupIsMutable();
       this.makeup_.add(p0, p1);
    }
    public void addMakeup(Makeup$b p0){
       this.ensureMakeupIsMutable();
       this.makeup_.add(p0.build());
    }
    public void addMakeup(Makeup p0){
       Objects.requireNonNull(p0);
       this.ensureMakeupIsMutable();
       this.makeup_.add(p0);
    }
    public void addSubAsset(int p0,Asset$b p1){
       this.ensureSubAssetIsMutable();
       this.subAsset_.add(p0, p1.build());
    }
    public void addSubAsset(int p0,Asset p1){
       Objects.requireNonNull(p1);
       this.ensureSubAssetIsMutable();
       this.subAsset_.add(p0, p1);
    }
    public void addSubAsset(Asset$b p0){
       this.ensureSubAssetIsMutable();
       this.subAsset_.add(p0.build());
    }
    public void addSubAsset(Asset p0){
       Objects.requireNonNull(p0);
       this.ensureSubAssetIsMutable();
       this.subAsset_.add(p0);
    }
    public void addVisualEffects(int p0,VisualEffect$b p1){
       this.ensureVisualEffectsIsMutable();
       this.visualEffects_.add(p0, p1.build());
    }
    public void addVisualEffects(int p0,VisualEffect p1){
       Objects.requireNonNull(p1);
       this.ensureVisualEffectsIsMutable();
       this.visualEffects_.add(p0, p1);
    }
    public void addVisualEffects(VisualEffect$b p0){
       this.ensureVisualEffectsIsMutable();
       this.visualEffects_.add(p0.build());
    }
    public void addVisualEffects(VisualEffect p0){
       Objects.requireNonNull(p0);
       this.ensureVisualEffectsIsMutable();
       this.visualEffects_.add(p0);
    }
    public void clearAe2Effects(){
       this.ae2Effects_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearAlbumId(){
       this.albumId_ = Asset.getDefaultInstance().getAlbumId();
    }
    public void clearAssetAuditFrame(){
       this.assetAuditFrame_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearAssetSegment(){
       this.assetSegment_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearAtlasTemplate(){
       this.atlasTemplate_ = null;
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearAudioPath(){
       this.audioPath_ = Asset.getDefaultInstance().getAudioPath();
    }
    public void clearBeauty(){
       this.beauty_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearColorFilter(){
       this.colorFilter_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearCropOptions(){
       this.cropOptions_ = null;
    }
    public void clearDisableThemeEffect(){
       this.disableThemeEffect_ = false;
    }
    public void clearDuration(){
       this.duration_ = 0;
    }
    public void clearEncodeInfo(){
       this.encodeInfo_ = null;
    }
    public void clearFile(){
       this.file_ = Asset.getDefaultInstance().getFile();
    }
    public void clearFineTuningParam(){
       this.fineTuningParam_ = null;
    }
    public void clearIdentifier(){
       this.identifier_ = Asset.getDefaultInstance().getIdentifier();
    }
    public void clearIsSolitaire(){
       this.isSolitaire_ = false;
    }
    public void clearIsVocal(){
       this.isVocal_ = false;
    }
    public void clearLocation(){
       this.location_ = null;
    }
    public void clearMakeup(){
       this.makeup_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearOriginPicHeight(){
       this.originPicHeight_ = 0;
    }
    public void clearOriginPicWidth(){
       this.originPicWidth_ = 0;
    }
    public void clearPictureCropFile(){
       this.pictureCropFile_ = Asset.getDefaultInstance().getPictureCropFile();
    }
    public void clearPositionType(){
       this.positionType_ = 0;
    }
    public void clearPreviewPicHeight(){
       this.previewPicHeight_ = 0;
    }
    public void clearPreviewPicWidth(){
       this.previewPicWidth_ = 0;
    }
    public void clearRotate(){
       this.rotate_ = 0;
    }
    public void clearSelectedRange(){
       this.selectedRange_ = null;
    }
    public void clearShootInfo(){
       this.shootInfo_ = null;
    }
    public void clearSpeed(){
       this.speed_ = 0;
    }
    public void clearSubAsset(){
       this.subAsset_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearTransform(){
       this.transform_ = null;
    }
    public void clearTransition(){
       this.transition_ = null;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public void clearVisualEffects(){
       this.visualEffects_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = Asset.class;
       int i = 1;
       Asset$a uoa = null;
       switch (Asset$a.a[p0.ordinal()]){
           case 1:
             return new Asset();
           case 2:
             return new Asset$b(uoa);
           case 3:
             Object[] objArray = new Object[43];
             objArray[0] = "type_";
             objArray[i] = "attributes_";
             objArray[2] = "file_";
             objArray[3] = "selectedRange_";
             objArray[4] = "speed_";
             objArray[5] = "rotate_";
             objArray[6] = "transition_";
             objArray[7] = "duration_";
             objArray[8] = "shootInfo_";
             objArray[9] = "encodeInfo_";
             objArray[10] = "visualEffects_";
             objArray[11] = VisualEffect.class;
             objArray[12] = "cropOptions_";
             objArray[13] = "transform_";
             objArray[14] = "isVocal_";
             objArray[15] = "location_";
             objArray[16] = "identifier_";
             objArray[17] = "assetSegment_";
             objArray[18] = AssetSegment.class;
             objArray[19] = "audioPath_";
             objArray[20] = "pictureCropFile_";
             objArray[21] = "fineTuningParam_";
             objArray[22] = "ae2Effects_";
             objArray[23] = AEEffect.class;
             objArray[24] = "disableThemeEffect_";
             objArray[25] = "positionType_";
             objArray[26] = "isSolitaire_";
             objArray[27] = "originPicWidth_";
             objArray[28] = "originPicHeight_";
             objArray[29] = "previewPicWidth_";
             objArray[30] = "previewPicHeight_";
             objArray[31] = "atlasTemplate_";
             objArray[32] = "makeup_";
             objArray[33] = Makeup.class;
             objArray[34] = "beauty_";
             objArray[35] = Beauty.class;
             objArray[36] = "colorFilter_";
             objArray[37] = ColorFilter.class;
             objArray[38] = "assetAuditFrame_";
             objArray[39] = AuditFrame.class;
             objArray[40] = "subAsset_";
             objArray[41] = p1;
             objArray[42] = "albumId_";
             return GeneratedMessageLite.newMessageInfo(Asset.DEFAULT_INSTANCE, "\xff\x02\xff\x02#\xff\x02\xff\x02\xff\x02\xff\x02\x01d#\xff\x02\xff\x02\b\xff\x02\xff\x02\x01\f\x02\t\x03\x02\x02\x04\t\x05\xff\x02\xff\x02\x06\x04\x07\t\b\xff\x02\xff\x02\t\t\n\t\x0b\x1b\f\t\r\t\x0e\x07\x0f\t\x10\x02\x02\x11\x1b\x12\x02\x02\x13\x02\x02\x14\t\x15\x1b\x16\x07\x17\f\x18\x07\x19\xff\x02\xff\x02\x1a\xff\x02\xff\x02\x1b\xff\x02\xff\x02\x1c\xff\x02\xff\x02\x1d\t\x1e\x1b\x1f\x1b \x1b!\x1b\"\x1bd\x02\x02\x00", objArray);
           case 4:
             return Asset.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Asset.PARSER;
             if (pARSER == null) {
                _monitor_enter(p1);
                pARSER = Asset.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Asset.DEFAULT_INSTANCE);
                   Asset.PARSER = pARSER;
                }
                _monitor_exit(p1);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return uoa;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureAe2EffectsIsMutable(){
       if (!this.ae2Effects_.isModifiable()) {
          this.ae2Effects_ = GeneratedMessageLite.mutableCopy(this.ae2Effects_);
       }
       return;
    }
    public final void ensureAssetAuditFrameIsMutable(){
       if (!this.assetAuditFrame_.isModifiable()) {
          this.assetAuditFrame_ = GeneratedMessageLite.mutableCopy(this.assetAuditFrame_);
       }
       return;
    }
    public final void ensureAssetSegmentIsMutable(){
       if (!this.assetSegment_.isModifiable()) {
          this.assetSegment_ = GeneratedMessageLite.mutableCopy(this.assetSegment_);
       }
       return;
    }
    public final void ensureBeautyIsMutable(){
       if (!this.beauty_.isModifiable()) {
          this.beauty_ = GeneratedMessageLite.mutableCopy(this.beauty_);
       }
       return;
    }
    public final void ensureColorFilterIsMutable(){
       if (!this.colorFilter_.isModifiable()) {
          this.colorFilter_ = GeneratedMessageLite.mutableCopy(this.colorFilter_);
       }
       return;
    }
    public final void ensureMakeupIsMutable(){
       if (!this.makeup_.isModifiable()) {
          this.makeup_ = GeneratedMessageLite.mutableCopy(this.makeup_);
       }
       return;
    }
    public final void ensureSubAssetIsMutable(){
       if (!this.subAsset_.isModifiable()) {
          this.subAsset_ = GeneratedMessageLite.mutableCopy(this.subAsset_);
       }
       return;
    }
    public final void ensureVisualEffectsIsMutable(){
       if (!this.visualEffects_.isModifiable()) {
          this.visualEffects_ = GeneratedMessageLite.mutableCopy(this.visualEffects_);
       }
       return;
    }
    public AEEffect getAe2Effects(int p0){
       return this.ae2Effects_.get(p0);
    }
    public int getAe2EffectsCount(){
       return this.ae2Effects_.size();
    }
    public List getAe2EffectsList(){
       return this.ae2Effects_;
    }
    public a getAe2EffectsOrBuilder(int p0){
       return this.ae2Effects_.get(p0);
    }
    public List getAe2EffectsOrBuilderList(){
       return this.ae2Effects_;
    }
    public String getAlbumId(){
       return this.albumId_;
    }
    public ByteString getAlbumIdBytes(){
       return ByteString.copyFromUtf8(this.albumId_);
    }
    public AuditFrame getAssetAuditFrame(int p0){
       return this.assetAuditFrame_.get(p0);
    }
    public int getAssetAuditFrameCount(){
       return this.assetAuditFrame_.size();
    }
    public List getAssetAuditFrameList(){
       return this.assetAuditFrame_;
    }
    public k getAssetAuditFrameOrBuilder(int p0){
       return this.assetAuditFrame_.get(p0);
    }
    public List getAssetAuditFrameOrBuilderList(){
       return this.assetAuditFrame_;
    }
    public AssetSegment getAssetSegment(int p0){
       return this.assetSegment_.get(p0);
    }
    public int getAssetSegmentCount(){
       return this.assetSegment_.size();
    }
    public List getAssetSegmentList(){
       return this.assetSegment_;
    }
    public d getAssetSegmentOrBuilder(int p0){
       return this.assetSegment_.get(p0);
    }
    public List getAssetSegmentOrBuilderList(){
       return this.assetSegment_;
    }
    public Template getAtlasTemplate(){
       Asset tatlasTempla = this.atlasTemplate_;
       if (tatlasTempla == null) {
          tatlasTempla = Template.getDefaultInstance();
       }
       return tatlasTempla;
    }
    public Attributes getAttributes(){
       Asset tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public String getAudioPath(){
       return this.audioPath_;
    }
    public ByteString getAudioPathBytes(){
       return ByteString.copyFromUtf8(this.audioPath_);
    }
    public Beauty getBeauty(int p0){
       return this.beauty_.get(p0);
    }
    public int getBeautyCount(){
       return this.beauty_.size();
    }
    public List getBeautyList(){
       return this.beauty_;
    }
    public d getBeautyOrBuilder(int p0){
       return this.beauty_.get(p0);
    }
    public List getBeautyOrBuilderList(){
       return this.beauty_;
    }
    public ColorFilter getColorFilter(int p0){
       return this.colorFilter_.get(p0);
    }
    public int getColorFilterCount(){
       return this.colorFilter_.size();
    }
    public List getColorFilterList(){
       return this.colorFilter_;
    }
    public f getColorFilterOrBuilder(int p0){
       return this.colorFilter_.get(p0);
    }
    public List getColorFilterOrBuilderList(){
       return this.colorFilter_;
    }
    public CropOptions getCropOptions(){
       Asset tcropOptions = this.cropOptions_;
       if (tcropOptions == null) {
          tcropOptions = CropOptions.getDefaultInstance();
       }
       return tcropOptions;
    }
    public boolean getDisableThemeEffect(){
       return this.disableThemeEffect_;
    }
    public double getDuration(){
       return this.duration_;
    }
    public Encode getEncodeInfo(){
       Asset tencodeInfo_ = this.encodeInfo_;
       if (tencodeInfo_ == null) {
          tencodeInfo_ = Encode.getDefaultInstance();
       }
       return tencodeInfo_;
    }
    public String getFile(){
       return this.file_;
    }
    public ByteString getFileBytes(){
       return ByteString.copyFromUtf8(this.file_);
    }
    public FineTuningParam getFineTuningParam(){
       Asset tfineTuningP = this.fineTuningParam_;
       if (tfineTuningP == null) {
          tfineTuningP = FineTuningParam.getDefaultInstance();
       }
       return tfineTuningP;
    }
    public String getIdentifier(){
       return this.identifier_;
    }
    public ByteString getIdentifierBytes(){
       return ByteString.copyFromUtf8(this.identifier_);
    }
    public boolean getIsSolitaire(){
       return this.isSolitaire_;
    }
    public boolean getIsVocal(){
       return this.isVocal_;
    }
    public GeoLocation getLocation(){
       Asset tlocation_ = this.location_;
       if (tlocation_ == null) {
          tlocation_ = GeoLocation.getDefaultInstance();
       }
       return tlocation_;
    }
    public Makeup getMakeup(int p0){
       return this.makeup_.get(p0);
    }
    public int getMakeupCount(){
       return this.makeup_.size();
    }
    public List getMakeupList(){
       return this.makeup_;
    }
    public l getMakeupOrBuilder(int p0){
       return this.makeup_.get(p0);
    }
    public List getMakeupOrBuilderList(){
       return this.makeup_;
    }
    public double getOriginPicHeight(){
       return this.originPicHeight_;
    }
    public double getOriginPicWidth(){
       return this.originPicWidth_;
    }
    public String getPictureCropFile(){
       return this.pictureCropFile_;
    }
    public ByteString getPictureCropFileBytes(){
       return ByteString.copyFromUtf8(this.pictureCropFile_);
    }
    public Asset$PositionType getPositionType(){
       Asset$PositionType positionType = Asset$PositionType.forNumber(this.positionType_);
       if (positionType == null) {
          positionType = Asset$PositionType.UNRECOGNIZED;
       }
       return positionType;
    }
    public int getPositionTypeValue(){
       return this.positionType_;
    }
    public double getPreviewPicHeight(){
       return this.previewPicHeight_;
    }
    public double getPreviewPicWidth(){
       return this.previewPicWidth_;
    }
    public int getRotate(){
       return this.rotate_;
    }
    public TimeRange getSelectedRange(){
       Asset tselectedRan = this.selectedRange_;
       if (tselectedRan == null) {
          tselectedRan = TimeRange.getDefaultInstance();
       }
       return tselectedRan;
    }
    public Asset$ShootInfo getShootInfo(){
       Asset tshootInfo_ = this.shootInfo_;
       if (tshootInfo_ == null) {
          tshootInfo_ = Asset$ShootInfo.getDefaultInstance();
       }
       return tshootInfo_;
    }
    public double getSpeed(){
       return this.speed_;
    }
    public Asset getSubAsset(int p0){
       return this.subAsset_.get(p0);
    }
    public int getSubAssetCount(){
       return this.subAsset_.size();
    }
    public List getSubAssetList(){
       return this.subAsset_;
    }
    public c getSubAssetOrBuilder(int p0){
       return this.subAsset_.get(p0);
    }
    public List getSubAssetOrBuilderList(){
       return this.subAsset_;
    }
    public Transform getTransform(){
       Asset ttransform_ = this.transform_;
       if (ttransform_ == null) {
          ttransform_ = Transform.getDefaultInstance();
       }
       return ttransform_;
    }
    public AssetTransition getTransition(){
       Asset ttransition_ = this.transition_;
       if (ttransition_ == null) {
          ttransition_ = AssetTransition.getDefaultInstance();
       }
       return ttransition_;
    }
    public Asset$Type getType(){
       Asset$Type type = Asset$Type.forNumber(this.type_);
       if (type == null) {
          type = Asset$Type.UNRECOGNIZED;
       }
       return type;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public VisualEffect getVisualEffects(int p0){
       return this.visualEffects_.get(p0);
    }
    public int getVisualEffectsCount(){
       return this.visualEffects_.size();
    }
    public List getVisualEffectsList(){
       return this.visualEffects_;
    }
    public e0 getVisualEffectsOrBuilder(int p0){
       return this.visualEffects_.get(p0);
    }
    public List getVisualEffectsOrBuilderList(){
       return this.visualEffects_;
    }
    public boolean hasAtlasTemplate(){
       boolean b = (this.atlasTemplate_ != null)? true: false;
       return b;
    }
    public boolean hasAttributes(){
       boolean b = (this.attributes_ != null)? true: false;
       return b;
    }
    public boolean hasCropOptions(){
       boolean b = (this.cropOptions_ != null)? true: false;
       return b;
    }
    public boolean hasEncodeInfo(){
       boolean b = (this.encodeInfo_ != null)? true: false;
       return b;
    }
    public boolean hasFineTuningParam(){
       boolean b = (this.fineTuningParam_ != null)? true: false;
       return b;
    }
    public boolean hasLocation(){
       boolean b = (this.location_ != null)? true: false;
       return b;
    }
    public boolean hasSelectedRange(){
       boolean b = (this.selectedRange_ != null)? true: false;
       return b;
    }
    public boolean hasShootInfo(){
       boolean b = (this.shootInfo_ != null)? true: false;
       return b;
    }
    public boolean hasTransform(){
       boolean b = (this.transform_ != null)? true: false;
       return b;
    }
    public boolean hasTransition(){
       boolean b = (this.transition_ != null)? true: false;
       return b;
    }
    public void mergeAtlasTemplate(Template p0){
       Objects.requireNonNull(p0);
       Asset tatlasTempla = this.atlasTemplate_;
       this.atlasTemplate_ = (tatlasTempla != null && tatlasTempla != Template.getDefaultInstance())? Template.newBuilder(this.atlasTemplate_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       Asset tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeCropOptions(CropOptions p0){
       Objects.requireNonNull(p0);
       Asset tcropOptions = this.cropOptions_;
       this.cropOptions_ = (tcropOptions != null && tcropOptions != CropOptions.getDefaultInstance())? CropOptions.newBuilder(this.cropOptions_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeEncodeInfo(Encode p0){
       Objects.requireNonNull(p0);
       Asset tencodeInfo_ = this.encodeInfo_;
       this.encodeInfo_ = (tencodeInfo_ != null && tencodeInfo_ != Encode.getDefaultInstance())? Encode.newBuilder(this.encodeInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFineTuningParam(FineTuningParam p0){
       Objects.requireNonNull(p0);
       Asset tfineTuningP = this.fineTuningParam_;
       this.fineTuningParam_ = (tfineTuningP != null && tfineTuningP != FineTuningParam.getDefaultInstance())? FineTuningParam.newBuilder(this.fineTuningParam_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeLocation(GeoLocation p0){
       Objects.requireNonNull(p0);
       Asset tlocation_ = this.location_;
       this.location_ = (tlocation_ != null && tlocation_ != GeoLocation.getDefaultInstance())? GeoLocation.newBuilder(this.location_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSelectedRange(TimeRange p0){
       Objects.requireNonNull(p0);
       Asset tselectedRan = this.selectedRange_;
       this.selectedRange_ = (tselectedRan != null && tselectedRan != TimeRange.getDefaultInstance())? TimeRange.newBuilder(this.selectedRange_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeShootInfo(Asset$ShootInfo p0){
       Objects.requireNonNull(p0);
       Asset tshootInfo_ = this.shootInfo_;
       this.shootInfo_ = (tshootInfo_ != null && tshootInfo_ != Asset$ShootInfo.getDefaultInstance())? Asset$ShootInfo.newBuilder(this.shootInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeTransform(Transform p0){
       Objects.requireNonNull(p0);
       Asset ttransform_ = this.transform_;
       this.transform_ = (ttransform_ != null && ttransform_ != Transform.getDefaultInstance())? Transform.newBuilder(this.transform_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeTransition(AssetTransition p0){
       Objects.requireNonNull(p0);
       Asset ttransition_ = this.transition_;
       this.transition_ = (ttransition_ != null && ttransition_ != AssetTransition.getDefaultInstance())? AssetTransition.newBuilder(this.transition_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeAe2Effects(int p0){
       this.ensureAe2EffectsIsMutable();
       this.ae2Effects_.remove(p0);
    }
    public void removeAssetAuditFrame(int p0){
       this.ensureAssetAuditFrameIsMutable();
       this.assetAuditFrame_.remove(p0);
    }
    public void removeAssetSegment(int p0){
       this.ensureAssetSegmentIsMutable();
       this.assetSegment_.remove(p0);
    }
    public void removeBeauty(int p0){
       this.ensureBeautyIsMutable();
       this.beauty_.remove(p0);
    }
    public void removeColorFilter(int p0){
       this.ensureColorFilterIsMutable();
       this.colorFilter_.remove(p0);
    }
    public void removeMakeup(int p0){
       this.ensureMakeupIsMutable();
       this.makeup_.remove(p0);
    }
    public void removeSubAsset(int p0){
       this.ensureSubAssetIsMutable();
       this.subAsset_.remove(p0);
    }
    public void removeVisualEffects(int p0){
       this.ensureVisualEffectsIsMutable();
       this.visualEffects_.remove(p0);
    }
    public void setAe2Effects(int p0,AEEffect$b p1){
       this.ensureAe2EffectsIsMutable();
       this.ae2Effects_.set(p0, p1.build());
    }
    public void setAe2Effects(int p0,AEEffect p1){
       Objects.requireNonNull(p1);
       this.ensureAe2EffectsIsMutable();
       this.ae2Effects_.set(p0, p1);
    }
    public void setAlbumId(String p0){
       Objects.requireNonNull(p0);
       this.albumId_ = p0;
    }
    public void setAlbumIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.albumId_ = p0.toStringUtf8();
    }
    public void setAssetAuditFrame(int p0,AuditFrame$b p1){
       this.ensureAssetAuditFrameIsMutable();
       this.assetAuditFrame_.set(p0, p1.build());
    }
    public void setAssetAuditFrame(int p0,AuditFrame p1){
       Objects.requireNonNull(p1);
       this.ensureAssetAuditFrameIsMutable();
       this.assetAuditFrame_.set(p0, p1);
    }
    public void setAssetSegment(int p0,AssetSegment$b p1){
       this.ensureAssetSegmentIsMutable();
       this.assetSegment_.set(p0, p1.build());
    }
    public void setAssetSegment(int p0,AssetSegment p1){
       Objects.requireNonNull(p1);
       this.ensureAssetSegmentIsMutable();
       this.assetSegment_.set(p0, p1);
    }
    public void setAtlasTemplate(Template$b p0){
       this.atlasTemplate_ = p0.build();
    }
    public void setAtlasTemplate(Template p0){
       Objects.requireNonNull(p0);
       this.atlasTemplate_ = p0;
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setAudioPath(String p0){
       Objects.requireNonNull(p0);
       this.audioPath_ = p0;
    }
    public void setAudioPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.audioPath_ = p0.toStringUtf8();
    }
    public void setBeauty(int p0,Beauty$b p1){
       this.ensureBeautyIsMutable();
       this.beauty_.set(p0, p1.build());
    }
    public void setBeauty(int p0,Beauty p1){
       Objects.requireNonNull(p1);
       this.ensureBeautyIsMutable();
       this.beauty_.set(p0, p1);
    }
    public void setColorFilter(int p0,ColorFilter$b p1){
       this.ensureColorFilterIsMutable();
       this.colorFilter_.set(p0, p1.build());
    }
    public void setColorFilter(int p0,ColorFilter p1){
       Objects.requireNonNull(p1);
       this.ensureColorFilterIsMutable();
       this.colorFilter_.set(p0, p1);
    }
    public void setCropOptions(CropOptions$b p0){
       this.cropOptions_ = p0.build();
    }
    public void setCropOptions(CropOptions p0){
       Objects.requireNonNull(p0);
       this.cropOptions_ = p0;
    }
    public void setDisableThemeEffect(boolean p0){
       this.disableThemeEffect_ = p0;
    }
    public void setDuration(double p0){
       this.duration_ = p0;
    }
    public void setEncodeInfo(Encode$b p0){
       this.encodeInfo_ = p0.build();
    }
    public void setEncodeInfo(Encode p0){
       Objects.requireNonNull(p0);
       this.encodeInfo_ = p0;
    }
    public void setFile(String p0){
       Objects.requireNonNull(p0);
       this.file_ = p0;
    }
    public void setFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.file_ = p0.toStringUtf8();
    }
    public void setFineTuningParam(FineTuningParam$b p0){
       this.fineTuningParam_ = p0.build();
    }
    public void setFineTuningParam(FineTuningParam p0){
       Objects.requireNonNull(p0);
       this.fineTuningParam_ = p0;
    }
    public void setIdentifier(String p0){
       Objects.requireNonNull(p0);
       this.identifier_ = p0;
    }
    public void setIdentifierBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.identifier_ = p0.toStringUtf8();
    }
    public void setIsSolitaire(boolean p0){
       this.isSolitaire_ = p0;
    }
    public void setIsVocal(boolean p0){
       this.isVocal_ = p0;
    }
    public void setLocation(GeoLocation$b p0){
       this.location_ = p0.build();
    }
    public void setLocation(GeoLocation p0){
       Objects.requireNonNull(p0);
       this.location_ = p0;
    }
    public void setMakeup(int p0,Makeup$b p1){
       this.ensureMakeupIsMutable();
       this.makeup_.set(p0, p1.build());
    }
    public void setMakeup(int p0,Makeup p1){
       Objects.requireNonNull(p1);
       this.ensureMakeupIsMutable();
       this.makeup_.set(p0, p1);
    }
    public void setOriginPicHeight(double p0){
       this.originPicHeight_ = p0;
    }
    public void setOriginPicWidth(double p0){
       this.originPicWidth_ = p0;
    }
    public void setPictureCropFile(String p0){
       Objects.requireNonNull(p0);
       this.pictureCropFile_ = p0;
    }
    public void setPictureCropFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.pictureCropFile_ = p0.toStringUtf8();
    }
    public void setPositionType(Asset$PositionType p0){
       Objects.requireNonNull(p0);
       this.positionType_ = p0.getNumber();
    }
    public void setPositionTypeValue(int p0){
       this.positionType_ = p0;
    }
    public void setPreviewPicHeight(double p0){
       this.previewPicHeight_ = p0;
    }
    public void setPreviewPicWidth(double p0){
       this.previewPicWidth_ = p0;
    }
    public void setRotate(int p0){
       this.rotate_ = p0;
    }
    public void setSelectedRange(TimeRange$b p0){
       this.selectedRange_ = p0.build();
    }
    public void setSelectedRange(TimeRange p0){
       Objects.requireNonNull(p0);
       this.selectedRange_ = p0;
    }
    public void setShootInfo(Asset$ShootInfo$a p0){
       this.shootInfo_ = p0.build();
    }
    public void setShootInfo(Asset$ShootInfo p0){
       Objects.requireNonNull(p0);
       this.shootInfo_ = p0;
    }
    public void setSpeed(double p0){
       this.speed_ = p0;
    }
    public void setSubAsset(int p0,Asset$b p1){
       this.ensureSubAssetIsMutable();
       this.subAsset_.set(p0, p1.build());
    }
    public void setSubAsset(int p0,Asset p1){
       Objects.requireNonNull(p1);
       this.ensureSubAssetIsMutable();
       this.subAsset_.set(p0, p1);
    }
    public void setTransform(Transform$b p0){
       this.transform_ = p0.build();
    }
    public void setTransform(Transform p0){
       Objects.requireNonNull(p0);
       this.transform_ = p0;
    }
    public void setTransition(AssetTransition$b p0){
       this.transition_ = p0.build();
    }
    public void setTransition(AssetTransition p0){
       Objects.requireNonNull(p0);
       this.transition_ = p0;
    }
    public void setType(Asset$Type p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
    public void setVisualEffects(int p0,VisualEffect$b p1){
       this.ensureVisualEffectsIsMutable();
       this.visualEffects_.set(p0, p1.build());
    }
    public void setVisualEffects(int p0,VisualEffect p1){
       Objects.requireNonNull(p1);
       this.ensureVisualEffectsIsMutable();
       this.visualEffects_.set(p0, p1);
    }
}
