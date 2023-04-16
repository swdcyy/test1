package com.kuaishou.protobuf.livestream.nano.SCMultiChatClosedExtInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCMultiChatClosedExtInfo extends MessageNano	// class@000d72
{
    public int endType;
    public static SCMultiChatClosedExtInfo[] _emptyArray;

    public void SCMultiChatClosedExtInfo(){
       super();
       this.clear();
    }
    public static SCMultiChatClosedExtInfo[] emptyArray(){
       if (SCMultiChatClosedExtInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCMultiChatClosedExtInfo._emptyArray == null) {
             SCMultiChatClosedExtInfo[] sCMultiChatC = new SCMultiChatClosedExtInfo[0];
             SCMultiChatClosedExtInfo._emptyArray = sCMultiChatC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCMultiChatClosedExtInfo._emptyArray;
    }
    public static SCMultiChatClosedExtInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCMultiChatClosedExtInfo().mergeFrom(p0);
    }
    public static SCMultiChatClosedExtInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCMultiChatClosedExtInfo(), p0);
    }
    public SCMultiChatClosedExtInfo clear(){
       this.endType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCMultiChatClosedExtInfo tendType = this.endType;
       if (tendType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tendType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCMultiChatClosedExtInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 16) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = p0.readInt32();
             if (i) {
                continue ;
             }else {
                this.endType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCMultiChatClosedExtInfo tendType = this.endType;
       if (tendType != null) {
          p0.writeInt32(2, tendType);
       }
       super.writeTo(p0);
       return;
    }
}
