package com.kuaishou.livestream.message.nano.LiveTrafficReportProto$LiveTrafficReport;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveTrafficReportProto$LiveTrafficReport extends MessageNano	// class@0013aa
{
    public static LiveTrafficReportProto$LiveTrafficReport[] _emptyArray;

    public void LiveTrafficReportProto$LiveTrafficReport(){
       super();
       this.clear();
    }
    public static LiveTrafficReportProto$LiveTrafficReport[] emptyArray(){
       if (LiveTrafficReportProto$LiveTrafficReport._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTrafficReportProto$LiveTrafficReport._emptyArray == null) {
             LiveTrafficReportProto$LiveTrafficReport[] liveTrafficR = new LiveTrafficReportProto$LiveTrafficReport[0];
             LiveTrafficReportProto$LiveTrafficReport._emptyArray = liveTrafficR;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTrafficReportProto$LiveTrafficReport._emptyArray;
    }
    public static LiveTrafficReportProto$LiveTrafficReport parseFrom(CodedInputByteBufferNano p0){
       return new LiveTrafficReportProto$LiveTrafficReport().mergeFrom(p0);
    }
    public static LiveTrafficReportProto$LiveTrafficReport parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTrafficReportProto$LiveTrafficReport(), p0);
    }
    public LiveTrafficReportProto$LiveTrafficReport clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTrafficReportProto$LiveTrafficReport mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
