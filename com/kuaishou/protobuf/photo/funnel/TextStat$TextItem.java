package com.kuaishou.protobuf.photo.funnel.TextStat$TextItem;
import com.kuaishou.protobuf.photo.funnel.TextStat$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.TextStat$TextItem$a;
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
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.TextStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class TextStat$TextItem extends GeneratedMessageLite implements TextStat$c	// class@000e7c
{
    public float duration_;
    public String font_;
    public String id_;
    public int layer_;
    public float startTime_;
    public String text_;
    public static final TextStat$TextItem DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       TextStat$TextItem textItem = new TextStat$TextItem();
       TextStat$TextItem.DEFAULT_INSTANCE = textItem;
       GeneratedMessageLite.registerDefaultInstance(TextStat$TextItem.class, textItem);
    }
    public void TextStat$TextItem(){
       super();
       this.id_ = "";
       this.text_ = "";
       this.font_ = "";
    }
    public static TextStat$TextItem getDefaultInstance(){
       return TextStat$TextItem.DEFAULT_INSTANCE;
    }
    public static TextStat$TextItem$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, TextStat$TextItem.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextStat$TextItem.DEFAULT_INSTANCE.createBuilder();
    }
    public static TextStat$TextItem$a newBuilder(TextStat$TextItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat$TextItem.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextStat$TextItem.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static TextStat$TextItem parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat$TextItem.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0);
    }
    public static TextStat$TextItem parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat$TextItem.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static TextStat$TextItem parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat$TextItem.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0);
    }
    public static TextStat$TextItem parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat$TextItem.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static TextStat$TextItem parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat$TextItem.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0);
    }
    public static TextStat$TextItem parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat$TextItem.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static TextStat$TextItem parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat$TextItem.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0);
    }
    public static TextStat$TextItem parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat$TextItem.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static TextStat$TextItem parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat$TextItem.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0);
    }
    public static TextStat$TextItem parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat$TextItem.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static TextStat$TextItem parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextStat$TextItem.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0);
    }
    public static TextStat$TextItem parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TextStat$TextItem.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(TextStat$TextItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, TextStat$TextItem.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextStat$TextItem.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDuration(){
       this.duration_ = 0;
    }
    public void clearFont(){
       if (PatchProxy.applyVoid(null, this, TextStat$TextItem.class, "11")) {
          return;
       }
       this.font_ = TextStat$TextItem.getDefaultInstance().getFont();
       return;
    }
    public void clearId(){
       if (PatchProxy.applyVoid(null, this, TextStat$TextItem.class, "3")) {
          return;
       }
       this.id_ = TextStat$TextItem.getDefaultInstance().getId();
       return;
    }
    public void clearLayer(){
       this.layer_ = 0;
    }
    public void clearStartTime(){
       this.startTime_ = 0;
    }
    public void clearText(){
       if (PatchProxy.applyVoid(null, this, TextStat$TextItem.class, "7")) {
          return;
       }
       this.text_ = TextStat$TextItem.getDefaultInstance().getText();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextStat$TextItem.class, "27");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (TextStat$a.a[p0.ordinal()]){
           case 1:
             return new TextStat$TextItem();
           case 2:
             return new TextStat$TextItem$a(p2);
           case 3:
             Object[] objArray = new Object[]{"id_","text_","font_","layer_","startTime_","duration_"};
             return GeneratedMessageLite.newMessageInfo(TextStat$TextItem.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x04\x05\x01\x06\x01\x00", objArray);
           case 4:
             return TextStat$TextItem.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = TextStat$TextItem.PARSER;
             if (pARSER == null) {
                _monitor_enter(TextStat$TextItem.class);
                pARSER = TextStat$TextItem.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(TextStat$TextItem.DEFAULT_INSTANCE);
                   TextStat$TextItem.PARSER = pARSER;
                }
                _monitor_exit(TextStat$TextItem.class);
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
    public float getDuration(){
       return this.duration_;
    }
    public String getFont(){
       return this.font_;
    }
    public ByteString getFontBytes(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.font_);
    }
    public String getId(){
       return this.id_;
    }
    public ByteString getIdBytes(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.id_);
    }
    public int getLayer(){
       return this.layer_;
    }
    public float getStartTime(){
       return this.startTime_;
    }
    public String getText(){
       return this.text_;
    }
    public ByteString getTextBytes(){
       Object obj = PatchProxy.apply(null, this, TextStat$TextItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.text_);
    }
    public void setDuration(float p0){
       this.duration_ = p0;
    }
    public void setFont(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStat$TextItem.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.font_ = p0;
       return;
    }
    public void setFontBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStat$TextItem.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.font_ = p0.toStringUtf8();
       return;
    }
    public void setId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStat$TextItem.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.id_ = p0;
       return;
    }
    public void setIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStat$TextItem.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.id_ = p0.toStringUtf8();
       return;
    }
    public void setLayer(int p0){
       this.layer_ = p0;
    }
    public void setStartTime(float p0){
       this.startTime_ = p0;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStat$TextItem.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.text_ = p0;
       return;
    }
    public void setTextBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStat$TextItem.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.text_ = p0.toStringUtf8();
       return;
    }
}
