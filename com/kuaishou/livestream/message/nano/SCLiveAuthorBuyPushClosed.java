package com.kuaishou.livestream.message.nano.SCLiveAuthorBuyPushClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveAuthorBuyPushClosed extends MessageNano	// class@001410
{
    public static SCLiveAuthorBuyPushClosed[] _emptyArray;

    public void SCLiveAuthorBuyPushClosed(){
       super();
       this.clear();
    }
    public static SCLiveAuthorBuyPushClosed[] emptyArray(){
       if (SCLiveAuthorBuyPushClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAuthorBuyPushClosed._emptyArray == null) {
             SCLiveAuthorBuyPushClosed[] sCLiveAuthor = new SCLiveAuthorBuyPushClosed[0];
             SCLiveAuthorBuyPushClosed._emptyArray = sCLiveAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAuthorBuyPushClosed._emptyArray;
    }
    public static SCLiveAuthorBuyPushClosed parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAuthorBuyPushClosed().mergeFrom(p0);
    }
    public static SCLiveAuthorBuyPushClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAuthorBuyPushClosed(), p0);
    }
    public SCLiveAuthorBuyPushClosed clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAuthorBuyPushClosed mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
