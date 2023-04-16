package com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatUserExtraInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiLineChatUserExtraInfo extends MessageNano	// class@000cb5
{
    public int matchType;
    public static LiveMultiLineChatUserExtraInfo[] _emptyArray;

    public void LiveMultiLineChatUserExtraInfo(){
       super();
       this.clear();
    }
    public static LiveMultiLineChatUserExtraInfo[] emptyArray(){
       if (LiveMultiLineChatUserExtraInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiLineChatUserExtraInfo._emptyArray == null) {
             LiveMultiLineChatUserExtraInfo[] liveMultiLin = new LiveMultiLineChatUserExtraInfo[0];
             LiveMultiLineChatUserExtraInfo._emptyArray = liveMultiLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiLineChatUserExtraInfo._emptyArray;
    }
    public static LiveMultiLineChatUserExtraInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiLineChatUserExtraInfo().mergeFrom(p0);
    }
    public static LiveMultiLineChatUserExtraInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiLineChatUserExtraInfo(), p0);
    }
    public LiveMultiLineChatUserExtraInfo clear(){
       this.matchType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiLineChatUserExtraInfo tmatchType = this.matchType;
       if (tmatchType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmatchType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiLineChatUserExtraInfo mergeFrom(CodedInputByteBufferNano p0){
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
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 7:
                 case 1:
                   break;
                 default:
             }
             this.matchType = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiLineChatUserExtraInfo tmatchType = this.matchType;
       if (tmatchType != null) {
          p0.writeInt32(1, tmatchType);
       }
       super.writeTo(p0);
       return;
    }
}
