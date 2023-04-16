package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveItemPriceChangeSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;

public final class LiveRoomSignalMessage$LiveItemPriceChangeSignal extends MessageNano	// class@001c56
{
    public int displayIntervalMillis;
    public LiveRoomSignalMessage$ItemInfo itemInfo;
    public String popTitle;
    public static LiveRoomSignalMessage$LiveItemPriceChangeSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveItemPriceChangeSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveItemPriceChangeSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveItemPriceChangeSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveItemPriceChangeSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveItemPriceChangeSignal[] liveItemPric = new LiveRoomSignalMessage$LiveItemPriceChangeSignal[0];
             LiveRoomSignalMessage$LiveItemPriceChangeSignal._emptyArray = liveItemPric;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveItemPriceChangeSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveItemPriceChangeSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveItemPriceChangeSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveItemPriceChangeSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveItemPriceChangeSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveItemPriceChangeSignal clear(){
       this.itemInfo = null;
       this.displayIntervalMillis = 0;
       this.popTitle = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$LiveItemPriceChangeSignal titemInfo = this.itemInfo;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, titemInfo);
       }
       titemInfo = this.displayIntervalMillis;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, titemInfo);
       }
       if (!(this.popTitle).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.popTitle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveItemPriceChangeSignal mergeFrom(CodedInputByteBufferNano p0){
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
                   this.popTitle = p0.readString();
                }
             }else {
                this.displayIntervalMillis = p0.readUInt32();
             }
          }else if(this.itemInfo == null){
             this.itemInfo = new LiveRoomSignalMessage$ItemInfo();
          }
          p0.readMessage(this.itemInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$LiveItemPriceChangeSignal titemInfo = this.itemInfo;
       if (titemInfo != null) {
          p0.writeMessage(1, titemInfo);
       }
       titemInfo = this.displayIntervalMillis;
       if (titemInfo != null) {
          p0.writeUInt32(2, titemInfo);
       }
       if (!(this.popTitle).equals("")) {
          p0.writeString(3, this.popTitle);
       }
       super.writeTo(p0);
       return;
    }
}
