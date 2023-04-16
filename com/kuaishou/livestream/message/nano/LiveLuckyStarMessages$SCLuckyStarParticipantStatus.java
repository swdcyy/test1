package com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarParticipantStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveLuckyStarMessages$SCLuckyStarParticipantStatus extends MessageNano	// class@0011f7
{
    public String displayText;
    public String luckyStarId;
    public int status;
    public static LiveLuckyStarMessages$SCLuckyStarParticipantStatus[] _emptyArray;

    public void LiveLuckyStarMessages$SCLuckyStarParticipantStatus(){
       super();
       this.clear();
    }
    public static LiveLuckyStarMessages$SCLuckyStarParticipantStatus[] emptyArray(){
       if (LiveLuckyStarMessages$SCLuckyStarParticipantStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLuckyStarMessages$SCLuckyStarParticipantStatus._emptyArray == null) {
             LiveLuckyStarMessages$SCLuckyStarParticipantStatus[] sCLuckyStarP = new LiveLuckyStarMessages$SCLuckyStarParticipantStatus[0];
             LiveLuckyStarMessages$SCLuckyStarParticipantStatus._emptyArray = sCLuckyStarP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLuckyStarMessages$SCLuckyStarParticipantStatus._emptyArray;
    }
    public static LiveLuckyStarMessages$SCLuckyStarParticipantStatus parseFrom(CodedInputByteBufferNano p0){
       return new LiveLuckyStarMessages$SCLuckyStarParticipantStatus().mergeFrom(p0);
    }
    public static LiveLuckyStarMessages$SCLuckyStarParticipantStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLuckyStarMessages$SCLuckyStarParticipantStatus(), p0);
    }
    public LiveLuckyStarMessages$SCLuckyStarParticipantStatus clear(){
       this.status = 0;
       this.displayText = "";
       this.luckyStarId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveLuckyStarMessages$SCLuckyStarParticipantStatus tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tstatus);
       }
       String str = "";
       if (!(this.displayText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.displayText);
       }
       if (!(this.luckyStarId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.luckyStarId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLuckyStarMessages$SCLuckyStarParticipantStatus mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.luckyStarId = p0.readString();
                }
             }else {
                this.displayText = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.status = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveLuckyStarMessages$SCLuckyStarParticipantStatus tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(1, tstatus);
       }
       String str = "";
       if (!(this.displayText).equals(str)) {
          p0.writeString(2, this.displayText);
       }
       if (!(this.luckyStarId).equals(str)) {
          p0.writeString(3, this.luckyStarId);
       }
       super.writeTo(p0);
       return;
    }
}
