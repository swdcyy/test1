package com.kuaishou.protobuf.livestream.nano.LiveMultiPkRoomInfoExtraInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkStatistic;

public final class LiveMultiPkRoomInfoExtraInfo extends MessageNano	// class@000cc6
{
    public SCLiveMultiPkStatistic multiPkStatistic;
    public long roomOwnerId;
    public static LiveMultiPkRoomInfoExtraInfo[] _emptyArray;

    public void LiveMultiPkRoomInfoExtraInfo(){
       super();
       this.clear();
    }
    public static LiveMultiPkRoomInfoExtraInfo[] emptyArray(){
       if (LiveMultiPkRoomInfoExtraInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkRoomInfoExtraInfo._emptyArray == null) {
             LiveMultiPkRoomInfoExtraInfo[] liveMultiPkR = new LiveMultiPkRoomInfoExtraInfo[0];
             LiveMultiPkRoomInfoExtraInfo._emptyArray = liveMultiPkR;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkRoomInfoExtraInfo._emptyArray;
    }
    public static LiveMultiPkRoomInfoExtraInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkRoomInfoExtraInfo().mergeFrom(p0);
    }
    public static LiveMultiPkRoomInfoExtraInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkRoomInfoExtraInfo(), p0);
    }
    public LiveMultiPkRoomInfoExtraInfo clear(){
       this.multiPkStatistic = null;
       this.roomOwnerId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkRoomInfoExtraInfo tmultiPkStat = this.multiPkStatistic;
       if (tmultiPkStat != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tmultiPkStat);
       }
       tmultiPkStat = this.roomOwnerId;
       if (tmultiPkStat) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tmultiPkStat);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkRoomInfoExtraInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.roomOwnerId = p0.readUInt64();
             }
          }else if(this.multiPkStatistic == null){
             this.multiPkStatistic = new SCLiveMultiPkStatistic();
          }
          p0.readMessage(this.multiPkStatistic);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkRoomInfoExtraInfo tmultiPkStat = this.multiPkStatistic;
       if (tmultiPkStat != null) {
          p0.writeMessage(1, tmultiPkStat);
       }
       tmultiPkStat = this.roomOwnerId;
       if (tmultiPkStat) {
          p0.writeUInt64(2, tmultiPkStat);
       }
       super.writeTo(p0);
       return;
    }
}
