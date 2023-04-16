package com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionFollow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommentAction$ActionFollow extends MessageNano	// class@000c46
{
    public long targetUid;
    public static LiveCommentAction$ActionFollow[] _emptyArray;

    public void LiveCommentAction$ActionFollow(){
       super();
       this.clear();
    }
    public static LiveCommentAction$ActionFollow[] emptyArray(){
       if (LiveCommentAction$ActionFollow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentAction$ActionFollow._emptyArray == null) {
             LiveCommentAction$ActionFollow[] uActionFollo = new LiveCommentAction$ActionFollow[0];
             LiveCommentAction$ActionFollow._emptyArray = uActionFollo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentAction$ActionFollow._emptyArray;
    }
    public static LiveCommentAction$ActionFollow parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentAction$ActionFollow().mergeFrom(p0);
    }
    public static LiveCommentAction$ActionFollow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentAction$ActionFollow(), p0);
    }
    public LiveCommentAction$ActionFollow clear(){
       this.targetUid = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommentAction$ActionFollow ttargetUid = this.targetUid;
       if (ttargetUid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttargetUid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentAction$ActionFollow mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.targetUid = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommentAction$ActionFollow ttargetUid = this.targetUid;
       if (ttargetUid) {
          p0.writeUInt64(1, ttargetUid);
       }
       super.writeTo(p0);
       return;
    }
}
