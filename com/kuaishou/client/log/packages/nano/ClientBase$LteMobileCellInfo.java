package com.kuaishou.client.log.packages.nano.ClientBase$LteMobileCellInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientBase$LteMobileCellInfo extends MessageNano	// class@001388
{
    public int arfcn;
    public int band;
    public long cellId;
    public int cid;
    public int cqi;
    public int dbm;
    public String imei;
    public String imsi;
    public int lac;
    public int mcc;
    public int mnc;
    public int rsrp;
    public int rsrq;
    public int rssi;
    public int rssnr;
    public long timestampDiff;
    public static ClientBase$LteMobileCellInfo[] _emptyArray;

    public void ClientBase$LteMobileCellInfo(){
       super();
       this.clear();
    }
    public static ClientBase$LteMobileCellInfo[] emptyArray(){
       if (ClientBase$LteMobileCellInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientBase$LteMobileCellInfo._emptyArray == null) {
             ClientBase$LteMobileCellInfo[] lteMobileCel = new ClientBase$LteMobileCellInfo[0];
             ClientBase$LteMobileCellInfo._emptyArray = lteMobileCel;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientBase$LteMobileCellInfo._emptyArray;
    }
    public static ClientBase$LteMobileCellInfo parseFrom(CodedInputByteBufferNano p0){
       return new ClientBase$LteMobileCellInfo().mergeFrom(p0);
    }
    public static ClientBase$LteMobileCellInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientBase$LteMobileCellInfo(), p0);
    }
    public ClientBase$LteMobileCellInfo clear(){
       this.cid = 0;
       this.rssi = 0;
       this.mcc = 0;
       this.mnc = 0;
       this.lac = 0;
       this.imei = "";
       this.imsi = "";
       this.rsrq = 0;
       this.rsrp = 0;
       this.cqi = 0;
       this.rssnr = 0;
       this.cellId = 0;
       this.arfcn = 0;
       this.band = 0;
       this.dbm = 0;
       this.timestampDiff = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientBase$LteMobileCellInfo tcid = this.cid;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tcid);
       }
       tcid = this.rssi;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tcid);
       }
       tcid = this.mcc;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tcid);
       }
       tcid = this.mnc;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tcid);
       }
       tcid = this.lac;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tcid);
       }
       String str = "";
       if (!(this.imei).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.imei);
       }
       if (!(this.imsi).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.imsi);
       }
       tcid = this.rsrq;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tcid);
       }
       tcid = this.rsrp;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tcid);
       }
       tcid = this.cqi;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tcid);
       }
       tcid = this.rssnr;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tcid);
       }
       tcid = this.cellId;
       int i1 = 0;
       if (tcid - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(12, tcid);
       }
       tcid = this.arfcn;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, tcid);
       }
       tcid = this.band;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, tcid);
       }
       tcid = this.dbm;
       if (tcid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, tcid);
       }
       tcid = this.timestampDiff;
       if (tcid - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(16, tcid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientBase$LteMobileCellInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.cid = p0.readInt32();
                break;
              case 16:
                this.rssi = p0.readInt32();
                break;
              case 24:
                this.mcc = p0.readInt32();
                break;
              case 32:
                this.mnc = p0.readInt32();
                break;
              case '(':
                this.lac = p0.readInt32();
                break;
              case '2':
                this.imei = p0.readString();
                break;
              case ':':
                this.imsi = p0.readString();
                break;
              case '@':
                this.rsrq = p0.readInt32();
                break;
              case 'H':
                this.rsrp = p0.readInt32();
                break;
              case 'P':
                this.cqi = p0.readInt32();
                break;
              case 'X':
                this.rssnr = p0.readInt32();
                break;
              case '`':
                this.cellId = p0.readInt64();
                break;
              case 'h':
                this.arfcn = p0.readInt32();
                break;
              case 'p':
                this.band = p0.readInt32();
                break;
              case 'x':
                this.dbm = p0.readInt32();
                break;
              case 128:
                this.timestampDiff = p0.readInt64();
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
       ClientBase$LteMobileCellInfo tcid = this.cid;
       if (tcid != null) {
          p0.writeInt32(1, tcid);
       }
       tcid = this.rssi;
       if (tcid != null) {
          p0.writeInt32(2, tcid);
       }
       tcid = this.mcc;
       if (tcid != null) {
          p0.writeInt32(3, tcid);
       }
       tcid = this.mnc;
       if (tcid != null) {
          p0.writeInt32(4, tcid);
       }
       tcid = this.lac;
       if (tcid != null) {
          p0.writeInt32(5, tcid);
       }
       String str = "";
       if (!(this.imei).equals(str)) {
          p0.writeString(6, this.imei);
       }
       if (!(this.imsi).equals(str)) {
          p0.writeString(7, this.imsi);
       }
       tcid = this.rsrq;
       if (tcid != null) {
          p0.writeInt32(8, tcid);
       }
       tcid = this.rsrp;
       if (tcid != null) {
          p0.writeInt32(9, tcid);
       }
       tcid = this.cqi;
       if (tcid != null) {
          p0.writeInt32(10, tcid);
       }
       tcid = this.rssnr;
       if (tcid != null) {
          p0.writeInt32(11, tcid);
       }
       tcid = this.cellId;
       int i = 0;
       if (tcid - i) {
          p0.writeInt64(12, tcid);
       }
       tcid = this.arfcn;
       if (tcid != null) {
          p0.writeInt32(13, tcid);
       }
       tcid = this.band;
       if (tcid != null) {
          p0.writeInt32(14, tcid);
       }
       tcid = this.dbm;
       if (tcid != null) {
          p0.writeInt32(15, tcid);
       }
       tcid = this.timestampDiff;
       if (tcid - i) {
          p0.writeInt64(16, tcid);
       }
       super.writeTo(p0);
       return;
    }
}
