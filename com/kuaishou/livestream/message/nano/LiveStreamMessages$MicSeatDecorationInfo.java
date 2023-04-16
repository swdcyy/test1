package com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDecorationInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$MicSeatDecorationInfo extends MessageNano	// class@0012f6
{
    public int decorationType;
    public String micSeatName;
    public static LiveStreamMessages$MicSeatDecorationInfo[] _emptyArray;

    public void LiveStreamMessages$MicSeatDecorationInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$MicSeatDecorationInfo[] emptyArray(){
       if (LiveStreamMessages$MicSeatDecorationInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$MicSeatDecorationInfo._emptyArray == null) {
             LiveStreamMessages$MicSeatDecorationInfo[] micSeatDecor = new LiveStreamMessages$MicSeatDecorationInfo[0];
             LiveStreamMessages$MicSeatDecorationInfo._emptyArray = micSeatDecor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$MicSeatDecorationInfo._emptyArray;
    }
    public static LiveStreamMessages$MicSeatDecorationInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$MicSeatDecorationInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$MicSeatDecorationInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$MicSeatDecorationInfo(), p0);
    }
    public LiveStreamMessages$MicSeatDecorationInfo clear(){
       this.micSeatName = "";
       this.decorationType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.micSeatName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.micSeatName);
       }
       LiveStreamMessages$MicSeatDecorationInfo tdecorationT = this.decorationType;
       if (tdecorationT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tdecorationT);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$MicSeatDecorationInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.decorationType = i;
                }
             }
          }else {
             this.micSeatName = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.micSeatName).equals("")) {
          p0.writeString(1, this.micSeatName);
       }
       LiveStreamMessages$MicSeatDecorationInfo tdecorationT = this.decorationType;
       if (tdecorationT != null) {
          p0.writeInt32(2, tdecorationT);
       }
       super.writeTo(p0);
       return;
    }
}
