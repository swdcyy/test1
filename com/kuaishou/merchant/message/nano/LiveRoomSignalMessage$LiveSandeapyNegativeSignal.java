package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveSandeapyNegativeSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$LiveSandeapyNegativeSignal extends MessageNano	// class@001c61
{
    public String itemId;
    public static LiveRoomSignalMessage$LiveSandeapyNegativeSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveSandeapyNegativeSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveSandeapyNegativeSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveSandeapyNegativeSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveSandeapyNegativeSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveSandeapyNegativeSignal[] liveSandeapy = new LiveRoomSignalMessage$LiveSandeapyNegativeSignal[0];
             LiveRoomSignalMessage$LiveSandeapyNegativeSignal._emptyArray = liveSandeapy;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveSandeapyNegativeSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveSandeapyNegativeSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveSandeapyNegativeSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveSandeapyNegativeSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveSandeapyNegativeSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveSandeapyNegativeSignal clear(){
       this.itemId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.itemId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.itemId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveSandeapyNegativeSignal mergeFrom(CodedInputByteBufferNano p0){
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
             this.itemId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.itemId).equals("")) {
          p0.writeString(1, this.itemId);
       }
       super.writeTo(p0);
       return;
    }
}
