package com.kuaishou.client.log.content.packages.nano.ClientContent$IMPersonalSessionPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$IMPersonalSessionPackage extends MessageNano	// class@001254
{
    public int isMute;
    public int isTop;
    public String params;
    public int position;
    public String receiveUserId;
    public int relationship;
    public int unreadMassageNum;
    public static ClientContent$IMPersonalSessionPackage[] _emptyArray;

    public void ClientContent$IMPersonalSessionPackage(){
       super();
       this.clear();
    }
    public static ClientContent$IMPersonalSessionPackage[] emptyArray(){
       if (ClientContent$IMPersonalSessionPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$IMPersonalSessionPackage._emptyArray == null) {
             ClientContent$IMPersonalSessionPackage[] iMPersonalSe = new ClientContent$IMPersonalSessionPackage[0];
             ClientContent$IMPersonalSessionPackage._emptyArray = iMPersonalSe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$IMPersonalSessionPackage._emptyArray;
    }
    public static ClientContent$IMPersonalSessionPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$IMPersonalSessionPackage().mergeFrom(p0);
    }
    public static ClientContent$IMPersonalSessionPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$IMPersonalSessionPackage(), p0);
    }
    public ClientContent$IMPersonalSessionPackage clear(){
       this.receiveUserId = "";
       this.relationship = 0;
       this.isTop = 0;
       this.isMute = 0;
       this.position = 0;
       this.unreadMassageNum = 0;
       this.params = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.receiveUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.receiveUserId);
       }
       ClientContent$IMPersonalSessionPackage trelationshi = this.relationship;
       if (trelationshi != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, trelationshi);
       }
       trelationshi = this.isTop;
       if (trelationshi != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, trelationshi);
       }
       trelationshi = this.isMute;
       if (trelationshi != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, trelationshi);
       }
       trelationshi = this.position;
       if (trelationshi != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, trelationshi);
       }
       trelationshi = this.unreadMassageNum;
       if (trelationshi != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, trelationshi);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.params);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$IMPersonalSessionPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.params = p0.readString();
                            }
                         }else {
                            this.unreadMassageNum = p0.readInt32();
                         }
                      }else {
                         this.position = p0.readInt32();
                      }
                   }else {
                      this.isMute = p0.readInt32();
                   }
                }else {
                   this.isTop = p0.readInt32();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.relationship = i;
                }
             }
          }else {
             this.receiveUserId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.receiveUserId).equals(str)) {
          p0.writeString(1, this.receiveUserId);
       }
       ClientContent$IMPersonalSessionPackage trelationshi = this.relationship;
       if (trelationshi != null) {
          p0.writeInt32(2, trelationshi);
       }
       trelationshi = this.isTop;
       if (trelationshi != null) {
          p0.writeInt32(3, trelationshi);
       }
       trelationshi = this.isMute;
       if (trelationshi != null) {
          p0.writeInt32(4, trelationshi);
       }
       trelationshi = this.position;
       if (trelationshi != null) {
          p0.writeInt32(5, trelationshi);
       }
       trelationshi = this.unreadMassageNum;
       if (trelationshi != null) {
          p0.writeInt32(6, trelationshi);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(7, this.params);
       }
       super.writeTo(p0);
       return;
    }
}
