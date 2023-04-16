package com.kwai.video.westeros.models.File;
import com.kwai.video.westeros.models.FileOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.File$Builder;
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
import com.kwai.video.westeros.models.File$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class File extends GeneratedMessageLite implements FileOrBuilder	// class@000f75
{
    public boolean isBuiltin_;
    public String path_;
    public static final File DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       File uFile = new File();
       File.DEFAULT_INSTANCE = uFile;
       GeneratedMessageLite.registerDefaultInstance(File.class, uFile);
    }
    public void File(){
       super();
       this.path_ = "";
    }
    public static File getDefaultInstance(){
       return File.DEFAULT_INSTANCE;
    }
    public static File$Builder newBuilder(){
       return File.DEFAULT_INSTANCE.createBuilder();
    }
    public static File$Builder newBuilder(File p0){
       return File.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static File parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(File.DEFAULT_INSTANCE, p0);
    }
    public static File parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(File.DEFAULT_INSTANCE, p0, p1);
    }
    public static File parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(File.DEFAULT_INSTANCE, p0);
    }
    public static File parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(File.DEFAULT_INSTANCE, p0, p1);
    }
    public static File parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(File.DEFAULT_INSTANCE, p0);
    }
    public static File parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(File.DEFAULT_INSTANCE, p0, p1);
    }
    public static File parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(File.DEFAULT_INSTANCE, p0);
    }
    public static File parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(File.DEFAULT_INSTANCE, p0, p1);
    }
    public static File parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(File.DEFAULT_INSTANCE, p0);
    }
    public static File parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(File.DEFAULT_INSTANCE, p0, p1);
    }
    public static File parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(File.DEFAULT_INSTANCE, p0);
    }
    public static File parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(File.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return File.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearIsBuiltin(){
       this.isBuiltin_ = false;
    }
    public void clearPath(){
       this.path_ = File.getDefaultInstance().getPath();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (File$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new File();
           case 2:
             return new File$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"isBuiltin_","path_"};
             return GeneratedMessageLite.newMessageInfo(File.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x02\x02\x00", objArray);
           case 4:
             return File.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = File.PARSER;
             if (pARSER == null) {
                _monitor_enter(File.class);
                pARSER = File.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(File.DEFAULT_INSTANCE);
                   File.PARSER = pARSER;
                }
                _monitor_exit(File.class);
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
    public boolean getIsBuiltin(){
       return this.isBuiltin_;
    }
    public String getPath(){
       return this.path_;
    }
    public ByteString getPathBytes(){
       return ByteString.copyFromUtf8(this.path_);
    }
    public void setIsBuiltin(boolean p0){
       this.isBuiltin_ = p0;
    }
    public void setPath(String p0){
       Objects.requireNonNull(p0);
       this.path_ = p0;
    }
    public void setPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.path_ = p0.toStringUtf8();
    }
}
