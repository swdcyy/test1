package com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo extends MessageNano	// class@0013ac
{
    public long displayTime;
    public long giftId;
    public static LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo[] _emptyArray;

    public void LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo(){
       super();
       this.clear();
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo[] emptyArray(){
       if (LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo._emptyArray == null) {
             LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo[] liveTreasure = new LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo[0];
             LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo._emptyArray = liveTreasure;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo._emptyArray;
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo().mergeFrom(p0);
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo(), p0);
    }
    public LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo clear(){
       this.displayTime = 0;
       this.giftId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo tdisplayTime = this.displayTime;
       int i1 = 0;
       if (tdisplayTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tdisplayTime);
       }
       tdisplayTime = this.giftId;
       if (tdisplayTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tdisplayTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo mergeFrom(CodedInputByteBufferNano p0){
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
                this.giftId = p0.readUInt64();
             }
          }else {
             this.displayTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo tdisplayTime = this.displayTime;
       int i = 0;
       if (tdisplayTime - i) {
          p0.writeUInt64(1, tdisplayTime);
       }
       tdisplayTime = this.giftId;
       if (tdisplayTime - i) {
          p0.writeUInt64(2, tdisplayTime);
       }
       super.writeTo(p0);
       return;
    }
}
