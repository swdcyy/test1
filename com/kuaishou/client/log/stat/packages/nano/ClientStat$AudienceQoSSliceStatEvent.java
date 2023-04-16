package com.kuaishou.client.log.stat.packages.nano.ClientStat$AudienceQoSSliceStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;

public final class ClientStat$AudienceQoSSliceStatEvent extends MessageNano	// class@0007a2
{
    public String boardPlatform;
    public int cid;
    public String interStExParams;
    public StidContainerProto$StidContainer interStidContainer;
    public String kwaiSignature;
    public int lac;
    public String livePlayQosInfo;
    public int mcc;
    public int mnc;
    public int rssi;
    public String socName;
    public static ClientStat$AudienceQoSSliceStatEvent[] _emptyArray;

    public void ClientStat$AudienceQoSSliceStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$AudienceQoSSliceStatEvent[] emptyArray(){
       if (ClientStat$AudienceQoSSliceStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$AudienceQoSSliceStatEvent._emptyArray == null) {
             ClientStat$AudienceQoSSliceStatEvent[] uAudienceQoS = new ClientStat$AudienceQoSSliceStatEvent[0];
             ClientStat$AudienceQoSSliceStatEvent._emptyArray = uAudienceQoS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$AudienceQoSSliceStatEvent._emptyArray;
    }
    public static ClientStat$AudienceQoSSliceStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$AudienceQoSSliceStatEvent().mergeFrom(p0);
    }
    public static ClientStat$AudienceQoSSliceStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$AudienceQoSSliceStatEvent(), p0);
    }
    public ClientStat$AudienceQoSSliceStatEvent clear(){
       this.livePlayQosInfo = "";
       this.rssi = 0;
       this.mcc = 0;
       this.mnc = 0;
       this.lac = 0;
       this.cid = 0;
       this.kwaiSignature = "";
       this.interStidContainer = null;
       this.socName = "";
       this.boardPlatform = "";
       this.interStExParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.livePlayQosInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.livePlayQosInfo);
       }
       ClientStat$AudienceQoSSliceStatEvent trssi = this.rssi;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, trssi);
       }
       trssi = this.mcc;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, trssi);
       }
       trssi = this.mnc;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, trssi);
       }
       trssi = this.lac;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, trssi);
       }
       trssi = this.cid;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, trssi);
       }
       if (!(this.kwaiSignature).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.kwaiSignature);
       }
       trssi = this.interStidContainer;
       if (trssi != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, trssi);
       }
       if (!(this.socName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.socName);
       }
       if (!(this.boardPlatform).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.boardPlatform);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.interStExParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$AudienceQoSSliceStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.livePlayQosInfo = p0.readString();
                break;
              case 16:
                this.rssi = p0.readUInt32();
                break;
              case 24:
                this.mcc = p0.readUInt32();
                break;
              case 32:
                this.mnc = p0.readUInt32();
                break;
              case '(':
                this.lac = p0.readUInt32();
                break;
              case '0':
                this.cid = p0.readUInt32();
                break;
              case ':':
                this.kwaiSignature = p0.readString();
                break;
              case 'B':
                if (this.interStidContainer == null) {
                   this.interStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.interStidContainer);
                break;
              case 'J':
                this.socName = p0.readString();
                break;
              case 'R':
                this.boardPlatform = p0.readString();
                break;
              case 'Z':
                this.interStExParams = p0.readString();
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
       if (!(this.livePlayQosInfo).equals(str)) {
          p0.writeString(1, this.livePlayQosInfo);
       }
       ClientStat$AudienceQoSSliceStatEvent trssi = this.rssi;
       if (trssi != null) {
          p0.writeUInt32(2, trssi);
       }
       trssi = this.mcc;
       if (trssi != null) {
          p0.writeUInt32(3, trssi);
       }
       trssi = this.mnc;
       if (trssi != null) {
          p0.writeUInt32(4, trssi);
       }
       trssi = this.lac;
       if (trssi != null) {
          p0.writeUInt32(5, trssi);
       }
       trssi = this.cid;
       if (trssi != null) {
          p0.writeUInt32(6, trssi);
       }
       if (!(this.kwaiSignature).equals(str)) {
          p0.writeString(7, this.kwaiSignature);
       }
       trssi = this.interStidContainer;
       if (trssi != null) {
          p0.writeMessage(8, trssi);
       }
       if (!(this.socName).equals(str)) {
          p0.writeString(9, this.socName);
       }
       if (!(this.boardPlatform).equals(str)) {
          p0.writeString(10, this.boardPlatform);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(11, this.interStExParams);
       }
       super.writeTo(p0);
       return;
    }
}
