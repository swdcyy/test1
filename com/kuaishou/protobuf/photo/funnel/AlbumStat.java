package com.kuaishou.protobuf.photo.funnel.AlbumStat;
import com.kuaishou.protobuf.photo.funnel.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.AlbumStat$b;
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
import com.kuaishou.protobuf.photo.funnel.AlbumStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.photo.funnel.AlbumStat$NextMode;
import java.lang.Integer;
import java.lang.Number;

public final class AlbumStat extends GeneratedMessageLite implements a	// class@000e09
{
    public long cntPhoto_;
    public long cntVideo_;
    public boolean finalSelMode_;
    public boolean initSelMode_;
    public boolean isEnter_;
    public int maxLimit_;
    public int nextMode_;
    public Internal$ProtobufList selectPath_;
    public static final AlbumStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AlbumStat uAlbumStat = new AlbumStat();
       AlbumStat.DEFAULT_INSTANCE = uAlbumStat;
       GeneratedMessageLite.registerDefaultInstance(AlbumStat.class, uAlbumStat);
    }
    public void AlbumStat(){
       super();
       this.selectPath_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static AlbumStat getDefaultInstance(){
       return AlbumStat.DEFAULT_INSTANCE;
    }
    public static AlbumStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, AlbumStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AlbumStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static AlbumStat$b newBuilder(AlbumStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumStat.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AlbumStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AlbumStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(AlbumStat.DEFAULT_INSTANCE, p0);
    }
    public static AlbumStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AlbumStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(AlbumStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static AlbumStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AlbumStat.DEFAULT_INSTANCE, p0);
    }
    public static AlbumStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AlbumStat.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AlbumStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static AlbumStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AlbumStat.DEFAULT_INSTANCE, p0);
    }
    public static AlbumStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AlbumStat.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AlbumStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static AlbumStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AlbumStat.DEFAULT_INSTANCE, p0);
    }
    public static AlbumStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AlbumStat.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AlbumStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static AlbumStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumStat.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AlbumStat.DEFAULT_INSTANCE, p0);
    }
    public static AlbumStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AlbumStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AlbumStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static AlbumStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AlbumStat.DEFAULT_INSTANCE, p0);
    }
    public static AlbumStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AlbumStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(AlbumStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, AlbumStat.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AlbumStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllSelectPath(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumStat.class, "7")) {
          return;
       }
       this.ensureSelectPathIsMutable();
       AbstractMessageLite.addAll(p0, this.selectPath_);
       return;
    }
    public void addSelectPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureSelectPathIsMutable();
       this.selectPath_.add(p0);
       return;
    }
    public void addSelectPathBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumStat.class, "9")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureSelectPathIsMutable();
       this.selectPath_.add(p0.toStringUtf8());
       return;
    }
    public void clearCntPhoto(){
       this.cntPhoto_ = 0;
    }
    public void clearCntVideo(){
       this.cntVideo_ = 0;
    }
    public void clearFinalSelMode(){
       this.finalSelMode_ = false;
    }
    public void clearInitSelMode(){
       this.initSelMode_ = false;
    }
    public void clearIsEnter(){
       this.isEnter_ = false;
    }
    public void clearMaxLimit(){
       this.maxLimit_ = 0;
    }
    public void clearNextMode(){
       this.nextMode_ = 0;
    }
    public void clearSelectPath(){
       if (PatchProxy.applyVoid(null, this, AlbumStat.class, "8")) {
          return;
       }
       this.selectPath_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AlbumStat.class, "26");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (AlbumStat$a.a[p0.ordinal()]){
           case 1:
             return new AlbumStat();
           case 2:
             return new AlbumStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"isEnter_","maxLimit_","cntVideo_","cntPhoto_","selectPath_","initSelMode_","finalSelMode_","nextMode_"};
             return GeneratedMessageLite.newMessageInfo(AlbumStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x07\x02\x04\x03\x02\x04\x02\x05\x02\x02\x06\x07\x07\x07\b\f\x00", objArray);
           case 4:
             return AlbumStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AlbumStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(AlbumStat.class);
                pARSER = AlbumStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AlbumStat.DEFAULT_INSTANCE);
                   AlbumStat.PARSER = pARSER;
                }
                _monitor_exit(AlbumStat.class);
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
    public final void ensureSelectPathIsMutable(){
       if (PatchProxy.applyVoid(null, this, AlbumStat.class, "4")) {
          return;
       }
       if (!this.selectPath_.isModifiable()) {
          this.selectPath_ = GeneratedMessageLite.mutableCopy(this.selectPath_);
       }
       return;
    }
    public long getCntPhoto(){
       return this.cntPhoto_;
    }
    public long getCntVideo(){
       return this.cntVideo_;
    }
    public boolean getFinalSelMode(){
       return this.finalSelMode_;
    }
    public boolean getInitSelMode(){
       return this.initSelMode_;
    }
    public boolean getIsEnter(){
       return this.isEnter_;
    }
    public int getMaxLimit(){
       return this.maxLimit_;
    }
    public AlbumStat$NextMode getNextMode(){
       AlbumStat$NextMode obj = PatchProxy.apply(null, this, AlbumStat.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AlbumStat$NextMode.forNumber(this.nextMode_);
       if (obj == null) {
          obj = AlbumStat$NextMode.UNRECOGNIZED;
       }
       return obj;
    }
    public int getNextModeValue(){
       return this.nextMode_;
    }
    public String getSelectPath(int p0){
       AlbumStat uAlbumStat = AlbumStat.class;
       if (PatchProxy.isSupport(uAlbumStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAlbumStat, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.selectPath_.get(p0);
    }
    public ByteString getSelectPathBytes(int p0){
       AlbumStat uAlbumStat = AlbumStat.class;
       if (PatchProxy.isSupport(uAlbumStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAlbumStat, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ByteString.copyFromUtf8(this.selectPath_.get(p0));
    }
    public int getSelectPathCount(){
       Object obj = PatchProxy.apply(null, this, AlbumStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.selectPath_.size();
    }
    public List getSelectPathList(){
       return this.selectPath_;
    }
    public void setCntPhoto(long p0){
       this.cntPhoto_ = p0;
    }
    public void setCntVideo(long p0){
       this.cntVideo_ = p0;
    }
    public void setFinalSelMode(boolean p0){
       this.finalSelMode_ = p0;
    }
    public void setInitSelMode(boolean p0){
       this.initSelMode_ = p0;
    }
    public void setIsEnter(boolean p0){
       this.isEnter_ = p0;
    }
    public void setMaxLimit(int p0){
       this.maxLimit_ = p0;
    }
    public void setNextMode(AlbumStat$NextMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumStat.class, "11")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.nextMode_ = p0.getNumber();
       return;
    }
    public void setNextModeValue(int p0){
       this.nextMode_ = p0;
    }
    public void setSelectPath(int p0,String p1){
       AlbumStat uAlbumStat = AlbumStat.class;
       if (PatchProxy.isSupport(uAlbumStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAlbumStat, "5")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureSelectPathIsMutable();
       this.selectPath_.set(p0, p1);
       return;
    }
}
