package com.kuaishou.livestream.message.nano.LiveStreamMessages$DrawingGiftPoint;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$DrawingGiftPoint extends MessageNano	// class@0012cf
{
    public int bottom;
    public int giftId;
    public int left;
    public int right;
    public int top;
    public static LiveStreamMessages$DrawingGiftPoint[] _emptyArray;

    public void LiveStreamMessages$DrawingGiftPoint(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$DrawingGiftPoint[] emptyArray(){
       if (LiveStreamMessages$DrawingGiftPoint._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$DrawingGiftPoint._emptyArray == null) {
             LiveStreamMessages$DrawingGiftPoint[] uDrawingGift = new LiveStreamMessages$DrawingGiftPoint[0];
             LiveStreamMessages$DrawingGiftPoint._emptyArray = uDrawingGift;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$DrawingGiftPoint._emptyArray;
    }
    public static LiveStreamMessages$DrawingGiftPoint parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$DrawingGiftPoint().mergeFrom(p0);
    }
    public static LiveStreamMessages$DrawingGiftPoint parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$DrawingGiftPoint(), p0);
    }
    public LiveStreamMessages$DrawingGiftPoint clear(){
       this.giftId = 0;
       this.left = 0;
       this.top = 0;
       this.right = 0;
       this.bottom = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$DrawingGiftPoint tgiftId = this.giftId;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tgiftId);
       }
       tgiftId = this.left;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tgiftId);
       }
       tgiftId = this.top;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tgiftId);
       }
       tgiftId = this.right;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tgiftId);
       }
       tgiftId = this.bottom;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tgiftId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$DrawingGiftPoint mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.bottom = p0.readUInt32();
                      }
                   }else {
                      this.right = p0.readUInt32();
                   }
                }else {
                   this.top = p0.readUInt32();
                }
             }else {
                this.left = p0.readUInt32();
             }
          }else {
             this.giftId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$DrawingGiftPoint tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(1, tgiftId);
       }
       tgiftId = this.left;
       if (tgiftId != null) {
          p0.writeUInt32(2, tgiftId);
       }
       tgiftId = this.top;
       if (tgiftId != null) {
          p0.writeUInt32(3, tgiftId);
       }
       tgiftId = this.right;
       if (tgiftId != null) {
          p0.writeUInt32(4, tgiftId);
       }
       tgiftId = this.bottom;
       if (tgiftId != null) {
          p0.writeUInt32(5, tgiftId);
       }
       super.writeTo(p0);
       return;
    }
}
