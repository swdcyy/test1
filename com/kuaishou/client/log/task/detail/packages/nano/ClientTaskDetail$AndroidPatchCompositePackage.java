package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$AndroidPatchCompositePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$AndroidPatchCompositePackage extends MessageNano	// class@00144a
{
    public long cost;
    public String currentTinkerId;
    public String errorMessage;
    public String patchMd5;
    public String patchVersion;
    public boolean success;
    public static ClientTaskDetail$AndroidPatchCompositePackage[] _emptyArray;

    public void ClientTaskDetail$AndroidPatchCompositePackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$AndroidPatchCompositePackage[] emptyArray(){
       if (ClientTaskDetail$AndroidPatchCompositePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$AndroidPatchCompositePackage._emptyArray == null) {
             ClientTaskDetail$AndroidPatchCompositePackage[] uAndroidPatc = new ClientTaskDetail$AndroidPatchCompositePackage[0];
             ClientTaskDetail$AndroidPatchCompositePackage._emptyArray = uAndroidPatc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$AndroidPatchCompositePackage._emptyArray;
    }
    public static ClientTaskDetail$AndroidPatchCompositePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$AndroidPatchCompositePackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$AndroidPatchCompositePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$AndroidPatchCompositePackage(), p0);
    }
    public ClientTaskDetail$AndroidPatchCompositePackage clear(){
       this.success = false;
       this.patchMd5 = "";
       this.cost = 0;
       this.errorMessage = "";
       this.patchVersion = "";
       this.currentTinkerId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$AndroidPatchCompositePackage tsuccess = this.success;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tsuccess);
       }
       String str = "";
       if (!(this.patchMd5).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.patchMd5);
       }
       ClientTaskDetail$AndroidPatchCompositePackage tcost = this.cost;
       if (tcost) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tcost);
       }
       if (!(this.errorMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.errorMessage);
       }
       if (!(this.patchVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.patchVersion);
       }
       if (!(this.currentTinkerId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.currentTinkerId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$AndroidPatchCompositePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.currentTinkerId = p0.readString();
                         }
                      }else {
                         this.patchVersion = p0.readString();
                      }
                   }else {
                      this.errorMessage = p0.readString();
                   }
                }else {
                   this.cost = p0.readUInt64();
                }
             }else {
                this.patchMd5 = p0.readString();
             }
          }else {
             this.success = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$AndroidPatchCompositePackage tsuccess = this.success;
       if (tsuccess != null) {
          p0.writeBool(1, tsuccess);
       }
       String str = "";
       if (!(this.patchMd5).equals(str)) {
          p0.writeString(2, this.patchMd5);
       }
       ClientTaskDetail$AndroidPatchCompositePackage tcost = this.cost;
       if (tcost) {
          p0.writeUInt64(3, tcost);
       }
       if (!(this.errorMessage).equals(str)) {
          p0.writeString(4, this.errorMessage);
       }
       if (!(this.patchVersion).equals(str)) {
          p0.writeString(5, this.patchVersion);
       }
       if (!(this.currentTinkerId).equals(str)) {
          p0.writeString(6, this.currentTinkerId);
       }
       super.writeTo(p0);
       return;
    }
}
