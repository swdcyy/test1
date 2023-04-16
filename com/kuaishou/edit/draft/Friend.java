package com.kuaishou.edit.draft.Friend;
import z30.j0;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.Friend$b;
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
import com.kuaishou.edit.draft.Friend$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class Friend extends GeneratedMessageLite implements j0	// class@0017ab
{
    public String file_;
    public String id_;
    public static final Friend DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Friend uFriend = new Friend();
       Friend.DEFAULT_INSTANCE = uFriend;
       GeneratedMessageLite.registerDefaultInstance(Friend.class, uFriend);
    }
    public void Friend(){
       super();
       this.id_ = "";
       this.file_ = "";
    }
    public static Friend getDefaultInstance(){
       return Friend.DEFAULT_INSTANCE;
    }
    public static Friend$b newBuilder(){
       return Friend.DEFAULT_INSTANCE.createBuilder();
    }
    public static Friend$b newBuilder(Friend p0){
       return Friend.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Friend parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Friend.DEFAULT_INSTANCE, p0);
    }
    public static Friend parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Friend.DEFAULT_INSTANCE, p0, p1);
    }
    public static Friend parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Friend.DEFAULT_INSTANCE, p0);
    }
    public static Friend parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Friend.DEFAULT_INSTANCE, p0, p1);
    }
    public static Friend parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Friend.DEFAULT_INSTANCE, p0);
    }
    public static Friend parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Friend.DEFAULT_INSTANCE, p0, p1);
    }
    public static Friend parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Friend.DEFAULT_INSTANCE, p0);
    }
    public static Friend parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Friend.DEFAULT_INSTANCE, p0, p1);
    }
    public static Friend parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Friend.DEFAULT_INSTANCE, p0);
    }
    public static Friend parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Friend.DEFAULT_INSTANCE, p0, p1);
    }
    public static Friend parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Friend.DEFAULT_INSTANCE, p0);
    }
    public static Friend parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Friend.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Friend.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearFile(){
       this.file_ = Friend.getDefaultInstance().getFile();
    }
    public void clearId(){
       this.id_ = Friend.getDefaultInstance().getId();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Friend$a.a[p0.ordinal()]){
           case 1:
             return new Friend();
           case 2:
             return new Friend$b(p2);
           case 3:
             Object[] objArray = new Object[]{"id_","file_"};
             return GeneratedMessageLite.newMessageInfo(Friend.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return Friend.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Friend.PARSER;
             if (pARSER == null) {
                _monitor_enter(Friend.class);
                pARSER = Friend.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Friend.DEFAULT_INSTANCE);
                   Friend.PARSER = pARSER;
                }
                _monitor_exit(Friend.class);
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
    public String getFile(){
       return this.file_;
    }
    public ByteString getFileBytes(){
       return ByteString.copyFromUtf8(this.file_);
    }
    public String getId(){
       return this.id_;
    }
    public ByteString getIdBytes(){
       return ByteString.copyFromUtf8(this.id_);
    }
    public void setFile(String p0){
       Objects.requireNonNull(p0);
       this.file_ = p0;
    }
    public void setFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.file_ = p0.toStringUtf8();
    }
    public void setId(String p0){
       Objects.requireNonNull(p0);
       this.id_ = p0;
    }
    public void setIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.id_ = p0.toStringUtf8();
    }
}
