package com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionLiveRouterJump;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommentAction$ActionLiveRouterJump extends MessageNano	// class@000c48
{
    public String link;
    public static LiveCommentAction$ActionLiveRouterJump[] _emptyArray;

    public void LiveCommentAction$ActionLiveRouterJump(){
       super();
       this.clear();
    }
    public static LiveCommentAction$ActionLiveRouterJump[] emptyArray(){
       if (LiveCommentAction$ActionLiveRouterJump._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentAction$ActionLiveRouterJump._emptyArray == null) {
             LiveCommentAction$ActionLiveRouterJump[] uActionLiveR = new LiveCommentAction$ActionLiveRouterJump[0];
             LiveCommentAction$ActionLiveRouterJump._emptyArray = uActionLiveR;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentAction$ActionLiveRouterJump._emptyArray;
    }
    public static LiveCommentAction$ActionLiveRouterJump parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentAction$ActionLiveRouterJump().mergeFrom(p0);
    }
    public static LiveCommentAction$ActionLiveRouterJump parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentAction$ActionLiveRouterJump(), p0);
    }
    public LiveCommentAction$ActionLiveRouterJump clear(){
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
    public LiveCommentAction$ActionLiveRouterJump mergeFrom(CodedInputByteBufferNano p0){
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
