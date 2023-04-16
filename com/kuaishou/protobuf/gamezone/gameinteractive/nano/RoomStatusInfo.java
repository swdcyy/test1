package com.kuaishou.protobuf.gamezone.gameinteractive.nano.RoomStatusInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class RoomStatusInfo extends MessageNano	// class@000bba
{
    public String liveStreamId;
    public long maxDelayTime;
    public int status;
    public long timestamp;
    public static RoomStatusInfo[] _emptyArray;

    public void RoomStatusInfo(){
       super();
       this.clear();
    }
    public static RoomStatusInfo[] emptyArray(){
       if (RoomStatusInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (RoomStatusInfo._emptyArray == null) {
             RoomStatusInfo[] roomStatusIn = new RoomStatusInfo[0];
             RoomStatusInfo._emptyArray = roomStatusIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return RoomStatusInfo._emptyArray;
    }
    public static RoomStatusInfo parseFrom(CodedInputByteBufferNano p0){
       return new RoomStatusInfo().mergeFrom(p0);
    }
    public static RoomStatusInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new RoomStatusInfo(), p0);
    }
    public RoomStatusInfo clear(){
       this.liveStreamId = "";
       this.status = 0;
       this.timestamp = 0;
       this.maxDelayTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       RoomStatusInfo tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstatus);
       }
       tstatus = this.timestamp;
       int i1 = 0;
       if (tstatus - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tstatus);
       }
       tstatus = this.maxDelayTime;
       if (tstatus - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public RoomStatusInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.maxDelayTime = p0.readUInt64();
                   }
                }else {
                   this.timestamp = p0.readUInt64();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.status = i;
                }
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(1, this.liveStreamId);
       }
       RoomStatusInfo tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(2, tstatus);
       }
       tstatus = this.timestamp;
       int i = 0;
       if (tstatus - i) {
          p0.writeUInt64(3, tstatus);
       }
       tstatus = this.maxDelayTime;
       if (tstatus - i) {
          p0.writeUInt64(4, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
