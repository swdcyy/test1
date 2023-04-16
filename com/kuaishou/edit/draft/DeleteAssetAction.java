package com.kuaishou.edit.draft.DeleteAssetAction;
import z30.u;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.DeleteAssetAction$b;
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
import com.kuaishou.edit.draft.DeleteAssetAction$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kuaishou.edit.draft.Asset;
import z30.f;
import com.kuaishou.edit.draft.Asset$b;

public final class DeleteAssetAction extends GeneratedMessageLite implements u	// class@00176c
{
    public Asset asset_;
    public Internal$ProtobufList originalAssetTransitions_;
    public int trackIndex_;
    public static final DeleteAssetAction DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       DeleteAssetAction uDeleteAsset = new DeleteAssetAction();
       DeleteAssetAction.DEFAULT_INSTANCE = uDeleteAsset;
       GeneratedMessageLite.registerDefaultInstance(DeleteAssetAction.class, uDeleteAsset);
    }
    public void DeleteAssetAction(){
       super();
       this.originalAssetTransitions_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static DeleteAssetAction getDefaultInstance(){
       return DeleteAssetAction.DEFAULT_INSTANCE;
    }
    public static DeleteAssetAction$b newBuilder(){
       return DeleteAssetAction.DEFAULT_INSTANCE.createBuilder();
    }
    public static DeleteAssetAction$b newBuilder(DeleteAssetAction p0){
       return DeleteAssetAction.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static DeleteAssetAction parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0);
    }
    public static DeleteAssetAction parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeleteAssetAction parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0);
    }
    public static DeleteAssetAction parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeleteAssetAction parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0);
    }
    public static DeleteAssetAction parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeleteAssetAction parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0);
    }
    public static DeleteAssetAction parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeleteAssetAction parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0);
    }
    public static DeleteAssetAction parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeleteAssetAction parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0);
    }
    public static DeleteAssetAction parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeleteAssetAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return DeleteAssetAction.DEFAULT_INSTANCE.getParserForType();
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
    public void clearAsset(){
       this.asset_ = null;
    }
    public void clearOriginalAssetTransitions(){
       this.originalAssetTransitions_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearTrackIndex(){
       this.trackIndex_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (DeleteAssetAction$a.a[p0.ordinal()]){
           case 1:
             return new DeleteAssetAction();
           case 2:
             return new DeleteAssetAction$b(p2);
           case 3:
             Object[] objArray = new Object[]{"trackIndex_","asset_","originalAssetTransitions_",AssetTransitionActionData.class};
             return GeneratedMessageLite.newMessageInfo(DeleteAssetAction.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x0b\x02\t\x03\x1b\x00", objArray);
           case 4:
             return DeleteAssetAction.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = DeleteAssetAction.PARSER;
             if (pARSER == null) {
                _monitor_enter(DeleteAssetAction.class);
                pARSER = DeleteAssetAction.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(DeleteAssetAction.DEFAULT_INSTANCE);
                   DeleteAssetAction.PARSER = pARSER;
                }
                _monitor_exit(DeleteAssetAction.class);
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
    public Asset getAsset(){
       DeleteAssetAction tasset_ = this.asset_;
       if (tasset_ == null) {
          tasset_ = Asset.getDefaultInstance();
       }
       return tasset_;
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
    public int getTrackIndex(){
       return this.trackIndex_;
    }
    public boolean hasAsset(){
       boolean b = (this.asset_ != null)? true: false;
       return b;
    }
    public void mergeAsset(Asset p0){
       Objects.requireNonNull(p0);
       DeleteAssetAction tasset_ = this.asset_;
       this.asset_ = (tasset_ != null && tasset_ != Asset.getDefaultInstance())? Asset.newBuilder(this.asset_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeOriginalAssetTransitions(int p0){
       this.ensureOriginalAssetTransitionsIsMutable();
       this.originalAssetTransitions_.remove(p0);
    }
    public void setAsset(Asset$b p0){
       this.asset_ = p0.build();
    }
    public void setAsset(Asset p0){
       Objects.requireNonNull(p0);
       this.asset_ = p0;
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
    public void setTrackIndex(int p0){
       this.trackIndex_ = p0;
    }
}
