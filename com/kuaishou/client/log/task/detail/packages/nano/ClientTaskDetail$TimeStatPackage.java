package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TimeStatPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$TimeStatPackage extends MessageNano	// class@001484
{
    public String authorId;
    public String duration;
    public String endTime;
    public String enterTime;
    public String id;
    public String index;
    public String leaveTime;
    public String name;
    public String playedDuration;
    public String startTime;
    public String status;
    public String text;
    public String value;
    public static ClientTaskDetail$TimeStatPackage[] _emptyArray;

    public void ClientTaskDetail$TimeStatPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$TimeStatPackage[] emptyArray(){
       if (ClientTaskDetail$TimeStatPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$TimeStatPackage._emptyArray == null) {
             ClientTaskDetail$TimeStatPackage[] timeStatPack = new ClientTaskDetail$TimeStatPackage[0];
             ClientTaskDetail$TimeStatPackage._emptyArray = timeStatPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$TimeStatPackage._emptyArray;
    }
    public static ClientTaskDetail$TimeStatPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$TimeStatPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$TimeStatPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$TimeStatPackage(), p0);
    }
    public ClientTaskDetail$TimeStatPackage clear(){
       this.startTime = "";
       this.endTime = "";
       this.enterTime = "";
       this.leaveTime = "";
       this.duration = "";
       this.playedDuration = "";
       this.id = "";
       this.authorId = "";
       this.index = "";
       this.name = "";
       this.value = "";
       this.status = "";
       this.text = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.startTime).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.startTime);
       }
       if (!(this.endTime).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.endTime);
       }
       if (!(this.enterTime).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.enterTime);
       }
       if (!(this.leaveTime).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.leaveTime);
       }
       if (!(this.duration).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.duration);
       }
       if (!(this.playedDuration).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.playedDuration);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.id);
       }
       if (!(this.authorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.authorId);
       }
       if (!(this.index).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.index);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.name);
       }
       if (!(this.value).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.value);
       }
       if (!(this.status).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.status);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.text);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$TimeStatPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.startTime = p0.readString();
                break;
              case 18:
                this.endTime = p0.readString();
                break;
              case 26:
                this.enterTime = p0.readString();
                break;
              case '"':
                this.leaveTime = p0.readString();
                break;
              case '*':
                this.duration = p0.readString();
                break;
              case '2':
                this.playedDuration = p0.readString();
                break;
              case ':':
                this.id = p0.readString();
                break;
              case 'B':
                this.authorId = p0.readString();
                break;
              case 'J':
                this.index = p0.readString();
                break;
              case 'R':
                this.name = p0.readString();
                break;
              case 'Z':
                this.value = p0.readString();
                break;
              case 'b':
                this.status = p0.readString();
                break;
              case 'j':
                this.text = p0.readString();
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
       if (!(this.startTime).equals(str)) {
          p0.writeString(1, this.startTime);
       }
       if (!(this.endTime).equals(str)) {
          p0.writeString(2, this.endTime);
       }
       if (!(this.enterTime).equals(str)) {
          p0.writeString(3, this.enterTime);
       }
       if (!(this.leaveTime).equals(str)) {
          p0.writeString(4, this.leaveTime);
       }
       if (!(this.duration).equals(str)) {
          p0.writeString(5, this.duration);
       }
       if (!(this.playedDuration).equals(str)) {
          p0.writeString(6, this.playedDuration);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(7, this.id);
       }
       if (!(this.authorId).equals(str)) {
          p0.writeString(8, this.authorId);
       }
       if (!(this.index).equals(str)) {
          p0.writeString(9, this.index);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(10, this.name);
       }
       if (!(this.value).equals(str)) {
          p0.writeString(11, this.value);
       }
       if (!(this.status).equals(str)) {
          p0.writeString(12, this.status);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(13, this.text);
       }
       super.writeTo(p0);
       return;
    }
}
