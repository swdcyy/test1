package com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMicSeats;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveVoicePartyPkOpMicSeats extends MessageNano	// class@001450
{
    public String liveStreamId;
    public LiveStreamMessages$MicSeatDetailInfo[] micSeatDetailInfo;
    public String pkId;
    public String voicePartyId;
    public static SCLiveVoicePartyPkOpMicSeats[] _emptyArray;

    public void SCLiveVoicePartyPkOpMicSeats(){
       super();
       this.clear();
    }
    public static SCLiveVoicePartyPkOpMicSeats[] emptyArray(){
       if (SCLiveVoicePartyPkOpMicSeats._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveVoicePartyPkOpMicSeats._emptyArray == null) {
             SCLiveVoicePartyPkOpMicSeats[] sCLiveVoiceP = new SCLiveVoicePartyPkOpMicSeats[0];
             SCLiveVoicePartyPkOpMicSeats._emptyArray = sCLiveVoiceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveVoicePartyPkOpMicSeats._emptyArray;
    }
    public static SCLiveVoicePartyPkOpMicSeats parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveVoicePartyPkOpMicSeats().mergeFrom(p0);
    }
    public static SCLiveVoicePartyPkOpMicSeats parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveVoicePartyPkOpMicSeats(), p0);
    }
    public SCLiveVoicePartyPkOpMicSeats clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.pkId = "";
       this.micSeatDetailInfo = LiveStreamMessages$MicSeatDetailInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.pkId);
       }
       SCLiveVoicePartyPkOpMicSeats tmicSeatDeta = this.micSeatDetailInfo;
       if (tmicSeatDeta != null && tmicSeatDeta.length > 0) {
          int i1 = 0;
          SCLiveVoicePartyPkOpMicSeats tmicSeatDeta1 = this.micSeatDetailInfo;
          while (i1 < tmicSeatDeta1.length) {
             object oobject = tmicSeatDeta1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveVoicePartyPkOpMicSeats mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   int i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      SCLiveVoicePartyPkOpMicSeats tmicSeatDeta = this.micSeatDetailInfo;
                      int i2 = (tmicSeatDeta == null)? 0: tmicSeatDeta.length;
                      i = i + i2;
                      LiveStreamMessages$MicSeatDetailInfo[] micSeatDetai = new LiveStreamMessages$MicSeatDetailInfo[i];
                      if (i2) {
                         System.arraycopy(tmicSeatDeta, 0, micSeatDetai, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         micSeatDetai[i2] = new LiveStreamMessages$MicSeatDetailInfo();
                         p0.readMessage(micSeatDetai[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      micSeatDetai[i2] = new LiveStreamMessages$MicSeatDetailInfo();
                      p0.readMessage(micSeatDetai[i2]);
                      this.micSeatDetailInfo = micSeatDetai;
                   }
                }else {
                   this.pkId = p0.readString();
                }
             }else {
                this.voicePartyId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(2, this.voicePartyId);
       }
       if (!(this.pkId).equals(str)) {
          p0.writeString(3, this.pkId);
       }
       SCLiveVoicePartyPkOpMicSeats tmicSeatDeta = this.micSeatDetailInfo;
       if (tmicSeatDeta != null && tmicSeatDeta.length > 0) {
          int i = 0;
          SCLiveVoicePartyPkOpMicSeats tmicSeatDeta1 = this.micSeatDetailInfo;
          while (i < tmicSeatDeta1.length) {
             object oobject = tmicSeatDeta1[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
