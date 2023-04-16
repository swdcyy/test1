package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$NotificationPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$NotificationPackage extends MessageNano	// class@001337
{
    public String aggregate;
    public String canFollow;
    public String clickArea;
    public String extParams;
    public String followRequestStatus;
    public String fromId;
    public int index;
    public String name;
    public String notifyId;
    public String status;
    public String text;
    public String type;
    public String unread;
    public float value;
    public static ClientContentWrapper$NotificationPackage[] _emptyArray;

    public void ClientContentWrapper$NotificationPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$NotificationPackage[] emptyArray(){
       if (ClientContentWrapper$NotificationPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$NotificationPackage._emptyArray == null) {
             ClientContentWrapper$NotificationPackage[] notification = new ClientContentWrapper$NotificationPackage[0];
             ClientContentWrapper$NotificationPackage._emptyArray = notification;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$NotificationPackage._emptyArray;
    }
    public static ClientContentWrapper$NotificationPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$NotificationPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$NotificationPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$NotificationPackage(), p0);
    }
    public ClientContentWrapper$NotificationPackage clear(){
       this.notifyId = "";
       this.type = "";
       this.aggregate = "";
       this.unread = "";
       this.canFollow = "";
       this.followRequestStatus = "";
       this.fromId = "";
       this.text = "";
       this.clickArea = "";
       this.extParams = "";
       this.name = "";
       this.index = 0;
       this.value = 0;
       this.status = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.notifyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.notifyId);
       }
       if (!(this.type).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.type);
       }
       if (!(this.aggregate).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.aggregate);
       }
       if (!(this.unread).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.unread);
       }
       if (!(this.canFollow).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.canFollow);
       }
       if (!(this.followRequestStatus).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.followRequestStatus);
       }
       if (!(this.fromId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.fromId);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.text);
       }
       if (!(this.clickArea).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.clickArea);
       }
       if (!(this.extParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.extParams);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.name);
       }
       ClientContentWrapper$NotificationPackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, tindex);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(13, this.value);
       }
       if (!(this.status).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.status);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$NotificationPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.notifyId = p0.readString();
                break;
              case 18:
                this.type = p0.readString();
                break;
              case 26:
                this.aggregate = p0.readString();
                break;
              case '"':
                this.unread = p0.readString();
                break;
              case '*':
                this.canFollow = p0.readString();
                break;
              case '2':
                this.followRequestStatus = p0.readString();
                break;
              case ':':
                this.fromId = p0.readString();
                break;
              case 'B':
                this.text = p0.readString();
                break;
              case 'J':
                this.clickArea = p0.readString();
                break;
              case 'R':
                this.extParams = p0.readString();
                break;
              case 'Z':
                this.name = p0.readString();
                break;
              case '`':
                this.index = p0.readUInt32();
                break;
              case 'm':
                this.value = p0.readFloat();
                break;
              case 'r':
                this.status = p0.readString();
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
       if (!(this.notifyId).equals(str)) {
          p0.writeString(1, this.notifyId);
       }
       if (!(this.type).equals(str)) {
          p0.writeString(2, this.type);
       }
       if (!(this.aggregate).equals(str)) {
          p0.writeString(3, this.aggregate);
       }
       if (!(this.unread).equals(str)) {
          p0.writeString(4, this.unread);
       }
       if (!(this.canFollow).equals(str)) {
          p0.writeString(5, this.canFollow);
       }
       if (!(this.followRequestStatus).equals(str)) {
          p0.writeString(6, this.followRequestStatus);
       }
       if (!(this.fromId).equals(str)) {
          p0.writeString(7, this.fromId);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(8, this.text);
       }
       if (!(this.clickArea).equals(str)) {
          p0.writeString(9, this.clickArea);
       }
       if (!(this.extParams).equals(str)) {
          p0.writeString(10, this.extParams);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(11, this.name);
       }
       ClientContentWrapper$NotificationPackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(12, tindex);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          p0.writeFloat(13, this.value);
       }
       if (!(this.status).equals(str)) {
          p0.writeString(14, this.status);
       }
       super.writeTo(p0);
       return;
    }
}
