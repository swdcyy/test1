package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveSandeapyItemStatusSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$LiveSandeapyItemStatusSignal extends MessageNano	// class@001c60
{
    public String itemId;
    public int status;
    public static LiveRoomSignalMessage$LiveSandeapyItemStatusSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveSandeapyItemStatusSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveSandeapyItemStatusSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveSandeapyItemStatusSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveSandeapyItemStatusSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveSandeapyItemStatusSignal[] liveSandeapy = new LiveRoomSignalMessage$LiveSandeapyItemStatusSignal[0];
             LiveRoomSignalMessage$LiveSandeapyItemStatusSignal._emptyArray = liveSandeapy;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveSandeapyItemStatusSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveSandeapyItemStatusSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveSandeapyItemStatusSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveSandeapyItemStatusSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveSandeapyItemStatusSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveSandeapyItemStatusSignal clear(){
       this.itemId = "";
       this.status = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.itemId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.itemId);
       }
       LiveRoomSignalMessage$LiveSandeapyItemStatusSignal tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveSandeapyItemStatusSignal mergeFrom(CodedInputByteBufferNano p0){
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
                this.status = p0.readUInt32();
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
       LiveRoomSignalMessage$LiveSandeapyItemStatusSignal tstatus = this.status;
       if (tstatus != null) {
          p0.writeUInt32(2, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
