package com.kuaishou.livestream.message.nano.LivePkMessages$SCLivePkState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkPlayerState;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePkMessages$SCLivePkState extends MessageNano	// class@001224
{
    public String pkId;
    public LivePkMessages$PkPlayerState[] playerState;
    public static LivePkMessages$SCLivePkState[] _emptyArray;

    public void LivePkMessages$SCLivePkState(){
       super();
       this.clear();
    }
    public static LivePkMessages$SCLivePkState[] emptyArray(){
       if (LivePkMessages$SCLivePkState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$SCLivePkState._emptyArray == null) {
             LivePkMessages$SCLivePkState[] sCLivePkStat = new LivePkMessages$SCLivePkState[0];
             LivePkMessages$SCLivePkState._emptyArray = sCLivePkStat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$SCLivePkState._emptyArray;
    }
    public static LivePkMessages$SCLivePkState parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$SCLivePkState().mergeFrom(p0);
    }
    public static LivePkMessages$SCLivePkState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$SCLivePkState(), p0);
    }
    public LivePkMessages$SCLivePkState clear(){
       this.pkId = "";
       this.playerState = LivePkMessages$PkPlayerState.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LivePkMessages$SCLivePkState tplayerState = this.playerState;
       if (tplayerState != null && tplayerState.length > 0) {
          int i1 = 0;
          LivePkMessages$SCLivePkState tplayerState1 = this.playerState;
          while (i1 < tplayerState1.length) {
             object oobject = tplayerState1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$SCLivePkState mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LivePkMessages$SCLivePkState tplayerState = this.playerState;
                int i2 = (tplayerState == null)? 0: tplayerState.length;
                i = i + i2;
                LivePkMessages$PkPlayerState[] pkPlayerStat = new LivePkMessages$PkPlayerState[i];
                if (i2) {
                   System.arraycopy(tplayerState, 0, pkPlayerStat, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   pkPlayerStat[i2] = new LivePkMessages$PkPlayerState();
                   p0.readMessage(pkPlayerStat[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                pkPlayerStat[i2] = new LivePkMessages$PkPlayerState();
                p0.readMessage(pkPlayerStat[i2]);
                this.playerState = pkPlayerStat;
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
       LivePkMessages$SCLivePkState tplayerState = this.playerState;
       if (tplayerState != null && tplayerState.length > 0) {
          int i = 0;
          LivePkMessages$SCLivePkState tplayerState1 = this.playerState;
          while (i < tplayerState1.length) {
             object oobject = tplayerState1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
