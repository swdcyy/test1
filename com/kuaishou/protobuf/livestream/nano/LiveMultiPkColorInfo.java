package com.kuaishou.protobuf.livestream.nano.LiveMultiPkColorInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiPkColorInfo extends MessageNano	// class@000cb9
{
    public String endColor;
    public String startColor;
    public static LiveMultiPkColorInfo[] _emptyArray;

    public void LiveMultiPkColorInfo(){
       super();
       this.clear();
    }
    public static LiveMultiPkColorInfo[] emptyArray(){
       if (LiveMultiPkColorInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkColorInfo._emptyArray == null) {
             LiveMultiPkColorInfo[] liveMultiPkC = new LiveMultiPkColorInfo[0];
             LiveMultiPkColorInfo._emptyArray = liveMultiPkC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkColorInfo._emptyArray;
    }
    public static LiveMultiPkColorInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkColorInfo().mergeFrom(p0);
    }
    public static LiveMultiPkColorInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkColorInfo(), p0);
    }
    public LiveMultiPkColorInfo clear(){
       this.startColor = "";
       this.endColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.startColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.startColor);
       }
       if (!(this.endColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.endColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkColorInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.endColor = p0.readString();
             }
          }else {
             this.startColor = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.startColor).equals(str)) {
          p0.writeString(1, this.startColor);
       }
       if (!(this.endColor).equals(str)) {
          p0.writeString(2, this.endColor);
       }
       super.writeTo(p0);
       return;
    }
}
