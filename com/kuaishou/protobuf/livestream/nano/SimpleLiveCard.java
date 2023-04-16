package com.kuaishou.protobuf.livestream.nano.SimpleLiveCard;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SimpleLiveCard extends MessageNano	// class@000d7c
{
    public static SimpleLiveCard[] _emptyArray;

    public void SimpleLiveCard(){
       super();
       this.clear();
    }
    public static SimpleLiveCard[] emptyArray(){
       if (SimpleLiveCard._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SimpleLiveCard._emptyArray == null) {
             SimpleLiveCard[] simpleLiveCa = new SimpleLiveCard[0];
             SimpleLiveCard._emptyArray = simpleLiveCa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SimpleLiveCard._emptyArray;
    }
    public static SimpleLiveCard parseFrom(CodedInputByteBufferNano p0){
       return new SimpleLiveCard().mergeFrom(p0);
    }
    public static SimpleLiveCard parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SimpleLiveCard(), p0);
    }
    public SimpleLiveCard clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SimpleLiveCard mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
