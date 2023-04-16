package com.kuaishou.protobuf.log.nano.ClientBase$NetworkPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientBase$NetworkPackage extends MessageNano	// class@000ddb
{
    public String ip;
    public String isp;
    public int type;
    public static ClientBase$NetworkPackage[] _emptyArray;

    public void ClientBase$NetworkPackage(){
       super();
       this.clear();
    }
    public static ClientBase$NetworkPackage[] emptyArray(){
       if (ClientBase$NetworkPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientBase$NetworkPackage._emptyArray == null) {
             ClientBase$NetworkPackage[] networkPacka = new ClientBase$NetworkPackage[0];
             ClientBase$NetworkPackage._emptyArray = networkPacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientBase$NetworkPackage._emptyArray;
    }
    public static ClientBase$NetworkPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientBase$NetworkPackage().mergeFrom(p0);
    }
    public static ClientBase$NetworkPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientBase$NetworkPackage(), p0);
    }
    public ClientBase$NetworkPackage clear(){
       this.type = 0;
       this.isp = "";
       this.ip = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientBase$NetworkPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.isp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.isp);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ip);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientBase$NetworkPackage mergeFrom(CodedInputByteBufferNano p0){
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
                   this.ip = p0.readString();
                }
             }else {
                this.isp = p0.readString();
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 1:
                   break;
                 default:
             }
             this.type = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientBase$NetworkPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.isp).equals(str)) {
          p0.writeString(2, this.isp);
       }
       if (!(this.ip).equals(str)) {
          p0.writeString(3, this.ip);
       }
       super.writeTo(p0);
       return;
    }
}
