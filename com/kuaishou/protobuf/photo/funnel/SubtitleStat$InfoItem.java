package com.kuaishou.protobuf.photo.funnel.SubtitleStat$InfoItem;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$InfoItem$a;
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
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class SubtitleStat$InfoItem extends GeneratedMessageLite implements SubtitleStat$c	// class@000e6a
{
    public float end_;
    public String fileKey_;
    public String path_;
    public String remuxPath_;
    public float start_;
    public String token_;
    public float volume_;
    public static final SubtitleStat$InfoItem DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       SubtitleStat$InfoItem infoItem = new SubtitleStat$InfoItem();
       SubtitleStat$InfoItem.DEFAULT_INSTANCE = infoItem;
       GeneratedMessageLite.registerDefaultInstance(SubtitleStat$InfoItem.class, infoItem);
    }
    public void SubtitleStat$InfoItem(){
       super();
       this.path_ = "";
       this.remuxPath_ = "";
       this.fileKey_ = "";
       this.token_ = "";
    }
    public static SubtitleStat$InfoItem getDefaultInstance(){
       return SubtitleStat$InfoItem.DEFAULT_INSTANCE;
    }
    public static SubtitleStat$InfoItem$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, SubtitleStat$InfoItem.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat$InfoItem.DEFAULT_INSTANCE.createBuilder();
    }
    public static SubtitleStat$InfoItem$a newBuilder(SubtitleStat$InfoItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$InfoItem.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat$InfoItem.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SubtitleStat$InfoItem parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$InfoItem.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$InfoItem parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$InfoItem.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$InfoItem parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$InfoItem.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$InfoItem parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$InfoItem.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$InfoItem parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$InfoItem.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$InfoItem parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$InfoItem.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$InfoItem parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$InfoItem.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$InfoItem parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$InfoItem.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$InfoItem parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$InfoItem.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$InfoItem parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$InfoItem.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat$InfoItem parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$InfoItem.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat$InfoItem parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat$InfoItem.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat$InfoItem.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, SubtitleStat$InfoItem.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat$InfoItem.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearEnd(){
       this.end_ = 0;
    }
    public void clearFileKey(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat$InfoItem.class, "11")) {
          return;
       }
       this.fileKey_ = SubtitleStat$InfoItem.getDefaultInstance().getFileKey();
       return;
    }
    public void clearPath(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat$InfoItem.class, "3")) {
          return;
       }
       this.path_ = SubtitleStat$InfoItem.getDefaultInstance().getPath();
       return;
    }
    public void clearRemuxPath(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat$InfoItem.class, "7")) {
          return;
       }
       this.remuxPath_ = SubtitleStat$InfoItem.getDefaultInstance().getRemuxPath();
       return;
    }
    public void clearStart(){
       this.start_ = 0;
    }
    public void clearToken(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat$InfoItem.class, "15")) {
          return;
       }
       this.token_ = SubtitleStat$InfoItem.getDefaultInstance().getToken();
       return;
    }
    public void clearVolume(){
       this.volume_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SubtitleStat$InfoItem.class, "31");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (SubtitleStat$a.a[p0.ordinal()]){
           case 1:
             return new SubtitleStat$InfoItem();
           case 2:
             return new SubtitleStat$InfoItem$a(p2);
           case 3:
             Object[] objArray = new Object[]{"path_","remuxPath_","start_","end_","volume_","fileKey_","token_"};
             return GeneratedMessageLite.newMessageInfo(SubtitleStat$InfoItem.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x01\x04\x01\x05\x01\x06\x02\x02\x07\x02\x02\x00", objArray);
           case 4:
             return SubtitleStat$InfoItem.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = SubtitleStat$InfoItem.PARSER;
             if (pARSER == null) {
                _monitor_enter(SubtitleStat$InfoItem.class);
                pARSER = SubtitleStat$InfoItem.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(SubtitleStat$InfoItem.DEFAULT_INSTANCE);
                   SubtitleStat$InfoItem.PARSER = pARSER;
                }
                _monitor_exit(SubtitleStat$InfoItem.class);
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
    public float getEnd(){
       return this.end_;
    }
    public String getFileKey(){
       return this.fileKey_;
    }
    public ByteString getFileKeyBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.fileKey_);
    }
    public String getPath(){
       return this.path_;
    }
    public ByteString getPathBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.path_);
    }
    public String getRemuxPath(){
       return this.remuxPath_;
    }
    public ByteString getRemuxPathBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.remuxPath_);
    }
    public float getStart(){
       return this.start_;
    }
    public String getToken(){
       return this.token_;
    }
    public ByteString getTokenBytes(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$InfoItem.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.token_);
    }
    public float getVolume(){
       return this.volume_;
    }
    public void setEnd(float p0){
       this.end_ = p0;
    }
    public void setFileKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$InfoItem.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.fileKey_ = p0;
       return;
    }
    public void setFileKeyBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$InfoItem.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.fileKey_ = p0.toStringUtf8();
       return;
    }
    public void setPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$InfoItem.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.path_ = p0;
       return;
    }
    public void setPathBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$InfoItem.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.path_ = p0.toStringUtf8();
       return;
    }
    public void setRemuxPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$InfoItem.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.remuxPath_ = p0;
       return;
    }
    public void setRemuxPathBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$InfoItem.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.remuxPath_ = p0.toStringUtf8();
       return;
    }
    public void setStart(float p0){
       this.start_ = p0;
    }
    public void setToken(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$InfoItem.class, "14")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.token_ = p0;
       return;
    }
    public void setTokenBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat$InfoItem.class, "16")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.token_ = p0.toStringUtf8();
       return;
    }
    public void setVolume(float p0){
       this.volume_ = p0;
    }
}
