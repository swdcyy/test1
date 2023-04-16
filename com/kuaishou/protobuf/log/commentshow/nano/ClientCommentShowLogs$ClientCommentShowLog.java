package com.kuaishou.protobuf.log.commentshow.nano.ClientCommentShowLogs$ClientCommentShowLog;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.log.commentshow.nano.ClientCommentShowLogs$ClientCommentShowPage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientCommentShowLogs$ClientCommentShowLog extends MessageNano	// class@000dd2
{
    public ClientCommentShowLogs$ClientCommentShowPage[] page;
    public static ClientCommentShowLogs$ClientCommentShowLog[] _emptyArray;

    public void ClientCommentShowLogs$ClientCommentShowLog(){
       super();
       this.clear();
    }
    public static ClientCommentShowLogs$ClientCommentShowLog[] emptyArray(){
       if (ClientCommentShowLogs$ClientCommentShowLog._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientCommentShowLogs$ClientCommentShowLog._emptyArray == null) {
             ClientCommentShowLogs$ClientCommentShowLog[] uClientComme = new ClientCommentShowLogs$ClientCommentShowLog[0];
             ClientCommentShowLogs$ClientCommentShowLog._emptyArray = uClientComme;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientCommentShowLogs$ClientCommentShowLog._emptyArray;
    }
    public static ClientCommentShowLogs$ClientCommentShowLog parseFrom(CodedInputByteBufferNano p0){
       return new ClientCommentShowLogs$ClientCommentShowLog().mergeFrom(p0);
    }
    public static ClientCommentShowLogs$ClientCommentShowLog parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientCommentShowLogs$ClientCommentShowLog(), p0);
    }
    public ClientCommentShowLogs$ClientCommentShowLog clear(){
       this.page = ClientCommentShowLogs$ClientCommentShowPage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientCommentShowLogs$ClientCommentShowLog tpage = this.page;
       if (tpage != null && tpage.length > 0) {
          int i1 = 0;
          ClientCommentShowLogs$ClientCommentShowLog tpage1 = this.page;
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
    public ClientCommentShowLogs$ClientCommentShowLog mergeFrom(CodedInputByteBufferNano p0){
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
             ClientCommentShowLogs$ClientCommentShowLog tpage = this.page;
             int i2 = (tpage == null)? 0: tpage.length;
             i = i + i2;
             ClientCommentShowLogs$ClientCommentShowPage[] uClientComme = new ClientCommentShowLogs$ClientCommentShowPage[i];
             if (i2) {
                System.arraycopy(tpage, 0, uClientComme, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uClientComme[i2] = new ClientCommentShowLogs$ClientCommentShowPage();
                p0.readMessage(uClientComme[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uClientComme[i2] = new ClientCommentShowLogs$ClientCommentShowPage();
             p0.readMessage(uClientComme[i2]);
             this.page = uClientComme;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientCommentShowLogs$ClientCommentShowLog tpage = this.page;
       if (tpage != null && tpage.length > 0) {
          int i = 0;
          ClientCommentShowLogs$ClientCommentShowLog tpage1 = this.page;
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
