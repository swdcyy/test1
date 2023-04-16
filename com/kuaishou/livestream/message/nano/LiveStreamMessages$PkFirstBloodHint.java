package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkFirstBloodHint;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PkFirstBloodHint extends MessageNano	// class@001312
{
    public static LiveStreamMessages$PkFirstBloodHint[] _emptyArray;

    public void LiveStreamMessages$PkFirstBloodHint(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkFirstBloodHint[] emptyArray(){
       if (LiveStreamMessages$PkFirstBloodHint._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkFirstBloodHint._emptyArray == null) {
             LiveStreamMessages$PkFirstBloodHint[] pkFirstBlood = new LiveStreamMessages$PkFirstBloodHint[0];
             LiveStreamMessages$PkFirstBloodHint._emptyArray = pkFirstBlood;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkFirstBloodHint._emptyArray;
    }
    public static LiveStreamMessages$PkFirstBloodHint parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkFirstBloodHint().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkFirstBloodHint parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkFirstBloodHint(), p0);
    }
    public LiveStreamMessages$PkFirstBloodHint clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PkFirstBloodHint mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
