package com.kuaishou.livestream.message.nano.LiveBulletinMessages$LiveReservationLiteModel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBulletinMessages$LiveReservationLiteModel extends MessageNano	// class@001131
{
    public String reservationId;
    public String title;
    public static LiveBulletinMessages$LiveReservationLiteModel[] _emptyArray;

    public void LiveBulletinMessages$LiveReservationLiteModel(){
       super();
       this.clear();
    }
    public static LiveBulletinMessages$LiveReservationLiteModel[] emptyArray(){
       if (LiveBulletinMessages$LiveReservationLiteModel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBulletinMessages$LiveReservationLiteModel._emptyArray == null) {
             LiveBulletinMessages$LiveReservationLiteModel[] liveReservat = new LiveBulletinMessages$LiveReservationLiteModel[0];
             LiveBulletinMessages$LiveReservationLiteModel._emptyArray = liveReservat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBulletinMessages$LiveReservationLiteModel._emptyArray;
    }
    public static LiveBulletinMessages$LiveReservationLiteModel parseFrom(CodedInputByteBufferNano p0){
       return new LiveBulletinMessages$LiveReservationLiteModel().mergeFrom(p0);
    }
    public static LiveBulletinMessages$LiveReservationLiteModel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBulletinMessages$LiveReservationLiteModel(), p0);
    }
    public LiveBulletinMessages$LiveReservationLiteModel clear(){
       this.reservationId = "";
       this.title = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.reservationId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.reservationId);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBulletinMessages$LiveReservationLiteModel mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.title = p0.readString();
             }
          }else {
             this.reservationId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.reservationId).equals(str)) {
          p0.writeString(1, this.reservationId);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       super.writeTo(p0);
       return;
    }
}
