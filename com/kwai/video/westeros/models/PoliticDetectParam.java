package com.kwai.video.westeros.models.PoliticDetectParam;
import com.kwai.video.westeros.models.PoliticDetectParamOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.PoliticDetectParam$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.PoliticDetectParam$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class PoliticDetectParam extends GeneratedMessageLite implements PoliticDetectParamOrBuilder	// class@001010
{
    public boolean enable_;
    public static final PoliticDetectParam DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PoliticDetectParam politicDetec = new PoliticDetectParam();
       PoliticDetectParam.DEFAULT_INSTANCE = politicDetec;
       GeneratedMessageLite.registerDefaultInstance(PoliticDetectParam.class, politicDetec);
    }
    public void PoliticDetectParam(){
       super();
    }
    public static PoliticDetectParam getDefaultInstance(){
       return PoliticDetectParam.DEFAULT_INSTANCE;
    }
    public static PoliticDetectParam$Builder newBuilder(){
       return PoliticDetectParam.DEFAULT_INSTANCE.createBuilder();
    }
    public static PoliticDetectParam$Builder newBuilder(PoliticDetectParam p0){
       return PoliticDetectParam.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PoliticDetectParam parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0);
    }
    public static PoliticDetectParam parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static PoliticDetectParam parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0);
    }
    public static PoliticDetectParam parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static PoliticDetectParam parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0);
    }
    public static PoliticDetectParam parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static PoliticDetectParam parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0);
    }
    public static PoliticDetectParam parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static PoliticDetectParam parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0);
    }
    public static PoliticDetectParam parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static PoliticDetectParam parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0);
    }
    public static PoliticDetectParam parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PoliticDetectParam.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PoliticDetectParam.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearEnable(){
       this.enable_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PoliticDetectParam$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PoliticDetectParam();
           case 2:
             return new PoliticDetectParam$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "enable_";
             return GeneratedMessageLite.newMessageInfo(PoliticDetectParam.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x00", objArray);
           case 4:
             return PoliticDetectParam.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PoliticDetectParam.PARSER;
             if (pARSER == null) {
                _monitor_enter(PoliticDetectParam.class);
                pARSER = PoliticDetectParam.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PoliticDetectParam.DEFAULT_INSTANCE);
                   PoliticDetectParam.PARSER = pARSER;
                }
                _monitor_exit(PoliticDetectParam.class);
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
    public boolean getEnable(){
       return this.enable_;
    }
    public void setEnable(boolean p0){
       this.enable_ = p0;
    }
}
