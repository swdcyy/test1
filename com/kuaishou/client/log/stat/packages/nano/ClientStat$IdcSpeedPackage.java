package com.kuaishou.client.log.stat.packages.nano.ClientStat$IdcSpeedPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$IdcSpeedPackage extends MessageNano	// class@0013e6
{
    public long cost;
    public String exception;
    public String idc;
    public boolean isFastest;
    public int resultCode;
    public String tspCode;
    public static ClientStat$IdcSpeedPackage[] _emptyArray;

    public void ClientStat$IdcSpeedPackage(){
       super();
       this.clear();
    }
    public static ClientStat$IdcSpeedPackage[] emptyArray(){
       if (ClientStat$IdcSpeedPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$IdcSpeedPackage._emptyArray == null) {
             ClientStat$IdcSpeedPackage[] idcSpeedPack = new ClientStat$IdcSpeedPackage[0];
             ClientStat$IdcSpeedPackage._emptyArray = idcSpeedPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$IdcSpeedPackage._emptyArray;
    }
    public static ClientStat$IdcSpeedPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$IdcSpeedPackage().mergeFrom(p0);
    }
    public static ClientStat$IdcSpeedPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$IdcSpeedPackage(), p0);
    }
    public ClientStat$IdcSpeedPackage clear(){
       this.idc = "";
       this.tspCode = "";
       this.exception = "";
       this.cost = 0;
       this.resultCode = 0;
       this.isFastest = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.idc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.idc);
       }
       if (!(this.tspCode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.tspCode);
       }
       if (!(this.exception).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.exception);
       }
       ClientStat$IdcSpeedPackage tcost = this.cost;
       if (tcost) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tcost);
       }
       tcost = this.resultCode;
       if (tcost != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tcost);
       }
       tcost = this.isFastest;
       if (tcost != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tcost);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$IdcSpeedPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.isFastest = p0.readBool();
                         }
                      }else {
                         this.resultCode = p0.readInt32();
                      }
                   }else {
                      this.cost = p0.readUInt64();
                   }
                }else {
                   this.exception = p0.readString();
                }
             }else {
                this.tspCode = p0.readString();
             }
          }else {
             this.idc = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.idc).equals(str)) {
          p0.writeString(1, this.idc);
       }
       if (!(this.tspCode).equals(str)) {
          p0.writeString(2, this.tspCode);
       }
       if (!(this.exception).equals(str)) {
          p0.writeString(3, this.exception);
       }
       ClientStat$IdcSpeedPackage tcost = this.cost;
       if (tcost) {
          p0.writeUInt64(4, tcost);
       }
       tcost = this.resultCode;
       if (tcost != null) {
          p0.writeInt32(5, tcost);
       }
       tcost = this.isFastest;
       if (tcost != null) {
          p0.writeBool(6, tcost);
       }
       super.writeTo(p0);
       return;
    }
}
