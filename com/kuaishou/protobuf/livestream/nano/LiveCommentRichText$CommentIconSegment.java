package com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentIconSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$TextStyle;

public final class LiveCommentRichText$CommentIconSegment extends MessageNano	// class@000c4f
{
    public boolean enableStretch;
    public String iconPath;
    public String resPackId;
    public LiveCommentAction$Action tapAction;
    public String text;
    public LiveCommentRichText$TextStyle textStyle;
    public static LiveCommentRichText$CommentIconSegment[] _emptyArray;

    public void LiveCommentRichText$CommentIconSegment(){
       super();
       this.clear();
    }
    public static LiveCommentRichText$CommentIconSegment[] emptyArray(){
       if (LiveCommentRichText$CommentIconSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentRichText$CommentIconSegment._emptyArray == null) {
             LiveCommentRichText$CommentIconSegment[] uCommentIcon = new LiveCommentRichText$CommentIconSegment[0];
             LiveCommentRichText$CommentIconSegment._emptyArray = uCommentIcon;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentRichText$CommentIconSegment._emptyArray;
    }
    public static LiveCommentRichText$CommentIconSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentRichText$CommentIconSegment().mergeFrom(p0);
    }
    public static LiveCommentRichText$CommentIconSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentRichText$CommentIconSegment(), p0);
    }
    public LiveCommentRichText$CommentIconSegment clear(){
       this.resPackId = "";
       this.iconPath = "";
       this.enableStretch = false;
       this.text = "";
       this.textStyle = null;
       this.tapAction = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.resPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.resPackId);
       }
       if (!(this.iconPath).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.iconPath);
       }
       LiveCommentRichText$CommentIconSegment tenableStret = this.enableStretch;
       if (tenableStret != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tenableStret);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.text);
       }
       tenableStret = this.textStyle;
       if (tenableStret != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tenableStret);
       }
       tenableStret = this.tapAction;
       if (tenableStret != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tenableStret);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentRichText$CommentIconSegment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
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
                }else {
                   this.enableStretch = p0.readBool();
                }
             }else {
                this.iconPath = p0.readString();
             }
          }else {
             this.resPackId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.resPackId).equals(str)) {
          p0.writeString(1, this.resPackId);
       }
       if (!(this.iconPath).equals(str)) {
          p0.writeString(2, this.iconPath);
       }
       LiveCommentRichText$CommentIconSegment tenableStret = this.enableStretch;
       if (tenableStret != null) {
          p0.writeBool(3, tenableStret);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(4, this.text);
       }
       tenableStret = this.textStyle;
       if (tenableStret != null) {
          p0.writeMessage(5, tenableStret);
       }
       tenableStret = this.tapAction;
       if (tenableStret != null) {
          p0.writeMessage(6, tenableStret);
       }
       super.writeTo(p0);
       return;
    }
}
