package com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$ButtonSegment;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$GiftSegment;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$ImageSegment;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$PlainSegment;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$AudienceStateSegment;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$UserInfoSegment;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.util.Objects;

public final class LiveStreamRichTextFeed$RichTextSegment extends MessageNano	// class@001397
{
    public int contentCase_;
    public Object content_;
    public static LiveStreamRichTextFeed$RichTextSegment[] _emptyArray;

    public void LiveStreamRichTextFeed$RichTextSegment(){
       super();
       this.contentCase_ = 0;
       this.clear();
    }
    public static LiveStreamRichTextFeed$RichTextSegment[] emptyArray(){
       if (LiveStreamRichTextFeed$RichTextSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamRichTextFeed$RichTextSegment._emptyArray == null) {
             LiveStreamRichTextFeed$RichTextSegment[] richTextSegm = new LiveStreamRichTextFeed$RichTextSegment[0];
             LiveStreamRichTextFeed$RichTextSegment._emptyArray = richTextSegm;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamRichTextFeed$RichTextSegment._emptyArray;
    }
    public static LiveStreamRichTextFeed$RichTextSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamRichTextFeed$RichTextSegment().mergeFrom(p0);
    }
    public static LiveStreamRichTextFeed$RichTextSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamRichTextFeed$RichTextSegment(), p0);
    }
    public LiveStreamRichTextFeed$RichTextSegment clear(){
       this.clearContent();
       this.cachedSize = -1;
       return this;
    }
    public LiveStreamRichTextFeed$RichTextSegment clearContent(){
       this.contentCase_ = 0;
       this.content_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       int i1 = 1;
       if (this.contentCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.content_);
       }
       i1 = 2;
       if (this.contentCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.content_);
       }
       i1 = 3;
       if (this.contentCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.content_);
       }
       i1 = 4;
       if (this.contentCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.content_);
       }
       i1 = 5;
       if (this.contentCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.content_);
       }
       if (this.contentCase_ == 6) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, this.content_);
       }
       return i;
    }
    public LiveStreamRichTextFeed$ButtonSegment getButton(){
       if (this.contentCase_ == 4) {
          return this.content_;
       }
       return null;
    }
    public int getContentCase(){
       return this.contentCase_;
    }
    public LiveStreamRichTextFeed$GiftSegment getGift(){
       if (this.contentCase_ == 5) {
          return this.content_;
       }
       return null;
    }
    public LiveStreamRichTextFeed$ImageSegment getImage(){
       if (this.contentCase_ == 3) {
          return this.content_;
       }
       return null;
    }
    public LiveStreamRichTextFeed$PlainSegment getPlain(){
       if (this.contentCase_ == 2) {
          return this.content_;
       }
       return null;
    }
    public LiveStreamRichTextFeed$AudienceStateSegment getState(){
       if (this.contentCase_ == 6) {
          return this.content_;
       }
       return null;
    }
    public LiveStreamRichTextFeed$UserInfoSegment getUserInfo(){
       if (this.contentCase_ == 1) {
          return this.content_;
       }
       return null;
    }
    public boolean hasButton(){
       boolean b = (this.contentCase_ == 4)? true: false;
       return b;
    }
    public boolean hasGift(){
       boolean b = (this.contentCase_ == 5)? true: false;
       return b;
    }
    public boolean hasImage(){
       boolean b = (this.contentCase_ == 3)? true: false;
       return b;
    }
    public boolean hasPlain(){
       boolean b = (this.contentCase_ == 2)? true: false;
       return b;
    }
    public boolean hasState(){
       boolean b = (this.contentCase_ == 6)? true: false;
       return b;
    }
    public boolean hasUserInfo(){
       boolean b = true;
       if (this.contentCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamRichTextFeed$RichTextSegment mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i1 = 6;
                            if (this.contentCase_ != i1) {
                               this.content_ = new LiveStreamRichTextFeed$AudienceStateSegment();
                            }
                            p0.readMessage(this.content_);
                            this.contentCase_ = i1;
                         }
                      }else {
                         i1 = 5;
                         if (this.contentCase_ != i1) {
                            this.content_ = new LiveStreamRichTextFeed$GiftSegment();
                         }
                         p0.readMessage(this.content_);
                         this.contentCase_ = i1;
                      }
                   }else {
                      i1 = 4;
                      if (this.contentCase_ != i1) {
                         this.content_ = new LiveStreamRichTextFeed$ButtonSegment();
                      }
                      p0.readMessage(this.content_);
                      this.contentCase_ = i1;
                   }
                }else {
                   i1 = 3;
                   if (this.contentCase_ != i1) {
                      this.content_ = new LiveStreamRichTextFeed$ImageSegment();
                   }
                   p0.readMessage(this.content_);
                   this.contentCase_ = i1;
                }
             }else {
                i1 = 2;
                if (this.contentCase_ != i1) {
                   this.content_ = new LiveStreamRichTextFeed$PlainSegment();
                }
                p0.readMessage(this.content_);
                this.contentCase_ = i1;
             }
          }else {
             i1 = 1;
             if (this.contentCase_ != i1) {
                this.content_ = new LiveStreamRichTextFeed$UserInfoSegment();
             }
             p0.readMessage(this.content_);
             this.contentCase_ = i1;
          }
       }
       return this;
    }
    public LiveStreamRichTextFeed$RichTextSegment setButton(LiveStreamRichTextFeed$ButtonSegment p0){
       Objects.requireNonNull(p0);
       this.contentCase_ = 4;
       this.content_ = p0;
       return this;
    }
    public LiveStreamRichTextFeed$RichTextSegment setGift(LiveStreamRichTextFeed$GiftSegment p0){
       Objects.requireNonNull(p0);
       this.contentCase_ = 5;
       this.content_ = p0;
       return this;
    }
    public LiveStreamRichTextFeed$RichTextSegment setImage(LiveStreamRichTextFeed$ImageSegment p0){
       Objects.requireNonNull(p0);
       this.contentCase_ = 3;
       this.content_ = p0;
       return this;
    }
    public LiveStreamRichTextFeed$RichTextSegment setPlain(LiveStreamRichTextFeed$PlainSegment p0){
       Objects.requireNonNull(p0);
       this.contentCase_ = 2;
       this.content_ = p0;
       return this;
    }
    public LiveStreamRichTextFeed$RichTextSegment setState(LiveStreamRichTextFeed$AudienceStateSegment p0){
       Objects.requireNonNull(p0);
       this.contentCase_ = 6;
       this.content_ = p0;
       return this;
    }
    public LiveStreamRichTextFeed$RichTextSegment setUserInfo(LiveStreamRichTextFeed$UserInfoSegment p0){
       Objects.requireNonNull(p0);
       this.contentCase_ = 1;
       this.content_ = p0;
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i = 1;
       if (this.contentCase_ == i) {
          p0.writeMessage(i, this.content_);
       }
       i = 2;
       if (this.contentCase_ == i) {
          p0.writeMessage(i, this.content_);
       }
       i = 3;
       if (this.contentCase_ == i) {
          p0.writeMessage(i, this.content_);
       }
       i = 4;
       if (this.contentCase_ == i) {
          p0.writeMessage(i, this.content_);
       }
       i = 5;
       if (this.contentCase_ == i) {
          p0.writeMessage(i, this.content_);
       }
       if (this.contentCase_ == 6) {
          p0.writeMessage(6, this.content_);
       }
       super.writeTo(p0);
       return;
    }
}
