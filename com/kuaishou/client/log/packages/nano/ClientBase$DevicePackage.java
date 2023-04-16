package com.kuaishou.client.log.packages.nano.ClientBase$DevicePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientBase$DevicePackage extends MessageNano	// class@00077a
{
    public String model;
    public String osVersion;
    public String ua;
    public static ClientBase$DevicePackage[] _emptyArray;

    public void ClientBase$DevicePackage(){
       super();
       this.clear();
    }
    public static ClientBase$DevicePackage[] emptyArray(){
       if (ClientBase$DevicePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientBase$DevicePackage._emptyArray == null) {
             ClientBase$DevicePackage[] uDevicePacka = new ClientBase$DevicePackage[0];
             ClientBase$DevicePackage._emptyArray = uDevicePacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientBase$DevicePackage._emptyArray;
    }
    public static ClientBase$DevicePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientBase$DevicePackage().mergeFrom(p0);
    }
    public static ClientBase$DevicePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientBase$DevicePackage(), p0);
    }
    public ClientBase$DevicePackage clear(){
       this.osVersion = "";
       this.model = "";
       this.ua = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.osVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.osVersion);
       }
       if (!(this.model).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.model);
       }
       if (!(this.ua).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ua);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientBase$DevicePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.ua = p0.readString();
                }
             }else {
                this.model = p0.readString();
             }
          }else {
             this.osVersion = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.osVersion).equals(str)) {
          p0.writeString(1, this.osVersion);
       }
       if (!(this.model).equals(str)) {
          p0.writeString(2, this.model);
       }
       if (!(this.ua).equals(str)) {
          p0.writeString(3, this.ua);
       }
       super.writeTo(p0);
       return;
    }
}
