package com.kuaishou.livestream.message.nano.LiveStreamMessages$EnterRoomShareInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$EnterRoomShareInfo extends MessageNano	// class@0012d3
{
    public boolean isFromFansGroupShare;
    public boolean shareUserHasFollowed;
    public long shareUserId;
    public static LiveStreamMessages$EnterRoomShareInfo[] _emptyArray;

    public void LiveStreamMessages$EnterRoomShareInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$EnterRoomShareInfo[] emptyArray(){
       if (LiveStreamMessages$EnterRoomShareInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$EnterRoomShareInfo._emptyArray == null) {
             LiveStreamMessages$EnterRoomShareInfo[] uEnterRoomSh = new LiveStreamMessages$EnterRoomShareInfo[0];
             LiveStreamMessages$EnterRoomShareInfo._emptyArray = uEnterRoomSh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$EnterRoomShareInfo._emptyArray;
    }
    public static LiveStreamMessages$EnterRoomShareInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$EnterRoomShareInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$EnterRoomShareInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$EnterRoomShareInfo(), p0);
    }
    public LiveStreamMessages$EnterRoomShareInfo clear(){
       this.shareUserId = 0;
       this.shareUserHasFollowed = false;
       this.isFromFansGroupShare = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$EnterRoomShareInfo tshareUserId = this.shareUserId;
       if (tshareUserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tshareUserId);
       }
       tshareUserId = this.shareUserHasFollowed;
       if (tshareUserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tshareUserId);
       }
       tshareUserId = this.isFromFansGroupShare;
       if (tshareUserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tshareUserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$EnterRoomShareInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.isFromFansGroupShare = p0.readBool();
                }
             }else {
                this.shareUserHasFollowed = p0.readBool();
             }
          }else {
             this.shareUserId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$EnterRoomShareInfo tshareUserId = this.shareUserId;
       if (tshareUserId) {
          p0.writeUInt64(1, tshareUserId);
       }
       tshareUserId = this.shareUserHasFollowed;
       if (tshareUserId != null) {
          p0.writeBool(2, tshareUserId);
       }
       tshareUserId = this.isFromFansGroupShare;
       if (tshareUserId != null) {
          p0.writeBool(3, tshareUserId);
       }
       super.writeTo(p0);
       return;
    }
}
