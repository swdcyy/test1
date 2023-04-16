package com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatsApplyInfo;
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

public final class LiveStreamMessages$MicSeatsApplyInfo extends MessageNano	// class@001304
{
    public long applyCount;
    public String displayApplyCount;
    public LiveStreamMessages$MicSeatsUserApplyInfo[] micSeatsUserApplyInfo;
    public KtvMusicOrderStatisticsInfo musicOrderStatisticsInfo;
    public static LiveStreamMessages$MicSeatsApplyInfo[] _emptyArray;

    public void LiveStreamMessages$MicSeatsApplyInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$MicSeatsApplyInfo[] emptyArray(){
       if (LiveStreamMessages$MicSeatsApplyInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$MicSeatsApplyInfo._emptyArray == null) {
             LiveStreamMessages$MicSeatsApplyInfo[] micSeatsAppl = new LiveStreamMessages$MicSeatsApplyInfo[0];
             LiveStreamMessages$MicSeatsApplyInfo._emptyArray = micSeatsAppl;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$MicSeatsApplyInfo._emptyArray;
    }
    public static LiveStreamMessages$MicSeatsApplyInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$MicSeatsApplyInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$MicSeatsApplyInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$MicSeatsApplyInfo(), p0);
    }
    public LiveStreamMessages$MicSeatsApplyInfo clear(){
       this.applyCount = 0;
       this.displayApplyCount = "";
       this.micSeatsUserApplyInfo = LiveStreamMessages$MicSeatsUserApplyInfo.emptyArray();
       this.musicOrderStatisticsInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$MicSeatsApplyInfo tapplyCount = this.applyCount;
       if (tapplyCount) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tapplyCount);
       }
       if (!(this.displayApplyCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.displayApplyCount);
       }
       tapplyCount = this.micSeatsUserApplyInfo;
       if (tapplyCount != null && tapplyCount.length > 0) {
          int i1 = 0;
          LiveStreamMessages$MicSeatsApplyInfo tmicSeatsUse = this.micSeatsUserApplyInfo;
          while (i1 < tmicSeatsUse.length) {
             object oobject = tmicSeatsUse[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tapplyCount = this.musicOrderStatisticsInfo;
       if (tapplyCount != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tapplyCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$MicSeatsApplyInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else if(this.musicOrderStatisticsInfo == null){
                      this.musicOrderStatisticsInfo = new KtvMusicOrderStatisticsInfo();
                   }
                   p0.readMessage(this.musicOrderStatisticsInfo);
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveStreamMessages$MicSeatsApplyInfo tmicSeatsUse = this.micSeatsUserApplyInfo;
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
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$MicSeatsApplyInfo tapplyCount = this.applyCount;
       if (tapplyCount) {
          p0.writeUInt64(1, tapplyCount);
       }
       if (!(this.displayApplyCount).equals("")) {
          p0.writeString(2, this.displayApplyCount);
       }
       tapplyCount = this.micSeatsUserApplyInfo;
       if (tapplyCount != null && tapplyCount.length > 0) {
          int i = 0;
          LiveStreamMessages$MicSeatsApplyInfo tmicSeatsUse = this.micSeatsUserApplyInfo;
          while (i < tmicSeatsUse.length) {
             object oobject = tmicSeatsUse[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       tapplyCount = this.musicOrderStatisticsInfo;
       if (tapplyCount != null) {
          p0.writeMessage(4, tapplyCount);
       }
       super.writeTo(p0);
       return;
    }
}
