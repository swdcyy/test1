package com.kuaishou.edit.draft.AssetTransitionAction;
import z30.g;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.AssetTransitionAction$b;
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
import com.kuaishou.edit.draft.AssetTransitionAction$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import z30.f;

public final class AssetTransitionAction extends GeneratedMessageLite implements g	// class@001723
{
    public boolean curApplyToAll_;
    public int curType_;
    public Internal$ProtobufList originalAssetTransitions_;
    public boolean preApplyToAll_;
    public static final AssetTransitionAction DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AssetTransitionAction uAssetTransi = new AssetTransitionAction();
       AssetTransitionAction.DEFAULT_INSTANCE = uAssetTransi;
       GeneratedMessageLite.registerDefaultInstance(AssetTransitionAction.class, uAssetTransi);
    }
    public void AssetTransitionAction(){
       super();
       this.originalAssetTransitions_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static AssetTransitionAction getDefaultInstance(){
       return AssetTransitionAction.DEFAULT_INSTANCE;
    }
    public static AssetTransitionAction$b newBuilder(){
       return AssetTransitionAction.DEFAULT_INSTANCE.createBuilder();
    }
    public static AssetTransitionAction$b newBuilder(AssetTransitionAction p0){
       return AssetTransitionAction.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AssetTransitionAction parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionAction parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransitionAction parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionAction parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransitionAction parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionAction parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransitionAction parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionAction parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransitionAction parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionAction parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransitionAction parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionAction parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransitionAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AssetTransitionAction.DEFAULT_INSTANCE.getParserForType();
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
    public void clearCurApplyToAll(){
       this.curApplyToAll_ = false;
    }
    public void clearCurType(){
       this.curType_ = 0;
    }
    public void clearOriginalAssetTransitions(){
       this.originalAssetTransitions_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearPreApplyToAll(){
       this.preApplyToAll_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AssetTransitionAction$a.a[p0.ordinal()]){
           case 1:
             return new AssetTransitionAction();
           case 2:
             return new AssetTransitionAction$b(p2);
           case 3:
             Object[] objArray = new Object[]{"originalAssetTransitions_",AssetTransitionActionData.class,"preApplyToAll_","curApplyToAll_","curType_"};
             return GeneratedMessageLite.newMessageInfo(AssetTransitionAction.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x07\x03\x07\x04\x0b\x00", objArray);
           case 4:
             return AssetTransitionAction.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AssetTransitionAction.PARSER;
             if (pARSER == null) {
                _monitor_enter(AssetTransitionAction.class);
                pARSER = AssetTransitionAction.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AssetTransitionAction.DEFAULT_INSTANCE);
                   AssetTransitionAction.PARSER = pARSER;
                }
                _monitor_exit(AssetTransitionAction.class);
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
    public boolean getCurApplyToAll(){
       return this.curApplyToAll_;
    }
    public int getCurType(){
       return this.curType_;
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
    public boolean getPreApplyToAll(){
       return this.preApplyToAll_;
    }
    public void removeOriginalAssetTransitions(int p0){
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.remove(p0);
    }
    public void setCurApplyToAll(boolean p0){
       this.curApplyToAll_ = p0;
    }
    public void setCurType(int p0){
       this.curType_ = p0;
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
    public void setPreApplyToAll(boolean p0){
       this.preApplyToAll_ = p0;
    }
}
