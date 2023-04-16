package com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefreshRoomVipInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveGiftPanelRefreshRoomVipInfo extends MessageNano	// class@001423
{
    public long requestMaxDelayMills;
    public static SCLiveGiftPanelRefreshRoomVipInfo[] _emptyArray;

    public void SCLiveGiftPanelRefreshRoomVipInfo(){
       super();
       this.clear();
    }
    public static SCLiveGiftPanelRefreshRoomVipInfo[] emptyArray(){
       if (SCLiveGiftPanelRefreshRoomVipInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveGiftPanelRefreshRoomVipInfo._emptyArray == null) {
             SCLiveGiftPanelRefreshRoomVipInfo[] sCLiveGiftPa = new SCLiveGiftPanelRefreshRoomVipInfo[0];
             SCLiveGiftPanelRefreshRoomVipInfo._emptyArray = sCLiveGiftPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveGiftPanelRefreshRoomVipInfo._emptyArray;
    }
    public static SCLiveGiftPanelRefreshRoomVipInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveGiftPanelRefreshRoomVipInfo().mergeFrom(p0);
    }
    public static SCLiveGiftPanelRefreshRoomVipInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveGiftPanelRefreshRoomVipInfo(), p0);
    }
    public SCLiveGiftPanelRefreshRoomVipInfo clear(){
       this.requestMaxDelayMills = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveGiftPanelRefreshRoomVipInfo trequestMaxD = this.requestMaxDelayMills;
       if (trequestMaxD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, trequestMaxD);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveGiftPanelRefreshRoomVipInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.requestMaxDelayMills = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveGiftPanelRefreshRoomVipInfo trequestMaxD = this.requestMaxDelayMills;
       if (trequestMaxD) {
          p0.writeUInt64(1, trequestMaxD);
       }
       super.writeTo(p0);
       return;
    }
}
