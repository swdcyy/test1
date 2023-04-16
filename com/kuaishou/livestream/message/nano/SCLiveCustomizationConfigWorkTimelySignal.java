package com.kuaishou.livestream.message.nano.SCLiveCustomizationConfigWorkTimelySignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCustomizationShareConfig;
import com.kuaishou.livestream.message.nano.LiveCustomizationCommentConfig;

public final class SCLiveCustomizationConfigWorkTimelySignal extends MessageNano	// class@001418
{
    public long authorId;
    public LiveCustomizationCommentConfig comment;
    public LiveCustomizationShareConfig share;
    public static SCLiveCustomizationConfigWorkTimelySignal[] _emptyArray;

    public void SCLiveCustomizationConfigWorkTimelySignal(){
       super();
       this.clear();
    }
    public static SCLiveCustomizationConfigWorkTimelySignal[] emptyArray(){
       if (SCLiveCustomizationConfigWorkTimelySignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveCustomizationConfigWorkTimelySignal._emptyArray == null) {
             SCLiveCustomizationConfigWorkTimelySignal[] sCLiveCustom = new SCLiveCustomizationConfigWorkTimelySignal[0];
             SCLiveCustomizationConfigWorkTimelySignal._emptyArray = sCLiveCustom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveCustomizationConfigWorkTimelySignal._emptyArray;
    }
    public static SCLiveCustomizationConfigWorkTimelySignal parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveCustomizationConfigWorkTimelySignal().mergeFrom(p0);
    }
    public static SCLiveCustomizationConfigWorkTimelySignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveCustomizationConfigWorkTimelySignal(), p0);
    }
    public SCLiveCustomizationConfigWorkTimelySignal clear(){
       this.authorId = 0;
       this.comment = null;
       this.share = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveCustomizationConfigWorkTimelySignal tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, tauthorId);
       }
       tauthorId = this.comment;
       if (tauthorId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tauthorId);
       }
       tauthorId = this.share;
       if (tauthorId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tauthorId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveCustomizationConfigWorkTimelySignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.share == null){
                   this.share = new LiveCustomizationShareConfig();
                }
                p0.readMessage(this.share);
             }else if(this.comment == null){
                this.comment = new LiveCustomizationCommentConfig();
             }
             p0.readMessage(this.comment);
          }else {
             this.authorId = p0.readInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveCustomizationConfigWorkTimelySignal tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeInt64(1, tauthorId);
       }
       tauthorId = this.comment;
       if (tauthorId != null) {
          p0.writeMessage(2, tauthorId);
       }
       tauthorId = this.share;
       if (tauthorId != null) {
          p0.writeMessage(3, tauthorId);
       }
       super.writeTo(p0);
       return;
    }
}
