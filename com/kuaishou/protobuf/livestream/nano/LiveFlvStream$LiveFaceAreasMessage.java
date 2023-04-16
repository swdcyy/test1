package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceAreasMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveFlvStream$LiveFaceAreasMessage extends MessageNano	// class@000c6a
{
    public LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea[] faceAreasArray;
    public static LiveFlvStream$LiveFaceAreasMessage[] _emptyArray;

    public void LiveFlvStream$LiveFaceAreasMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFaceAreasMessage[] emptyArray(){
       if (LiveFlvStream$LiveFaceAreasMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFaceAreasMessage._emptyArray == null) {
             LiveFlvStream$LiveFaceAreasMessage[] liveFaceArea = new LiveFlvStream$LiveFaceAreasMessage[0];
             LiveFlvStream$LiveFaceAreasMessage._emptyArray = liveFaceArea;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFaceAreasMessage._emptyArray;
    }
    public static LiveFlvStream$LiveFaceAreasMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFaceAreasMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFaceAreasMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFaceAreasMessage(), p0);
    }
    public LiveFlvStream$LiveFaceAreasMessage clear(){
       this.faceAreasArray = LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveFaceAreasMessage tLiveFaceAre = this.faceAreasArray;
       if (tLiveFaceAre != null && tLiveFaceAre.length > 0) {
          int i1 = 0;
          LiveFlvStream$LiveFaceAreasMessage tLiveFaceAre1 = this.faceAreasArray;
          while (i1 < tLiveFaceAre1.length) {
             object oobject = tLiveFaceAre1[i1];
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
    public LiveFlvStream$LiveFaceAreasMessage mergeFrom(CodedInputByteBufferNano p0){
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
             LiveFlvStream$LiveFaceAreasMessage tLiveFaceAre = this.faceAreasArray;
             int i2 = (tLiveFaceAre == null)? 0: tLiveFaceAre.length;
             i = i + i2;
             LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea[] liveFaceArea = new LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea[i];
             if (i2) {
                System.arraycopy(tLiveFaceAre, 0, liveFaceArea, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveFaceArea[i2] = new LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea();
                p0.readMessage(liveFaceArea[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveFaceArea[i2] = new LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea();
             p0.readMessage(liveFaceArea[i2]);
             this.faceAreasArray = liveFaceArea;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveFaceAreasMessage tLiveFaceAre = this.faceAreasArray;
       if (tLiveFaceAre != null && tLiveFaceAre.length > 0) {
          int i = 0;
          LiveFlvStream$LiveFaceAreasMessage tLiveFaceAre1 = this.faceAreasArray;
          while (i < tLiveFaceAre1.length) {
             object oobject = tLiveFaceAre1[i];
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
