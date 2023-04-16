package com.kuaishou.protobuf.photo.funnel.PrettifyStat;
import pr4.o;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.PrettifyStat$b;
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
import com.kuaishou.protobuf.photo.funnel.PrettifyBlockStat$b;
import java.lang.Integer;
import com.kuaishou.protobuf.photo.funnel.PrettifyBlockStat;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.PrettifyStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.photo.funnel.BeautyStat;
import java.lang.Number;
import pr4.l;
import com.kuaishou.protobuf.photo.funnel.BodyStat;
import com.kuaishou.protobuf.photo.funnel.FilterStat;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat;
import com.kuaishou.protobuf.photo.funnel.BeautyStat$b;
import com.kuaishou.protobuf.photo.funnel.BodyStat$c;
import com.kuaishou.protobuf.photo.funnel.FilterStat$b;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat$b;

public final class PrettifyStat extends GeneratedMessageLite implements o	// class@000e47
{
    public BeautyStat beauty_;
    public Internal$ProtobufList blockStat_;
    public BodyStat body_;
    public FilterStat filter_;
    public MakeUpStat makeup_;
    public static final PrettifyStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PrettifyStat prettifyStat = new PrettifyStat();
       PrettifyStat.DEFAULT_INSTANCE = prettifyStat;
       GeneratedMessageLite.registerDefaultInstance(PrettifyStat.class, prettifyStat);
    }
    public void PrettifyStat(){
       super();
       this.blockStat_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static PrettifyStat getDefaultInstance(){
       return PrettifyStat.DEFAULT_INSTANCE;
    }
    public static PrettifyStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, PrettifyStat.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static PrettifyStat$b newBuilder(PrettifyStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyStat.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PrettifyStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyStat.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PrettifyStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyStat.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PrettifyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyStat.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyStat.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyStat.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyStat.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyStat.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyStat.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyStat.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PrettifyStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyStat.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyStat.DEFAULT_INSTANCE, p0);
    }
    public static PrettifyStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PrettifyStat.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PrettifyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, PrettifyStat.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllBlockStat(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "11")) {
          return;
       }
       this.ensureBlockStatIsMutable();
       AbstractMessageLite.addAll(p0, this.blockStat_);
       return;
    }
    public void addBlockStat(int p0,PrettifyBlockStat$b p1){
       PrettifyStat prettifyStat = PrettifyStat.class;
       if (PatchProxy.isSupport(prettifyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, prettifyStat, "10")) {
          return;
       }
       this.ensureBlockStatIsMutable();
       this.blockStat_.add(p0, p1.build());
       return;
    }
    public void addBlockStat(int p0,PrettifyBlockStat p1){
       PrettifyStat prettifyStat = PrettifyStat.class;
       if (PatchProxy.isSupport(prettifyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, prettifyStat, "8")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureBlockStatIsMutable();
       this.blockStat_.add(p0, p1);
       return;
    }
    public void addBlockStat(PrettifyBlockStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "9")) {
          return;
       }
       this.ensureBlockStatIsMutable();
       this.blockStat_.add(p0.build());
       return;
    }
    public void addBlockStat(PrettifyBlockStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "7")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureBlockStatIsMutable();
       this.blockStat_.add(p0);
       return;
    }
    public void clearBeauty(){
       this.beauty_ = null;
    }
    public void clearBlockStat(){
       if (PatchProxy.applyVoid(null, this, PrettifyStat.class, "12")) {
          return;
       }
       this.blockStat_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearBody(){
       this.body_ = null;
    }
    public void clearFilter(){
       this.filter_ = null;
    }
    public void clearMakeup(){
       this.makeup_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PrettifyStat.class, "44");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (PrettifyStat$a.a[p0.ordinal()]){
           case 1:
             return new PrettifyStat();
           case 2:
             return new PrettifyStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"blockStat_",PrettifyBlockStat.class,"filter_","beauty_","makeup_","body_"};
             return GeneratedMessageLite.newMessageInfo(PrettifyStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x03\x07\x05\xff\x02\xff\x02\x01\xff\x02\xff\x02\x03\x1b\x04\t\x05\t\x06\t\x07\t\x00", objArray);
           case 4:
             return PrettifyStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PrettifyStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(PrettifyStat.class);
                pARSER = PrettifyStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PrettifyStat.DEFAULT_INSTANCE);
                   PrettifyStat.PARSER = pARSER;
                }
                _monitor_exit(PrettifyStat.class);
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
    public final void ensureBlockStatIsMutable(){
       if (PatchProxy.applyVoid(null, this, PrettifyStat.class, "4")) {
          return;
       }
       if (!this.blockStat_.isModifiable()) {
          this.blockStat_ = GeneratedMessageLite.mutableCopy(this.blockStat_);
       }
       return;
    }
    public BeautyStat getBeauty(){
       BeautyStat defaultInsta;
       PrettifyStat obj = PatchProxy.apply(null, this, PrettifyStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.beauty_;
       if (obj == null) {
          defaultInsta = BeautyStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public PrettifyBlockStat getBlockStat(int p0){
       PrettifyStat prettifyStat = PrettifyStat.class;
       if (PatchProxy.isSupport(prettifyStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, prettifyStat, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.blockStat_.get(p0);
    }
    public int getBlockStatCount(){
       Object obj = PatchProxy.apply(null, this, PrettifyStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.blockStat_.size();
    }
    public List getBlockStatList(){
       return this.blockStat_;
    }
    public l getBlockStatOrBuilder(int p0){
       PrettifyStat prettifyStat = PrettifyStat.class;
       if (PatchProxy.isSupport(prettifyStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, prettifyStat, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.blockStat_.get(p0);
    }
    public List getBlockStatOrBuilderList(){
       return this.blockStat_;
    }
    public BodyStat getBody(){
       BodyStat defaultInsta;
       PrettifyStat obj = PatchProxy.apply(null, this, PrettifyStat.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.body_;
       if (obj == null) {
          defaultInsta = BodyStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public FilterStat getFilter(){
       FilterStat defaultInsta;
       PrettifyStat obj = PatchProxy.apply(null, this, PrettifyStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.filter_;
       if (obj == null) {
          defaultInsta = FilterStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public MakeUpStat getMakeup(){
       MakeUpStat defaultInsta;
       PrettifyStat obj = PatchProxy.apply(null, this, PrettifyStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.makeup_;
       if (obj == null) {
          defaultInsta = MakeUpStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public boolean hasBeauty(){
       boolean b = (this.beauty_ != null)? true: false;
       return b;
    }
    public boolean hasBody(){
       boolean b = (this.body_ != null)? true: false;
       return b;
    }
    public boolean hasFilter(){
       boolean b = (this.filter_ != null)? true: false;
       return b;
    }
    public boolean hasMakeup(){
       boolean b = (this.makeup_ != null)? true: false;
       return b;
    }
    public void mergeBeauty(BeautyStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "21")) {
          return;
       }
       Objects.requireNonNull(p0);
       PrettifyStat tbeauty_ = this.beauty_;
       this.beauty_ = (tbeauty_ != null && tbeauty_ != BeautyStat.getDefaultInstance())? BeautyStat.newBuilder(this.beauty_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeBody(BodyStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "29")) {
          return;
       }
       Objects.requireNonNull(p0);
       PrettifyStat tbody_ = this.body_;
       this.body_ = (tbody_ != null && tbody_ != BodyStat.getDefaultInstance())? BodyStat.newBuilder(this.body_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFilter(FilterStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "17")) {
          return;
       }
       Objects.requireNonNull(p0);
       PrettifyStat tfilter_ = this.filter_;
       this.filter_ = (tfilter_ != null && tfilter_ != FilterStat.getDefaultInstance())? FilterStat.newBuilder(this.filter_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeMakeup(MakeUpStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "25")) {
          return;
       }
       Objects.requireNonNull(p0);
       PrettifyStat tmakeup_ = this.makeup_;
       this.makeup_ = (tmakeup_ != null && tmakeup_ != MakeUpStat.getDefaultInstance())? MakeUpStat.newBuilder(this.makeup_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeBlockStat(int p0){
       PrettifyStat prettifyStat = PrettifyStat.class;
       if (PatchProxy.isSupport(prettifyStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, prettifyStat, "13")) {
          return;
       }
       this.ensureBlockStatIsMutable();
       this.blockStat_.remove(p0);
       return;
    }
    public void setBeauty(BeautyStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "20")) {
          return;
       }
       this.beauty_ = p0.build();
       return;
    }
    public void setBeauty(BeautyStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "19")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.beauty_ = p0;
       return;
    }
    public void setBlockStat(int p0,PrettifyBlockStat$b p1){
       PrettifyStat prettifyStat = PrettifyStat.class;
       if (PatchProxy.isSupport(prettifyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, prettifyStat, "6")) {
          return;
       }
       this.ensureBlockStatIsMutable();
       this.blockStat_.set(p0, p1.build());
       return;
    }
    public void setBlockStat(int p0,PrettifyBlockStat p1){
       PrettifyStat prettifyStat = PrettifyStat.class;
       if (PatchProxy.isSupport(prettifyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, prettifyStat, "5")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureBlockStatIsMutable();
       this.blockStat_.set(p0, p1);
       return;
    }
    public void setBody(BodyStat$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "28")) {
          return;
       }
       this.body_ = p0.build();
       return;
    }
    public void setBody(BodyStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "27")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.body_ = p0;
       return;
    }
    public void setFilter(FilterStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "16")) {
          return;
       }
       this.filter_ = p0.build();
       return;
    }
    public void setFilter(FilterStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "15")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.filter_ = p0;
       return;
    }
    public void setMakeup(MakeUpStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "24")) {
          return;
       }
       this.makeup_ = p0.build();
       return;
    }
    public void setMakeup(MakeUpStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyStat.class, "23")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.makeup_ = p0;
       return;
    }
}
