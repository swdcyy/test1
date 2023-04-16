package com.kuaishou.client.log.stat.packages.nano.ClientStat$DeviceIdMappingEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$DeviceIdMappingEvent extends MessageNano	// class@0007b8
{
    public String deviceId;
    public String deviceMappingRpcType;
    public String didTag;
    public String oldDeviceId;
    public String preDeviceId;
    public String preDidTag;
    public String randomDeviceId;
    public static ClientStat$DeviceIdMappingEvent[] _emptyArray;

    public void ClientStat$DeviceIdMappingEvent(){
       super();
       this.clear();
    }
    public static ClientStat$DeviceIdMappingEvent[] emptyArray(){
       if (ClientStat$DeviceIdMappingEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$DeviceIdMappingEvent._emptyArray == null) {
             ClientStat$DeviceIdMappingEvent[] uDeviceIdMap = new ClientStat$DeviceIdMappingEvent[0];
             ClientStat$DeviceIdMappingEvent._emptyArray = uDeviceIdMap;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$DeviceIdMappingEvent._emptyArray;
    }
    public static ClientStat$DeviceIdMappingEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$DeviceIdMappingEvent().mergeFrom(p0);
    }
    public static ClientStat$DeviceIdMappingEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$DeviceIdMappingEvent(), p0);
    }
    public ClientStat$DeviceIdMappingEvent clear(){
       this.randomDeviceId = "";
       this.deviceId = "";
       this.oldDeviceId = "";
       this.preDeviceId = "";
       this.didTag = "";
       this.preDidTag = "";
       this.deviceMappingRpcType = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.randomDeviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.randomDeviceId);
       }
       if (!(this.deviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.deviceId);
       }
       if (!(this.oldDeviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.oldDeviceId);
       }
       if (!(this.preDeviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.preDeviceId);
       }
       if (!(this.didTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.didTag);
       }
       if (!(this.preDidTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.preDidTag);
       }
       if (!(this.deviceMappingRpcType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.deviceMappingRpcType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$DeviceIdMappingEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.deviceMappingRpcType = p0.readString();
                            }
                         }else {
                            this.preDidTag = p0.readString();
                         }
                      }else {
                         this.didTag = p0.readString();
                      }
                   }else {
                      this.preDeviceId = p0.readString();
                   }
                }else {
                   this.oldDeviceId = p0.readString();
                }
             }else {
                this.deviceId = p0.readString();
             }
          }else {
             this.randomDeviceId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.randomDeviceId).equals(str)) {
          p0.writeString(1, this.randomDeviceId);
       }
       if (!(this.deviceId).equals(str)) {
          p0.writeString(2, this.deviceId);
       }
       if (!(this.oldDeviceId).equals(str)) {
          p0.writeString(3, this.oldDeviceId);
       }
       if (!(this.preDeviceId).equals(str)) {
          p0.writeString(4, this.preDeviceId);
       }
       if (!(this.didTag).equals(str)) {
          p0.writeString(5, this.didTag);
       }
       if (!(this.preDidTag).equals(str)) {
          p0.writeString(6, this.preDidTag);
       }
       if (!(this.deviceMappingRpcType).equals(str)) {
          p0.writeString(7, this.deviceMappingRpcType);
       }
       super.writeTo(p0);
       return;
    }
}
