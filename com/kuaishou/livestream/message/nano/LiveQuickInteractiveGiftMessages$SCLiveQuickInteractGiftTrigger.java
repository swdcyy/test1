package com.kuaishou.livestream.message.nano.LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger extends MessageNano	// class@001261
{
    public long expireTimestamp;
    public long triggerTime;
    public int triggerType;
    public static LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger[] _emptyArray;

    public void LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger(){
       super();
       this.clear();
    }
    public static LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger[] emptyArray(){
       if (LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger._emptyArray == null) {
             LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger[] sCLiveQuickI = new LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger[0];
             LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger._emptyArray = sCLiveQuickI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger._emptyArray;
    }
    public static LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger().mergeFrom(p0);
    }
    public static LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger(), p0);
    }
    public LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger clear(){
       this.triggerType = 0;
       this.triggerTime = 0;
       this.expireTimestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger ttriggerType = this.triggerType;
       if (ttriggerType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttriggerType);
       }
       ttriggerType = this.triggerTime;
       int i1 = 0;
       if (ttriggerType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttriggerType);
       }
       ttriggerType = this.expireTimestamp;
       if (ttriggerType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttriggerType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger mergeFrom(CodedInputByteBufferNano p0){
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
                   this.expireTimestamp = p0.readUInt64();
                }
             }else {
                this.triggerTime = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                continue ;
             }else {
                this.triggerType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger ttriggerType = this.triggerType;
       if (ttriggerType != null) {
          p0.writeInt32(1, ttriggerType);
       }
       ttriggerType = this.triggerTime;
       int i = 0;
       if (ttriggerType - i) {
          p0.writeUInt64(2, ttriggerType);
       }
       ttriggerType = this.expireTimestamp;
       if (ttriggerType - i) {
          p0.writeUInt64(3, ttriggerType);
       }
       super.writeTo(p0);
       return;
    }
}
