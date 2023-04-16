package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LivePendantItemInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemReservationInfo;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;

public final class LiveRoomSignalMessage$LivePendantItemInfo extends MessageNano	// class@001c5a
{
    public String buttonText;
    public LiveRoomSignalMessage$ItemInfo itemInfo;
    public LiveRoomSignalMessage$ItemReservationInfo reservationInfo;
    public Map staticStyle;
    public static LiveRoomSignalMessage$LivePendantItemInfo[] _emptyArray;

    public void LiveRoomSignalMessage$LivePendantItemInfo(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LivePendantItemInfo[] emptyArray(){
       if (LiveRoomSignalMessage$LivePendantItemInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LivePendantItemInfo._emptyArray == null) {
             LiveRoomSignalMessage$LivePendantItemInfo[] livePendantI = new LiveRoomSignalMessage$LivePendantItemInfo[0];
             LiveRoomSignalMessage$LivePendantItemInfo._emptyArray = livePendantI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LivePendantItemInfo._emptyArray;
    }
    public static LiveRoomSignalMessage$LivePendantItemInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LivePendantItemInfo().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LivePendantItemInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LivePendantItemInfo(), p0);
    }
    public LiveRoomSignalMessage$LivePendantItemInfo clear(){
       this.itemInfo = null;
       this.reservationInfo = null;
       this.buttonText = "";
       this.staticStyle = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$LivePendantItemInfo titemInfo = this.itemInfo;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, titemInfo);
       }
       titemInfo = this.reservationInfo;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, titemInfo);
       }
       if (!(this.buttonText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.buttonText);
       }
       titemInfo = this.staticStyle;
       if (titemInfo != null) {
          i = i + InternalNano.computeMapFieldSize(titemInfo, 4, 9, 9);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LivePendantItemInfo mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.staticStyle = InternalNano.mergeMapEntry(p0, this.staticStyle, mapFactory, 9, 9, null, 10, 18);
                   }
                }else {
                   this.buttonText = p0.readString();
                }
             }else if(this.reservationInfo == null){
                this.reservationInfo = new LiveRoomSignalMessage$ItemReservationInfo();
             }
             p0.readMessage(this.reservationInfo);
          }else if(this.itemInfo == null){
             this.itemInfo = new LiveRoomSignalMessage$ItemInfo();
          }
          p0.readMessage(this.itemInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$LivePendantItemInfo titemInfo = this.itemInfo;
       if (titemInfo != null) {
          p0.writeMessage(1, titemInfo);
       }
       titemInfo = this.reservationInfo;
       if (titemInfo != null) {
          p0.writeMessage(2, titemInfo);
       }
       if (!(this.buttonText).equals("")) {
          p0.writeString(3, this.buttonText);
       }
       titemInfo = this.staticStyle;
       if (titemInfo != null) {
          InternalNano.serializeMapField(p0, titemInfo, 4, 9, 9);
       }
       super.writeTo(p0);
       return;
    }
}
