package com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveVoicePartyPkEnd extends MessageNano	// class@00144d
{
    public long endByAuthorId;
    public int endType;
    public LiveStreamMessages$MicSeatDetailInfo[] micSeatDetailInfo;
    public int micSeatsVersion;
    public String pkId;
    public long time;
    public static SCLiveVoicePartyPkEnd[] _emptyArray;

    public void SCLiveVoicePartyPkEnd(){
       super();
       this.clear();
    }
    public static SCLiveVoicePartyPkEnd[] emptyArray(){
       if (SCLiveVoicePartyPkEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveVoicePartyPkEnd._emptyArray == null) {
             SCLiveVoicePartyPkEnd[] sCLiveVoiceP = new SCLiveVoicePartyPkEnd[0];
             SCLiveVoicePartyPkEnd._emptyArray = sCLiveVoiceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveVoicePartyPkEnd._emptyArray;
    }
    public static SCLiveVoicePartyPkEnd parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveVoicePartyPkEnd().mergeFrom(p0);
    }
    public static SCLiveVoicePartyPkEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveVoicePartyPkEnd(), p0);
    }
    public SCLiveVoicePartyPkEnd clear(){
       this.pkId = "";
       this.time = 0;
       this.endType = 0;
       this.endByAuthorId = 0;
       this.micSeatDetailInfo = LiveStreamMessages$MicSeatDetailInfo.emptyArray();
       this.micSeatsVersion = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       SCLiveVoicePartyPkEnd ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       ttime = this.endType;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ttime);
       }
       ttime = this.endByAuthorId;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       ttime = this.micSeatDetailInfo;
       if (ttime != null && ttime.length > 0) {
          int i2 = 0;
          SCLiveVoicePartyPkEnd tmicSeatDeta = this.micSeatDetailInfo;
          while (i2 < tmicSeatDeta.length) {
             object oobject = tmicSeatDeta[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttime = this.micSeatsVersion;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveVoicePartyPkEnd mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 40) {
                      int i1 = 50;
                      if (i != i1) {
                         if (i != 56) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.micSeatsVersion = p0.readUInt32();
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         SCLiveVoicePartyPkEnd tmicSeatDeta = this.micSeatDetailInfo;
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
                      this.endByAuthorId = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   switch (i){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                       case 8:
                       case 9:
                       case 1:
                         break;
                       default:
                   }
                   this.endType = i;
                }
             }else {
                this.time = p0.readUInt64();
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       SCLiveVoicePartyPkEnd ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(2, ttime);
       }
       ttime = this.endType;
       if (ttime != null) {
          p0.writeInt32(3, ttime);
       }
       ttime = this.endByAuthorId;
       if (ttime - i) {
          p0.writeUInt64(5, ttime);
       }
       ttime = this.micSeatDetailInfo;
       if (ttime != null && ttime.length > 0) {
          int i1 = 0;
          SCLiveVoicePartyPkEnd tmicSeatDeta = this.micSeatDetailInfo;
          while (i1 < tmicSeatDeta.length) {
             object oobject = tmicSeatDeta[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttime = this.micSeatsVersion;
       if (ttime != null) {
          p0.writeUInt32(7, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
