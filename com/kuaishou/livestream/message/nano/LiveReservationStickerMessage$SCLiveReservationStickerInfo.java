package com.kuaishou.livestream.message.nano.LiveReservationStickerMessage$SCLiveReservationStickerInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveReservationStickerMessage$SCLiveReservationStickerUpdate;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveReservationStickerMessage$SCLiveReservationStickerInfo extends MessageNano	// class@00128a
{
    public LiveReservationStickerMessage$SCLiveReservationStickerUpdate[] reservationSticker;
    public static LiveReservationStickerMessage$SCLiveReservationStickerInfo[] _emptyArray;

    public void LiveReservationStickerMessage$SCLiveReservationStickerInfo(){
       super();
       this.clear();
    }
    public static LiveReservationStickerMessage$SCLiveReservationStickerInfo[] emptyArray(){
       if (LiveReservationStickerMessage$SCLiveReservationStickerInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveReservationStickerMessage$SCLiveReservationStickerInfo._emptyArray == null) {
             LiveReservationStickerMessage$SCLiveReservationStickerInfo[] sCLiveReserv = new LiveReservationStickerMessage$SCLiveReservationStickerInfo[0];
             LiveReservationStickerMessage$SCLiveReservationStickerInfo._emptyArray = sCLiveReserv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveReservationStickerMessage$SCLiveReservationStickerInfo._emptyArray;
    }
    public static LiveReservationStickerMessage$SCLiveReservationStickerInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveReservationStickerMessage$SCLiveReservationStickerInfo().mergeFrom(p0);
    }
    public static LiveReservationStickerMessage$SCLiveReservationStickerInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveReservationStickerMessage$SCLiveReservationStickerInfo(), p0);
    }
    public LiveReservationStickerMessage$SCLiveReservationStickerInfo clear(){
       this.reservationSticker = LiveReservationStickerMessage$SCLiveReservationStickerUpdate.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveReservationStickerMessage$SCLiveReservationStickerInfo treservation = this.reservationSticker;
       if (treservation != null && treservation.length > 0) {
          int i1 = 0;
          LiveReservationStickerMessage$SCLiveReservationStickerInfo treservation1 = this.reservationSticker;
          while (i1 < treservation1.length) {
             object oobject = treservation1[i1];
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
    public LiveReservationStickerMessage$SCLiveReservationStickerInfo mergeFrom(CodedInputByteBufferNano p0){
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
             LiveReservationStickerMessage$SCLiveReservationStickerInfo treservation = this.reservationSticker;
             int i2 = (treservation == null)? 0: treservation.length;
             i = i + i2;
             LiveReservationStickerMessage$SCLiveReservationStickerUpdate[] sCLiveReserv = new LiveReservationStickerMessage$SCLiveReservationStickerUpdate[i];
             if (i2) {
                System.arraycopy(treservation, 0, sCLiveReserv, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                sCLiveReserv[i2] = new LiveReservationStickerMessage$SCLiveReservationStickerUpdate();
                p0.readMessage(sCLiveReserv[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             sCLiveReserv[i2] = new LiveReservationStickerMessage$SCLiveReservationStickerUpdate();
             p0.readMessage(sCLiveReserv[i2]);
             this.reservationSticker = sCLiveReserv;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveReservationStickerMessage$SCLiveReservationStickerInfo treservation = this.reservationSticker;
       if (treservation != null && treservation.length > 0) {
          int i = 0;
          LiveReservationStickerMessage$SCLiveReservationStickerInfo treservation1 = this.reservationSticker;
          while (i < treservation1.length) {
             object oobject = treservation1[i];
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
