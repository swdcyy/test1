package com.kuaishou.protobuf.gamezone.nano.SCGzoneDataChangeNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneDataChangeNotice extends MessageNano	// class@000bd4
{
    public int bizId;
    public long delayRandomMaxMills;
    public long serverTimeMills;
    public static SCGzoneDataChangeNotice[] _emptyArray;

    public void SCGzoneDataChangeNotice(){
       super();
       this.clear();
    }
    public static SCGzoneDataChangeNotice[] emptyArray(){
       if (SCGzoneDataChangeNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneDataChangeNotice._emptyArray == null) {
             SCGzoneDataChangeNotice[] sCGzoneDataC = new SCGzoneDataChangeNotice[0];
             SCGzoneDataChangeNotice._emptyArray = sCGzoneDataC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneDataChangeNotice._emptyArray;
    }
    public static SCGzoneDataChangeNotice parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneDataChangeNotice().mergeFrom(p0);
    }
    public static SCGzoneDataChangeNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneDataChangeNotice(), p0);
    }
    public SCGzoneDataChangeNotice clear(){
       this.bizId = 0;
       this.delayRandomMaxMills = 0;
       this.serverTimeMills = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneDataChangeNotice tbizId = this.bizId;
       if (tbizId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tbizId);
       }
       tbizId = this.delayRandomMaxMills;
       int i1 = 0;
       if (tbizId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tbizId);
       }
       tbizId = this.serverTimeMills;
       if (tbizId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tbizId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneDataChangeNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.serverTimeMills = p0.readUInt64();
                }
             }else {
                this.delayRandomMaxMills = p0.readUInt64();
             }
          }else {
             this.bizId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneDataChangeNotice tbizId = this.bizId;
       if (tbizId != null) {
          p0.writeUInt32(1, tbizId);
       }
       tbizId = this.delayRandomMaxMills;
       int i = 0;
       if (tbizId - i) {
          p0.writeUInt64(2, tbizId);
       }
       tbizId = this.serverTimeMills;
       if (tbizId - i) {
          p0.writeUInt64(3, tbizId);
       }
       super.writeTo(p0);
       return;
    }
}
