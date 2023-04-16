package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCMicSeatsApplyInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatsUserApplyInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.KtvMusicOrderStatisticsInfo;
import java.lang.System;

public final class LiveStreamMessages$SCMicSeatsApplyInfo extends MessageNano	// class@001356
{
    public long applyCount;
    public String displayApplyCount;
    public String liveStreamId;
    public LiveStreamMessages$MicSeatsUserApplyInfo[] micSeatsUserApplyInfo;
    public KtvMusicOrderStatisticsInfo musicOrderStatisticsInfo;
    public long time;
    public String voicePartyId;
    public static LiveStreamMessages$SCMicSeatsApplyInfo[] _emptyArray;

    public void LiveStreamMessages$SCMicSeatsApplyInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCMicSeatsApplyInfo[] emptyArray(){
       if (LiveStreamMessages$SCMicSeatsApplyInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCMicSeatsApplyInfo._emptyArray == null) {
             LiveStreamMessages$SCMicSeatsApplyInfo[] sCMicSeatsAp = new LiveStreamMessages$SCMicSeatsApplyInfo[0];
             LiveStreamMessages$SCMicSeatsApplyInfo._emptyArray = sCMicSeatsAp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCMicSeatsApplyInfo._emptyArray;
    }
    public static LiveStreamMessages$SCMicSeatsApplyInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCMicSeatsApplyInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCMicSeatsApplyInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCMicSeatsApplyInfo(), p0);
    }
    public LiveStreamMessages$SCMicSeatsApplyInfo clear(){
       this.time = 0;
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.applyCount = 0;
       this.displayApplyCount = "";
       this.micSeatsUserApplyInfo = LiveStreamMessages$MicSeatsUserApplyInfo.emptyArray();
       this.musicOrderStatisticsInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCMicSeatsApplyInfo ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.voicePartyId);
       }
       LiveStreamMessages$SCMicSeatsApplyInfo tapplyCount = this.applyCount;
       if (tapplyCount - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tapplyCount);
       }
       if (!(this.displayApplyCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.displayApplyCount);
       }
       ttime = this.micSeatsUserApplyInfo;
       if (ttime != null && ttime.length > 0) {
          int i2 = 0;
          LiveStreamMessages$SCMicSeatsApplyInfo tmicSeatsUse = this.micSeatsUserApplyInfo;
          while (i2 < tmicSeatsUse.length) {
             object oobject = tmicSeatsUse[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttime = this.musicOrderStatisticsInfo;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCMicSeatsApplyInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         int i1 = 50;
                         if (i != i1) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else if(this.musicOrderStatisticsInfo == null){
                               this.musicOrderStatisticsInfo = new KtvMusicOrderStatisticsInfo();
                            }
                            p0.readMessage(this.musicOrderStatisticsInfo);
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            LiveStreamMessages$SCMicSeatsApplyInfo tmicSeatsUse = this.micSeatsUserApplyInfo;
                            int i2 = (tmicSeatsUse == null)? 0: tmicSeatsUse.length;
                            i = i + i2;
                            LiveStreamMessages$MicSeatsUserApplyInfo[] micSeatsUser = new LiveStreamMessages$MicSeatsUserApplyInfo[i];
                            if (i2) {
                               System.arraycopy(tmicSeatsUse, 0, micSeatsUser, 0, i2);
                            }
                            i1 = i - 1;
                            while (i2 < i1) {
                               micSeatsUser[i2] = new LiveStreamMessages$MicSeatsUserApplyInfo();
                               p0.readMessage(micSeatsUser[i2]);
                               p0.readTag();
                               i2 = i2 + 1;
                            }
                            micSeatsUser[i2] = new LiveStreamMessages$MicSeatsUserApplyInfo();
                            p0.readMessage(micSeatsUser[i2]);
                            this.micSeatsUserApplyInfo = micSeatsUser;
                         }
                      }else {
                         this.displayApplyCount = p0.readString();
                      }
                   }else {
                      this.applyCount = p0.readUInt64();
                   }
                }else {
                   this.voicePartyId = p0.readString();
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCMicSeatsApplyInfo ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(1, ttime);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(3, this.voicePartyId);
       }
       LiveStreamMessages$SCMicSeatsApplyInfo tapplyCount = this.applyCount;
       if (tapplyCount - i) {
          p0.writeUInt64(4, tapplyCount);
       }
       if (!(this.displayApplyCount).equals(str)) {
          p0.writeString(5, this.displayApplyCount);
       }
       ttime = this.micSeatsUserApplyInfo;
       if (ttime != null && ttime.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCMicSeatsApplyInfo tmicSeatsUse = this.micSeatsUserApplyInfo;
          while (i1 < tmicSeatsUse.length) {
             object oobject = tmicSeatsUse[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttime = this.musicOrderStatisticsInfo;
       if (ttime != null) {
          p0.writeMessage(7, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
