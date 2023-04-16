package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveFlvStream$LiveFaceTransDataMessage extends MessageNano	// class@000c6c
{
    public LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint[] facePointArray;
    public boolean isMirror;
    public static LiveFlvStream$LiveFaceTransDataMessage[] _emptyArray;

    public void LiveFlvStream$LiveFaceTransDataMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFaceTransDataMessage[] emptyArray(){
       if (LiveFlvStream$LiveFaceTransDataMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFaceTransDataMessage._emptyArray == null) {
             LiveFlvStream$LiveFaceTransDataMessage[] liveFaceTran = new LiveFlvStream$LiveFaceTransDataMessage[0];
             LiveFlvStream$LiveFaceTransDataMessage._emptyArray = liveFaceTran;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFaceTransDataMessage._emptyArray;
    }
    public static LiveFlvStream$LiveFaceTransDataMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFaceTransDataMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFaceTransDataMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFaceTransDataMessage(), p0);
    }
    public LiveFlvStream$LiveFaceTransDataMessage clear(){
       this.facePointArray = LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint.emptyArray();
       this.isMirror = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveFaceTransDataMessage tLiveFaceTra = this.facePointArray;
       if (tLiveFaceTra != null && tLiveFaceTra.length > 0) {
          int i1 = 0;
          LiveFlvStream$LiveFaceTransDataMessage tLiveFaceTra1 = this.facePointArray;
          while (i1 < tLiveFaceTra1.length) {
             object oobject = tLiveFaceTra1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tLiveFaceTra = this.isMirror;
       if (tLiveFaceTra != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tLiveFaceTra);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveFaceTransDataMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.isMirror = p0.readBool();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveFlvStream$LiveFaceTransDataMessage tLiveFaceTra = this.facePointArray;
             int i2 = (tLiveFaceTra == null)? 0: tLiveFaceTra.length;
             i = i + i2;
             LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint[] liveFaceTran = new LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint[i];
             if (i2) {
                System.arraycopy(tLiveFaceTra, 0, liveFaceTran, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveFaceTran[i2] = new LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint();
                p0.readMessage(liveFaceTran[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveFaceTran[i2] = new LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint();
             p0.readMessage(liveFaceTran[i2]);
             this.facePointArray = liveFaceTran;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveFaceTransDataMessage tLiveFaceTra = this.facePointArray;
       if (tLiveFaceTra != null && tLiveFaceTra.length > 0) {
          int i = 0;
          LiveFlvStream$LiveFaceTransDataMessage tLiveFaceTra1 = this.facePointArray;
          while (i < tLiveFaceTra1.length) {
             object oobject = tLiveFaceTra1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tLiveFaceTra = this.isMirror;
       if (tLiveFaceTra != null) {
          p0.writeBool(2, tLiveFaceTra);
       }
       super.writeTo(p0);
       return;
    }
}
