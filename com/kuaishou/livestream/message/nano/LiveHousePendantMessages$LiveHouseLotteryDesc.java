package com.kuaishou.livestream.message.nano.LiveHousePendantMessages$LiveHouseLotteryDesc;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveHousePendantMessages$LiveHouseLotteryText;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveHousePendantMessages$LiveHouseLotteryDesc extends MessageNano	// class@0011c4
{
    public LiveHousePendantMessages$LiveHouseLotteryText[] text;
    public static LiveHousePendantMessages$LiveHouseLotteryDesc[] _emptyArray;

    public void LiveHousePendantMessages$LiveHouseLotteryDesc(){
       super();
       this.clear();
    }
    public static LiveHousePendantMessages$LiveHouseLotteryDesc[] emptyArray(){
       if (LiveHousePendantMessages$LiveHouseLotteryDesc._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveHousePendantMessages$LiveHouseLotteryDesc._emptyArray == null) {
             LiveHousePendantMessages$LiveHouseLotteryDesc[] liveHouseLot = new LiveHousePendantMessages$LiveHouseLotteryDesc[0];
             LiveHousePendantMessages$LiveHouseLotteryDesc._emptyArray = liveHouseLot;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveHousePendantMessages$LiveHouseLotteryDesc._emptyArray;
    }
    public static LiveHousePendantMessages$LiveHouseLotteryDesc parseFrom(CodedInputByteBufferNano p0){
       return new LiveHousePendantMessages$LiveHouseLotteryDesc().mergeFrom(p0);
    }
    public static LiveHousePendantMessages$LiveHouseLotteryDesc parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveHousePendantMessages$LiveHouseLotteryDesc(), p0);
    }
    public LiveHousePendantMessages$LiveHouseLotteryDesc clear(){
       this.text = LiveHousePendantMessages$LiveHouseLotteryText.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveHousePendantMessages$LiveHouseLotteryDesc ttext = this.text;
       if (ttext != null && ttext.length > 0) {
          int i1 = 0;
          LiveHousePendantMessages$LiveHouseLotteryDesc ttext1 = this.text;
          while (i1 < ttext1.length) {
             object oobject = ttext1[i1];
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
    public LiveHousePendantMessages$LiveHouseLotteryDesc mergeFrom(CodedInputByteBufferNano p0){
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
             LiveHousePendantMessages$LiveHouseLotteryDesc ttext = this.text;
             int i2 = (ttext == null)? 0: ttext.length;
             i = i + i2;
             LiveHousePendantMessages$LiveHouseLotteryText[] liveHouseLot = new LiveHousePendantMessages$LiveHouseLotteryText[i];
             if (i2) {
                System.arraycopy(ttext, 0, liveHouseLot, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveHouseLot[i2] = new LiveHousePendantMessages$LiveHouseLotteryText();
                p0.readMessage(liveHouseLot[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveHouseLot[i2] = new LiveHousePendantMessages$LiveHouseLotteryText();
             p0.readMessage(liveHouseLot[i2]);
             this.text = liveHouseLot;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveHousePendantMessages$LiveHouseLotteryDesc ttext = this.text;
       if (ttext != null && ttext.length > 0) {
          int i = 0;
          LiveHousePendantMessages$LiveHouseLotteryDesc ttext1 = this.text;
          while (i < ttext1.length) {
             object oobject = ttext1[i];
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
