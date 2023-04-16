package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$AndroidPatchRollbackPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$AndroidPatchRollbackPackage extends MessageNano	// class@00144e
{
    public String currentPatchMd5;
    public String currentTinkerId;
    public static ClientTaskDetail$AndroidPatchRollbackPackage[] _emptyArray;

    public void ClientTaskDetail$AndroidPatchRollbackPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$AndroidPatchRollbackPackage[] emptyArray(){
       if (ClientTaskDetail$AndroidPatchRollbackPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$AndroidPatchRollbackPackage._emptyArray == null) {
             ClientTaskDetail$AndroidPatchRollbackPackage[] uAndroidPatc = new ClientTaskDetail$AndroidPatchRollbackPackage[0];
             ClientTaskDetail$AndroidPatchRollbackPackage._emptyArray = uAndroidPatc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$AndroidPatchRollbackPackage._emptyArray;
    }
    public static ClientTaskDetail$AndroidPatchRollbackPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$AndroidPatchRollbackPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$AndroidPatchRollbackPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$AndroidPatchRollbackPackage(), p0);
    }
    public ClientTaskDetail$AndroidPatchRollbackPackage clear(){
       this.currentPatchMd5 = "";
       this.currentTinkerId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.currentPatchMd5).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.currentPatchMd5);
       }
       if (!(this.currentTinkerId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.currentTinkerId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$AndroidPatchRollbackPackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.currentTinkerId = p0.readString();
             }
          }else {
             this.currentPatchMd5 = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.currentPatchMd5).equals(str)) {
          p0.writeString(1, this.currentPatchMd5);
       }
       if (!(this.currentTinkerId).equals(str)) {
          p0.writeString(2, this.currentTinkerId);
       }
       super.writeTo(p0);
       return;
    }
}
