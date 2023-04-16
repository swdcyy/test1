package com.kuaishou.livestream.message.nano.LiveReservationStickerMessage$SCLiveReservationStickerClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveReservationStickerMessage$SCLiveReservationStickerClose extends MessageNano	// class@001289
{
    public boolean stickerClose;
    public static LiveReservationStickerMessage$SCLiveReservationStickerClose[] _emptyArray;

    public void LiveReservationStickerMessage$SCLiveReservationStickerClose(){
       super();
       this.clear();
    }
    public static LiveReservationStickerMessage$SCLiveReservationStickerClose[] emptyArray(){
       if (LiveReservationStickerMessage$SCLiveReservationStickerClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveReservationStickerMessage$SCLiveReservationStickerClose._emptyArray == null) {
             LiveReservationStickerMessage$SCLiveReservationStickerClose[] sCLiveReserv = new LiveReservationStickerMessage$SCLiveReservationStickerClose[0];
             LiveReservationStickerMessage$SCLiveReservationStickerClose._emptyArray = sCLiveReserv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveReservationStickerMessage$SCLiveReservationStickerClose._emptyArray;
    }
    public static LiveReservationStickerMessage$SCLiveReservationStickerClose parseFrom(CodedInputByteBufferNano p0){
       return new LiveReservationStickerMessage$SCLiveReservationStickerClose().mergeFrom(p0);
    }
    public static LiveReservationStickerMessage$SCLiveReservationStickerClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveReservationStickerMessage$SCLiveReservationStickerClose(), p0);
    }
    public LiveReservationStickerMessage$SCLiveReservationStickerClose clear(){
       this.stickerClose = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveReservationStickerMessage$SCLiveReservationStickerClose tstickerClos = this.stickerClose;
       if (tstickerClos != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tstickerClos);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveReservationStickerMessage$SCLiveReservationStickerClose mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.stickerClose = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveReservationStickerMessage$SCLiveReservationStickerClose tstickerClos = this.stickerClose;
       if (tstickerClos != null) {
          p0.writeBool(1, tstickerClos);
       }
       super.writeTo(p0);
       return;
    }
}
