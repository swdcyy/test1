package com.kuaishou.log.realshow.nano.DiscardedShowLogs$DiscardedShowLog;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.log.realshow.nano.DiscardedShowLogs$DiscardedShowPage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class DiscardedShowLogs$DiscardedShowLog extends MessageNano	// class@0014a8
{
    public DiscardedShowLogs$DiscardedShowPage[] page;
    public static DiscardedShowLogs$DiscardedShowLog[] _emptyArray;

    public void DiscardedShowLogs$DiscardedShowLog(){
       super();
       this.clear();
    }
    public static DiscardedShowLogs$DiscardedShowLog[] emptyArray(){
       if (DiscardedShowLogs$DiscardedShowLog._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (DiscardedShowLogs$DiscardedShowLog._emptyArray == null) {
             DiscardedShowLogs$DiscardedShowLog[] uDiscardedSh = new DiscardedShowLogs$DiscardedShowLog[0];
             DiscardedShowLogs$DiscardedShowLog._emptyArray = uDiscardedSh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return DiscardedShowLogs$DiscardedShowLog._emptyArray;
    }
    public static DiscardedShowLogs$DiscardedShowLog parseFrom(CodedInputByteBufferNano p0){
       return new DiscardedShowLogs$DiscardedShowLog().mergeFrom(p0);
    }
    public static DiscardedShowLogs$DiscardedShowLog parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new DiscardedShowLogs$DiscardedShowLog(), p0);
    }
    public DiscardedShowLogs$DiscardedShowLog clear(){
       this.page = DiscardedShowLogs$DiscardedShowPage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       DiscardedShowLogs$DiscardedShowLog tpage = this.page;
       if (tpage != null && tpage.length > 0) {
          int i1 = 0;
          DiscardedShowLogs$DiscardedShowLog tpage1 = this.page;
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
    public DiscardedShowLogs$DiscardedShowLog mergeFrom(CodedInputByteBufferNano p0){
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
             DiscardedShowLogs$DiscardedShowLog tpage = this.page;
             int i2 = (tpage == null)? 0: tpage.length;
             i = i + i2;
             DiscardedShowLogs$DiscardedShowPage[] uDiscardedSh = new DiscardedShowLogs$DiscardedShowPage[i];
             if (i2) {
                System.arraycopy(tpage, 0, uDiscardedSh, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uDiscardedSh[i2] = new DiscardedShowLogs$DiscardedShowPage();
                p0.readMessage(uDiscardedSh[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uDiscardedSh[i2] = new DiscardedShowLogs$DiscardedShowPage();
             p0.readMessage(uDiscardedSh[i2]);
             this.page = uDiscardedSh;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       DiscardedShowLogs$DiscardedShowLog tpage = this.page;
       if (tpage != null && tpage.length > 0) {
          int i = 0;
          DiscardedShowLogs$DiscardedShowLog tpage1 = this.page;
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
