package com.kuaishou.protobuf.photo.funnel.BodyStat;
import com.kuaishou.protobuf.photo.funnel.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.BodyStat$c;
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
import com.kuaishou.protobuf.photo.funnel.BodyStat$BodyItem$a;
import java.lang.Integer;
import com.kuaishou.protobuf.photo.funnel.BodyStat$BodyItem;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.BodyStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.Number;
import com.kuaishou.protobuf.photo.funnel.BodyStat$b;

public final class BodyStat extends GeneratedMessageLite implements b	// class@000e12
{
    public Internal$ProtobufList item_;
    public static final BodyStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BodyStat uBodyStat = new BodyStat();
       BodyStat.DEFAULT_INSTANCE = uBodyStat;
       GeneratedMessageLite.registerDefaultInstance(BodyStat.class, uBodyStat);
    }
    public void BodyStat(){
       super();
       this.item_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static BodyStat getDefaultInstance(){
       return BodyStat.DEFAULT_INSTANCE;
    }
    public static BodyStat$c newBuilder(){
       Object obj = PatchProxy.apply(null, null, BodyStat.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BodyStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static BodyStat$c newBuilder(BodyStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BodyStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BodyStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(BodyStat.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(BodyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static BodyStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static BodyStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static BodyStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static BodyStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static BodyStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BodyStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat.DEFAULT_INSTANCE, p0);
    }
    public static BodyStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BodyStat.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(BodyStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, BodyStat.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BodyStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllItem(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BodyStat.class, "11")) {
          return;
       }
       this.ensureItemIsMutable();
       AbstractMessageLite.addAll(p0, this.item_);
       return;
    }
    public void addItem(int p0,BodyStat$BodyItem$a p1){
       BodyStat uBodyStat = BodyStat.class;
       if (PatchProxy.isSupport(uBodyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBodyStat, "10")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.add(p0, p1.build());
       return;
    }
    public void addItem(int p0,BodyStat$BodyItem p1){
       BodyStat uBodyStat = BodyStat.class;
       if (PatchProxy.isSupport(uBodyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBodyStat, "8")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemIsMutable();
       this.item_.add(p0, p1);
       return;
    }
    public void addItem(BodyStat$BodyItem$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BodyStat.class, "9")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.add(p0.build());
       return;
    }
    public void addItem(BodyStat$BodyItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BodyStat.class, "7")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureItemIsMutable();
       this.item_.add(p0);
       return;
    }
    public void clearItem(){
       if (PatchProxy.applyVoid(null, this, BodyStat.class, "12")) {
          return;
       }
       this.item_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BodyStat.class, "28");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (BodyStat$a.a[p0.ordinal()]){
           case 1:
             return new BodyStat();
           case 2:
             return new BodyStat$c(p2);
           case 3:
             Object[] objArray = new Object[]{"item_",BodyStat$BodyItem.class};
             return GeneratedMessageLite.newMessageInfo(BodyStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return BodyStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BodyStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(BodyStat.class);
                pARSER = BodyStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BodyStat.DEFAULT_INSTANCE);
                   BodyStat.PARSER = pARSER;
                }
                _monitor_exit(BodyStat.class);
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
       if (PatchProxy.applyVoid(null, this, BodyStat.class, "4")) {
          return;
       }
       if (!this.item_.isModifiable()) {
          this.item_ = GeneratedMessageLite.mutableCopy(this.item_);
       }
       return;
    }
    public BodyStat$BodyItem getItem(int p0){
       BodyStat uBodyStat = BodyStat.class;
       if (PatchProxy.isSupport(uBodyStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBodyStat, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.item_.get(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, BodyStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.item_.size();
    }
    public List getItemList(){
       return this.item_;
    }
    public BodyStat$b getItemOrBuilder(int p0){
       BodyStat uBodyStat = BodyStat.class;
       if (PatchProxy.isSupport(uBodyStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBodyStat, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.item_.get(p0);
    }
    public List getItemOrBuilderList(){
       return this.item_;
    }
    public void removeItem(int p0){
       BodyStat uBodyStat = BodyStat.class;
       if (PatchProxy.isSupport(uBodyStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBodyStat, "13")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.remove(p0);
       return;
    }
    public void setItem(int p0,BodyStat$BodyItem$a p1){
       BodyStat uBodyStat = BodyStat.class;
       if (PatchProxy.isSupport(uBodyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBodyStat, "6")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.set(p0, p1.build());
       return;
    }
    public void setItem(int p0,BodyStat$BodyItem p1){
       BodyStat uBodyStat = BodyStat.class;
       if (PatchProxy.isSupport(uBodyStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBodyStat, "5")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemIsMutable();
       this.item_.set(p0, p1);
       return;
    }
}
