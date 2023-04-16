package com.kuaishou.protobuf.livestage.nano.LiveStageProto$StreamId;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$StreamId$UserStreamId;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.util.Objects;

public final class LiveStageProto$StreamId extends MessageNano	// class@000bff
{
    public int streamIdCase_;
    public Object streamId_;
    public static LiveStageProto$StreamId[] _emptyArray;

    public void LiveStageProto$StreamId(){
       super();
       this.streamIdCase_ = 0;
       this.clear();
    }
    public static LiveStageProto$StreamId[] emptyArray(){
       if (LiveStageProto$StreamId._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStageProto$StreamId._emptyArray == null) {
             LiveStageProto$StreamId[] streamIdArra = new LiveStageProto$StreamId[0];
             LiveStageProto$StreamId._emptyArray = streamIdArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStageProto$StreamId._emptyArray;
    }
    public static LiveStageProto$StreamId parseFrom(CodedInputByteBufferNano p0){
       return new LiveStageProto$StreamId().mergeFrom(p0);
    }
    public static LiveStageProto$StreamId parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStageProto$StreamId(), p0);
    }
    public LiveStageProto$StreamId clear(){
       this.clearStreamId();
       this.cachedSize = -1;
       return this;
    }
    public LiveStageProto$StreamId clearStreamId(){
       this.streamIdCase_ = 0;
       this.streamId_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (this.streamIdCase_ == 1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, this.streamId_);
       }
       return i;
    }
    public int getStreamIdCase(){
       return this.streamIdCase_;
    }
    public LiveStageProto$StreamId$UserStreamId getUserStreamId(){
       if (this.streamIdCase_ == 1) {
          return this.streamId_;
       }
       return null;
    }
    public boolean hasUserStreamId(){
       boolean b = true;
       if (this.streamIdCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStageProto$StreamId mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             int i1 = 1;
             if (this.streamIdCase_ != i1) {
                this.streamId_ = new LiveStageProto$StreamId$UserStreamId();
             }
             p0.readMessage(this.streamId_);
             this.streamIdCase_ = i1;
          }
       }
       return this;
    }
    public LiveStageProto$StreamId setUserStreamId(LiveStageProto$StreamId$UserStreamId p0){
       Objects.requireNonNull(p0);
       this.streamIdCase_ = 1;
       this.streamId_ = p0;
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (this.streamIdCase_ == 1) {
          p0.writeMessage(1, this.streamId_);
       }
       super.writeTo(p0);
       return;
    }
}
