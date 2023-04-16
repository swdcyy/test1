package com.google.protobuf.Mixin;
import com.google.protobuf.MixinOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Mixin$Builder;
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
import com.google.protobuf.Mixin$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class Mixin extends GeneratedMessageLite implements MixinOrBuilder	// class@000487
{
    public String name_;
    public String root_;
    public static final Mixin DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Mixin mixin = new Mixin();
       Mixin.DEFAULT_INSTANCE = mixin;
       GeneratedMessageLite.registerDefaultInstance(Mixin.class, mixin);
    }
    public void Mixin(){
       super();
       this.name_ = "";
       this.root_ = "";
    }
    public static Mixin getDefaultInstance(){
       return Mixin.DEFAULT_INSTANCE;
    }
    public static Mixin$Builder newBuilder(){
       return Mixin.DEFAULT_INSTANCE.createBuilder();
    }
    public static Mixin$Builder newBuilder(Mixin p0){
       return Mixin.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Mixin parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Mixin.DEFAULT_INSTANCE, p0);
    }
    public static Mixin parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Mixin.DEFAULT_INSTANCE, p0, p1);
    }
    public static Mixin parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, p0);
    }
    public static Mixin parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, p0, p1);
    }
    public static Mixin parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, p0);
    }
    public static Mixin parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, p0, p1);
    }
    public static Mixin parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, p0);
    }
    public static Mixin parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, p0, p1);
    }
    public static Mixin parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, p0);
    }
    public static Mixin parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, p0, p1);
    }
    public static Mixin parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, p0);
    }
    public static Mixin parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Mixin.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Mixin.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearName(){
       this.name_ = Mixin.getDefaultInstance().getName();
    }
    public void clearRoot(){
       this.root_ = Mixin.getDefaultInstance().getRoot();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Mixin$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new Mixin();
           case 2:
             return new Mixin$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","root_"};
             return GeneratedMessageLite.newMessageInfo(Mixin.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return Mixin.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Mixin.PARSER;
             if (pARSER == null) {
                _monitor_enter(Mixin.class);
                pARSER = Mixin.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Mixin.DEFAULT_INSTANCE);
                   Mixin.PARSER = pARSER;
                }
                _monitor_exit(Mixin.class);
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
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public String getRoot(){
       return this.root_;
    }
    public ByteString getRootBytes(){
       return ByteString.copyFromUtf8(this.root_);
    }
    public void setName(String p0){
       Objects.requireNonNull(p0);
       this.name_ = p0;
    }
    public void setNameBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
    }
    public void setRoot(String p0){
       Objects.requireNonNull(p0);
       this.root_ = p0;
    }
    public void setRootBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.root_ = p0.toStringUtf8();
    }
}
