package com.kwai.video.westeros.models.ServerMediaRequest;
import com.kwai.video.westeros.models.ServerMediaRequestOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.ServerMediaRequest$Builder;
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
import com.kwai.video.westeros.models.ServerMediaRequest$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.PickingMediaResType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class ServerMediaRequest extends GeneratedMessageLite implements ServerMediaRequestOrBuilder	// class@00103b
{
    public boolean disableCache_;
    public String key_;
    public String serverAction_;
    public String text_;
    public int type_;
    public static final ServerMediaRequest DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ServerMediaRequest serverMediaR = new ServerMediaRequest();
       ServerMediaRequest.DEFAULT_INSTANCE = serverMediaR;
       GeneratedMessageLite.registerDefaultInstance(ServerMediaRequest.class, serverMediaR);
    }
    public void ServerMediaRequest(){
       super();
       this.key_ = "";
       this.serverAction_ = "";
       this.text_ = "";
    }
    public static ServerMediaRequest getDefaultInstance(){
       return ServerMediaRequest.DEFAULT_INSTANCE;
    }
    public static ServerMediaRequest$Builder newBuilder(){
       return ServerMediaRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static ServerMediaRequest$Builder newBuilder(ServerMediaRequest p0){
       return ServerMediaRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ServerMediaRequest parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0);
    }
    public static ServerMediaRequest parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static ServerMediaRequest parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0);
    }
    public static ServerMediaRequest parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static ServerMediaRequest parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0);
    }
    public static ServerMediaRequest parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static ServerMediaRequest parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0);
    }
    public static ServerMediaRequest parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static ServerMediaRequest parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0);
    }
    public static ServerMediaRequest parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static ServerMediaRequest parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0);
    }
    public static ServerMediaRequest parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ServerMediaRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ServerMediaRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDisableCache(){
       this.disableCache_ = false;
    }
    public void clearKey(){
       this.key_ = ServerMediaRequest.getDefaultInstance().getKey();
    }
    public void clearServerAction(){
       this.serverAction_ = ServerMediaRequest.getDefaultInstance().getServerAction();
    }
    public void clearText(){
       this.text_ = ServerMediaRequest.getDefaultInstance().getText();
    }
    public void clearType(){
       this.type_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ServerMediaRequest$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new ServerMediaRequest();
           case 2:
             return new ServerMediaRequest$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"key_","serverAction_","text_","type_","disableCache_"};
             return GeneratedMessageLite.newMessageInfo(ServerMediaRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\f\x05\x07\x00", objArray);
           case 4:
             return ServerMediaRequest.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ServerMediaRequest.PARSER;
             if (pARSER == null) {
                _monitor_enter(ServerMediaRequest.class);
                pARSER = ServerMediaRequest.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ServerMediaRequest.DEFAULT_INSTANCE);
                   ServerMediaRequest.PARSER = pARSER;
                }
                _monitor_exit(ServerMediaRequest.class);
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
    public boolean getDisableCache(){
       return this.disableCache_;
    }
    public String getKey(){
       return this.key_;
    }
    public ByteString getKeyBytes(){
       return ByteString.copyFromUtf8(this.key_);
    }
    public String getServerAction(){
       return this.serverAction_;
    }
    public ByteString getServerActionBytes(){
       return ByteString.copyFromUtf8(this.serverAction_);
    }
    public String getText(){
       return this.text_;
    }
    public ByteString getTextBytes(){
       return ByteString.copyFromUtf8(this.text_);
    }
    public PickingMediaResType getType(){
       PickingMediaResType pickingMedia = PickingMediaResType.forNumber(this.type_);
       if (pickingMedia == null) {
          pickingMedia = PickingMediaResType.UNRECOGNIZED;
       }
       return pickingMedia;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public void setDisableCache(boolean p0){
       this.disableCache_ = p0;
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
    public void setServerAction(String p0){
       Objects.requireNonNull(p0);
       this.serverAction_ = p0;
    }
    public void setServerActionBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.serverAction_ = p0.toStringUtf8();
    }
    public void setText(String p0){
       Objects.requireNonNull(p0);
       this.text_ = p0;
    }
    public void setTextBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.text_ = p0.toStringUtf8();
    }
    public void setType(PickingMediaResType p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
}
