package com.kuaishou.protobuf.livestream.nano.SCCommentFoldingMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.SCCommentFoldingMessage$FoldingMessage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class SCCommentFoldingMessage extends MessageNano	// class@000d31
{
    public SCCommentFoldingMessage$FoldingMessage[] foldingMessage;
    public static SCCommentFoldingMessage[] _emptyArray;

    public void SCCommentFoldingMessage(){
       super();
       this.clear();
    }
    public static SCCommentFoldingMessage[] emptyArray(){
       if (SCCommentFoldingMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCCommentFoldingMessage._emptyArray == null) {
             SCCommentFoldingMessage[] sCCommentFol = new SCCommentFoldingMessage[0];
             SCCommentFoldingMessage._emptyArray = sCCommentFol;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCCommentFoldingMessage._emptyArray;
    }
    public static SCCommentFoldingMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCCommentFoldingMessage().mergeFrom(p0);
    }
    public static SCCommentFoldingMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCCommentFoldingMessage(), p0);
    }
    public SCCommentFoldingMessage clear(){
       this.foldingMessage = SCCommentFoldingMessage$FoldingMessage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCCommentFoldingMessage tfoldingMess = this.foldingMessage;
       if (tfoldingMess != null && tfoldingMess.length > 0) {
          int i1 = 0;
          SCCommentFoldingMessage tfoldingMess1 = this.foldingMessage;
          while (i1 < tfoldingMess1.length) {
             object oobject = tfoldingMess1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCCommentFoldingMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             SCCommentFoldingMessage tfoldingMess = this.foldingMessage;
             int i2 = (tfoldingMess == null)? 0: tfoldingMess.length;
             i = i + i2;
             SCCommentFoldingMessage$FoldingMessage[] uFoldingMess = new SCCommentFoldingMessage$FoldingMessage[i];
             if (i2) {
                System.arraycopy(tfoldingMess, 0, uFoldingMess, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uFoldingMess[i2] = new SCCommentFoldingMessage$FoldingMessage();
                p0.readMessage(uFoldingMess[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uFoldingMess[i2] = new SCCommentFoldingMessage$FoldingMessage();
             p0.readMessage(uFoldingMess[i2]);
             this.foldingMessage = uFoldingMess;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCCommentFoldingMessage tfoldingMess = this.foldingMessage;
       if (tfoldingMess != null && tfoldingMess.length > 0) {
          int i = 0;
          SCCommentFoldingMessage tfoldingMess1 = this.foldingMessage;
          while (i < tfoldingMess1.length) {
             object oobject = tfoldingMess1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
