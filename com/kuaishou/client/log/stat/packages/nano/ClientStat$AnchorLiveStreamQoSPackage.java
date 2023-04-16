package com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorLiveStreamQoSPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$AnchorLiveStreamQoSPackage extends MessageNano	// class@0013a6
{
    public long blockCnt;
    public long bps0Duration;
    public long bpsAbove500Duration;
    public long bpsBetween0And200Duration;
    public long bpsBetween200And300Duration;
    public long bpsBetween300And400Duration;
    public long bpsBetween400And500Duration;
    public long droppedFrameCnt;
    public long encodedVideoFrameCnt;
    public long fps0Duration;
    public long fpsAbove15Duration;
    public long fpsBetween0And5Duration;
    public long fpsBetween10And15Duration;
    public long fpsBetween5And10Duration;
    public long retryCnt;
    public long traffic;
    public static ClientStat$AnchorLiveStreamQoSPackage[] _emptyArray;

    public void ClientStat$AnchorLiveStreamQoSPackage(){
       super();
       this.clear();
    }
    public static ClientStat$AnchorLiveStreamQoSPackage[] emptyArray(){
       if (ClientStat$AnchorLiveStreamQoSPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$AnchorLiveStreamQoSPackage._emptyArray == null) {
             ClientStat$AnchorLiveStreamQoSPackage[] uAnchorLiveS = new ClientStat$AnchorLiveStreamQoSPackage[0];
             ClientStat$AnchorLiveStreamQoSPackage._emptyArray = uAnchorLiveS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$AnchorLiveStreamQoSPackage._emptyArray;
    }
    public static ClientStat$AnchorLiveStreamQoSPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$AnchorLiveStreamQoSPackage().mergeFrom(p0);
    }
    public static ClientStat$AnchorLiveStreamQoSPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$AnchorLiveStreamQoSPackage(), p0);
    }
    public ClientStat$AnchorLiveStreamQoSPackage clear(){
       this.traffic = 0;
       this.blockCnt = 0;
       this.retryCnt = 0;
       this.droppedFrameCnt = 0;
       this.bpsAbove500Duration = 0;
       this.bpsBetween400And500Duration = 0;
       this.bpsBetween300And400Duration = 0;
       this.bpsBetween200And300Duration = 0;
       this.bpsBetween0And200Duration = 0;
       this.bps0Duration = 0;
       this.fpsAbove15Duration = 0;
       this.fpsBetween10And15Duration = 0;
       this.fpsBetween5And10Duration = 0;
       this.fpsBetween0And5Duration = 0;
       this.fps0Duration = 0;
       this.encodedVideoFrameCnt = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$AnchorLiveStreamQoSPackage ttraffic = this.traffic;
       int i1 = 0;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttraffic);
       }
       ttraffic = this.blockCnt;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttraffic);
       }
       ttraffic = this.retryCnt;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttraffic);
       }
       ttraffic = this.droppedFrameCnt;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttraffic);
       }
       ttraffic = this.bpsAbove500Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttraffic);
       }
       ttraffic = this.bpsBetween400And500Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, ttraffic);
       }
       ttraffic = this.bpsBetween300And400Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, ttraffic);
       }
       ttraffic = this.bpsBetween200And300Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttraffic);
       }
       ttraffic = this.bpsBetween0And200Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttraffic);
       }
       ttraffic = this.bps0Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, ttraffic);
       }
       ttraffic = this.fpsAbove15Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, ttraffic);
       }
       ttraffic = this.fpsBetween10And15Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, ttraffic);
       }
       ttraffic = this.fpsBetween5And10Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, ttraffic);
       }
       ttraffic = this.fpsBetween0And5Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, ttraffic);
       }
       ttraffic = this.fps0Duration;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, ttraffic);
       }
       ttraffic = this.encodedVideoFrameCnt;
       if (ttraffic - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, ttraffic);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$AnchorLiveStreamQoSPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.traffic = p0.readUInt64();
                break;
              case 16:
                this.blockCnt = p0.readUInt64();
                break;
              case 24:
                this.retryCnt = p0.readUInt64();
                break;
              case 32:
                this.droppedFrameCnt = p0.readUInt64();
                break;
              case '(':
                this.bpsAbove500Duration = p0.readUInt64();
                break;
              case '0':
                this.bpsBetween400And500Duration = p0.readUInt64();
                break;
              case '8':
                this.bpsBetween300And400Duration = p0.readUInt64();
                break;
              case '@':
                this.bpsBetween200And300Duration = p0.readUInt64();
                break;
              case 'H':
                this.bpsBetween0And200Duration = p0.readUInt64();
                break;
              case 'P':
                this.bps0Duration = p0.readUInt64();
                break;
              case 'X':
                this.fpsAbove15Duration = p0.readUInt64();
                break;
              case '`':
                this.fpsBetween10And15Duration = p0.readUInt64();
                break;
              case 'h':
                this.fpsBetween5And10Duration = p0.readUInt64();
                break;
              case 'p':
                this.fpsBetween0And5Duration = p0.readUInt64();
                break;
              case 'x':
                this.fps0Duration = p0.readUInt64();
                break;
              case 128:
                this.encodedVideoFrameCnt = p0.readUInt64();
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
       ClientStat$AnchorLiveStreamQoSPackage ttraffic = this.traffic;
       int i = 0;
       if (ttraffic - i) {
          p0.writeUInt64(1, ttraffic);
       }
       ttraffic = this.blockCnt;
       if (ttraffic - i) {
          p0.writeUInt64(2, ttraffic);
       }
       ttraffic = this.retryCnt;
       if (ttraffic - i) {
          p0.writeUInt64(3, ttraffic);
       }
       ttraffic = this.droppedFrameCnt;
       if (ttraffic - i) {
          p0.writeUInt64(4, ttraffic);
       }
       ttraffic = this.bpsAbove500Duration;
       if (ttraffic - i) {
          p0.writeUInt64(5, ttraffic);
       }
       ttraffic = this.bpsBetween400And500Duration;
       if (ttraffic - i) {
          p0.writeUInt64(6, ttraffic);
       }
       ttraffic = this.bpsBetween300And400Duration;
       if (ttraffic - i) {
          p0.writeUInt64(7, ttraffic);
       }
       ttraffic = this.bpsBetween200And300Duration;
       if (ttraffic - i) {
          p0.writeUInt64(8, ttraffic);
       }
       ttraffic = this.bpsBetween0And200Duration;
       if (ttraffic - i) {
          p0.writeUInt64(9, ttraffic);
       }
       ttraffic = this.bps0Duration;
       if (ttraffic - i) {
          p0.writeUInt64(10, ttraffic);
       }
       ttraffic = this.fpsAbove15Duration;
       if (ttraffic - i) {
          p0.writeUInt64(11, ttraffic);
       }
       ttraffic = this.fpsBetween10And15Duration;
       if (ttraffic - i) {
          p0.writeUInt64(12, ttraffic);
       }
       ttraffic = this.fpsBetween5And10Duration;
       if (ttraffic - i) {
          p0.writeUInt64(13, ttraffic);
       }
       ttraffic = this.fpsBetween0And5Duration;
       if (ttraffic - i) {
          p0.writeUInt64(14, ttraffic);
       }
       ttraffic = this.fps0Duration;
       if (ttraffic - i) {
          p0.writeUInt64(15, ttraffic);
       }
       ttraffic = this.encodedVideoFrameCnt;
       if (ttraffic - i) {
          p0.writeUInt64(16, ttraffic);
       }
       super.writeTo(p0);
       return;
    }
}
