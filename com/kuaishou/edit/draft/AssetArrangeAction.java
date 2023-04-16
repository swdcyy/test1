package com.kuaishou.edit.draft.AssetArrangeAction;
import z30.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.AssetArrangeAction$b;
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
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.Asset;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.AssetArrangeAction$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import z30.f;
import com.kuaishou.edit.draft.c;

public final class AssetArrangeAction extends GeneratedMessageLite implements a	// class@001711
{
    public Internal$ProtobufList originalAssetTransitions_;
    public Internal$ProtobufList originalAssets_;
    public static final AssetArrangeAction DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AssetArrangeAction uAssetArrang = new AssetArrangeAction();
       AssetArrangeAction.DEFAULT_INSTANCE = uAssetArrang;
       GeneratedMessageLite.registerDefaultInstance(AssetArrangeAction.class, uAssetArrang);
    }
    public void AssetArrangeAction(){
       super();
       this.originalAssets_ = GeneratedMessageLite.emptyProtobufList();
       this.originalAssetTransitions_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static AssetArrangeAction getDefaultInstance(){
       return AssetArrangeAction.DEFAULT_INSTANCE;
    }
    public static AssetArrangeAction$b newBuilder(){
       return AssetArrangeAction.DEFAULT_INSTANCE.createBuilder();
    }
    public static AssetArrangeAction$b newBuilder(AssetArrangeAction p0){
       return AssetArrangeAction.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AssetArrangeAction parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetArrangeAction parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetArrangeAction parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetArrangeAction parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetArrangeAction parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetArrangeAction parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetArrangeAction parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetArrangeAction parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetArrangeAction parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetArrangeAction parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetArrangeAction parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetArrangeAction parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetArrangeAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AssetArrangeAction.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllOriginalAssetTransitions(Iterable p0){
       this.ensureOriginalAssetTransitionsIsMutable();
       AbstractMessageLite.addAll(p0, this.originalAssetTransitions_);
    }
    public void addAllOriginalAssets(Iterable p0){
       this.ensureOriginalAssetsIsMutable();
       AbstractMessageLite.addAll(p0, this.originalAssets_);
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
    public void addOriginalAssets(int p0,Asset$b p1){
       this.ensureOriginalAssetsIsMutable();
       this.originalAssets_.add(p0, p1.build());
    }
    public void addOriginalAssets(int p0,Asset p1){
       Objects.requireNonNull(p1);
       this.ensureOriginalAssetsIsMutable();
       this.originalAssets_.add(p0, p1);
    }
    public void addOriginalAssets(Asset$b p0){
       this.ensureOriginalAssetsIsMutable();
       this.originalAssets_.add(p0.build());
    }
    public void addOriginalAssets(Asset p0){
       Objects.requireNonNull(p0);
       this.ensureOriginalAssetsIsMutable();
       this.originalAssets_.add(p0);
    }
    public void clearOriginalAssetTransitions(){
       this.originalAssetTransitions_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearOriginalAssets(){
       this.originalAssets_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AssetArrangeAction$a.a[p0.ordinal()]){
           case 1:
             return new AssetArrangeAction();
           case 2:
             return new AssetArrangeAction$b(p2);
           case 3:
             Object[] objArray = new Object[]{"originalAssets_",Asset.class,"originalAssetTransitions_",AssetTransitionActionData.class};
             return GeneratedMessageLite.newMessageInfo(AssetArrangeAction.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x1b\x02\x1b\x00", objArray);
           case 4:
             return AssetArrangeAction.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AssetArrangeAction.PARSER;
             if (pARSER == null) {
                _monitor_enter(AssetArrangeAction.class);
                pARSER = AssetArrangeAction.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AssetArrangeAction.DEFAULT_INSTANCE);
                   AssetArrangeAction.PARSER = pARSER;
                }
                _monitor_exit(AssetArrangeAction.class);
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
    public final void ensureOriginalAssetsIsMutable(){
       if (!this.originalAssets_.isModifiable()) {
          this.originalAssets_ = GeneratedMessageLite.mutableCopy(this.originalAssets_);
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
    public Asset getOriginalAssets(int p0){
       return this.originalAssets_.get(p0);
    }
    public int getOriginalAssetsCount(){
       return this.originalAssets_.size();
    }
    public List getOriginalAssetsList(){
       return this.originalAssets_;
    }
    public c getOriginalAssetsOrBuilder(int p0){
       return this.originalAssets_.get(p0);
    }
    public List getOriginalAssetsOrBuilderList(){
       return this.originalAssets_;
    }
    public void removeOriginalAssetTransitions(int p0){
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.remove(p0);
    }
    public void removeOriginalAssets(int p0){
       this.ensureOriginalAssetsIsMutable();
       this.originalAssets_.remove(p0);
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
    public void setOriginalAssets(int p0,Asset$b p1){
       this.ensureOriginalAssetsIsMutable();
       this.originalAssets_.set(p0, p1.build());
    }
    public void setOriginalAssets(int p0,Asset p1){
       Objects.requireNonNull(p1);
       this.ensureOriginalAssetsIsMutable();
       this.originalAssets_.set(p0, p1);
    }
}
