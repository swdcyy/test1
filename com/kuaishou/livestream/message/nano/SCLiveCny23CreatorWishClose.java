package com.kuaishou.livestream.message.nano.SCLiveCny23CreatorWishClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveCny23CreatorWishClose extends MessageNano	// class@001413
{
    public static SCLiveCny23CreatorWishClose[] _emptyArray;

    public void SCLiveCny23CreatorWishClose(){
       super();
       this.clear();
    }
    public static SCLiveCny23CreatorWishClose[] emptyArray(){
       if (SCLiveCny23CreatorWishClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveCny23CreatorWishClose._emptyArray == null) {
             SCLiveCny23CreatorWishClose[] sCLiveCny23C = new SCLiveCny23CreatorWishClose[0];
             SCLiveCny23CreatorWishClose._emptyArray = sCLiveCny23C;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveCny23CreatorWishClose._emptyArray;
    }
    public static SCLiveCny23CreatorWishClose parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveCny23CreatorWishClose().mergeFrom(p0);
    }
    public static SCLiveCny23CreatorWishClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveCny23CreatorWishClose(), p0);
    }
    public SCLiveCny23CreatorWishClose clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveCny23CreatorWishClose mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
