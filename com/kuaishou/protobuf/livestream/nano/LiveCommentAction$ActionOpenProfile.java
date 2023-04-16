package com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionOpenProfile;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommentAction$ActionOpenProfile extends MessageNano	// class@000c49
{
    public long targetUid;
    public static LiveCommentAction$ActionOpenProfile[] _emptyArray;

    public void LiveCommentAction$ActionOpenProfile(){
       super();
       this.clear();
    }
    public static LiveCommentAction$ActionOpenProfile[] emptyArray(){
       if (LiveCommentAction$ActionOpenProfile._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentAction$ActionOpenProfile._emptyArray == null) {
             LiveCommentAction$ActionOpenProfile[] uActionOpenP = new LiveCommentAction$ActionOpenProfile[0];
             LiveCommentAction$ActionOpenProfile._emptyArray = uActionOpenP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentAction$ActionOpenProfile._emptyArray;
    }
    public static LiveCommentAction$ActionOpenProfile parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentAction$ActionOpenProfile().mergeFrom(p0);
    }
    public static LiveCommentAction$ActionOpenProfile parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentAction$ActionOpenProfile(), p0);
    }
    public LiveCommentAction$ActionOpenProfile clear(){
       this.targetUid = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommentAction$ActionOpenProfile ttargetUid = this.targetUid;
       if (ttargetUid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttargetUid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentAction$ActionOpenProfile mergeFrom(CodedInputByteBufferNano p0){
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
       LiveCommentAction$ActionOpenProfile ttargetUid = this.targetUid;
       if (ttargetUid) {
          p0.writeUInt64(1, ttargetUid);
       }
       super.writeTo(p0);
       return;
    }
}
