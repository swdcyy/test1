package com.kuaishou.protobuf.livestream.nano.SCLiveConditionAudienceRedPackUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveConditionAudienceRedPackUpdateInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class SCLiveConditionAudienceRedPackUpdate extends MessageNano	// class@000d47
{
    public LiveConditionAudienceRedPackUpdateInfo[] audienceRedPackUpdateInfo;
    public static SCLiveConditionAudienceRedPackUpdate[] _emptyArray;

    public void SCLiveConditionAudienceRedPackUpdate(){
       super();
       this.clear();
    }
    public static SCLiveConditionAudienceRedPackUpdate[] emptyArray(){
       if (SCLiveConditionAudienceRedPackUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveConditionAudienceRedPackUpdate._emptyArray == null) {
             SCLiveConditionAudienceRedPackUpdate[] sCLiveCondit = new SCLiveConditionAudienceRedPackUpdate[0];
             SCLiveConditionAudienceRedPackUpdate._emptyArray = sCLiveCondit;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveConditionAudienceRedPackUpdate._emptyArray;
    }
    public static SCLiveConditionAudienceRedPackUpdate parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveConditionAudienceRedPackUpdate().mergeFrom(p0);
    }
    public static SCLiveConditionAudienceRedPackUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveConditionAudienceRedPackUpdate(), p0);
    }
    public SCLiveConditionAudienceRedPackUpdate clear(){
       this.audienceRedPackUpdateInfo = LiveConditionAudienceRedPackUpdateInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveConditionAudienceRedPackUpdate taudienceRed = this.audienceRedPackUpdateInfo;
       if (taudienceRed != null && taudienceRed.length > 0) {
          int i1 = 0;
          SCLiveConditionAudienceRedPackUpdate taudienceRed1 = this.audienceRedPackUpdateInfo;
          while (i1 < taudienceRed1.length) {
             object oobject = taudienceRed1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveConditionAudienceRedPackUpdate mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             SCLiveConditionAudienceRedPackUpdate taudienceRed = this.audienceRedPackUpdateInfo;
             int i2 = (taudienceRed == null)? 0: taudienceRed.length;
             i = i + i2;
             LiveConditionAudienceRedPackUpdateInfo[] liveConditio = new LiveConditionAudienceRedPackUpdateInfo[i];
             if (i2) {
                System.arraycopy(taudienceRed, 0, liveConditio, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveConditio[i2] = new LiveConditionAudienceRedPackUpdateInfo();
                p0.readMessage(liveConditio[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveConditio[i2] = new LiveConditionAudienceRedPackUpdateInfo();
             p0.readMessage(liveConditio[i2]);
             this.audienceRedPackUpdateInfo = liveConditio;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveConditionAudienceRedPackUpdate taudienceRed = this.audienceRedPackUpdateInfo;
       if (taudienceRed != null && taudienceRed.length > 0) {
          int i = 0;
          SCLiveConditionAudienceRedPackUpdate taudienceRed1 = this.audienceRedPackUpdateInfo;
          while (i < taudienceRed1.length) {
             object oobject = taudienceRed1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}