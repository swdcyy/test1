package com.kuaishou.protobuf.gamezone.gameinteractive.nano.MicSeatsInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.gamezone.gameinteractive.nano.MicSeatDetailInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class MicSeatsInfo extends MessageNano	// class@000bb4
{
    public String liveStreamId;
    public MicSeatDetailInfo[] micSeatDetailInfo;
    public int micSeatsVersion;
    public long timestamp;
    public String voicePartyId;
    public static MicSeatsInfo[] _emptyArray;

    public void MicSeatsInfo(){
       super();
       this.clear();
    }
    public static MicSeatsInfo[] emptyArray(){
       if (MicSeatsInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MicSeatsInfo._emptyArray == null) {
             MicSeatsInfo[] micSeatsInfo = new MicSeatsInfo[0];
             MicSeatsInfo._emptyArray = micSeatsInfo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MicSeatsInfo._emptyArray;
    }
    public static MicSeatsInfo parseFrom(CodedInputByteBufferNano p0){
       return new MicSeatsInfo().mergeFrom(p0);
    }
    public static MicSeatsInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MicSeatsInfo(), p0);
    }
    public MicSeatsInfo clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.micSeatDetailInfo = MicSeatDetailInfo.emptyArray();
       this.micSeatsVersion = 0;
       this.timestamp = 0;
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
       MicSeatsInfo tmicSeatDeta = this.micSeatDetailInfo;
       if (tmicSeatDeta != null && tmicSeatDeta.length > 0) {
          int i1 = 0;
          MicSeatsInfo tmicSeatDeta1 = this.micSeatDetailInfo;
          while (i1 < tmicSeatDeta1.length) {
             object oobject = tmicSeatDeta1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tmicSeatDeta = this.micSeatsVersion;
       if (tmicSeatDeta != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tmicSeatDeta);
       }
       tmicSeatDeta = this.timestamp;
       if (tmicSeatDeta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tmicSeatDeta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MicSeatsInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.micSeatsVersion = p0.readUInt32();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   MicSeatsInfo tmicSeatDeta = this.micSeatDetailInfo;
                   int i2 = (tmicSeatDeta == null)? 0: tmicSeatDeta.length;
                   i = i + i2;
                   MicSeatDetailInfo[] micSeatDetai = new MicSeatDetailInfo[i];
                   if (i2) {
                      System.arraycopy(tmicSeatDeta, 0, micSeatDetai, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      micSeatDetai[i2] = new MicSeatDetailInfo();
                      p0.readMessage(micSeatDetai[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   micSeatDetai[i2] = new MicSeatDetailInfo();
                   p0.readMessage(micSeatDetai[i2]);
                   this.micSeatDetailInfo = micSeatDetai;
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
       MicSeatsInfo tmicSeatDeta = this.micSeatDetailInfo;
       if (tmicSeatDeta != null && tmicSeatDeta.length > 0) {
          int i = 0;
          MicSeatsInfo tmicSeatDeta1 = this.micSeatDetailInfo;
          while (i < tmicSeatDeta1.length) {
             object oobject = tmicSeatDeta1[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       tmicSeatDeta = this.micSeatsVersion;
       if (tmicSeatDeta != null) {
          p0.writeUInt32(4, tmicSeatDeta);
       }
       tmicSeatDeta = this.timestamp;
       if (tmicSeatDeta) {
          p0.writeUInt64(5, tmicSeatDeta);
       }
       super.writeTo(p0);
       return;
    }
}
