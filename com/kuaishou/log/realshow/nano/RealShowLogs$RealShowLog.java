package com.kuaishou.log.realshow.nano.RealShowLogs$RealShowLog;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowPage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class RealShowLogs$RealShowLog extends MessageNano	// class@0014b3
{
    public RealShowLogs$RealShowPage[] page;
    public static RealShowLogs$RealShowLog[] _emptyArray;

    public void RealShowLogs$RealShowLog(){
       super();
       this.clear();
    }
    public static RealShowLogs$RealShowLog[] emptyArray(){
       if (RealShowLogs$RealShowLog._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (RealShowLogs$RealShowLog._emptyArray == null) {
             RealShowLogs$RealShowLog[] realShowLogA = new RealShowLogs$RealShowLog[0];
             RealShowLogs$RealShowLog._emptyArray = realShowLogA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return RealShowLogs$RealShowLog._emptyArray;
    }
    public static RealShowLogs$RealShowLog parseFrom(CodedInputByteBufferNano p0){
       return new RealShowLogs$RealShowLog().mergeFrom(p0);
    }
    public static RealShowLogs$RealShowLog parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new RealShowLogs$RealShowLog(), p0);
    }
    public RealShowLogs$RealShowLog clear(){
       this.page = RealShowLogs$RealShowPage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       RealShowLogs$RealShowLog tpage = this.page;
       if (tpage != null && tpage.length > 0) {
          int i1 = 0;
          RealShowLogs$RealShowLog tpage1 = this.page;
          while (i1 < tpage1.length) {
             object oobject = tpage1[i1];
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
    public RealShowLogs$RealShowLog mergeFrom(CodedInputByteBufferNano p0){
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
             RealShowLogs$RealShowLog tpage = this.page;
             int i2 = (tpage == null)? 0: tpage.length;
             i = i + i2;
             RealShowLogs$RealShowPage[] realShowPage = new RealShowLogs$RealShowPage[i];
             if (i2) {
                System.arraycopy(tpage, 0, realShowPage, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                realShowPage[i2] = new RealShowLogs$RealShowPage();
                p0.readMessage(realShowPage[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             realShowPage[i2] = new RealShowLogs$RealShowPage();
             p0.readMessage(realShowPage[i2]);
             this.page = realShowPage;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       RealShowLogs$RealShowLog tpage = this.page;
       if (tpage != null && tpage.length > 0) {
          int i = 0;
          RealShowLogs$RealShowLog tpage1 = this.page;
          while (i < tpage1.length) {
             object oobject = tpage1[i];
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
