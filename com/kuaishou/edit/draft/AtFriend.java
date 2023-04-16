package com.kuaishou.edit.draft.AtFriend;
import z30.i;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.AtFriend$b;
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
import com.kuaishou.edit.draft.AtFriend$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class AtFriend extends GeneratedMessageLite implements i	// class@001729
{
    public String identifier_;
    public boolean isMutualFriend_;
    public String name_;
    public static final AtFriend DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AtFriend uAtFriend = new AtFriend();
       AtFriend.DEFAULT_INSTANCE = uAtFriend;
       GeneratedMessageLite.registerDefaultInstance(AtFriend.class, uAtFriend);
    }
    public void AtFriend(){
       super();
       this.name_ = "";
       this.identifier_ = "";
    }
    public static AtFriend getDefaultInstance(){
       return AtFriend.DEFAULT_INSTANCE;
    }
    public static AtFriend$b newBuilder(){
       return AtFriend.DEFAULT_INSTANCE.createBuilder();
    }
    public static AtFriend$b newBuilder(AtFriend p0){
       return AtFriend.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AtFriend parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AtFriend.DEFAULT_INSTANCE, p0);
    }
    public static AtFriend parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AtFriend.DEFAULT_INSTANCE, p0, p1);
    }
    public static AtFriend parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AtFriend.DEFAULT_INSTANCE, p0);
    }
    public static AtFriend parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AtFriend.DEFAULT_INSTANCE, p0, p1);
    }
    public static AtFriend parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AtFriend.DEFAULT_INSTANCE, p0);
    }
    public static AtFriend parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AtFriend.DEFAULT_INSTANCE, p0, p1);
    }
    public static AtFriend parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AtFriend.DEFAULT_INSTANCE, p0);
    }
    public static AtFriend parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AtFriend.DEFAULT_INSTANCE, p0, p1);
    }
    public static AtFriend parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AtFriend.DEFAULT_INSTANCE, p0);
    }
    public static AtFriend parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AtFriend.DEFAULT_INSTANCE, p0, p1);
    }
    public static AtFriend parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AtFriend.DEFAULT_INSTANCE, p0);
    }
    public static AtFriend parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AtFriend.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AtFriend.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearIdentifier(){
       this.identifier_ = AtFriend.getDefaultInstance().getIdentifier();
    }
    public void clearIsMutualFriend(){
       this.isMutualFriend_ = false;
    }
    public void clearName(){
       this.name_ = AtFriend.getDefaultInstance().getName();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AtFriend$a.a[p0.ordinal()]){
           case 1:
             return new AtFriend();
           case 2:
             return new AtFriend$b(p2);
           case 3:
             Object[] objArray = new Object[]{"name_","identifier_","isMutualFriend_"};
             return GeneratedMessageLite.newMessageInfo(AtFriend.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07\x00", objArray);
           case 4:
             return AtFriend.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AtFriend.PARSER;
             if (pARSER == null) {
                _monitor_enter(AtFriend.class);
                pARSER = AtFriend.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AtFriend.DEFAULT_INSTANCE);
                   AtFriend.PARSER = pARSER;
                }
                _monitor_exit(AtFriend.class);
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
    public String getIdentifier(){
       return this.identifier_;
    }
    public ByteString getIdentifierBytes(){
       return ByteString.copyFromUtf8(this.identifier_);
    }
    public boolean getIsMutualFriend(){
       return this.isMutualFriend_;
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public void setIdentifier(String p0){
       Objects.requireNonNull(p0);
       this.identifier_ = p0;
    }
    public void setIdentifierBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.identifier_ = p0.toStringUtf8();
    }
    public void setIsMutualFriend(boolean p0){
       this.isMutualFriend_ = p0;
    }
    public void setName(String p0){
       Objects.requireNonNull(p0);
       this.name_ = p0;
    }
    public void setNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
    }
}
