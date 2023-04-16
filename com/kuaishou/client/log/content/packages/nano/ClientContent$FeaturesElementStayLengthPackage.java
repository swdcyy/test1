package com.kuaishou.client.log.content.packages.nano.ClientContent$FeaturesElementStayLengthPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$FeaturesElementStayLengthPackage extends MessageNano	// class@00123c
{
    public long duration;
    public String name;
    public static ClientContent$FeaturesElementStayLengthPackage[] _emptyArray;

    public void ClientContent$FeaturesElementStayLengthPackage(){
       super();
       this.clear();
    }
    public static ClientContent$FeaturesElementStayLengthPackage[] emptyArray(){
       if (ClientContent$FeaturesElementStayLengthPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$FeaturesElementStayLengthPackage._emptyArray == null) {
             ClientContent$FeaturesElementStayLengthPackage[] uFeaturesEle = new ClientContent$FeaturesElementStayLengthPackage[0];
             ClientContent$FeaturesElementStayLengthPackage._emptyArray = uFeaturesEle;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$FeaturesElementStayLengthPackage._emptyArray;
    }
    public static ClientContent$FeaturesElementStayLengthPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$FeaturesElementStayLengthPackage().mergeFrom(p0);
    }
    public static ClientContent$FeaturesElementStayLengthPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$FeaturesElementStayLengthPackage(), p0);
    }
    public ClientContent$FeaturesElementStayLengthPackage clear(){
       this.name = "";
       this.duration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.name).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       ClientContent$FeaturesElementStayLengthPackage tduration = this.duration;
       if (tduration) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tduration);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$FeaturesElementStayLengthPackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.duration = p0.readUInt64();
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
       ClientContent$FeaturesElementStayLengthPackage tduration = this.duration;
       if (tduration) {
          p0.writeUInt64(2, tduration);
       }
       super.writeTo(p0);
       return;
    }
}
