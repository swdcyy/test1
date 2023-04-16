package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$IOSPatchParsePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$PatchVersionPackage;

public final class ClientTaskDetail$IOSPatchParsePackage extends MessageNano	// class@00145e
{
    public String errorMessage;
    public boolean success;
    public ClientTaskDetail$PatchVersionPackage versionPackage;
    public static ClientTaskDetail$IOSPatchParsePackage[] _emptyArray;

    public void ClientTaskDetail$IOSPatchParsePackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$IOSPatchParsePackage[] emptyArray(){
       if (ClientTaskDetail$IOSPatchParsePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$IOSPatchParsePackage._emptyArray == null) {
             ClientTaskDetail$IOSPatchParsePackage[] iOSPatchPars = new ClientTaskDetail$IOSPatchParsePackage[0];
             ClientTaskDetail$IOSPatchParsePackage._emptyArray = iOSPatchPars;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$IOSPatchParsePackage._emptyArray;
    }
    public static ClientTaskDetail$IOSPatchParsePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$IOSPatchParsePackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$IOSPatchParsePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$IOSPatchParsePackage(), p0);
    }
    public ClientTaskDetail$IOSPatchParsePackage clear(){
       this.success = false;
       this.versionPackage = null;
       this.errorMessage = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$IOSPatchParsePackage tsuccess = this.success;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tsuccess);
       }
       tsuccess = this.versionPackage;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tsuccess);
       }
       if (!(this.errorMessage).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.errorMessage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$IOSPatchParsePackage mergeFrom(CodedInputByteBufferNano p0){
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
                   this.errorMessage = p0.readString();
                }
             }else if(this.versionPackage == null){
                this.versionPackage = new ClientTaskDetail$PatchVersionPackage();
             }
             p0.readMessage(this.versionPackage);
          }else {
             this.success = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$IOSPatchParsePackage tsuccess = this.success;
       if (tsuccess != null) {
          p0.writeBool(1, tsuccess);
       }
       tsuccess = this.versionPackage;
       if (tsuccess != null) {
          p0.writeMessage(2, tsuccess);
       }
       if (!(this.errorMessage).equals("")) {
          p0.writeString(3, this.errorMessage);
       }
       super.writeTo(p0);
       return;
    }
}
