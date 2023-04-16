package com.kuaishou.protobuf.livestream.nano.LiveMultiPkBottomTip;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiPkBottomTip extends MessageNano	// class@000cb8
{
    public long displayMs;
    public String displayText;
    public static LiveMultiPkBottomTip[] _emptyArray;

    public void LiveMultiPkBottomTip(){
       super();
       this.clear();
    }
    public static LiveMultiPkBottomTip[] emptyArray(){
       if (LiveMultiPkBottomTip._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkBottomTip._emptyArray == null) {
             LiveMultiPkBottomTip[] liveMultiPkB = new LiveMultiPkBottomTip[0];
             LiveMultiPkBottomTip._emptyArray = liveMultiPkB;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkBottomTip._emptyArray;
    }
    public static LiveMultiPkBottomTip parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkBottomTip().mergeFrom(p0);
    }
    public static LiveMultiPkBottomTip parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkBottomTip(), p0);
    }
    public LiveMultiPkBottomTip clear(){
       this.displayText = "";
       this.displayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.displayText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.displayText);
       }
       LiveMultiPkBottomTip tdisplayMs = this.displayMs;
       if (tdisplayMs) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tdisplayMs);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkBottomTip mergeFrom(CodedInputByteBufferNano p0){
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
                this.displayMs = p0.readUInt64();
             }
          }else {
             this.displayText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.displayText).equals("")) {
          p0.writeString(1, this.displayText);
       }
       LiveMultiPkBottomTip tdisplayMs = this.displayMs;
       if (tdisplayMs) {
          p0.writeUInt64(2, tdisplayMs);
       }
       super.writeTo(p0);
       return;
    }
}
