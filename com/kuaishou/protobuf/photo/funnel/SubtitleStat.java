package com.kuaishou.protobuf.photo.funnel.SubtitleStat;
import com.kuaishou.protobuf.photo.funnel.g;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$b;
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
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$InfoItem$a;
import java.lang.Integer;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$InfoItem;
import java.util.Objects;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Result$a;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Result;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.Number;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$c;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$e;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Type;

public final class SubtitleStat extends GeneratedMessageLite implements g	// class@000e77
{
    public int audioCount_;
    public boolean entranceClick_;
    public boolean isMute_;
    public Internal$ProtobufList items_;
    public long recCost_;
    public long remuxCost_;
    public Internal$ProtobufList results_;
    public int type_;
    public static final SubtitleStat DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       SubtitleStat subtitleStat = new SubtitleStat();
       SubtitleStat.DEFAULT_INSTANCE = subtitleStat;
       GeneratedMessageLite.registerDefaultInstance(SubtitleStat.class, subtitleStat);
    }
    public void SubtitleStat(){
       super();
       this.items_ = GeneratedMessageLite.emptyProtobufList();
       this.results_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static SubtitleStat getDefaultInstance(){
       return SubtitleStat.DEFAULT_INSTANCE;
    }
    public static SubtitleStat$b newBuilder(){
       Object obj = PatchProxy.apply(null, null, SubtitleStat.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat.DEFAULT_INSTANCE.createBuilder();
    }
    public static SubtitleStat$b newBuilder(SubtitleStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SubtitleStat parseDelimitedFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(SubtitleStat.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseDelimitedFrom(SubtitleStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat parseFrom(ByteString p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat parseFrom(ByteString p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat parseFrom(CodedInputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat parseFrom(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat parseFrom(InputStream p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat parseFrom(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubtitleStat parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat.DEFAULT_INSTANCE, p0);
    }
    public static SubtitleStat parseFrom(byte[] p0,ExtensionRegistryLite p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SubtitleStat.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GeneratedMessageLite.parseFrom(SubtitleStat.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       Object obj = PatchProxy.apply(null, null, SubtitleStat.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllItems(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat.class, "13")) {
          return;
       }
       this.ensureItemsIsMutable();
       AbstractMessageLite.addAll(p0, this.items_);
       return;
    }
    public void addAllResults(Iterable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat.class, "26")) {
          return;
       }
       this.ensureResultsIsMutable();
       AbstractMessageLite.addAll(p0, this.results_);
       return;
    }
    public void addItems(int p0,SubtitleStat$InfoItem$a p1){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, subtitleStat, "12")) {
          return;
       }
       this.ensureItemsIsMutable();
       this.items_.add(p0, p1.build());
       return;
    }
    public void addItems(int p0,SubtitleStat$InfoItem p1){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, subtitleStat, "10")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemsIsMutable();
       this.items_.add(p0, p1);
       return;
    }
    public void addItems(SubtitleStat$InfoItem$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat.class, "11")) {
          return;
       }
       this.ensureItemsIsMutable();
       this.items_.add(p0.build());
       return;
    }
    public void addItems(SubtitleStat$InfoItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat.class, "9")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureItemsIsMutable();
       this.items_.add(p0);
       return;
    }
    public void addResults(int p0,SubtitleStat$Result$a p1){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, subtitleStat, "25")) {
          return;
       }
       this.ensureResultsIsMutable();
       this.results_.add(p0, p1.build());
       return;
    }
    public void addResults(int p0,SubtitleStat$Result p1){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, subtitleStat, "23")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureResultsIsMutable();
       this.results_.add(p0, p1);
       return;
    }
    public void addResults(SubtitleStat$Result$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat.class, "24")) {
          return;
       }
       this.ensureResultsIsMutable();
       this.results_.add(p0.build());
       return;
    }
    public void addResults(SubtitleStat$Result p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat.class, "22")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.ensureResultsIsMutable();
       this.results_.add(p0);
       return;
    }
    public void clearAudioCount(){
       this.audioCount_ = 0;
    }
    public void clearEntranceClick(){
       this.entranceClick_ = false;
    }
    public void clearIsMute(){
       this.isMute_ = false;
    }
    public void clearItems(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat.class, "14")) {
          return;
       }
       this.items_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearRecCost(){
       this.recCost_ = 0;
    }
    public void clearRemuxCost(){
       this.remuxCost_ = 0;
    }
    public void clearResults(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat.class, "27")) {
          return;
       }
       this.results_ = GeneratedMessageLite.emptyProtobufList();
       return;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SubtitleStat.class, "43");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       int i = 1;
       p2 = null;
       switch (SubtitleStat$a.a[p0.ordinal()]){
           case 1:
             return new SubtitleStat();
           case 2:
             return new SubtitleStat$b(p2);
           case 3:
             Object[] objArray = new Object[10];
             objArray[0] = "entranceClick_";
             objArray[i] = "audioCount_";
             objArray[2] = "isMute_";
             objArray[3] = "type_";
             objArray[4] = "items_";
             objArray[5] = SubtitleStat$InfoItem.class;
             objArray[6] = "results_";
             objArray[7] = SubtitleStat$Result.class;
             objArray[8] = "remuxCost_";
             objArray[9] = "recCost_";
             return GeneratedMessageLite.newMessageInfo(SubtitleStat.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x07\x02\x04\x03\x07\x04\f\x05\x1b\x06\x1b\x07\x02\b\x02\x00", objArray);
           case 4:
             return SubtitleStat.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = SubtitleStat.PARSER;
             if (pARSER == null) {
                _monitor_enter(SubtitleStat.class);
                pARSER = SubtitleStat.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(SubtitleStat.DEFAULT_INSTANCE);
                   SubtitleStat.PARSER = pARSER;
                }
                _monitor_exit(SubtitleStat.class);
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
    public final void ensureItemsIsMutable(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat.class, "6")) {
          return;
       }
       if (!this.items_.isModifiable()) {
          this.items_ = GeneratedMessageLite.mutableCopy(this.items_);
       }
       return;
    }
    public final void ensureResultsIsMutable(){
       if (PatchProxy.applyVoid(null, this, SubtitleStat.class, "19")) {
          return;
       }
       if (!this.results_.isModifiable()) {
          this.results_ = GeneratedMessageLite.mutableCopy(this.results_);
       }
       return;
    }
    public int getAudioCount(){
       return this.audioCount_;
    }
    public boolean getEntranceClick(){
       return this.entranceClick_;
    }
    public boolean getIsMute(){
       return this.isMute_;
    }
    public SubtitleStat$InfoItem getItems(int p0){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, subtitleStat, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.items_.get(p0);
    }
    public int getItemsCount(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.items_.size();
    }
    public List getItemsList(){
       return this.items_;
    }
    public SubtitleStat$c getItemsOrBuilder(int p0){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, subtitleStat, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.items_.get(p0);
    }
    public List getItemsOrBuilderList(){
       return this.items_;
    }
    public long getRecCost(){
       return this.recCost_;
    }
    public long getRemuxCost(){
       return this.remuxCost_;
    }
    public SubtitleStat$Result getResults(int p0){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, subtitleStat, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.results_.get(p0);
    }
    public int getResultsCount(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.results_.size();
    }
    public List getResultsList(){
       return this.results_;
    }
    public SubtitleStat$e getResultsOrBuilder(int p0){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, subtitleStat, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.results_.get(p0);
    }
    public List getResultsOrBuilderList(){
       return this.results_;
    }
    public SubtitleStat$Type getType(){
       SubtitleStat$Type obj = PatchProxy.apply(null, this, SubtitleStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SubtitleStat$Type.forNumber(this.type_);
       if (obj == null) {
          obj = SubtitleStat$Type.UNRECOGNIZED;
       }
       return obj;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public void removeItems(int p0){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, subtitleStat, "15")) {
          return;
       }
       this.ensureItemsIsMutable();
       this.items_.remove(p0);
       return;
    }
    public void removeResults(int p0){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, subtitleStat, "28")) {
          return;
       }
       this.ensureResultsIsMutable();
       this.results_.remove(p0);
       return;
    }
    public void setAudioCount(int p0){
       this.audioCount_ = p0;
    }
    public void setEntranceClick(boolean p0){
       this.entranceClick_ = p0;
    }
    public void setIsMute(boolean p0){
       this.isMute_ = p0;
    }
    public void setItems(int p0,SubtitleStat$InfoItem$a p1){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, subtitleStat, "8")) {
          return;
       }
       this.ensureItemsIsMutable();
       this.items_.set(p0, p1.build());
       return;
    }
    public void setItems(int p0,SubtitleStat$InfoItem p1){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, subtitleStat, "7")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureItemsIsMutable();
       this.items_.set(p0, p1);
       return;
    }
    public void setRecCost(long p0){
       this.recCost_ = p0;
    }
    public void setRemuxCost(long p0){
       this.remuxCost_ = p0;
    }
    public void setResults(int p0,SubtitleStat$Result$a p1){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, subtitleStat, "21")) {
          return;
       }
       this.ensureResultsIsMutable();
       this.results_.set(p0, p1.build());
       return;
    }
    public void setResults(int p0,SubtitleStat$Result p1){
       SubtitleStat subtitleStat = SubtitleStat.class;
       if (PatchProxy.isSupport(subtitleStat) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, subtitleStat, "20")) {
          return;
       }
       Objects.requireNonNull(p1);
       this.ensureResultsIsMutable();
       this.results_.set(p0, p1);
       return;
    }
    public void setType(SubtitleStat$Type p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleStat.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
       return;
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
