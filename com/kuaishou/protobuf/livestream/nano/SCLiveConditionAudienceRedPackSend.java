package com.kuaishou.protobuf.livestream.nano.SCLiveConditionAudienceRedPackSend;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveConditionAudienceRedPackSendInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class SCLiveConditionAudienceRedPackSend extends MessageNano	// class@000d46
{
    public LiveConditionAudienceRedPackSendInfo[] audienceRedPackSendInfo;
    public static SCLiveConditionAudienceRedPackSend[] _emptyArray;

    public void SCLiveConditionAudienceRedPackSend(){
       super();
       this.clear();
    }
    public static SCLiveConditionAudienceRedPackSend[] emptyArray(){
       if (SCLiveConditionAudienceRedPackSend._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveConditionAudienceRedPackSend._emptyArray == null) {
             SCLiveConditionAudienceRedPackSend[] sCLiveCondit = new SCLiveConditionAudienceRedPackSend[0];
             SCLiveConditionAudienceRedPackSend._emptyArray = sCLiveCondit;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveConditionAudienceRedPackSend._emptyArray;
    }
    public static SCLiveConditionAudienceRedPackSend parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveConditionAudienceRedPackSend().mergeFrom(p0);
    }
    public static SCLiveConditionAudienceRedPackSend parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveConditionAudienceRedPackSend(), p0);
    }
    public SCLiveConditionAudienceRedPackSend clear(){
       this.audienceRedPackSendInfo = LiveConditionAudienceRedPackSendInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveConditionAudienceRedPackSend taudienceRed = this.audienceRedPackSendInfo;
       if (taudienceRed != null && taudienceRed.length > 0) {
          int i1 = 0;
          SCLiveConditionAudienceRedPackSend taudienceRed1 = this.audienceRedPackSendInfo;
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
    public SCLiveConditionAudienceRedPackSend mergeFrom(CodedInputByteBufferNano p0){
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
             SCLiveConditionAudienceRedPackSend taudienceRed = this.audienceRedPackSendInfo;
             int i2 = (taudienceRed == null)? 0: taudienceRed.length;
             i = i + i2;
             LiveConditionAudienceRedPackSendInfo[] liveConditio = new LiveConditionAudienceRedPackSendInfo[i];
             if (i2) {
                System.arraycopy(taudienceRed, 0, liveConditio, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveConditio[i2] = new LiveConditionAudienceRedPackSendInfo();
                p0.readMessage(liveConditio[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveConditio[i2] = new LiveConditionAudienceRedPackSendInfo();
             p0.readMessage(liveConditio[i2]);
             this.audienceRedPackSendInfo = liveConditio;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveConditionAudienceRedPackSend taudienceRed = this.audienceRedPackSendInfo;
       if (taudienceRed != null && taudienceRed.length > 0) {
          int i = 0;
          SCLiveConditionAudienceRedPackSend taudienceRed1 = this.audienceRedPackSendInfo;
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
