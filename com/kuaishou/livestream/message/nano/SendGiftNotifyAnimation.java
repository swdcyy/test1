package com.kuaishou.livestream.message.nano.SendGiftNotifyAnimation;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SendGiftNotifyAnimation extends MessageNano	// class@00146f
{
    public String liveStreamId;
    public static SendGiftNotifyAnimation[] _emptyArray;

    public void SendGiftNotifyAnimation(){
       super();
       this.clear();
    }
    public static SendGiftNotifyAnimation[] emptyArray(){
       if (SendGiftNotifyAnimation._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SendGiftNotifyAnimation._emptyArray == null) {
             SendGiftNotifyAnimation[] sendGiftNoti = new SendGiftNotifyAnimation[0];
             SendGiftNotifyAnimation._emptyArray = sendGiftNoti;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SendGiftNotifyAnimation._emptyArray;
    }
    public static SendGiftNotifyAnimation parseFrom(CodedInputByteBufferNano p0){
       return new SendGiftNotifyAnimation().mergeFrom(p0);
    }
    public static SendGiftNotifyAnimation parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SendGiftNotifyAnimation(), p0);
    }
    public SendGiftNotifyAnimation clear(){
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SendGiftNotifyAnimation mergeFrom(CodedInputByteBufferNano p0){
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
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(1, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
