package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvVoicePartyMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class LiveFlvStream$LiveFlvVoicePartyMessage extends MessageNano	// class@000c77
{
    public String[] activeSpeakers;
    public static LiveFlvStream$LiveFlvVoicePartyMessage[] _emptyArray;

    public void LiveFlvStream$LiveFlvVoicePartyMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFlvVoicePartyMessage[] emptyArray(){
       if (LiveFlvStream$LiveFlvVoicePartyMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFlvVoicePartyMessage._emptyArray == null) {
             LiveFlvStream$LiveFlvVoicePartyMessage[] liveFlvVoice = new LiveFlvStream$LiveFlvVoicePartyMessage[0];
             LiveFlvStream$LiveFlvVoicePartyMessage._emptyArray = liveFlvVoice;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFlvVoicePartyMessage._emptyArray;
    }
    public static LiveFlvStream$LiveFlvVoicePartyMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFlvVoicePartyMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFlvVoicePartyMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFlvVoicePartyMessage(), p0);
    }
    public LiveFlvStream$LiveFlvVoicePartyMessage clear(){
       this.activeSpeakers = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveFlvVoicePartyMessage tactiveSpeak = this.activeSpeakers;
       if (tactiveSpeak != null && tactiveSpeak.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          LiveFlvStream$LiveFlvVoicePartyMessage tactiveSpeak1 = this.activeSpeakers;
          while (i1 < tactiveSpeak1.length) {
             object oobject = tactiveSpeak1[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveFlvVoicePartyMessage mergeFrom(CodedInputByteBufferNano p0){
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
             LiveFlvStream$LiveFlvVoicePartyMessage tactiveSpeak = this.activeSpeakers;
             int i2 = (tactiveSpeak == null)? 0: tactiveSpeak.length;
             i = i + i2;
             String[] stringArray = new String[i];
             if (i2) {
                System.arraycopy(tactiveSpeak, 0, stringArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                stringArray[i2] = p0.readString();
                p0.readTag();
                i2 = i2 + 1;
             }
             stringArray[i2] = p0.readString();
             this.activeSpeakers = stringArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveFlvVoicePartyMessage tactiveSpeak = this.activeSpeakers;
       if (tactiveSpeak != null && tactiveSpeak.length > 0) {
          int i = 0;
          LiveFlvStream$LiveFlvVoicePartyMessage tactiveSpeak1 = this.activeSpeakers;
          while (i < tactiveSpeak1.length) {
             object oobject = tactiveSpeak1[i];
             if (oobject != null) {
                p0.writeString(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
