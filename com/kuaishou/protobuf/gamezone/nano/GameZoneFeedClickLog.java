package com.kuaishou.protobuf.gamezone.nano.GameZoneFeedClickLog;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.gamezone.nano.GameZoneFeedClickEvent;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class GameZoneFeedClickLog extends MessageNano	// class@000bc5
{
    public GameZoneFeedClickEvent[] feedClickEvent;
    public static GameZoneFeedClickLog[] _emptyArray;

    public void GameZoneFeedClickLog(){
       super();
       this.clear();
    }
    public static GameZoneFeedClickLog[] emptyArray(){
       if (GameZoneFeedClickLog._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GameZoneFeedClickLog._emptyArray == null) {
             GameZoneFeedClickLog[] gameZoneFeed = new GameZoneFeedClickLog[0];
             GameZoneFeedClickLog._emptyArray = gameZoneFeed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GameZoneFeedClickLog._emptyArray;
    }
    public static GameZoneFeedClickLog parseFrom(CodedInputByteBufferNano p0){
       return new GameZoneFeedClickLog().mergeFrom(p0);
    }
    public static GameZoneFeedClickLog parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GameZoneFeedClickLog(), p0);
    }
    public GameZoneFeedClickLog clear(){
       this.feedClickEvent = GameZoneFeedClickEvent.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GameZoneFeedClickLog tGameZoneFee = this.feedClickEvent;
       if (tGameZoneFee != null && tGameZoneFee.length > 0) {
          int i1 = 0;
          GameZoneFeedClickLog tGameZoneFee1 = this.feedClickEvent;
          while (i1 < tGameZoneFee1.length) {
             object oobject = tGameZoneFee1[i1];
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
    public GameZoneFeedClickLog mergeFrom(CodedInputByteBufferNano p0){
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
             GameZoneFeedClickLog tGameZoneFee = this.feedClickEvent;
             int i2 = (tGameZoneFee == null)? 0: tGameZoneFee.length;
             i = i + i2;
             GameZoneFeedClickEvent[] gameZoneFeed = new GameZoneFeedClickEvent[i];
             if (i2) {
                System.arraycopy(tGameZoneFee, 0, gameZoneFeed, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                gameZoneFeed[i2] = new GameZoneFeedClickEvent();
                p0.readMessage(gameZoneFeed[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             gameZoneFeed[i2] = new GameZoneFeedClickEvent();
             p0.readMessage(gameZoneFeed[i2]);
             this.feedClickEvent = gameZoneFeed;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GameZoneFeedClickLog tGameZoneFee = this.feedClickEvent;
       if (tGameZoneFee != null && tGameZoneFee.length > 0) {
          int i = 0;
          GameZoneFeedClickLog tGameZoneFee1 = this.feedClickEvent;
          while (i < tGameZoneFee1.length) {
             object oobject = tGameZoneFee1[i];
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
