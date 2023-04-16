package com.kuaishou.protobuf.livestream.nano.SCCommentFoldingMessage$FoldingMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextMessage;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.util.Objects;

public final class SCCommentFoldingMessage$FoldingMessage extends MessageNano	// class@000d30
{
    public int foldingMessageEntryCase_;
    public Object foldingMessageEntry_;
    public static SCCommentFoldingMessage$FoldingMessage[] _emptyArray;

    public void SCCommentFoldingMessage$FoldingMessage(){
       super();
       this.foldingMessageEntryCase_ = 0;
       this.clear();
    }
    public static SCCommentFoldingMessage$FoldingMessage[] emptyArray(){
       if (SCCommentFoldingMessage$FoldingMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCCommentFoldingMessage$FoldingMessage._emptyArray == null) {
             SCCommentFoldingMessage$FoldingMessage[] uFoldingMess = new SCCommentFoldingMessage$FoldingMessage[0];
             SCCommentFoldingMessage$FoldingMessage._emptyArray = uFoldingMess;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCCommentFoldingMessage$FoldingMessage._emptyArray;
    }
    public static SCCommentFoldingMessage$FoldingMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCCommentFoldingMessage$FoldingMessage().mergeFrom(p0);
    }
    public static SCCommentFoldingMessage$FoldingMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCCommentFoldingMessage$FoldingMessage(), p0);
    }
    public SCCommentFoldingMessage$FoldingMessage clear(){
       this.clearFoldingMessageEntry();
       this.cachedSize = -1;
       return this;
    }
    public SCCommentFoldingMessage$FoldingMessage clearFoldingMessageEntry(){
       this.foldingMessageEntryCase_ = 0;
       this.foldingMessageEntry_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (this.foldingMessageEntryCase_ == 1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, this.foldingMessageEntry_);
       }
       return i;
    }
    public LiveCommentRichTextMessage$CommentRichTextMessage getCommentRichTextMessage(){
       if (this.foldingMessageEntryCase_ == 1) {
          return this.foldingMessageEntry_;
       }
       return null;
    }
    public int getFoldingMessageEntryCase(){
       return this.foldingMessageEntryCase_;
    }
    public boolean hasCommentRichTextMessage(){
       boolean b = true;
       if (this.foldingMessageEntryCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCCommentFoldingMessage$FoldingMessage mergeFrom(CodedInputByteBufferNano p0){
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
             if (this.foldingMessageEntryCase_ != i1) {
                this.foldingMessageEntry_ = new LiveCommentRichTextMessage$CommentRichTextMessage();
             }
             p0.readMessage(this.foldingMessageEntry_);
             this.foldingMessageEntryCase_ = i1;
          }
       }
       return this;
    }
    public SCCommentFoldingMessage$FoldingMessage setCommentRichTextMessage(LiveCommentRichTextMessage$CommentRichTextMessage p0){
       Objects.requireNonNull(p0);
       this.foldingMessageEntryCase_ = 1;
       this.foldingMessageEntry_ = p0;
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (this.foldingMessageEntryCase_ == 1) {
          p0.writeMessage(1, this.foldingMessageEntry_);
       }
       super.writeTo(p0);
       return;
    }
}
