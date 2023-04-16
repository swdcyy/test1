package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart extends MessageNano	// class@001115
{
    public String liveStreamId;
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser[] servingUser;
    public String sessionId;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart clear(){
       this.liveStreamId = "";
       this.sessionId = "";
       this.servingUser = LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.sessionId);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart tservingUser = this.servingUser;
       if (tservingUser != null && tservingUser.length > 0) {
          int i1 = 0;
          LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart tservingUser1 = this.servingUser;
          while (i1 < tservingUser1.length) {
             object oobject = tservingUser1[i1];
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
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart tservingUser = this.servingUser;
                   int i2 = (tservingUser == null)? 0: tservingUser.length;
                   i = i + i2;
                   LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser[i];
                   if (i2) {
                      System.arraycopy(tservingUser, 0, sCLiveBlindD, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      sCLiveBlindD[i2] = new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser();
                      p0.readMessage(sCLiveBlindD[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   sCLiveBlindD[i2] = new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser();
                   p0.readMessage(sCLiveBlindD[i2]);
                   this.servingUser = sCLiveBlindD;
                }
             }else {
                this.sessionId = p0.readString();
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
       if (!(this.sessionId).equals(str)) {
          p0.writeString(2, this.sessionId);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart tservingUser = this.servingUser;
       if (tservingUser != null && tservingUser.length > 0) {
          int i = 0;
          LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart tservingUser1 = this.servingUser;
          while (i < tservingUser1.length) {
             object oobject = tservingUser1[i];
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
