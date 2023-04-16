package com.kuaishou.livestream.message.nano.LiveShopMessages$LiveInteractiveRoomShopCartStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopCartHiddenReason;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveShopMessages$LiveInteractiveRoomShopCartStatus extends MessageNano	// class@0012a0
{
    public LiveShopMessages$LiveShopCartHiddenReason[] forbiddenUserWithHiddenReason;
    public boolean hiddenShopCart;
    public static LiveShopMessages$LiveInteractiveRoomShopCartStatus[] _emptyArray;

    public void LiveShopMessages$LiveInteractiveRoomShopCartStatus(){
       super();
       this.clear();
    }
    public static LiveShopMessages$LiveInteractiveRoomShopCartStatus[] emptyArray(){
       if (LiveShopMessages$LiveInteractiveRoomShopCartStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveShopMessages$LiveInteractiveRoomShopCartStatus._emptyArray == null) {
             LiveShopMessages$LiveInteractiveRoomShopCartStatus[] liveInteract = new LiveShopMessages$LiveInteractiveRoomShopCartStatus[0];
             LiveShopMessages$LiveInteractiveRoomShopCartStatus._emptyArray = liveInteract;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveShopMessages$LiveInteractiveRoomShopCartStatus._emptyArray;
    }
    public static LiveShopMessages$LiveInteractiveRoomShopCartStatus parseFrom(CodedInputByteBufferNano p0){
       return new LiveShopMessages$LiveInteractiveRoomShopCartStatus().mergeFrom(p0);
    }
    public static LiveShopMessages$LiveInteractiveRoomShopCartStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveShopMessages$LiveInteractiveRoomShopCartStatus(), p0);
    }
    public LiveShopMessages$LiveInteractiveRoomShopCartStatus clear(){
       this.hiddenShopCart = false;
       this.forbiddenUserWithHiddenReason = LiveShopMessages$LiveShopCartHiddenReason.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveShopMessages$LiveInteractiveRoomShopCartStatus thiddenShopC = this.hiddenShopCart;
       if (thiddenShopC != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, thiddenShopC);
       }
       thiddenShopC = this.forbiddenUserWithHiddenReason;
       if (thiddenShopC != null && thiddenShopC.length > 0) {
          int i1 = 0;
          LiveShopMessages$LiveInteractiveRoomShopCartStatus tforbiddenUs = this.forbiddenUserWithHiddenReason;
          while (i1 < tforbiddenUs.length) {
             object oobject = tforbiddenUs[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveShopMessages$LiveInteractiveRoomShopCartStatus mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveShopMessages$LiveInteractiveRoomShopCartStatus tforbiddenUs = this.forbiddenUserWithHiddenReason;
                int i2 = (tforbiddenUs == null)? 0: tforbiddenUs.length;
                i = i + i2;
                LiveShopMessages$LiveShopCartHiddenReason[] liveShopCart = new LiveShopMessages$LiveShopCartHiddenReason[i];
                if (i2) {
                   System.arraycopy(tforbiddenUs, 0, liveShopCart, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveShopCart[i2] = new LiveShopMessages$LiveShopCartHiddenReason();
                   p0.readMessage(liveShopCart[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveShopCart[i2] = new LiveShopMessages$LiveShopCartHiddenReason();
                p0.readMessage(liveShopCart[i2]);
                this.forbiddenUserWithHiddenReason = liveShopCart;
             }
          }else {
             this.hiddenShopCart = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveShopMessages$LiveInteractiveRoomShopCartStatus thiddenShopC = this.hiddenShopCart;
       if (thiddenShopC != null) {
          p0.writeBool(1, thiddenShopC);
       }
       thiddenShopC = this.forbiddenUserWithHiddenReason;
       if (thiddenShopC != null && thiddenShopC.length > 0) {
          int i = 0;
          LiveShopMessages$LiveInteractiveRoomShopCartStatus tforbiddenUs = this.forbiddenUserWithHiddenReason;
          while (i < tforbiddenUs.length) {
             object oobject = tforbiddenUs[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
