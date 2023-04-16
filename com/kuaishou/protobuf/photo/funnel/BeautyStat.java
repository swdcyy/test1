package com.kuaishou.protobuf.photo.funnel.BeautyStat;
import pr4.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.BeautyStat$b;
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
import com.kuaishou.protobuf.photo.funnel.BeautyStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.Number;
import pr4.m;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore$b;

public final class BeautyStat extends GeneratedMessageLite implements c	// class@000e0c
{
    public Internal$ProtobufList item_;
    public String renderTime_;
    public PrettifyRestore restore_;
    public static final BeautyStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BeautyStat uBeautyStat = new BeautyStat();
       BeautyStat.DEFAULT_INSTANCE = uBeautyStat;
       GeneratedMessageLite.registerDefaultInstance(BeautyStat.class, uBeautyStat);
    }
    public void BeautyStat(){
       super();
       this.renderTime_ = "";
       this.item_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static BeautyStat getDefaultInstance(){
       return BeautyStat.DEFAULT_INSTANCE;
    }
    public static BeautyStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, BeautyStat.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BeautyStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static BeautyStat$b newBuilder(BeautyStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BeautyStat.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BeautyStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BeautyStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BeautyStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(BeautyStat.DEFAULT_INSTANCE, p0);
    }
    public static BeautyStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BeautyStat.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(BeautyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static BeautyStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BeautyStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BeautyStat.DEFAULT_INSTANCE, p0);
    }
    public static BeautyStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BeautyStat.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BeautyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static BeautyStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BeautyStat.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BeautyStat.DEFAULT_INSTANCE, p0);
    }
    public static BeautyStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BeautyStat.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BeautyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static BeautyStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BeautyStat.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BeautyStat.DEFAULT_INSTANCE, p0);
    }
    public static BeautyStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BeautyStat.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BeautyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static BeautyStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BeautyStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BeautyStat.DEFAULT_INSTANCE, p0);
    }
    public static BeautyStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BeautyStat.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BeautyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static BeautyStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BeautyStat.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BeautyStat.DEFAULT_INSTANCE, p0);
    }
    public static BeautyStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BeautyStat.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BeautyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, BeautyStat.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BeautyStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllItem(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyStat.class, "19")) {
          return;
       }
       this.ensureItemIsMutable();
       AbstractMessageLite.addAll(p0, this.item_);
       return;
    }
    public void addItem(int p0,PrettifyItem$b p1){
       BeautyStat uBeautyStat = BeautyStat.class;
       if (PatchProxy.isSupport(uBeautyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBeautyStat, "18")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.add(p0, p1.build());
       return;
    }
    public void addItem(int p0,PrettifyItem p1){
       BeautyStat uBeautyStat = BeautyStat.class;
       if (PatchProxy.isSupport(uBeautyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBeautyStat, "16")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemIsMutable();
       this.item_.add(p0, p1);
       return;
    }
    public void addItem(PrettifyItem$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyStat.class, "17")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.add(p0.build());
       return;
    }
    public void addItem(PrettifyItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyStat.class, "15")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureItemIsMutable();
       this.item_.add(p0);
       return;
    }
    public void clearItem(){
       if (PatchProxy.applyVoid(null, this, BeautyStat.class, "20")) {
          return;
       }
       this.item_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearRenderTime(){
       if (PatchProxy.applyVoid(null, this, BeautyStat.class, "3")) {
          return;
       }
       this.renderTime_ = BeautyStat.getDefaultInstance().getRenderTime();
       return;
    }
    public void clearRestore(){
       this.restore_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BeautyStat.class, "36");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (BeautyStat$a.a[p0.ordinal()]){
           case 1:
             return new BeautyStat();
           case 2:
             return new BeautyStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"renderTime_","restore_","item_",PrettifyItem.class};
             return GeneratedMessageLite.newMessageInfo(BeautyStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\t\x03\x1b\x00", objArray);
           case 4:
             return BeautyStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BeautyStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(BeautyStat.class);
                pARSER = BeautyStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BeautyStat.DEFAULT_INSTANCE);
                   BeautyStat.PARSER = pARSER;
                }
                _monitor_exit(BeautyStat.class);
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
       if (PatchProxy.applyVoid(null, this, BeautyStat.class, "12")) {
          return;
       }
       if (!this.item_.isModifiable()) {
          this.item_ = GeneratedMessageLite.mutableCopy(this.item_);
       }
       return;
    }
    public PrettifyItem getItem(int p0){
       BeautyStat uBeautyStat = BeautyStat.class;
       if (PatchProxy.isSupport(uBeautyStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBeautyStat, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.item_.get(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, BeautyStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.item_.size();
    }
    public List getItemList(){
       return this.item_;
    }
    public m getItemOrBuilder(int p0){
       BeautyStat uBeautyStat = BeautyStat.class;
       if (PatchProxy.isSupport(uBeautyStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBeautyStat, "11");
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
       Object obj = PatchProxy.apply(null, this, BeautyStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.renderTime_);
    }
    public PrettifyRestore getRestore(){
       PrettifyRestore defaultInsta;
       BeautyStat obj = PatchProxy.apply(null, this, BeautyStat.class, "5");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       BeautyStat trestore_ = this.restore_;
       this.restore_ = (trestore_ != null && trestore_ != PrettifyRestore.getDefaultInstance())? PrettifyRestore.newBuilder(this.restore_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeItem(int p0){
       BeautyStat uBeautyStat = BeautyStat.class;
       if (PatchProxy.isSupport(uBeautyStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBeautyStat, "21")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.remove(p0);
       return;
    }
    public void setItem(int p0,PrettifyItem$b p1){
       BeautyStat uBeautyStat = BeautyStat.class;
       if (PatchProxy.isSupport(uBeautyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBeautyStat, "14")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.set(p0, p1.build());
       return;
    }
    public void setItem(int p0,PrettifyItem p1){
       BeautyStat uBeautyStat = BeautyStat.class;
       if (PatchProxy.isSupport(uBeautyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBeautyStat, "13")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemIsMutable();
       this.item_.set(p0, p1);
       return;
    }
    public void setRenderTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.renderTime_ = p0;
       return;
    }
    public void setRenderTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.renderTime_ = p0.toStringUtf8();
       return;
    }
    public void setRestore(PrettifyRestore$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyStat.class, "7")) {
          return;
       }
       this.restore_ = p0.build();
       return;
    }
    public void setRestore(PrettifyRestore p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.restore_ = p0;
       return;
    }
}
