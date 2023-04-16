package com.kuaishou.client.log.custom.nano.CustomProtoEvent$LaunchEventV2$ClientLocalConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class CustomProtoEvent$LaunchEventV2$ClientLocalConfig extends MessageNano	// class@001342
{
    public String abtsetConfig;
    public String kswitchConfig;
    public static CustomProtoEvent$LaunchEventV2$ClientLocalConfig[] _emptyArray;

    public void CustomProtoEvent$LaunchEventV2$ClientLocalConfig(){
       super();
       this.clear();
    }
    public static CustomProtoEvent$LaunchEventV2$ClientLocalConfig[] emptyArray(){
       if (CustomProtoEvent$LaunchEventV2$ClientLocalConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CustomProtoEvent$LaunchEventV2$ClientLocalConfig._emptyArray == null) {
             CustomProtoEvent$LaunchEventV2$ClientLocalConfig[] launchEventV = new CustomProtoEvent$LaunchEventV2$ClientLocalConfig[0];
             CustomProtoEvent$LaunchEventV2$ClientLocalConfig._emptyArray = launchEventV;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CustomProtoEvent$LaunchEventV2$ClientLocalConfig._emptyArray;
    }
    public static CustomProtoEvent$LaunchEventV2$ClientLocalConfig parseFrom(CodedInputByteBufferNano p0){
       return new CustomProtoEvent$LaunchEventV2$ClientLocalConfig().mergeFrom(p0);
    }
    public static CustomProtoEvent$LaunchEventV2$ClientLocalConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CustomProtoEvent$LaunchEventV2$ClientLocalConfig(), p0);
    }
    public CustomProtoEvent$LaunchEventV2$ClientLocalConfig clear(){
       this.abtsetConfig = "";
       this.kswitchConfig = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.abtsetConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.abtsetConfig);
       }
       if (!(this.kswitchConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.kswitchConfig);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CustomProtoEvent$LaunchEventV2$ClientLocalConfig mergeFrom(CodedInputByteBufferNano p0){
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
                this.kswitchConfig = p0.readString();
             }
          }else {
             this.abtsetConfig = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.abtsetConfig).equals(str)) {
          p0.writeString(1, this.abtsetConfig);
       }
       if (!(this.kswitchConfig).equals(str)) {
          p0.writeString(2, this.kswitchConfig);
       }
       super.writeTo(p0);
       return;
    }
}
