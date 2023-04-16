package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemReservationInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$ItemReservationInfo extends MessageNano	// class@001c4f
{
    public String itemWantCount;
    public long reservationCloseSaleMills;
    public String reservationSaleDesc;
    public long reservationSaleMills;
    public int reservationSaleStatus;
    public static LiveRoomSignalMessage$ItemReservationInfo[] _emptyArray;

    public void LiveRoomSignalMessage$ItemReservationInfo(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$ItemReservationInfo[] emptyArray(){
       if (LiveRoomSignalMessage$ItemReservationInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$ItemReservationInfo._emptyArray == null) {
             LiveRoomSignalMessage$ItemReservationInfo[] itemReservat = new LiveRoomSignalMessage$ItemReservationInfo[0];
             LiveRoomSignalMessage$ItemReservationInfo._emptyArray = itemReservat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$ItemReservationInfo._emptyArray;
    }
    public static LiveRoomSignalMessage$ItemReservationInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$ItemReservationInfo().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$ItemReservationInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$ItemReservationInfo(), p0);
    }
    public LiveRoomSignalMessage$ItemReservationInfo clear(){
       this.reservationSaleStatus = 0;
       this.reservationSaleDesc = "";
       this.reservationSaleMills = 0;
       this.reservationCloseSaleMills = 0;
       this.itemWantCount = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$ItemReservationInfo treservation = this.reservationSaleStatus;
       if (treservation != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, treservation);
       }
       String str = "";
       if (!(this.reservationSaleDesc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.reservationSaleDesc);
       }
       LiveRoomSignalMessage$ItemReservationInfo treservation1 = this.reservationSaleMills;
       if (treservation1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, treservation1);
       }
       treservation1 = this.reservationCloseSaleMills;
       if (treservation1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, treservation1);
       }
       if (!(this.itemWantCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.itemWantCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$ItemReservationInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.itemWantCount = p0.readString();
                      }
                   }else {
                      this.reservationCloseSaleMills = p0.readUInt64();
                   }
                }else {
                   this.reservationSaleMills = p0.readUInt64();
                }
             }else {
                this.reservationSaleDesc = p0.readString();
             }
          }else {
             this.reservationSaleStatus = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$ItemReservationInfo treservation = this.reservationSaleStatus;
       if (treservation != null) {
          p0.writeUInt32(1, treservation);
       }
       String str = "";
       if (!(this.reservationSaleDesc).equals(str)) {
          p0.writeString(2, this.reservationSaleDesc);
       }
       LiveRoomSignalMessage$ItemReservationInfo treservation1 = this.reservationSaleMills;
       if (treservation1) {
          p0.writeUInt64(3, treservation1);
       }
       treservation1 = this.reservationCloseSaleMills;
       if (treservation1) {
          p0.writeUInt64(4, treservation1);
       }
       if (!(this.itemWantCount).equals(str)) {
          p0.writeString(5, this.itemWantCount);
       }
       super.writeTo(p0);
       return;
    }
}
