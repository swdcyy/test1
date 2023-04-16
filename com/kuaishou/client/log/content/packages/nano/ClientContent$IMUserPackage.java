package com.kuaishou.client.log.content.packages.nano.ClientContent$IMUserPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;

public final class ClientContent$IMUserPackage extends MessageNano	// class@001255
{
    public int fansNum;
    public int followNum;
    public int friendNum;
    public int groupSessionNum;
    public String params;
    public int privateSessionNum;
    public int publicGroupSeesionNum;
    public int sessionNum;
    public int unreadMassageNum;
    public ClientContent$UserPackage userPackage;
    public static ClientContent$IMUserPackage[] _emptyArray;

    public void ClientContent$IMUserPackage(){
       super();
       this.clear();
    }
    public static ClientContent$IMUserPackage[] emptyArray(){
       if (ClientContent$IMUserPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$IMUserPackage._emptyArray == null) {
             ClientContent$IMUserPackage[] iMUserPackag = new ClientContent$IMUserPackage[0];
             ClientContent$IMUserPackage._emptyArray = iMUserPackag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$IMUserPackage._emptyArray;
    }
    public static ClientContent$IMUserPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$IMUserPackage().mergeFrom(p0);
    }
    public static ClientContent$IMUserPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$IMUserPackage(), p0);
    }
    public ClientContent$IMUserPackage clear(){
       this.userPackage = null;
       this.followNum = 0;
       this.friendNum = 0;
       this.privateSessionNum = 0;
       this.groupSessionNum = 0;
       this.unreadMassageNum = 0;
       this.params = "";
       this.fansNum = 0;
       this.publicGroupSeesionNum = 0;
       this.sessionNum = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$IMUserPackage tuserPackage = this.userPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuserPackage);
       }
       tuserPackage = this.followNum;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tuserPackage);
       }
       tuserPackage = this.friendNum;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tuserPackage);
       }
       tuserPackage = this.privateSessionNum;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tuserPackage);
       }
       tuserPackage = this.groupSessionNum;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tuserPackage);
       }
       tuserPackage = this.unreadMassageNum;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tuserPackage);
       }
       if (!(this.params).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.params);
       }
       tuserPackage = this.fansNum;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tuserPackage);
       }
       tuserPackage = this.publicGroupSeesionNum;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tuserPackage);
       }
       tuserPackage = this.sessionNum;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tuserPackage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$IMUserPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.userPackage == null) {
                   this.userPackage = new ClientContent$UserPackage();
                }
                p0.readMessage(this.userPackage);
                break;
              case 16:
                this.followNum = p0.readInt32();
                break;
              case 24:
                this.friendNum = p0.readInt32();
                break;
              case 32:
                this.privateSessionNum = p0.readInt32();
                break;
              case '(':
                this.groupSessionNum = p0.readInt32();
                break;
              case '0':
                this.unreadMassageNum = p0.readInt32();
                break;
              case ':':
                this.params = p0.readString();
                break;
              case '@':
                this.fansNum = p0.readInt32();
                break;
              case 'H':
                this.publicGroupSeesionNum = p0.readInt32();
                break;
              case 'P':
                this.sessionNum = p0.readInt32();
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
       ClientContent$IMUserPackage tuserPackage = this.userPackage;
       if (tuserPackage != null) {
          p0.writeMessage(1, tuserPackage);
       }
       tuserPackage = this.followNum;
       if (tuserPackage != null) {
          p0.writeInt32(2, tuserPackage);
       }
       tuserPackage = this.friendNum;
       if (tuserPackage != null) {
          p0.writeInt32(3, tuserPackage);
       }
       tuserPackage = this.privateSessionNum;
       if (tuserPackage != null) {
          p0.writeInt32(4, tuserPackage);
       }
       tuserPackage = this.groupSessionNum;
       if (tuserPackage != null) {
          p0.writeInt32(5, tuserPackage);
       }
       tuserPackage = this.unreadMassageNum;
       if (tuserPackage != null) {
          p0.writeInt32(6, tuserPackage);
       }
       if (!(this.params).equals("")) {
          p0.writeString(7, this.params);
       }
       tuserPackage = this.fansNum;
       if (tuserPackage != null) {
          p0.writeInt32(8, tuserPackage);
       }
       tuserPackage = this.publicGroupSeesionNum;
       if (tuserPackage != null) {
          p0.writeInt32(9, tuserPackage);
       }
       tuserPackage = this.sessionNum;
       if (tuserPackage != null) {
          p0.writeInt32(10, tuserPackage);
       }
       super.writeTo(p0);
       return;
    }
}
