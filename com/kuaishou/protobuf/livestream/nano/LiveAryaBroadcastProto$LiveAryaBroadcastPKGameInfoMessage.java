package com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage extends MessageNano	// class@000c36
{
    public String pkGameId;
    public int pkGameState;
    public String pkId;
    public String score;
    public static LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage[] _emptyArray;

    public void LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage(){
       super();
       this.clear();
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage[] emptyArray(){
       if (LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage._emptyArray == null) {
             LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage[] liveAryaBroa = new LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage[0];
             LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage._emptyArray = liveAryaBroa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage._emptyArray;
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage().mergeFrom(p0);
    }
    public static LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage(), p0);
    }
    public LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage clear(){
       this.pkGameState = 0;
       this.pkId = "";
       this.pkGameId = "";
       this.score = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage tpkGameState = this.pkGameState;
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
       if (!(this.score).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.score);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.score = p0.readString();
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
       LiveAryaBroadcastProto$LiveAryaBroadcastPKGameInfoMessage tpkGameState = this.pkGameState;
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
       if (!(this.score).equals(str)) {
          p0.writeString(4, this.score);
       }
       super.writeTo(p0);
       return;
    }
}
