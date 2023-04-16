package com.kwai.video.westeros.models.ClientWorkProgress;
import com.kwai.video.westeros.models.ClientWorkProgressOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.ClientWorkProgress$Builder;
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
import com.kwai.video.westeros.models.ClientWorkProgress$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class ClientWorkProgress extends GeneratedMessageLite implements ClientWorkProgressOrBuilder	// class@000ef1
{
    public String key_;
    public int progress_;
    public static final ClientWorkProgress DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ClientWorkProgress uClientWorkP = new ClientWorkProgress();
       ClientWorkProgress.DEFAULT_INSTANCE = uClientWorkP;
       GeneratedMessageLite.registerDefaultInstance(ClientWorkProgress.class, uClientWorkP);
    }
    public void ClientWorkProgress(){
       super();
       this.key_ = "";
    }
    public static ClientWorkProgress getDefaultInstance(){
       return ClientWorkProgress.DEFAULT_INSTANCE;
    }
    public static ClientWorkProgress$Builder newBuilder(){
       return ClientWorkProgress.DEFAULT_INSTANCE.createBuilder();
    }
    public static ClientWorkProgress$Builder newBuilder(ClientWorkProgress p0){
       return ClientWorkProgress.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ClientWorkProgress parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0);
    }
    public static ClientWorkProgress parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0, p1);
    }
    public static ClientWorkProgress parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0);
    }
    public static ClientWorkProgress parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0, p1);
    }
    public static ClientWorkProgress parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0);
    }
    public static ClientWorkProgress parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0, p1);
    }
    public static ClientWorkProgress parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0);
    }
    public static ClientWorkProgress parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0, p1);
    }
    public static ClientWorkProgress parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0);
    }
    public static ClientWorkProgress parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0, p1);
    }
    public static ClientWorkProgress parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0);
    }
    public static ClientWorkProgress parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ClientWorkProgress.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ClientWorkProgress.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearKey(){
       this.key_ = ClientWorkProgress.getDefaultInstance().getKey();
    }
    public void clearProgress(){
       this.progress_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ClientWorkProgress$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new ClientWorkProgress();
           case 2:
             return new ClientWorkProgress$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"key_","progress_"};
             return GeneratedMessageLite.newMessageInfo(ClientWorkProgress.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x04\x00", objArray);
           case 4:
             return ClientWorkProgress.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ClientWorkProgress.PARSER;
             if (pARSER == null) {
                _monitor_enter(ClientWorkProgress.class);
                pARSER = ClientWorkProgress.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ClientWorkProgress.DEFAULT_INSTANCE);
                   ClientWorkProgress.PARSER = pARSER;
                }
                _monitor_exit(ClientWorkProgress.class);
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
    public String getKey(){
       return this.key_;
    }
    public ByteString getKeyBytes(){
       return ByteString.copyFromUtf8(this.key_);
    }
    public int getProgress(){
       return this.progress_;
    }
    public void setKey(String p0){
       Objects.requireNonNull(p0);
       this.key_ = p0;
    }
    public void setKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.key_ = p0.toStringUtf8();
    }
    public void setProgress(int p0){
       this.progress_ = p0;
    }
}
