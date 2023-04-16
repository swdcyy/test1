package com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentBadgeSegment;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentGiftSegment;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentIconSegment;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentImageSegment;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentTextSegment;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.util.Objects;

public final class LiveCommentRichTextMessage$CommentRichTextSegment extends MessageNano	// class@000c56
{
    public int entryCase_;
    public Object entry_;
    public static LiveCommentRichTextMessage$CommentRichTextSegment[] _emptyArray;

    public void LiveCommentRichTextMessage$CommentRichTextSegment(){
       super();
       this.entryCase_ = 0;
       this.clear();
    }
    public static LiveCommentRichTextMessage$CommentRichTextSegment[] emptyArray(){
       if (LiveCommentRichTextMessage$CommentRichTextSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentRichTextMessage$CommentRichTextSegment._emptyArray == null) {
             LiveCommentRichTextMessage$CommentRichTextSegment[] uCommentRich = new LiveCommentRichTextMessage$CommentRichTextSegment[0];
             LiveCommentRichTextMessage$CommentRichTextSegment._emptyArray = uCommentRich;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentRichTextMessage$CommentRichTextSegment._emptyArray;
    }
    public static LiveCommentRichTextMessage$CommentRichTextSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentRichTextMessage$CommentRichTextSegment().mergeFrom(p0);
    }
    public static LiveCommentRichTextMessage$CommentRichTextSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentRichTextMessage$CommentRichTextSegment(), p0);
    }
    public LiveCommentRichTextMessage$CommentRichTextSegment clear(){
       this.clearEntry();
       this.cachedSize = -1;
       return this;
    }
    public LiveCommentRichTextMessage$CommentRichTextSegment clearEntry(){
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
       i1 = 2;
       if (this.entryCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.entry_);
       }
       i1 = 3;
       if (this.entryCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.entry_);
       }
       i1 = 4;
       if (this.entryCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.entry_);
       }
       if (this.entryCase_ == 5) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, this.entry_);
       }
       return i;
    }
    public LiveCommentRichText$CommentBadgeSegment getBadgeSegment(){
       if (this.entryCase_ == 5) {
          return this.entry_;
       }
       return null;
    }
    public int getEntryCase(){
       return this.entryCase_;
    }
    public LiveCommentRichText$CommentGiftSegment getGiftSegment(){
       if (this.entryCase_ == 3) {
          return this.entry_;
       }
       return null;
    }
    public LiveCommentRichText$CommentIconSegment getIconSegment(){
       if (this.entryCase_ == 2) {
          return this.entry_;
       }
       return null;
    }
    public LiveCommentRichText$CommentImageSegment getImageSegment(){
       if (this.entryCase_ == 4) {
          return this.entry_;
       }
       return null;
    }
    public LiveCommentRichText$CommentTextSegment getTextSegment(){
       if (this.entryCase_ == 1) {
          return this.entry_;
       }
       return null;
    }
    public boolean hasBadgeSegment(){
       boolean b = (this.entryCase_ == 5)? true: false;
       return b;
    }
    public boolean hasGiftSegment(){
       boolean b = (this.entryCase_ == 3)? true: false;
       return b;
    }
    public boolean hasIconSegment(){
       boolean b = (this.entryCase_ == 2)? true: false;
       return b;
    }
    public boolean hasImageSegment(){
       boolean b = (this.entryCase_ == 4)? true: false;
       return b;
    }
    public boolean hasTextSegment(){
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
    public LiveCommentRichTextMessage$CommentRichTextSegment mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i1 = 5;
                         if (this.entryCase_ != i1) {
                            this.entry_ = new LiveCommentRichText$CommentBadgeSegment();
                         }
                         p0.readMessage(this.entry_);
                         this.entryCase_ = i1;
                      }
                   }else {
                      i1 = 4;
                      if (this.entryCase_ != i1) {
                         this.entry_ = new LiveCommentRichText$CommentImageSegment();
                      }
                      p0.readMessage(this.entry_);
                      this.entryCase_ = i1;
                   }
                }else {
                   i1 = 3;
                   if (this.entryCase_ != i1) {
                      this.entry_ = new LiveCommentRichText$CommentGiftSegment();
                   }
                   p0.readMessage(this.entry_);
                   this.entryCase_ = i1;
                }
             }else {
                i1 = 2;
                if (this.entryCase_ != i1) {
                   this.entry_ = new LiveCommentRichText$CommentIconSegment();
                }
                p0.readMessage(this.entry_);
                this.entryCase_ = i1;
             }
          }else {
             i1 = 1;
             if (this.entryCase_ != i1) {
                this.entry_ = new LiveCommentRichText$CommentTextSegment();
             }
             p0.readMessage(this.entry_);
             this.entryCase_ = i1;
          }
       }
       return this;
    }
    public LiveCommentRichTextMessage$CommentRichTextSegment setBadgeSegment(LiveCommentRichText$CommentBadgeSegment p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 5;
       this.entry_ = p0;
       return this;
    }
    public LiveCommentRichTextMessage$CommentRichTextSegment setGiftSegment(LiveCommentRichText$CommentGiftSegment p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 3;
       this.entry_ = p0;
       return this;
    }
    public LiveCommentRichTextMessage$CommentRichTextSegment setIconSegment(LiveCommentRichText$CommentIconSegment p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 2;
       this.entry_ = p0;
       return this;
    }
    public LiveCommentRichTextMessage$CommentRichTextSegment setImageSegment(LiveCommentRichText$CommentImageSegment p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 4;
       this.entry_ = p0;
       return this;
    }
    public LiveCommentRichTextMessage$CommentRichTextSegment setTextSegment(LiveCommentRichText$CommentTextSegment p0){
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
       i = 2;
       if (this.entryCase_ == i) {
          p0.writeMessage(i, this.entry_);
       }
       i = 3;
       if (this.entryCase_ == i) {
          p0.writeMessage(i, this.entry_);
       }
       i = 4;
       if (this.entryCase_ == i) {
          p0.writeMessage(i, this.entry_);
       }
       if (this.entryCase_ == 5) {
          p0.writeMessage(5, this.entry_);
       }
       super.writeTo(p0);
       return;
    }
}
