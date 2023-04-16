package com.kuaishou.livestream.message.nano.SCLiveContentOpPromotion;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveContentOpPromotion extends MessageNano	// class@001415
{
    public String content;
    public String liveStreamId;
    public int operation;
    public int showSeconds;
    public int status;
    public String taskId;
    public static SCLiveContentOpPromotion[] _emptyArray;

    public void SCLiveContentOpPromotion(){
       super();
       this.clear();
    }
    public static SCLiveContentOpPromotion[] emptyArray(){
       if (SCLiveContentOpPromotion._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveContentOpPromotion._emptyArray == null) {
             SCLiveContentOpPromotion[] sCLiveConten = new SCLiveContentOpPromotion[0];
             SCLiveContentOpPromotion._emptyArray = sCLiveConten;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveContentOpPromotion._emptyArray;
    }
    public static SCLiveContentOpPromotion parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveContentOpPromotion().mergeFrom(p0);
    }
    public static SCLiveContentOpPromotion parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveContentOpPromotion(), p0);
    }
    public SCLiveContentOpPromotion clear(){
       this.operation = 0;
       this.taskId = "";
       this.liveStreamId = "";
       this.status = 0;
       this.content = "";
       this.showSeconds = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveContentOpPromotion toperation = this.operation;
       if (toperation != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, toperation);
       }
       String str = "";
       if (!(this.taskId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.taskId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       toperation = this.status;
       if (toperation != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, toperation);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.content);
       }
       toperation = this.showSeconds;
       if (toperation != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, toperation);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveContentOpPromotion mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.showSeconds = p0.readUInt32();
                         }
                      }else {
                         this.content = p0.readString();
                      }
                   }else {
                      this.status = p0.readUInt32();
                   }
                }else {
                   this.liveStreamId = p0.readString();
                }
             }else {
                this.taskId = p0.readString();
             }
          }else {
             this.operation = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveContentOpPromotion toperation = this.operation;
       if (toperation != null) {
          p0.writeUInt32(1, toperation);
       }
       String str = "";
       if (!(this.taskId).equals(str)) {
          p0.writeString(2, this.taskId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       toperation = this.status;
       if (toperation != null) {
          p0.writeUInt32(4, toperation);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(5, this.content);
       }
       toperation = this.showSeconds;
       if (toperation != null) {
          p0.writeUInt32(6, toperation);
       }
       super.writeTo(p0);
       return;
    }
}
