package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveVoteOptionModel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveVoteOptionModel extends MessageNano	// class@00134f
{
    public int count;
    public String displayCount;
    public int id;
    public static LiveStreamMessages$SCLiveVoteOptionModel[] _emptyArray;

    public void LiveStreamMessages$SCLiveVoteOptionModel(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveVoteOptionModel[] emptyArray(){
       if (LiveStreamMessages$SCLiveVoteOptionModel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveVoteOptionModel._emptyArray == null) {
             LiveStreamMessages$SCLiveVoteOptionModel[] sCLiveVoteOp = new LiveStreamMessages$SCLiveVoteOptionModel[0];
             LiveStreamMessages$SCLiveVoteOptionModel._emptyArray = sCLiveVoteOp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveVoteOptionModel._emptyArray;
    }
    public static LiveStreamMessages$SCLiveVoteOptionModel parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveVoteOptionModel().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveVoteOptionModel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveVoteOptionModel(), p0);
    }
    public LiveStreamMessages$SCLiveVoteOptionModel clear(){
       this.id = 0;
       this.count = 0;
       this.displayCount = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveVoteOptionModel tid = this.id;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tid);
       }
       tid = this.count;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tid);
       }
       if (!(this.displayCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveVoteOptionModel mergeFrom(CodedInputByteBufferNano p0){
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
                   this.displayCount = p0.readString();
                }
             }else {
                this.count = p0.readUInt32();
             }
          }else {
             this.id = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCLiveVoteOptionModel tid = this.id;
       if (tid != null) {
          p0.writeUInt32(1, tid);
       }
       tid = this.count;
       if (tid != null) {
          p0.writeUInt32(2, tid);
       }
       if (!(this.displayCount).equals("")) {
          p0.writeString(3, this.displayCount);
       }
       super.writeTo(p0);
       return;
    }
}
