package com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed extends MessageNano	// class@001256
{
    public String bizId;
    public long liveStreamId;
    public static LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed[] _emptyArray;

    public void LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed(){
       super();
       this.clear();
    }
    public static LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed[] emptyArray(){
       if (LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed._emptyArray == null) {
             LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed[] sCLiveQuickC = new LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed[0];
             LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed._emptyArray = sCLiveQuickC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed._emptyArray;
    }
    public static LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed().mergeFrom(p0);
    }
    public static LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed(), p0);
    }
    public LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed clear(){
       this.liveStreamId = 0;
       this.bizId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed tliveStreamI = this.liveStreamId;
       if (tliveStreamI) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tliveStreamI);
       }
       if (!(this.bizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.bizId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed tliveStreamI = this.liveStreamId;
       if (tliveStreamI) {
          p0.writeUInt64(1, tliveStreamI);
       }
       if (!(this.bizId).equals("")) {
          p0.writeString(2, this.bizId);
       }
       super.writeTo(p0);
       return;
    }
}
