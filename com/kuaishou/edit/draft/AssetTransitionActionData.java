package com.kuaishou.edit.draft.AssetTransitionActionData;
import z30.f;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.AssetTransitionActionData$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.AssetTransitionActionData$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kuaishou.edit.draft.AssetTransition;
import java.util.Objects;
import com.kuaishou.edit.draft.AssetTransition$b;

public final class AssetTransitionActionData extends GeneratedMessageLite implements f	// class@001726
{
    public AssetTransition assetTransition_;
    public int trackIndex_;
    public static final AssetTransitionActionData DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AssetTransitionActionData uAssetTransi = new AssetTransitionActionData();
       AssetTransitionActionData.DEFAULT_INSTANCE = uAssetTransi;
       GeneratedMessageLite.registerDefaultInstance(AssetTransitionActionData.class, uAssetTransi);
    }
    public void AssetTransitionActionData(){
       super();
    }
    public static AssetTransitionActionData getDefaultInstance(){
       return AssetTransitionActionData.DEFAULT_INSTANCE;
    }
    public static AssetTransitionActionData$b newBuilder(){
       return AssetTransitionActionData.DEFAULT_INSTANCE.createBuilder();
    }
    public static AssetTransitionActionData$b newBuilder(AssetTransitionActionData p0){
       return AssetTransitionActionData.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AssetTransitionActionData parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionActionData parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransitionActionData parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionActionData parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransitionActionData parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionActionData parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransitionActionData parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionActionData parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransitionActionData parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionActionData parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransitionActionData parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransitionActionData parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransitionActionData.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AssetTransitionActionData.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAssetTransition(){
       this.assetTransition_ = null;
    }
    public void clearTrackIndex(){
       this.trackIndex_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AssetTransitionActionData$a.a[p0.ordinal()]){
           case 1:
             return new AssetTransitionActionData();
           case 2:
             return new AssetTransitionActionData$b(p2);
           case 3:
             Object[] objArray = new Object[]{"assetTransition_","trackIndex_"};
             return GeneratedMessageLite.newMessageInfo(AssetTransitionActionData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\x0b\x00", objArray);
           case 4:
             return AssetTransitionActionData.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AssetTransitionActionData.PARSER;
             if (pARSER == null) {
                _monitor_enter(AssetTransitionActionData.class);
                pARSER = AssetTransitionActionData.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AssetTransitionActionData.DEFAULT_INSTANCE);
                   AssetTransitionActionData.PARSER = pARSER;
                }
                _monitor_exit(AssetTransitionActionData.class);
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
    public AssetTransition getAssetTransition(){
       AssetTransitionActionData tassetTransi = this.assetTransition_;
       if (tassetTransi == null) {
          tassetTransi = AssetTransition.getDefaultInstance();
       }
       return tassetTransi;
    }
    public int getTrackIndex(){
       return this.trackIndex_;
    }
    public boolean hasAssetTransition(){
       boolean b = (this.assetTransition_ != null)? true: false;
       return b;
    }
    public void mergeAssetTransition(AssetTransition p0){
       Objects.requireNonNull(p0);
       AssetTransitionActionData tassetTransi = this.assetTransition_;
       this.assetTransition_ = (tassetTransi != null && tassetTransi != AssetTransition.getDefaultInstance())? AssetTransition.newBuilder(this.assetTransition_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAssetTransition(AssetTransition$b p0){
       this.assetTransition_ = p0.build();
    }
    public void setAssetTransition(AssetTransition p0){
       Objects.requireNonNull(p0);
       this.assetTransition_ = p0;
    }
    public void setTrackIndex(int p0){
       this.trackIndex_ = p0;
    }
}
