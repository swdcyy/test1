package com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoQosStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientStat$VideoQosStatEvent extends MessageNano	// class@00080d
{
    public int batteryLevel;
    public int batteryTemperature;
    public String boardPlatform;
    public long duration;
    public boolean isCharging;
    public boolean isLastRetryPlay;
    public int mediaType;
    public String resourceId;
    public String sessionUuid;
    public String socName;
    public ClientEvent$UrlPackage urlPackage;
    public String videoMonitorJson;
    public String videoQosJson;
    public static ClientStat$VideoQosStatEvent[] _emptyArray;

    public void ClientStat$VideoQosStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$VideoQosStatEvent[] emptyArray(){
       if (ClientStat$VideoQosStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$VideoQosStatEvent._emptyArray == null) {
             ClientStat$VideoQosStatEvent[] videoQosStat = new ClientStat$VideoQosStatEvent[0];
             ClientStat$VideoQosStatEvent._emptyArray = videoQosStat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$VideoQosStatEvent._emptyArray;
    }
    public static ClientStat$VideoQosStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$VideoQosStatEvent().mergeFrom(p0);
    }
    public static ClientStat$VideoQosStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$VideoQosStatEvent(), p0);
    }
    public ClientStat$VideoQosStatEvent clear(){
       this.mediaType = 0;
       this.urlPackage = null;
       this.videoQosJson = "";
       this.boardPlatform = "";
       this.sessionUuid = "";
       this.resourceId = "";
       this.socName = "";
       this.duration = 0;
       this.isLastRetryPlay = false;
       this.batteryLevel = 0;
       this.batteryTemperature = 0;
       this.isCharging = false;
       this.videoMonitorJson = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$VideoQosStatEvent tmediaType = this.mediaType;
       if (tmediaType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmediaType);
       }
       tmediaType = this.urlPackage;
       if (tmediaType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tmediaType);
       }
       String str = "";
       if (!(this.videoQosJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.videoQosJson);
       }
       if (!(this.boardPlatform).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.boardPlatform);
       }
       if (!(this.sessionUuid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.sessionUuid);
       }
       if (!(this.resourceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.resourceId);
       }
       if (!(this.socName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.socName);
       }
       ClientStat$VideoQosStatEvent tduration = this.duration;
       if (tduration) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tduration);
       }
       tmediaType = this.isLastRetryPlay;
       if (tmediaType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tmediaType);
       }
       tmediaType = this.batteryLevel;
       if (tmediaType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tmediaType);
       }
       tmediaType = this.batteryTemperature;
       if (tmediaType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tmediaType);
       }
       tmediaType = this.isCharging;
       if (tmediaType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tmediaType);
       }
       if (!(this.videoMonitorJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.videoMonitorJson);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$VideoQosStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.mediaType = i;
                }
                break;
              case 18:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case 26:
                this.videoQosJson = p0.readString();
                break;
              case '"':
                this.boardPlatform = p0.readString();
                break;
              case '*':
                this.sessionUuid = p0.readString();
                break;
              case '2':
                this.resourceId = p0.readString();
                break;
              case ':':
                this.socName = p0.readString();
                break;
              case '@':
                this.duration = p0.readUInt64();
                break;
              case 'H':
                this.isLastRetryPlay = p0.readBool();
                break;
              case 'P':
                this.batteryLevel = p0.readInt32();
                break;
              case 'X':
                this.batteryTemperature = p0.readInt32();
                break;
              case '`':
                this.isCharging = p0.readBool();
                break;
              case 'j':
                this.videoMonitorJson = p0.readString();
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
       ClientStat$VideoQosStatEvent tmediaType = this.mediaType;
       if (tmediaType != null) {
          p0.writeInt32(1, tmediaType);
       }
       tmediaType = this.urlPackage;
       if (tmediaType != null) {
          p0.writeMessage(2, tmediaType);
       }
       String str = "";
       if (!(this.videoQosJson).equals(str)) {
          p0.writeString(3, this.videoQosJson);
       }
       if (!(this.boardPlatform).equals(str)) {
          p0.writeString(4, this.boardPlatform);
       }
       if (!(this.sessionUuid).equals(str)) {
          p0.writeString(5, this.sessionUuid);
       }
       if (!(this.resourceId).equals(str)) {
          p0.writeString(6, this.resourceId);
       }
       if (!(this.socName).equals(str)) {
          p0.writeString(7, this.socName);
       }
       ClientStat$VideoQosStatEvent tduration = this.duration;
       if (tduration) {
          p0.writeUInt64(8, tduration);
       }
       tmediaType = this.isLastRetryPlay;
       if (tmediaType != null) {
          p0.writeBool(9, tmediaType);
       }
       tmediaType = this.batteryLevel;
       if (tmediaType != null) {
          p0.writeInt32(10, tmediaType);
       }
       tmediaType = this.batteryTemperature;
       if (tmediaType != null) {
          p0.writeInt32(11, tmediaType);
       }
       tmediaType = this.isCharging;
       if (tmediaType != null) {
          p0.writeBool(12, tmediaType);
       }
       if (!(this.videoMonitorJson).equals(str)) {
          p0.writeString(13, this.videoMonitorJson);
       }
       super.writeTo(p0);
       return;
    }
}
