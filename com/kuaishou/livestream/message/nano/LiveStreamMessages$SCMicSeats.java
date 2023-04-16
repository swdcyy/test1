package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCMicSeats;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$SCMicSeats extends MessageNano	// class@001355
{
    public LiveStreamMessages$MicSeatInfo[] micSeatInfo;
    public long time;
    public String voicePartyId;
    public static LiveStreamMessages$SCMicSeats[] _emptyArray;

    public void LiveStreamMessages$SCMicSeats(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCMicSeats[] emptyArray(){
       if (LiveStreamMessages$SCMicSeats._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCMicSeats._emptyArray == null) {
             LiveStreamMessages$SCMicSeats[] sCMicSeatsAr = new LiveStreamMessages$SCMicSeats[0];
             LiveStreamMessages$SCMicSeats._emptyArray = sCMicSeatsAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCMicSeats._emptyArray;
    }
    public static LiveStreamMessages$SCMicSeats parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCMicSeats().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCMicSeats parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCMicSeats(), p0);
    }
    public LiveStreamMessages$SCMicSeats clear(){
       this.time = 0;
       this.voicePartyId = "";
       this.micSeatInfo = LiveStreamMessages$MicSeatInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCMicSeats ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       if (!(this.voicePartyId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       ttime = this.micSeatInfo;
       if (ttime != null && ttime.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCMicSeats tmicSeatInfo = this.micSeatInfo;
          while (i1 < tmicSeatInfo.length) {
             object oobject = tmicSeatInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCMicSeats mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveStreamMessages$SCMicSeats tmicSeatInfo = this.micSeatInfo;
                   int i2 = (tmicSeatInfo == null)? 0: tmicSeatInfo.length;
                   i = i + i2;
                   LiveStreamMessages$MicSeatInfo[] micSeatInfoA = new LiveStreamMessages$MicSeatInfo[i];
                   if (i2) {
                      System.arraycopy(tmicSeatInfo, 0, micSeatInfoA, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      micSeatInfoA[i2] = new LiveStreamMessages$MicSeatInfo();
                      p0.readMessage(micSeatInfoA[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   micSeatInfoA[i2] = new LiveStreamMessages$MicSeatInfo();
                   p0.readMessage(micSeatInfoA[i2]);
                   this.micSeatInfo = micSeatInfoA;
                }
             }else {
                this.voicePartyId = p0.readString();
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCMicSeats ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       if (!(this.voicePartyId).equals("")) {
          p0.writeString(2, this.voicePartyId);
       }
       ttime = this.micSeatInfo;
       if (ttime != null && ttime.length > 0) {
          int i = 0;
          LiveStreamMessages$SCMicSeats tmicSeatInfo = this.micSeatInfo;
          while (i < tmicSeatInfo.length) {
             object oobject = tmicSeatInfo[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
