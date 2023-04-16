package com.kuaishou.client.log.content.packages.nano.ClientContent$IMMessagePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMMessageLinkPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMMessageMultiImageLinkPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMMessageEmoticonPackage;
import java.lang.System;

public final class ClientContent$IMMessagePackage extends MessageNano	// class@001252
{
    public String groupId;
    public int hasAt;
    public ClientContent$IMMessageEmoticonPackage imMessageEmoticonPackage;
    public ClientContent$IMMessageLinkPackage[] imMessageLinkPackage;
    public ClientContent$IMMessageMultiImageLinkPackage imMessageMultiImageLinkPackage;
    public String messageId;
    public String params;
    public String receiveUserId;
    public String sendUserId;
    public int type;
    public static ClientContent$IMMessagePackage[] _emptyArray;

    public void ClientContent$IMMessagePackage(){
       super();
       this.clear();
    }
    public static ClientContent$IMMessagePackage[] emptyArray(){
       if (ClientContent$IMMessagePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$IMMessagePackage._emptyArray == null) {
             ClientContent$IMMessagePackage[] iMMessagePac = new ClientContent$IMMessagePackage[0];
             ClientContent$IMMessagePackage._emptyArray = iMMessagePac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$IMMessagePackage._emptyArray;
    }
    public static ClientContent$IMMessagePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$IMMessagePackage().mergeFrom(p0);
    }
    public static ClientContent$IMMessagePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$IMMessagePackage(), p0);
    }
    public ClientContent$IMMessagePackage clear(){
       this.messageId = "";
       this.type = 0;
       this.sendUserId = "";
       this.receiveUserId = "";
       this.groupId = "";
       this.hasAt = 0;
       this.imMessageLinkPackage = ClientContent$IMMessageLinkPackage.emptyArray();
       this.imMessageEmoticonPackage = null;
       this.imMessageMultiImageLinkPackage = null;
       this.params = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.messageId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.messageId);
       }
       ClientContent$IMMessagePackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ttype);
       }
       if (!(this.sendUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.sendUserId);
       }
       if (!(this.receiveUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.receiveUserId);
       }
       if (!(this.groupId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.groupId);
       }
       ttype = this.hasAt;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, ttype);
       }
       ttype = this.imMessageLinkPackage;
       if (ttype != null && ttype.length > 0) {
          int i1 = 0;
          ClientContent$IMMessagePackage timMessageLi = this.imMessageLinkPackage;
          while (i1 < timMessageLi.length) {
             object oobject = timMessageLi[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.imMessageEmoticonPackage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, ttype);
       }
       ttype = this.imMessageMultiImageLinkPackage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, ttype);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.params);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$IMMessagePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.messageId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && (i != 100 && (i != 101 && (i != 200 && (i != 201 && (i != 1032 && (i != 1202 && (i != 2009 && i != 3000)))))))))))) {
                   switch (i){
                       case 6:
                       case 8:
                       case 9:
                       case 10:
                       case 11:
                       case 12:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                       case 20:
                       case 21:
                       case 22:
                       case 23:
                       case 24:
                       case 7:
                         break;
                       default:
                         switch (i){
                             case 501:
                             case 503:
                             case 504:
                             case 502:
                               break;
                             default:
                               switch (i){
                                   case 1017:
                                   case 1019:
                                   case 1020:
                                   case 1021:
                                   case 1022:
                                   case 1023:
                                   case 1024:
                                   case 1025:
                                   case 1026:
                                   case 1018:
                                     break;
                                   default:
                                     switch (i){
                                         case 2000:
                                         case 2002:
                                         case 2003:
                                         case 2004:
                                         case 2001:
                                           break;
                                         default:
                                     }
                               }
                         }
                   }
                }
             label_00d0 :
                this.type = i;
                break;
              case 26:
                this.sendUserId = p0.readString();
                break;
              case '"':
                this.receiveUserId = p0.readString();
                break;
              case '*':
                this.groupId = p0.readString();
                break;
              case '0':
                this.hasAt = p0.readUInt32();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                ClientContent$IMMessagePackage timMessageLi = this.imMessageLinkPackage;
                int i1 = (timMessageLi == null)? 0: timMessageLi.length;
                i = i + i1;
                ClientContent$IMMessageLinkPackage[] iMMessageLin = new ClientContent$IMMessageLinkPackage[i];
                if (i1) {
                   System.arraycopy(timMessageLi, 0, iMMessageLin, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   iMMessageLin[i1] = new ClientContent$IMMessageLinkPackage();
                   p0.readMessage(iMMessageLin[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                iMMessageLin[i1] = new ClientContent$IMMessageLinkPackage();
                p0.readMessage(iMMessageLin[i1]);
                this.imMessageLinkPackage = iMMessageLin;
                break;
              case 'B':
                if (this.imMessageEmoticonPackage == null) {
                   this.imMessageEmoticonPackage = new ClientContent$IMMessageEmoticonPackage();
                }
                p0.readMessage(this.imMessageEmoticonPackage);
                break;
              case 'J':
                if (this.imMessageMultiImageLinkPackage == null) {
                   this.imMessageMultiImageLinkPackage = new ClientContent$IMMessageMultiImageLinkPackage();
                }
                p0.readMessage(this.imMessageMultiImageLinkPackage);
                break;
              case 'R':
                this.params = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.messageId).equals(str)) {
          p0.writeString(1, this.messageId);
       }
       ClientContent$IMMessagePackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(2, ttype);
       }
       if (!(this.sendUserId).equals(str)) {
          p0.writeString(3, this.sendUserId);
       }
       if (!(this.receiveUserId).equals(str)) {
          p0.writeString(4, this.receiveUserId);
       }
       if (!(this.groupId).equals(str)) {
          p0.writeString(5, this.groupId);
       }
       ttype = this.hasAt;
       if (ttype != null) {
          p0.writeUInt32(6, ttype);
       }
       ttype = this.imMessageLinkPackage;
       if (ttype != null && ttype.length > 0) {
          int i = 0;
          ClientContent$IMMessagePackage timMessageLi = this.imMessageLinkPackage;
          while (i < timMessageLi.length) {
             object oobject = timMessageLi[i];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i = i + 1;
          }
       }
       ttype = this.imMessageEmoticonPackage;
       if (ttype != null) {
          p0.writeMessage(8, ttype);
       }
       ttype = this.imMessageMultiImageLinkPackage;
       if (ttype != null) {
          p0.writeMessage(9, ttype);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(10, this.params);
       }
       super.writeTo(p0);
       return;
    }
}
