package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveActiveSpeakersMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class LiveFlvStream$LiveActiveSpeakersMessage extends MessageNano	// class@000c61
{
    public String[] activeSpeakers;
    public static LiveFlvStream$LiveActiveSpeakersMessage[] _emptyArray;

    public void LiveFlvStream$LiveActiveSpeakersMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveActiveSpeakersMessage[] emptyArray(){
       if (LiveFlvStream$LiveActiveSpeakersMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveActiveSpeakersMessage._emptyArray == null) {
             LiveFlvStream$LiveActiveSpeakersMessage[] liveActiveSp = new LiveFlvStream$LiveActiveSpeakersMessage[0];
             LiveFlvStream$LiveActiveSpeakersMessage._emptyArray = liveActiveSp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveActiveSpeakersMessage._emptyArray;
    }
    public static LiveFlvStream$LiveActiveSpeakersMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveActiveSpeakersMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveActiveSpeakersMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveActiveSpeakersMessage(), p0);
    }
    public LiveFlvStream$LiveActiveSpeakersMessage clear(){
       this.activeSpeakers = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveActiveSpeakersMessage tactiveSpeak = this.activeSpeakers;
       if (tactiveSpeak != null && tactiveSpeak.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          LiveFlvStream$LiveActiveSpeakersMessage tactiveSpeak1 = this.activeSpeakers;
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
    public LiveFlvStream$LiveActiveSpeakersMessage mergeFrom(CodedInputByteBufferNano p0){
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
             LiveFlvStream$LiveActiveSpeakersMessage tactiveSpeak = this.activeSpeakers;
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
       LiveFlvStream$LiveActiveSpeakersMessage tactiveSpeak = this.activeSpeakers;
       if (tactiveSpeak != null && tactiveSpeak.length > 0) {
          int i = 0;
          LiveFlvStream$LiveActiveSpeakersMessage tactiveSpeak1 = this.activeSpeakers;
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
