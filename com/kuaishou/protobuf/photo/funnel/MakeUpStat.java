package com.kuaishou.protobuf.photo.funnel.MakeUpStat;
import pr4.g;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat$b;
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
import com.kuaishou.protobuf.photo.funnel.PrettifyItem$b;
import java.lang.Integer;
import com.kuaishou.protobuf.photo.funnel.PrettifyItem;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.Number;
import pr4.m;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore$b;

public final class MakeUpStat extends GeneratedMessageLite implements g	// class@000e24
{
    public Internal$ProtobufList item_;
    public String renderTime_;
    public PrettifyRestore restore_;
    public static final MakeUpStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MakeUpStat makeUpStat = new MakeUpStat();
       MakeUpStat.DEFAULT_INSTANCE = makeUpStat;
       GeneratedMessageLite.registerDefaultInstance(MakeUpStat.class, makeUpStat);
    }
    public void MakeUpStat(){
       super();
       this.renderTime_ = "";
       this.item_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static MakeUpStat getDefaultInstance(){
       return MakeUpStat.DEFAULT_INSTANCE;
    }
    public static MakeUpStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, MakeUpStat.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MakeUpStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static MakeUpStat$b newBuilder(MakeUpStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeUpStat.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MakeUpStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MakeUpStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeUpStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(MakeUpStat.DEFAULT_INSTANCE, p0);
    }
    public static MakeUpStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MakeUpStat.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(MakeUpStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeUpStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeUpStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MakeUpStat.DEFAULT_INSTANCE, p0);
    }
    public static MakeUpStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MakeUpStat.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MakeUpStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeUpStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeUpStat.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MakeUpStat.DEFAULT_INSTANCE, p0);
    }
    public static MakeUpStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MakeUpStat.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MakeUpStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeUpStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeUpStat.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MakeUpStat.DEFAULT_INSTANCE, p0);
    }
    public static MakeUpStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MakeUpStat.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MakeUpStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeUpStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeUpStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MakeUpStat.DEFAULT_INSTANCE, p0);
    }
    public static MakeUpStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MakeUpStat.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MakeUpStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MakeUpStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeUpStat.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MakeUpStat.DEFAULT_INSTANCE, p0);
    }
    public static MakeUpStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MakeUpStat.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MakeUpStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, MakeUpStat.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MakeUpStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllItem(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeUpStat.class, "19")) {
          return;
       }
       this.ensureItemIsMutable();
       AbstractMessageLite.addAll(p0, this.item_);
       return;
    }
    public void addItem(int p0,PrettifyItem$b p1){
       MakeUpStat makeUpStat = MakeUpStat.class;
       if (PatchProxy.isSupport(makeUpStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, makeUpStat, "18")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.add(p0, p1.build());
       return;
    }
    public void addItem(int p0,PrettifyItem p1){
       MakeUpStat makeUpStat = MakeUpStat.class;
       if (PatchProxy.isSupport(makeUpStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, makeUpStat, "16")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemIsMutable();
       this.item_.add(p0, p1);
       return;
    }
    public void addItem(PrettifyItem$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeUpStat.class, "17")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.add(p0.build());
       return;
    }
    public void addItem(PrettifyItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeUpStat.class, "15")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureItemIsMutable();
       this.item_.add(p0);
       return;
    }
    public void clearItem(){
       if (PatchProxy.applyVoid(null, this, MakeUpStat.class, "20")) {
          return;
       }
       this.item_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearRenderTime(){
       if (PatchProxy.applyVoid(null, this, MakeUpStat.class, "3")) {
          return;
       }
       this.renderTime_ = MakeUpStat.getDefaultInstance().getRenderTime();
       return;
    }
    public void clearRestore(){
       this.restore_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MakeUpStat.class, "36");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (MakeUpStat$a.a[p0.ordinal()]){
           case 1:
             return new MakeUpStat();
           case 2:
             return new MakeUpStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"renderTime_","restore_","item_",PrettifyItem.class};
             return GeneratedMessageLite.newMessageInfo(MakeUpStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\t\x03\x1b\x00", objArray);
           case 4:
             return MakeUpStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MakeUpStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(MakeUpStat.class);
                pARSER = MakeUpStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MakeUpStat.DEFAULT_INSTANCE);
                   MakeUpStat.PARSER = pARSER;
                }
                _monitor_exit(MakeUpStat.class);
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
    public final void ensureItemIsMutable(){
       if (PatchProxy.applyVoid(null, this, MakeUpStat.class, "12")) {
          return;
       }
       if (!this.item_.isModifiable()) {
          this.item_ = GeneratedMessageLite.mutableCopy(this.item_);
       }
       return;
    }
    public PrettifyItem getItem(int p0){
       MakeUpStat makeUpStat = MakeUpStat.class;
       if (PatchProxy.isSupport(makeUpStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, makeUpStat, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.item_.get(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, MakeUpStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.item_.size();
    }
    public List getItemList(){
       return this.item_;
    }
    public m getItemOrBuilder(int p0){
       MakeUpStat makeUpStat = MakeUpStat.class;
       if (PatchProxy.isSupport(makeUpStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, makeUpStat, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.item_.get(p0);
    }
    public List getItemOrBuilderList(){
       return this.item_;
    }
    public String getRenderTime(){
       return this.renderTime_;
    }
    public ByteString getRenderTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MakeUpStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.renderTime_);
    }
    public PrettifyRestore getRestore(){
       PrettifyRestore defaultInsta;
       MakeUpStat obj = PatchProxy.apply(null, this, MakeUpStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.restore_;
       if (obj == null) {
          defaultInsta = PrettifyRestore.getDefaultInstance();
       }
       return defaultInsta;
    }
    public boolean hasRestore(){
       boolean b = (this.restore_ != null)? true: false;
       return b;
    }
    public void mergeRestore(PrettifyRestore p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeUpStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       MakeUpStat trestore_ = this.restore_;
       this.restore_ = (trestore_ != null && trestore_ != PrettifyRestore.getDefaultInstance())? PrettifyRestore.newBuilder(this.restore_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeItem(int p0){
       MakeUpStat makeUpStat = MakeUpStat.class;
       if (PatchProxy.isSupport(makeUpStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, makeUpStat, "21")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.remove(p0);
       return;
    }
    public void setItem(int p0,PrettifyItem$b p1){
       MakeUpStat makeUpStat = MakeUpStat.class;
       if (PatchProxy.isSupport(makeUpStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, makeUpStat, "14")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.set(p0, p1.build());
       return;
    }
    public void setItem(int p0,PrettifyItem p1){
       MakeUpStat makeUpStat = MakeUpStat.class;
       if (PatchProxy.isSupport(makeUpStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, makeUpStat, "13")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemIsMutable();
       this.item_.set(p0, p1);
       return;
    }
    public void setRenderTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeUpStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.renderTime_ = p0;
       return;
    }
    public void setRenderTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeUpStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.renderTime_ = p0.toStringUtf8();
       return;
    }
    public void setRestore(PrettifyRestore$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeUpStat.class, "7")) {
          return;
       }
       this.restore_ = p0.build();
       return;
    }
    public void setRestore(PrettifyRestore p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeUpStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.restore_ = p0;
       return;
    }
}
