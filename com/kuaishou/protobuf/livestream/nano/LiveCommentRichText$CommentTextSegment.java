package com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentTextSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$TextStyle;

public final class LiveCommentRichText$CommentTextSegment extends MessageNano	// class@000c51
{
    public LiveCommentAction$Action tapAction;
    public String text;
    public LiveCommentRichText$TextStyle textStyle;
    public static LiveCommentRichText$CommentTextSegment[] _emptyArray;

    public void LiveCommentRichText$CommentTextSegment(){
       super();
       this.clear();
    }
    public static LiveCommentRichText$CommentTextSegment[] emptyArray(){
       if (LiveCommentRichText$CommentTextSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentRichText$CommentTextSegment._emptyArray == null) {
             LiveCommentRichText$CommentTextSegment[] uCommentText = new LiveCommentRichText$CommentTextSegment[0];
             LiveCommentRichText$CommentTextSegment._emptyArray = uCommentText;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentRichText$CommentTextSegment._emptyArray;
    }
    public static LiveCommentRichText$CommentTextSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentRichText$CommentTextSegment().mergeFrom(p0);
    }
    public static LiveCommentRichText$CommentTextSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentRichText$CommentTextSegment(), p0);
    }
    public LiveCommentRichText$CommentTextSegment clear(){
       this.text = "";
       this.textStyle = null;
       this.tapAction = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.text).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.text);
       }
       LiveCommentRichText$CommentTextSegment ttextStyle = this.textStyle;
       if (ttextStyle != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ttextStyle);
       }
       ttextStyle = this.tapAction;
       if (ttextStyle != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ttextStyle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentRichText$CommentTextSegment mergeFrom(CodedInputByteBufferNano p0){
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
                }else if(this.tapAction == null){
                   this.tapAction = new LiveCommentAction$Action();
                }
                p0.readMessage(this.tapAction);
             }else if(this.textStyle == null){
                this.textStyle = new LiveCommentRichText$TextStyle();
             }
             p0.readMessage(this.textStyle);
          }else {
             this.text = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.text).equals("")) {
          p0.writeString(1, this.text);
       }
       LiveCommentRichText$CommentTextSegment ttextStyle = this.textStyle;
       if (ttextStyle != null) {
          p0.writeMessage(2, ttextStyle);
       }
       ttextStyle = this.tapAction;
       if (ttextStyle != null) {
          p0.writeMessage(3, ttextStyle);
       }
       super.writeTo(p0);
       return;
    }
}
