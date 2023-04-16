package com.kuaishou.edit.draft.AssetSpeedAction;
import z30.e;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.AssetSpeedAction$b;
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
import com.kuaishou.edit.draft.AssetSpeedAction$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import z30.f;

public final class AssetSpeedAction extends GeneratedMessageLite implements e	// class@00171d
{
    public int editingIndex_;
    public Internal$ProtobufList originalAssetTransitions_;
    public double speed_;
    public static final AssetSpeedAction DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AssetSpeedAction uAssetSpeedA = new AssetSpeedAction();
       AssetSpeedAction.DEFAULT_INSTANCE = uAssetSpeedA;
       GeneratedMessageLite.registerDefaultInstance(AssetSpeedAction.class, uAssetSpeedA);
    }
    public void AssetSpeedAction(){
       super();
       this.originalAssetTransitions_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static AssetSpeedAction getDefaultInstance(){
       return AssetSpeedAction.DEFAULT_INSTANCE;
    }
    public static AssetSpeedAction$b newBuilder(){
       return AssetSpeedAction.DEFAULT_INSTANCE.createBuilder();
    }
    public static AssetSpeedAction$b newBuilder(AssetSpeedAction p0){
       return AssetSpeedAction.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AssetSpeedAction parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetSpeedAction parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetSpeedAction parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetSpeedAction parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetSpeedAction parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetSpeedAction parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetSpeedAction parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetSpeedAction parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetSpeedAction parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetSpeedAction parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetSpeedAction parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetSpeedAction parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetSpeedAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AssetSpeedAction.DEFAULT_INSTANCE.getParserForType();
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
    public void clearEditingIndex(){
       this.editingIndex_ = 0;
    }
    public void clearOriginalAssetTransitions(){
       this.originalAssetTransitions_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearSpeed(){
       this.speed_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AssetSpeedAction$a.a[p0.ordinal()]){
           case 1:
             return new AssetSpeedAction();
           case 2:
             return new AssetSpeedAction$b(p2);
           case 3:
             Object[] objArray = new Object[]{"speed_","editingIndex_","originalAssetTransitions_",AssetTransitionActionData.class};
             return GeneratedMessageLite.newMessageInfo(AssetSpeedAction.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x02\x0b\x03\x1b\x00", objArray);
           case 4:
             return AssetSpeedAction.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AssetSpeedAction.PARSER;
             if (pARSER == null) {
                _monitor_enter(AssetSpeedAction.class);
                pARSER = AssetSpeedAction.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AssetSpeedAction.DEFAULT_INSTANCE);
                   AssetSpeedAction.PARSER = pARSER;
                }
                _monitor_exit(AssetSpeedAction.class);
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
    public int getEditingIndex(){
       return this.editingIndex_;
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
    public double getSpeed(){
       return this.speed_;
    }
    public void removeOriginalAssetTransitions(int p0){
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.remove(p0);
    }
    public void setEditingIndex(int p0){
       this.editingIndex_ = p0;
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
    public void setSpeed(double p0){
       this.speed_ = p0;
    }
}
