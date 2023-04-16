package com.kuaishou.livestream.message.nano.LiveStreamMessages$CSSocketMessageAck;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

public final class LiveStreamMessages$CSSocketMessageAck extends MessageNano	// class@0012c3
{
    public byte[] ackInfo;
    public long clientTimestamp;
    public String messageId;
    public long serverTimestamp;
    public static LiveStreamMessages$CSSocketMessageAck[] _emptyArray;

    public void LiveStreamMessages$CSSocketMessageAck(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CSSocketMessageAck[] emptyArray(){
       if (LiveStreamMessages$CSSocketMessageAck._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CSSocketMessageAck._emptyArray == null) {
             LiveStreamMessages$CSSocketMessageAck[] uCSSocketMes = new LiveStreamMessages$CSSocketMessageAck[0];
             LiveStreamMessages$CSSocketMessageAck._emptyArray = uCSSocketMes;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CSSocketMessageAck._emptyArray;
    }
    public static LiveStreamMessages$CSSocketMessageAck parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CSSocketMessageAck().mergeFrom(p0);
    }
    public static LiveStreamMessages$CSSocketMessageAck parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CSSocketMessageAck(), p0);
    }
    public LiveStreamMessages$CSSocketMessageAck clear(){
       this.messageId = "";
       this.clientTimestamp = 0;
       this.serverTimestamp = 0;
       this.ackInfo = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.messageId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.messageId);
       }
       LiveStreamMessages$CSSocketMessageAck tclientTimes = this.clientTimestamp;
       int i1 = 0;
       if (tclientTimes - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tclientTimes);
       }
       tclientTimes = this.serverTimestamp;
       if (tclientTimes - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tclientTimes);
       }
       if (!Arrays.equals(this.ackInfo, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(4, this.ackInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CSSocketMessageAck mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.ackInfo = p0.readBytes();
                   }
                }else {
                   this.serverTimestamp = p0.readUInt64();
                }
             }else {
                this.clientTimestamp = p0.readUInt64();
             }
          }else {
             this.messageId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.messageId).equals("")) {
          p0.writeString(1, this.messageId);
       }
       LiveStreamMessages$CSSocketMessageAck tclientTimes = this.clientTimestamp;
       int i = 0;
       if (tclientTimes - i) {
          p0.writeUInt64(2, tclientTimes);
       }
       tclientTimes = this.serverTimestamp;
       if (tclientTimes - i) {
          p0.writeUInt64(3, tclientTimes);
       }
       if (!Arrays.equals(this.ackInfo, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(4, this.ackInfo);
       }
       super.writeTo(p0);
       return;
    }
}
