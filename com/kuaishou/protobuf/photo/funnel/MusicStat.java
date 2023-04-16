package com.kuaishou.protobuf.photo.funnel.MusicStat;
import com.kuaishou.protobuf.photo.funnel.d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.MusicStat$b;
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
import com.kuaishou.protobuf.photo.funnel.MusicStat$Download$a;
import java.lang.Integer;
import com.kuaishou.protobuf.photo.funnel.MusicStat$Download;
import java.util.Objects;
import com.kuaishou.protobuf.photo.funnel.MusicStat$ItemClick$a;
import com.kuaishou.protobuf.photo.funnel.MusicStat$ItemClick;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.MusicStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.Number;
import com.kuaishou.protobuf.photo.funnel.MusicStat$c;
import com.kuaishou.protobuf.photo.funnel.MusicStat$d;

public final class MusicStat extends GeneratedMessageLite implements d	// class@000e2d
{
    public Internal$ProtobufList downloads_;
    public Internal$ProtobufList itemClicks_;
    public String libClickTime_;
    public String libDataFinishTime_;
    public String libShowTime_;
    public String libanOpCerateTime_;
    public static final MusicStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       MusicStat musicStat = new MusicStat();
       MusicStat.DEFAULT_INSTANCE = musicStat;
       GeneratedMessageLite.registerDefaultInstance(MusicStat.class, musicStat);
    }
    public void MusicStat(){
       super();
       this.libClickTime_ = "";
       this.libShowTime_ = "";
       this.libDataFinishTime_ = "";
       this.libanOpCerateTime_ = "";
       this.itemClicks_ = GeneratedMessageLite.emptyProtobufList();
       this.downloads_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static MusicStat getDefaultInstance(){
       return MusicStat.DEFAULT_INSTANCE;
    }
    public static MusicStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, MusicStat.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static MusicStat$b newBuilder(MusicStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static MusicStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(MusicStat.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(MusicStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static MusicStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicStat.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat.DEFAULT_INSTANCE, p0);
    }
    public static MusicStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MusicStat.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(MusicStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, MusicStat.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllDownloads(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "40")) {
          return;
       }
       this.ensureDownloadsIsMutable();
       AbstractMessageLite.addAll(p0, this.downloads_);
       return;
    }
    public void addAllItemClicks(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "27")) {
          return;
       }
       this.ensureItemClicksIsMutable();
       AbstractMessageLite.addAll(p0, this.itemClicks_);
       return;
    }
    public void addDownloads(int p0,MusicStat$Download$a p1){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, musicStat, "39")) {
          return;
       }
       this.ensureDownloadsIsMutable();
       this.downloads_.add(p0, p1.build());
       return;
    }
    public void addDownloads(int p0,MusicStat$Download p1){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, musicStat, "37")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureDownloadsIsMutable();
       this.downloads_.add(p0, p1);
       return;
    }
    public void addDownloads(MusicStat$Download$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "38")) {
          return;
       }
       this.ensureDownloadsIsMutable();
       this.downloads_.add(p0.build());
       return;
    }
    public void addDownloads(MusicStat$Download p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "36")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureDownloadsIsMutable();
       this.downloads_.add(p0);
       return;
    }
    public void addItemClicks(int p0,MusicStat$ItemClick$a p1){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, musicStat, "26")) {
          return;
       }
       this.ensureItemClicksIsMutable();
       this.itemClicks_.add(p0, p1.build());
       return;
    }
    public void addItemClicks(int p0,MusicStat$ItemClick p1){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, musicStat, "24")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemClicksIsMutable();
       this.itemClicks_.add(p0, p1);
       return;
    }
    public void addItemClicks(MusicStat$ItemClick$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "25")) {
          return;
       }
       this.ensureItemClicksIsMutable();
       this.itemClicks_.add(p0.build());
       return;
    }
    public void addItemClicks(MusicStat$ItemClick p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "23")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureItemClicksIsMutable();
       this.itemClicks_.add(p0);
       return;
    }
    public void clearDownloads(){
       if (PatchProxy.applyVoid(null, this, MusicStat.class, "41")) {
          return;
       }
       this.downloads_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearItemClicks(){
       if (PatchProxy.applyVoid(null, this, MusicStat.class, "28")) {
          return;
       }
       this.itemClicks_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearLibClickTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat.class, "3")) {
          return;
       }
       this.libClickTime_ = MusicStat.getDefaultInstance().getLibClickTime();
       return;
    }
    public void clearLibDataFinishTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat.class, "11")) {
          return;
       }
       this.libDataFinishTime_ = MusicStat.getDefaultInstance().getLibDataFinishTime();
       return;
    }
    public void clearLibShowTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat.class, "7")) {
          return;
       }
       this.libShowTime_ = MusicStat.getDefaultInstance().getLibShowTime();
       return;
    }
    public void clearLibanOpCerateTime(){
       if (PatchProxy.applyVoid(null, this, MusicStat.class, "15")) {
          return;
       }
       this.libanOpCerateTime_ = MusicStat.getDefaultInstance().getLibanOpCerateTime();
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicStat.class, "57");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (MusicStat$a.a[p0.ordinal()]){
           case 1:
             return new MusicStat();
           case 2:
             return new MusicStat$b(p2);
           case 3:
             Object[] objArray = new Object[]{"libClickTime_","libShowTime_","libDataFinishTime_","libanOpCerateTime_","itemClicks_",MusicStat$ItemClick.class,"downloads_",MusicStat$Download.class};
             return GeneratedMessageLite.newMessageInfo(MusicStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x1b\x06\x1b\x00", objArray);
           case 4:
             return MusicStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = MusicStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(MusicStat.class);
                pARSER = MusicStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(MusicStat.DEFAULT_INSTANCE);
                   MusicStat.PARSER = pARSER;
                }
                _monitor_exit(MusicStat.class);
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
    public final void ensureDownloadsIsMutable(){
       if (PatchProxy.applyVoid(null, this, MusicStat.class, "33")) {
          return;
       }
       if (!this.downloads_.isModifiable()) {
          this.downloads_ = GeneratedMessageLite.mutableCopy(this.downloads_);
       }
       return;
    }
    public final void ensureItemClicksIsMutable(){
       if (PatchProxy.applyVoid(null, this, MusicStat.class, "20")) {
          return;
       }
       if (!this.itemClicks_.isModifiable()) {
          this.itemClicks_ = GeneratedMessageLite.mutableCopy(this.itemClicks_);
       }
       return;
    }
    public MusicStat$Download getDownloads(int p0){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, musicStat, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.downloads_.get(p0);
    }
    public int getDownloadsCount(){
       Object obj = PatchProxy.apply(null, this, MusicStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.downloads_.size();
    }
    public List getDownloadsList(){
       return this.downloads_;
    }
    public MusicStat$c getDownloadsOrBuilder(int p0){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, musicStat, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.downloads_.get(p0);
    }
    public List getDownloadsOrBuilderList(){
       return this.downloads_;
    }
    public MusicStat$ItemClick getItemClicks(int p0){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, musicStat, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.itemClicks_.get(p0);
    }
    public int getItemClicksCount(){
       Object obj = PatchProxy.apply(null, this, MusicStat.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.itemClicks_.size();
    }
    public List getItemClicksList(){
       return this.itemClicks_;
    }
    public MusicStat$d getItemClicksOrBuilder(int p0){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, musicStat, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.itemClicks_.get(p0);
    }
    public List getItemClicksOrBuilderList(){
       return this.itemClicks_;
    }
    public String getLibClickTime(){
       return this.libClickTime_;
    }
    public ByteString getLibClickTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.libClickTime_);
    }
    public String getLibDataFinishTime(){
       return this.libDataFinishTime_;
    }
    public ByteString getLibDataFinishTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.libDataFinishTime_);
    }
    public String getLibShowTime(){
       return this.libShowTime_;
    }
    public ByteString getLibShowTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.libShowTime_);
    }
    public String getLibanOpCerateTime(){
       return this.libanOpCerateTime_;
    }
    public ByteString getLibanOpCerateTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.libanOpCerateTime_);
    }
    public void removeDownloads(int p0){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, musicStat, "42")) {
          return;
       }
       this.ensureDownloadsIsMutable();
       this.downloads_.remove(p0);
       return;
    }
    public void removeItemClicks(int p0){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, musicStat, "29")) {
          return;
       }
       this.ensureItemClicksIsMutable();
       this.itemClicks_.remove(p0);
       return;
    }
    public void setDownloads(int p0,MusicStat$Download$a p1){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, musicStat, "35")) {
          return;
       }
       this.ensureDownloadsIsMutable();
       this.downloads_.set(p0, p1.build());
       return;
    }
    public void setDownloads(int p0,MusicStat$Download p1){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, musicStat, "34")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureDownloadsIsMutable();
       this.downloads_.set(p0, p1);
       return;
    }
    public void setItemClicks(int p0,MusicStat$ItemClick$a p1){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, musicStat, "22")) {
          return;
       }
       this.ensureItemClicksIsMutable();
       this.itemClicks_.set(p0, p1.build());
       return;
    }
    public void setItemClicks(int p0,MusicStat$ItemClick p1){
       MusicStat musicStat = MusicStat.class;
       if (PatchProxy.isSupport(musicStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, musicStat, "21")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemClicksIsMutable();
       this.itemClicks_.set(p0, p1);
       return;
    }
    public void setLibClickTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.libClickTime_ = p0;
       return;
    }
    public void setLibClickTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.libClickTime_ = p0.toStringUtf8();
       return;
    }
    public void setLibDataFinishTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.libDataFinishTime_ = p0;
       return;
    }
    public void setLibDataFinishTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "12")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.libDataFinishTime_ = p0.toStringUtf8();
       return;
    }
    public void setLibShowTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "6")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.libShowTime_ = p0;
       return;
    }
    public void setLibShowTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "8")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.libShowTime_ = p0.toStringUtf8();
       return;
    }
    public void setLibanOpCerateTime(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "14")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.libanOpCerateTime_ = p0;
       return;
    }
    public void setLibanOpCerateTimeBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStat.class, "16")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.libanOpCerateTime_ = p0.toStringUtf8();
       return;
    }
}
