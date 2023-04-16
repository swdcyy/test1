package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LivePKGameInfoSyncMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LivePKGameInfoSyncMessage extends MessageNano	// class@000c7d
{
    public String anchorScore;
    public String otherAnchorScore;
    public String pkGameId;
    public int pkGameState;
    public String pkId;
    public static LiveFlvStream$LivePKGameInfoSyncMessage[] _emptyArray;

    public void LiveFlvStream$LivePKGameInfoSyncMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LivePKGameInfoSyncMessage[] emptyArray(){
       if (LiveFlvStream$LivePKGameInfoSyncMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LivePKGameInfoSyncMessage._emptyArray == null) {
             LiveFlvStream$LivePKGameInfoSyncMessage[] livePKGameIn = new LiveFlvStream$LivePKGameInfoSyncMessage[0];
             LiveFlvStream$LivePKGameInfoSyncMessage._emptyArray = livePKGameIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LivePKGameInfoSyncMessage._emptyArray;
    }
    public static LiveFlvStream$LivePKGameInfoSyncMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LivePKGameInfoSyncMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LivePKGameInfoSyncMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LivePKGameInfoSyncMessage(), p0);
    }
    public LiveFlvStream$LivePKGameInfoSyncMessage clear(){
       this.pkGameState = 0;
       this.pkId = "";
       this.pkGameId = "";
       this.anchorScore = "";
       this.otherAnchorScore = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LivePKGameInfoSyncMessage tpkGameState = this.pkGameState;
       if (tpkGameState != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tpkGameState);
       }
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.pkId);
       }
       if (!(this.pkGameId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.pkGameId);
       }
       if (!(this.anchorScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.anchorScore);
       }
       if (!(this.otherAnchorScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.otherAnchorScore);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LivePKGameInfoSyncMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.otherAnchorScore = p0.readString();
                      }
                   }else {
                      this.anchorScore = p0.readString();
                   }
                }else {
                   this.pkGameId = p0.readString();
                }
             }else {
                this.pkId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.pkGameState = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LivePKGameInfoSyncMessage tpkGameState = this.pkGameState;
       if (tpkGameState != null) {
          p0.writeInt32(1, tpkGameState);
       }
       String str = "";
       if (!(this.pkId).equals(str)) {
          p0.writeString(2, this.pkId);
       }
       if (!(this.pkGameId).equals(str)) {
          p0.writeString(3, this.pkGameId);
       }
       if (!(this.anchorScore).equals(str)) {
          p0.writeString(4, this.anchorScore);
       }
       if (!(this.otherAnchorScore).equals(str)) {
          p0.writeString(5, this.otherAnchorScore);
       }
       super.writeTo(p0);
       return;
    }
}
