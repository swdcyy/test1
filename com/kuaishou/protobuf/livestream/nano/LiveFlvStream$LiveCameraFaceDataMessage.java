package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveCameraFaceDataMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveCameraFaceDataMessage extends MessageNano	// class@000c64
{
    public float facePositionBottom;
    public float facePositionLeft;
    public float facePositionRight;
    public float facePositionTop;
    public float faceScore;
    public boolean showFace;
    public int type;
    public static LiveFlvStream$LiveCameraFaceDataMessage[] _emptyArray;

    public void LiveFlvStream$LiveCameraFaceDataMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveCameraFaceDataMessage[] emptyArray(){
       if (LiveFlvStream$LiveCameraFaceDataMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveCameraFaceDataMessage._emptyArray == null) {
             LiveFlvStream$LiveCameraFaceDataMessage[] liveCameraFa = new LiveFlvStream$LiveCameraFaceDataMessage[0];
             LiveFlvStream$LiveCameraFaceDataMessage._emptyArray = liveCameraFa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveCameraFaceDataMessage._emptyArray;
    }
    public static LiveFlvStream$LiveCameraFaceDataMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveCameraFaceDataMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveCameraFaceDataMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveCameraFaceDataMessage(), p0);
    }
    public LiveFlvStream$LiveCameraFaceDataMessage clear(){
       this.showFace = false;
       this.faceScore = 0;
       this.facePositionLeft = 0;
       this.facePositionTop = 0;
       this.facePositionBottom = 0;
       this.facePositionRight = 0;
       this.type = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveCameraFaceDataMessage tshowFace = this.showFace;
       if (tshowFace != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tshowFace);
       }
       float f = 0;
       if (Float.floatToIntBits(this.faceScore) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(2, this.faceScore);
       }
       if (Float.floatToIntBits(this.facePositionLeft) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(3, this.facePositionLeft);
       }
       if (Float.floatToIntBits(this.facePositionTop) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(4, this.facePositionTop);
       }
       if (Float.floatToIntBits(this.facePositionBottom) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(5, this.facePositionBottom);
       }
       if (Float.floatToIntBits(this.facePositionRight) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(6, this.facePositionRight);
       }
       tshowFace = this.type;
       if (tshowFace != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tshowFace);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveCameraFaceDataMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 21) {
                if (i != 29) {
                   if (i != 37) {
                      if (i != 45) {
                         if (i != 53) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.type = p0.readUInt32();
                            }
                         }else {
                            this.facePositionRight = p0.readFloat();
                         }
                      }else {
                         this.facePositionBottom = p0.readFloat();
                      }
                   }else {
                      this.facePositionTop = p0.readFloat();
                   }
                }else {
                   this.facePositionLeft = p0.readFloat();
                }
             }else {
                this.faceScore = p0.readFloat();
             }
          }else {
             this.showFace = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveCameraFaceDataMessage tshowFace = this.showFace;
       if (tshowFace != null) {
          p0.writeBool(1, tshowFace);
       }
       float f = 0;
       if (Float.floatToIntBits(this.faceScore) != Float.floatToIntBits(f)) {
          p0.writeFloat(2, this.faceScore);
       }
       if (Float.floatToIntBits(this.facePositionLeft) != Float.floatToIntBits(f)) {
          p0.writeFloat(3, this.facePositionLeft);
       }
       if (Float.floatToIntBits(this.facePositionTop) != Float.floatToIntBits(f)) {
          p0.writeFloat(4, this.facePositionTop);
       }
       if (Float.floatToIntBits(this.facePositionBottom) != Float.floatToIntBits(f)) {
          p0.writeFloat(5, this.facePositionBottom);
       }
       if (Float.floatToIntBits(this.facePositionRight) != Float.floatToIntBits(f)) {
          p0.writeFloat(6, this.facePositionRight);
       }
       tshowFace = this.type;
       if (tshowFace != null) {
          p0.writeUInt32(7, tshowFace);
       }
       super.writeTo(p0);
       return;
    }
}
