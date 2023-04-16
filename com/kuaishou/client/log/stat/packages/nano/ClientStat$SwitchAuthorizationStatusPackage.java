package com.kuaishou.client.log.stat.packages.nano.ClientStat$SwitchAuthorizationStatusPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$SwitchAuthorizationStatusPackage extends MessageNano	// class@001430
{
    public String name;
    public int status;
    public static ClientStat$SwitchAuthorizationStatusPackage[] _emptyArray;

    public void ClientStat$SwitchAuthorizationStatusPackage(){
       super();
       this.clear();
    }
    public static ClientStat$SwitchAuthorizationStatusPackage[] emptyArray(){
       if (ClientStat$SwitchAuthorizationStatusPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$SwitchAuthorizationStatusPackage._emptyArray == null) {
             ClientStat$SwitchAuthorizationStatusPackage[] switchAuthor = new ClientStat$SwitchAuthorizationStatusPackage[0];
             ClientStat$SwitchAuthorizationStatusPackage._emptyArray = switchAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$SwitchAuthorizationStatusPackage._emptyArray;
    }
    public static ClientStat$SwitchAuthorizationStatusPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$SwitchAuthorizationStatusPackage().mergeFrom(p0);
    }
    public static ClientStat$SwitchAuthorizationStatusPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$SwitchAuthorizationStatusPackage(), p0);
    }
    public ClientStat$SwitchAuthorizationStatusPackage clear(){
       this.name = "";
       this.status = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.name).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       ClientStat$SwitchAuthorizationStatusPackage tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$SwitchAuthorizationStatusPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.status = i;
                }
             }
          }else {
             this.name = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.name).equals("")) {
          p0.writeString(1, this.name);
       }
       ClientStat$SwitchAuthorizationStatusPackage tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(2, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
