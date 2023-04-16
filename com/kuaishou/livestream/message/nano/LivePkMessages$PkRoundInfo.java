package com.kuaishou.livestream.message.nano.LivePkMessages$PkRoundInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkMessages$PkRoundInfo extends MessageNano	// class@00121f
{
    public int formatType;
    public long roundDuration;
    public int roundIndex;
    public long voteDeadline;
    public static LivePkMessages$PkRoundInfo[] _emptyArray;

    public void LivePkMessages$PkRoundInfo(){
       super();
       this.clear();
    }
    public static LivePkMessages$PkRoundInfo[] emptyArray(){
       if (LivePkMessages$PkRoundInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$PkRoundInfo._emptyArray == null) {
             LivePkMessages$PkRoundInfo[] pkRoundInfoA = new LivePkMessages$PkRoundInfo[0];
             LivePkMessages$PkRoundInfo._emptyArray = pkRoundInfoA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$PkRoundInfo._emptyArray;
    }
    public static LivePkMessages$PkRoundInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$PkRoundInfo().mergeFrom(p0);
    }
    public static LivePkMessages$PkRoundInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$PkRoundInfo(), p0);
    }
    public LivePkMessages$PkRoundInfo clear(){
       this.voteDeadline = 0;
       this.roundIndex = 0;
       this.roundDuration = 0;
       this.formatType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$PkRoundInfo tvoteDeadlin = this.voteDeadline;
       int i1 = 0;
       if (tvoteDeadlin - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tvoteDeadlin);
       }
       tvoteDeadlin = this.roundIndex;
       if (tvoteDeadlin != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tvoteDeadlin);
       }
       tvoteDeadlin = this.roundDuration;
       if (tvoteDeadlin - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tvoteDeadlin);
       }
       tvoteDeadlin = this.formatType;
       if (tvoteDeadlin != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tvoteDeadlin);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$PkRoundInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.formatType = i;
                      }
                   }
                }else {
                   this.roundDuration = p0.readUInt64();
                }
             }else {
                this.roundIndex = p0.readUInt32();
             }
          }else {
             this.voteDeadline = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$PkRoundInfo tvoteDeadlin = this.voteDeadline;
       int i = 0;
       if (tvoteDeadlin - i) {
          p0.writeUInt64(1, tvoteDeadlin);
       }
       tvoteDeadlin = this.roundIndex;
       if (tvoteDeadlin != null) {
          p0.writeUInt32(2, tvoteDeadlin);
       }
       tvoteDeadlin = this.roundDuration;
       if (tvoteDeadlin - i) {
          p0.writeUInt64(3, tvoteDeadlin);
       }
       tvoteDeadlin = this.formatType;
       if (tvoteDeadlin != null) {
          p0.writeInt32(4, tvoteDeadlin);
       }
       super.writeTo(p0);
       return;
    }
}
