package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$AndroidPatchLoadPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$AndroidPatchLoadPackage extends MessageNano	// class@00144b
{
    public long cost;
    public String currentTinkerId;
    public String errorMessage;
    public int loadCode;
    public int patchLoadCode;
    public String patchMd5;
    public String patchVersion;
    public boolean success;
    public static ClientTaskDetail$AndroidPatchLoadPackage[] _emptyArray;

    public void ClientTaskDetail$AndroidPatchLoadPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$AndroidPatchLoadPackage[] emptyArray(){
       if (ClientTaskDetail$AndroidPatchLoadPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$AndroidPatchLoadPackage._emptyArray == null) {
             ClientTaskDetail$AndroidPatchLoadPackage[] uAndroidPatc = new ClientTaskDetail$AndroidPatchLoadPackage[0];
             ClientTaskDetail$AndroidPatchLoadPackage._emptyArray = uAndroidPatc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$AndroidPatchLoadPackage._emptyArray;
    }
    public static ClientTaskDetail$AndroidPatchLoadPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$AndroidPatchLoadPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$AndroidPatchLoadPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$AndroidPatchLoadPackage(), p0);
    }
    public ClientTaskDetail$AndroidPatchLoadPackage clear(){
       this.success = false;
       this.loadCode = 0;
       this.cost = 0;
       this.patchMd5 = "";
       this.patchVersion = "";
       this.currentTinkerId = "";
       this.errorMessage = "";
       this.patchLoadCode = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$AndroidPatchLoadPackage tsuccess = this.success;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tsuccess);
       }
       tsuccess = this.loadCode;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tsuccess);
       }
       tsuccess = this.cost;
       if (tsuccess - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tsuccess);
       }
       String str = "";
       if (!(this.patchMd5).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.patchMd5);
       }
       if (!(this.patchVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.patchVersion);
       }
       if (!(this.currentTinkerId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.currentTinkerId);
       }
       if (!(this.errorMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.errorMessage);
       }
       tsuccess = this.patchLoadCode;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tsuccess);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$AndroidPatchLoadPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.patchLoadCode = p0.readInt32();
                               }
                            }else {
                               this.errorMessage = p0.readString();
                            }
                         }else {
                            this.currentTinkerId = p0.readString();
                         }
                      }else {
                         this.patchVersion = p0.readString();
                      }
                   }else {
                      this.patchMd5 = p0.readString();
                   }
                }else {
                   this.cost = p0.readUInt64();
                }
             }else {
                this.loadCode = p0.readUInt32();
             }
          }else {
             this.success = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$AndroidPatchLoadPackage tsuccess = this.success;
       if (tsuccess != null) {
          p0.writeBool(1, tsuccess);
       }
       tsuccess = this.loadCode;
       if (tsuccess != null) {
          p0.writeUInt32(2, tsuccess);
       }
       tsuccess = this.cost;
       if (tsuccess - null) {
          p0.writeUInt64(3, tsuccess);
       }
       String str = "";
       if (!(this.patchMd5).equals(str)) {
          p0.writeString(4, this.patchMd5);
       }
       if (!(this.patchVersion).equals(str)) {
          p0.writeString(5, this.patchVersion);
       }
       if (!(this.currentTinkerId).equals(str)) {
          p0.writeString(6, this.currentTinkerId);
       }
       if (!(this.errorMessage).equals(str)) {
          p0.writeString(7, this.errorMessage);
       }
       tsuccess = this.patchLoadCode;
       if (tsuccess != null) {
          p0.writeInt32(8, tsuccess);
       }
       super.writeTo(p0);
       return;
    }
}
