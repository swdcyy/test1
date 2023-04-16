package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$IOSPatchQueryPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$PatchVersionPackage;

public final class ClientTaskDetail$IOSPatchQueryPackage extends MessageNano	// class@00145f
{
    public ClientTaskDetail$PatchVersionPackage currentPatchVersionPackage;
    public String errorMessage;
    public String newPatchMd5;
    public String newPatchUrl;
    public ClientTaskDetail$PatchVersionPackage newPatchVersionPackage;
    public boolean rollback;
    public boolean success;
    public static ClientTaskDetail$IOSPatchQueryPackage[] _emptyArray;

    public void ClientTaskDetail$IOSPatchQueryPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$IOSPatchQueryPackage[] emptyArray(){
       if (ClientTaskDetail$IOSPatchQueryPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$IOSPatchQueryPackage._emptyArray == null) {
             ClientTaskDetail$IOSPatchQueryPackage[] iOSPatchQuer = new ClientTaskDetail$IOSPatchQueryPackage[0];
             ClientTaskDetail$IOSPatchQueryPackage._emptyArray = iOSPatchQuer;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$IOSPatchQueryPackage._emptyArray;
    }
    public static ClientTaskDetail$IOSPatchQueryPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$IOSPatchQueryPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$IOSPatchQueryPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$IOSPatchQueryPackage(), p0);
    }
    public ClientTaskDetail$IOSPatchQueryPackage clear(){
       this.success = false;
       this.rollback = false;
       this.newPatchMd5 = "";
       this.newPatchUrl = "";
       this.newPatchVersionPackage = null;
       this.currentPatchVersionPackage = null;
       this.errorMessage = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$IOSPatchQueryPackage tsuccess = this.success;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tsuccess);
       }
       tsuccess = this.rollback;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tsuccess);
       }
       String str = "";
       if (!(this.newPatchMd5).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.newPatchMd5);
       }
       if (!(this.newPatchUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.newPatchUrl);
       }
       tsuccess = this.newPatchVersionPackage;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tsuccess);
       }
       tsuccess = this.currentPatchVersionPackage;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tsuccess);
       }
       if (!(this.errorMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.errorMessage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$IOSPatchQueryPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.errorMessage = p0.readString();
                            }
                         }else if(this.currentPatchVersionPackage == null){
                            this.currentPatchVersionPackage = new ClientTaskDetail$PatchVersionPackage();
                         }
                         p0.readMessage(this.currentPatchVersionPackage);
                      }else if(this.newPatchVersionPackage == null){
                         this.newPatchVersionPackage = new ClientTaskDetail$PatchVersionPackage();
                      }
                      p0.readMessage(this.newPatchVersionPackage);
                   }else {
                      this.newPatchUrl = p0.readString();
                   }
                }else {
                   this.newPatchMd5 = p0.readString();
                }
             }else {
                this.rollback = p0.readBool();
             }
          }else {
             this.success = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$IOSPatchQueryPackage tsuccess = this.success;
       if (tsuccess != null) {
          p0.writeBool(1, tsuccess);
       }
       tsuccess = this.rollback;
       if (tsuccess != null) {
          p0.writeBool(2, tsuccess);
       }
       String str = "";
       if (!(this.newPatchMd5).equals(str)) {
          p0.writeString(3, this.newPatchMd5);
       }
       if (!(this.newPatchUrl).equals(str)) {
          p0.writeString(4, this.newPatchUrl);
       }
       tsuccess = this.newPatchVersionPackage;
       if (tsuccess != null) {
          p0.writeMessage(5, tsuccess);
       }
       tsuccess = this.currentPatchVersionPackage;
       if (tsuccess != null) {
          p0.writeMessage(6, tsuccess);
       }
       if (!(this.errorMessage).equals(str)) {
          p0.writeString(7, this.errorMessage);
       }
       super.writeTo(p0);
       return;
    }
}
