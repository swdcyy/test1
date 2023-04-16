package com.kuaishou.edit.draft.FaceMagicEffect$Extra$CheckMd5;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$CheckMd5$a;
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
import com.kuaishou.edit.draft.FaceMagicEffect$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class FaceMagicEffect$Extra$CheckMd5 extends GeneratedMessageLite implements FaceMagicEffect$Extra$b	// class@001792
{
    public String file_;
    public String md5_;
    public static final FaceMagicEffect$Extra$CheckMd5 DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FaceMagicEffect$Extra$CheckMd5 uExtra$Check = new FaceMagicEffect$Extra$CheckMd5();
       FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE = uExtra$Check;
       GeneratedMessageLite.registerDefaultInstance(FaceMagicEffect$Extra$CheckMd5.class, uExtra$Check);
    }
    public void FaceMagicEffect$Extra$CheckMd5(){
       super();
       this.file_ = "";
       this.md5_ = "";
    }
    public static FaceMagicEffect$Extra$CheckMd5 getDefaultInstance(){
       return FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE;
    }
    public static FaceMagicEffect$Extra$CheckMd5$a newBuilder(){
       return FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE.createBuilder();
    }
    public static FaceMagicEffect$Extra$CheckMd5$a newBuilder(FaceMagicEffect$Extra$CheckMd5 p0){
       return FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0, p1);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0);
    }
    public static FaceMagicEffect$Extra$CheckMd5 parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearFile(){
       this.file_ = FaceMagicEffect$Extra$CheckMd5.getDefaultInstance().getFile();
    }
    public void clearMd5(){
       this.md5_ = FaceMagicEffect$Extra$CheckMd5.getDefaultInstance().getMd5();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FaceMagicEffect$a.a[p0.ordinal()]){
           case 1:
             return new FaceMagicEffect$Extra$CheckMd5();
           case 2:
             return new FaceMagicEffect$Extra$CheckMd5$a(p2);
           case 3:
             Object[] objArray = new Object[]{"file_","md5_"};
             return GeneratedMessageLite.newMessageInfo(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FaceMagicEffect$Extra$CheckMd5.PARSER;
             if (pARSER == null) {
                _monitor_enter(FaceMagicEffect$Extra$CheckMd5.class);
                pARSER = FaceMagicEffect$Extra$CheckMd5.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FaceMagicEffect$Extra$CheckMd5.DEFAULT_INSTANCE);
                   FaceMagicEffect$Extra$CheckMd5.PARSER = pARSER;
                }
                _monitor_exit(FaceMagicEffect$Extra$CheckMd5.class);
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
    public String getMd5(){
       return this.md5_;
    }
    public ByteString getMd5Bytes(){
       return ByteString.copyFromUtf8(this.md5_);
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
    public void setMd5(String p0){
       Objects.requireNonNull(p0);
       this.md5_ = p0;
    }
    public void setMd5Bytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.md5_ = p0.toStringUtf8();
    }
}
