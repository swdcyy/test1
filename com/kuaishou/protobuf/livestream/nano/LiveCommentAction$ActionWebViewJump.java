package com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionWebViewJump;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommentAction$ActionWebViewJump extends MessageNano	// class@000c4b
{
    public float heightRatio;
    public String link;
    public static LiveCommentAction$ActionWebViewJump[] _emptyArray;

    public void LiveCommentAction$ActionWebViewJump(){
       super();
       this.clear();
    }
    public static LiveCommentAction$ActionWebViewJump[] emptyArray(){
       if (LiveCommentAction$ActionWebViewJump._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentAction$ActionWebViewJump._emptyArray == null) {
             LiveCommentAction$ActionWebViewJump[] uActionWebVi = new LiveCommentAction$ActionWebViewJump[0];
             LiveCommentAction$ActionWebViewJump._emptyArray = uActionWebVi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentAction$ActionWebViewJump._emptyArray;
    }
    public static LiveCommentAction$ActionWebViewJump parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentAction$ActionWebViewJump().mergeFrom(p0);
    }
    public static LiveCommentAction$ActionWebViewJump parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentAction$ActionWebViewJump(), p0);
    }
    public LiveCommentAction$ActionWebViewJump clear(){
       this.link = "";
       this.heightRatio = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.link).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.link);
       }
       if (Float.floatToIntBits(this.heightRatio) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(2, this.heightRatio);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentAction$ActionWebViewJump mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 21) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.heightRatio = p0.readFloat();
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
       if (Float.floatToIntBits(this.heightRatio) != Float.floatToIntBits(0)) {
          p0.writeFloat(2, this.heightRatio);
       }
       super.writeTo(p0);
       return;
    }
}
