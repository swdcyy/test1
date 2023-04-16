package com.google.protobuf.AbstractParser;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistryLite;
import java.lang.Object;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.AbstractMessageLite;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.AbstractMessageLite$Builder$LimitedInputStream;
import java.io.IOException;

public abstract class AbstractParser implements Parser	// class@0003a5
{
    public static final ExtensionRegistryLite EMPTY_REGISTRY;

    static {
       AbstractParser.EMPTY_REGISTRY = ExtensionRegistryLite.getEmptyRegistry();
    }
    public void AbstractParser(){
       super();
    }
    public final MessageLite checkMessageInitialized(MessageLite p0){
       if (p0 == null || p0.isInitialized()) {
          return p0;
       }
       throw this.newUninitializedMessageException(p0).asInvalidProtocolBufferException().setUnfinishedMessage(p0);
    }
    public final UninitializedMessageException newUninitializedMessageException(MessageLite p0){
       if (p0 instanceof AbstractMessageLite) {
          return p0.newUninitializedMessageException();
       }
       return new UninitializedMessageException(p0);
    }
    public MessageLite parseDelimitedFrom(InputStream p0){
       return this.parseDelimitedFrom(p0, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return this.checkMessageInitialized(this.parsePartialDelimitedFrom(p0, p1));
    }
    public Object parseDelimitedFrom(InputStream p0){
       return this.parseDelimitedFrom(p0);
    }
    public Object parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return this.parseDelimitedFrom(p0, p1);
    }
    public MessageLite parseFrom(ByteString p0){
       return this.parseFrom(p0, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return this.checkMessageInitialized(this.parsePartialFrom(p0, p1));
    }
    public MessageLite parseFrom(CodedInputStream p0){
       return this.parseFrom(p0, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return this.checkMessageInitialized(this.parsePartialFrom(p0, p1));
    }
    public MessageLite parseFrom(InputStream p0){
       return this.parseFrom(p0, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return this.checkMessageInitialized(this.parsePartialFrom(p0, p1));
    }
    public MessageLite parseFrom(ByteBuffer p0){
       return this.parseFrom(p0, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       MessageLite messageLite;
       try{
          CodedInputStream uCodedInputS = CodedInputStream.newInstance(p0);
          messageLite = this.parsePartialFrom(uCodedInputS, p1);
          int i = 0;
          uCodedInputS.checkLastTagWas(i);
          return this.checkMessageInitialized(messageLite);
       }catch(com.google.protobuf.InvalidProtocolBufferException e2){
          throw e2;
       }catch(com.google.protobuf.InvalidProtocolBufferException e2){
          throw e2.setUnfinishedMessage(messageLite);
       }
    }
    public MessageLite parseFrom(byte[] p0){
       return this.parseFrom(p0, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parseFrom(byte[] p0,int p1,int p2){
       return this.parseFrom(p0, p1, p2, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parseFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       return this.checkMessageInitialized(this.parsePartialFrom(p0, p1, p2, p3));
    }
    public MessageLite parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return this.parseFrom(p0, 0, p0.length, p1);
    }
    public Object parseFrom(ByteString p0){
       return this.parseFrom(p0);
    }
    public Object parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return this.parseFrom(p0, p1);
    }
    public Object parseFrom(CodedInputStream p0){
       return this.parseFrom(p0);
    }
    public Object parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return this.parseFrom(p0, p1);
    }
    public Object parseFrom(InputStream p0){
       return this.parseFrom(p0);
    }
    public Object parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return this.parseFrom(p0, p1);
    }
    public Object parseFrom(ByteBuffer p0){
       return this.parseFrom(p0);
    }
    public Object parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return this.parseFrom(p0, p1);
    }
    public Object parseFrom(byte[] p0){
       return this.parseFrom(p0);
    }
    public Object parseFrom(byte[] p0,int p1,int p2){
       return this.parseFrom(p0, p1, p2);
    }
    public Object parseFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       return this.parseFrom(p0, p1, p2, p3);
    }
    public Object parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return this.parseFrom(p0, p1);
    }
    public MessageLite parsePartialDelimitedFrom(InputStream p0){
       return this.parsePartialDelimitedFrom(p0, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parsePartialDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       try{
          int i = p0.read();
          if (i == -1) {
             return null;
          }
          return this.parsePartialFrom(new AbstractMessageLite$Builder$LimitedInputStream(p0, CodedInputStream.readRawVarint32(i, p0)), p1);
       }catch(java.io.IOException e3){
          throw new InvalidProtocolBufferException(e3);
       }
    }
    public Object parsePartialDelimitedFrom(InputStream p0){
       return this.parsePartialDelimitedFrom(p0);
    }
    public Object parsePartialDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return this.parsePartialDelimitedFrom(p0, p1);
    }
    public MessageLite parsePartialFrom(ByteString p0){
       return this.parsePartialFrom(p0, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parsePartialFrom(ByteString p0,ExtensionRegistryLite p1){
       try{
          CodedInputStream uCodedInputS = p0.newCodedInput();
          MessageLite messageLite = this.parsePartialFrom(uCodedInputS, p1);
          try{
             int i = 0;
             uCodedInputS.checkLastTagWas(i);
             return messageLite;
          }catch(com.google.protobuf.InvalidProtocolBufferException e2){
             throw e2.setUnfinishedMessage(messageLite);
          }
       }catch(com.google.protobuf.InvalidProtocolBufferException e2){
          throw e2;
       }
    }
    public MessageLite parsePartialFrom(CodedInputStream p0){
       return this.parsePartialFrom(p0, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parsePartialFrom(InputStream p0){
       return this.parsePartialFrom(p0, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parsePartialFrom(InputStream p0,ExtensionRegistryLite p1){
       CodedInputStream uCodedInputS = CodedInputStream.newInstance(p0);
       MessageLite messageLite = this.parsePartialFrom(uCodedInputS, p1);
       try{
          int i = 0;
          uCodedInputS.checkLastTagWas(i);
          return messageLite;
       }catch(com.google.protobuf.InvalidProtocolBufferException e2){
          throw e2.setUnfinishedMessage(messageLite);
       }
    }
    public MessageLite parsePartialFrom(byte[] p0){
       return this.parsePartialFrom(p0, 0, p0.length, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parsePartialFrom(byte[] p0,int p1,int p2){
       return this.parsePartialFrom(p0, p1, p2, AbstractParser.EMPTY_REGISTRY);
    }
    public MessageLite parsePartialFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       try{
          CodedInputStream uCodedInputS = CodedInputStream.newInstance(p0, p1, p2);
          MessageLite messageLite = this.parsePartialFrom(uCodedInputS, p3);
          try{
             p2 = 0;
             uCodedInputS.checkLastTagWas(p2);
             return messageLite;
          }catch(com.google.protobuf.InvalidProtocolBufferException e1){
             throw e1.setUnfinishedMessage(messageLite);
          }
       }catch(com.google.protobuf.InvalidProtocolBufferException e1){
          throw e1;
       }
    }
    public MessageLite parsePartialFrom(byte[] p0,ExtensionRegistryLite p1){
       return this.parsePartialFrom(p0, 0, p0.length, p1);
    }
    public Object parsePartialFrom(ByteString p0){
       return this.parsePartialFrom(p0);
    }
    public Object parsePartialFrom(ByteString p0,ExtensionRegistryLite p1){
       return this.parsePartialFrom(p0, p1);
    }
    public Object parsePartialFrom(CodedInputStream p0){
       return this.parsePartialFrom(p0);
    }
    public Object parsePartialFrom(InputStream p0){
       return this.parsePartialFrom(p0);
    }
    public Object parsePartialFrom(InputStream p0,ExtensionRegistryLite p1){
       return this.parsePartialFrom(p0, p1);
    }
    public Object parsePartialFrom(byte[] p0){
       return this.parsePartialFrom(p0);
    }
    public Object parsePartialFrom(byte[] p0,int p1,int p2){
       return this.parsePartialFrom(p0, p1, p2);
    }
    public Object parsePartialFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       return this.parsePartialFrom(p0, p1, p2, p3);
    }
    public Object parsePartialFrom(byte[] p0,ExtensionRegistryLite p1){
       return this.parsePartialFrom(p0, p1);
    }
}
