package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveFansTopOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveFansTopOpened extends MessageNano	// class@001348
{
    public String fansTopOrderId;
    public static LiveStreamMessages$SCLiveFansTopOpened[] _emptyArray;

    public void LiveStreamMessages$SCLiveFansTopOpened(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveFansTopOpened[] emptyArray(){
       if (LiveStreamMessages$SCLiveFansTopOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveFansTopOpened._emptyArray == null) {
             LiveStreamMessages$SCLiveFansTopOpened[] sCLiveFansTo = new LiveStreamMessages$SCLiveFansTopOpened[0];
             LiveStreamMessages$SCLiveFansTopOpened._emptyArray = sCLiveFansTo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveFansTopOpened._emptyArray;
    }
    public static LiveStreamMessages$SCLiveFansTopOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveFansTopOpened().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveFansTopOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveFansTopOpened(), p0);
    }
    public LiveStreamMessages$SCLiveFansTopOpened clear(){
       this.fansTopOrderId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.fansTopOrderId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.fansTopOrderId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveFansTopOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.fansTopOrderId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.fansTopOrderId).equals("")) {
          p0.writeString(1, this.fansTopOrderId);
       }
       super.writeTo(p0);
       return;
    }
}
