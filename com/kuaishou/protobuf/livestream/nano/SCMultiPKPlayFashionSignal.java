package com.kuaishou.protobuf.livestream.nano.SCMultiPKPlayFashionSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.MultiPKPlayFashionInfo;
import com.kuaishou.protobuf.livestream.nano.MultiPKSignalCommonInfo;

public final class SCMultiPKPlayFashionSignal extends MessageNano	// class@000d75
{
    public MultiPKSignalCommonInfo commonInfo;
    public MultiPKPlayFashionInfo playFashionInfo;
    public static SCMultiPKPlayFashionSignal[] _emptyArray;

    public void SCMultiPKPlayFashionSignal(){
       super();
       this.clear();
    }
    public static SCMultiPKPlayFashionSignal[] emptyArray(){
       if (SCMultiPKPlayFashionSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCMultiPKPlayFashionSignal._emptyArray == null) {
             SCMultiPKPlayFashionSignal[] sCMultiPKPla = new SCMultiPKPlayFashionSignal[0];
             SCMultiPKPlayFashionSignal._emptyArray = sCMultiPKPla;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCMultiPKPlayFashionSignal._emptyArray;
    }
    public static SCMultiPKPlayFashionSignal parseFrom(CodedInputByteBufferNano p0){
       return new SCMultiPKPlayFashionSignal().mergeFrom(p0);
    }
    public static SCMultiPKPlayFashionSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCMultiPKPlayFashionSignal(), p0);
    }
    public SCMultiPKPlayFashionSignal clear(){
       this.commonInfo = null;
       this.playFashionInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCMultiPKPlayFashionSignal tcommonInfo = this.commonInfo;
       if (tcommonInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tcommonInfo);
       }
       tcommonInfo = this.playFashionInfo;
       if (tcommonInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tcommonInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCMultiPKPlayFashionSignal mergeFrom(CodedInputByteBufferNano p0){
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
             }else if(this.playFashionInfo == null){
                this.playFashionInfo = new MultiPKPlayFashionInfo();
             }
             p0.readMessage(this.playFashionInfo);
          }else if(this.commonInfo == null){
             this.commonInfo = new MultiPKSignalCommonInfo();
          }
          p0.readMessage(this.commonInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCMultiPKPlayFashionSignal tcommonInfo = this.commonInfo;
       if (tcommonInfo != null) {
          p0.writeMessage(1, tcommonInfo);
       }
       tcommonInfo = this.playFashionInfo;
       if (tcommonInfo != null) {
          p0.writeMessage(2, tcommonInfo);
       }
       super.writeTo(p0);
       return;
    }
}
