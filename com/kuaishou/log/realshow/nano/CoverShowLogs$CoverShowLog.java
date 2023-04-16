package com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowLog;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowPage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class CoverShowLogs$CoverShowLog extends MessageNano	// class@0014a4
{
    public CoverShowLogs$CoverShowPage[] page;
    public static CoverShowLogs$CoverShowLog[] _emptyArray;

    public void CoverShowLogs$CoverShowLog(){
       super();
       this.clear();
    }
    public static CoverShowLogs$CoverShowLog[] emptyArray(){
       if (CoverShowLogs$CoverShowLog._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CoverShowLogs$CoverShowLog._emptyArray == null) {
             CoverShowLogs$CoverShowLog[] uCoverShowLo = new CoverShowLogs$CoverShowLog[0];
             CoverShowLogs$CoverShowLog._emptyArray = uCoverShowLo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CoverShowLogs$CoverShowLog._emptyArray;
    }
    public static CoverShowLogs$CoverShowLog parseFrom(CodedInputByteBufferNano p0){
       return new CoverShowLogs$CoverShowLog().mergeFrom(p0);
    }
    public static CoverShowLogs$CoverShowLog parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CoverShowLogs$CoverShowLog(), p0);
    }
    public CoverShowLogs$CoverShowLog clear(){
       this.page = CoverShowLogs$CoverShowPage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       CoverShowLogs$CoverShowLog tpage = this.page;
       if (tpage != null && tpage.length > 0) {
          int i1 = 0;
          CoverShowLogs$CoverShowLog tpage1 = this.page;
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
    public CoverShowLogs$CoverShowLog mergeFrom(CodedInputByteBufferNano p0){
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
             CoverShowLogs$CoverShowLog tpage = this.page;
             int i2 = (tpage == null)? 0: tpage.length;
             i = i + i2;
             CoverShowLogs$CoverShowPage[] uCoverShowPa = new CoverShowLogs$CoverShowPage[i];
             if (i2) {
                System.arraycopy(tpage, 0, uCoverShowPa, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uCoverShowPa[i2] = new CoverShowLogs$CoverShowPage();
                p0.readMessage(uCoverShowPa[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uCoverShowPa[i2] = new CoverShowLogs$CoverShowPage();
             p0.readMessage(uCoverShowPa[i2]);
             this.page = uCoverShowPa;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       CoverShowLogs$CoverShowLog tpage = this.page;
       if (tpage != null && tpage.length > 0) {
          int i = 0;
          CoverShowLogs$CoverShowLog tpage1 = this.page;
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
