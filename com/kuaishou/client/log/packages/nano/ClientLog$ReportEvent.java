package com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import com.kuaishou.client.log.packages.nano.ClientCommon$CommonPackage;

public final class ClientLog$ReportEvent extends MessageNano	// class@000790
{
    public long clientIncrementId;
    public long clientTimestamp;
    public ClientCommon$CommonPackage commonPackage;
    public String eventId;
    public ClientEvent$EventPackage eventPackage;
    public String exploreLocale;
    public String frontSessionId;
    public String processName;
    public String relationLogId;
    public String serverHostname;
    public long serverTimestamp;
    public String sessionId;
    public ClientStat$StatPackage statPackage;
    public static ClientLog$ReportEvent[] _emptyArray;

    public void ClientLog$ReportEvent(){
       super();
       this.clear();
    }
    public static ClientLog$ReportEvent[] emptyArray(){
       if (ClientLog$ReportEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientLog$ReportEvent._emptyArray == null) {
             ClientLog$ReportEvent[] reportEventA = new ClientLog$ReportEvent[0];
             ClientLog$ReportEvent._emptyArray = reportEventA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientLog$ReportEvent._emptyArray;
    }
    public static ClientLog$ReportEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientLog$ReportEvent().mergeFrom(p0);
    }
    public static ClientLog$ReportEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientLog$ReportEvent(), p0);
    }
    public ClientLog$ReportEvent clear(){
       this.clientTimestamp = 0;
       this.clientIncrementId = 0;
       this.serverHostname = "";
       this.serverTimestamp = 0;
       this.commonPackage = null;
       this.eventPackage = null;
       this.statPackage = null;
       this.exploreLocale = "";
       this.sessionId = "";
       this.eventId = "";
       this.frontSessionId = "";
       this.processName = "";
       this.relationLogId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientLog$ReportEvent tclientTimes = this.clientTimestamp;
       ClientLog$ReportEvent reportEvent = null;
       if (tclientTimes - reportEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tclientTimes);
       }
       tclientTimes = this.clientIncrementId;
       if (tclientTimes - reportEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tclientTimes);
       }
       String str = "";
       if (!(this.serverHostname).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.serverHostname);
       }
       ClientLog$ReportEvent tserverTimes = this.serverTimestamp;
       if (tserverTimes - reportEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tserverTimes);
       }
       tclientTimes = this.commonPackage;
       if (tclientTimes != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tclientTimes);
       }
       tclientTimes = this.eventPackage;
       if (tclientTimes != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tclientTimes);
       }
       tclientTimes = this.statPackage;
       if (tclientTimes != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tclientTimes);
       }
       if (!(this.exploreLocale).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.exploreLocale);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.sessionId);
       }
       if (!(this.eventId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.eventId);
       }
       if (!(this.frontSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.frontSessionId);
       }
       if (!(this.processName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.processName);
       }
       if (!(this.relationLogId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.relationLogId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientLog$ReportEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.clientTimestamp = p0.readUInt64();
                break;
              case 16:
                this.clientIncrementId = p0.readUInt64();
                break;
              case 26:
                this.serverHostname = p0.readString();
                break;
              case 32:
                this.serverTimestamp = p0.readUInt64();
                break;
              case '*':
                if (this.commonPackage == null) {
                   this.commonPackage = new ClientCommon$CommonPackage();
                }
                p0.readMessage(this.commonPackage);
                break;
              case '2':
                if (this.eventPackage == null) {
                   this.eventPackage = new ClientEvent$EventPackage();
                }
                p0.readMessage(this.eventPackage);
                break;
              case ':':
                if (this.statPackage == null) {
                   this.statPackage = new ClientStat$StatPackage();
                }
                p0.readMessage(this.statPackage);
                break;
              case 'B':
                this.exploreLocale = p0.readString();
                break;
              case 'J':
                this.sessionId = p0.readString();
                break;
              case 'R':
                this.eventId = p0.readString();
                break;
              case 'Z':
                this.frontSessionId = p0.readString();
                break;
              case 'b':
                this.processName = p0.readString();
                break;
              case 'j':
                this.relationLogId = p0.readString();
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
       ClientLog$ReportEvent tclientTimes = this.clientTimestamp;
       ClientLog$ReportEvent reportEvent = null;
       if (tclientTimes - reportEvent) {
          p0.writeUInt64(1, tclientTimes);
       }
       tclientTimes = this.clientIncrementId;
       if (tclientTimes - reportEvent) {
          p0.writeUInt64(2, tclientTimes);
       }
       String str = "";
       if (!(this.serverHostname).equals(str)) {
          p0.writeString(3, this.serverHostname);
       }
       ClientLog$ReportEvent tserverTimes = this.serverTimestamp;
       if (tserverTimes - reportEvent) {
          p0.writeUInt64(4, tserverTimes);
       }
       tclientTimes = this.commonPackage;
       if (tclientTimes != null) {
          p0.writeMessage(5, tclientTimes);
       }
       tclientTimes = this.eventPackage;
       if (tclientTimes != null) {
          p0.writeMessage(6, tclientTimes);
       }
       tclientTimes = this.statPackage;
       if (tclientTimes != null) {
          p0.writeMessage(7, tclientTimes);
       }
       if (!(this.exploreLocale).equals(str)) {
          p0.writeString(8, this.exploreLocale);
       }
       if (!(this.sessionId).equals(str)) {
          p0.writeString(9, this.sessionId);
       }
       if (!(this.eventId).equals(str)) {
          p0.writeString(10, this.eventId);
       }
       if (!(this.frontSessionId).equals(str)) {
          p0.writeString(11, this.frontSessionId);
       }
       if (!(this.processName).equals(str)) {
          p0.writeString(12, this.processName);
       }
       if (!(this.relationLogId).equals(str)) {
          p0.writeString(13, this.relationLogId);
       }
       super.writeTo(p0);
       return;
    }
}
