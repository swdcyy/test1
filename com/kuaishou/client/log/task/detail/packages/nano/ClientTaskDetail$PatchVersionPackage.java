package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$PatchVersionPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$PatchVersionPackage extends MessageNano	// class@001469
{
    public String baseVersion;
    public String patchVersion;
    public static ClientTaskDetail$PatchVersionPackage[] _emptyArray;

    public void ClientTaskDetail$PatchVersionPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$PatchVersionPackage[] emptyArray(){
       if (ClientTaskDetail$PatchVersionPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$PatchVersionPackage._emptyArray == null) {
             ClientTaskDetail$PatchVersionPackage[] patchVersion = new ClientTaskDetail$PatchVersionPackage[0];
             ClientTaskDetail$PatchVersionPackage._emptyArray = patchVersion;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$PatchVersionPackage._emptyArray;
    }
    public static ClientTaskDetail$PatchVersionPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$PatchVersionPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$PatchVersionPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$PatchVersionPackage(), p0);
    }
    public ClientTaskDetail$PatchVersionPackage clear(){
       this.patchVersion = "";
       this.baseVersion = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.patchVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.patchVersion);
       }
       if (!(this.baseVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.baseVersion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$PatchVersionPackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.baseVersion = p0.readString();
             }
          }else {
             this.patchVersion = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.patchVersion).equals(str)) {
          p0.writeString(1, this.patchVersion);
       }
       if (!(this.baseVersion).equals(str)) {
          p0.writeString(2, this.baseVersion);
       }
       super.writeTo(p0);
       return;
    }
}
