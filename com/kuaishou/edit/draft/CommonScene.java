package com.kuaishou.edit.draft.CommonScene;
import z30.p;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.CommonScene$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.CommonScene$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class CommonScene extends GeneratedMessageLite implements p	// class@001756
{
    public boolean requireAlbum_;
    public static final CommonScene DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CommonScene uCommonScene = new CommonScene();
       CommonScene.DEFAULT_INSTANCE = uCommonScene;
       GeneratedMessageLite.registerDefaultInstance(CommonScene.class, uCommonScene);
    }
    public void CommonScene(){
       super();
    }
    public static CommonScene getDefaultInstance(){
       return CommonScene.DEFAULT_INSTANCE;
    }
    public static CommonScene$b newBuilder(){
       return CommonScene.DEFAULT_INSTANCE.createBuilder();
    }
    public static CommonScene$b newBuilder(CommonScene p0){
       return CommonScene.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CommonScene parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CommonScene.DEFAULT_INSTANCE, p0);
    }
    public static CommonScene parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CommonScene.DEFAULT_INSTANCE, p0, p1);
    }
    public static CommonScene parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CommonScene.DEFAULT_INSTANCE, p0);
    }
    public static CommonScene parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CommonScene.DEFAULT_INSTANCE, p0, p1);
    }
    public static CommonScene parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CommonScene.DEFAULT_INSTANCE, p0);
    }
    public static CommonScene parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CommonScene.DEFAULT_INSTANCE, p0, p1);
    }
    public static CommonScene parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CommonScene.DEFAULT_INSTANCE, p0);
    }
    public static CommonScene parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CommonScene.DEFAULT_INSTANCE, p0, p1);
    }
    public static CommonScene parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CommonScene.DEFAULT_INSTANCE, p0);
    }
    public static CommonScene parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CommonScene.DEFAULT_INSTANCE, p0, p1);
    }
    public static CommonScene parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CommonScene.DEFAULT_INSTANCE, p0);
    }
    public static CommonScene parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CommonScene.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CommonScene.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearRequireAlbum(){
       this.requireAlbum_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CommonScene$a.a[p0.ordinal()]){
           case 1:
             return new CommonScene();
           case 2:
             return new CommonScene$b(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "requireAlbum_";
             return GeneratedMessageLite.newMessageInfo(CommonScene.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x00", objArray);
           case 4:
             return CommonScene.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CommonScene.PARSER;
             if (pARSER == null) {
                _monitor_enter(CommonScene.class);
                pARSER = CommonScene.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CommonScene.DEFAULT_INSTANCE);
                   CommonScene.PARSER = pARSER;
                }
                _monitor_exit(CommonScene.class);
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
    public boolean getRequireAlbum(){
       return this.requireAlbum_;
    }
    public void setRequireAlbum(boolean p0){
       this.requireAlbum_ = p0;
    }
}
