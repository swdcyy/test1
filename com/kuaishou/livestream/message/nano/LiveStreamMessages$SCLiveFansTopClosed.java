package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveFansTopClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveFansTopClosed extends MessageNano	// class@001347
{
    public static LiveStreamMessages$SCLiveFansTopClosed[] _emptyArray;

    public void LiveStreamMessages$SCLiveFansTopClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveFansTopClosed[] emptyArray(){
       if (LiveStreamMessages$SCLiveFansTopClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveFansTopClosed._emptyArray == null) {
             LiveStreamMessages$SCLiveFansTopClosed[] sCLiveFansTo = new LiveStreamMessages$SCLiveFansTopClosed[0];
             LiveStreamMessages$SCLiveFansTopClosed._emptyArray = sCLiveFansTo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveFansTopClosed._emptyArray;
    }
    public static LiveStreamMessages$SCLiveFansTopClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveFansTopClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveFansTopClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveFansTopClosed(), p0);
    }
    public LiveStreamMessages$SCLiveFansTopClosed clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveFansTopClosed mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
