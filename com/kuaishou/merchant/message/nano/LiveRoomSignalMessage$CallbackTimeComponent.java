package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$CallbackTimeComponent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$CallbackTimeComponent extends MessageNano	// class@001c44
{
    public long timeMills;
    public int type;
    public static LiveRoomSignalMessage$CallbackTimeComponent[] _emptyArray;

    public void LiveRoomSignalMessage$CallbackTimeComponent(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$CallbackTimeComponent[] emptyArray(){
       if (LiveRoomSignalMessage$CallbackTimeComponent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$CallbackTimeComponent._emptyArray == null) {
             LiveRoomSignalMessage$CallbackTimeComponent[] uCallbackTim = new LiveRoomSignalMessage$CallbackTimeComponent[0];
             LiveRoomSignalMessage$CallbackTimeComponent._emptyArray = uCallbackTim;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$CallbackTimeComponent._emptyArray;
    }
    public static LiveRoomSignalMessage$CallbackTimeComponent parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$CallbackTimeComponent().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$CallbackTimeComponent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$CallbackTimeComponent(), p0);
    }
    public LiveRoomSignalMessage$CallbackTimeComponent clear(){
       this.type = 0;
       this.timeMills = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$CallbackTimeComponent ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ttype);
       }
       ttype = this.timeMills;
       if (ttype) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$CallbackTimeComponent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.timeMills = p0.readUInt64();
             }
          }else {
             this.type = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$CallbackTimeComponent ttype = this.type;
       if (ttype != null) {
          p0.writeUInt32(1, ttype);
       }
       ttype = this.timeMills;
       if (ttype) {
          p0.writeUInt64(2, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
