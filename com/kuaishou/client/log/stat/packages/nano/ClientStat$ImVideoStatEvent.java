package com.kuaishou.client.log.stat.packages.nano.ClientStat$ImVideoStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientStat$ImVideoStatEvent extends MessageNano	// class@0007d2
{
    public double averageFps;
    public String boardPlatform;
    public long clickToFirstFrameDuration;
    public long duration;
    public String groupId;
    public String ksUri;
    public String messageId;
    public long playedDuration;
    public String receiveUserId;
    public ClientEvent$UrlPackage referUrlPackage;
    public String senderId;
    public int stalledCount;
    public ClientEvent$UrlPackage urlPackage;
    public String videoQosJson;
    public static ClientStat$ImVideoStatEvent[] _emptyArray;

    public void ClientStat$ImVideoStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$ImVideoStatEvent[] emptyArray(){
       if (ClientStat$ImVideoStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ImVideoStatEvent._emptyArray == null) {
             ClientStat$ImVideoStatEvent[] imVideoStatE = new ClientStat$ImVideoStatEvent[0];
             ClientStat$ImVideoStatEvent._emptyArray = imVideoStatE;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ImVideoStatEvent._emptyArray;
    }
    public static ClientStat$ImVideoStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ImVideoStatEvent().mergeFrom(p0);
    }
    public static ClientStat$ImVideoStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ImVideoStatEvent(), p0);
    }
    public ClientStat$ImVideoStatEvent clear(){
       this.urlPackage = null;
       this.referUrlPackage = null;
       this.messageId = "";
       this.ksUri = "";
       this.duration = 0;
       this.playedDuration = 0;
       this.senderId = "";
       this.videoQosJson = "";
       this.averageFps = 0;
       this.receiveUserId = "";
       this.groupId = "";
       this.stalledCount = 0;
       this.clickToFirstFrameDuration = 0;
       this.boardPlatform = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$ImVideoStatEvent turlPackage = this.urlPackage;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, turlPackage);
       }
       turlPackage = this.referUrlPackage;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, turlPackage);
       }
       String str = "";
       if (!(this.messageId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.messageId);
       }
       if (!(this.ksUri).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.ksUri);
       }
       ClientStat$ImVideoStatEvent tduration = this.duration;
       if (tduration) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tduration);
       }
       tduration = this.playedDuration;
       if (tduration) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tduration);
       }
       if (!(this.senderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.senderId);
       }
       if (!(this.videoQosJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.videoQosJson);
       }
       if (Double.doubleToLongBits(this.averageFps) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(9, this.averageFps);
       }
       if (!(this.receiveUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.receiveUserId);
       }
       if (!(this.groupId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.groupId);
       }
       turlPackage = this.stalledCount;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, turlPackage);
       }
       tduration = this.clickToFirstFrameDuration;
       if (tduration) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tduration);
       }
       if (!(this.boardPlatform).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.boardPlatform);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$ImVideoStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case 18:
                if (this.referUrlPackage == null) {
                   this.referUrlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.referUrlPackage);
                break;
              case 26:
                this.messageId = p0.readString();
                break;
              case '"':
                this.ksUri = p0.readString();
                break;
              case '(':
                this.duration = p0.readUInt64();
                break;
              case '0':
                this.playedDuration = p0.readUInt64();
                break;
              case ':':
                this.senderId = p0.readString();
                break;
              case 'B':
                this.videoQosJson = p0.readString();
                break;
              case 'I':
                this.averageFps = p0.readDouble();
                break;
              case 'R':
                this.receiveUserId = p0.readString();
                break;
              case 'Z':
                this.groupId = p0.readString();
                break;
              case '`':
                this.stalledCount = p0.readUInt32();
                break;
              case 'h':
                this.clickToFirstFrameDuration = p0.readUInt64();
                break;
              case 'r':
                this.boardPlatform = p0.readString();
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
       ClientStat$ImVideoStatEvent turlPackage = this.urlPackage;
       if (turlPackage != null) {
          p0.writeMessage(1, turlPackage);
       }
       turlPackage = this.referUrlPackage;
       if (turlPackage != null) {
          p0.writeMessage(2, turlPackage);
       }
       String str = "";
       if (!(this.messageId).equals(str)) {
          p0.writeString(3, this.messageId);
       }
       if (!(this.ksUri).equals(str)) {
          p0.writeString(4, this.ksUri);
       }
       ClientStat$ImVideoStatEvent tduration = this.duration;
       if (tduration) {
          p0.writeUInt64(5, tduration);
       }
       tduration = this.playedDuration;
       if (tduration) {
          p0.writeUInt64(6, tduration);
       }
       if (!(this.senderId).equals(str)) {
          p0.writeString(7, this.senderId);
       }
       if (!(this.videoQosJson).equals(str)) {
          p0.writeString(8, this.videoQosJson);
       }
       if (Double.doubleToLongBits(this.averageFps) - Double.doubleToLongBits(0)) {
          p0.writeDouble(9, this.averageFps);
       }
       if (!(this.receiveUserId).equals(str)) {
          p0.writeString(10, this.receiveUserId);
       }
       if (!(this.groupId).equals(str)) {
          p0.writeString(11, this.groupId);
       }
       turlPackage = this.stalledCount;
       if (turlPackage != null) {
          p0.writeUInt32(12, turlPackage);
       }
       tduration = this.clickToFirstFrameDuration;
       if (tduration) {
          p0.writeUInt64(13, tduration);
       }
       if (!(this.boardPlatform).equals(str)) {
          p0.writeString(14, this.boardPlatform);
       }
       super.writeTo(p0);
       return;
    }
}
