package com.kuaishou.livestream.message.nano.SCLiveTagClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveTagClose extends MessageNano	// class@001447
{
    public int reason;
    public long tagId;
    public static SCLiveTagClose[] _emptyArray;

    public void SCLiveTagClose(){
       super();
       this.clear();
    }
    public static SCLiveTagClose[] emptyArray(){
       if (SCLiveTagClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveTagClose._emptyArray == null) {
             SCLiveTagClose[] sCLiveTagClo = new SCLiveTagClose[0];
             SCLiveTagClose._emptyArray = sCLiveTagClo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveTagClose._emptyArray;
    }
    public static SCLiveTagClose parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveTagClose().mergeFrom(p0);
    }
    public static SCLiveTagClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveTagClose(), p0);
    }
    public SCLiveTagClose clear(){
       this.tagId = 0;
       this.reason = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveTagClose ttagId = this.tagId;
       if (ttagId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttagId);
       }
       ttagId = this.reason;
       if (ttagId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ttagId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveTagClose mergeFrom(CodedInputByteBufferNano p0){
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
                   this.reason = i;
                }
             }
          }else {
             this.tagId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveTagClose ttagId = this.tagId;
       if (ttagId) {
          p0.writeUInt64(1, ttagId);
       }
       ttagId = this.reason;
       if (ttagId != null) {
          p0.writeInt32(2, ttagId);
       }
       super.writeTo(p0);
       return;
    }
}
