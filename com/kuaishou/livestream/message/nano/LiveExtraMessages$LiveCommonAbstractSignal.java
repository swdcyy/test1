package com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

public final class LiveExtraMessages$LiveCommonAbstractSignal extends MessageNano	// class@0011a1
{
    public String liveStreamId;
    public byte[] payload;
    public String payloadType;
    public static LiveExtraMessages$LiveCommonAbstractSignal[] _emptyArray;

    public void LiveExtraMessages$LiveCommonAbstractSignal(){
       super();
       this.clear();
    }
    public static LiveExtraMessages$LiveCommonAbstractSignal[] emptyArray(){
       if (LiveExtraMessages$LiveCommonAbstractSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveExtraMessages$LiveCommonAbstractSignal._emptyArray == null) {
             LiveExtraMessages$LiveCommonAbstractSignal[] liveCommonAb = new LiveExtraMessages$LiveCommonAbstractSignal[0];
             LiveExtraMessages$LiveCommonAbstractSignal._emptyArray = liveCommonAb;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveExtraMessages$LiveCommonAbstractSignal._emptyArray;
    }
    public static LiveExtraMessages$LiveCommonAbstractSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveExtraMessages$LiveCommonAbstractSignal().mergeFrom(p0);
    }
    public static LiveExtraMessages$LiveCommonAbstractSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveExtraMessages$LiveCommonAbstractSignal(), p0);
    }
    public LiveExtraMessages$LiveCommonAbstractSignal clear(){
       this.liveStreamId = "";
       this.payloadType = "";
       this.payload = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.payloadType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.payloadType);
       }
       if (!Arrays.equals(this.payload, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(3, this.payload);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveExtraMessages$LiveCommonAbstractSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.payload = p0.readBytes();
                }
             }else {
                this.payloadType = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.payloadType).equals(str)) {
          p0.writeString(2, this.payloadType);
       }
       if (!Arrays.equals(this.payload, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(3, this.payload);
       }
       super.writeTo(p0);
       return;
    }
}
