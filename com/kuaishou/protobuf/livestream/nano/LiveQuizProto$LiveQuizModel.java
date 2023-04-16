package com.kuaishou.protobuf.livestream.nano.LiveQuizProto$LiveQuizModel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuizProto$LiveQuizModel extends MessageNano	// class@000cf3
{
    public String liveQuizId;
    public int prizeType;
    public long totalKsCoin;
    public int totalQuestions;
    public static LiveQuizProto$LiveQuizModel[] _emptyArray;

    public void LiveQuizProto$LiveQuizModel(){
       super();
       this.clear();
    }
    public static LiveQuizProto$LiveQuizModel[] emptyArray(){
       if (LiveQuizProto$LiveQuizModel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizProto$LiveQuizModel._emptyArray == null) {
             LiveQuizProto$LiveQuizModel[] liveQuizMode = new LiveQuizProto$LiveQuizModel[0];
             LiveQuizProto$LiveQuizModel._emptyArray = liveQuizMode;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizProto$LiveQuizModel._emptyArray;
    }
    public static LiveQuizProto$LiveQuizModel parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizProto$LiveQuizModel().mergeFrom(p0);
    }
    public static LiveQuizProto$LiveQuizModel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizProto$LiveQuizModel(), p0);
    }
    public LiveQuizProto$LiveQuizModel clear(){
       this.liveQuizId = "";
       this.prizeType = 0;
       this.totalQuestions = 0;
       this.totalKsCoin = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveQuizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveQuizId);
       }
       LiveQuizProto$LiveQuizModel tprizeType = this.prizeType;
       if (tprizeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tprizeType);
       }
       tprizeType = this.totalQuestions;
       if (tprizeType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tprizeType);
       }
       tprizeType = this.totalKsCoin;
       if (tprizeType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tprizeType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizProto$LiveQuizModel mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.totalKsCoin = p0.readUInt64();
                   }
                }else {
                   this.totalQuestions = p0.readUInt32();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.prizeType = i;
                }
             }
          }else {
             this.liveQuizId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveQuizId).equals("")) {
          p0.writeString(1, this.liveQuizId);
       }
       LiveQuizProto$LiveQuizModel tprizeType = this.prizeType;
       if (tprizeType != null) {
          p0.writeInt32(2, tprizeType);
       }
       tprizeType = this.totalQuestions;
       if (tprizeType != null) {
          p0.writeUInt32(3, tprizeType);
       }
       tprizeType = this.totalKsCoin;
       if (tprizeType) {
          p0.writeUInt64(4, tprizeType);
       }
       super.writeTo(p0);
       return;
    }
}
