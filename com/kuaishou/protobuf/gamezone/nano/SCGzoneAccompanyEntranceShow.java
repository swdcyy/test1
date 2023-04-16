package com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyEntranceShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneAccompanyEntranceShow extends MessageNano	// class@000bcc
{
    public String accompanyId;
    public long displayMaxDelayMillis;
    public String roundId;
    public static SCGzoneAccompanyEntranceShow[] _emptyArray;

    public void SCGzoneAccompanyEntranceShow(){
       super();
       this.clear();
    }
    public static SCGzoneAccompanyEntranceShow[] emptyArray(){
       if (SCGzoneAccompanyEntranceShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneAccompanyEntranceShow._emptyArray == null) {
             SCGzoneAccompanyEntranceShow[] sCGzoneAccom = new SCGzoneAccompanyEntranceShow[0];
             SCGzoneAccompanyEntranceShow._emptyArray = sCGzoneAccom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneAccompanyEntranceShow._emptyArray;
    }
    public static SCGzoneAccompanyEntranceShow parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneAccompanyEntranceShow().mergeFrom(p0);
    }
    public static SCGzoneAccompanyEntranceShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneAccompanyEntranceShow(), p0);
    }
    public SCGzoneAccompanyEntranceShow clear(){
       this.displayMaxDelayMillis = 0;
       this.accompanyId = "";
       this.roundId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneAccompanyEntranceShow tdisplayMaxD = this.displayMaxDelayMillis;
       if (tdisplayMaxD - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tdisplayMaxD);
       }
       String str = "";
       if (!(this.accompanyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.accompanyId);
       }
       if (!(this.roundId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.roundId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneAccompanyEntranceShow mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.roundId = p0.readString();
                }
             }else {
                this.accompanyId = p0.readString();
             }
          }else {
             this.displayMaxDelayMillis = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneAccompanyEntranceShow tdisplayMaxD = this.displayMaxDelayMillis;
       if (tdisplayMaxD - null) {
          p0.writeUInt64(1, tdisplayMaxD);
       }
       String str = "";
       if (!(this.accompanyId).equals(str)) {
          p0.writeString(2, this.accompanyId);
       }
       if (!(this.roundId).equals(str)) {
          p0.writeString(3, this.roundId);
       }
       super.writeTo(p0);
       return;
    }
}
