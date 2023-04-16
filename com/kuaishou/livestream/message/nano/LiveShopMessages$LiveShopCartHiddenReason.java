package com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopCartHiddenReason;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveShopMessages$LiveShopCartHiddenReason extends MessageNano	// class@0012a3
{
    public int hiddenType;
    public long userId;
    public static LiveShopMessages$LiveShopCartHiddenReason[] _emptyArray;

    public void LiveShopMessages$LiveShopCartHiddenReason(){
       super();
       this.clear();
    }
    public static LiveShopMessages$LiveShopCartHiddenReason[] emptyArray(){
       if (LiveShopMessages$LiveShopCartHiddenReason._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveShopMessages$LiveShopCartHiddenReason._emptyArray == null) {
             LiveShopMessages$LiveShopCartHiddenReason[] liveShopCart = new LiveShopMessages$LiveShopCartHiddenReason[0];
             LiveShopMessages$LiveShopCartHiddenReason._emptyArray = liveShopCart;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveShopMessages$LiveShopCartHiddenReason._emptyArray;
    }
    public static LiveShopMessages$LiveShopCartHiddenReason parseFrom(CodedInputByteBufferNano p0){
       return new LiveShopMessages$LiveShopCartHiddenReason().mergeFrom(p0);
    }
    public static LiveShopMessages$LiveShopCartHiddenReason parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveShopMessages$LiveShopCartHiddenReason(), p0);
    }
    public LiveShopMessages$LiveShopCartHiddenReason clear(){
       this.userId = 0;
       this.hiddenType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveShopMessages$LiveShopCartHiddenReason tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.hiddenType;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveShopMessages$LiveShopCartHiddenReason mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.hiddenType = i;
                }
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveShopMessages$LiveShopCartHiddenReason tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.hiddenType;
       if (tuserId != null) {
          p0.writeInt32(2, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
