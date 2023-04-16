package com.kuaishou.protobuf.livestream.nano.LiveMultiChatEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiChatEnd extends MessageNano	// class@000ca6
{
    public boolean enableUpdateLayoutTheme;
    public static LiveMultiChatEnd[] _emptyArray;

    public void LiveMultiChatEnd(){
       super();
       this.clear();
    }
    public static LiveMultiChatEnd[] emptyArray(){
       if (LiveMultiChatEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiChatEnd._emptyArray == null) {
             LiveMultiChatEnd[] liveMultiCha = new LiveMultiChatEnd[0];
             LiveMultiChatEnd._emptyArray = liveMultiCha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiChatEnd._emptyArray;
    }
    public static LiveMultiChatEnd parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiChatEnd().mergeFrom(p0);
    }
    public static LiveMultiChatEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiChatEnd(), p0);
    }
    public LiveMultiChatEnd clear(){
       this.enableUpdateLayoutTheme = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiChatEnd tenableUpdat = this.enableUpdateLayoutTheme;
       if (tenableUpdat != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tenableUpdat);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiChatEnd mergeFrom(CodedInputByteBufferNano p0){
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
             this.enableUpdateLayoutTheme = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiChatEnd tenableUpdat = this.enableUpdateLayoutTheme;
       if (tenableUpdat != null) {
          p0.writeBool(1, tenableUpdat);
       }
       super.writeTo(p0);
       return;
    }
}
