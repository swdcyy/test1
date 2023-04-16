package com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContextOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.SourceContext$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.SourceContext$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class SourceContext extends GeneratedMessageLite implements SourceContextOrBuilder	// class@0004b5
{
    public String fileName_;
    public static final SourceContext DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       SourceContext sourceContex = new SourceContext();
       SourceContext.DEFAULT_INSTANCE = sourceContex;
       GeneratedMessageLite.registerDefaultInstance(SourceContext.class, sourceContex);
    }
    public void SourceContext(){
       super();
       this.fileName_ = "";
    }
    public static SourceContext getDefaultInstance(){
       return SourceContext.DEFAULT_INSTANCE;
    }
    public static SourceContext$Builder newBuilder(){
       return SourceContext.DEFAULT_INSTANCE.createBuilder();
    }
    public static SourceContext$Builder newBuilder(SourceContext p0){
       return SourceContext.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SourceContext parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(SourceContext.DEFAULT_INSTANCE, p0);
    }
    public static SourceContext parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(SourceContext.DEFAULT_INSTANCE, p0, p1);
    }
    public static SourceContext parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, p0);
    }
    public static SourceContext parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, p0, p1);
    }
    public static SourceContext parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, p0);
    }
    public static SourceContext parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, p0, p1);
    }
    public static SourceContext parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, p0);
    }
    public static SourceContext parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, p0, p1);
    }
    public static SourceContext parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, p0);
    }
    public static SourceContext parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, p0, p1);
    }
    public static SourceContext parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, p0);
    }
    public static SourceContext parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return SourceContext.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearFileName(){
       this.fileName_ = SourceContext.getDefaultInstance().getFileName();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (SourceContext$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new SourceContext();
           case 2:
             return new SourceContext$Builder(p2);
           case 3:
             Object[] objArray = new Object[i];
             objArray[0] = "fileName_";
             return GeneratedMessageLite.newMessageInfo(SourceContext.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x00", objArray);
           case 4:
             return SourceContext.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = SourceContext.PARSER;
             if (pARSER == null) {
                _monitor_enter(SourceContext.class);
                pARSER = SourceContext.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(SourceContext.DEFAULT_INSTANCE);
                   SourceContext.PARSER = pARSER;
                }
                _monitor_exit(SourceContext.class);
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
    public String getFileName(){
       return this.fileName_;
    }
    public ByteString getFileNameBytes(){
       return ByteString.copyFromUtf8(this.fileName_);
    }
    public void setFileName(String p0){
       Objects.requireNonNull(p0);
       this.fileName_ = p0;
    }
    public void setFileNameBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.fileName_ = p0.toStringUtf8();
    }
}
