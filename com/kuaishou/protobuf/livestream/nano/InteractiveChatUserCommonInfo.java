package com.kuaishou.protobuf.livestream.nano.InteractiveChatUserCommonInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveChatUserCommonInfo extends MessageNano	// class@000c1b
{
    public int mediaType;
    public boolean muteState;
    public static InteractiveChatUserCommonInfo[] _emptyArray;

    public void InteractiveChatUserCommonInfo(){
       super();
       this.clear();
    }
    public static InteractiveChatUserCommonInfo[] emptyArray(){
       if (InteractiveChatUserCommonInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatUserCommonInfo._emptyArray == null) {
             InteractiveChatUserCommonInfo[] interactiveC = new InteractiveChatUserCommonInfo[0];
             InteractiveChatUserCommonInfo._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatUserCommonInfo._emptyArray;
    }
    public static InteractiveChatUserCommonInfo parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatUserCommonInfo().mergeFrom(p0);
    }
    public static InteractiveChatUserCommonInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatUserCommonInfo(), p0);
    }
    public InteractiveChatUserCommonInfo clear(){
       this.muteState = false;
       this.mediaType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatUserCommonInfo tmuteState = this.muteState;
       if (tmuteState != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tmuteState);
       }
       tmuteState = this.mediaType;
       if (tmuteState != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tmuteState);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatUserCommonInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.mediaType = i;
                }
             }
          }else {
             this.muteState = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       InteractiveChatUserCommonInfo tmuteState = this.muteState;
       if (tmuteState != null) {
          p0.writeBool(1, tmuteState);
       }
       tmuteState = this.mediaType;
       if (tmuteState != null) {
          p0.writeInt32(2, tmuteState);
       }
       super.writeTo(p0);
       return;
    }
}
