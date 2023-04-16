package com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiLineChatNotice extends MessageNano	// class@000cb4
{
    public String content;
    public long displayDuration;
    public static LiveMultiLineChatNotice[] _emptyArray;

    public void LiveMultiLineChatNotice(){
       super();
       this.clear();
    }
    public static LiveMultiLineChatNotice[] emptyArray(){
       if (LiveMultiLineChatNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiLineChatNotice._emptyArray == null) {
             LiveMultiLineChatNotice[] liveMultiLin = new LiveMultiLineChatNotice[0];
             LiveMultiLineChatNotice._emptyArray = liveMultiLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiLineChatNotice._emptyArray;
    }
    public static LiveMultiLineChatNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiLineChatNotice().mergeFrom(p0);
    }
    public static LiveMultiLineChatNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiLineChatNotice(), p0);
    }
    public LiveMultiLineChatNotice clear(){
       this.content = "";
       this.displayDuration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.content).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.content);
       }
       LiveMultiLineChatNotice tdisplayDura = this.displayDuration;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tdisplayDura);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiLineChatNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.displayDuration = p0.readUInt64();
             }
          }else {
             this.content = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.content).equals("")) {
          p0.writeString(1, this.content);
       }
       LiveMultiLineChatNotice tdisplayDura = this.displayDuration;
       if (tdisplayDura) {
          p0.writeUInt64(2, tdisplayDura);
       }
       super.writeTo(p0);
       return;
    }
}
