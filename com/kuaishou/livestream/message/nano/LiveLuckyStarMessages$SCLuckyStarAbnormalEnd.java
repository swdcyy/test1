package com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarAbnormalEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveLuckyStarMessages$SCLuckyStarAbnormalEnd extends MessageNano	// class@0011f4
{
    public String endReason;
    public int endType;
    public String luckyStarId;
    public static LiveLuckyStarMessages$SCLuckyStarAbnormalEnd[] _emptyArray;

    public void LiveLuckyStarMessages$SCLuckyStarAbnormalEnd(){
       super();
       this.clear();
    }
    public static LiveLuckyStarMessages$SCLuckyStarAbnormalEnd[] emptyArray(){
       if (LiveLuckyStarMessages$SCLuckyStarAbnormalEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLuckyStarMessages$SCLuckyStarAbnormalEnd._emptyArray == null) {
             LiveLuckyStarMessages$SCLuckyStarAbnormalEnd[] sCLuckyStarA = new LiveLuckyStarMessages$SCLuckyStarAbnormalEnd[0];
             LiveLuckyStarMessages$SCLuckyStarAbnormalEnd._emptyArray = sCLuckyStarA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLuckyStarMessages$SCLuckyStarAbnormalEnd._emptyArray;
    }
    public static LiveLuckyStarMessages$SCLuckyStarAbnormalEnd parseFrom(CodedInputByteBufferNano p0){
       return new LiveLuckyStarMessages$SCLuckyStarAbnormalEnd().mergeFrom(p0);
    }
    public static LiveLuckyStarMessages$SCLuckyStarAbnormalEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLuckyStarMessages$SCLuckyStarAbnormalEnd(), p0);
    }
    public LiveLuckyStarMessages$SCLuckyStarAbnormalEnd clear(){
       this.luckyStarId = "";
       this.endType = 0;
       this.endReason = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.luckyStarId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.luckyStarId);
       }
       LiveLuckyStarMessages$SCLuckyStarAbnormalEnd tendType = this.endType;
       if (tendType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tendType);
       }
       if (!(this.endReason).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.endReason);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLuckyStarMessages$SCLuckyStarAbnormalEnd mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.endReason = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.endType = i;
                }
             }
          }else {
             this.luckyStarId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.luckyStarId).equals(str)) {
          p0.writeString(1, this.luckyStarId);
       }
       LiveLuckyStarMessages$SCLuckyStarAbnormalEnd tendType = this.endType;
       if (tendType != null) {
          p0.writeInt32(2, tendType);
       }
       if (!(this.endReason).equals(str)) {
          p0.writeString(3, this.endReason);
       }
       super.writeTo(p0);
       return;
    }
}
