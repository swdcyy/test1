package com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentBadgeSegment;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentIconSegment;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.util.Objects;

public final class UserStateRichTextSegment extends MessageNano	// class@000d7f
{
    public int entryCase_;
    public Object entry_;
    public static UserStateRichTextSegment[] _emptyArray;

    public void UserStateRichTextSegment(){
       super();
       this.entryCase_ = 0;
       this.clear();
    }
    public static UserStateRichTextSegment[] emptyArray(){
       if (UserStateRichTextSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (UserStateRichTextSegment._emptyArray == null) {
             UserStateRichTextSegment[] userStateRic = new UserStateRichTextSegment[0];
             UserStateRichTextSegment._emptyArray = userStateRic;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return UserStateRichTextSegment._emptyArray;
    }
    public static UserStateRichTextSegment parseFrom(CodedInputByteBufferNano p0){
       return new UserStateRichTextSegment().mergeFrom(p0);
    }
    public static UserStateRichTextSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new UserStateRichTextSegment(), p0);
    }
    public UserStateRichTextSegment clear(){
       this.clearEntry();
       this.cachedSize = -1;
       return this;
    }
    public UserStateRichTextSegment clearEntry(){
       this.entryCase_ = 0;
       this.entry_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       int i1 = 1;
       if (this.entryCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.entry_);
       }
       if (this.entryCase_ == 2) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, this.entry_);
       }
       return i;
    }
    public LiveCommentRichText$CommentBadgeSegment getBadgeSegment(){
       if (this.entryCase_ == 2) {
          return this.entry_;
       }
       return null;
    }
    public int getEntryCase(){
       return this.entryCase_;
    }
    public LiveCommentRichText$CommentIconSegment getIconSegment(){
       if (this.entryCase_ == 1) {
          return this.entry_;
       }
       return null;
    }
    public boolean hasBadgeSegment(){
       boolean b = (this.entryCase_ == 2)? true: false;
       return b;
    }
    public boolean hasIconSegment(){
       boolean b = true;
       if (this.entryCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public UserStateRichTextSegment mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i1 = 2;
                if (this.entryCase_ != i1) {
                   this.entry_ = new LiveCommentRichText$CommentBadgeSegment();
                }
                p0.readMessage(this.entry_);
                this.entryCase_ = i1;
             }
          }else {
             i1 = 1;
             if (this.entryCase_ != i1) {
                this.entry_ = new LiveCommentRichText$CommentIconSegment();
             }
             p0.readMessage(this.entry_);
             this.entryCase_ = i1;
          }
       }
       return this;
    }
    public UserStateRichTextSegment setBadgeSegment(LiveCommentRichText$CommentBadgeSegment p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 2;
       this.entry_ = p0;
       return this;
    }
    public UserStateRichTextSegment setIconSegment(LiveCommentRichText$CommentIconSegment p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 1;
       this.entry_ = p0;
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i = 1;
       if (this.entryCase_ == i) {
          p0.writeMessage(i, this.entry_);
       }
       if (this.entryCase_ == 2) {
          p0.writeMessage(2, this.entry_);
       }
       super.writeTo(p0);
       return;
    }
}
