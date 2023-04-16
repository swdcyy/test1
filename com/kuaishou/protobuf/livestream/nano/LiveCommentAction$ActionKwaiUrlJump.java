package com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionKwaiUrlJump;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommentAction$ActionKwaiUrlJump extends MessageNano	// class@000c47
{
    public String link;
    public static LiveCommentAction$ActionKwaiUrlJump[] _emptyArray;

    public void LiveCommentAction$ActionKwaiUrlJump(){
       super();
       this.clear();
    }
    public static LiveCommentAction$ActionKwaiUrlJump[] emptyArray(){
       if (LiveCommentAction$ActionKwaiUrlJump._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentAction$ActionKwaiUrlJump._emptyArray == null) {
             LiveCommentAction$ActionKwaiUrlJump[] uActionKwaiU = new LiveCommentAction$ActionKwaiUrlJump[0];
             LiveCommentAction$ActionKwaiUrlJump._emptyArray = uActionKwaiU;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentAction$ActionKwaiUrlJump._emptyArray;
    }
    public static LiveCommentAction$ActionKwaiUrlJump parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentAction$ActionKwaiUrlJump().mergeFrom(p0);
    }
    public static LiveCommentAction$ActionKwaiUrlJump parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentAction$ActionKwaiUrlJump(), p0);
    }
    public LiveCommentAction$ActionKwaiUrlJump clear(){
       this.link = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.link).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.link);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentAction$ActionKwaiUrlJump mergeFrom(CodedInputByteBufferNano p0){
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
             this.link = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.link).equals("")) {
          p0.writeString(1, this.link);
       }
       super.writeTo(p0);
       return;
    }
}
