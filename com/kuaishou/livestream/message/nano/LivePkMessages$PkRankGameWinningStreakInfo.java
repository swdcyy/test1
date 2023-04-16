package com.kuaishou.livestream.message.nano.LivePkMessages$PkRankGameWinningStreakInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkMessages$PkRankGameWinningStreakInfo extends MessageNano	// class@00121d
{
    public long authorId;
    public String displayWinningStreakCount;
    public int winningStreakCount;
    public static LivePkMessages$PkRankGameWinningStreakInfo[] _emptyArray;

    public void LivePkMessages$PkRankGameWinningStreakInfo(){
       super();
       this.clear();
    }
    public static LivePkMessages$PkRankGameWinningStreakInfo[] emptyArray(){
       if (LivePkMessages$PkRankGameWinningStreakInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$PkRankGameWinningStreakInfo._emptyArray == null) {
             LivePkMessages$PkRankGameWinningStreakInfo[] pkRankGameWi = new LivePkMessages$PkRankGameWinningStreakInfo[0];
             LivePkMessages$PkRankGameWinningStreakInfo._emptyArray = pkRankGameWi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$PkRankGameWinningStreakInfo._emptyArray;
    }
    public static LivePkMessages$PkRankGameWinningStreakInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$PkRankGameWinningStreakInfo().mergeFrom(p0);
    }
    public static LivePkMessages$PkRankGameWinningStreakInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$PkRankGameWinningStreakInfo(), p0);
    }
    public LivePkMessages$PkRankGameWinningStreakInfo clear(){
       this.authorId = 0;
       this.winningStreakCount = 0;
       this.displayWinningStreakCount = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$PkRankGameWinningStreakInfo tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tauthorId);
       }
       tauthorId = this.winningStreakCount;
       if (tauthorId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tauthorId);
       }
       if (!(this.displayWinningStreakCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayWinningStreakCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$PkRankGameWinningStreakInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.displayWinningStreakCount = p0.readString();
                }
             }else {
                this.winningStreakCount = p0.readUInt32();
             }
          }else {
             this.authorId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$PkRankGameWinningStreakInfo tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(1, tauthorId);
       }
       tauthorId = this.winningStreakCount;
       if (tauthorId != null) {
          p0.writeUInt32(2, tauthorId);
       }
       if (!(this.displayWinningStreakCount).equals("")) {
          p0.writeString(3, this.displayWinningStreakCount);
       }
       super.writeTo(p0);
       return;
    }
}
