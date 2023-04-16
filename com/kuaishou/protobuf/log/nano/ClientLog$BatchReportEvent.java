package com.kuaishou.protobuf.log.nano.ClientLog$BatchReportEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.log.nano.ClientLog$ReportEvent;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientLog$BatchReportEvent extends MessageNano	// class@000de5
{
    public ClientLog$ReportEvent[] event;
    public static ClientLog$BatchReportEvent[] _emptyArray;

    public void ClientLog$BatchReportEvent(){
       super();
       this.clear();
    }
    public static ClientLog$BatchReportEvent[] emptyArray(){
       if (ClientLog$BatchReportEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientLog$BatchReportEvent._emptyArray == null) {
             ClientLog$BatchReportEvent[] uBatchReport = new ClientLog$BatchReportEvent[0];
             ClientLog$BatchReportEvent._emptyArray = uBatchReport;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientLog$BatchReportEvent._emptyArray;
    }
    public static ClientLog$BatchReportEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientLog$BatchReportEvent().mergeFrom(p0);
    }
    public static ClientLog$BatchReportEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientLog$BatchReportEvent(), p0);
    }
    public ClientLog$BatchReportEvent clear(){
       this.event = ClientLog$ReportEvent.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientLog$BatchReportEvent tevent = this.event;
       if (tevent != null && tevent.length > 0) {
          int i1 = 0;
          ClientLog$BatchReportEvent tevent1 = this.event;
          while (i1 < tevent1.length) {
             object oobject = tevent1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientLog$BatchReportEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ClientLog$BatchReportEvent tevent = this.event;
             int i2 = (tevent == null)? 0: tevent.length;
             i = i + i2;
             ClientLog$ReportEvent[] reportEventA = new ClientLog$ReportEvent[i];
             if (i2) {
                System.arraycopy(tevent, 0, reportEventA, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                reportEventA[i2] = new ClientLog$ReportEvent();
                p0.readMessage(reportEventA[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             reportEventA[i2] = new ClientLog$ReportEvent();
             p0.readMessage(reportEventA[i2]);
             this.event = reportEventA;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientLog$BatchReportEvent tevent = this.event;
       if (tevent != null && tevent.length > 0) {
          int i = 0;
          ClientLog$BatchReportEvent tevent1 = this.event;
          while (i < tevent1.length) {
             object oobject = tevent1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
