package com.kwai.video.westeros.models.BokehDepthTouch;
import com.kwai.video.westeros.models.BokehDepthTouchOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.BokehDepthTouch$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.BokehDepthTouch$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class BokehDepthTouch extends GeneratedMessageLite implements BokehDepthTouchOrBuilder	// class@000ec7
{
    public float posx_;
    public float posy_;
    public static final BokehDepthTouch DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       BokehDepthTouch uBokehDepthT = new BokehDepthTouch();
       BokehDepthTouch.DEFAULT_INSTANCE = uBokehDepthT;
       GeneratedMessageLite.registerDefaultInstance(BokehDepthTouch.class, uBokehDepthT);
    }
    public void BokehDepthTouch(){
       super();
    }
    public static BokehDepthTouch getDefaultInstance(){
       return BokehDepthTouch.DEFAULT_INSTANCE;
    }
    public static BokehDepthTouch$Builder newBuilder(){
       return BokehDepthTouch.DEFAULT_INSTANCE.createBuilder();
    }
    public static BokehDepthTouch$Builder newBuilder(BokehDepthTouch p0){
       return BokehDepthTouch.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static BokehDepthTouch parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0);
    }
    public static BokehDepthTouch parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static BokehDepthTouch parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0);
    }
    public static BokehDepthTouch parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static BokehDepthTouch parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0);
    }
    public static BokehDepthTouch parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static BokehDepthTouch parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0);
    }
    public static BokehDepthTouch parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static BokehDepthTouch parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0);
    }
    public static BokehDepthTouch parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static BokehDepthTouch parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0);
    }
    public static BokehDepthTouch parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(BokehDepthTouch.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return BokehDepthTouch.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearPosx(){
       this.posx_ = 0;
    }
    public void clearPosy(){
       this.posy_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (BokehDepthTouch$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new BokehDepthTouch();
           case 2:
             return new BokehDepthTouch$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"posx_","posy_"};
             return GeneratedMessageLite.newMessageInfo(BokehDepthTouch.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x02\x01\x00", objArray);
           case 4:
             return BokehDepthTouch.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = BokehDepthTouch.PARSER;
             if (pARSER == null) {
                _monitor_enter(BokehDepthTouch.class);
                pARSER = BokehDepthTouch.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(BokehDepthTouch.DEFAULT_INSTANCE);
                   BokehDepthTouch.PARSER = pARSER;
                }
                _monitor_exit(BokehDepthTouch.class);
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
    public float getPosx(){
       return this.posx_;
    }
    public float getPosy(){
       return this.posy_;
    }
    public void setPosx(float p0){
       this.posx_ = p0;
    }
    public void setPosy(float p0){
       this.posy_ = p0;
    }
}
