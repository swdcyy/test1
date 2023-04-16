package com.kuaishou.socket.nano.SocketMessages$SCXStreamLiveCardListInfoSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.SocketMessages$SCXStreamLiveCardInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SocketMessages$SCXStreamLiveCardListInfoSignal extends MessageNano	// class@000f4b
{
    public String bgColor;
    public SocketMessages$SCXStreamLiveCardInfo[] cardList;
    public boolean forceUpdate;
    public String title;
    public static SocketMessages$SCXStreamLiveCardListInfoSignal[] _emptyArray;

    public void SocketMessages$SCXStreamLiveCardListInfoSignal(){
       super();
       this.clear();
    }
    public static SocketMessages$SCXStreamLiveCardListInfoSignal[] emptyArray(){
       if (SocketMessages$SCXStreamLiveCardListInfoSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$SCXStreamLiveCardListInfoSignal._emptyArray == null) {
             SocketMessages$SCXStreamLiveCardListInfoSignal[] sCXStreamLiv = new SocketMessages$SCXStreamLiveCardListInfoSignal[0];
             SocketMessages$SCXStreamLiveCardListInfoSignal._emptyArray = sCXStreamLiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$SCXStreamLiveCardListInfoSignal._emptyArray;
    }
    public static SocketMessages$SCXStreamLiveCardListInfoSignal parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$SCXStreamLiveCardListInfoSignal().mergeFrom(p0);
    }
    public static SocketMessages$SCXStreamLiveCardListInfoSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$SCXStreamLiveCardListInfoSignal(), p0);
    }
    public SocketMessages$SCXStreamLiveCardListInfoSignal clear(){
       this.cardList = SocketMessages$SCXStreamLiveCardInfo.emptyArray();
       this.forceUpdate = false;
       this.title = "";
       this.bgColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SocketMessages$SCXStreamLiveCardListInfoSignal tcardList = this.cardList;
       if (tcardList != null && tcardList.length > 0) {
          int i1 = 0;
          SocketMessages$SCXStreamLiveCardListInfoSignal tcardList1 = this.cardList;
          while (i1 < tcardList1.length) {
             object oobject = tcardList1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcardList = this.forceUpdate;
       if (tcardList != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tcardList);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.title);
       }
       if (!(this.bgColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.bgColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$SCXStreamLiveCardListInfoSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.bgColor = p0.readString();
                   }
                }else {
                   this.title = p0.readString();
                }
             }else {
                this.forceUpdate = p0.readBool();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             SocketMessages$SCXStreamLiveCardListInfoSignal tcardList = this.cardList;
             int i2 = (tcardList == null)? 0: tcardList.length;
             i = i + i2;
             SocketMessages$SCXStreamLiveCardInfo[] sCXStreamLiv = new SocketMessages$SCXStreamLiveCardInfo[i];
             if (i2) {
                System.arraycopy(tcardList, 0, sCXStreamLiv, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                sCXStreamLiv[i2] = new SocketMessages$SCXStreamLiveCardInfo();
                p0.readMessage(sCXStreamLiv[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             sCXStreamLiv[i2] = new SocketMessages$SCXStreamLiveCardInfo();
             p0.readMessage(sCXStreamLiv[i2]);
             this.cardList = sCXStreamLiv;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SocketMessages$SCXStreamLiveCardListInfoSignal tcardList = this.cardList;
       if (tcardList != null && tcardList.length > 0) {
          int i = 0;
          SocketMessages$SCXStreamLiveCardListInfoSignal tcardList1 = this.cardList;
          while (i < tcardList1.length) {
             object oobject = tcardList1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tcardList = this.forceUpdate;
       if (tcardList != null) {
          p0.writeBool(2, tcardList);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(3, this.title);
       }
       if (!(this.bgColor).equals(str)) {
          p0.writeString(4, this.bgColor);
       }
       super.writeTo(p0);
       return;
    }
}
