package com.kuaishou.livestream.message.nano.SCLiveSpecialTagClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveSpecialTagClose extends MessageNano	// class@001443
{
    public long tagId;
    public static SCLiveSpecialTagClose[] _emptyArray;

    public void SCLiveSpecialTagClose(){
       super();
       this.clear();
    }
    public static SCLiveSpecialTagClose[] emptyArray(){
       if (SCLiveSpecialTagClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveSpecialTagClose._emptyArray == null) {
             SCLiveSpecialTagClose[] sCLiveSpecia = new SCLiveSpecialTagClose[0];
             SCLiveSpecialTagClose._emptyArray = sCLiveSpecia;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveSpecialTagClose._emptyArray;
    }
    public static SCLiveSpecialTagClose parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveSpecialTagClose().mergeFrom(p0);
    }
    public static SCLiveSpecialTagClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveSpecialTagClose(), p0);
    }
    public SCLiveSpecialTagClose clear(){
       this.tagId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveSpecialTagClose ttagId = this.tagId;
       if (ttagId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttagId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveSpecialTagClose mergeFrom(CodedInputByteBufferNano p0){
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
             this.tagId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveSpecialTagClose ttagId = this.tagId;
       if (ttagId) {
          p0.writeUInt64(1, ttagId);
       }
       super.writeTo(p0);
       return;
    }
}
