package com.kuaishou.edit.draft.Asset$ShootInfo;
import com.kuaishou.edit.draft.Asset$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.Asset$ShootInfo$a;
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
import com.kuaishou.edit.draft.AuditFrame$b;
import java.lang.Object;
import com.kuaishou.edit.draft.AuditFrame;
import java.util.Objects;
import com.kuaishou.edit.draft.MagicFaceEffectRange$b;
import com.kuaishou.edit.draft.MagicFaceEffectRange;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.Asset$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import z30.k;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.Asset$ShootInfo$CameraType;
import z30.d1;
import com.kuaishou.edit.draft.PrettifyStyle;
import com.kuaishou.edit.draft.RecordBeauty;
import com.kuaishou.edit.draft.RecordFilter;
import com.kuaishou.edit.draft.RecordMagicFace;
import com.kuaishou.edit.draft.RecordMakeup;
import com.kuaishou.edit.draft.RecordMusic;
import com.kuaishou.edit.draft.RecordSlimming;
import com.kuaishou.edit.draft.Asset$ShootInfo$Resolution;
import com.kuaishou.edit.draft.Beauty$b;
import com.kuaishou.edit.draft.PrettifyStyle$c;
import com.kuaishou.edit.draft.RecordBeauty$b;
import com.kuaishou.edit.draft.RecordFilter$b;
import com.kuaishou.edit.draft.RecordMagicFace$b;
import com.kuaishou.edit.draft.RecordMakeup$b;
import com.kuaishou.edit.draft.RecordMusic$b;
import com.kuaishou.edit.draft.RecordSlimming$b;

public final class Asset$ShootInfo extends GeneratedMessageLite implements Asset$c	// class@001707
{
    public Internal$ProtobufList auditFrame_;
    public double averageFrameRate_;
    public String beautifyExtend_;
    public Beauty beauty_;
    public int cameraType_;
    public int countDownCount_;
    public boolean countDownEnabled_;
    public int frameEncryptLength_;
    public int frameEncryptStartIndex_;
    public Internal$ProtobufList magicFaceAttributeFrame_;
    public Internal$ProtobufList magicFaceEffectRange_;
    public PrettifyStyle prettifyStyle_;
    public double rate_;
    public RecordBeauty recordBeauty_;
    public RecordFilter recordFilter_;
    public RecordMagicFace recordMagicface_;
    public RecordMakeup recordMakeup_;
    public RecordMusic recordMusic_;
    public RecordSlimming recordSlimming_;
    public int resolution_;
    public static final Asset$ShootInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Asset$ShootInfo shootInfo = new Asset$ShootInfo();
       Asset$ShootInfo.DEFAULT_INSTANCE = shootInfo;
       GeneratedMessageLite.registerDefaultInstance(Asset$ShootInfo.class, shootInfo);
    }
    public void Asset$ShootInfo(){
       super();
       this.auditFrame_ = GeneratedMessageLite.emptyProtobufList();
       this.magicFaceAttributeFrame_ = GeneratedMessageLite.emptyProtobufList();
       this.magicFaceEffectRange_ = GeneratedMessageLite.emptyProtobufList();
       this.beautifyExtend_ = "";
    }
    public static Asset$ShootInfo getDefaultInstance(){
       return Asset$ShootInfo.DEFAULT_INSTANCE;
    }
    public static Asset$ShootInfo$a newBuilder(){
       return Asset$ShootInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static Asset$ShootInfo$a newBuilder(Asset$ShootInfo p0){
       return Asset$ShootInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Asset$ShootInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0);
    }
    public static Asset$ShootInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Asset$ShootInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0);
    }
    public static Asset$ShootInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Asset$ShootInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0);
    }
    public static Asset$ShootInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Asset$ShootInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0);
    }
    public static Asset$ShootInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Asset$ShootInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0);
    }
    public static Asset$ShootInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Asset$ShootInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0);
    }
    public static Asset$ShootInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Asset$ShootInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Asset$ShootInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllAuditFrame(Iterable p0){
       this.ensureAuditFrameIsMutable();
       AbstractMessageLite.addAll(p0, this.auditFrame_);
    }
    public void addAllMagicFaceAttributeFrame(Iterable p0){
       this.ensureMagicFaceAttributeFrameIsMutable();
       AbstractMessageLite.addAll(p0, this.magicFaceAttributeFrame_);
    }
    public void addAllMagicFaceEffectRange(Iterable p0){
       this.ensureMagicFaceEffectRangeIsMutable();
       AbstractMessageLite.addAll(p0, this.magicFaceEffectRange_);
    }
    public void addAuditFrame(int p0,AuditFrame$b p1){
       this.ensureAuditFrameIsMutable();
       this.auditFrame_.add(p0, p1.build());
    }
    public void addAuditFrame(int p0,AuditFrame p1){
       Objects.requireNonNull(p1);
       this.ensureAuditFrameIsMutable();
       this.auditFrame_.add(p0, p1);
    }
    public void addAuditFrame(AuditFrame$b p0){
       this.ensureAuditFrameIsMutable();
       this.auditFrame_.add(p0.build());
    }
    public void addAuditFrame(AuditFrame p0){
       Objects.requireNonNull(p0);
       this.ensureAuditFrameIsMutable();
       this.auditFrame_.add(p0);
    }
    public void addMagicFaceAttributeFrame(int p0,AuditFrame$b p1){
       this.ensureMagicFaceAttributeFrameIsMutable();
       this.magicFaceAttributeFrame_.add(p0, p1.build());
    }
    public void addMagicFaceAttributeFrame(int p0,AuditFrame p1){
       Objects.requireNonNull(p1);
       this.ensureMagicFaceAttributeFrameIsMutable();
       this.magicFaceAttributeFrame_.add(p0, p1);
    }
    public void addMagicFaceAttributeFrame(AuditFrame$b p0){
       this.ensureMagicFaceAttributeFrameIsMutable();
       this.magicFaceAttributeFrame_.add(p0.build());
    }
    public void addMagicFaceAttributeFrame(AuditFrame p0){
       Objects.requireNonNull(p0);
       this.ensureMagicFaceAttributeFrameIsMutable();
       this.magicFaceAttributeFrame_.add(p0);
    }
    public void addMagicFaceEffectRange(int p0,MagicFaceEffectRange$b p1){
       this.ensureMagicFaceEffectRangeIsMutable();
       this.magicFaceEffectRange_.add(p0, p1.build());
    }
    public void addMagicFaceEffectRange(int p0,MagicFaceEffectRange p1){
       Objects.requireNonNull(p1);
       this.ensureMagicFaceEffectRangeIsMutable();
       this.magicFaceEffectRange_.add(p0, p1);
    }
    public void addMagicFaceEffectRange(MagicFaceEffectRange$b p0){
       this.ensureMagicFaceEffectRangeIsMutable();
       this.magicFaceEffectRange_.add(p0.build());
    }
    public void addMagicFaceEffectRange(MagicFaceEffectRange p0){
       Objects.requireNonNull(p0);
       this.ensureMagicFaceEffectRangeIsMutable();
       this.magicFaceEffectRange_.add(p0);
    }
    public void clearAuditFrame(){
       this.auditFrame_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearAverageFrameRate(){
       this.averageFrameRate_ = 0;
    }
    public void clearBeautifyExtend(){
       this.beautifyExtend_ = Asset$ShootInfo.getDefaultInstance().getBeautifyExtend();
    }
    public void clearBeauty(){
       this.beauty_ = null;
    }
    public void clearCameraType(){
       this.cameraType_ = 0;
    }
    public void clearCountDownCount(){
       this.countDownCount_ = 0;
    }
    public void clearCountDownEnabled(){
       this.countDownEnabled_ = false;
    }
    public void clearFrameEncryptLength(){
       this.frameEncryptLength_ = 0;
    }
    public void clearFrameEncryptStartIndex(){
       this.frameEncryptStartIndex_ = 0;
    }
    public void clearMagicFaceAttributeFrame(){
       this.magicFaceAttributeFrame_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearMagicFaceEffectRange(){
       this.magicFaceEffectRange_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearPrettifyStyle(){
       this.prettifyStyle_ = null;
    }
    public void clearRate(){
       this.rate_ = 0;
    }
    public void clearRecordBeauty(){
       this.recordBeauty_ = null;
    }
    public void clearRecordFilter(){
       this.recordFilter_ = null;
    }
    public void clearRecordMagicface(){
       this.recordMagicface_ = null;
    }
    public void clearRecordMakeup(){
       this.recordMakeup_ = null;
    }
    public void clearRecordMusic(){
       this.recordMusic_ = null;
    }
    public void clearRecordSlimming(){
       this.recordSlimming_ = null;
    }
    public void clearResolution(){
       this.resolution_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = AuditFrame.class;
       int i = 1;
       Asset$a uoa = null;
       switch (Asset$a.a[p0.ordinal()]){
           case 1:
             return new Asset$ShootInfo();
           case 2:
             return new Asset$ShootInfo$a(uoa);
           case 3:
             Object[] objArray = new Object[23];
             objArray[0] = "rate_";
             objArray[i] = "averageFrameRate_";
             objArray[2] = "recordMagicface_";
             objArray[3] = "recordMusic_";
             objArray[4] = "recordFilter_";
             objArray[5] = "recordMakeup_";
             objArray[6] = "recordBeauty_";
             objArray[7] = "beauty_";
             objArray[8] = "prettifyStyle_";
             objArray[9] = "resolution_";
             objArray[10] = "auditFrame_";
             objArray[11] = p1;
             objArray[12] = "countDownEnabled_";
             objArray[13] = "recordSlimming_";
             objArray[14] = "magicFaceAttributeFrame_";
             objArray[15] = p1;
             objArray[16] = "frameEncryptStartIndex_";
             objArray[17] = "frameEncryptLength_";
             objArray[18] = "cameraType_";
             objArray[19] = "countDownCount_";
             objArray[20] = "magicFaceEffectRange_";
             objArray[21] = MagicFaceEffectRange.class;
             objArray[22] = "beautifyExtend_";
             return GeneratedMessageLite.newMessageInfo(Asset$ShootInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x14\xff\x02\xff\x02\xff\x02\xff\x02\x01\x14\x14\xff\x02\xff\x02\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x02\xff\x02\xff\x02\x03\t\x04\t\x05\t\x06\t\x07\t\b\t\t\t\n\f\x0b\x1b\f\x07\r\t\x0e\x1b\x0f\x04\x10\x04\x11\f\x12\x04\x13\x1b\x14\x02\x02\x00", objArray);
           case 4:
             return Asset$ShootInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Asset$ShootInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(Asset$ShootInfo.class);
                pARSER = Asset$ShootInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Asset$ShootInfo.DEFAULT_INSTANCE);
                   Asset$ShootInfo.PARSER = pARSER;
                }
                _monitor_exit(Asset$ShootInfo.class);
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
    public final void ensureAuditFrameIsMutable(){
       if (!this.auditFrame_.isModifiable()) {
          this.auditFrame_ = GeneratedMessageLite.mutableCopy(this.auditFrame_);
       }
       return;
    }
    public final void ensureMagicFaceAttributeFrameIsMutable(){
       if (!this.magicFaceAttributeFrame_.isModifiable()) {
          this.magicFaceAttributeFrame_ = GeneratedMessageLite.mutableCopy(this.magicFaceAttributeFrame_);
       }
       return;
    }
    public final void ensureMagicFaceEffectRangeIsMutable(){
       if (!this.magicFaceEffectRange_.isModifiable()) {
          this.magicFaceEffectRange_ = GeneratedMessageLite.mutableCopy(this.magicFaceEffectRange_);
       }
       return;
    }
    public AuditFrame getAuditFrame(int p0){
       return this.auditFrame_.get(p0);
    }
    public int getAuditFrameCount(){
       return this.auditFrame_.size();
    }
    public List getAuditFrameList(){
       return this.auditFrame_;
    }
    public k getAuditFrameOrBuilder(int p0){
       return this.auditFrame_.get(p0);
    }
    public List getAuditFrameOrBuilderList(){
       return this.auditFrame_;
    }
    public double getAverageFrameRate(){
       return this.averageFrameRate_;
    }
    public String getBeautifyExtend(){
       return this.beautifyExtend_;
    }
    public ByteString getBeautifyExtendBytes(){
       return ByteString.copyFromUtf8(this.beautifyExtend_);
    }
    public Beauty getBeauty(){
       Asset$ShootInfo tbeauty_ = this.beauty_;
       if (tbeauty_ == null) {
          tbeauty_ = Beauty.getDefaultInstance();
       }
       return tbeauty_;
    }
    public Asset$ShootInfo$CameraType getCameraType(){
       Asset$ShootInfo$CameraType shootInfo$Ca = Asset$ShootInfo$CameraType.forNumber(this.cameraType_);
       if (shootInfo$Ca == null) {
          shootInfo$Ca = Asset$ShootInfo$CameraType.UNRECOGNIZED;
       }
       return shootInfo$Ca;
    }
    public int getCameraTypeValue(){
       return this.cameraType_;
    }
    public int getCountDownCount(){
       return this.countDownCount_;
    }
    public boolean getCountDownEnabled(){
       return this.countDownEnabled_;
    }
    public int getFrameEncryptLength(){
       return this.frameEncryptLength_;
    }
    public int getFrameEncryptStartIndex(){
       return this.frameEncryptStartIndex_;
    }
    public AuditFrame getMagicFaceAttributeFrame(int p0){
       return this.magicFaceAttributeFrame_.get(p0);
    }
    public int getMagicFaceAttributeFrameCount(){
       return this.magicFaceAttributeFrame_.size();
    }
    public List getMagicFaceAttributeFrameList(){
       return this.magicFaceAttributeFrame_;
    }
    public k getMagicFaceAttributeFrameOrBuilder(int p0){
       return this.magicFaceAttributeFrame_.get(p0);
    }
    public List getMagicFaceAttributeFrameOrBuilderList(){
       return this.magicFaceAttributeFrame_;
    }
    public MagicFaceEffectRange getMagicFaceEffectRange(int p0){
       return this.magicFaceEffectRange_.get(p0);
    }
    public int getMagicFaceEffectRangeCount(){
       return this.magicFaceEffectRange_.size();
    }
    public List getMagicFaceEffectRangeList(){
       return this.magicFaceEffectRange_;
    }
    public d1 getMagicFaceEffectRangeOrBuilder(int p0){
       return this.magicFaceEffectRange_.get(p0);
    }
    public List getMagicFaceEffectRangeOrBuilderList(){
       return this.magicFaceEffectRange_;
    }
    public PrettifyStyle getPrettifyStyle(){
       Asset$ShootInfo tprettifySty = this.prettifyStyle_;
       if (tprettifySty == null) {
          tprettifySty = PrettifyStyle.getDefaultInstance();
       }
       return tprettifySty;
    }
    public double getRate(){
       return this.rate_;
    }
    public RecordBeauty getRecordBeauty(){
       Asset$ShootInfo trecordBeaut = this.recordBeauty_;
       if (trecordBeaut == null) {
          trecordBeaut = RecordBeauty.getDefaultInstance();
       }
       return trecordBeaut;
    }
    public RecordFilter getRecordFilter(){
       Asset$ShootInfo trecordFilte = this.recordFilter_;
       if (trecordFilte == null) {
          trecordFilte = RecordFilter.getDefaultInstance();
       }
       return trecordFilte;
    }
    public RecordMagicFace getRecordMagicface(){
       Asset$ShootInfo trecordMagic = this.recordMagicface_;
       if (trecordMagic == null) {
          trecordMagic = RecordMagicFace.getDefaultInstance();
       }
       return trecordMagic;
    }
    public RecordMakeup getRecordMakeup(){
       Asset$ShootInfo trecordMakeu = this.recordMakeup_;
       if (trecordMakeu == null) {
          trecordMakeu = RecordMakeup.getDefaultInstance();
       }
       return trecordMakeu;
    }
    public RecordMusic getRecordMusic(){
       Asset$ShootInfo trecordMusic = this.recordMusic_;
       if (trecordMusic == null) {
          trecordMusic = RecordMusic.getDefaultInstance();
       }
       return trecordMusic;
    }
    public RecordSlimming getRecordSlimming(){
       Asset$ShootInfo trecordSlimm = this.recordSlimming_;
       if (trecordSlimm == null) {
          trecordSlimm = RecordSlimming.getDefaultInstance();
       }
       return trecordSlimm;
    }
    public Asset$ShootInfo$Resolution getResolution(){
       Asset$ShootInfo$Resolution shootInfo$Re = Asset$ShootInfo$Resolution.forNumber(this.resolution_);
       if (shootInfo$Re == null) {
          shootInfo$Re = Asset$ShootInfo$Resolution.UNRECOGNIZED;
       }
       return shootInfo$Re;
    }
    public int getResolutionValue(){
       return this.resolution_;
    }
    public boolean hasBeauty(){
       boolean b = (this.beauty_ != null)? true: false;
       return b;
    }
    public boolean hasPrettifyStyle(){
       boolean b = (this.prettifyStyle_ != null)? true: false;
       return b;
    }
    public boolean hasRecordBeauty(){
       boolean b = (this.recordBeauty_ != null)? true: false;
       return b;
    }
    public boolean hasRecordFilter(){
       boolean b = (this.recordFilter_ != null)? true: false;
       return b;
    }
    public boolean hasRecordMagicface(){
       boolean b = (this.recordMagicface_ != null)? true: false;
       return b;
    }
    public boolean hasRecordMakeup(){
       boolean b = (this.recordMakeup_ != null)? true: false;
       return b;
    }
    public boolean hasRecordMusic(){
       boolean b = (this.recordMusic_ != null)? true: false;
       return b;
    }
    public boolean hasRecordSlimming(){
       boolean b = (this.recordSlimming_ != null)? true: false;
       return b;
    }
    public void mergeBeauty(Beauty p0){
       Objects.requireNonNull(p0);
       Asset$ShootInfo tbeauty_ = this.beauty_;
       this.beauty_ = (tbeauty_ != null && tbeauty_ != Beauty.getDefaultInstance())? Beauty.newBuilder(this.beauty_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergePrettifyStyle(PrettifyStyle p0){
       Objects.requireNonNull(p0);
       Asset$ShootInfo tprettifySty = this.prettifyStyle_;
       this.prettifyStyle_ = (tprettifySty != null && tprettifySty != PrettifyStyle.getDefaultInstance())? PrettifyStyle.newBuilder(this.prettifyStyle_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRecordBeauty(RecordBeauty p0){
       Objects.requireNonNull(p0);
       Asset$ShootInfo trecordBeaut = this.recordBeauty_;
       this.recordBeauty_ = (trecordBeaut != null && trecordBeaut != RecordBeauty.getDefaultInstance())? RecordBeauty.newBuilder(this.recordBeauty_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRecordFilter(RecordFilter p0){
       Objects.requireNonNull(p0);
       Asset$ShootInfo trecordFilte = this.recordFilter_;
       this.recordFilter_ = (trecordFilte != null && trecordFilte != RecordFilter.getDefaultInstance())? RecordFilter.newBuilder(this.recordFilter_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRecordMagicface(RecordMagicFace p0){
       Objects.requireNonNull(p0);
       Asset$ShootInfo trecordMagic = this.recordMagicface_;
       this.recordMagicface_ = (trecordMagic != null && trecordMagic != RecordMagicFace.getDefaultInstance())? RecordMagicFace.newBuilder(this.recordMagicface_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRecordMakeup(RecordMakeup p0){
       Objects.requireNonNull(p0);
       Asset$ShootInfo trecordMakeu = this.recordMakeup_;
       this.recordMakeup_ = (trecordMakeu != null && trecordMakeu != RecordMakeup.getDefaultInstance())? RecordMakeup.newBuilder(this.recordMakeup_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRecordMusic(RecordMusic p0){
       Objects.requireNonNull(p0);
       Asset$ShootInfo trecordMusic = this.recordMusic_;
       this.recordMusic_ = (trecordMusic != null && trecordMusic != RecordMusic.getDefaultInstance())? RecordMusic.newBuilder(this.recordMusic_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRecordSlimming(RecordSlimming p0){
       Objects.requireNonNull(p0);
       Asset$ShootInfo trecordSlimm = this.recordSlimming_;
       this.recordSlimming_ = (trecordSlimm != null && trecordSlimm != RecordSlimming.getDefaultInstance())? RecordSlimming.newBuilder(this.recordSlimming_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeAuditFrame(int p0){
       this.ensureAuditFrameIsMutable();
       this.auditFrame_.remove(p0);
    }
    public void removeMagicFaceAttributeFrame(int p0){
       this.ensureMagicFaceAttributeFrameIsMutable();
       this.magicFaceAttributeFrame_.remove(p0);
    }
    public void removeMagicFaceEffectRange(int p0){
       this.ensureMagicFaceEffectRangeIsMutable();
       this.magicFaceEffectRange_.remove(p0);
    }
    public void setAuditFrame(int p0,AuditFrame$b p1){
       this.ensureAuditFrameIsMutable();
       this.auditFrame_.set(p0, p1.build());
    }
    public void setAuditFrame(int p0,AuditFrame p1){
       Objects.requireNonNull(p1);
       this.ensureAuditFrameIsMutable();
       this.auditFrame_.set(p0, p1);
    }
    public void setAverageFrameRate(double p0){
       this.averageFrameRate_ = p0;
    }
    public void setBeautifyExtend(String p0){
       Objects.requireNonNull(p0);
       this.beautifyExtend_ = p0;
    }
    public void setBeautifyExtendBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.beautifyExtend_ = p0.toStringUtf8();
    }
    public void setBeauty(Beauty$b p0){
       this.beauty_ = p0.build();
    }
    public void setBeauty(Beauty p0){
       Objects.requireNonNull(p0);
       this.beauty_ = p0;
    }
    public void setCameraType(Asset$ShootInfo$CameraType p0){
       Objects.requireNonNull(p0);
       this.cameraType_ = p0.getNumber();
    }
    public void setCameraTypeValue(int p0){
       this.cameraType_ = p0;
    }
    public void setCountDownCount(int p0){
       this.countDownCount_ = p0;
    }
    public void setCountDownEnabled(boolean p0){
       this.countDownEnabled_ = p0;
    }
    public void setFrameEncryptLength(int p0){
       this.frameEncryptLength_ = p0;
    }
    public void setFrameEncryptStartIndex(int p0){
       this.frameEncryptStartIndex_ = p0;
    }
    public void setMagicFaceAttributeFrame(int p0,AuditFrame$b p1){
       this.ensureMagicFaceAttributeFrameIsMutable();
       this.magicFaceAttributeFrame_.set(p0, p1.build());
    }
    public void setMagicFaceAttributeFrame(int p0,AuditFrame p1){
       Objects.requireNonNull(p1);
       this.ensureMagicFaceAttributeFrameIsMutable();
       this.magicFaceAttributeFrame_.set(p0, p1);
    }
    public void setMagicFaceEffectRange(int p0,MagicFaceEffectRange$b p1){
       this.ensureMagicFaceEffectRangeIsMutable();
       this.magicFaceEffectRange_.set(p0, p1.build());
    }
    public void setMagicFaceEffectRange(int p0,MagicFaceEffectRange p1){
       Objects.requireNonNull(p1);
       this.ensureMagicFaceEffectRangeIsMutable();
       this.magicFaceEffectRange_.set(p0, p1);
    }
    public void setPrettifyStyle(PrettifyStyle$c p0){
       this.prettifyStyle_ = p0.build();
    }
    public void setPrettifyStyle(PrettifyStyle p0){
       Objects.requireNonNull(p0);
       this.prettifyStyle_ = p0;
    }
    public void setRate(double p0){
       this.rate_ = p0;
    }
    public void setRecordBeauty(RecordBeauty$b p0){
       this.recordBeauty_ = p0.build();
    }
    public void setRecordBeauty(RecordBeauty p0){
       Objects.requireNonNull(p0);
       this.recordBeauty_ = p0;
    }
    public void setRecordFilter(RecordFilter$b p0){
       this.recordFilter_ = p0.build();
    }
    public void setRecordFilter(RecordFilter p0){
       Objects.requireNonNull(p0);
       this.recordFilter_ = p0;
    }
    public void setRecordMagicface(RecordMagicFace$b p0){
       this.recordMagicface_ = p0.build();
    }
    public void setRecordMagicface(RecordMagicFace p0){
       Objects.requireNonNull(p0);
       this.recordMagicface_ = p0;
    }
    public void setRecordMakeup(RecordMakeup$b p0){
       this.recordMakeup_ = p0.build();
    }
    public void setRecordMakeup(RecordMakeup p0){
       Objects.requireNonNull(p0);
       this.recordMakeup_ = p0;
    }
    public void setRecordMusic(RecordMusic$b p0){
       this.recordMusic_ = p0.build();
    }
    public void setRecordMusic(RecordMusic p0){
       Objects.requireNonNull(p0);
       this.recordMusic_ = p0;
    }
    public void setRecordSlimming(RecordSlimming$b p0){
       this.recordSlimming_ = p0.build();
    }
    public void setRecordSlimming(RecordSlimming p0){
       Objects.requireNonNull(p0);
       this.recordSlimming_ = p0;
    }
    public void setResolution(Asset$ShootInfo$Resolution p0){
       Objects.requireNonNull(p0);
       this.resolution_ = p0.getNumber();
    }
    public void setResolutionValue(int p0){
       this.resolution_ = p0;
    }
}
