package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$MomentDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$MomentDetailPackage extends MessageNano	// class@001464
{
    public String content;
    public String errorMsg;
    public int imageCount;
    public String momentId;
    public int operationType;
    public String tagId;
    public static ClientTaskDetail$MomentDetailPackage[] _emptyArray;

    public void ClientTaskDetail$MomentDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$MomentDetailPackage[] emptyArray(){
       if (ClientTaskDetail$MomentDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$MomentDetailPackage._emptyArray == null) {
             ClientTaskDetail$MomentDetailPackage[] momentDetail = new ClientTaskDetail$MomentDetailPackage[0];
             ClientTaskDetail$MomentDetailPackage._emptyArray = momentDetail;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$MomentDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$MomentDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$MomentDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$MomentDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$MomentDetailPackage(), p0);
    }
    public ClientTaskDetail$MomentDetailPackage clear(){
       this.imageCount = 0;
       this.content = "";
       this.tagId = "";
       this.momentId = "";
       this.errorMsg = "";
       this.operationType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$MomentDetailPackage timageCount = this.imageCount;
       if (timageCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, timageCount);
       }
       String str = "";
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       if (!(this.tagId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.tagId);
       }
       if (!(this.momentId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.momentId);
       }
       if (!(this.errorMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.errorMsg);
       }
       timageCount = this.operationType;
       if (timageCount != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, timageCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$MomentDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                               continue ;
                            }else {
                               this.operationType = i;
                            }
                         }
                      }else {
                         this.errorMsg = p0.readString();
                      }
                   }else {
                      this.momentId = p0.readString();
                   }
                }else {
                   this.tagId = p0.readString();
                }
             }else {
                this.content = p0.readString();
             }
          }else {
             this.imageCount = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$MomentDetailPackage timageCount = this.imageCount;
       if (timageCount != null) {
          p0.writeUInt32(1, timageCount);
       }
       String str = "";
       if (!(this.content).equals(str)) {
          p0.writeString(2, this.content);
       }
       if (!(this.tagId).equals(str)) {
          p0.writeString(3, this.tagId);
       }
       if (!(this.momentId).equals(str)) {
          p0.writeString(4, this.momentId);
       }
       if (!(this.errorMsg).equals(str)) {
          p0.writeString(5, this.errorMsg);
       }
       timageCount = this.operationType;
       if (timageCount != null) {
          p0.writeInt32(6, timageCount);
       }
       super.writeTo(p0);
       return;
    }
}
