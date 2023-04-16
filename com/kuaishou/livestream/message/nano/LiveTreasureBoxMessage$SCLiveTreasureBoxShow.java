package com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$SCLiveTreasureBoxShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveTreasureBoxMessage$SCLiveTreasureBoxShow extends MessageNano	// class@0013b3
{
    public LiveTreasureBoxMessage$LiveTreasureBoxShow[] show;
    public static LiveTreasureBoxMessage$SCLiveTreasureBoxShow[] _emptyArray;

    public void LiveTreasureBoxMessage$SCLiveTreasureBoxShow(){
       super();
       this.clear();
    }
    public static LiveTreasureBoxMessage$SCLiveTreasureBoxShow[] emptyArray(){
       if (LiveTreasureBoxMessage$SCLiveTreasureBoxShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureBoxMessage$SCLiveTreasureBoxShow._emptyArray == null) {
             LiveTreasureBoxMessage$SCLiveTreasureBoxShow[] sCLiveTreasu = new LiveTreasureBoxMessage$SCLiveTreasureBoxShow[0];
             LiveTreasureBoxMessage$SCLiveTreasureBoxShow._emptyArray = sCLiveTreasu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureBoxMessage$SCLiveTreasureBoxShow._emptyArray;
    }
    public static LiveTreasureBoxMessage$SCLiveTreasureBoxShow parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureBoxMessage$SCLiveTreasureBoxShow().mergeFrom(p0);
    }
    public static LiveTreasureBoxMessage$SCLiveTreasureBoxShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureBoxMessage$SCLiveTreasureBoxShow(), p0);
    }
    public LiveTreasureBoxMessage$SCLiveTreasureBoxShow clear(){
       this.show = LiveTreasureBoxMessage$LiveTreasureBoxShow.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveTreasureBoxMessage$SCLiveTreasureBoxShow tshow = this.show;
       if (tshow != null && tshow.length > 0) {
          int i1 = 0;
          LiveTreasureBoxMessage$SCLiveTreasureBoxShow tshow1 = this.show;
          while (i1 < tshow1.length) {
             object oobject = tshow1[i1];
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
    public LiveTreasureBoxMessage$SCLiveTreasureBoxShow mergeFrom(CodedInputByteBufferNano p0){
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
             LiveTreasureBoxMessage$SCLiveTreasureBoxShow tshow = this.show;
             int i2 = (tshow == null)? 0: tshow.length;
             i = i + i2;
             LiveTreasureBoxMessage$LiveTreasureBoxShow[] liveTreasure = new LiveTreasureBoxMessage$LiveTreasureBoxShow[i];
             if (i2) {
                System.arraycopy(tshow, 0, liveTreasure, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveTreasure[i2] = new LiveTreasureBoxMessage$LiveTreasureBoxShow();
                p0.readMessage(liveTreasure[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveTreasure[i2] = new LiveTreasureBoxMessage$LiveTreasureBoxShow();
             p0.readMessage(liveTreasure[i2]);
             this.show = liveTreasure;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveTreasureBoxMessage$SCLiveTreasureBoxShow tshow = this.show;
       if (tshow != null && tshow.length > 0) {
          int i = 0;
          LiveTreasureBoxMessage$SCLiveTreasureBoxShow tshow1 = this.show;
          while (i < tshow1.length) {
             object oobject = tshow1[i];
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
