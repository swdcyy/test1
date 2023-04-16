package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea extends MessageNano	// class@000c69
{
    public float bottom;
    public float left;
    public float right;
    public float top;
    public static LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea[] _emptyArray;

    public void LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea[] emptyArray(){
       if (LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea._emptyArray == null) {
             LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea[] liveFaceArea = new LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea[0];
             LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea._emptyArray = liveFaceArea;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea._emptyArray;
    }
    public static LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea(), p0);
    }
    public LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea clear(){
       this.left = 0;
       this.top = 0;
       this.bottom = 0;
       this.right = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       float f = 0;
       if (Float.floatToIntBits(this.left) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(1, this.left);
       }
       if (Float.floatToIntBits(this.top) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(2, this.top);
       }
       if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(3, this.bottom);
       }
       if (Float.floatToIntBits(this.right) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(4, this.right);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveFaceAreasMessage$LiveFaceArea mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 13) {
             if (i != 21) {
                if (i != 29) {
                   if (i != 37) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.right = p0.readFloat();
                   }
                }else {
                   this.bottom = p0.readFloat();
                }
             }else {
                this.top = p0.readFloat();
             }
          }else {
             this.left = p0.readFloat();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       float f = 0;
       if (Float.floatToIntBits(this.left) != Float.floatToIntBits(f)) {
          p0.writeFloat(1, this.left);
       }
       if (Float.floatToIntBits(this.top) != Float.floatToIntBits(f)) {
          p0.writeFloat(2, this.top);
       }
       if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(f)) {
          p0.writeFloat(3, this.bottom);
       }
       if (Float.floatToIntBits(this.right) != Float.floatToIntBits(f)) {
          p0.writeFloat(4, this.right);
       }
       super.writeTo(p0);
       return;
    }
}
