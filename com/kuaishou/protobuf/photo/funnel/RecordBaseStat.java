package com.kuaishou.protobuf.photo.funnel.RecordBaseStat;
import com.kuaishou.protobuf.photo.funnel.e;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$b;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
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
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$CameraPipelineTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordCoreFunctionStat;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PageTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordToEditTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PhotoTimestampStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$CameraPipelineTimestampStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordCoreFunctionStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PageTimestampStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordToEditTimestampStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PhotoTimestampStat$a;

public final class RecordBaseStat extends GeneratedMessageLite implements e	// class@000e5c
{
    public float audioStannisTimecost_;
    public RecordBaseStat$CameraPipelineTimestampStat cameraPipeline_;
    public RecordBaseStat$RecordCoreFunctionStat chorusTimecost_;
    public float componentsTimeCost_;
    public String enterShootTimes_;
    public boolean isRecordSuccess_;
    public RecordBaseStat$RecordCoreFunctionStat lipSynchTimecost_;
    public float multipleShotsTimecost_;
    public RecordBaseStat$RecordCoreFunctionStat pLCTimecost_;
    public Internal$ProtobufList plugin_;
    public RecordBaseStat$PageTimestampStat postVCTimestamp_;
    public RecordBaseStat$RecordToEditTimestampStat recordToEditTimecost_;
    public RecordBaseStat$RecordCoreFunctionStat sameFollowTimecost_;
    public RecordBaseStat$RecordCoreFunctionStat sameFrameTimecost_;
    public float singleShotsTimecost_;
    public RecordBaseStat$PhotoTimestampStat singleShots_;
    public float switchCameraTimecost_;
    public RecordBaseStat$PageTimestampStat videorecordVCTimestamp_;
    public float westerosInitTimecost_;
    public static final RecordBaseStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       RecordBaseStat recordBaseSt = new RecordBaseStat();
       RecordBaseStat.DEFAULT_INSTANCE = recordBaseSt;
       GeneratedMessageLite.registerDefaultInstance(RecordBaseStat.class, recordBaseSt);
    }
    public void RecordBaseStat(){
       super();
       this.plugin_ = GeneratedMessageLite.emptyProtobufList();
       this.enterShootTimes_ = "";
    }
    public static RecordBaseStat getDefaultInstance(){
       return RecordBaseStat.DEFAULT_INSTANCE;
    }
    public static RecordBaseStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static RecordBaseStat$b newBuilder(RecordBaseStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static RecordBaseStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordBaseStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordBaseStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordBaseStat.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordBaseStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordBaseStat.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordBaseStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, RecordBaseStat.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordBaseStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllPlugin(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "19")) {
          return;
       }
       this.ensurePluginIsMutable();
       AbstractMessageLite.addAll(p0, this.plugin_);
       return;
    }
    public void addPlugin(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "18")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensurePluginIsMutable();
       this.plugin_.add(p0);
       return;
    }
    public void addPluginBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "21")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensurePluginIsMutable();
       this.plugin_.add(p0.toStringUtf8());
       return;
    }
    public void clearAudioStannisTimecost(){
       this.audioStannisTimecost_ = 0;
    }
    public void clearCameraPipeline(){
       this.cameraPipeline_ = null;
    }
    public void clearChorusTimecost(){
       this.chorusTimecost_ = null;
    }
    public void clearComponentsTimeCost(){
       this.componentsTimeCost_ = 0;
    }
    public void clearEnterShootTimes(){
       if (PatchProxy.applyVoid(null, this, RecordBaseStat.class, "52")) {
          return;
       }
       this.enterShootTimes_ = RecordBaseStat.getDefaultInstance().getEnterShootTimes();
       return;
    }
    public void clearIsRecordSuccess(){
       this.isRecordSuccess_ = false;
    }
    public void clearLipSynchTimecost(){
       this.lipSynchTimecost_ = null;
    }
    public void clearMultipleShotsTimecost(){
       this.multipleShotsTimecost_ = 0;
    }
    public void clearPLCTimecost(){
       this.pLCTimecost_ = null;
    }
    public void clearPlugin(){
       if (PatchProxy.applyVoid(null, this, RecordBaseStat.class, "20")) {
          return;
       }
       this.plugin_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearPostVCTimestamp(){
       this.postVCTimestamp_ = null;
    }
    public void clearRecordToEditTimecost(){
       this.recordToEditTimecost_ = null;
    }
    public void clearSameFollowTimecost(){
       this.sameFollowTimecost_ = null;
    }
    public void clearSameFrameTimecost(){
       this.sameFrameTimecost_ = null;
    }
    public void clearSingleShots(){
       this.singleShots_ = null;
    }
    public void clearSingleShotsTimecost(){
       this.singleShotsTimecost_ = 0;
    }
    public void clearSwitchCameraTimecost(){
       this.switchCameraTimecost_ = 0;
    }
    public void clearVideorecordVCTimestamp(){
       this.videorecordVCTimestamp_ = null;
    }
    public void clearWesterosInitTimecost(){
       this.westerosInitTimecost_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecordBaseStat.class, "68");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (RecordBaseStat$a.a[p0.ordinal()]){
           case 1:
             return new RecordBaseStat();
           case 2:
             return new RecordBaseStat$b(p2);
           case 3:
             Object[] objArray = new Object[19];
             objArray[0] = "postVCTimestamp_";
             objArray[i] = "videorecordVCTimestamp_";
             objArray[2] = "componentsTimeCost_";
             objArray[3] = "cameraPipeline_";
             objArray[4] = "switchCameraTimecost_";
             objArray[5] = "audioStannisTimecost_";
             objArray[6] = "westerosInitTimecost_";
             objArray[7] = "plugin_";
             objArray[8] = "multipleShotsTimecost_";
             objArray[9] = "singleShotsTimecost_";
             objArray[10] = "singleShots_";
             objArray[11] = "sameFrameTimecost_";
             objArray[12] = "sameFollowTimecost_";
             objArray[13] = "lipSynchTimecost_";
             objArray[14] = "chorusTimecost_";
             objArray[15] = "pLCTimecost_";
             objArray[16] = "isRecordSuccess_";
             objArray[17] = "recordToEditTimecost_";
             objArray[18] = "enterShootTimes_";
             return GeneratedMessageLite.newMessageInfo(RecordBaseStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x13\xff\x02\xff\x02\xff\x02\xff\x02\x01\x13\x13\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\t\x02\t\x03\x01\x04\t\x05\x01\x06\x01\x07\x01\b\x02\x02\t\x01\n\x01\x0b\t\f\t\r\t\x0e\t\x0f\t\x10\t\x11\x07\x12\t\x13\x02\x02\x00", objArray);
           case 4:
             return RecordBaseStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = RecordBaseStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(RecordBaseStat.class);
                pARSER = RecordBaseStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(RecordBaseStat.DEFAULT_INSTANCE);
                   RecordBaseStat.PARSER = pARSER;
                }
                _monitor_exit(RecordBaseStat.class);
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
    public final void ensurePluginIsMutable(){
       if (PatchProxy.applyVoid(null, this, RecordBaseStat.class, "16")) {
          return;
       }
       if (!this.plugin_.isModifiable()) {
          this.plugin_ = GeneratedMessageLite.mutableCopy(this.plugin_);
       }
       return;
    }
    public float getAudioStannisTimecost(){
       return this.audioStannisTimecost_;
    }
    public RecordBaseStat$CameraPipelineTimestampStat getCameraPipeline(){
       RecordBaseStat$CameraPipelineTimestampStat defaultInsta;
       RecordBaseStat obj = PatchProxy.apply(null, this, RecordBaseStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.cameraPipeline_;
       if (obj == null) {
          defaultInsta = RecordBaseStat$CameraPipelineTimestampStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public RecordBaseStat$RecordCoreFunctionStat getChorusTimecost(){
       RecordBaseStat$RecordCoreFunctionStat defaultInsta;
       RecordBaseStat obj = PatchProxy.apply(null, this, RecordBaseStat.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.chorusTimecost_;
       if (obj == null) {
          defaultInsta = RecordBaseStat$RecordCoreFunctionStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public float getComponentsTimeCost(){
       return this.componentsTimeCost_;
    }
    public String getEnterShootTimes(){
       return this.enterShootTimes_;
    }
    public ByteString getEnterShootTimesBytes(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.enterShootTimes_);
    }
    public boolean getIsRecordSuccess(){
       return this.isRecordSuccess_;
    }
    public RecordBaseStat$RecordCoreFunctionStat getLipSynchTimecost(){
       RecordBaseStat$RecordCoreFunctionStat defaultInsta;
       RecordBaseStat obj = PatchProxy.apply(null, this, RecordBaseStat.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.lipSynchTimecost_;
       if (obj == null) {
          defaultInsta = RecordBaseStat$RecordCoreFunctionStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public float getMultipleShotsTimecost(){
       return this.multipleShotsTimecost_;
    }
    public RecordBaseStat$RecordCoreFunctionStat getPLCTimecost(){
       RecordBaseStat$RecordCoreFunctionStat defaultInsta;
       RecordBaseStat obj = PatchProxy.apply(null, this, RecordBaseStat.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.pLCTimecost_;
       if (obj == null) {
          defaultInsta = RecordBaseStat$RecordCoreFunctionStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public String getPlugin(int p0){
       RecordBaseStat recordBaseSt = RecordBaseStat.class;
       if (PatchProxy.isSupport(recordBaseSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, recordBaseSt, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.plugin_.get(p0);
    }
    public ByteString getPluginBytes(int p0){
       RecordBaseStat recordBaseSt = RecordBaseStat.class;
       if (PatchProxy.isSupport(recordBaseSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, recordBaseSt, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ByteString.copyFromUtf8(this.plugin_.get(p0));
    }
    public int getPluginCount(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.plugin_.size();
    }
    public List getPluginList(){
       return this.plugin_;
    }
    public RecordBaseStat$PageTimestampStat getPostVCTimestamp(){
       RecordBaseStat$PageTimestampStat defaultInsta;
       RecordBaseStat obj = PatchProxy.apply(null, this, RecordBaseStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.postVCTimestamp_;
       if (obj == null) {
          defaultInsta = RecordBaseStat$PageTimestampStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public RecordBaseStat$RecordToEditTimestampStat getRecordToEditTimecost(){
       RecordBaseStat$RecordToEditTimestampStat defaultInsta;
       RecordBaseStat obj = PatchProxy.apply(null, this, RecordBaseStat.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.recordToEditTimecost_;
       if (obj == null) {
          defaultInsta = RecordBaseStat$RecordToEditTimestampStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public RecordBaseStat$RecordCoreFunctionStat getSameFollowTimecost(){
       RecordBaseStat$RecordCoreFunctionStat defaultInsta;
       RecordBaseStat obj = PatchProxy.apply(null, this, RecordBaseStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.sameFollowTimecost_;
       if (obj == null) {
          defaultInsta = RecordBaseStat$RecordCoreFunctionStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public RecordBaseStat$RecordCoreFunctionStat getSameFrameTimecost(){
       RecordBaseStat$RecordCoreFunctionStat defaultInsta;
       RecordBaseStat obj = PatchProxy.apply(null, this, RecordBaseStat.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.sameFrameTimecost_;
       if (obj == null) {
          defaultInsta = RecordBaseStat$RecordCoreFunctionStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public RecordBaseStat$PhotoTimestampStat getSingleShots(){
       RecordBaseStat$PhotoTimestampStat defaultInsta;
       RecordBaseStat obj = PatchProxy.apply(null, this, RecordBaseStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.singleShots_;
       if (obj == null) {
          defaultInsta = RecordBaseStat$PhotoTimestampStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public float getSingleShotsTimecost(){
       return this.singleShotsTimecost_;
    }
    public float getSwitchCameraTimecost(){
       return this.switchCameraTimecost_;
    }
    public RecordBaseStat$PageTimestampStat getVideorecordVCTimestamp(){
       RecordBaseStat$PageTimestampStat defaultInsta;
       RecordBaseStat obj = PatchProxy.apply(null, this, RecordBaseStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.videorecordVCTimestamp_;
       if (obj == null) {
          defaultInsta = RecordBaseStat$PageTimestampStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public float getWesterosInitTimecost(){
       return this.westerosInitTimecost_;
    }
    public boolean hasCameraPipeline(){
       boolean b = (this.cameraPipeline_ != null)? true: false;
       return b;
    }
    public boolean hasChorusTimecost(){
       boolean b = (this.chorusTimecost_ != null)? true: false;
       return b;
    }
    public boolean hasLipSynchTimecost(){
       boolean b = (this.lipSynchTimecost_ != null)? true: false;
       return b;
    }
    public boolean hasPLCTimecost(){
       boolean b = (this.pLCTimecost_ != null)? true: false;
       return b;
    }
    public boolean hasPostVCTimestamp(){
       boolean b = (this.postVCTimestamp_ != null)? true: false;
       return b;
    }
    public boolean hasRecordToEditTimecost(){
       boolean b = (this.recordToEditTimecost_ != null)? true: false;
       return b;
    }
    public boolean hasSameFollowTimecost(){
       boolean b = (this.sameFollowTimecost_ != null)? true: false;
       return b;
    }
    public boolean hasSameFrameTimecost(){
       boolean b = (this.sameFrameTimecost_ != null)? true: false;
       return b;
    }
    public boolean hasSingleShots(){
       boolean b = (this.singleShots_ != null)? true: false;
       return b;
    }
    public boolean hasVideorecordVCTimestamp(){
       boolean b = (this.videorecordVCTimestamp_ != null)? true: false;
       return b;
    }
    public void mergeCameraPipeline(RecordBaseStat$CameraPipelineTimestampStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordBaseStat tcameraPipel = this.cameraPipeline_;
       this.cameraPipeline_ = (tcameraPipel != null && tcameraPipel != RecordBaseStat$CameraPipelineTimestampStat.getDefaultInstance())? RecordBaseStat$CameraPipelineTimestampStat.newBuilder(this.cameraPipeline_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeChorusTimecost(RecordBaseStat$RecordCoreFunctionStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "41")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordBaseStat tchorusTimec = this.chorusTimecost_;
       this.chorusTimecost_ = (tchorusTimec != null && tchorusTimec != RecordBaseStat$RecordCoreFunctionStat.getDefaultInstance())? RecordBaseStat$RecordCoreFunctionStat.newBuilder(this.chorusTimecost_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeLipSynchTimecost(RecordBaseStat$RecordCoreFunctionStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "37")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordBaseStat tlipSynchTim = this.lipSynchTimecost_;
       this.lipSynchTimecost_ = (tlipSynchTim != null && tlipSynchTim != RecordBaseStat$RecordCoreFunctionStat.getDefaultInstance())? RecordBaseStat$RecordCoreFunctionStat.newBuilder(this.lipSynchTimecost_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergePLCTimecost(RecordBaseStat$RecordCoreFunctionStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "45")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordBaseStat tpLCTimecost = this.pLCTimecost_;
       this.pLCTimecost_ = (tpLCTimecost != null && tpLCTimecost != RecordBaseStat$RecordCoreFunctionStat.getDefaultInstance())? RecordBaseStat$RecordCoreFunctionStat.newBuilder(this.pLCTimecost_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergePostVCTimestamp(RecordBaseStat$PageTimestampStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordBaseStat tpostVCTimes = this.postVCTimestamp_;
       this.postVCTimestamp_ = (tpostVCTimes != null && tpostVCTimes != RecordBaseStat$PageTimestampStat.getDefaultInstance())? RecordBaseStat$PageTimestampStat.newBuilder(this.postVCTimestamp_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRecordToEditTimecost(RecordBaseStat$RecordToEditTimestampStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "49")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordBaseStat trecordToEdi = this.recordToEditTimecost_;
       this.recordToEditTimecost_ = (trecordToEdi != null && trecordToEdi != RecordBaseStat$RecordToEditTimestampStat.getDefaultInstance())? RecordBaseStat$RecordToEditTimestampStat.newBuilder(this.recordToEditTimecost_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSameFollowTimecost(RecordBaseStat$RecordCoreFunctionStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "33")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordBaseStat tsameFollowT = this.sameFollowTimecost_;
       this.sameFollowTimecost_ = (tsameFollowT != null && tsameFollowT != RecordBaseStat$RecordCoreFunctionStat.getDefaultInstance())? RecordBaseStat$RecordCoreFunctionStat.newBuilder(this.sameFollowTimecost_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSameFrameTimecost(RecordBaseStat$RecordCoreFunctionStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "29")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordBaseStat tsameFrameTi = this.sameFrameTimecost_;
       this.sameFrameTimecost_ = (tsameFrameTi != null && tsameFrameTi != RecordBaseStat$RecordCoreFunctionStat.getDefaultInstance())? RecordBaseStat$RecordCoreFunctionStat.newBuilder(this.sameFrameTimecost_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSingleShots(RecordBaseStat$PhotoTimestampStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "25")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordBaseStat tsingleShots = this.singleShots_;
       this.singleShots_ = (tsingleShots != null && tsingleShots != RecordBaseStat$PhotoTimestampStat.getDefaultInstance())? RecordBaseStat$PhotoTimestampStat.newBuilder(this.singleShots_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeVideorecordVCTimestamp(RecordBaseStat$PageTimestampStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordBaseStat tvideorecord = this.videorecordVCTimestamp_;
       this.videorecordVCTimestamp_ = (tvideorecord != null && tvideorecord != RecordBaseStat$PageTimestampStat.getDefaultInstance())? RecordBaseStat$PageTimestampStat.newBuilder(this.videorecordVCTimestamp_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAudioStannisTimecost(float p0){
       this.audioStannisTimecost_ = p0;
    }
    public void setCameraPipeline(RecordBaseStat$CameraPipelineTimestampStat$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "11")) {
          return;
       }
       this.cameraPipeline_ = p0.build();
       return;
    }
    public void setCameraPipeline(RecordBaseStat$CameraPipelineTimestampStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.cameraPipeline_ = p0;
       return;
    }
    public void setChorusTimecost(RecordBaseStat$RecordCoreFunctionStat$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "40")) {
          return;
       }
       this.chorusTimecost_ = p0.build();
       return;
    }
    public void setChorusTimecost(RecordBaseStat$RecordCoreFunctionStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "39")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.chorusTimecost_ = p0;
       return;
    }
    public void setComponentsTimeCost(float p0){
       this.componentsTimeCost_ = p0;
    }
    public void setEnterShootTimes(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "51")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.enterShootTimes_ = p0;
       return;
    }
    public void setEnterShootTimesBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "53")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.enterShootTimes_ = p0.toStringUtf8();
       return;
    }
    public void setIsRecordSuccess(boolean p0){
       this.isRecordSuccess_ = p0;
    }
    public void setLipSynchTimecost(RecordBaseStat$RecordCoreFunctionStat$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "36")) {
          return;
       }
       this.lipSynchTimecost_ = p0.build();
       return;
    }
    public void setLipSynchTimecost(RecordBaseStat$RecordCoreFunctionStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "35")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.lipSynchTimecost_ = p0;
       return;
    }
    public void setMultipleShotsTimecost(float p0){
       this.multipleShotsTimecost_ = p0;
    }
    public void setPLCTimecost(RecordBaseStat$RecordCoreFunctionStat$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "44")) {
          return;
       }
       this.pLCTimecost_ = p0.build();
       return;
    }
    public void setPLCTimecost(RecordBaseStat$RecordCoreFunctionStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "43")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.pLCTimecost_ = p0;
       return;
    }
    public void setPlugin(int p0,String p1){
       RecordBaseStat recordBaseSt = RecordBaseStat.class;
       if (PatchProxy.isSupport(recordBaseSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, recordBaseSt, "17")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensurePluginIsMutable();
       this.plugin_.set(p0, p1);
       return;
    }
    public void setPostVCTimestamp(RecordBaseStat$PageTimestampStat$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "3")) {
          return;
       }
       this.postVCTimestamp_ = p0.build();
       return;
    }
    public void setPostVCTimestamp(RecordBaseStat$PageTimestampStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.postVCTimestamp_ = p0;
       return;
    }
    public void setRecordToEditTimecost(RecordBaseStat$RecordToEditTimestampStat$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "48")) {
          return;
       }
       this.recordToEditTimecost_ = p0.build();
       return;
    }
    public void setRecordToEditTimecost(RecordBaseStat$RecordToEditTimestampStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "47")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.recordToEditTimecost_ = p0;
       return;
    }
    public void setSameFollowTimecost(RecordBaseStat$RecordCoreFunctionStat$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "32")) {
          return;
       }
       this.sameFollowTimecost_ = p0.build();
       return;
    }
    public void setSameFollowTimecost(RecordBaseStat$RecordCoreFunctionStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "31")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.sameFollowTimecost_ = p0;
       return;
    }
    public void setSameFrameTimecost(RecordBaseStat$RecordCoreFunctionStat$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "28")) {
          return;
       }
       this.sameFrameTimecost_ = p0.build();
       return;
    }
    public void setSameFrameTimecost(RecordBaseStat$RecordCoreFunctionStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "27")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.sameFrameTimecost_ = p0;
       return;
    }
    public void setSingleShots(RecordBaseStat$PhotoTimestampStat$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "24")) {
          return;
       }
       this.singleShots_ = p0.build();
       return;
    }
    public void setSingleShots(RecordBaseStat$PhotoTimestampStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "23")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.singleShots_ = p0;
       return;
    }
    public void setSingleShotsTimecost(float p0){
       this.singleShotsTimecost_ = p0;
    }
    public void setSwitchCameraTimecost(float p0){
       this.switchCameraTimecost_ = p0;
    }
    public void setVideorecordVCTimestamp(RecordBaseStat$PageTimestampStat$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "7")) {
          return;
       }
       this.videorecordVCTimestamp_ = p0.build();
       return;
    }
    public void setVideorecordVCTimestamp(RecordBaseStat$PageTimestampStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBaseStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.videorecordVCTimestamp_ = p0;
       return;
    }
    public void setWesterosInitTimecost(float p0){
       this.westerosInitTimecost_ = p0;
    }
}
