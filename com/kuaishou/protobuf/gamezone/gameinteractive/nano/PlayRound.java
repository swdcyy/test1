package com.kuaishou.protobuf.gamezone.gameinteractive.nano.PlayRound;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

public final class PlayRound extends MessageNano	// class@000bb8
{
    public String actionId;
    public byte[] data;
    public long timestamp;
    public static PlayRound[] _emptyArray;

    public void PlayRound(){
       super();
       this.clear();
    }
    public static PlayRound[] emptyArray(){
       if (PlayRound._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (PlayRound._emptyArray == null) {
             PlayRound[] playRoundArr = new PlayRound[0];
             PlayRound._emptyArray = playRoundArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return PlayRound._emptyArray;
    }
    public static PlayRound parseFrom(CodedInputByteBufferNano p0){
       return new PlayRound().mergeFrom(p0);
    }
    public static PlayRound parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new PlayRound(), p0);
    }
    public PlayRound clear(){
       this.actionId = "";
       this.timestamp = 0;
       this.data = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.actionId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.actionId);
       }
       PlayRound ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttimestamp);
       }
       if (!Arrays.equals(this.data, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(3, this.data);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public PlayRound mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.data = p0.readBytes();
                }
             }else {
                this.timestamp = p0.readUInt64();
             }
          }else {
             this.actionId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.actionId).equals("")) {
          p0.writeString(1, this.actionId);
       }
       PlayRound ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(2, ttimestamp);
       }
       if (!Arrays.equals(this.data, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(3, this.data);
       }
       super.writeTo(p0);
       return;
    }
}
