package com.kuaishou.protobuf.gamezone.nano.SCGzoneActivityWinningNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneActivityWinningNotice extends MessageNano	// class@000bcf
{
    public String bizId;
    public int bizType;
    public String extraData;
    public String liveStreamId;
    public String token;
    public static SCGzoneActivityWinningNotice[] _emptyArray;

    public void SCGzoneActivityWinningNotice(){
       super();
       this.clear();
    }
    public static SCGzoneActivityWinningNotice[] emptyArray(){
       if (SCGzoneActivityWinningNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneActivityWinningNotice._emptyArray == null) {
             SCGzoneActivityWinningNotice[] sCGzoneActiv = new SCGzoneActivityWinningNotice[0];
             SCGzoneActivityWinningNotice._emptyArray = sCGzoneActiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneActivityWinningNotice._emptyArray;
    }
    public static SCGzoneActivityWinningNotice parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneActivityWinningNotice().mergeFrom(p0);
    }
    public static SCGzoneActivityWinningNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneActivityWinningNotice(), p0);
    }
    public SCGzoneActivityWinningNotice clear(){
       this.bizType = 0;
       this.bizId = "";
       this.token = "";
       this.liveStreamId = "";
       this.extraData = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneActivityWinningNotice tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizType);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizId);
       }
       if (!(this.token).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.token);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       if (!(this.extraData).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.extraData);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneActivityWinningNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.extraData = p0.readString();
                      }
                   }else {
                      this.liveStreamId = p0.readString();
                   }
                }else {
                   this.token = p0.readString();
                }
             }else {
                this.bizId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.bizType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneActivityWinningNotice tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(1, tbizType);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          p0.writeString(2, this.bizId);
       }
       if (!(this.token).equals(str)) {
          p0.writeString(3, this.token);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       if (!(this.extraData).equals(str)) {
          p0.writeString(5, this.extraData);
       }
       super.writeTo(p0);
       return;
    }
}
