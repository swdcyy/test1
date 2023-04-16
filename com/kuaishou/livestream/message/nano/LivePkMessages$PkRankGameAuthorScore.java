package com.kuaishou.livestream.message.nano.LivePkMessages$PkRankGameAuthorScore;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LivePkMessages$PkRankGameAuthorScore extends MessageNano	// class@001219
{
    public String displayScore;
    public String liveStreamId;
    public UserInfos$UserInfo player;
    public long score;
    public static LivePkMessages$PkRankGameAuthorScore[] _emptyArray;

    public void LivePkMessages$PkRankGameAuthorScore(){
       super();
       this.clear();
    }
    public static LivePkMessages$PkRankGameAuthorScore[] emptyArray(){
       if (LivePkMessages$PkRankGameAuthorScore._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$PkRankGameAuthorScore._emptyArray == null) {
             LivePkMessages$PkRankGameAuthorScore[] pkRankGameAu = new LivePkMessages$PkRankGameAuthorScore[0];
             LivePkMessages$PkRankGameAuthorScore._emptyArray = pkRankGameAu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$PkRankGameAuthorScore._emptyArray;
    }
    public static LivePkMessages$PkRankGameAuthorScore parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$PkRankGameAuthorScore().mergeFrom(p0);
    }
    public static LivePkMessages$PkRankGameAuthorScore parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$PkRankGameAuthorScore(), p0);
    }
    public LivePkMessages$PkRankGameAuthorScore clear(){
       this.player = null;
       this.score = 0;
       this.liveStreamId = "";
       this.displayScore = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$PkRankGameAuthorScore tplayer = this.player;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tplayer);
       }
       tplayer = this.score;
       if (tplayer - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tplayer);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       if (!(this.displayScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.displayScore);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$PkRankGameAuthorScore mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.displayScore = p0.readString();
                   }
                }else {
                   this.liveStreamId = p0.readString();
                }
             }else {
                this.score = p0.readUInt64();
             }
          }else if(this.player == null){
             this.player = new UserInfos$UserInfo();
          }
          p0.readMessage(this.player);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$PkRankGameAuthorScore tplayer = this.player;
       if (tplayer != null) {
          p0.writeMessage(1, tplayer);
       }
       tplayer = this.score;
       if (tplayer - null) {
          p0.writeUInt64(2, tplayer);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       if (!(this.displayScore).equals(str)) {
          p0.writeString(4, this.displayScore);
       }
       super.writeTo(p0);
       return;
    }
}
