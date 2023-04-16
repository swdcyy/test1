package com.kuaishou.protobuf.photo.funnel.PostFunnelStat;
import pr4.k;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
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
import com.kuaishou.protobuf.photo.funnel.Action$b;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.protobuf.photo.funnel.Action;
import java.util.Objects;
import java.lang.Iterable;
import com.google.protobuf.AbstractMessageLite;
import com.kuaishou.protobuf.photo.funnel.ViewClick$b;
import com.kuaishou.protobuf.photo.funnel.ViewClick;
import com.kuaishou.protobuf.photo.funnel.PageInfo$b;
import com.kuaishou.protobuf.photo.funnel.PageInfo;
import com.kuaishou.protobuf.photo.funnel.Performance$b;
import com.kuaishou.protobuf.photo.funnel.Performance;
import com.kuaishou.protobuf.photo.funnel.ResourceDownloadStat$b;
import com.kuaishou.protobuf.photo.funnel.ResourceDownloadStat;
import java.lang.Boolean;
import java.util.LinkedHashMap;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$d;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$b;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.lang.IllegalArgumentException;
import pr4.a;
import com.kuaishou.protobuf.photo.funnel.AiCutStat;
import com.kuaishou.protobuf.photo.funnel.AlbumStat;
import pr4.t;
import com.kuaishou.protobuf.photo.funnel.CoverStat;
import com.kuaishou.protobuf.photo.funnel.BeautyStat;
import com.kuaishou.protobuf.photo.funnel.BodyStat;
import com.kuaishou.protobuf.photo.funnel.FilterStat;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat;
import com.kuaishou.protobuf.photo.funnel.MusicStat;
import com.kuaishou.protobuf.photo.funnel.EncodeStat;
import pr4.h;
import pr4.i;
import com.kuaishou.protobuf.photo.funnel.PublishStat;
import com.kuaishou.protobuf.photo.funnel.RecordStat;
import pr4.r;
import com.kuaishou.protobuf.photo.funnel.StickerStat;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat;
import com.kuaishou.protobuf.photo.funnel.TemplateStat;
import com.kuaishou.protobuf.photo.funnel.TextStat;
import com.kuaishou.protobuf.photo.funnel.AiCutStat$b;
import com.kuaishou.protobuf.photo.funnel.AlbumStat$b;
import com.kuaishou.protobuf.photo.funnel.CoverStat$b;
import com.kuaishou.protobuf.photo.funnel.BeautyStat$b;
import com.kuaishou.protobuf.photo.funnel.BodyStat$c;
import com.kuaishou.protobuf.photo.funnel.FilterStat$b;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat$b;
import com.kuaishou.protobuf.photo.funnel.MusicStat$b;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$b;
import com.kuaishou.protobuf.photo.funnel.PublishStat$b;
import com.kuaishou.protobuf.photo.funnel.RecordStat$b;
import com.kuaishou.protobuf.photo.funnel.StickerStat$b;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$b;
import com.kuaishou.protobuf.photo.funnel.TemplateStat$b;
import com.kuaishou.protobuf.photo.funnel.TextStat$b;

public final class PostFunnelStat extends GeneratedMessageLite implements k	// class@000e3b
{
    public MapFieldLite abValues_;
    public Internal$ProtobufList actions_;
    public AiCutStat aiCut_;
    public AlbumStat album_;
    public Internal$ProtobufList clickEvents_;
    public CoverStat cover_;
    public BeautyStat editBeauty_;
    public BodyStat editBody_;
    public FilterStat editFilter_;
    public MakeUpStat editMakeup_;
    public MusicStat editMusic_;
    public EncodeStat encode_;
    public boolean isEditEnter_;
    public boolean isPhoto_;
    public Internal$ProtobufList pages_;
    public MapFieldLite payloads_;
    public Internal$ProtobufList perfs_;
    public String preTaskId_;
    public PublishStat publish_;
    public RecordStat record_;
    public Internal$ProtobufList resourceDownloadStat_;
    public Internal$ProtobufList sourcePath_;
    public StickerStat sticker_;
    public SubtitleStat subtitle_;
    public String taskId_;
    public TemplateStat template_;
    public TextStat text_;
    public long type_;
    public static final PostFunnelStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PostFunnelStat postFunnelSt = new PostFunnelStat();
       PostFunnelStat.DEFAULT_INSTANCE = postFunnelSt;
       GeneratedMessageLite.registerDefaultInstance(PostFunnelStat.class, postFunnelSt);
    }
    public void PostFunnelStat(){
       super();
       this.payloads_ = MapFieldLite.emptyMapField();
       this.abValues_ = MapFieldLite.emptyMapField();
       this.taskId_ = "";
       this.sourcePath_ = GeneratedMessageLite.emptyProtobufList();
       this.preTaskId_ = "";
       this.actions_ = GeneratedMessageLite.emptyProtobufList();
       this.clickEvents_ = GeneratedMessageLite.emptyProtobufList();
       this.pages_ = GeneratedMessageLite.emptyProtobufList();
       this.perfs_ = GeneratedMessageLite.emptyProtobufList();
       this.resourceDownloadStat_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static PostFunnelStat getDefaultInstance(){
       return PostFunnelStat.DEFAULT_INSTANCE;
    }
    public static PostFunnelStat$c newBuilder(){
       Object obj = PatchProxy.apply(null, null, PostFunnelStat.class, "169");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostFunnelStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static PostFunnelStat$c newBuilder(PostFunnelStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostFunnelStat.class, "170");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostFunnelStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PostFunnelStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostFunnelStat.class, "165");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PostFunnelStat.DEFAULT_INSTANCE, p0);
    }
    public static PostFunnelStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PostFunnelStat.class, "166");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(PostFunnelStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PostFunnelStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostFunnelStat.class, "159");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PostFunnelStat.DEFAULT_INSTANCE, p0);
    }
    public static PostFunnelStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PostFunnelStat.class, "160");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PostFunnelStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PostFunnelStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostFunnelStat.class, "167");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PostFunnelStat.DEFAULT_INSTANCE, p0);
    }
    public static PostFunnelStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PostFunnelStat.class, "168");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PostFunnelStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PostFunnelStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostFunnelStat.class, "163");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PostFunnelStat.DEFAULT_INSTANCE, p0);
    }
    public static PostFunnelStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PostFunnelStat.class, "164");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PostFunnelStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PostFunnelStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostFunnelStat.class, "157");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PostFunnelStat.DEFAULT_INSTANCE, p0);
    }
    public static PostFunnelStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PostFunnelStat.class, "158");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PostFunnelStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static PostFunnelStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostFunnelStat.class, "161");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PostFunnelStat.DEFAULT_INSTANCE, p0);
    }
    public static PostFunnelStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PostFunnelStat.class, "162");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(PostFunnelStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, PostFunnelStat.class, "172");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostFunnelStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void addActions(int p0,Action$b p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "94")) {
          return;
       }
       this.ensureActionsIsMutable();
       this.actions_.add(p0, p1.build());
       return;
    }
    public void addActions(int p0,Action p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "92")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureActionsIsMutable();
       this.actions_.add(p0, p1);
       return;
    }
    public void addActions(Action$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "93")) {
          return;
       }
       this.ensureActionsIsMutable();
       this.actions_.add(p0.build());
       return;
    }
    public void addActions(Action p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "91")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureActionsIsMutable();
       this.actions_.add(p0);
       return;
    }
    public void addAllActions(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "95")) {
          return;
       }
       this.ensureActionsIsMutable();
       AbstractMessageLite.addAll(p0, this.actions_);
       return;
    }
    public void addAllClickEvents(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "108")) {
          return;
       }
       this.ensureClickEventsIsMutable();
       AbstractMessageLite.addAll(p0, this.clickEvents_);
       return;
    }
    public void addAllPages(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "121")) {
          return;
       }
       this.ensurePagesIsMutable();
       AbstractMessageLite.addAll(p0, this.pages_);
       return;
    }
    public void addAllPerfs(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "134")) {
          return;
       }
       this.ensurePerfsIsMutable();
       AbstractMessageLite.addAll(p0, this.perfs_);
       return;
    }
    public void addAllResourceDownloadStat(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "154")) {
          return;
       }
       this.ensureResourceDownloadStatIsMutable();
       AbstractMessageLite.addAll(p0, this.resourceDownloadStat_);
       return;
    }
    public void addAllSourcePath(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "11")) {
          return;
       }
       this.ensureSourcePathIsMutable();
       AbstractMessageLite.addAll(p0, this.sourcePath_);
       return;
    }
    public void addClickEvents(int p0,ViewClick$b p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "107")) {
          return;
       }
       this.ensureClickEventsIsMutable();
       this.clickEvents_.add(p0, p1.build());
       return;
    }
    public void addClickEvents(int p0,ViewClick p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "105")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureClickEventsIsMutable();
       this.clickEvents_.add(p0, p1);
       return;
    }
    public void addClickEvents(ViewClick$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "106")) {
          return;
       }
       this.ensureClickEventsIsMutable();
       this.clickEvents_.add(p0.build());
       return;
    }
    public void addClickEvents(ViewClick p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "104")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureClickEventsIsMutable();
       this.clickEvents_.add(p0);
       return;
    }
    public void addPages(int p0,PageInfo$b p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "120")) {
          return;
       }
       this.ensurePagesIsMutable();
       this.pages_.add(p0, p1.build());
       return;
    }
    public void addPages(int p0,PageInfo p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "118")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensurePagesIsMutable();
       this.pages_.add(p0, p1);
       return;
    }
    public void addPages(PageInfo$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "119")) {
          return;
       }
       this.ensurePagesIsMutable();
       this.pages_.add(p0.build());
       return;
    }
    public void addPages(PageInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "117")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensurePagesIsMutable();
       this.pages_.add(p0);
       return;
    }
    public void addPerfs(int p0,Performance$b p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "133")) {
          return;
       }
       this.ensurePerfsIsMutable();
       this.perfs_.add(p0, p1.build());
       return;
    }
    public void addPerfs(int p0,Performance p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "131")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensurePerfsIsMutable();
       this.perfs_.add(p0, p1);
       return;
    }
    public void addPerfs(Performance$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "132")) {
          return;
       }
       this.ensurePerfsIsMutable();
       this.perfs_.add(p0.build());
       return;
    }
    public void addPerfs(Performance p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "130")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensurePerfsIsMutable();
       this.perfs_.add(p0);
       return;
    }
    public void addResourceDownloadStat(int p0,ResourceDownloadStat$b p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "153")) {
          return;
       }
       this.ensureResourceDownloadStatIsMutable();
       this.resourceDownloadStat_.add(p0, p1.build());
       return;
    }
    public void addResourceDownloadStat(int p0,ResourceDownloadStat p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "151")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureResourceDownloadStatIsMutable();
       this.resourceDownloadStat_.add(p0, p1);
       return;
    }
    public void addResourceDownloadStat(ResourceDownloadStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "152")) {
          return;
       }
       this.ensureResourceDownloadStatIsMutable();
       this.resourceDownloadStat_.add(p0.build());
       return;
    }
    public void addResourceDownloadStat(ResourceDownloadStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "150")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureResourceDownloadStatIsMutable();
       this.resourceDownloadStat_.add(p0);
       return;
    }
    public void addSourcePath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureSourcePathIsMutable();
       this.sourcePath_.add(p0);
       return;
    }
    public void addSourcePathBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "13")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureSourcePathIsMutable();
       this.sourcePath_.add(p0.toStringUtf8());
       return;
    }
    public void clearActions(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "96")) {
          return;
       }
       this.actions_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearAiCut(){
       this.aiCut_ = null;
    }
    public void clearAlbum(){
       this.album_ = null;
    }
    public void clearClickEvents(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "109")) {
          return;
       }
       this.clickEvents_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearCover(){
       this.cover_ = null;
    }
    public void clearEditBeauty(){
       this.editBeauty_ = null;
    }
    public void clearEditBody(){
       this.editBody_ = null;
    }
    public void clearEditFilter(){
       this.editFilter_ = null;
    }
    public void clearEditMakeup(){
       this.editMakeup_ = null;
    }
    public void clearEditMusic(){
       this.editMusic_ = null;
    }
    public void clearEncode(){
       this.encode_ = null;
    }
    public void clearIsEditEnter(){
       this.isEditEnter_ = false;
    }
    public void clearIsPhoto(){
       this.isPhoto_ = false;
    }
    public void clearPages(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "122")) {
          return;
       }
       this.pages_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearPerfs(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "135")) {
          return;
       }
       this.perfs_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearPreTaskId(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "83")) {
          return;
       }
       this.preTaskId_ = PostFunnelStat.getDefaultInstance().getPreTaskId();
       return;
    }
    public void clearPublish(){
       this.publish_ = null;
    }
    public void clearRecord(){
       this.record_ = null;
    }
    public void clearResourceDownloadStat(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "155")) {
          return;
       }
       this.resourceDownloadStat_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearSourcePath(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "12")) {
          return;
       }
       this.sourcePath_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearSticker(){
       this.sticker_ = null;
    }
    public void clearSubtitle(){
       this.subtitle_ = null;
    }
    public void clearTaskId(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "3")) {
          return;
       }
       this.taskId_ = PostFunnelStat.getDefaultInstance().getTaskId();
       return;
    }
    public void clearTemplate(){
       this.template_ = null;
    }
    public void clearText(){
       this.text_ = null;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public boolean containsAbValues(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat.class, "139");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       return this.internalGetAbValues().containsKey(p0);
    }
    public boolean containsPayloads(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       return this.internalGetPayloads().containsKey(p0);
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PostFunnelStat.class, "171");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (PostFunnelStat$a.a[p0.ordinal()]){
           case 1:
             return new PostFunnelStat();
           case 2:
             return new PostFunnelStat$c(p2);
           case 3:
             Object[] objArray = new Object[35];
             objArray[0] = "taskId_";
             objArray[i] = "type_";
             objArray[2] = "isPhoto_";
             objArray[3] = "sourcePath_";
             objArray[4] = "record_";
             objArray[5] = "isEditEnter_";
             objArray[6] = "editFilter_";
             objArray[7] = "editBeauty_";
             objArray[8] = "editMakeup_";
             objArray[9] = "editBody_";
             objArray[10] = "text_";
             objArray[11] = "subtitle_";
             objArray[12] = "editMusic_";
             objArray[13] = "sticker_";
             objArray[14] = "cover_";
             objArray[15] = "aiCut_";
             objArray[16] = "template_";
             objArray[17] = "encode_";
             objArray[18] = "publish_";
             objArray[19] = "album_";
             objArray[20] = "payloads_";
             objArray[21] = PostFunnelStat$d.a;
             objArray[22] = "preTaskId_";
             objArray[23] = "actions_";
             objArray[24] = Action.class;
             objArray[25] = "clickEvents_";
             objArray[26] = ViewClick.class;
             objArray[27] = "pages_";
             objArray[28] = PageInfo.class;
             objArray[29] = "perfs_";
             objArray[30] = Performance.class;
             objArray[31] = "abValues_";
             objArray[32] = PostFunnelStat$b.a;
             objArray[33] = "resourceDownloadStat_";
             objArray[34] = ResourceDownloadStat.class;
             return GeneratedMessageLite.newMessageInfo(PostFunnelStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x1c\xff\x02\xff\x02\xff\x02\xff\x02\x01#\x1c\x02\x06\xff\x02\xff\x02\x01\x02\x02\x02\x02\x03\x07\x04\x02\x02\x05\t\r\x07\x0e\t\x0f\t\x10\t\x11\t\x12\t\x13\t\x14\t\x15\t\x16\t\x17\t\x18\t\x19\t\x1a\t\x1b\t\x1c2\x1d\x02\x02\x1e\x1b\x1f\x1b \x1b!\x1b\"2#\x1b\x00", objArray);
           case 4:
             return PostFunnelStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PostFunnelStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(PostFunnelStat.class);
                pARSER = PostFunnelStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PostFunnelStat.DEFAULT_INSTANCE);
                   PostFunnelStat.PARSER = pARSER;
                }
                _monitor_exit(PostFunnelStat.class);
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
    public final void ensureActionsIsMutable(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "88")) {
          return;
       }
       if (!this.actions_.isModifiable()) {
          this.actions_ = GeneratedMessageLite.mutableCopy(this.actions_);
       }
       return;
    }
    public final void ensureClickEventsIsMutable(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "101")) {
          return;
       }
       if (!this.clickEvents_.isModifiable()) {
          this.clickEvents_ = GeneratedMessageLite.mutableCopy(this.clickEvents_);
       }
       return;
    }
    public final void ensurePagesIsMutable(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "114")) {
          return;
       }
       if (!this.pages_.isModifiable()) {
          this.pages_ = GeneratedMessageLite.mutableCopy(this.pages_);
       }
       return;
    }
    public final void ensurePerfsIsMutable(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "127")) {
          return;
       }
       if (!this.perfs_.isModifiable()) {
          this.perfs_ = GeneratedMessageLite.mutableCopy(this.perfs_);
       }
       return;
    }
    public final void ensureResourceDownloadStatIsMutable(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "147")) {
          return;
       }
       if (!this.resourceDownloadStat_.isModifiable()) {
          this.resourceDownloadStat_ = GeneratedMessageLite.mutableCopy(this.resourceDownloadStat_);
       }
       return;
    }
    public final void ensureSourcePathIsMutable(){
       if (PatchProxy.applyVoid(null, this, PostFunnelStat.class, "8")) {
          return;
       }
       if (!this.sourcePath_.isModifiable()) {
          this.sourcePath_ = GeneratedMessageLite.mutableCopy(this.sourcePath_);
       }
       return;
    }
    public Map getAbValues(){
       return this.getAbValuesMap();
    }
    public int getAbValuesCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "138");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.internalGetAbValues().size();
    }
    public Map getAbValuesMap(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "140");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableMap(this.internalGetAbValues());
    }
    public String getAbValuesOrDefault(String p0,String p1){
       MapFieldLite obj = PatchProxy.applyTwoRefs(p0, p1, this, PostFunnelStat.class, "141");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = this.internalGetAbValues();
       if (obj.containsKey(p0)) {
          p1 = obj.get(p0);
       }
       return p1;
    }
    public String getAbValuesOrThrow(String p0){
       MapFieldLite obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat.class, "142");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = this.internalGetAbValues();
       if (obj.containsKey(p0)) {
          return obj.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public Action getActions(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "86");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.actions_.get(p0);
    }
    public int getActionsCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.actions_.size();
    }
    public List getActionsList(){
       return this.actions_;
    }
    public a getActionsOrBuilder(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "87");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.actions_.get(p0);
    }
    public List getActionsOrBuilderList(){
       return this.actions_;
    }
    public AiCutStat getAiCut(){
       AiCutStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.aiCut_;
       if (obj == null) {
          defaultInsta = AiCutStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public AlbumStat getAlbum(){
       AlbumStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.album_;
       if (obj == null) {
          defaultInsta = AlbumStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public ViewClick getClickEvents(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "99");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.clickEvents_.get(p0);
    }
    public int getClickEventsCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "98");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.clickEvents_.size();
    }
    public List getClickEventsList(){
       return this.clickEvents_;
    }
    public t getClickEventsOrBuilder(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "100");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.clickEvents_.get(p0);
    }
    public List getClickEventsOrBuilderList(){
       return this.clickEvents_;
    }
    public CoverStat getCover(){
       CoverStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.cover_;
       if (obj == null) {
          defaultInsta = CoverStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public BeautyStat getEditBeauty(){
       BeautyStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.editBeauty_;
       if (obj == null) {
          defaultInsta = BeautyStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public BodyStat getEditBody(){
       BodyStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.editBody_;
       if (obj == null) {
          defaultInsta = BodyStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public FilterStat getEditFilter(){
       FilterStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.editFilter_;
       if (obj == null) {
          defaultInsta = FilterStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public MakeUpStat getEditMakeup(){
       MakeUpStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.editMakeup_;
       if (obj == null) {
          defaultInsta = MakeUpStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public MusicStat getEditMusic(){
       MusicStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.editMusic_;
       if (obj == null) {
          defaultInsta = MusicStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public EncodeStat getEncode(){
       EncodeStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.encode_;
       if (obj == null) {
          defaultInsta = EncodeStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public boolean getIsEditEnter(){
       return this.isEditEnter_;
    }
    public boolean getIsPhoto(){
       return this.isPhoto_;
    }
    public Map getMutableAbValuesMap(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "143");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.internalGetMutableAbValues();
    }
    public Map getMutablePayloadsMap(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.internalGetMutablePayloads();
    }
    public PageInfo getPages(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "112");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.pages_.get(p0);
    }
    public int getPagesCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "111");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.pages_.size();
    }
    public List getPagesList(){
       return this.pages_;
    }
    public h getPagesOrBuilder(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "113");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.pages_.get(p0);
    }
    public List getPagesOrBuilderList(){
       return this.pages_;
    }
    public Map getPayloads(){
       return this.getPayloadsMap();
    }
    public int getPayloadsCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.internalGetPayloads().size();
    }
    public Map getPayloadsMap(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableMap(this.internalGetPayloads());
    }
    public String getPayloadsOrDefault(String p0,String p1){
       MapFieldLite obj = PatchProxy.applyTwoRefs(p0, p1, this, PostFunnelStat.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = this.internalGetPayloads();
       if (obj.containsKey(p0)) {
          p1 = obj.get(p0);
       }
       return p1;
    }
    public String getPayloadsOrThrow(String p0){
       MapFieldLite obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = this.internalGetPayloads();
       if (obj.containsKey(p0)) {
          return obj.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public Performance getPerfs(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "125");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.perfs_.get(p0);
    }
    public int getPerfsCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "124");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.perfs_.size();
    }
    public List getPerfsList(){
       return this.perfs_;
    }
    public i getPerfsOrBuilder(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "126");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.perfs_.get(p0);
    }
    public List getPerfsOrBuilderList(){
       return this.perfs_;
    }
    public String getPreTaskId(){
       return this.preTaskId_;
    }
    public ByteString getPreTaskIdBytes(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.preTaskId_);
    }
    public PublishStat getPublish(){
       PublishStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.publish_;
       if (obj == null) {
          defaultInsta = PublishStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public RecordStat getRecord(){
       RecordStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.record_;
       if (obj == null) {
          defaultInsta = RecordStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public ResourceDownloadStat getResourceDownloadStat(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "145");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.resourceDownloadStat_.get(p0);
    }
    public int getResourceDownloadStatCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "144");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.resourceDownloadStat_.size();
    }
    public List getResourceDownloadStatList(){
       return this.resourceDownloadStat_;
    }
    public r getResourceDownloadStatOrBuilder(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "146");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.resourceDownloadStat_.get(p0);
    }
    public List getResourceDownloadStatOrBuilderList(){
       return this.resourceDownloadStat_;
    }
    public String getSourcePath(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.sourcePath_.get(p0);
    }
    public ByteString getSourcePathBytes(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postFunnelSt, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ByteString.copyFromUtf8(this.sourcePath_.get(p0));
    }
    public int getSourcePathCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.sourcePath_.size();
    }
    public List getSourcePathList(){
       return this.sourcePath_;
    }
    public StickerStat getSticker(){
       StickerStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.sticker_;
       if (obj == null) {
          defaultInsta = StickerStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public SubtitleStat getSubtitle(){
       SubtitleStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.subtitle_;
       if (obj == null) {
          defaultInsta = SubtitleStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public String getTaskId(){
       return this.taskId_;
    }
    public ByteString getTaskIdBytes(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ByteString.copyFromUtf8(this.taskId_);
    }
    public TemplateStat getTemplate(){
       TemplateStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.template_;
       if (obj == null) {
          defaultInsta = TemplateStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public TextStat getText(){
       TextStat defaultInsta;
       PostFunnelStat obj = PatchProxy.apply(null, this, PostFunnelStat.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.text_;
       if (obj == null) {
          defaultInsta = TextStat.getDefaultInstance();
       }
       return defaultInsta;
    }
    public long getType(){
       return this.type_;
    }
    public boolean hasAiCut(){
       boolean b = (this.aiCut_ != null)? true: false;
       return b;
    }
    public boolean hasAlbum(){
       boolean b = (this.album_ != null)? true: false;
       return b;
    }
    public boolean hasCover(){
       boolean b = (this.cover_ != null)? true: false;
       return b;
    }
    public boolean hasEditBeauty(){
       boolean b = (this.editBeauty_ != null)? true: false;
       return b;
    }
    public boolean hasEditBody(){
       boolean b = (this.editBody_ != null)? true: false;
       return b;
    }
    public boolean hasEditFilter(){
       boolean b = (this.editFilter_ != null)? true: false;
       return b;
    }
    public boolean hasEditMakeup(){
       boolean b = (this.editMakeup_ != null)? true: false;
       return b;
    }
    public boolean hasEditMusic(){
       boolean b = (this.editMusic_ != null)? true: false;
       return b;
    }
    public boolean hasEncode(){
       boolean b = (this.encode_ != null)? true: false;
       return b;
    }
    public boolean hasPublish(){
       boolean b = (this.publish_ != null)? true: false;
       return b;
    }
    public boolean hasRecord(){
       boolean b = (this.record_ != null)? true: false;
       return b;
    }
    public boolean hasSticker(){
       boolean b = (this.sticker_ != null)? true: false;
       return b;
    }
    public boolean hasSubtitle(){
       boolean b = (this.subtitle_ != null)? true: false;
       return b;
    }
    public boolean hasTemplate(){
       boolean b = (this.template_ != null)? true: false;
       return b;
    }
    public boolean hasText(){
       boolean b = (this.text_ != null)? true: false;
       return b;
    }
    public final MapFieldLite internalGetAbValues(){
       return this.abValues_;
    }
    public final MapFieldLite internalGetMutableAbValues(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "137");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.abValues_.isMutable()) {
          this.abValues_ = this.abValues_.mutableCopy();
       }
       return this.abValues_;
    }
    public final MapFieldLite internalGetMutablePayloads(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.payloads_.isMutable()) {
          this.payloads_ = this.payloads_.mutableCopy();
       }
       return this.payloads_;
    }
    public final MapFieldLite internalGetPayloads(){
       return this.payloads_;
    }
    public void mergeAiCut(AiCutStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "57")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat taiCut_ = this.aiCut_;
       this.aiCut_ = (taiCut_ != null && taiCut_ != AiCutStat.getDefaultInstance())? AiCutStat.newBuilder(this.aiCut_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeAlbum(AlbumStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "73")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat talbum_ = this.album_;
       this.album_ = (talbum_ != null && talbum_ != AlbumStat.getDefaultInstance())? AlbumStat.newBuilder(this.album_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeCover(CoverStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "53")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat tcover_ = this.cover_;
       this.cover_ = (tcover_ != null && tcover_ != CoverStat.getDefaultInstance())? CoverStat.newBuilder(this.cover_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeEditBeauty(BeautyStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "25")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat teditBeauty_ = this.editBeauty_;
       this.editBeauty_ = (teditBeauty_ != null && teditBeauty_ != BeautyStat.getDefaultInstance())? BeautyStat.newBuilder(this.editBeauty_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeEditBody(BodyStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "33")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat teditBody_ = this.editBody_;
       this.editBody_ = (teditBody_ != null && teditBody_ != BodyStat.getDefaultInstance())? BodyStat.newBuilder(this.editBody_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeEditFilter(FilterStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "21")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat teditFilter_ = this.editFilter_;
       this.editFilter_ = (teditFilter_ != null && teditFilter_ != FilterStat.getDefaultInstance())? FilterStat.newBuilder(this.editFilter_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeEditMakeup(MakeUpStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "29")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat teditMakeup_ = this.editMakeup_;
       this.editMakeup_ = (teditMakeup_ != null && teditMakeup_ != MakeUpStat.getDefaultInstance())? MakeUpStat.newBuilder(this.editMakeup_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeEditMusic(MusicStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "45")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat teditMusic_ = this.editMusic_;
       this.editMusic_ = (teditMusic_ != null && teditMusic_ != MusicStat.getDefaultInstance())? MusicStat.newBuilder(this.editMusic_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeEncode(EncodeStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "65")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat tencode_ = this.encode_;
       this.encode_ = (tencode_ != null && tencode_ != EncodeStat.getDefaultInstance())? EncodeStat.newBuilder(this.encode_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergePublish(PublishStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "69")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat tpublish_ = this.publish_;
       this.publish_ = (tpublish_ != null && tpublish_ != PublishStat.getDefaultInstance())? PublishStat.newBuilder(this.publish_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRecord(RecordStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "17")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat trecord_ = this.record_;
       this.record_ = (trecord_ != null && trecord_ != RecordStat.getDefaultInstance())? RecordStat.newBuilder(this.record_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSticker(StickerStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "49")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat tsticker_ = this.sticker_;
       this.sticker_ = (tsticker_ != null && tsticker_ != StickerStat.getDefaultInstance())? StickerStat.newBuilder(this.sticker_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSubtitle(SubtitleStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "41")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat tsubtitle_ = this.subtitle_;
       this.subtitle_ = (tsubtitle_ != null && tsubtitle_ != SubtitleStat.getDefaultInstance())? SubtitleStat.newBuilder(this.subtitle_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeTemplate(TemplateStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "61")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat ttemplate_ = this.template_;
       this.template_ = (ttemplate_ != null && ttemplate_ != TemplateStat.getDefaultInstance())? TemplateStat.newBuilder(this.template_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeText(TextStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "37")) {
          return;
       }
       Objects.requireNonNull(p0);
       PostFunnelStat ttext_ = this.text_;
       this.text_ = (ttext_ != null && ttext_ != TextStat.getDefaultInstance())? TextStat.newBuilder(this.text_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeActions(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, postFunnelSt, "97")) {
          return;
       }
       this.ensureActionsIsMutable();
       this.actions_.remove(p0);
       return;
    }
    public void removeClickEvents(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, postFunnelSt, "110")) {
          return;
       }
       this.ensureClickEventsIsMutable();
       this.clickEvents_.remove(p0);
       return;
    }
    public void removePages(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, postFunnelSt, "123")) {
          return;
       }
       this.ensurePagesIsMutable();
       this.pages_.remove(p0);
       return;
    }
    public void removePerfs(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, postFunnelSt, "136")) {
          return;
       }
       this.ensurePerfsIsMutable();
       this.perfs_.remove(p0);
       return;
    }
    public void removeResourceDownloadStat(int p0){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, postFunnelSt, "156")) {
          return;
       }
       this.ensureResourceDownloadStatIsMutable();
       this.resourceDownloadStat_.remove(p0);
       return;
    }
    public void setActions(int p0,Action$b p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "90")) {
          return;
       }
       this.ensureActionsIsMutable();
       this.actions_.set(p0, p1.build());
       return;
    }
    public void setActions(int p0,Action p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "89")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureActionsIsMutable();
       this.actions_.set(p0, p1);
       return;
    }
    public void setAiCut(AiCutStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "56")) {
          return;
       }
       this.aiCut_ = p0.build();
       return;
    }
    public void setAiCut(AiCutStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "55")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.aiCut_ = p0;
       return;
    }
    public void setAlbum(AlbumStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "72")) {
          return;
       }
       this.album_ = p0.build();
       return;
    }
    public void setAlbum(AlbumStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "71")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.album_ = p0;
       return;
    }
    public void setClickEvents(int p0,ViewClick$b p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "103")) {
          return;
       }
       this.ensureClickEventsIsMutable();
       this.clickEvents_.set(p0, p1.build());
       return;
    }
    public void setClickEvents(int p0,ViewClick p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "102")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureClickEventsIsMutable();
       this.clickEvents_.set(p0, p1);
       return;
    }
    public void setCover(CoverStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "52")) {
          return;
       }
       this.cover_ = p0.build();
       return;
    }
    public void setCover(CoverStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "51")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.cover_ = p0;
       return;
    }
    public void setEditBeauty(BeautyStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "24")) {
          return;
       }
       this.editBeauty_ = p0.build();
       return;
    }
    public void setEditBeauty(BeautyStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "23")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.editBeauty_ = p0;
       return;
    }
    public void setEditBody(BodyStat$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "32")) {
          return;
       }
       this.editBody_ = p0.build();
       return;
    }
    public void setEditBody(BodyStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "31")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.editBody_ = p0;
       return;
    }
    public void setEditFilter(FilterStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "20")) {
          return;
       }
       this.editFilter_ = p0.build();
       return;
    }
    public void setEditFilter(FilterStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "19")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.editFilter_ = p0;
       return;
    }
    public void setEditMakeup(MakeUpStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "28")) {
          return;
       }
       this.editMakeup_ = p0.build();
       return;
    }
    public void setEditMakeup(MakeUpStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "27")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.editMakeup_ = p0;
       return;
    }
    public void setEditMusic(MusicStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "44")) {
          return;
       }
       this.editMusic_ = p0.build();
       return;
    }
    public void setEditMusic(MusicStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "43")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.editMusic_ = p0;
       return;
    }
    public void setEncode(EncodeStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "64")) {
          return;
       }
       this.encode_ = p0.build();
       return;
    }
    public void setEncode(EncodeStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "63")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.encode_ = p0;
       return;
    }
    public void setIsEditEnter(boolean p0){
       this.isEditEnter_ = p0;
    }
    public void setIsPhoto(boolean p0){
       this.isPhoto_ = p0;
    }
    public void setPages(int p0,PageInfo$b p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "116")) {
          return;
       }
       this.ensurePagesIsMutable();
       this.pages_.set(p0, p1.build());
       return;
    }
    public void setPages(int p0,PageInfo p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "115")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensurePagesIsMutable();
       this.pages_.set(p0, p1);
       return;
    }
    public void setPerfs(int p0,Performance$b p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "129")) {
          return;
       }
       this.ensurePerfsIsMutable();
       this.perfs_.set(p0, p1.build());
       return;
    }
    public void setPerfs(int p0,Performance p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "128")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensurePerfsIsMutable();
       this.perfs_.set(p0, p1);
       return;
    }
    public void setPreTaskId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "82")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.preTaskId_ = p0;
       return;
    }
    public void setPreTaskIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "84")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.preTaskId_ = p0.toStringUtf8();
       return;
    }
    public void setPublish(PublishStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "68")) {
          return;
       }
       this.publish_ = p0.build();
       return;
    }
    public void setPublish(PublishStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "67")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.publish_ = p0;
       return;
    }
    public void setRecord(RecordStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "16")) {
          return;
       }
       this.record_ = p0.build();
       return;
    }
    public void setRecord(RecordStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "15")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.record_ = p0;
       return;
    }
    public void setResourceDownloadStat(int p0,ResourceDownloadStat$b p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "149")) {
          return;
       }
       this.ensureResourceDownloadStatIsMutable();
       this.resourceDownloadStat_.set(p0, p1.build());
       return;
    }
    public void setResourceDownloadStat(int p0,ResourceDownloadStat p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "148")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureResourceDownloadStatIsMutable();
       this.resourceDownloadStat_.set(p0, p1);
       return;
    }
    public void setSourcePath(int p0,String p1){
       PostFunnelStat postFunnelSt = PostFunnelStat.class;
       if (PatchProxy.isSupport(postFunnelSt) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, postFunnelSt, "9")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureSourcePathIsMutable();
       this.sourcePath_.set(p0, p1);
       return;
    }
    public void setSticker(StickerStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "48")) {
          return;
       }
       this.sticker_ = p0.build();
       return;
    }
    public void setSticker(StickerStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "47")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.sticker_ = p0;
       return;
    }
    public void setSubtitle(SubtitleStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "40")) {
          return;
       }
       this.subtitle_ = p0.build();
       return;
    }
    public void setSubtitle(SubtitleStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "39")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.subtitle_ = p0;
       return;
    }
    public void setTaskId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.taskId_ = p0;
       return;
    }
    public void setTaskIdBytes(ByteString p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.taskId_ = p0.toStringUtf8();
       return;
    }
    public void setTemplate(TemplateStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "60")) {
          return;
       }
       this.template_ = p0.build();
       return;
    }
    public void setTemplate(TemplateStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "59")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.template_ = p0;
       return;
    }
    public void setText(TextStat$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "36")) {
          return;
       }
       this.text_ = p0.build();
       return;
    }
    public void setText(TextStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelStat.class, "35")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.text_ = p0;
       return;
    }
    public void setType(long p0){
       this.type_ = p0;
    }
}
