package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoteClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCVoteClosed extends MessageNano	// class@001378
{
    public long displayMaxDelayMillis;
    public String voteId;
    public static LiveStreamMessages$SCVoteClosed[] _emptyArray;

    public void LiveStreamMessages$SCVoteClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCVoteClosed[] emptyArray(){
       if (LiveStreamMessages$SCVoteClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCVoteClosed._emptyArray == null) {
             LiveStreamMessages$SCVoteClosed[] sCVoteClosed = new LiveStreamMessages$SCVoteClosed[0];
             LiveStreamMessages$SCVoteClosed._emptyArray = sCVoteClosed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCVoteClosed._emptyArray;
    }
    public static LiveStreamMessages$SCVoteClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCVoteClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCVoteClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCVoteClosed(), p0);
    }
    public LiveStreamMessages$SCVoteClosed clear(){
       this.voteId = "";
       this.displayMaxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.voteId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.voteId);
       }
       LiveStreamMessages$SCVoteClosed tdisplayMaxD = this.displayMaxDelayMillis;
       if (tdisplayMaxD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tdisplayMaxD);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCVoteClosed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.displayMaxDelayMillis = p0.readUInt64();
             }
          }else {
             this.voteId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.voteId).equals("")) {
          p0.writeString(1, this.voteId);
       }
       LiveStreamMessages$SCVoteClosed tdisplayMaxD = this.displayMaxDelayMillis;
       if (tdisplayMaxD) {
          p0.writeUInt64(2, tdisplayMaxD);
       }
       super.writeTo(p0);
       return;
    }
}
