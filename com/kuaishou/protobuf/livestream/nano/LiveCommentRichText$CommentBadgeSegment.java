package com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentBadgeSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;

public final class LiveCommentRichText$CommentBadgeSegment extends MessageNano	// class@000c4d
{
    public String badgeAnimationKey;
    public String badgeKey;
    public LiveCommentAction$Action tapAction;
    public static LiveCommentRichText$CommentBadgeSegment[] _emptyArray;

    public void LiveCommentRichText$CommentBadgeSegment(){
       super();
       this.clear();
    }
    public static LiveCommentRichText$CommentBadgeSegment[] emptyArray(){
       if (LiveCommentRichText$CommentBadgeSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentRichText$CommentBadgeSegment._emptyArray == null) {
             LiveCommentRichText$CommentBadgeSegment[] uCommentBadg = new LiveCommentRichText$CommentBadgeSegment[0];
             LiveCommentRichText$CommentBadgeSegment._emptyArray = uCommentBadg;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentRichText$CommentBadgeSegment._emptyArray;
    }
    public static LiveCommentRichText$CommentBadgeSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentRichText$CommentBadgeSegment().mergeFrom(p0);
    }
    public static LiveCommentRichText$CommentBadgeSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentRichText$CommentBadgeSegment(), p0);
    }
    public LiveCommentRichText$CommentBadgeSegment clear(){
       this.badgeKey = "";
       this.tapAction = null;
       this.badgeAnimationKey = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.badgeKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.badgeKey);
       }
       LiveCommentRichText$CommentBadgeSegment ttapAction = this.tapAction;
       if (ttapAction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ttapAction);
       }
       if (!(this.badgeAnimationKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.badgeAnimationKey);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentRichText$CommentBadgeSegment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.badgeAnimationKey = p0.readString();
                }
             }else if(this.tapAction == null){
                this.tapAction = new LiveCommentAction$Action();
             }
             p0.readMessage(this.tapAction);
          }else {
             this.badgeKey = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.badgeKey).equals(str)) {
          p0.writeString(1, this.badgeKey);
       }
       LiveCommentRichText$CommentBadgeSegment ttapAction = this.tapAction;
       if (ttapAction != null) {
          p0.writeMessage(2, ttapAction);
       }
       if (!(this.badgeAnimationKey).equals(str)) {
          p0.writeString(3, this.badgeAnimationKey);
       }
       super.writeTo(p0);
       return;
    }
}
