package com.kuaishou.protobuf.photo.funnel.MusicStat$ItemClick;
import com.kuaishou.protobuf.photo.funnel.MusicStat$d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.MusicStat$ItemClick$a;
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
import com.kuaishou.protobuf.photo.funnel.MusicStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class MusicStat$ItemClick extends GeneratedMessageLite implements MusicStat$d	// class@000e28
{
    public String clickTime_;
    public String downloadFinishTime_;
    public String musicId_;
    public boolean needDownload_;
    public String playTime_;
    public String source_;
    public int status_;
    public static final MusicStat$ItemClick DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MusicStat$ItemClick itemClick = new MusicStat$ItemClick();
       MusicStat$ItemClick.DEFAULT_INSTANCE = itemClick;
       GeneratedMessageLite.registerDefaultInstance(MusicStat$ItemClick.class, itemClick);
    }
    public void MusicStat$ItemClick(){
       super();
       this.clickTime_ = "";
       this.downloadFinishTime_ = "";
       this.playTime_ = "";
       this.source_ = "";
       this.musicId_ = "";
    }
    public static MusicStat$ItemClick getDefaultInstance(){
       return MusicStat$ItemClick.DEFAULT_INSTANCE;
    }
    public static MusicStat$ItemClick$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, MusicStat$ItemClick.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicStat$ItemClick.DEFAULT_INSTANCE.createBuilder();
    }
    public static MusicStat$ItemClick$a newBuilder(MusicStat$ItemClick p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$ItemClick.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicStat$ItemClick.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MusicStat$ItemClick parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$ItemClick.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$ItemClick parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$ItemClick.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat$ItemClick parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$ItemClick.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$ItemClick parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$ItemClick.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat$ItemClick parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$ItemClick.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$ItemClick parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$ItemClick.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat$ItemClick parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$ItemClick.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$ItemClick parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$ItemClick.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat$ItemClick parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$ItemClick.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$ItemClick parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$ItemClick.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat$ItemClick parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$ItemClick.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$ItemClick parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$ItemClick.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$ItemClick.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, MusicStat$ItemClick.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicStat$ItemClick.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearClickTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat$ItemClick.class, "3")) {
          return;
       }
       this.clickTime_ = MusicStat$ItemClick.getDefaultInstance().getClickTime();
       return;
    }
    public void clearDownloadFinishTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat$ItemClick.class, "7")) {
          return;
       }
       this.downloadFinishTime_ = MusicStat$ItemClick.getDefaultInstance().getDownloadFinishTime();
       return;
    }
    public void clearMusicId(){
       if (PatchProxy.applyVoid(null, this, MusicStat$ItemClick.class, "19")) {
          return;
       }
       this.musicId_ = MusicStat$ItemClick.getDefaultInstance().getMusicId();
       return;
    }
    public void clearNeedDownload(){
       this.needDownload_ = false;
    }
    public void clearPlayTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat$ItemClick.class, "11")) {
          return;
       }
       this.playTime_ = MusicStat$ItemClick.getDefaultInstance().getPlayTime();
       return;
    }
    public void clearSource(){
       if (PatchProxy.applyVoid(null, this, MusicStat$ItemClick.class, "15")) {
          return;
       }
       this.source_ = MusicStat$ItemClick.getDefaultInstance().getSource();
       return;
    }
    public void clearStatus(){
       this.status_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicStat$ItemClick.class, "35");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (MusicStat$a.a[p0.ordinal()]){
           case 1:
             return new MusicStat$ItemClick();
           case 2:
             return new MusicStat$ItemClick$a(p2);
           case 3:
             Object[] objArray = new Object[]{"clickTime_","downloadFinishTime_","playTime_","needDownload_","source_","status_","musicId_"};
             return GeneratedMessageLite.newMessageInfo(MusicStat$ItemClick.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x07\x05\x02\x02\x06\x04\x07\x02\x02\x00", objArray);
           case 4:
             return MusicStat$ItemClick.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MusicStat$ItemClick.PARSER;
             if (pARSER == null) {
                _monitor_enter(MusicStat$ItemClick.class);
                pARSER = MusicStat$ItemClick.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MusicStat$ItemClick.DEFAULT_INSTANCE);
                   MusicStat$ItemClick.PARSER = pARSER;
                }
                _monitor_exit(MusicStat$ItemClick.class);
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
    public String getClickTime(){
       return this.clickTime_;
    }
    public ByteString getClickTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.clickTime_);
    }
    public String getDownloadFinishTime(){
       return this.downloadFinishTime_;
    }
    public ByteString getDownloadFinishTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.downloadFinishTime_);
    }
    public String getMusicId(){
       return this.musicId_;
    }
    public ByteString getMusicIdBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.musicId_);
    }
    public boolean getNeedDownload(){
       return this.needDownload_;
    }
    public String getPlayTime(){
       return this.playTime_;
    }
    public ByteString getPlayTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.playTime_);
    }
    public String getSource(){
       return this.source_;
    }
    public ByteString getSourceBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.source_);
    }
    public int getStatus(){
       return this.status_;
    }
    public void setClickTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$ItemClick.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.clickTime_ = p0;
       return;
    }
    public void setClickTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$ItemClick.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.clickTime_ = p0.toStringUtf8();
       return;
    }
    public void setDownloadFinishTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$ItemClick.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.downloadFinishTime_ = p0;
       return;
    }
    public void setDownloadFinishTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$ItemClick.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.downloadFinishTime_ = p0.toStringUtf8();
       return;
    }
    public void setMusicId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$ItemClick.class, "18")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.musicId_ = p0;
       return;
    }
    public void setMusicIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$ItemClick.class, "20")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.musicId_ = p0.toStringUtf8();
       return;
    }
    public void setNeedDownload(boolean p0){
       this.needDownload_ = p0;
    }
    public void setPlayTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$ItemClick.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.playTime_ = p0;
       return;
    }
    public void setPlayTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$ItemClick.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.playTime_ = p0.toStringUtf8();
       return;
    }
    public void setSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$ItemClick.class, "14")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.source_ = p0;
       return;
    }
    public void setSourceBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$ItemClick.class, "16")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.source_ = p0.toStringUtf8();
       return;
    }
    public void setStatus(int p0){
       this.status_ = p0;
    }
}
