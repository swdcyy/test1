package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatUserApplyOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveChatUserApplyOpened extends MessageNano	// class@001342
{
    public int currentSettings;
    public long time;
    public static LiveStreamMessages$SCLiveChatUserApplyOpened[] _emptyArray;

    public void LiveStreamMessages$SCLiveChatUserApplyOpened(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveChatUserApplyOpened[] emptyArray(){
       if (LiveStreamMessages$SCLiveChatUserApplyOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveChatUserApplyOpened._emptyArray == null) {
             LiveStreamMessages$SCLiveChatUserApplyOpened[] sCLiveChatUs = new LiveStreamMessages$SCLiveChatUserApplyOpened[0];
             LiveStreamMessages$SCLiveChatUserApplyOpened._emptyArray = sCLiveChatUs;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveChatUserApplyOpened._emptyArray;
    }
    public static LiveStreamMessages$SCLiveChatUserApplyOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveChatUserApplyOpened().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveChatUserApplyOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveChatUserApplyOpened(), p0);
    }
    public LiveStreamMessages$SCLiveChatUserApplyOpened clear(){
       this.time = 0;
       this.currentSettings = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveChatUserApplyOpened ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.currentSettings;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveChatUserApplyOpened mergeFrom(CodedInputByteBufferNano p0){
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
                this.currentSettings = p0.readUInt32();
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCLiveChatUserApplyOpened ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.currentSettings;
       if (ttime != null) {
          p0.writeUInt32(2, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
