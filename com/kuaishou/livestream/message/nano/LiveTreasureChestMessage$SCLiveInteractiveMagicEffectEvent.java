package com.kuaishou.livestream.message.nano.LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent extends MessageNano	// class@0013bb
{
    public String bizId;
    public String data;
    public int effectEventType;
    public long serverTime;
    public static LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent[] _emptyArray;

    public void LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent(){
       super();
       this.clear();
    }
    public static LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent[] emptyArray(){
       if (LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent._emptyArray == null) {
             LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent[] sCLiveIntera = new LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent[0];
             LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent._emptyArray = sCLiveIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent._emptyArray;
    }
    public static LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent().mergeFrom(p0);
    }
    public static LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent(), p0);
    }
    public LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent clear(){
       this.bizId = "";
       this.effectEventType = 0;
       this.data = "";
       this.serverTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.bizId);
       }
       LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent teffectEvent = this.effectEventType;
       if (teffectEvent != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, teffectEvent);
       }
       if (!(this.data).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.data);
       }
       teffectEvent = this.serverTime;
       if (teffectEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, teffectEvent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.serverTime = p0.readUInt64();
                   }
                }else {
                   this.data = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.effectEventType = i;
                }
             }
          }else {
             this.bizId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.bizId).equals(str)) {
          p0.writeString(1, this.bizId);
       }
       LiveTreasureChestMessage$SCLiveInteractiveMagicEffectEvent teffectEvent = this.effectEventType;
       if (teffectEvent != null) {
          p0.writeInt32(2, teffectEvent);
       }
       if (!(this.data).equals(str)) {
          p0.writeString(3, this.data);
       }
       teffectEvent = this.serverTime;
       if (teffectEvent) {
          p0.writeUInt64(4, teffectEvent);
       }
       super.writeTo(p0);
       return;
    }
}
