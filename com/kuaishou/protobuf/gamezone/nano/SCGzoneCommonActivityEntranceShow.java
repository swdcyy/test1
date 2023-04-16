package com.kuaishou.protobuf.gamezone.nano.SCGzoneCommonActivityEntranceShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneCommonActivityEntranceShow extends MessageNano	// class@000bd3
{
    public String actionUrl;
    public int bizType;
    public long endTime;
    public long startTime;
    public static SCGzoneCommonActivityEntranceShow[] _emptyArray;

    public void SCGzoneCommonActivityEntranceShow(){
       super();
       this.clear();
    }
    public static SCGzoneCommonActivityEntranceShow[] emptyArray(){
       if (SCGzoneCommonActivityEntranceShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneCommonActivityEntranceShow._emptyArray == null) {
             SCGzoneCommonActivityEntranceShow[] sCGzoneCommo = new SCGzoneCommonActivityEntranceShow[0];
             SCGzoneCommonActivityEntranceShow._emptyArray = sCGzoneCommo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneCommonActivityEntranceShow._emptyArray;
    }
    public static SCGzoneCommonActivityEntranceShow parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneCommonActivityEntranceShow().mergeFrom(p0);
    }
    public static SCGzoneCommonActivityEntranceShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneCommonActivityEntranceShow(), p0);
    }
    public SCGzoneCommonActivityEntranceShow clear(){
       this.bizType = 0;
       this.startTime = 0;
       this.endTime = 0;
       this.actionUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneCommonActivityEntranceShow tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizType);
       }
       tbizType = this.startTime;
       int i1 = 0;
       if (tbizType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tbizType);
       }
       tbizType = this.endTime;
       if (tbizType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tbizType);
       }
       if (!(this.actionUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.actionUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneCommonActivityEntranceShow mergeFrom(CodedInputByteBufferNano p0){
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
                      this.actionUrl = p0.readString();
                   }
                }else {
                   this.endTime = p0.readUInt64();
                }
             }else {
                this.startTime = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.bizType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneCommonActivityEntranceShow tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(1, tbizType);
       }
       tbizType = this.startTime;
       int i = 0;
       if (tbizType - i) {
          p0.writeUInt64(2, tbizType);
       }
       tbizType = this.endTime;
       if (tbizType - i) {
          p0.writeUInt64(3, tbizType);
       }
       if (!(this.actionUrl).equals("")) {
          p0.writeString(4, this.actionUrl);
       }
       super.writeTo(p0);
       return;
    }
}
