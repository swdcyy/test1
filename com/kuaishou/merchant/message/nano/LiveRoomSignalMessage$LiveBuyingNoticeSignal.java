package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveBuyingNoticeSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$LiveBuyingNoticeSignal extends MessageNano	// class@001c53
{
    public String bulletText;
    public static LiveRoomSignalMessage$LiveBuyingNoticeSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveBuyingNoticeSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveBuyingNoticeSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveBuyingNoticeSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveBuyingNoticeSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveBuyingNoticeSignal[] liveBuyingNo = new LiveRoomSignalMessage$LiveBuyingNoticeSignal[0];
             LiveRoomSignalMessage$LiveBuyingNoticeSignal._emptyArray = liveBuyingNo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveBuyingNoticeSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveBuyingNoticeSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveBuyingNoticeSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveBuyingNoticeSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveBuyingNoticeSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveBuyingNoticeSignal clear(){
       this.bulletText = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.bulletText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.bulletText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveBuyingNoticeSignal mergeFrom(CodedInputByteBufferNano p0){
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
             this.bulletText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.bulletText).equals("")) {
          p0.writeString(1, this.bulletText);
       }
       super.writeTo(p0);
       return;
    }
}
