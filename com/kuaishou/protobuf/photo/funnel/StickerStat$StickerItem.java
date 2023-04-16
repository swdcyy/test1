package com.kuaishou.protobuf.photo.funnel.StickerStat$StickerItem;
import com.kuaishou.protobuf.photo.funnel.StickerStat$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.StickerStat$StickerItem$a;
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
import com.kuaishou.protobuf.photo.funnel.StickerStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.photo.funnel.Position;
import java.util.Objects;
import com.kuaishou.protobuf.photo.funnel.Position$b;
import com.google.protobuf.AbstractMessageLite;

public final class StickerStat$StickerItem extends GeneratedMessageLite implements StickerStat$c	// class@000e64
{
    public String id_;
    public Position position_;
    public float scale_;
    public String type_;
    public static final StickerStat$StickerItem DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StickerStat$StickerItem stickerItem = new StickerStat$StickerItem();
       StickerStat$StickerItem.DEFAULT_INSTANCE = stickerItem;
       GeneratedMessageLite.registerDefaultInstance(StickerStat$StickerItem.class, stickerItem);
    }
    public void StickerStat$StickerItem(){
       super();
       this.id_ = "";
       this.type_ = "";
    }
    public static StickerStat$StickerItem getDefaultInstance(){
       return StickerStat$StickerItem.DEFAULT_INSTANCE;
    }
    public static StickerStat$StickerItem$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, StickerStat$StickerItem.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StickerStat$StickerItem.DEFAULT_INSTANCE.createBuilder();
    }
    public static StickerStat$StickerItem$a newBuilder(StickerStat$StickerItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StickerStat$StickerItem.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StickerStat$StickerItem.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StickerStat$StickerItem parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StickerStat$StickerItem.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0);
    }
    public static StickerStat$StickerItem parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StickerStat$StickerItem.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerStat$StickerItem parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StickerStat$StickerItem.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0);
    }
    public static StickerStat$StickerItem parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StickerStat$StickerItem.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerStat$StickerItem parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StickerStat$StickerItem.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0);
    }
    public static StickerStat$StickerItem parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StickerStat$StickerItem.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerStat$StickerItem parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StickerStat$StickerItem.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0);
    }
    public static StickerStat$StickerItem parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StickerStat$StickerItem.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerStat$StickerItem parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StickerStat$StickerItem.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0);
    }
    public static StickerStat$StickerItem parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StickerStat$StickerItem.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static StickerStat$StickerItem parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StickerStat$StickerItem.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0);
    }
    public static StickerStat$StickerItem parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StickerStat$StickerItem.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(StickerStat$StickerItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, StickerStat$StickerItem.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StickerStat$StickerItem.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearId(){
       if (PatchProxy.applyVoid(null, this, StickerStat$StickerItem.class, "3")) {
          return;
       }
       this.id_ = StickerStat$StickerItem.getDefaultInstance().getId();
       return;
    }
    public void clearPosition(){
       this.position_ = null;
    }
    public void clearScale(){
       this.scale_ = 0;
    }
    public void clearType(){
       if (PatchProxy.applyVoid(null, this, StickerStat$StickerItem.class, "7")) {
          return;
       }
       this.type_ = StickerStat$StickerItem.getDefaultInstance().getType();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, StickerStat$StickerItem.class, "27");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (StickerStat$a.a[p0.ordinal()]){
           case 1:
             return new StickerStat$StickerItem();
           case 2:
             return new StickerStat$StickerItem$a(p2);
           case 3:
             Object[] objArray = new Object[]{"id_","type_","scale_","position_"};
             return GeneratedMessageLite.newMessageInfo(StickerStat$StickerItem.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x01\x04\t\x00", objArray);
           case 4:
             return StickerStat$StickerItem.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StickerStat$StickerItem.PARSER;
             if (pARSER == null) {
                _monitor_enter(StickerStat$StickerItem.class);
                pARSER = StickerStat$StickerItem.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StickerStat$StickerItem.DEFAULT_INSTANCE);
                   StickerStat$StickerItem.PARSER = pARSER;
                }
                _monitor_exit(StickerStat$StickerItem.class);
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
    public String getId(){
       return this.id_;
    }
    public ByteString getIdBytes(){
       Object obj = PatchProxy.apply(null, this, StickerStat$StickerItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.id_);
    }
    public Position getPosition(){
       Position defaultInsta;
       StickerStat$StickerItem obj = PatchProxy.apply(null, this, StickerStat$StickerItem.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.position_;
       if (obj == null) {
          defaultInsta = Position.getDefaultInstance();
       }
       return defaultInsta;
    }
    public float getScale(){
       return this.scale_;
    }
    public String getType(){
       return this.type_;
    }
    public ByteString getTypeBytes(){
       Object obj = PatchProxy.apply(null, this, StickerStat$StickerItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.type_);
    }
    public boolean hasPosition(){
       boolean b = (this.position_ != null)? true: false;
       return b;
    }
    public void mergePosition(Position p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerStat$StickerItem.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       StickerStat$StickerItem tposition_ = this.position_;
       this.position_ = (tposition_ != null && tposition_ != Position.getDefaultInstance())? Position.newBuilder(this.position_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerStat$StickerItem.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.id_ = p0;
       return;
    }
    public void setIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerStat$StickerItem.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.id_ = p0.toStringUtf8();
       return;
    }
    public void setPosition(Position$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerStat$StickerItem.class, "11")) {
          return;
       }
       this.position_ = p0.build();
       return;
    }
    public void setPosition(Position p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerStat$StickerItem.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.position_ = p0;
       return;
    }
    public void setScale(float p0){
       this.scale_ = p0;
    }
    public void setType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerStat$StickerItem.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.type_ = p0;
       return;
    }
    public void setTypeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerStat$StickerItem.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.type_ = p0.toStringUtf8();
       return;
    }
}
