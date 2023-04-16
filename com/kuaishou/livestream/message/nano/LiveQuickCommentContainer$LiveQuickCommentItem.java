package com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$LiveQuickCommentItem;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuickCommentContainer$LiveQuickCommentItem extends MessageNano	// class@001255
{
    public String actionRouter;
    public String displayText;
    public String quickCommentId;
    public static LiveQuickCommentContainer$LiveQuickCommentItem[] _emptyArray;

    public void LiveQuickCommentContainer$LiveQuickCommentItem(){
       super();
       this.clear();
    }
    public static LiveQuickCommentContainer$LiveQuickCommentItem[] emptyArray(){
       if (LiveQuickCommentContainer$LiveQuickCommentItem._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuickCommentContainer$LiveQuickCommentItem._emptyArray == null) {
             LiveQuickCommentContainer$LiveQuickCommentItem[] liveQuickCom = new LiveQuickCommentContainer$LiveQuickCommentItem[0];
             LiveQuickCommentContainer$LiveQuickCommentItem._emptyArray = liveQuickCom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuickCommentContainer$LiveQuickCommentItem._emptyArray;
    }
    public static LiveQuickCommentContainer$LiveQuickCommentItem parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuickCommentContainer$LiveQuickCommentItem().mergeFrom(p0);
    }
    public static LiveQuickCommentContainer$LiveQuickCommentItem parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuickCommentContainer$LiveQuickCommentItem(), p0);
    }
    public LiveQuickCommentContainer$LiveQuickCommentItem clear(){
       this.displayText = "";
       this.actionRouter = "";
       this.quickCommentId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.displayText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.displayText);
       }
       if (!(this.actionRouter).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.actionRouter);
       }
       if (!(this.quickCommentId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.quickCommentId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuickCommentContainer$LiveQuickCommentItem mergeFrom(CodedInputByteBufferNano p0){
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
                   this.quickCommentId = p0.readString();
                }
             }else {
                this.actionRouter = p0.readString();
             }
          }else {
             this.displayText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.displayText).equals(str)) {
          p0.writeString(1, this.displayText);
       }
       if (!(this.actionRouter).equals(str)) {
          p0.writeString(2, this.actionRouter);
       }
       if (!(this.quickCommentId).equals(str)) {
          p0.writeString(3, this.quickCommentId);
       }
       super.writeTo(p0);
       return;
    }
}
