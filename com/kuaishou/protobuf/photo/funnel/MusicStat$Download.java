package com.kuaishou.protobuf.photo.funnel.MusicStat$Download;
import com.kuaishou.protobuf.photo.funnel.MusicStat$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.MusicStat$Download$a;
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

public final class MusicStat$Download extends GeneratedMessageLite implements MusicStat$c	// class@000e26
{
    public String lyricDownloadTime_;
    public boolean lyricNeedDownload_;
    public String mmuDownloadTime_;
    public boolean mmuNeedDownload_;
    public String musicDownloadTime_;
    public String musicId_;
    public boolean musicNeedDownload_;
    public String playTime_;
    public String source_;
    public String startTime_;
    public static final MusicStat$Download DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MusicStat$Download uDownload = new MusicStat$Download();
       MusicStat$Download.DEFAULT_INSTANCE = uDownload;
       GeneratedMessageLite.registerDefaultInstance(MusicStat$Download.class, uDownload);
    }
    public void MusicStat$Download(){
       super();
       this.source_ = "";
       this.startTime_ = "";
       this.musicDownloadTime_ = "";
       this.lyricDownloadTime_ = "";
       this.mmuDownloadTime_ = "";
       this.playTime_ = "";
       this.musicId_ = "";
    }
    public static MusicStat$Download getDefaultInstance(){
       return MusicStat$Download.DEFAULT_INSTANCE;
    }
    public static MusicStat$Download$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, MusicStat$Download.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicStat$Download.DEFAULT_INSTANCE.createBuilder();
    }
    public static MusicStat$Download$a newBuilder(MusicStat$Download p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$Download.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicStat$Download.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MusicStat$Download parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$Download.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(MusicStat$Download.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$Download parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$Download.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(MusicStat$Download.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat$Download parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$Download.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$Download.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$Download parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$Download.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$Download.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat$Download parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$Download.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$Download.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$Download parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$Download.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$Download.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat$Download parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$Download.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$Download.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$Download parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$Download.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$Download.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat$Download parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$Download.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$Download.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$Download parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$Download.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$Download.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat$Download parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat$Download.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$Download.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat$Download parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat$Download.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat$Download.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, MusicStat$Download.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicStat$Download.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearLyricDownloadTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat$Download.class, "15")) {
          return;
       }
       this.lyricDownloadTime_ = MusicStat$Download.getDefaultInstance().getLyricDownloadTime();
       return;
    }
    public void clearLyricNeedDownload(){
       this.lyricNeedDownload_ = false;
    }
    public void clearMmuDownloadTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat$Download.class, "19")) {
          return;
       }
       this.mmuDownloadTime_ = MusicStat$Download.getDefaultInstance().getMmuDownloadTime();
       return;
    }
    public void clearMmuNeedDownload(){
       this.mmuNeedDownload_ = false;
    }
    public void clearMusicDownloadTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat$Download.class, "11")) {
          return;
       }
       this.musicDownloadTime_ = MusicStat$Download.getDefaultInstance().getMusicDownloadTime();
       return;
    }
    public void clearMusicId(){
       if (PatchProxy.applyVoid(null, this, MusicStat$Download.class, "27")) {
          return;
       }
       this.musicId_ = MusicStat$Download.getDefaultInstance().getMusicId();
       return;
    }
    public void clearMusicNeedDownload(){
       this.musicNeedDownload_ = false;
    }
    public void clearPlayTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat$Download.class, "23")) {
          return;
       }
       this.playTime_ = MusicStat$Download.getDefaultInstance().getPlayTime();
       return;
    }
    public void clearSource(){
       if (PatchProxy.applyVoid(null, this, MusicStat$Download.class, "3")) {
          return;
       }
       this.source_ = MusicStat$Download.getDefaultInstance().getSource();
       return;
    }
    public void clearStartTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat$Download.class, "7")) {
          return;
       }
       this.startTime_ = MusicStat$Download.getDefaultInstance().getStartTime();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicStat$Download.class, "43");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (MusicStat$a.a[p0.ordinal()]){
           case 1:
             return new MusicStat$Download();
           case 2:
             return new MusicStat$Download$a(p2);
           case 3:
             Object[] objArray = new Object[10];
             objArray[0] = "source_";
             objArray[i] = "startTime_";
             objArray[2] = "musicDownloadTime_";
             objArray[3] = "lyricDownloadTime_";
             objArray[4] = "mmuDownloadTime_";
             objArray[5] = "playTime_";
             objArray[6] = "musicNeedDownload_";
             objArray[7] = "lyricNeedDownload_";
             objArray[8] = "mmuNeedDownload_";
             objArray[9] = "musicId_";
             return GeneratedMessageLite.newMessageInfo(MusicStat$Download.DEFAULT_INSTANCE, "\xff\x02\xff\x02\n\xff\x02\xff\x02\xff\x02\xff\x02\x01\n\n\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x02\x02\x06\x02\x02\x07\x07\b\x07\t\x07\n\x02\x02\x00", objArray);
           case 4:
             return MusicStat$Download.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MusicStat$Download.PARSER;
             if (pARSER == null) {
                _monitor_enter(MusicStat$Download.class);
                pARSER = MusicStat$Download.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MusicStat$Download.DEFAULT_INSTANCE);
                   MusicStat$Download.PARSER = pARSER;
                }
                _monitor_exit(MusicStat$Download.class);
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
    public String getLyricDownloadTime(){
       return this.lyricDownloadTime_;
    }
    public ByteString getLyricDownloadTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$Download.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.lyricDownloadTime_);
    }
    public boolean getLyricNeedDownload(){
       return this.lyricNeedDownload_;
    }
    public String getMmuDownloadTime(){
       return this.mmuDownloadTime_;
    }
    public ByteString getMmuDownloadTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$Download.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.mmuDownloadTime_);
    }
    public boolean getMmuNeedDownload(){
       return this.mmuNeedDownload_;
    }
    public String getMusicDownloadTime(){
       return this.musicDownloadTime_;
    }
    public ByteString getMusicDownloadTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$Download.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.musicDownloadTime_);
    }
    public String getMusicId(){
       return this.musicId_;
    }
    public ByteString getMusicIdBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$Download.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.musicId_);
    }
    public boolean getMusicNeedDownload(){
       return this.musicNeedDownload_;
    }
    public String getPlayTime(){
       return this.playTime_;
    }
    public ByteString getPlayTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$Download.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.playTime_);
    }
    public String getSource(){
       return this.source_;
    }
    public ByteString getSourceBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$Download.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.source_);
    }
    public String getStartTime(){
       return this.startTime_;
    }
    public ByteString getStartTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$Download.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.startTime_);
    }
    public void setLyricDownloadTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "14")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.lyricDownloadTime_ = p0;
       return;
    }
    public void setLyricDownloadTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "16")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.lyricDownloadTime_ = p0.toStringUtf8();
       return;
    }
    public void setLyricNeedDownload(boolean p0){
       this.lyricNeedDownload_ = p0;
    }
    public void setMmuDownloadTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "18")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.mmuDownloadTime_ = p0;
       return;
    }
    public void setMmuDownloadTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "20")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.mmuDownloadTime_ = p0.toStringUtf8();
       return;
    }
    public void setMmuNeedDownload(boolean p0){
       this.mmuNeedDownload_ = p0;
    }
    public void setMusicDownloadTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.musicDownloadTime_ = p0;
       return;
    }
    public void setMusicDownloadTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.musicDownloadTime_ = p0.toStringUtf8();
       return;
    }
    public void setMusicId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "26")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.musicId_ = p0;
       return;
    }
    public void setMusicIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "28")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.musicId_ = p0.toStringUtf8();
       return;
    }
    public void setMusicNeedDownload(boolean p0){
       this.musicNeedDownload_ = p0;
    }
    public void setPlayTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "22")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.playTime_ = p0;
       return;
    }
    public void setPlayTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "24")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.playTime_ = p0.toStringUtf8();
       return;
    }
    public void setSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.source_ = p0;
       return;
    }
    public void setSourceBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.source_ = p0.toStringUtf8();
       return;
    }
    public void setStartTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.startTime_ = p0;
       return;
    }
    public void setStartTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat$Download.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.startTime_ = p0.toStringUtf8();
       return;
    }
}
