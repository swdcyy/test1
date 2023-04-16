package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint extends MessageNano	// class@000c6b
{
    public int index;
    public float x;
    public float y;
    public static LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint[] _emptyArray;

    public void LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint[] emptyArray(){
       if (LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint._emptyArray == null) {
             LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint[] liveFaceTran = new LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint[0];
             LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint._emptyArray = liveFaceTran;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint._emptyArray;
    }
    public static LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint(), p0);
    }
    public LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint clear(){
       this.index = 0;
       this.x = 0;
       this.y = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tindex);
       }
       float f = 0;
       if (Float.floatToIntBits(this.x) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(2, this.x);
       }
       if (Float.floatToIntBits(this.y) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(3, this.y);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 21) {
                if (i != 29) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.y = p0.readFloat();
                }
             }else {
                this.x = p0.readFloat();
             }
          }else {
             this.index = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveFaceTransDataMessage$LiveFacePoint tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(1, tindex);
       }
       float f = 0;
       if (Float.floatToIntBits(this.x) != Float.floatToIntBits(f)) {
          p0.writeFloat(2, this.x);
       }
       if (Float.floatToIntBits(this.y) != Float.floatToIntBits(f)) {
          p0.writeFloat(3, this.y);
       }
       super.writeTo(p0);
       return;
    }
}
