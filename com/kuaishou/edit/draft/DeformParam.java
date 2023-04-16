package com.kuaishou.edit.draft.DeformParam;
import z30.t;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.DeformParam$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.DeformParam$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class DeformParam extends GeneratedMessageLite implements t	// class@001769
{
    public int identifier_;
    public float intensity_;
    public static final DeformParam DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       DeformParam uDeformParam = new DeformParam();
       DeformParam.DEFAULT_INSTANCE = uDeformParam;
       GeneratedMessageLite.registerDefaultInstance(DeformParam.class, uDeformParam);
    }
    public void DeformParam(){
       super();
    }
    public static DeformParam getDefaultInstance(){
       return DeformParam.DEFAULT_INSTANCE;
    }
    public static DeformParam$b newBuilder(){
       return DeformParam.DEFAULT_INSTANCE.createBuilder();
    }
    public static DeformParam$b newBuilder(DeformParam p0){
       return DeformParam.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static DeformParam parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(DeformParam.DEFAULT_INSTANCE, p0);
    }
    public static DeformParam parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(DeformParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeformParam parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(DeformParam.DEFAULT_INSTANCE, p0);
    }
    public static DeformParam parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeformParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeformParam parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(DeformParam.DEFAULT_INSTANCE, p0);
    }
    public static DeformParam parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeformParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeformParam parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(DeformParam.DEFAULT_INSTANCE, p0);
    }
    public static DeformParam parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeformParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeformParam parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(DeformParam.DEFAULT_INSTANCE, p0);
    }
    public static DeformParam parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeformParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static DeformParam parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(DeformParam.DEFAULT_INSTANCE, p0);
    }
    public static DeformParam parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(DeformParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return DeformParam.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearIdentifier(){
       this.identifier_ = 0;
    }
    public void clearIntensity(){
       this.intensity_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (DeformParam$a.a[p0.ordinal()]){
           case 1:
             return new DeformParam();
           case 2:
             return new DeformParam$b(p2);
           case 3:
             Object[] objArray = new Object[]{"identifier_","intensity_"};
             return GeneratedMessageLite.newMessageInfo(DeformParam.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x02\x01\x00", objArray);
           case 4:
             return DeformParam.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = DeformParam.PARSER;
             if (pARSER == null) {
                _monitor_enter(DeformParam.class);
                pARSER = DeformParam.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(DeformParam.DEFAULT_INSTANCE);
                   DeformParam.PARSER = pARSER;
                }
                _monitor_exit(DeformParam.class);
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
    public int getIdentifier(){
       return this.identifier_;
    }
    public float getIntensity(){
       return this.intensity_;
    }
    public void setIdentifier(int p0){
       this.identifier_ = p0;
    }
    public void setIntensity(float p0){
       this.intensity_ = p0;
    }
}
