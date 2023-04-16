package com.kuaishou.protobuf.gamezone.nano.SCGzoneLiveActivityCommonNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneLiveActivityCommonNotice extends MessageNano	// class@000bd6
{
    public String bizId;
    public int bizType;
    public String liveStreamId;
    public String payloadData;
    public static SCGzoneLiveActivityCommonNotice[] _emptyArray;

    public void SCGzoneLiveActivityCommonNotice(){
       super();
       this.clear();
    }
    public static SCGzoneLiveActivityCommonNotice[] emptyArray(){
       if (SCGzoneLiveActivityCommonNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneLiveActivityCommonNotice._emptyArray == null) {
             SCGzoneLiveActivityCommonNotice[] sCGzoneLiveA = new SCGzoneLiveActivityCommonNotice[0];
             SCGzoneLiveActivityCommonNotice._emptyArray = sCGzoneLiveA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneLiveActivityCommonNotice._emptyArray;
    }
    public static SCGzoneLiveActivityCommonNotice parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneLiveActivityCommonNotice().mergeFrom(p0);
    }
    public static SCGzoneLiveActivityCommonNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneLiveActivityCommonNotice(), p0);
    }
    public SCGzoneLiveActivityCommonNotice clear(){
       this.bizType = 0;
       this.bizId = "";
       this.liveStreamId = "";
       this.payloadData = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneLiveActivityCommonNotice tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tbizType);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       if (!(this.payloadData).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.payloadData);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneLiveActivityCommonNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 34) {
                   if (i != 42) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.payloadData = p0.readString();
                   }
                }else {
                   this.liveStreamId = p0.readString();
                }
             }else {
                this.bizId = p0.readString();
             }
          }else {
             this.bizType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneLiveActivityCommonNotice tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeUInt32(1, tbizType);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          p0.writeString(2, this.bizId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       if (!(this.payloadData).equals(str)) {
          p0.writeString(5, this.payloadData);
       }
       super.writeTo(p0);
       return;
    }
}
