package com.kuaishou.client.log.packages.nano.ClientLog$RawBatchReportEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.packages.nano.ClientLog$RawReportEvent;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import java.lang.Object;
import java.lang.System;

public final class ClientLog$RawBatchReportEvent extends MessageNano	// class@00139b
{
    public byte[] clientRequestInfo;
    public ClientLog$RawReportEvent[] event;
    public static ClientLog$RawBatchReportEvent[] _emptyArray;

    public void ClientLog$RawBatchReportEvent(){
       super();
       this.clear();
    }
    public static ClientLog$RawBatchReportEvent[] emptyArray(){
       if (ClientLog$RawBatchReportEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientLog$RawBatchReportEvent._emptyArray == null) {
             ClientLog$RawBatchReportEvent[] rawBatchRepo = new ClientLog$RawBatchReportEvent[0];
             ClientLog$RawBatchReportEvent._emptyArray = rawBatchRepo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientLog$RawBatchReportEvent._emptyArray;
    }
    public static ClientLog$RawBatchReportEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientLog$RawBatchReportEvent().mergeFrom(p0);
    }
    public static ClientLog$RawBatchReportEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientLog$RawBatchReportEvent(), p0);
    }
    public ClientLog$RawBatchReportEvent clear(){
       this.event = ClientLog$RawReportEvent.emptyArray();
       this.clientRequestInfo = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientLog$RawBatchReportEvent tevent = this.event;
       if (tevent != null && tevent.length > 0) {
          int i1 = 0;
          ClientLog$RawBatchReportEvent tevent1 = this.event;
          while (i1 < tevent1.length) {
             object oobject = tevent1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!Arrays.equals(this.clientRequestInfo, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(2, this.clientRequestInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientLog$RawBatchReportEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.clientRequestInfo = p0.readBytes();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ClientLog$RawBatchReportEvent tevent = this.event;
             int i2 = (tevent == null)? 0: tevent.length;
             i = i + i2;
             ClientLog$RawReportEvent[] rawReportEve = new ClientLog$RawReportEvent[i];
             if (i2) {
                System.arraycopy(tevent, 0, rawReportEve, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                rawReportEve[i2] = new ClientLog$RawReportEvent();
                p0.readMessage(rawReportEve[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             rawReportEve[i2] = new ClientLog$RawReportEvent();
             p0.readMessage(rawReportEve[i2]);
             this.event = rawReportEve;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientLog$RawBatchReportEvent tevent = this.event;
       if (tevent != null && tevent.length > 0) {
          int i = 0;
          ClientLog$RawBatchReportEvent tevent1 = this.event;
          while (i < tevent1.length) {
             object oobject = tevent1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       if (!Arrays.equals(this.clientRequestInfo, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(2, this.clientRequestInfo);
       }
       super.writeTo(p0);
       return;
    }
}
