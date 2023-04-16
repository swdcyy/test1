package com.kuaishou.livestream.message.nano.SCLiveRePushStopPushPopup;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveRePushStopPushPopup extends MessageNano	// class@001439
{
    public long countdownMs;
    public String newDeviceId;
    public String text;
    public static SCLiveRePushStopPushPopup[] _emptyArray;

    public void SCLiveRePushStopPushPopup(){
       super();
       this.clear();
    }
    public static SCLiveRePushStopPushPopup[] emptyArray(){
       if (SCLiveRePushStopPushPopup._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveRePushStopPushPopup._emptyArray == null) {
             SCLiveRePushStopPushPopup[] sCLiveRePush = new SCLiveRePushStopPushPopup[0];
             SCLiveRePushStopPushPopup._emptyArray = sCLiveRePush;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveRePushStopPushPopup._emptyArray;
    }
    public static SCLiveRePushStopPushPopup parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveRePushStopPushPopup().mergeFrom(p0);
    }
    public static SCLiveRePushStopPushPopup parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveRePushStopPushPopup(), p0);
    }
    public SCLiveRePushStopPushPopup clear(){
       this.newDeviceId = "";
       this.countdownMs = 0;
       this.text = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.newDeviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.newDeviceId);
       }
       SCLiveRePushStopPushPopup tcountdownMs = this.countdownMs;
       if (tcountdownMs) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcountdownMs);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.text);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveRePushStopPushPopup mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.text = p0.readString();
                }
             }else {
                this.countdownMs = p0.readUInt64();
             }
          }else {
             this.newDeviceId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.newDeviceId).equals(str)) {
          p0.writeString(1, this.newDeviceId);
       }
       SCLiveRePushStopPushPopup tcountdownMs = this.countdownMs;
       if (tcountdownMs) {
          p0.writeUInt64(2, tcountdownMs);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(3, this.text);
       }
       super.writeTo(p0);
       return;
    }
}
