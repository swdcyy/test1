package com.kuaishou.client.log.content.packages.nano.ClientContent$BeautySubFeaturesPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$BeautySubFeaturesPackage extends MessageNano	// class@001221
{
    public boolean isAdjusted;
    public String name;
    public String params;
    public int subFeatures;
    public float value;
    public static ClientContent$BeautySubFeaturesPackage[] _emptyArray;

    public void ClientContent$BeautySubFeaturesPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BeautySubFeaturesPackage[] emptyArray(){
       if (ClientContent$BeautySubFeaturesPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BeautySubFeaturesPackage._emptyArray == null) {
             ClientContent$BeautySubFeaturesPackage[] uBeautySubFe = new ClientContent$BeautySubFeaturesPackage[0];
             ClientContent$BeautySubFeaturesPackage._emptyArray = uBeautySubFe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BeautySubFeaturesPackage._emptyArray;
    }
    public static ClientContent$BeautySubFeaturesPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BeautySubFeaturesPackage().mergeFrom(p0);
    }
    public static ClientContent$BeautySubFeaturesPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BeautySubFeaturesPackage(), p0);
    }
    public ClientContent$BeautySubFeaturesPackage clear(){
       this.subFeatures = 0;
       this.name = "";
       this.value = 0;
       this.isAdjusted = false;
       this.params = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BeautySubFeaturesPackage tsubFeatures = this.subFeatures;
       if (tsubFeatures != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsubFeatures);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(3, this.value);
       }
       tsubFeatures = this.isAdjusted;
       if (tsubFeatures != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tsubFeatures);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.params);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$BeautySubFeaturesPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 29) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.params = p0.readString();
                      }
                   }else {
                      this.isAdjusted = p0.readBool();
                   }
                }else {
                   this.value = p0.readFloat();
                }
             }else {
                this.name = p0.readString();
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
                 case 7:
                 case 8:
                 case 9:
                 case 10:
                 case 11:
                 case 12:
                 case 13:
                 case 14:
                 case 15:
                 case 16:
                 case 17:
                 case 18:
                 case 19:
                 case 20:
                 case 21:
                 case 22:
                 case 23:
                 case 24:
                 case 25:
                 case 26:
                 case 27:
                 case 28:
                 case 29:
                 case 30:
                 case 31:
                 case 32:
                 case '!':
                 case '"':
                 case '#':
                 case '$':
                 case '%':
                 case '&':
                 case 39:
                 case '(':
                 case ')':
                 case '*':
                 case '+':
                 case ',':
                 case '-':
                 case '.':
                 case '/':
                 case '0':
                 case '1':
                 case '2':
                 case '3':
                 case '4':
                 case '5':
                 case 1:
                   break;
                 default:
             }
             this.subFeatures = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BeautySubFeaturesPackage tsubFeatures = this.subFeatures;
       if (tsubFeatures != null) {
          p0.writeInt32(1, tsubFeatures);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          p0.writeFloat(3, this.value);
       }
       tsubFeatures = this.isAdjusted;
       if (tsubFeatures != null) {
          p0.writeBool(4, tsubFeatures);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(5, this.params);
       }
       super.writeTo(p0);
       return;
    }
}
