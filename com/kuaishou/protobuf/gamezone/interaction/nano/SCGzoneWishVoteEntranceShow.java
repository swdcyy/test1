package com.kuaishou.protobuf.gamezone.interaction.nano.SCGzoneWishVoteEntranceShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneWishVoteEntranceShow extends MessageNano	// class@000bc0
{
    public long delayRandomMaxMills;
    public long endTime;
    public long showEndTime;
    public String voteId;
    public int voteType;
    public static SCGzoneWishVoteEntranceShow[] _emptyArray;

    public void SCGzoneWishVoteEntranceShow(){
       super();
       this.clear();
    }
    public static SCGzoneWishVoteEntranceShow[] emptyArray(){
       if (SCGzoneWishVoteEntranceShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneWishVoteEntranceShow._emptyArray == null) {
             SCGzoneWishVoteEntranceShow[] sCGzoneWishV = new SCGzoneWishVoteEntranceShow[0];
             SCGzoneWishVoteEntranceShow._emptyArray = sCGzoneWishV;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneWishVoteEntranceShow._emptyArray;
    }
    public static SCGzoneWishVoteEntranceShow parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneWishVoteEntranceShow().mergeFrom(p0);
    }
    public static SCGzoneWishVoteEntranceShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneWishVoteEntranceShow(), p0);
    }
    public SCGzoneWishVoteEntranceShow clear(){
       this.voteType = 0;
       this.voteId = "";
       this.endTime = 0;
       this.showEndTime = 0;
       this.delayRandomMaxMills = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneWishVoteEntranceShow tvoteType = this.voteType;
       if (tvoteType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tvoteType);
       }
       if (!(this.voteId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voteId);
       }
       tvoteType = this.endTime;
       int i1 = 0;
       if (tvoteType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tvoteType);
       }
       tvoteType = this.showEndTime;
       if (tvoteType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tvoteType);
       }
       tvoteType = this.delayRandomMaxMills;
       if (tvoteType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tvoteType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneWishVoteEntranceShow mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.delayRandomMaxMills = p0.readUInt64();
                      }
                   }else {
                      this.showEndTime = p0.readUInt64();
                   }
                }else {
                   this.endTime = p0.readUInt64();
                }
             }else {
                this.voteId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.voteType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneWishVoteEntranceShow tvoteType = this.voteType;
       if (tvoteType != null) {
          p0.writeInt32(1, tvoteType);
       }
       if (!(this.voteId).equals("")) {
          p0.writeString(2, this.voteId);
       }
       tvoteType = this.endTime;
       int i = 0;
       if (tvoteType - i) {
          p0.writeUInt64(3, tvoteType);
       }
       tvoteType = this.showEndTime;
       if (tvoteType - i) {
          p0.writeUInt64(4, tvoteType);
       }
       tvoteType = this.delayRandomMaxMills;
       if (tvoteType - i) {
          p0.writeUInt64(5, tvoteType);
       }
       super.writeTo(p0);
       return;
    }
}
