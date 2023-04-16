package com.kuaishou.livestream.message.nano.SCLiveRecordState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveRecordState extends MessageNano	// class@00143c
{
    public boolean enableRecord;
    public long maxRecordDurationMs;
    public long minRecordDurationMs;
    public String tips;
    public static SCLiveRecordState[] _emptyArray;

    public void SCLiveRecordState(){
       super();
       this.clear();
    }
    public static SCLiveRecordState[] emptyArray(){
       if (SCLiveRecordState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveRecordState._emptyArray == null) {
             SCLiveRecordState[] sCLiveRecord = new SCLiveRecordState[0];
             SCLiveRecordState._emptyArray = sCLiveRecord;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveRecordState._emptyArray;
    }
    public static SCLiveRecordState parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveRecordState().mergeFrom(p0);
    }
    public static SCLiveRecordState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveRecordState(), p0);
    }
    public SCLiveRecordState clear(){
       this.enableRecord = false;
       this.minRecordDurationMs = 0;
       this.maxRecordDurationMs = 0;
       this.tips = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveRecordState tenableRecor = this.enableRecord;
       if (tenableRecor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tenableRecor);
       }
       tenableRecor = this.minRecordDurationMs;
       int i1 = 0;
       if (tenableRecor - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tenableRecor);
       }
       tenableRecor = this.maxRecordDurationMs;
       if (tenableRecor - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tenableRecor);
       }
       if (!(this.tips).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.tips);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveRecordState mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.tips = p0.readString();
                   }
                }else {
                   this.maxRecordDurationMs = p0.readUInt64();
                }
             }else {
                this.minRecordDurationMs = p0.readUInt64();
             }
          }else {
             this.enableRecord = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveRecordState tenableRecor = this.enableRecord;
       if (tenableRecor != null) {
          p0.writeBool(1, tenableRecor);
       }
       tenableRecor = this.minRecordDurationMs;
       int i = 0;
       if (tenableRecor - i) {
          p0.writeUInt64(2, tenableRecor);
       }
       tenableRecor = this.maxRecordDurationMs;
       if (tenableRecor - i) {
          p0.writeUInt64(3, tenableRecor);
       }
       if (!(this.tips).equals("")) {
          p0.writeString(4, this.tips);
       }
       super.writeTo(p0);
       return;
    }
}
