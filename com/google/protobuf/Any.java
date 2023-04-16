package com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.ByteString;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.google.protobuf.Any$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class Any extends GeneratedMessageLite implements AnyOrBuilder	// class@0003ad
{
    public String typeUrl_;
    public ByteString value_;
    public static final Any DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Any uAny = new Any();
       Any.DEFAULT_INSTANCE = uAny;
       GeneratedMessageLite.registerDefaultInstance(Any.class, uAny);
    }
    public void Any(){
       super();
       this.typeUrl_ = "";
       this.value_ = ByteString.EMPTY;
    }
    public static Any getDefaultInstance(){
       return Any.DEFAULT_INSTANCE;
    }
    public static Any$Builder newBuilder(){
       return Any.DEFAULT_INSTANCE.createBuilder();
    }
    public static Any$Builder newBuilder(Any p0){
       return Any.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Any parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Any.DEFAULT_INSTANCE, p0);
    }
    public static Any parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Any.DEFAULT_INSTANCE, p0, p1);
    }
    public static Any parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, p0);
    }
    public static Any parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, p0, p1);
    }
    public static Any parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, p0);
    }
    public static Any parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, p0, p1);
    }
    public static Any parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, p0);
    }
    public static Any parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, p0, p1);
    }
    public static Any parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, p0);
    }
    public static Any parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, p0, p1);
    }
    public static Any parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, p0);
    }
    public static Any parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Any.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearTypeUrl(){
       this.typeUrl_ = Any.getDefaultInstance().getTypeUrl();
    }
    public void clearValue(){
       this.value_ = Any.getDefaultInstance().getValue();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Any$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Any();
           case 2:
             return new Any$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"typeUrl_","value_"};
             return GeneratedMessageLite.newMessageInfo(Any.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\n\x00", objArray);
           case 4:
             return Any.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Any.PARSER;
             if (pARSER == null) {
                _monitor_enter(Any.class);
                pARSER = Any.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Any.DEFAULT_INSTANCE);
                   Any.PARSER = pARSER;
                }
                _monitor_exit(Any.class);
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
    public String getTypeUrl(){
       return this.typeUrl_;
    }
    public ByteString getTypeUrlBytes(){
       return ByteString.copyFromUtf8(this.typeUrl_);
    }
    public ByteString getValue(){
       return this.value_;
    }
    public void setTypeUrl(String p0){
       Objects.requireNonNull(p0);
       this.typeUrl_ = p0;
    }
    public void setTypeUrlBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.typeUrl_ = p0.toStringUtf8();
    }
    public void setValue(ByteString p0){
       Objects.requireNonNull(p0);
       this.value_ = p0;
    }
}
