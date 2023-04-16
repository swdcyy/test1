package com.kuaishou.edit.draft.AssetRotateAction;
import z30.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.AssetRotateAction$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.AssetRotateAction$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class AssetRotateAction extends GeneratedMessageLite implements c	// class@001717
{
    public int rotationDeg_;
    public int trackIndex_;
    public static final AssetRotateAction DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AssetRotateAction uAssetRotate = new AssetRotateAction();
       AssetRotateAction.DEFAULT_INSTANCE = uAssetRotate;
       GeneratedMessageLite.registerDefaultInstance(AssetRotateAction.class, uAssetRotate);
    }
    public void AssetRotateAction(){
       super();
    }
    public static AssetRotateAction getDefaultInstance(){
       return AssetRotateAction.DEFAULT_INSTANCE;
    }
    public static AssetRotateAction$b newBuilder(){
       return AssetRotateAction.DEFAULT_INSTANCE.createBuilder();
    }
    public static AssetRotateAction$b newBuilder(AssetRotateAction p0){
       return AssetRotateAction.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AssetRotateAction parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AssetRotateAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRotateAction parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AssetRotateAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetRotateAction parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AssetRotateAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRotateAction parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetRotateAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetRotateAction parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AssetRotateAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRotateAction parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetRotateAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetRotateAction parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AssetRotateAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRotateAction parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetRotateAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetRotateAction parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AssetRotateAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRotateAction parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetRotateAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetRotateAction parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AssetRotateAction.DEFAULT_INSTANCE, p0);
    }
    public static AssetRotateAction parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetRotateAction.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AssetRotateAction.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearRotationDeg(){
       this.rotationDeg_ = 0;
    }
    public void clearTrackIndex(){
       this.trackIndex_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AssetRotateAction$a.a[p0.ordinal()]){
           case 1:
             return new AssetRotateAction();
           case 2:
             return new AssetRotateAction$b(p2);
           case 3:
             Object[] objArray = new Object[]{"trackIndex_","rotationDeg_"};
             return GeneratedMessageLite.newMessageInfo(AssetRotateAction.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x02\x0b\x00", objArray);
           case 4:
             return AssetRotateAction.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AssetRotateAction.PARSER;
             if (pARSER == null) {
                _monitor_enter(AssetRotateAction.class);
                pARSER = AssetRotateAction.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AssetRotateAction.DEFAULT_INSTANCE);
                   AssetRotateAction.PARSER = pARSER;
                }
                _monitor_exit(AssetRotateAction.class);
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
    public int getRotationDeg(){
       return this.rotationDeg_;
    }
    public int getTrackIndex(){
       return this.trackIndex_;
    }
    public void setRotationDeg(int p0){
       this.rotationDeg_ = p0;
    }
    public void setTrackIndex(int p0){
       this.trackIndex_ = p0;
    }
}
