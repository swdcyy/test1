package com.kuaishou.edit.draft.AssetRangeAction;
import z30.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.AssetRangeAction$b;
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
import com.kuaishou.edit.draft.AssetTransitionActionData$b;
import java.lang.Object;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.AssetRangeAction$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import z30.f;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.TimeRange$b;

public final class AssetRangeAction extends GeneratedMessageLite implements b	// class@001714
{
    public Internal$ProtobufList originalAssetTransitions_;
    public TimeRange originalRange_;
    public int trackIndex_;
    public static final AssetRangeAction DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AssetRangeAction uAssetRangeA = new AssetRangeAction();
       AssetRangeAction.DEFAULT_INSTANCE = uAssetRangeA;
       GeneratedMessageLite.registerDefaultInstance(AssetRangeAction.class, uAssetRangeA);
    }
    public void AssetRangeAction(){
       super();
       this.originalAssetTransitions_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static AssetRangeAction getDefaultInstance(){
       return AssetRangeAction.DEFAULT_INSTANCE;
    }
    public static AssetRangeAction$b newBuilder(){
       return AssetRangeAction.DEFAULT_INSTANCE.createBuilder();
    }
    public static AssetRangeAction$b newBuilder(AssetRangeAction p0){
       return AssetRangeAction.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AssetRangeAction parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AssetRangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRangeAction parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AssetRangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetRangeAction parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AssetRangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRangeAction parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetRangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetRangeAction parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AssetRangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRangeAction parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetRangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetRangeAction parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AssetRangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRangeAction parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetRangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetRangeAction parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AssetRangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRangeAction parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetRangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetRangeAction parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AssetRangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRangeAction parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetRangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AssetRangeAction.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllOriginalAssetTransitions(Iterable p0){
       this.ensureOriginalAssetTransitionsIsMutable();
       AbstractMessageLite.addAll(p0, this.originalAssetTransitions_);
    }
    public void addOriginalAssetTransitions(int p0,AssetTransitionActionData$b p1){
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.add(p0, p1.build());
    }
    public void addOriginalAssetTransitions(int p0,AssetTransitionActionData p1){
       Objects.requireNonNull(p1);
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.add(p0, p1);
    }
    public void addOriginalAssetTransitions(AssetTransitionActionData$b p0){
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.add(p0.build());
    }
    public void addOriginalAssetTransitions(AssetTransitionActionData p0){
       Objects.requireNonNull(p0);
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.add(p0);
    }
    public void clearOriginalAssetTransitions(){
       this.originalAssetTransitions_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearOriginalRange(){
       this.originalRange_ = null;
    }
    public void clearTrackIndex(){
       this.trackIndex_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AssetRangeAction$a.a[p0.ordinal()]){
           case 1:
             return new AssetRangeAction();
           case 2:
             return new AssetRangeAction$b(p2);
           case 3:
             Object[] objArray = new Object[]{"trackIndex_","originalRange_","originalAssetTransitions_",AssetTransitionActionData.class};
             return GeneratedMessageLite.newMessageInfo(AssetRangeAction.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x0b\x02\t\x03\x1b\x00", objArray);
           case 4:
             return AssetRangeAction.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AssetRangeAction.PARSER;
             if (pARSER == null) {
                _monitor_enter(AssetRangeAction.class);
                pARSER = AssetRangeAction.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AssetRangeAction.DEFAULT_INSTANCE);
                   AssetRangeAction.PARSER = pARSER;
                }
                _monitor_exit(AssetRangeAction.class);
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
    public final void ensureOriginalAssetTransitionsIsMutable(){
       if (!this.originalAssetTransitions_.isModifiable()) {
          this.originalAssetTransitions_ = GeneratedMessageLite.mutableCopy(this.originalAssetTransitions_);
       }
       return;
    }
    public AssetTransitionActionData getOriginalAssetTransitions(int p0){
       return this.originalAssetTransitions_.get(p0);
    }
    public int getOriginalAssetTransitionsCount(){
       return this.originalAssetTransitions_.size();
    }
    public List getOriginalAssetTransitionsList(){
       return this.originalAssetTransitions_;
    }
    public f getOriginalAssetTransitionsOrBuilder(int p0){
       return this.originalAssetTransitions_.get(p0);
    }
    public List getOriginalAssetTransitionsOrBuilderList(){
       return this.originalAssetTransitions_;
    }
    public TimeRange getOriginalRange(){
       AssetRangeAction toriginalRan = this.originalRange_;
       if (toriginalRan == null) {
          toriginalRan = TimeRange.getDefaultInstance();
       }
       return toriginalRan;
    }
    public int getTrackIndex(){
       return this.trackIndex_;
    }
    public boolean hasOriginalRange(){
       boolean b = (this.originalRange_ != null)? true: false;
       return b;
    }
    public void mergeOriginalRange(TimeRange p0){
       Objects.requireNonNull(p0);
       AssetRangeAction toriginalRan = this.originalRange_;
       this.originalRange_ = (toriginalRan != null && toriginalRan != TimeRange.getDefaultInstance())? TimeRange.newBuilder(this.originalRange_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeOriginalAssetTransitions(int p0){
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.remove(p0);
    }
    public void setOriginalAssetTransitions(int p0,AssetTransitionActionData$b p1){
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.set(p0, p1.build());
    }
    public void setOriginalAssetTransitions(int p0,AssetTransitionActionData p1){
       Objects.requireNonNull(p1);
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.set(p0, p1);
    }
    public void setOriginalRange(TimeRange$b p0){
       this.originalRange_ = p0.build();
    }
    public void setOriginalRange(TimeRange p0){
       Objects.requireNonNull(p0);
       this.originalRange_ = p0;
    }
    public void setTrackIndex(int p0){
       this.trackIndex_ = p0;
    }
}
