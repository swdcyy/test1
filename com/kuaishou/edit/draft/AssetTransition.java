package com.kuaishou.edit.draft.AssetTransition;
import z30.h;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.AssetTransition$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.AssetTransition$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class AssetTransition extends GeneratedMessageLite implements h	// class@001720
{
    public double duration_;
    public int sdkType_;
    public static final AssetTransition DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AssetTransition uAssetTransi = new AssetTransition();
       AssetTransition.DEFAULT_INSTANCE = uAssetTransi;
       GeneratedMessageLite.registerDefaultInstance(AssetTransition.class, uAssetTransi);
    }
    public void AssetTransition(){
       super();
    }
    public static AssetTransition getDefaultInstance(){
       return AssetTransition.DEFAULT_INSTANCE;
    }
    public static AssetTransition$b newBuilder(){
       return AssetTransition.DEFAULT_INSTANCE.createBuilder();
    }
    public static AssetTransition$b newBuilder(AssetTransition p0){
       return AssetTransition.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AssetTransition parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AssetTransition.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransition parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AssetTransition.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransition parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AssetTransition.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransition parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransition.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransition parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AssetTransition.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransition parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransition.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransition parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AssetTransition.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransition parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransition.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransition parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AssetTransition.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransition parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransition.DEFAULT_INSTANCE, p0, p1);
    }
    public static AssetTransition parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AssetTransition.DEFAULT_INSTANCE, p0);
    }
    public static AssetTransition parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AssetTransition.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AssetTransition.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDuration(){
       this.duration_ = 0;
    }
    public void clearSdkType(){
       this.sdkType_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AssetTransition$a.a[p0.ordinal()]){
           case 1:
             return new AssetTransition();
           case 2:
             return new AssetTransition$b(p2);
           case 3:
             Object[] objArray = new Object[]{"sdkType_","duration_"};
             return GeneratedMessageLite.newMessageInfo(AssetTransition.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x02\xff\x02\xff\x02\x00", objArray);
           case 4:
             return AssetTransition.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AssetTransition.PARSER;
             if (pARSER == null) {
                _monitor_enter(AssetTransition.class);
                pARSER = AssetTransition.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AssetTransition.DEFAULT_INSTANCE);
                   AssetTransition.PARSER = pARSER;
                }
                _monitor_exit(AssetTransition.class);
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
    public double getDuration(){
       return this.duration_;
    }
    public int getSdkType(){
       return this.sdkType_;
    }
    public void setDuration(double p0){
       this.duration_ = p0;
    }
    public void setSdkType(int p0){
       this.sdkType_ = p0;
    }
}
