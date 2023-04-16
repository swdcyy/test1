package com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$SCLiveKrnRedPackShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveKrnRedPackMessage$SCLiveKrnRedPackShow extends MessageNano	// class@0011d3
{
    public LiveKrnRedPackMessage$LiveKrnRedPack[] redPack;
    public static LiveKrnRedPackMessage$SCLiveKrnRedPackShow[] _emptyArray;

    public void LiveKrnRedPackMessage$SCLiveKrnRedPackShow(){
       super();
       this.clear();
    }
    public static LiveKrnRedPackMessage$SCLiveKrnRedPackShow[] emptyArray(){
       if (LiveKrnRedPackMessage$SCLiveKrnRedPackShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveKrnRedPackMessage$SCLiveKrnRedPackShow._emptyArray == null) {
             LiveKrnRedPackMessage$SCLiveKrnRedPackShow[] sCLiveKrnRed = new LiveKrnRedPackMessage$SCLiveKrnRedPackShow[0];
             LiveKrnRedPackMessage$SCLiveKrnRedPackShow._emptyArray = sCLiveKrnRed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveKrnRedPackMessage$SCLiveKrnRedPackShow._emptyArray;
    }
    public static LiveKrnRedPackMessage$SCLiveKrnRedPackShow parseFrom(CodedInputByteBufferNano p0){
       return new LiveKrnRedPackMessage$SCLiveKrnRedPackShow().mergeFrom(p0);
    }
    public static LiveKrnRedPackMessage$SCLiveKrnRedPackShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveKrnRedPackMessage$SCLiveKrnRedPackShow(), p0);
    }
    public LiveKrnRedPackMessage$SCLiveKrnRedPackShow clear(){
       this.redPack = LiveKrnRedPackMessage$LiveKrnRedPack.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveKrnRedPackMessage$SCLiveKrnRedPackShow tredPack = this.redPack;
       if (tredPack != null && tredPack.length > 0) {
          int i1 = 0;
          LiveKrnRedPackMessage$SCLiveKrnRedPackShow tredPack1 = this.redPack;
          while (i1 < tredPack1.length) {
             object oobject = tredPack1[i1];
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
    public LiveKrnRedPackMessage$SCLiveKrnRedPackShow mergeFrom(CodedInputByteBufferNano p0){
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
             LiveKrnRedPackMessage$SCLiveKrnRedPackShow tredPack = this.redPack;
             int i2 = (tredPack == null)? 0: tredPack.length;
             i = i + i2;
             LiveKrnRedPackMessage$LiveKrnRedPack[] liveKrnRedPa = new LiveKrnRedPackMessage$LiveKrnRedPack[i];
             if (i2) {
                System.arraycopy(tredPack, 0, liveKrnRedPa, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveKrnRedPa[i2] = new LiveKrnRedPackMessage$LiveKrnRedPack();
                p0.readMessage(liveKrnRedPa[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveKrnRedPa[i2] = new LiveKrnRedPackMessage$LiveKrnRedPack();
             p0.readMessage(liveKrnRedPa[i2]);
             this.redPack = liveKrnRedPa;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveKrnRedPackMessage$SCLiveKrnRedPackShow tredPack = this.redPack;
       if (tredPack != null && tredPack.length > 0) {
          int i = 0;
          LiveKrnRedPackMessage$SCLiveKrnRedPackShow tredPack1 = this.redPack;
          while (i < tredPack1.length) {
             object oobject = tredPack1[i];
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
