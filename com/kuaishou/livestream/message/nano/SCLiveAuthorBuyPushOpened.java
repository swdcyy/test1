package com.kuaishou.livestream.message.nano.SCLiveAuthorBuyPushOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveAuthorBuyPushOpened extends MessageNano	// class@001411
{
    public String liveStreamId;
    public String orderId;
    public static SCLiveAuthorBuyPushOpened[] _emptyArray;

    public void SCLiveAuthorBuyPushOpened(){
       super();
       this.clear();
    }
    public static SCLiveAuthorBuyPushOpened[] emptyArray(){
       if (SCLiveAuthorBuyPushOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAuthorBuyPushOpened._emptyArray == null) {
             SCLiveAuthorBuyPushOpened[] sCLiveAuthor = new SCLiveAuthorBuyPushOpened[0];
             SCLiveAuthorBuyPushOpened._emptyArray = sCLiveAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAuthorBuyPushOpened._emptyArray;
    }
    public static SCLiveAuthorBuyPushOpened parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAuthorBuyPushOpened().mergeFrom(p0);
    }
    public static SCLiveAuthorBuyPushOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAuthorBuyPushOpened(), p0);
    }
    public SCLiveAuthorBuyPushOpened clear(){
       this.liveStreamId = "";
       this.orderId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.orderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.orderId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAuthorBuyPushOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.orderId = p0.readString();
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
       if (!(this.orderId).equals(str)) {
          p0.writeString(2, this.orderId);
       }
       super.writeTo(p0);
       return;
    }
}
