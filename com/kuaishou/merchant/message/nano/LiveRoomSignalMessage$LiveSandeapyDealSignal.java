package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveSandeapyDealSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$LiveSandeapyDealSignal extends MessageNano	// class@001c5e
{
    public String itemId;
    public String jumpUrl;
    public String message;
    public static LiveRoomSignalMessage$LiveSandeapyDealSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveSandeapyDealSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveSandeapyDealSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveSandeapyDealSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveSandeapyDealSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveSandeapyDealSignal[] liveSandeapy = new LiveRoomSignalMessage$LiveSandeapyDealSignal[0];
             LiveRoomSignalMessage$LiveSandeapyDealSignal._emptyArray = liveSandeapy;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveSandeapyDealSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveSandeapyDealSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveSandeapyDealSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveSandeapyDealSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveSandeapyDealSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveSandeapyDealSignal clear(){
       this.message = "";
       this.itemId = "";
       this.jumpUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.message).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.message);
       }
       if (!(this.itemId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.itemId);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.jumpUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveSandeapyDealSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.jumpUrl = p0.readString();
                }
             }else {
                this.itemId = p0.readString();
             }
          }else {
             this.message = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.message).equals(str)) {
          p0.writeString(1, this.message);
       }
       if (!(this.itemId).equals(str)) {
          p0.writeString(2, this.itemId);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(3, this.jumpUrl);
       }
       super.writeTo(p0);
       return;
    }
}
