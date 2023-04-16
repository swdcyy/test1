package com.kuaishou.livestream.message.nano.SCLiveCny2023GiftBoothUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveCny2023GiftBoothUpdate extends MessageNano	// class@001412
{
    public long displayRandomDelayMs;
    public String liveStreamId;
    public long timestamp;
    public static SCLiveCny2023GiftBoothUpdate[] _emptyArray;

    public void SCLiveCny2023GiftBoothUpdate(){
       super();
       this.clear();
    }
    public static SCLiveCny2023GiftBoothUpdate[] emptyArray(){
       if (SCLiveCny2023GiftBoothUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveCny2023GiftBoothUpdate._emptyArray == null) {
             SCLiveCny2023GiftBoothUpdate[] sCLiveCny202 = new SCLiveCny2023GiftBoothUpdate[0];
             SCLiveCny2023GiftBoothUpdate._emptyArray = sCLiveCny202;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveCny2023GiftBoothUpdate._emptyArray;
    }
    public static SCLiveCny2023GiftBoothUpdate parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveCny2023GiftBoothUpdate().mergeFrom(p0);
    }
    public static SCLiveCny2023GiftBoothUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveCny2023GiftBoothUpdate(), p0);
    }
    public SCLiveCny2023GiftBoothUpdate clear(){
       this.liveStreamId = "";
       this.timestamp = 0;
       this.displayRandomDelayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCLiveCny2023GiftBoothUpdate ttimestamp = this.timestamp;
       int i1 = 0;
       if (ttimestamp - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttimestamp);
       }
       ttimestamp = this.displayRandomDelayMs;
       if (ttimestamp - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveCny2023GiftBoothUpdate mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.displayRandomDelayMs = p0.readUInt64();
                }
             }else {
                this.timestamp = p0.readUInt64();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(1, this.liveStreamId);
       }
       SCLiveCny2023GiftBoothUpdate ttimestamp = this.timestamp;
       int i = 0;
       if (ttimestamp - i) {
          p0.writeUInt64(2, ttimestamp);
       }
       ttimestamp = this.displayRandomDelayMs;
       if (ttimestamp - i) {
          p0.writeUInt64(3, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
