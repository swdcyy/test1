package com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage extends MessageNano	// class@000c32
{
    public String bizId;
    public String data;
    public static LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage[] _emptyArray;

    public void LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage(){
       super();
       this.clear();
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage[] emptyArray(){
       if (LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage._emptyArray == null) {
             LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage[] liveAryaBroa = new LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage[0];
             LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage._emptyArray = liveAryaBroa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage._emptyArray;
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage().mergeFrom(p0);
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage(), p0);
    }
    public LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage clear(){
       this.bizId = "";
       this.data = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.bizId);
       }
       if (!(this.data).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.data);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAryaBroadcastProto$LiveAryaBroadcastInteractiveMagicFaceMessage mergeFrom(CodedInputByteBufferNano p0){
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
                this.data = p0.readString();
             }
          }else {
             this.bizId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.bizId).equals(str)) {
          p0.writeString(1, this.bizId);
       }
       if (!(this.data).equals(str)) {
          p0.writeString(2, this.data);
       }
       super.writeTo(p0);
       return;
    }
}
