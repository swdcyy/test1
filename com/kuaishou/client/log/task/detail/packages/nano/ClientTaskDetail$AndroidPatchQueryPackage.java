package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$AndroidPatchQueryPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$AndroidPatchQueryPackage extends MessageNano	// class@00144d
{
    public int applyPolicy;
    public String currentPatchMd5;
    public String currentTinkerId;
    public String errorMessage;
    public String patchMd5;
    public long patchSize;
    public String patchTinkerId;
    public String patchUrl;
    public String patchVersion;
    public boolean rollback;
    public boolean success;
    public static ClientTaskDetail$AndroidPatchQueryPackage[] _emptyArray;

    public void ClientTaskDetail$AndroidPatchQueryPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$AndroidPatchQueryPackage[] emptyArray(){
       if (ClientTaskDetail$AndroidPatchQueryPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$AndroidPatchQueryPackage._emptyArray == null) {
             ClientTaskDetail$AndroidPatchQueryPackage[] uAndroidPatc = new ClientTaskDetail$AndroidPatchQueryPackage[0];
             ClientTaskDetail$AndroidPatchQueryPackage._emptyArray = uAndroidPatc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$AndroidPatchQueryPackage._emptyArray;
    }
    public static ClientTaskDetail$AndroidPatchQueryPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$AndroidPatchQueryPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$AndroidPatchQueryPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$AndroidPatchQueryPackage(), p0);
    }
    public ClientTaskDetail$AndroidPatchQueryPackage clear(){
       this.success = false;
       this.rollback = false;
       this.patchVersion = "";
       this.patchTinkerId = "";
       this.currentPatchMd5 = "";
       this.currentTinkerId = "";
       this.applyPolicy = 0;
       this.errorMessage = "";
       this.patchMd5 = "";
       this.patchSize = 0;
       this.patchUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$AndroidPatchQueryPackage tsuccess = this.success;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tsuccess);
       }
       tsuccess = this.rollback;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tsuccess);
       }
       String str = "";
       if (!(this.patchVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.patchVersion);
       }
       if (!(this.patchTinkerId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.patchTinkerId);
       }
       if (!(this.currentPatchMd5).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.currentPatchMd5);
       }
       if (!(this.currentTinkerId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.currentTinkerId);
       }
       tsuccess = this.applyPolicy;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tsuccess);
       }
       if (!(this.errorMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.errorMessage);
       }
       if (!(this.patchMd5).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.patchMd5);
       }
       ClientTaskDetail$AndroidPatchQueryPackage tpatchSize = this.patchSize;
       if (tpatchSize) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tpatchSize);
       }
       if (!(this.patchUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.patchUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$AndroidPatchQueryPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.success = p0.readBool();
                break;
              case 16:
                this.rollback = p0.readBool();
                break;
              case 26:
                this.patchVersion = p0.readString();
                break;
              case '"':
                this.patchTinkerId = p0.readString();
                break;
              case '*':
                this.currentPatchMd5 = p0.readString();
                break;
              case '2':
                this.currentTinkerId = p0.readString();
                break;
              case '8':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.applyPolicy = i;
                }
                break;
              case 'B':
                this.errorMessage = p0.readString();
                break;
              case 'J':
                this.patchMd5 = p0.readString();
                break;
              case 'P':
                this.patchSize = p0.readUInt64();
                break;
              case 'Z':
                this.patchUrl = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$AndroidPatchQueryPackage tsuccess = this.success;
       if (tsuccess != null) {
          p0.writeBool(1, tsuccess);
       }
       tsuccess = this.rollback;
       if (tsuccess != null) {
          p0.writeBool(2, tsuccess);
       }
       String str = "";
       if (!(this.patchVersion).equals(str)) {
          p0.writeString(3, this.patchVersion);
       }
       if (!(this.patchTinkerId).equals(str)) {
          p0.writeString(4, this.patchTinkerId);
       }
       if (!(this.currentPatchMd5).equals(str)) {
          p0.writeString(5, this.currentPatchMd5);
       }
       if (!(this.currentTinkerId).equals(str)) {
          p0.writeString(6, this.currentTinkerId);
       }
       tsuccess = this.applyPolicy;
       if (tsuccess != null) {
          p0.writeInt32(7, tsuccess);
       }
       if (!(this.errorMessage).equals(str)) {
          p0.writeString(8, this.errorMessage);
       }
       if (!(this.patchMd5).equals(str)) {
          p0.writeString(9, this.patchMd5);
       }
       ClientTaskDetail$AndroidPatchQueryPackage tpatchSize = this.patchSize;
       if (tpatchSize) {
          p0.writeUInt64(10, tpatchSize);
       }
       if (!(this.patchUrl).equals(str)) {
          p0.writeString(11, this.patchUrl);
       }
       super.writeTo(p0);
       return;
    }
}
