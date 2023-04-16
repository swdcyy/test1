package com.kuaishou.livestream.message.nano.LivePkMessages$PkPlayerState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.ChatWishList;

public final class LivePkMessages$PkPlayerState extends MessageNano	// class@001218
{
    public ChatWishList chatWishList;
    public boolean openWishList;
    public long playerId;
    public static LivePkMessages$PkPlayerState[] _emptyArray;

    public void LivePkMessages$PkPlayerState(){
       super();
       this.clear();
    }
    public static LivePkMessages$PkPlayerState[] emptyArray(){
       if (LivePkMessages$PkPlayerState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$PkPlayerState._emptyArray == null) {
             LivePkMessages$PkPlayerState[] pkPlayerStat = new LivePkMessages$PkPlayerState[0];
             LivePkMessages$PkPlayerState._emptyArray = pkPlayerStat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$PkPlayerState._emptyArray;
    }
    public static LivePkMessages$PkPlayerState parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$PkPlayerState().mergeFrom(p0);
    }
    public static LivePkMessages$PkPlayerState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$PkPlayerState(), p0);
    }
    public LivePkMessages$PkPlayerState clear(){
       this.playerId = 0;
       this.openWishList = false;
       this.chatWishList = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$PkPlayerState tplayerId = this.playerId;
       if (tplayerId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tplayerId);
       }
       tplayerId = this.openWishList;
       if (tplayerId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tplayerId);
       }
       tplayerId = this.chatWishList;
       if (tplayerId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tplayerId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$PkPlayerState mergeFrom(CodedInputByteBufferNano p0){
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
                }else if(this.chatWishList == null){
                   this.chatWishList = new ChatWishList();
                }
                p0.readMessage(this.chatWishList);
             }else {
                this.openWishList = p0.readBool();
             }
          }else {
             this.playerId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$PkPlayerState tplayerId = this.playerId;
       if (tplayerId) {
          p0.writeUInt64(1, tplayerId);
       }
       tplayerId = this.openWishList;
       if (tplayerId != null) {
          p0.writeBool(2, tplayerId);
       }
       tplayerId = this.chatWishList;
       if (tplayerId != null) {
          p0.writeMessage(3, tplayerId);
       }
       super.writeTo(p0);
       return;
    }
}
