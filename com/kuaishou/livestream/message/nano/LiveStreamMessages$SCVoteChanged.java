package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoteChanged;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveVoteOptionModel;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$SCVoteChanged extends MessageNano	// class@001377
{
    public long displayMaxDelayMillis;
    public LiveStreamMessages$SCLiveVoteOptionModel[] options;
    public String voteId;
    public static LiveStreamMessages$SCVoteChanged[] _emptyArray;

    public void LiveStreamMessages$SCVoteChanged(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCVoteChanged[] emptyArray(){
       if (LiveStreamMessages$SCVoteChanged._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCVoteChanged._emptyArray == null) {
             LiveStreamMessages$SCVoteChanged[] sCVoteChange = new LiveStreamMessages$SCVoteChanged[0];
             LiveStreamMessages$SCVoteChanged._emptyArray = sCVoteChange;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCVoteChanged._emptyArray;
    }
    public static LiveStreamMessages$SCVoteChanged parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCVoteChanged().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCVoteChanged parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCVoteChanged(), p0);
    }
    public LiveStreamMessages$SCVoteChanged clear(){
       this.voteId = "";
       this.options = LiveStreamMessages$SCLiveVoteOptionModel.emptyArray();
       this.displayMaxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.voteId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.voteId);
       }
       LiveStreamMessages$SCVoteChanged toptions = this.options;
       if (toptions != null && toptions.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCVoteChanged toptions1 = this.options;
          while (i1 < toptions1.length) {
             object oobject = toptions1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       toptions = this.displayMaxDelayMillis;
       if (toptions) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, toptions);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCVoteChanged mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.displayMaxDelayMillis = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveStreamMessages$SCVoteChanged toptions = this.options;
                int i2 = (toptions == null)? 0: toptions.length;
                i = i + i2;
                LiveStreamMessages$SCLiveVoteOptionModel[] sCLiveVoteOp = new LiveStreamMessages$SCLiveVoteOptionModel[i];
                if (i2) {
                   System.arraycopy(toptions, 0, sCLiveVoteOp, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   sCLiveVoteOp[i2] = new LiveStreamMessages$SCLiveVoteOptionModel();
                   p0.readMessage(sCLiveVoteOp[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                sCLiveVoteOp[i2] = new LiveStreamMessages$SCLiveVoteOptionModel();
                p0.readMessage(sCLiveVoteOp[i2]);
                this.options = sCLiveVoteOp;
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
       LiveStreamMessages$SCVoteChanged toptions = this.options;
       if (toptions != null && toptions.length > 0) {
          int i = 0;
          LiveStreamMessages$SCVoteChanged toptions1 = this.options;
          while (i < toptions1.length) {
             object oobject = toptions1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       toptions = this.displayMaxDelayMillis;
       if (toptions) {
          p0.writeUInt64(3, toptions);
       }
       super.writeTo(p0);
       return;
    }
}
