package com.kuaishou.protobuf.photo.funnel.TextStat;
import com.kuaishou.protobuf.photo.funnel.h;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.TextStat$b;
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
import com.kuaishou.protobuf.photo.funnel.TextStat$TextItem$a;
import java.lang.Integer;
import com.kuaishou.protobuf.photo.funnel.TextStat$TextItem;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.TextStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.Number;
import com.kuaishou.protobuf.photo.funnel.TextStat$c;

public final class TextStat extends GeneratedMessageLite implements h	// class@000e80
{
    public Internal$ProtobufList item_;
    public static final TextStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TextStat textStat = new TextStat();
       TextStat.DEFAULT_INSTANCE = textStat;
       GeneratedMessageLite.registerDefaultInstance(TextStat.class, textStat);
    }
    public void TextStat(){
       super();
       this.item_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static TextStat getDefaultInstance(){
       return TextStat.DEFAULT_INSTANCE;
    }
    public static TextStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, TextStat.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static TextStat$b newBuilder(TextStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TextStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(TextStat.DEFAULT_INSTANCE, p0);
    }
    public static TextStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(TextStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static TextStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat.DEFAULT_INSTANCE, p0);
    }
    public static TextStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static TextStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat.DEFAULT_INSTANCE, p0);
    }
    public static TextStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static TextStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat.DEFAULT_INSTANCE, p0);
    }
    public static TextStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static TextStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat.DEFAULT_INSTANCE, p0);
    }
    public static TextStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static TextStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat.DEFAULT_INSTANCE, p0);
    }
    public static TextStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, TextStat.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllItem(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStat.class, "11")) {
          return;
       }
       this.ensureItemIsMutable();
       AbstractMessageLite.addAll(p0, this.item_);
       return;
    }
    public void addItem(int p0,TextStat$TextItem$a p1){
       TextStat textStat = TextStat.class;
       if (PatchProxy.isSupport(textStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, textStat, "10")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.add(p0, p1.build());
       return;
    }
    public void addItem(int p0,TextStat$TextItem p1){
       TextStat textStat = TextStat.class;
       if (PatchProxy.isSupport(textStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, textStat, "8")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemIsMutable();
       this.item_.add(p0, p1);
       return;
    }
    public void addItem(TextStat$TextItem$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStat.class, "9")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.add(p0.build());
       return;
    }
    public void addItem(TextStat$TextItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStat.class, "7")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureItemIsMutable();
       this.item_.add(p0);
       return;
    }
    public void clearItem(){
       if (PatchProxy.applyVoid(null, this, TextStat.class, "12")) {
          return;
       }
       this.item_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextStat.class, "28");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (TextStat$a.a[p0.ordinal()]){
           case 1:
             return new TextStat();
           case 2:
             return new TextStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"item_",TextStat$TextItem.class};
             return GeneratedMessageLite.newMessageInfo(TextStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x00", objArray);
           case 4:
             return TextStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TextStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(TextStat.class);
                pARSER = TextStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TextStat.DEFAULT_INSTANCE);
                   TextStat.PARSER = pARSER;
                }
                _monitor_exit(TextStat.class);
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
       if (PatchProxy.applyVoid(null, this, TextStat.class, "4")) {
          return;
       }
       if (!this.item_.isModifiable()) {
          this.item_ = GeneratedMessageLite.mutableCopy(this.item_);
       }
       return;
    }
    public TextStat$TextItem getItem(int p0){
       TextStat textStat = TextStat.class;
       if (PatchProxy.isSupport(textStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, textStat, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.item_.get(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, TextStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.item_.size();
    }
    public List getItemList(){
       return this.item_;
    }
    public TextStat$c getItemOrBuilder(int p0){
       TextStat textStat = TextStat.class;
       if (PatchProxy.isSupport(textStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, textStat, "3");
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
       TextStat textStat = TextStat.class;
       if (PatchProxy.isSupport(textStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textStat, "13")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.remove(p0);
       return;
    }
    public void setItem(int p0,TextStat$TextItem$a p1){
       TextStat textStat = TextStat.class;
       if (PatchProxy.isSupport(textStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, textStat, "6")) {
          return;
       }
       this.ensureItemIsMutable();
       this.item_.set(p0, p1.build());
       return;
    }
    public void setItem(int p0,TextStat$TextItem p1){
       TextStat textStat = TextStat.class;
       if (PatchProxy.isSupport(textStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, textStat, "5")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemIsMutable();
       this.item_.set(p0, p1);
       return;
    }
}
