package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveMerchantWakeupMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveMerchantWakeupMessage extends MessageNano	// class@000c7b
{
    public boolean isTrueWakeup;
    public String liveStreamId;
    public String sessionId;
    public static LiveFlvStream$LiveMerchantWakeupMessage[] _emptyArray;

    public void LiveFlvStream$LiveMerchantWakeupMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveMerchantWakeupMessage[] emptyArray(){
       if (LiveFlvStream$LiveMerchantWakeupMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveMerchantWakeupMessage._emptyArray == null) {
             LiveFlvStream$LiveMerchantWakeupMessage[] liveMerchant = new LiveFlvStream$LiveMerchantWakeupMessage[0];
             LiveFlvStream$LiveMerchantWakeupMessage._emptyArray = liveMerchant;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveMerchantWakeupMessage._emptyArray;
    }
    public static LiveFlvStream$LiveMerchantWakeupMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveMerchantWakeupMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveMerchantWakeupMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveMerchantWakeupMessage(), p0);
    }
    public LiveFlvStream$LiveMerchantWakeupMessage clear(){
       this.liveStreamId = "";
       this.sessionId = "";
       this.isTrueWakeup = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.sessionId);
       }
       LiveFlvStream$LiveMerchantWakeupMessage tisTrueWakeu = this.isTrueWakeup;
       if (tisTrueWakeu != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tisTrueWakeu);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveMerchantWakeupMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.isTrueWakeup = p0.readBool();
                }
             }else {
                this.sessionId = p0.readString();
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
       if (!(this.sessionId).equals(str)) {
          p0.writeString(2, this.sessionId);
       }
       LiveFlvStream$LiveMerchantWakeupMessage tisTrueWakeu = this.isTrueWakeup;
       if (tisTrueWakeu != null) {
          p0.writeBool(3, tisTrueWakeu);
       }
       super.writeTo(p0);
       return;
    }
}
