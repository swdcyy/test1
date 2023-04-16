package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$DeviceDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$DeviceDetailPackage extends MessageNano	// class@001453
{
    public String deviceId;
    public String deviceName;
    public String oldDeviceName;
    public static ClientTaskDetail$DeviceDetailPackage[] _emptyArray;

    public void ClientTaskDetail$DeviceDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$DeviceDetailPackage[] emptyArray(){
       if (ClientTaskDetail$DeviceDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$DeviceDetailPackage._emptyArray == null) {
             ClientTaskDetail$DeviceDetailPackage[] uDeviceDetai = new ClientTaskDetail$DeviceDetailPackage[0];
             ClientTaskDetail$DeviceDetailPackage._emptyArray = uDeviceDetai;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$DeviceDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$DeviceDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$DeviceDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$DeviceDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$DeviceDetailPackage(), p0);
    }
    public ClientTaskDetail$DeviceDetailPackage clear(){
       this.deviceId = "";
       this.deviceName = "";
       this.oldDeviceName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.deviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.deviceId);
       }
       if (!(this.deviceName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.deviceName);
       }
       if (!(this.oldDeviceName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.oldDeviceName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$DeviceDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
                   this.oldDeviceName = p0.readString();
                }
             }else {
                this.deviceName = p0.readString();
             }
          }else {
             this.deviceId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.deviceId).equals(str)) {
          p0.writeString(1, this.deviceId);
       }
       if (!(this.deviceName).equals(str)) {
          p0.writeString(2, this.deviceName);
       }
       if (!(this.oldDeviceName).equals(str)) {
          p0.writeString(3, this.oldDeviceName);
       }
       super.writeTo(p0);
       return;
    }
}
