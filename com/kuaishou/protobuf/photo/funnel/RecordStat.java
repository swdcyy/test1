package com.kuaishou.protobuf.photo.funnel.RecordStat;
import pr4.q;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.photo.funnel.RecordStat$b;
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
import com.kuaishou.protobuf.photo.funnel.RecordStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.photo.funnel.MagicFaceStat;
import com.kuaishou.protobuf.photo.funnel.MusicStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat;
import com.kuaishou.protobuf.photo.funnel.PrettifyStat;
import java.util.Objects;
import com.kuaishou.protobuf.photo.funnel.MagicFaceStat$b;
import com.kuaishou.protobuf.photo.funnel.MusicStat$b;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$b;
import com.kuaishou.protobuf.photo.funnel.PrettifyStat$b;

public final class RecordStat extends GeneratedMessageLite implements q	// class@000e5f
{
    public boolean hasRecord_;
    public boolean isEnter_;
    public MagicFaceStat magicFace_;
    public MusicStat music_;
    public RecordBaseStat pageBase_;
    public PrettifyStat prettify_;
    public static final RecordStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       RecordStat recordStat = new RecordStat();
       RecordStat.DEFAULT_INSTANCE = recordStat;
       GeneratedMessageLite.registerDefaultInstance(RecordStat.class, recordStat);
    }
    public void RecordStat(){
       super();
    }
    public static RecordStat getDefaultInstance(){
       return RecordStat.DEFAULT_INSTANCE;
    }
    public static RecordStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, RecordStat.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static RecordStat$b newBuilder(RecordStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static RecordStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordStat.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordStat.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(RecordStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordStat.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordStat.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordStat.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordStat.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordStat.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static RecordStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecordStat.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordStat.DEFAULT_INSTANCE, p0);
    }
    public static RecordStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RecordStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(RecordStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, RecordStat.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecordStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearHasRecord(){
       this.hasRecord_ = false;
    }
    public void clearIsEnter(){
       this.isEnter_ = false;
    }
    public void clearMagicFace(){
       this.magicFace_ = null;
    }
    public void clearMusic(){
       this.music_ = null;
    }
    public void clearPageBase(){
       this.pageBase_ = null;
    }
    public void clearPrettify(){
       this.prettify_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecordStat.class, "31");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (RecordStat$a.a[p0.ordinal()]){
           case 1:
             return new RecordStat();
           case 2:
             return new RecordStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"isEnter_","hasRecord_","pageBase_","magicFace_","music_","prettify_"};
             return GeneratedMessageLite.newMessageInfo(RecordStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\t\x04\t\x05\t\x06\t\x00", objArray);
           case 4:
             return RecordStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = RecordStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(RecordStat.class);
                pARSER = RecordStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(RecordStat.DEFAULT_INSTANCE);
                   RecordStat.PARSER = pARSER;
                }
                _monitor_exit(RecordStat.class);
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
    public boolean getHasRecord(){
       return this.hasRecord_;
    }
    public boolean getIsEnter(){
       return this.isEnter_;
    }
    public MagicFaceStat getMagicFace(){
       MagicFaceStat defaultInsta;
       RecordStat obj = PatchProxy.apply(null, this, RecordStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.magicFace_;
       if (obj == null) {
          defaultInsta = MagicFaceStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public MusicStat getMusic(){
       MusicStat defaultInsta;
       RecordStat obj = PatchProxy.apply(null, this, RecordStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.music_;
       if (obj == null) {
          defaultInsta = MusicStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public RecordBaseStat getPageBase(){
       RecordBaseStat defaultInsta;
       RecordStat obj = PatchProxy.apply(null, this, RecordStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.pageBase_;
       if (obj == null) {
          defaultInsta = RecordBaseStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public PrettifyStat getPrettify(){
       PrettifyStat defaultInsta;
       RecordStat obj = PatchProxy.apply(null, this, RecordStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.prettify_;
       if (obj == null) {
          defaultInsta = PrettifyStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public boolean hasMagicFace(){
       boolean b = (this.magicFace_ != null)? true: false;
       return b;
    }
    public boolean hasMusic(){
       boolean b = (this.music_ != null)? true: false;
       return b;
    }
    public boolean hasPageBase(){
       boolean b = (this.pageBase_ != null)? true: false;
       return b;
    }
    public boolean hasPrettify(){
       boolean b = (this.prettify_ != null)? true: false;
       return b;
    }
    public void mergeMagicFace(MagicFaceStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordStat tmagicFace_ = this.magicFace_;
       this.magicFace_ = (tmagicFace_ != null && tmagicFace_ != MagicFaceStat.getDefaultInstance())? MagicFaceStat.newBuilder(this.magicFace_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeMusic(MusicStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordStat tmusic_ = this.music_;
       this.music_ = (tmusic_ != null && tmusic_ != MusicStat.getDefaultInstance())? MusicStat.newBuilder(this.music_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergePageBase(RecordBaseStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordStat tpageBase_ = this.pageBase_;
       this.pageBase_ = (tpageBase_ != null && tpageBase_ != RecordBaseStat.getDefaultInstance())? RecordBaseStat.newBuilder(this.pageBase_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergePrettify(PrettifyStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "16")) {
          return;
       }
       Objects.requireNonNull(p0);
       RecordStat tprettify_ = this.prettify_;
       this.prettify_ = (tprettify_ != null && tprettify_ != PrettifyStat.getDefaultInstance())? PrettifyStat.newBuilder(this.prettify_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setHasRecord(boolean p0){
       this.hasRecord_ = p0;
    }
    public void setIsEnter(boolean p0){
       this.isEnter_ = p0;
    }
    public void setMagicFace(MagicFaceStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "7")) {
          return;
       }
       this.magicFace_ = p0.build();
       return;
    }
    public void setMagicFace(MagicFaceStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.magicFace_ = p0;
       return;
    }
    public void setMusic(MusicStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "11")) {
          return;
       }
       this.music_ = p0.build();
       return;
    }
    public void setMusic(MusicStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.music_ = p0;
       return;
    }
    public void setPageBase(RecordBaseStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "3")) {
          return;
       }
       this.pageBase_ = p0.build();
       return;
    }
    public void setPageBase(RecordBaseStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.pageBase_ = p0;
       return;
    }
    public void setPrettify(PrettifyStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "15")) {
          return;
       }
       this.prettify_ = p0.build();
       return;
    }
    public void setPrettify(PrettifyStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStat.class, "14")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.prettify_ = p0;
       return;
    }
}
