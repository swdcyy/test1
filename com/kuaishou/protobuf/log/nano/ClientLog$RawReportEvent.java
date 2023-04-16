package com.kuaishou.protobuf.log.nano.ClientLog$RawReportEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import lr4.a$j;
import kr4.a$c;
import com.kuaishou.protobuf.log.nano.ClientCommon$CommonPackage;

public final class ClientLog$RawReportEvent extends MessageNano	// class@000de7
{
    public long clientIncrementId;
    public long clientTimestamp;
    public ClientCommon$CommonPackage commonPackage;
    public a$c eventPackage;
    public String exploreLocale;
    public String serverHostname;
    public long serverTimestamp;
    public String sessionId;
    public a$j statPackage;
    public String timeZone;
    public static ClientLog$RawReportEvent[] _emptyArray;

    public void ClientLog$RawReportEvent(){
       super();
       this.clear();
    }
    public static ClientLog$RawReportEvent[] emptyArray(){
       if (ClientLog$RawReportEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientLog$RawReportEvent._emptyArray == null) {
             ClientLog$RawReportEvent[] rawReportEve = new ClientLog$RawReportEvent[0];
             ClientLog$RawReportEvent._emptyArray = rawReportEve;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientLog$RawReportEvent._emptyArray;
    }
    public static ClientLog$RawReportEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientLog$RawReportEvent().mergeFrom(p0);
    }
    public static ClientLog$RawReportEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientLog$RawReportEvent(), p0);
    }
    public ClientLog$RawReportEvent clear(){
       this.clientTimestamp = 0;
       this.clientIncrementId = 0;
       this.sessionId = "";
       this.timeZone = "";
       this.serverTimestamp = 0;
       this.serverHostname = "";
       this.exploreLocale = "";
       this.commonPackage = null;
       this.eventPackage = null;
       this.statPackage = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientLog$RawReportEvent tclientTimes = this.clientTimestamp;
       ClientLog$RawReportEvent rawReportEve = null;
       if (tclientTimes - rawReportEve) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tclientTimes);
       }
       tclientTimes = this.clientIncrementId;
       if (tclientTimes - rawReportEve) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tclientTimes);
       }
       String str = "";
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.sessionId);
       }
       if (!(this.timeZone).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.timeZone);
       }
       ClientLog$RawReportEvent tserverTimes = this.serverTimestamp;
       if (tserverTimes - rawReportEve) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tserverTimes);
       }
       if (!(this.serverHostname).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.serverHostname);
       }
       if (!(this.exploreLocale).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.exploreLocale);
       }
       tclientTimes = this.commonPackage;
       if (tclientTimes != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tclientTimes);
       }
       tclientTimes = this.eventPackage;
       if (tclientTimes != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tclientTimes);
       }
       tclientTimes = this.statPackage;
       if (tclientTimes != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tclientTimes);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientLog$RawReportEvent mergeFrom(CodedInputByteBufferNano p0){
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
                this.sessionId = p0.readString();
                break;
              case '"':
                this.timeZone = p0.readString();
                break;
              case '(':
                this.serverTimestamp = p0.readUInt64();
                break;
              case '2':
                this.serverHostname = p0.readString();
                break;
              case ':':
                this.exploreLocale = p0.readString();
                break;
              case 'B':
                if (this.commonPackage == null) {
                   this.commonPackage = new ClientCommon$CommonPackage();
                }
                p0.readMessage(this.commonPackage);
                break;
              case 'J':
                if (this.eventPackage == null) {
                   this.eventPackage = new a$c();
                }
                p0.readMessage(this.eventPackage);
                break;
              case 'R':
                if (this.statPackage == null) {
                   this.statPackage = new a$j();
                }
                p0.readMessage(this.statPackage);
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
       ClientLog$RawReportEvent tclientTimes = this.clientTimestamp;
       ClientLog$RawReportEvent rawReportEve = null;
       if (tclientTimes - rawReportEve) {
          p0.writeUInt64(1, tclientTimes);
       }
       tclientTimes = this.clientIncrementId;
       if (tclientTimes - rawReportEve) {
          p0.writeUInt64(2, tclientTimes);
       }
       String str = "";
       if (!(this.sessionId).equals(str)) {
          p0.writeString(3, this.sessionId);
       }
       if (!(this.timeZone).equals(str)) {
          p0.writeString(4, this.timeZone);
       }
       ClientLog$RawReportEvent tserverTimes = this.serverTimestamp;
       if (tserverTimes - rawReportEve) {
          p0.writeUInt64(5, tserverTimes);
       }
       if (!(this.serverHostname).equals(str)) {
          p0.writeString(6, this.serverHostname);
       }
       if (!(this.exploreLocale).equals(str)) {
          p0.writeString(7, this.exploreLocale);
       }
       tclientTimes = this.commonPackage;
       if (tclientTimes != null) {
          p0.writeMessage(8, tclientTimes);
       }
       tclientTimes = this.eventPackage;
       if (tclientTimes != null) {
          p0.writeMessage(9, tclientTimes);
       }
       tclientTimes = this.statPackage;
       if (tclientTimes != null) {
          p0.writeMessage(10, tclientTimes);
       }
       super.writeTo(p0);
       return;
    }
}
