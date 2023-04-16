package com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxTokenReady;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady extends MessageNano	// class@0013b4
{
    public LiveTreasureBoxMessage$LiveTreasureBoxTokenReady[] token;
    public static LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady[] _emptyArray;

    public void LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady(){
       super();
       this.clear();
    }
    public static LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady[] emptyArray(){
       if (LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady._emptyArray == null) {
             LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady[] sCLiveTreasu = new LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady[0];
             LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady._emptyArray = sCLiveTreasu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady._emptyArray;
    }
    public static LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady().mergeFrom(p0);
    }
    public static LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady(), p0);
    }
    public LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady clear(){
       this.token = LiveTreasureBoxMessage$LiveTreasureBoxTokenReady.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady ttoken = this.token;
       if (ttoken != null && ttoken.length > 0) {
          int i1 = 0;
          LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady ttoken1 = this.token;
          while (i1 < ttoken1.length) {
             object oobject = ttoken1[i1];
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
    public LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady mergeFrom(CodedInputByteBufferNano p0){
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
             LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady ttoken = this.token;
             int i2 = (ttoken == null)? 0: ttoken.length;
             i = i + i2;
             LiveTreasureBoxMessage$LiveTreasureBoxTokenReady[] liveTreasure = new LiveTreasureBoxMessage$LiveTreasureBoxTokenReady[i];
             if (i2) {
                System.arraycopy(ttoken, 0, liveTreasure, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveTreasure[i2] = new LiveTreasureBoxMessage$LiveTreasureBoxTokenReady();
                p0.readMessage(liveTreasure[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveTreasure[i2] = new LiveTreasureBoxMessage$LiveTreasureBoxTokenReady();
             p0.readMessage(liveTreasure[i2]);
             this.token = liveTreasure;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady ttoken = this.token;
       if (ttoken != null && ttoken.length > 0) {
          int i = 0;
          LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady ttoken1 = this.token;
          while (i < ttoken1.length) {
             object oobject = ttoken1[i];
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
