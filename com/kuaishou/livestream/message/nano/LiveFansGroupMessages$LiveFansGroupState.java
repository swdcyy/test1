package com.kuaishou.livestream.message.nano.LiveFansGroupMessages$LiveFansGroupState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFansGroupMessages$LiveFansGroupState extends MessageNano	// class@0011ac
{
    public int enterRoomSpecialEffect;
    public int intimacyLevel;
    public static LiveFansGroupMessages$LiveFansGroupState[] _emptyArray;

    public void LiveFansGroupMessages$LiveFansGroupState(){
       super();
       this.clear();
    }
    public static LiveFansGroupMessages$LiveFansGroupState[] emptyArray(){
       if (LiveFansGroupMessages$LiveFansGroupState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFansGroupMessages$LiveFansGroupState._emptyArray == null) {
             LiveFansGroupMessages$LiveFansGroupState[] liveFansGrou = new LiveFansGroupMessages$LiveFansGroupState[0];
             LiveFansGroupMessages$LiveFansGroupState._emptyArray = liveFansGrou;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFansGroupMessages$LiveFansGroupState._emptyArray;
    }
    public static LiveFansGroupMessages$LiveFansGroupState parseFrom(CodedInputByteBufferNano p0){
       return new LiveFansGroupMessages$LiveFansGroupState().mergeFrom(p0);
    }
    public static LiveFansGroupMessages$LiveFansGroupState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFansGroupMessages$LiveFansGroupState(), p0);
    }
    public LiveFansGroupMessages$LiveFansGroupState clear(){
       this.intimacyLevel = 0;
       this.enterRoomSpecialEffect = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFansGroupMessages$LiveFansGroupState tintimacyLev = this.intimacyLevel;
       if (tintimacyLev != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tintimacyLev);
       }
       tintimacyLev = this.enterRoomSpecialEffect;
       if (tintimacyLev != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tintimacyLev);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFansGroupMessages$LiveFansGroupState mergeFrom(CodedInputByteBufferNano p0){
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
                this.enterRoomSpecialEffect = p0.readUInt32();
             }
          }else {
             this.intimacyLevel = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFansGroupMessages$LiveFansGroupState tintimacyLev = this.intimacyLevel;
       if (tintimacyLev != null) {
          p0.writeUInt32(1, tintimacyLev);
       }
       tintimacyLev = this.enterRoomSpecialEffect;
       if (tintimacyLev != null) {
          p0.writeUInt32(2, tintimacyLev);
       }
       super.writeTo(p0);
       return;
    }
}
