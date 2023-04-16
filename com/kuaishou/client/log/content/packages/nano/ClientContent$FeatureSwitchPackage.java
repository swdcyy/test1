package com.kuaishou.client.log.content.packages.nano.ClientContent$FeatureSwitchPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$FeatureSwitchPackage extends MessageNano	// class@00123b
{
    public String name;
    public boolean on;
    public static ClientContent$FeatureSwitchPackage[] _emptyArray;

    public void ClientContent$FeatureSwitchPackage(){
       super();
       this.clear();
    }
    public static ClientContent$FeatureSwitchPackage[] emptyArray(){
       if (ClientContent$FeatureSwitchPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$FeatureSwitchPackage._emptyArray == null) {
             ClientContent$FeatureSwitchPackage[] uFeatureSwit = new ClientContent$FeatureSwitchPackage[0];
             ClientContent$FeatureSwitchPackage._emptyArray = uFeatureSwit;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$FeatureSwitchPackage._emptyArray;
    }
    public static ClientContent$FeatureSwitchPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$FeatureSwitchPackage().mergeFrom(p0);
    }
    public static ClientContent$FeatureSwitchPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$FeatureSwitchPackage(), p0);
    }
    public ClientContent$FeatureSwitchPackage clear(){
       this.name = "";
       this.on = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.name).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       ClientContent$FeatureSwitchPackage ton = this.on;
       if (ton != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, ton);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$FeatureSwitchPackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.on = p0.readBool();
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
       ClientContent$FeatureSwitchPackage ton = this.on;
       if (ton != null) {
          p0.writeBool(2, ton);
       }
       super.writeTo(p0);
       return;
    }
}
