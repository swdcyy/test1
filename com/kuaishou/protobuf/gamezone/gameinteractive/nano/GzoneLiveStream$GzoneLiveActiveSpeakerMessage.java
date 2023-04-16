package com.kuaishou.protobuf.gamezone.gameinteractive.nano.GzoneLiveStream$GzoneLiveActiveSpeakerMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class GzoneLiveStream$GzoneLiveActiveSpeakerMessage extends MessageNano	// class@000bab
{
    public String[] activeSpeakers;
    public static GzoneLiveStream$GzoneLiveActiveSpeakerMessage[] _emptyArray;

    public void GzoneLiveStream$GzoneLiveActiveSpeakerMessage(){
       super();
       this.clear();
    }
    public static GzoneLiveStream$GzoneLiveActiveSpeakerMessage[] emptyArray(){
       if (GzoneLiveStream$GzoneLiveActiveSpeakerMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneLiveStream$GzoneLiveActiveSpeakerMessage._emptyArray == null) {
             GzoneLiveStream$GzoneLiveActiveSpeakerMessage[] gzoneLiveAct = new GzoneLiveStream$GzoneLiveActiveSpeakerMessage[0];
             GzoneLiveStream$GzoneLiveActiveSpeakerMessage._emptyArray = gzoneLiveAct;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneLiveStream$GzoneLiveActiveSpeakerMessage._emptyArray;
    }
    public static GzoneLiveStream$GzoneLiveActiveSpeakerMessage parseFrom(CodedInputByteBufferNano p0){
       return new GzoneLiveStream$GzoneLiveActiveSpeakerMessage().mergeFrom(p0);
    }
    public static GzoneLiveStream$GzoneLiveActiveSpeakerMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneLiveStream$GzoneLiveActiveSpeakerMessage(), p0);
    }
    public GzoneLiveStream$GzoneLiveActiveSpeakerMessage clear(){
       this.activeSpeakers = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GzoneLiveStream$GzoneLiveActiveSpeakerMessage tactiveSpeak = this.activeSpeakers;
       if (tactiveSpeak != null && tactiveSpeak.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          GzoneLiveStream$GzoneLiveActiveSpeakerMessage tactiveSpeak1 = this.activeSpeakers;
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
    public GzoneLiveStream$GzoneLiveActiveSpeakerMessage mergeFrom(CodedInputByteBufferNano p0){
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
             GzoneLiveStream$GzoneLiveActiveSpeakerMessage tactiveSpeak = this.activeSpeakers;
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
       GzoneLiveStream$GzoneLiveActiveSpeakerMessage tactiveSpeak = this.activeSpeakers;
       if (tactiveSpeak != null && tactiveSpeak.length > 0) {
          int i = 0;
          GzoneLiveStream$GzoneLiveActiveSpeakerMessage tactiveSpeak1 = this.activeSpeakers;
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
