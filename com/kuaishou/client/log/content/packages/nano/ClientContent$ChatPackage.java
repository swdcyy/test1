package com.kuaishou.client.log.content.packages.nano.ClientContent$ChatPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ChatPackage extends MessageNano	// class@001227
{
    public String messageContent;
    public String messageId;
    public String receiveUserId;
    public long sendTime;
    public String sendUserId;
    public long showTime;
    public static ClientContent$ChatPackage[] _emptyArray;

    public void ClientContent$ChatPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ChatPackage[] emptyArray(){
       if (ClientContent$ChatPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ChatPackage._emptyArray == null) {
             ClientContent$ChatPackage[] uChatPackage = new ClientContent$ChatPackage[0];
             ClientContent$ChatPackage._emptyArray = uChatPackage;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ChatPackage._emptyArray;
    }
    public static ClientContent$ChatPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ChatPackage().mergeFrom(p0);
    }
    public static ClientContent$ChatPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ChatPackage(), p0);
    }
    public ClientContent$ChatPackage clear(){
       this.sendUserId = "";
       this.sendTime = 0;
       this.showTime = 0;
       this.messageId = "";
       this.messageContent = "";
       this.receiveUserId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.sendUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.sendUserId);
       }
       ClientContent$ChatPackage tsendTime = this.sendTime;
       if (tsendTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tsendTime);
       }
       tsendTime = this.showTime;
       if (tsendTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tsendTime);
       }
       if (!(this.messageId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.messageId);
       }
       if (!(this.messageContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.messageContent);
       }
       if (!(this.receiveUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.receiveUserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ChatPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.receiveUserId = p0.readString();
                         }
                      }else {
                         this.messageContent = p0.readString();
                      }
                   }else {
                      this.messageId = p0.readString();
                   }
                }else {
                   this.showTime = p0.readUInt64();
                }
             }else {
                this.sendTime = p0.readUInt64();
             }
          }else {
             this.sendUserId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.sendUserId).equals(str)) {
          p0.writeString(1, this.sendUserId);
       }
       ClientContent$ChatPackage tsendTime = this.sendTime;
       if (tsendTime) {
          p0.writeUInt64(2, tsendTime);
       }
       tsendTime = this.showTime;
       if (tsendTime) {
          p0.writeUInt64(3, tsendTime);
       }
       if (!(this.messageId).equals(str)) {
          p0.writeString(4, this.messageId);
       }
       if (!(this.messageContent).equals(str)) {
          p0.writeString(5, this.messageContent);
       }
       if (!(this.receiveUserId).equals(str)) {
          p0.writeString(6, this.receiveUserId);
       }
       super.writeTo(p0);
       return;
    }
}
