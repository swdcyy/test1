package com.kuaishou.client.log.content.packages.nano.ClientContent$BodySubFeaturesPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$BodySubFeaturesPackage extends MessageNano	// class@001222
{
    public String item;
    public float value;
    public static ClientContent$BodySubFeaturesPackage[] _emptyArray;

    public void ClientContent$BodySubFeaturesPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BodySubFeaturesPackage[] emptyArray(){
       if (ClientContent$BodySubFeaturesPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BodySubFeaturesPackage._emptyArray == null) {
             ClientContent$BodySubFeaturesPackage[] uBodySubFeat = new ClientContent$BodySubFeaturesPackage[0];
             ClientContent$BodySubFeaturesPackage._emptyArray = uBodySubFeat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BodySubFeaturesPackage._emptyArray;
    }
    public static ClientContent$BodySubFeaturesPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BodySubFeaturesPackage().mergeFrom(p0);
    }
    public static ClientContent$BodySubFeaturesPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BodySubFeaturesPackage(), p0);
    }
    public ClientContent$BodySubFeaturesPackage clear(){
       this.item = "";
       this.value = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.item).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.item);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(2, this.value);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$BodySubFeaturesPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 21) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.value = p0.readFloat();
             }
          }else {
             this.item = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.item).equals("")) {
          p0.writeString(1, this.item);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          p0.writeFloat(2, this.value);
       }
       super.writeTo(p0);
       return;
    }
}
