package com.kuaishou.edit.draft.AssetSegment;
import z30.d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.AssetSegment$b;
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
import com.kuaishou.edit.draft.Beauty$b;
import java.lang.Object;
import com.kuaishou.edit.draft.Beauty;
import java.util.Objects;
import com.kuaishou.edit.draft.ColorFilter$b;
import com.kuaishou.edit.draft.ColorFilter;
import com.kuaishou.edit.draft.Makeup$b;
import com.kuaishou.edit.draft.Makeup;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.AssetSegment$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.Template;
import com.kuaishou.edit.draft.d;
import com.kuaishou.edit.draft.f;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.FineTuningParam;
import com.kuaishou.edit.draft.l;
import com.kuaishou.edit.draft.Template$b;
import com.kuaishou.edit.draft.CropOptions$b;
import com.kuaishou.edit.draft.FineTuningParam$b;

public final class AssetSegment extends GeneratedMessageLite implements d	// class@00171a
{
    public Template atlasTemplate_;
    public Internal$ProtobufList beauty_;
    public Internal$ProtobufList colorFilter_;
    public String cropFile_;
    public CropOptions cropOptions_;
    public String file_;
    public FineTuningParam fineTuningParam_;
    public String identifier_;
    public Internal$ProtobufList makeup_;
    public double originPicHeight_;
    public double originPicWidth_;
    public static final AssetSegment DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AssetSegment uAssetSegmen = new AssetSegment();
       AssetSegment.DEFAULT_INSTANCE = uAssetSegmen;
       GeneratedMessageLite.registerDefaultInstance(AssetSegment.class, uAssetSegmen);
    }
    public void AssetSegment(){
       super();
       this.file_ = "";
       this.identifier_ = "";
       this.cropFile_ = "";
       this.makeup_ = GeneratedMessageLite.emptyProtobufList();
       this.beauty_ = GeneratedMessageLite.emptyProtobufList();
       this.colorFilter_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static AssetSegment getDefaultInstance(){
       return AssetSegment.DEFAULT_INSTANCE;
    }
    public static AssetSegment$b newBuilder(){
       return AssetSegment.DEFAULT_INSTANCE.createBuilder();
    }
    public static AssetSegment$b newBuilder(AssetSegment p0){
       return AssetSegment.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AssetSegment parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AssetSegment.DEFAULT_INSTANCE, p0);
    }
    public static AssetSegment parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AssetSegment.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetSegment parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AssetSegment.DEFAULT_INSTANCE, p0);
    }
    public static AssetSegment parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetSegment.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetSegment parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AssetSegment.DEFAULT_INSTANCE, p0);
    }
    public static AssetSegment parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetSegment.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetSegment parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AssetSegment.DEFAULT_INSTANCE, p0);
    }
    public static AssetSegment parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetSegment.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetSegment parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AssetSegment.DEFAULT_INSTANCE, p0);
    }
    public static AssetSegment parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetSegment.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetSegment parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AssetSegment.DEFAULT_INSTANCE, p0);
    }
    public static AssetSegment parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetSegment.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AssetSegment.DEFAULT_INSTANCE.getParserForType();
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
    public void clearAtlasTemplate(){
       this.atlasTemplate_ = null;
    }
    public void clearBeauty(){
       this.beauty_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearColorFilter(){
       this.colorFilter_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearCropFile(){
       this.cropFile_ = AssetSegment.getDefaultInstance().getCropFile();
    }
    public void clearCropOptions(){
       this.cropOptions_ = null;
    }
    public void clearFile(){
       this.file_ = AssetSegment.getDefaultInstance().getFile();
    }
    public void clearFineTuningParam(){
       this.fineTuningParam_ = null;
    }
    public void clearIdentifier(){
       this.identifier_ = AssetSegment.getDefaultInstance().getIdentifier();
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
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AssetSegment$a.a[p0.ordinal()]){
           case 1:
             return new AssetSegment();
           case 2:
             return new AssetSegment$b(p2);
           case 3:
             Object[] objArray = new Object[14];
             objArray[0] = "file_";
             objArray[i] = "identifier_";
             objArray[2] = "cropOptions_";
             objArray[3] = "cropFile_";
             objArray[4] = "fineTuningParam_";
             objArray[5] = "makeup_";
             objArray[6] = Makeup.class;
             objArray[7] = "beauty_";
             objArray[8] = Beauty.class;
             objArray[9] = "colorFilter_";
             objArray[10] = ColorFilter.class;
             objArray[11] = "atlasTemplate_";
             objArray[12] = "originPicWidth_";
             objArray[13] = "originPicHeight_";
             return GeneratedMessageLite.newMessageInfo(AssetSegment.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0b\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x0b\xff\x02\xff\x02\x03\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\t\x04\x02\x02\x05\t\x06\x1b\x07\x1b\b\x1b\t\t\n\xff\x02\xff\x02\x0b\xff\x02\xff\x02\x00", objArray);
           case 4:
             return AssetSegment.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AssetSegment.PARSER;
             if (pARSER == null) {
                _monitor_enter(AssetSegment.class);
                pARSER = AssetSegment.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AssetSegment.DEFAULT_INSTANCE);
                   AssetSegment.PARSER = pARSER;
                }
                _monitor_exit(AssetSegment.class);
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
    public Template getAtlasTemplate(){
       AssetSegment tatlasTempla = this.atlasTemplate_;
       if (tatlasTempla == null) {
          tatlasTempla = Template.getDefaultInstance();
       }
       return tatlasTempla;
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
    public String getCropFile(){
       return this.cropFile_;
    }
    public ByteString getCropFileBytes(){
       return ByteString.copyFromUtf8(this.cropFile_);
    }
    public CropOptions getCropOptions(){
       AssetSegment tcropOptions = this.cropOptions_;
       if (tcropOptions == null) {
          tcropOptions = CropOptions.getDefaultInstance();
       }
       return tcropOptions;
    }
    public String getFile(){
       return this.file_;
    }
    public ByteString getFileBytes(){
       return ByteString.copyFromUtf8(this.file_);
    }
    public FineTuningParam getFineTuningParam(){
       AssetSegment tfineTuningP = this.fineTuningParam_;
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
    public boolean hasAtlasTemplate(){
       boolean b = (this.atlasTemplate_ != null)? true: false;
       return b;
    }
    public boolean hasCropOptions(){
       boolean b = (this.cropOptions_ != null)? true: false;
       return b;
    }
    public boolean hasFineTuningParam(){
       boolean b = (this.fineTuningParam_ != null)? true: false;
       return b;
    }
    public void mergeAtlasTemplate(Template p0){
       Objects.requireNonNull(p0);
       AssetSegment tatlasTempla = this.atlasTemplate_;
       this.atlasTemplate_ = (tatlasTempla != null && tatlasTempla != Template.getDefaultInstance())? Template.newBuilder(this.atlasTemplate_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeCropOptions(CropOptions p0){
       Objects.requireNonNull(p0);
       AssetSegment tcropOptions = this.cropOptions_;
       this.cropOptions_ = (tcropOptions != null && tcropOptions != CropOptions.getDefaultInstance())? CropOptions.newBuilder(this.cropOptions_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFineTuningParam(FineTuningParam p0){
       Objects.requireNonNull(p0);
       AssetSegment tfineTuningP = this.fineTuningParam_;
       this.fineTuningParam_ = (tfineTuningP != null && tfineTuningP != FineTuningParam.getDefaultInstance())? FineTuningParam.newBuilder(this.fineTuningParam_).mergeFrom(p0).buildPartial(): p0;
       return;
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
    public void setAtlasTemplate(Template$b p0){
       this.atlasTemplate_ = p0.build();
    }
    public void setAtlasTemplate(Template p0){
       Objects.requireNonNull(p0);
       this.atlasTemplate_ = p0;
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
    public void setCropFile(String p0){
       Objects.requireNonNull(p0);
       this.cropFile_ = p0;
    }
    public void setCropFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.cropFile_ = p0.toStringUtf8();
    }
    public void setCropOptions(CropOptions$b p0){
       this.cropOptions_ = p0.build();
    }
    public void setCropOptions(CropOptions p0){
       Objects.requireNonNull(p0);
       this.cropOptions_ = p0;
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
}
