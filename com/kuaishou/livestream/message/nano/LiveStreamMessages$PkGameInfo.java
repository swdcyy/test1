package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkGameInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PkGameInfo extends MessageNano	// class@001313
{
    public long gameEndDeadline;
    public long gameEndTime;
    public String gameId;
    public String gameName;
    public long gameStartTime;
    public static LiveStreamMessages$PkGameInfo[] _emptyArray;

    public void LiveStreamMessages$PkGameInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkGameInfo[] emptyArray(){
       if (LiveStreamMessages$PkGameInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkGameInfo._emptyArray == null) {
             LiveStreamMessages$PkGameInfo[] pkGameInfoAr = new LiveStreamMessages$PkGameInfo[0];
             LiveStreamMessages$PkGameInfo._emptyArray = pkGameInfoAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkGameInfo._emptyArray;
    }
    public static LiveStreamMessages$PkGameInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkGameInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkGameInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkGameInfo(), p0);
    }
    public LiveStreamMessages$PkGameInfo clear(){
       this.gameId = "";
       this.gameStartTime = 0;
       this.gameEndTime = 0;
       this.gameName = "";
       this.gameEndDeadline = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.gameId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.gameId);
       }
       LiveStreamMessages$PkGameInfo tgameStartTi = this.gameStartTime;
       if (tgameStartTi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tgameStartTi);
       }
       tgameStartTi = this.gameEndTime;
       if (tgameStartTi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tgameStartTi);
       }
       if (!(this.gameName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.gameName);
       }
       LiveStreamMessages$PkGameInfo tgameEndDead = this.gameEndDeadline;
       if (tgameEndDead) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tgameEndDead);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PkGameInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.gameEndDeadline = p0.readUInt64();
                      }
                   }else {
                      this.gameName = p0.readString();
                   }
                }else {
                   this.gameEndTime = p0.readUInt64();
                }
             }else {
                this.gameStartTime = p0.readUInt64();
             }
          }else {
             this.gameId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.gameId).equals(str)) {
          p0.writeString(1, this.gameId);
       }
       LiveStreamMessages$PkGameInfo tgameStartTi = this.gameStartTime;
       if (tgameStartTi) {
          p0.writeUInt64(2, tgameStartTi);
       }
       tgameStartTi = this.gameEndTime;
       if (tgameStartTi) {
          p0.writeUInt64(3, tgameStartTi);
       }
       if (!(this.gameName).equals(str)) {
          p0.writeString(4, this.gameName);
       }
       LiveStreamMessages$PkGameInfo tgameEndDead = this.gameEndDeadline;
       if (tgameEndDead) {
          p0.writeUInt64(5, tgameEndDead);
       }
       super.writeTo(p0);
       return;
    }
}
